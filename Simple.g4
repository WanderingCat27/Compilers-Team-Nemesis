grammar Simple;

prog: (expr NEWLINE)*
	| (if_block NEWLINE)*
	| (assignment NEWLINE)*
	| NEWLINE*;
assignment: WORD '=' expr | WORD '=' STRING | WORD '=' INT;

expr:
	expr ('multiply' | 'divide' | 'mod') expr
	| expr ('add' | 'minus') expr
	| INT
	| '(' expr ')';

conditionals: ('equal to' | 'greater than' | 'less');

if_statement: 'is' (INT | expr | WORD) conditionals (INT | expr | WORD);
else_statement: 'if not';

if_block: if_statement '{' prog '}' (else_statement if_statement '{' prog '}')* (else_statement '{' prog '}')? ;


NEWLINE: WHITESPACE* [\r\n]+;
INT: [0-9]+;
WHITESPACE: [ \t]+ -> skip;
WORD: ([a-z] | [A-Z]);
STRING: '"' ([a-z] | [A-Z] | [0-9])* '"';