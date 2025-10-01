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
    float value;  // The value of this identifier
    String type;
    boolean hasKnown; // Is the value known or not
    boolean hasBeenUsed;  // Has the id been used yet
    String scope; // function/global scope
  }

  /** Symbol table */
  class SymbolTable {
    Map<String, Identifier> table = new HashMap<>();
  }
  
		  Stack<String> scopeList = new Stack<String>();

  String pendingFunctionID = "";
  String pendingVarType = "";

  String getScope() {
    return scopeList.peek();
  }

  void exitScope() {
    if(scopeList.size() <= 0) return;

    scopeList.pop();
  }

  void addScope(String id) {
    scopeList.push(id);
  }

  SymbolTable mainTable = new SymbolTable();

  /** Variables that have been assigned at least once. */
  Set<String> assigned = new HashSet<>();

  /** Variables that appear in any expression or print (i.e., used). */
  Set<String> used = new HashSet<>();

  /** Collected diagnostics we’ll print at the end. */
  List<String> diagnostics = new ArrayList<>();

  /** If we’re currently parsing an assignment, the LHS name lives here. */
  String pendingLHS = null;

  /** Was the LHS already assigned before this assignment? */
  boolean lhsExistedBefore = false;

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

      System.out.println();
  }
}
prog:
	{
		  addScope("global");
    } statement* {
	     printDiagnostics();
  };
assignment:
	a = VARIABLE_NAME '=' (
		INT {
      pendingVarType = Types.INT;
  }
		| STRING {
	      pendingVarType = Types.STRING;
  }
		| DECIMAL {
	      pendingVarType = Types.DOUBLE;
  }
		| b = VARIABLE_NAME {
      Identifier var = mainTable.table.get($b.getText());
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
  
      Identifier newID = new Identifier();
      newID.id = $a.getText();
      // newID.value = null; // TODO implement value
      newID.type = pendingVarType;
      pendingVarType = "";
      newID.hasKnown = true; // TODO is a variable always known?
      newID.hasBeenUsed = false;
      newID.scope = getScope();
      System.out.println("Assigning | name: " + newID.id + " value: " + newID.value + " scope: " + newID.scope + " type: " + newID.type);
	    mainTable.table.put(newID.id, newID);
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
	| functionDefinition
	| functionCall
	| array
	| output;

expr:
	expr ('multiply' | 'divide' | 'mod') expr
	| expr ('plus' | 'minus') expr
	| INT
	| DECIMAL
	| VARIABLE_NAME
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
	  addScope(pendingFunctionID);
    pendingFunctionID = "";
} (statement* | ('return' varExprOrType)*) '}' {
  exitScope();
};

functionDefinition:
	'define' VARIABLE_NAME {
    if(getScope() != "global") {
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

output: 'print' varExprOrType;

varExprOrType: expr | VARIABLE_NAME type;
type: INT | STRING | DECIMAL;

STRING: '"' ( ~["])* '"';
INT: '-'? [0-9]+;
DECIMAL: '-'? [0-9]* '.' [0-9]*;
VARIABLE_NAME: ([a-z] | [A-Z])+;
COMMENT_LINE: '*' ~[\n\r]* -> skip;
// skip comments
WHITESPACE: [ \r\n\t]+ -> skip;
// skip extra white space
