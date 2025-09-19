grammar Simple;

prog: statement*;
assignment: WORD '=' expr | WORD '=' STRING | WORD '=' INT | WORD '=' input | WORD '=' WORD;

array: ('[' (STRING ','| INT ',' | DECIMAL ',')*? STRING | INT | DECIMAL ']');

statement:
	for_statement
	| while_statement
	| expr
	| if_block
	| assignment
	| condition
	| array
	| output;

expr:
	expr ('multiply' | 'divide' | 'mod') expr
	| expr ('add' | 'minus') expr
	| INT
	| WORD
	| '(' expr ')';

conditional_statements: (
		'not'? ('equal to'
		| 'greater than'
		| 'less than'
		| 'less than or equal to'
		| 'greater than or equal to')
	);
condition: (WORD | INT | expr) conditional_statements (
		WORD | INT
		| expr
	);

if_statement: 'is' condition;
else_statement: 'if not';

if_block:
	if_statement '{' statement '}' (
		else_statement if_statement '{' statement '}'
	)* (else_statement '{' prog '}')?;

for_statement: 'repeat' (INT) statementBlock;
while_statement: 'while' condition statementBlock;
statementBlock: '{' (statement | 'continue' | 'break')* '}';

input: input_decimal | input_string | input_number;

input_string: 'input string';
input_number: 'input number';
input_decimal: 'input decimal';

output: 'print' (STRING | DECIMAL | INT | WORD);

STRING: '"' [^"]* '"';
INT: '-'?[0-9]+;
DECIMAL: '-'?[0-9]* '.' [0-9]*;
WORD: ([a-z] | [A-Z])+;
COMMENT_LINE: '*' ~[\n\r]* -> skip; // skip comments
WHITESPACE: [ \r\n\t]+ -> skip; // skip extra white space