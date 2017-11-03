package Calc;
import java_cup.runtime.*;
import Calc.*;
import Calc.Absyn.*;
import java.io.*;


public class Interpret {

    public static void main(String args[]) throws Exception {
        Yylex l = new Yylex(System.in);
        parser p = new parser(l);
        Calc.Absyn.Exp parse_tree = p.pExp();
        System.out.println(Interpreter.interpret(parse_tree));
    }

}