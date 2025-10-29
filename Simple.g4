grammar Simple;
// -------- Parser Members: global state for simple semantic checks --------
@header { import java.util.*; import java.io.*;}

@members {
  class Types {
    static String STRING = "string";
    static String INT = "int";
    static String DOUBLE = "double";
    static String UNKNOWN = "unknown";
  }

  /** Identifier type */
  class Identifier {
    String id;
    String value;  // The value of this identifier
    String type = Types.UNKNOWN;
    boolean hasKnown; // Is the value known or not
    boolean hasBeenUsed;  // Has the id been used yet
    String scope; // function/global scope
    int scopeLevel;
  }

  class FunctionIdentifier {
    String name;
    int arity;
    ArrayList<Identifier> Params;
    boolean doesReturn;
    ArrayList<String> code = new ArrayList<String>();

    void addLine(String line) {
      code.add(line);
    }
  }

  void addCodeLine(String line) {
    if(isScopeGlobal()) {
	      globalCodeLines.add(line);
    } else {
	      functionTable.get(getScope()).addLine(line);
    }
  }

  ArrayList<String> globalCodeLines = new ArrayList<String>();
  Map<String, FunctionIdentifier> functionTable = new HashMap();

  FunctionIdentifier getFunction(String name) {
    return functionTable.get(name);
  }


  FunctionIdentifier createFunction(String name, int arity, boolean doesReturn) {
    FunctionIdentifier fid = new FunctionIdentifier();
    fid.name = name;
    fid.arity = arity;
    fid.doesReturn = doesReturn;
    functionTable.put(name, fid);
    System.out.println("Created func: name: " + name + " | arity: " + arity + " | doesReturn: " + doesReturn);
    return fid;
  }

  boolean doesFunctionExist(String name) {
    return getFunction(name) != null;
  }



// matches the name of a variable to the identifier
  class SymbolTable extends HashMap<String, Identifier> {
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
		    ArrayList<SymbolTable> tables = scopedSymbolTable.get(getScope());
      if(tables.size() == 0) {
        return addScopeLevel();
      }
      return tables.size();
  }

  int addScopeLevel() {
	    ArrayList<SymbolTable> tables = scopedSymbolTable.get(getScope());
      tables.add(new SymbolTable());
      return tables.size();
  }

  void removeScopeLevel() {
    ArrayList<SymbolTable> tables = scopedSymbolTable.get(getScope());
    if(tables.size() > 0) {
      tables.remove(tables.size()-1);
    }
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

  

  boolean doesVariableExist(String varName) {
    return getVariable(varName) != null;
  }

  /** Variables that appear in any expression or print (i.e., used). */
  Set<String> used = new HashSet<>();

  /** Collected diagnostics we’ll print at the end. */
  List<String> diagnostics = new ArrayList<>();

  /** Helper to record an error with source coordinates. */
  void error(Token t, String msg) {
    diagnostics.add("line " + t.getLine() + ":" + t.getCharPositionInLine() + " " + msg);
  }

  int printDiagnostics() {
      int numErrors = 0;
      // After parsing the whole file: report unused variables and print errors.
      for (String d : diagnostics) {
        System.err.println("error: " + d);
        numErrors++;
      }
      System.out.println();
      return numErrors;
  }
  //Code generation
  StringBuilder sb = new StringBuilder(); 
  
  
  void emit(String s) {sb.append(s);}   
  //File generation
  void openProgram() {
    emit("import java.util.*;\n");
    emit("public class SimpleProgram {\n");
    emit("  public static void main(String[] args) throws Exception {\n");
    emit("    Scanner in = new Scanner(System.in);\n");
  }

  void writeFile() {
    try (PrintWriter pw = new PrintWriter("SimpleProgram.java", "UTF-8")) {
      for(String line : globalCodeLines) {
          sb.append(line);
      } 
      pw.print(sb.toString());
      pw.print("}\n}\n");
    } catch (Exception e) {
      System.err.println("error: failed to write SimpleProgram.java: " + e.getMessage());
    }

  }
}
prog
: {openProgram();}
 (statement | functionDefinition)* {
	    // TODO add import java.util.Scanner; and  to top of file
	     int numErrors = printDiagnostics();
       if(numErrors == 0) {
        writeFile();
       } else {
        
        System.exit(1);
       }
	  };

assignment
	locals[String value, String typeOf, boolean isError]:
	name = VARIABLE_NAME '=' (
		e = expr {
      System.out.println("expression");
      // can check if contains a decimal but doesnt check types of variables
      $typeOf = $e.typeOf;
      // $value = String.valueOf($e.value);
      $value=$e.exprString;
    }
		| t = DECIMAL {
      $typeOf = Types.DOUBLE;
	    $value = $t.getText();
    }
		| t = INT {
      $typeOf = Types.INT;
	    $value = $t.getText();
    }
		| t = STRING {
      $typeOf = Types.STRING;
	    $value = $t.getText();
    }
		| f = functionCall {
      if(!$f.isSuccess) {
        $isError = true;
      } else if(!$f.doesReturn){
        $isError = true;
        error($name, "Error: attempting to assigning the return of a function when function does not return");
      }
      else {
        $typeOf = Types.UNKNOWN;
        $value = "<FUNCTION CALL>";
      }
    }
		| v = VARIABLE_NAME {
	      Identifier var = getVariable($v.getText());
      if(var == null) {
          error($v, "Error variable " + $v.getText() + " does not exist");
          $isError = true;
      } else if (var.scope != "global" && var.scope != getScope()) {
          error($v, "Error attempting to assign a variable that is not defined (there is a variable defined that is out of scope)");
          $isError = true;
      } else {
	        $value = var.value;    
        $typeOf = var.type;
      }
    }
	) {
    if(!$isError) {
      // Get if var already exists
      Identifier newID = getVariable($name.getText());
	      // mismatch type to an existing variable, dont error on unknown
      boolean doAssign = true;
      if(newID != null) {
        if(!$typeOf.equals(Types.UNKNOWN) && !newID.type.equals(Types.UNKNOWN)){
            if(!(newID.type.equals(Types.DOUBLE) && $typeOf.equals(Types.INT))) // a double can be assigned an int
            {
            if(!$typeOf.equals(newID.type)){
              error($name, "invalid assignment, type does not match | current: " + newID.type + " new: " + $typeOf);
              doAssign = false;
            }
          } 
        }
      }
      if(doAssign){
          if(newID == null) { // if not already exists create new var
                newID = createVariable($name.getText(), $value, $typeOf);
                String assignmentString = "";
                if($typeOf.equals(Types.DOUBLE)) {
                    assignmentString = "double ";
	                } else if($typeOf.equals(Types.INT)) {
                    assignmentString = "int ";
                  } else if($typeOf.equals(Types.STRING)) {
                    assignmentString = "String ";
                  } // TODO add arrays and function calls, ideally remove unknown
                  assignmentString += newID.id + "=" + $value + ";";
                  addCodeLine(assignmentString);

          } else { // if already exists then reassign
              newID.value = $value;
              // newID.type = $typeOf; –– cannot change type after the fact
              addCodeLine(newID.id + "=" + $value + ";");

          }
      System.out.println("Assigning | name: " + newID.id + " | value: " + newID.value + " | scope: " + newID.scope + " | Level: " + newID.scopeLevel + " | type: " + newID.type);
    }
  }
};

array:
	('[' (INT ',')*? INT ']')
	| ( '[' DECIMAL ','*? DECIMAL ']')
	| ( '[' STRING ','*? STRING ']');

statement:
	for_statement
	| while_statement
	| input
	| expr
	| if_else
	| assignment
	| condition
	| functionCall
	| array
	| output;

expr
	returns[boolean hasKnownValue, float value, String exprString, String typeOf]:
	a = word {
      $exprString = $a.exprString;
      $typeOf = $a.isDouble ? Types.DOUBLE : Types.INT;
      if ($a.hasKnownValue) {
        $hasKnownValue = true;
        $value = $a.value;
      } else {
        $hasKnownValue = false;
      } 
    } (
		op = ('plus' | 'minus') b = word {
      if($b.isDouble) {
        $typeOf = Types.DOUBLE;
      }
      if ($hasKnownValue && $b.hasKnownValue) {
        if ($op.getText().equals("plus")) {
		      $exprString += " + " + $b.exprString;
          System.out.println($exprString);
          $value = $value + $b.value;
        } else {
	        $exprString += " - " + $b.value;
          $value = $value - $b.value;
        }
      } else {
        $hasKnownValue = false;
      }
    }
	)*;

word
	returns[boolean hasKnownValue, float value, String exprString, boolean isDouble]:
	a = factor {
      $exprString = $a.factorString;
      $isDouble = $a.isDouble;
      if ($a.hasKnownValue) {
        $hasKnownValue = true;
        $value = $a.value;
      } else $hasKnownValue = false;
    } (
		op = ('multiply' | 'divide' | 'mod') b = factor {
        if($op.getText().equals("divide")) {
              $exprString += " / " + $b.factorString;
	        } else if($op.getText().equals("multiply")) {
              $exprString += " * " + $b.factorString;
	        } else if($op.getText().equals("mod")) {
              $exprString +=" % " + $b.factorString;
        } 
        if($b.isDouble) {          
	          $isDouble = true;
        }


        if ($b.hasKnownValue && $op.getText().equals("divide") && $b.value == 0) {
          $hasKnownValue = false;
        } else if ($hasKnownValue && $b.hasKnownValue) {
          if ($op.getText().equals("multiply")) {
            $value = $value * $b.value;
          } else if ($op.getText().equals("divide")){
            $value = $value / $b.value;
          }
        } else {
          $hasKnownValue = false;
        }
      }
	)*;

factor
	returns[boolean hasKnownValue, float value, String factorString, boolean isDouble]:
	INT {
      $hasKnownValue = true; 
      $value = Integer.parseInt($INT.getText()); 
		  $factorString = ""+$INT.getText();
    }
	| DECIMAL {
	  $isDouble = true;
    $hasKnownValue = true; 
    $value = Float.parseFloat($DECIMAL.getText());
		    $factorString = ""+$DECIMAL.getText();
    }
	| VARIABLE_NAME {
        String id = $VARIABLE_NAME.getText();
	      $factorString=id;
        used.add(id);
        // If we're in the middle of first assignment to VARIABLE_NAME (self-reference):
        if (!doesVariableExist(id)) {
          // General use-before-assign.
          error($VARIABLE_NAME, "use of variable '" + id + "' before assignment");
        } else {
          String t = getVariable(id).type;
          if(t.equals(Types.DOUBLE)) {
            $isDouble = true;
	          } else if(!t.equals(Types.INT)) {
	            error($VARIABLE_NAME, id + " is not an int or double");
          }
        }
        $hasKnownValue = false;
      }
	| '(' expr ')' { 
		    $factorString = '('+ $expr.exprString +')';
        $isDouble = $expr.typeOf.equals(Types.DOUBLE);
        if ($expr.hasKnownValue) {
          $hasKnownValue = true;
          $value = $expr.value;
        } else {
          $hasKnownValue = false;
        }
      };

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

if_scope: '{' {addScopeLevel();} prog '}' {removeScopeLevel();};

if_else:
	if_statement if_scope (else_statement if_statement if_scope)* (
		else_statement if_scope
	)?;

for_statement: 'repeat' (INT) loopScope;
while_statement: 'while' condition loopScope;
loopScope:
	'{' {
	  addScopeLevel();
} (statement | 'continue' | 'break')* '}' {removeScopeLevel();};

functionDefinition
	returns[String name, int arity, boolean doesReturn]
	locals[ArrayList<String> variableParamNames]:
	'define' n = VARIABLE_NAME {
    $name = $n.getText();
	    $variableParamNames = new ArrayList<String>();
  } '(' (
		VARIABLE_NAME {
		      $variableParamNames.add($VARIABLE_NAME.getText());
    } (
			',' VARIABLE_NAME {
	        $variableParamNames.add($VARIABLE_NAME.getText());
      }
		)*
	)? ')' '{' { 
    if(doesFunctionExist($name)) {
      error($n, "Error: function " + $name + "already Exists");
    } else {
	  setMainScope($name);
			    for(String varName : $variableParamNames) {
	        createVariable(varName, "<FUNCTION_PARAM>", Types.UNKNOWN);
	        System.out.println("Adding " + varName + " to " + $name + " scope");
      }
    }
} (
		statement
		| ('define') {
      error($n, "Error can't define function in a function");
    }
		| ('return' varExprOrType | expr) {
      $doesReturn = true;
      }
	)* '}' {
	    $arity = $variableParamNames.size();
    createFunction($name, $arity, $doesReturn);
  exitMainScope();
};

functionCall
	returns[String name, boolean doesReturn, boolean isSuccess]
	locals[int arity]:
	n = VARIABLE_NAME '(' (
		varExprOrType {
    $arity +=1;
  } (
			',' varExprOrType {
	   $arity +=1;
  }
		)*
	)? ')' {
    $name = $n.getText();
    if(!doesFunctionExist($name)) {
      error($n, "Error: attempting to call a function that does not exist");
    } else {
      FunctionIdentifier fid = getFunction($name);
      if(fid.arity != $arity) {
        error($n, "attempting to call a function with incorrect number of arguments");
      } else {
        $doesReturn = fid.doesReturn;
        $isSuccess = true;
      }
    }
  };

input: input_decimal | input_string | input_number;

// TODO need to import java.util.Scanner; in all files we compile Scanner in = new Scanner(System.in);

input_string:
	'input string ' a = VARIABLE_NAME {
    addCodeLine($a.getText()+"=in.nextLine();");
};
input_number:
	'input number ' a = VARIABLE_NAME {
    addCodeLine($a.getText()+"=in.nextInt();");
};
input_decimal:
	'input decimal ' a = VARIABLE_NAME {
    addCodeLine($a.getText()+"=in.nextFloat();");

};

printType
	returns[Boolean hasKnownValue, String value, String code]:
	INT {
    $hasKnownValue = true; $value = $INT.getText(); 
	  $code = "System.out.println(" + $value + ");";
  }
	| DECIMAL {$hasKnownValue = true; $value = $DECIMAL.getText();
		  $code = "System.out.println(" + $value + ");";
  }
	| STRING {$hasKnownValue = true; $value = $STRING.getText();
		  $code = "System.out.println("+$value+");";
    }
	| VARIABLE_NAME {
        String id = $VARIABLE_NAME.getText();
        used.add(id);
        // If we're in the middle of first assignment to VARIABLE_NAME (self-reference):
        if (!doesVariableExist(id)) {
          // General use-before-assign.
          error($VARIABLE_NAME, "use of variable '" + id + "' before assignment");
        } else{
		          $code = "System.out.println(" + id + ");";
        }
        $hasKnownValue = false;
      }
	| expr {$hasKnownValue = true; $value = String.valueOf($expr.value); $code = "System.out.println("+String.valueOf($expr.value)+");";
		};

//output: 'print' varExprOrType;
output:
	'print' printType {
  if ($printType.hasKnownValue) {
        // Let us print it out (for debugging purposes really)
        System.out.println("DEBUG: Line " +  ": Printing known value: " + $printType.value);
      } else {
        System.out.println("DEBUG: Line " +  ": Can't print this value. Need to evaluate further.");
      }

		  addCodeLine($printType.code);
  };

varExprOrType: expr | VARIABLE_NAME type;
type: INT | STRING | DECIMAL | BOOL;

STRING: '"' ( ~["])* '"';
INT: '-'? [0-9]+;
BOOL: 'True' | 'False';
DECIMAL: '-'? [0-9]* '.' [0-9]*;
VARIABLE_NAME: ([a-z] | [A-Z] | '_')+;
COMMENT_LINE: '*' ~[\n\r]* -> skip;
// skip comments
WHITESPACE: [ \r\n\t]+ -> skip;
// skip extra white space ~[\n\r]* -> skip;