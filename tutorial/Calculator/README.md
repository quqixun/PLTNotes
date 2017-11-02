# A Simple Compiler - Calculator

## BNFC Code

```
-- My first compiler: calculator

EAdd. Exp  ::= Exp  "+" Exp1 ;
ESub. Exp  ::= Exp  "-" Exp1 ;
EMul. Exp1 ::= Exp1 "*" Exp2 ;
EDiv. Exp1 ::= Exp1 "/" Exp2 ;
EInt. Exp2 ::= Integer ;

coercions Exp 2 ;
```

## Compiled by Java

```
cd ~/Calculator
bnfc -m -o ./java -java Calc.cf
cd java
make
```

Test in Java

```
echo "1 + 2 * 3" | java Calc.Test
```

## Compile by Haskell

```
cd ~/Calculator
bnfc -m -o ./haskell -haskell Calc.cf
cd haskell
make
```

Test in Haskell

```
echo "1 + 2 * 3" | ./TestCalc
```

## Output

```
Parse Successful!
[Abstract Syntax]
EAdd (EInt 1) (EMul (EInt 2) (EInt 3))
[Linearized tree]
1 + 2 * 3
```
