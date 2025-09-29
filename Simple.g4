grammar Simple;

prog: statement*;
assignment: VARIABLE '=' varExprOrType;

array: ( '[' (type ',')*? type ']');

statement:
	for_statement
	| while_statement
	| expr
	| if_block
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
	| VARIABLE
	| '(' expr ')';

conditional_statements: (
		'not'? (
			'equal to'
			| 'greater than'
			| 'less than'
			| 'less than or equal to'
			| 'greater than or equal to'
		)
	);
condition: varExprOrType conditional_statements varExprOrType;

if_statement: 'is' condition;
else_statement: 'if not';

if_block:
	if_statement '{' statement '}' (
		else_statement if_statement '{' statement '}'
	)* (else_statement '{' prog '}')?;

for_statement: 'repeat' (INT) loopScope;
while_statement: 'while' condition loopScope;
loopScope: '{' (statement | 'continue' | 'break')* '}';
functionScope: '{' statement* | ('return' varExprOrType)* '}';

functionDefinition:
	'define' VARIABLE '(' (varExprOrType ( ',' varExprOrType)*)? ')' functionScope;

functionCall:
	VARIABLE '(' (varExprOrType (',' varExprOrType)*)? ')';

input: input_decimal | input_string | input_number;

input_string: 'input string';
input_number: 'input number';
input_decimal: 'input decimal';

output: 'print' varExprOrType;

varExprOrType: expr | VARIABLE type;
type: INT | STRING | DECIMAL;

STRING: '"' ( ~["])* '"';
INT: '-'? [0-9]+;
DECIMAL: '-'? [0-9]* '.' [0-9]*;
VARIABLE: ([a-z] | [A-Z])+;
COMMENT_LINE: '*' ~[\n\r]* -> skip;
// skip comments
WHITESPACE: [ \r\n\t]+ -> skip;
// skip extra white space