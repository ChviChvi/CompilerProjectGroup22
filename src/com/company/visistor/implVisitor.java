// Generated from C:/Users/Christiaan Vink/IdeaProjects/CompilerProjectGroup22/src/com/company\impl.g4 by ANTLR 4.10.1
package com.company.visistor;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link implParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface implVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link implParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(implParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link implParser#reset}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReset(implParser.ResetContext ctx);
	/**
	 * Visit a parse tree produced by {@link implParser#oscillator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOscillator(implParser.OscillatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link implParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(implParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link implParser#latch}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLatch(implParser.LatchContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Output}
	 * labeled alternative in {@link implParser#oscillatorM}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutput(implParser.OutputContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AND}
	 * labeled alternative in {@link implParser#and}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAND(implParser.ANDContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ONE}
	 * labeled alternative in {@link implParser#input}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitONE(implParser.ONEContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ZERO}
	 * labeled alternative in {@link implParser#input}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitZERO(implParser.ZEROContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Circuit}
	 * labeled alternative in {@link implParser#update}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCircuit(implParser.CircuitContext ctx);
	/**
	 * Visit a parse tree produced by {@link implParser#simulate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimulate(implParser.SimulateContext ctx);
}