grammar Simple;

prog: statement+ EOF;
assignment: WORD '=' expr | WORD '=' STRING | WORD '=' INT;

statement:
		 for_statement
		| expr
		| if_block
		| assignment
		| conditionals
		;

expr:
	expr ('multiply' | 'divide' | 'mod') expr
	| expr ('add' | 'minus') expr
	| INT
	| '(' expr ')';

conditionals: ('equal to' | 'greater than' | 'less');

if_statement: 'is' (INT | expr | WORD) conditionals (INT | expr | WORD);
else_statement: 'if not';

if_block: if_statement '{' statement '}' (else_statement if_statement '{' statement '}')* (else_statement '{' prog '}')? ;

for_statement : 'repeat'  (INT) statementBlock;
statementBlock : '{' statement* '}';

//NEWLINE: WHITESPACE* [\r\n]+;
INT: [0-9]+;
WHITESPACE: [ \r\n\t]+ -> skip;
WORD: ([a-z] | [A-Z]);
COMMENT_LINE : '*'~[\n\r]* -> skip; // skip comments
STRING: '"' ([a-z] | [A-Z] | [0-9])* '"';