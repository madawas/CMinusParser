------Programming Assignment for Compiler Design -- 110553G ---- Madawa Soysa ---------

Running the parser
==================

1. Locate CMinusParser.jar

2. Run the jar using following command
	java -jar CMinusParser.jar <PATH_TO_SOURCE>
	
	e.g.  java -jar CMinusParser.jar /home/{$user}/test.cmin
	
3. Other options
	provide --gen-ast as the second argument to display the AST
	
	java -jar CMinusParser.jar <PATH_TO_SOURCE> --gen-ast
