# Compile and Run Interpreter

~/Calculator indicated the directory of Calculater compiler
which owns compiled compiler through Haskell, Java, C and C++.

## In Haskell

Put Interpreter.hs, Interpret.hs and ex1.calc into ~/Calculator/haskell.
Interpreter.hs parses an arithmetic expression and returns a numeric value.
Interpret.hs reads string input and call Interpreter.interpret. 

```
ghc --make Interpret.hs
echo "1 + 2 * 3" | ./Interpret
./Interpret < ex1.calc
```