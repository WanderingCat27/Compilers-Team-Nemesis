grammar Simple;

prog: statement+ EOF;
assignment: WORD '=' expr | WORD '=' STRING | WORD '=' INT;

statement:
	for_statement
	| expr
	| if_block
	| assignment
	| condition;

expr:
	expr ('multiply' | 'divide' | 'mod') expr
	| expr ('add' | 'minus') expr
	| INT
	| '(' expr ')';

conditional_statements: (
		'equal to'
		| 'greater than'
		| 'less than'
		| 'less than or equal to'
		| 'greater than or equal to'
	);
condition: (INT | expr | WORD) conditional_statements (
		INT
		| expr
		| WORD
	);

if_statement: 'is' condition;
else_statement: 'if not';

if_block:
	if_statement '{' statement '}' (
		else_statement if_statement '{' statement '}'
	)* (else_statement '{' prog '}')?;

for_statement: 'repeat' (INT) statementBlock;
statementBlock: '{' (statement | 'continue' | 'break')* '}';

input_string: 'input' STRING;
input_number: 'input number' STRING;
input_decimal: 'input decimal' DECIMAL;

output: 'print' (STRING | DECIMAL | INT);

INT: [0-9]+;
DECIMAL: [0-9]+ '.' [0-9]+;
WORD: ([a-z] | [A-Z])+;
COMMENT_LINE: '*' ~[\n\r]* -> skip; // skip comments
STRING: '"' ([a-z] | [A-Z] | [0-9] | [\r\n\t])* '"';
WHITESPACE: [ \r\n\t]+ -> skip; // skip extra white space