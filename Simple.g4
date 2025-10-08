grammar Simple;
// -------- Parser Members: global state for simple semantic checks --------
@header { import java.util.*; }

@members {
  class Types {
    static String STRING = "string";
    static String INT = "int";
    static String DOUBLE = "double";
  }

  /** Identifier type */
  class Identifier {
    String id;
    String value;  // The value of this identifier
    String type;
    boolean hasKnown; // Is the value known or not
    boolean hasBeenUsed;  // Has the id been used yet
    String scope; // function/global scope
    int scopeLevel;
  }

  String pendingFunctionID = "";
  String pendingVarType = "";


// matches the name of a variable to the identifier
  class SymbolTable extends HashMap<String, Identifier> {
    public int level = 0;
    void addLevel() {
      level +=1;
    }
    void removeLevel() {
      level -=1;
    }

    int getLevel() {
      return level;
    }
  }



// tracks variables by scope level, key is global/function name, arraylist is level of scope for loops/ifs
  class ScopedSymbolTable extends HashMap<String, ArrayList<SymbolTable>> {
	    ScopedSymbolTable() {
        put("Global", new ArrayList<SymbolTable>());
      }
  }



	ScopedSymbolTable scopedSymbolTable = new ScopedSymbolTable();
  int scopeLevel = 0;
  String currScope = "Global";
  
  void setMainScope(String functionName) {
    currScope = functionName;
    scopedSymbolTable.put(functionName, new ArrayList<SymbolTable>());
  }

  void exitMainScope() {
    currScope = "Global";
  }

  boolean isScopeGlobal() {
    return currScope.equals("Global");
  }

  String getScope() {
    return currScope;
  }

  int getScopeLevel() {
		  return scopedSymbolTable.get(currScope).size();
  }
	
  SymbolTable getCurrSymbolTableAtCurrLevel() {
	    ArrayList<SymbolTable> tables = scopedSymbolTable.get(getScope());
      if(tables.size() == 0) {
        tables.add(new SymbolTable());
      }
      return tables.get(tables.size() - 1);
  }

  Identifier createVariable(String name, String value, String type) {
    // if variable already exists in global or curr scope then cannot assign; return null
    if(getVariable(name) != null) {
      return null;
    }
    Identifier id = new Identifier();
    id.id = name;
    id.value = value;
    id.type = type;
    id.scope = currScope;
    id.scopeLevel = getScopeLevel();
	  getCurrSymbolTableAtCurrLevel().put(name, id);

    return id;
  }


  Identifier getVariable(String name) {
    String[] scopes;
    if (isScopeGlobal()) {
      scopes = new String[] {"Global"};
    } else {
      scopes = new String[] {"Global", getScope()};
    }

	    for (String key : scopes) {
	        ArrayList<SymbolTable> tables = scopedSymbolTable.get(key);
          for(SymbolTable table : tables) {
            for(String varName : table.keySet()) {
                if(varName.equals(name)) {
                  return table.get(varName);
                }
            }
          }
	          
      }
      return null;
  }



  /** Variables that have been assigned at least once. */
  Set<String> assigned = new HashSet<>();

  /** Variables that appear in any expression or print (i.e., used). */
  Set<String> used = new HashSet<>();

  /** Collected diagnostics we’ll print at the end. */
  List<String> diagnostics = new ArrayList<>();

  /** Helper to record an error with source coordinates. */
  void error(Token t, String msg) {
    diagnostics.add("line " + t.getLine() + ":" + t.getCharPositionInLine() + " " + msg);
  }

  void printDiagnostics() {
      // After parsing the whole file: report unused variables and print errors.
      for (String v : assigned) {
        if (!used.contains(v)) {
          System.err.println("warning: variable '" + v + "' assigned but never used");
        }
      }
      for (String d : diagnostics) {
        System.err.println("error: " + d);
      }
      getVariable("");
      System.out.println();
  }
}
prog:
	(statement | functionDefinition)* {
	     printDiagnostics();
  };
assignment:
	a = VARIABLE_NAME '=' (
		b = INT {
      pendingVarType = Types.INT;
  }
		| b = STRING {
	      pendingVarType = Types.STRING;
  }
		| b = DECIMAL {
	      pendingVarType = Types.DOUBLE;
  }
		| b = VARIABLE_NAME {
      Identifier var = getVariable($b.getText());
      if(var == null) {
          error($b, "Error attempting to assign a variable that is not defined");
          pendingVarType = "not defined";
	      } else if (var.scope != "global" && var.scope != getScope()){
		        error($b, "Error attempting to assign a variable that is not defined (there is a variable defined that is out of scope)");
          pendingVarType = "not defined";
        } else {
        pendingVarType = var.type;
      }
  }
	) {
    if(pendingVarType.equals("not defined")) {
      // skip
      pendingVarType = "";
    } else 
    if(pendingVarType.equals("")) {
      error($b, "invalid assignment, type not found");
    } else {
		  Identifier newID = getVariable($a.getText());
      String value = $b.getText();
      String type = pendingVarType;
      pendingVarType = "";

      if(newID == null) {
	        newID = createVariable($a.getText(), value, type);
      } else {
        newID.value = value;
        newID.type = type;
      }

      newID.hasKnown = true; // TODO is a variable always known?
      System.out.println("Assigning | name: " + newID.id + " | value: " + newID.value + " | scope: " + newID.scope + " | type: " + newID.type);
    }
  };
