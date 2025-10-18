# Compilers-Team-Nemesis

1. First compile compiler with antlr4 Simple.g4
2. Run programs using terminal (antlr4-parse Simple.g4 prog -tree Programs/Good1.simple for example.)
3. Tips for understanding programs
  '*' for comments
  mathematical operations are written out ('plus' = +)
  for loops = repeat followed by int
  while loops = while followed by condition
  to print use 'print' (string, decimal, int, word)
  if statements = 'is' statements followed by {}
  else if statements = 'if not' statements followed by {}
  functions = definition followed by (conditions)
  calling is the same as in java
  arrays = [decimal, int, or strings]
  print = print(string, decimal, int, word)

# INSTRUCTIONS FOR MILESTONE 3#
1. the 3 good/bad semantic problems are in the 'Milestone3Programs' Folder. The onces that have an 'error' in them are the bad ones, and the ones with 'good' in them are the good ones.
2. Run them. (Ex: antlr4-grun Simple prog -tree .\Milestone3Programs\FunctionInFunctionError.simple)
3. Read terminal to see scoping/error detection.
