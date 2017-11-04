# Compile and Run Interpreter

~/Calculator indicated the directory of Calculater compiler
which owns compiled compiler through Haskell, Java, C and C++.

## In Haskell

- Put Interpreter.hs, Interpret.hs and ex1.calc into ~/Calculator/haskell.
- Interpreter.hs parses an arithmetic expression and returns a numeric value.
- Interpret.hs reads string input and call Interpreter.interpret. 

```
~/Calculator/haskell$ ghc --make Interpret.hs
~/Calculator/haskell$ echo "1 + 2 * 3" | ./Interpret
~/Calculator/haskell$ ./Interpret < ex1.calc
```

## In Java

- Put Interpreter.java and Interpret.java into ~/Calculator/java/Calc.
- Put ex1.calc into ~/Calculator/java.

```
~/Calculator/java$ javac Calc/Interpret.java
~/Calculator/java$ echo "1 + 2 * 3" | java Calc.Interpret
~/Calculator/java$ java Calc.Interpret < ex1.calc
```

## In C

- Put Interpreter.c, Interpret.c and Interpreter.h into ~/Calculator/c.
- Remove Test.c, Test.h and Test.o (if it exists) from ~/Calculator/c.
- Copy ex1.calc into ~/Calculator/c.

```
~/Calculator/c$ gcc -c Interpreter.c Interpret.c
~/Calculator/c$ gcc *.o -o interpret
~/Calculator/c$ echo "1 + 2 * 3" | ./interpret
~/Calculator/c$ ./interpret < ex1.calc
```