array: ( '[' (type ',')*? type ']');

statement:
	for_statement
	| while_statement
	| expr
	| if_else
	| assignment
	| condition
	| functionCall
	| array
	| output;

expr
	returns[boolean hasKnownValue, float value]:
	a = expr { 
    if ($a.hasKnownValue) {
        $hasKnownValue = true;
        $value = $a.value;
      } else {
        $hasKnownValue = false;
      }
  } expr (
		op = ('multiply' | 'divide' | 'mod') b = expr {
			if ($b.hasKnownValue && $op.getText().equals("divide") && $b.value == 0) {
          error($op, "division by zero");
          $hasKnownValue = false;  // Error anyway so stopping there
        } else if ($hasKnownValue && $b.hasKnownValue) {
          if ($op.getText().equals("multiply")) {
            $value = $value * $b.value;
          } else {
            $value = $value / $b.value;
          }
        } else {
          $hasKnownValue = false;
        }
		}
	) expr
	| expr (
		op = ('plus' | 'minus') b = expr {
      if ($hasKnownValue && $b.hasKnownValue) {
        if ($op.getText().equals("plus")) {
          $value = $value + $b.value;
        } else {
          $value = $value - $b.value;
        }
      } else {
        $hasKnownValue = false;
      }	
    }
	) expr
	| INT { $hasKnownValue = true; $value = Integer.parseInt($INT.getText()); }
	| DECIMAL { $hasKnownValue = true; $value = Integer.parseInt($DECIMAL.getText()); }
	| VARIABLE_NAME {
        String id = $VARIABLE_NAME.getText();
        used.add(id);
        // If we're in the middle of first assignment to VARIABLE_NAME (self-reference):
        if (!assigned.contains(id)) {
          // General use-before-assign.
          error($VARIABLE_NAME, "use of variable '" + id + "' before assignment");
        }
        $hasKnownValue = false;
  }
	| '(' expr ')';

conditional_statement: (
		'not'? (
			'equal to'
			| 'greater than'
			| 'less than'
			| 'less than or equal to'
			| 'greater than or equal to'
		)
	);
condition: varExprOrType conditional_statement varExprOrType;

if_statement: 'is' condition;
else_statement: 'if not';

if_else:
	if_statement '{' statement '}' (
		else_statement if_statement '{' statement '}'
	)* (else_statement '{' prog '}')?;

for_statement: 'repeat' (INT) loopScope;
while_statement: 'while' condition loopScope;
loopScope: '{' (statement | 'continue' | 'break')* '}';
functionScope:
	'{' { 
	  setMainScope(pendingFunctionID);
    pendingFunctionID = "";
} (statement* | ('return' varExprOrType)*) '}' {
  exitMainScope();
};

functionDefinition:
	'define' VARIABLE_NAME {
    if(!isScopeGlobal()) {
      error($VARIABLE_NAME, "Functions must be defined in global scope, function cannot be defined within functions");
    } else {
	    if(pendingFunctionID != "") {
        System.err.println("function name already pending"); // TODO ? is this necessary
      }
	    pendingFunctionID = $VARIABLE_NAME.getText();
    }
   } '(' (varExprOrType ( ',' varExprOrType)*)? ')' functionScope;

functionCall:
	VARIABLE_NAME '(' (varExprOrType (',' varExprOrType)*)? ')';

input: input_decimal | input_string | input_number;

input_string: 'input string';
input_number: 'input number';
input_decimal: 'input decimal';

//output: 'print' varExprOrType;
output:
	'print' expr {
  if ($expr.hasKnownValue) {
        // Let us print it out (for debugging purposes really)
        System.out.println("DEBUG: Line " +  ": Printing known value: " + $expr.value);
      } else {
        System.out.println("DEBUG: Line " +  ": Can't print this value. Need to evaluate further.");
      }
  };

KW_PRINT: 'print';

varExprOrType: expr | VARIABLE_NAME type;
type: INT | STRING | DECIMAL | BOOL;

STRING: '"' ( ~["])* '"';
INT: '-'? [0-9]+;
BOOL: 'True' | 'False';
DECIMAL: '-'? [0-9]* '.' [0-9]*;
VARIABLE_NAME: ([a-z] | [A-Z])+;
COMMENT_LINE: '*' ~[\n\r]* -> skip;
// skip comments
WHITESPACE: [ \r\n\t]+ -> skip;
// skip extra white space ~[\n\r]* -> skip;