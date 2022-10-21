package com.company;


import com.company.visistor.implLexer;
import com.company.visistor.implParser;
import com.company.visistor.implVisitor;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.CharStreams;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;

import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;

public class Main {

    public static void main(String[] args)  throws IOException{


        System.out.println(args.length);

        // we expect exactly one argument: the name of the input file
        if (args.length!=1) {
            System.err.println("\n");
            System.err.println("Impl Interpreter\n");
            System.err.println("=================\n\n");
            System.err.println("Please give as input argument a filename\n");
            System.exit(-1);
        }
        String filename=args[0];

        // open the input file
        CharStream input = CharStreams.fromFileName(filename);
        //new ANTLRFileStream (filename); // depricated

        // create a lexer/scanner
        implLexer lex = new implLexer(input);

        // get the stream of tokens from the scanner
        CommonTokenStream tokens = new CommonTokenStream(lex);

        // create a parser
        implParser parser = new implParser(tokens);

        // and parse anything from the grammar for "start"
        ParseTree parseTree = parser.start();

        // Construct an interpreter and run it on the parse tree
        Interpreter interpreter = new Interpreter();
        Expr result=interpreter.visit(parseTree);

    }
}

class Interpreter extends AbstractParseTreeVisitor<Expr> implements implVisitor<Expr> {


    @Override
    public Expr visitStart(implParser.StartContext ctx) {
        return null;
    }

    @Override
    public Expr visitReset(implParser.ResetContext ctx) {
        return null;
    }

    @Override
    public Expr visitOscillator(implParser.OscillatorContext ctx) {
        return null;
    }

    @Override
    public Expr visitExpr(implParser.ExprContext ctx) {
        return null;
    }

    @Override
    public Expr visitLatch(implParser.LatchContext ctx) {
        return null;
    }

    @Override
    public Expr visitOutput(implParser.OutputContext ctx) {
        return null;
    }

    @Override
    public Expr visitAND(implParser.ANDContext ctx) {
        return null;
    }

    @Override
    public Expr visitONE(implParser.ONEContext ctx) {
        return null;
    }

    @Override
    public Expr visitZERO(implParser.ZEROContext ctx) {
        return null;
    }

    @Override
    public Expr visitCircuit(implParser.CircuitContext ctx) {
        return null;
    }

    @Override
    public Expr visitSimulate(implParser.SimulateContext ctx) {
        return null;
    }


    //public Double visitExpr(implParser.ExprContext ctx){return null;};

}



