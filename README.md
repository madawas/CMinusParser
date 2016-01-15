###CMinus (C-) Parser V-1.00 using antlr4

####Setting up the project
1. Create a Java project and add the source files.

2. Add the `antlr-4.x-complete.jar` to the classpath.

####Running the parser

1. Locate CMinusParser.jar

2. Run the jar using following command
```shell
java -jar CMinusParser.jar <PATH_TO_SOURCE>
```
e.g.  
```shell
java -jar CMinusParser.jar /home/{$user}/test.cmin
```

3. Other options
provide --gen-ast as the second argument to display the AST
```shell	
java -jar CMinusParser.jar <PATH_TO_SOURCE> --gen-ast
```
