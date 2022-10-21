// Generated from C:/Users/Christiaan Vink/IdeaProjects/CompilerProjectGroup22/src/com/company\impl.g4 by ANTLR 4.10.1
package com.company.visistor;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link implParser}.
 */
public interface implListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link implParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(implParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link implParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(implParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link implParser#reset}.
	 * @param ctx the parse tree
	 */
	void enterReset(implParser.ResetContext ctx);
	/**
	 * Exit a parse tree produced by {@link implParser#reset}.
	 * @param ctx the parse tree
	 */
	void exitReset(implParser.ResetContext ctx);
	/**
	 * Enter a parse tree produced by {@link implParser#oscillator}.
	 * @param ctx the parse tree
	 */
	void enterOscillator(implParser.OscillatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link implParser#oscillator}.
	 * @param ctx the parse tree
	 */
	void exitOscillator(implParser.OscillatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link implParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(implParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link implParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(implParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link implParser#latch}.
	 * @param ctx the parse tree
	 */
	void enterLatch(implParser.LatchContext ctx);
	/**
	 * Exit a parse tree produced by {@link implParser#latch}.
	 * @param ctx the parse tree
	 */
	void exitLatch(implParser.LatchContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Output}
	 * labeled alternative in {@link implParser#oscillatorM}.
	 * @param ctx the parse tree
	 */
	void enterOutput(implParser.OutputContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Output}
	 * labeled alternative in {@link implParser#oscillatorM}.
	 * @param ctx the parse tree
	 */
	void exitOutput(implParser.OutputContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AND}
	 * labeled alternative in {@link implParser#and}.
	 * @param ctx the parse tree
	 */
	void enterAND(implParser.ANDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AND}
	 * labeled alternative in {@link implParser#and}.
	 * @param ctx the parse tree
	 */
	void exitAND(implParser.ANDContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ONE}
	 * labeled alternative in {@link implParser#input}.
	 * @param ctx the parse tree
	 */
	void enterONE(implParser.ONEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ONE}
	 * labeled alternative in {@link implParser#input}.
	 * @param ctx the parse tree
	 */
	void exitONE(implParser.ONEContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ZERO}
	 * labeled alternative in {@link implParser#input}.
	 * @param ctx the parse tree
	 */
	void enterZERO(implParser.ZEROContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ZERO}
	 * labeled alternative in {@link implParser#input}.
	 * @param ctx the parse tree
	 */
	void exitZERO(implParser.ZEROContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Circuit}
	 * labeled alternative in {@link implParser#update}.
	 * @param ctx the parse tree
	 */
	void enterCircuit(implParser.CircuitContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Circuit}
	 * labeled alternative in {@link implParser#update}.
	 * @param ctx the parse tree
	 */
	void exitCircuit(implParser.CircuitContext ctx);
	/**
	 * Enter a parse tree produced by {@link implParser#simulate}.
	 * @param ctx the parse tree
	 */
	void enterSimulate(implParser.SimulateContext ctx);
	/**
	 * Exit a parse tree produced by {@link implParser#simulate}.
	 * @param ctx the parse tree
	 */
	void exitSimulate(implParser.SimulateContext ctx);
}