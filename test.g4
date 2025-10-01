grammar test;

@header {
import java.util.HashMap;
import java.util.Map;
}

@members {
Map<String, Integer> memory = new HashMap<>();
}

prog: stat+;

stat:
	ID '=' INT ';' {
        memory.put($ID.text, Integer.parseInt($INT.text));
        System.out.println($ID.text + " is " + $INT.text);
    };

ID: [a-zA-Z_][a-zA-Z_0-9]*;
INT: [0-9]+;
WS: [ \t\r\n]+ -> skip;
