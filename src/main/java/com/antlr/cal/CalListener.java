// Generated from /Users/lcc/IdeaProjects/JdkSource/src/main/java/com/antlr/Cal.g4 by ANTLR 4.5
package com.antlr.cal;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CalParser}.
 */
public interface CalListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CalParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(@NotNull CalParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(@NotNull CalParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Assign}
	 * labeled alternative in {@link CalParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterAssign(@NotNull CalParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Assign}
	 * labeled alternative in {@link CalParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitAssign(@NotNull CalParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code printExpr}
	 * labeled alternative in {@link CalParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterPrintExpr(@NotNull CalParser.PrintExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code printExpr}
	 * labeled alternative in {@link CalParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitPrintExpr(@NotNull CalParser.PrintExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parens}
	 * labeled alternative in {@link CalParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParens(@NotNull CalParser.ParensContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parens}
	 * labeled alternative in {@link CalParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParens(@NotNull CalParser.ParensContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link CalParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMulDiv(@NotNull CalParser.MulDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link CalParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMulDiv(@NotNull CalParser.MulDivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link CalParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAddSub(@NotNull CalParser.AddSubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link CalParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAddSub(@NotNull CalParser.AddSubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NUM}
	 * labeled alternative in {@link CalParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNUM(@NotNull CalParser.NUMContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NUM}
	 * labeled alternative in {@link CalParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNUM(@NotNull CalParser.NUMContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ID}
	 * labeled alternative in {@link CalParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterID(@NotNull CalParser.IDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ID}
	 * labeled alternative in {@link CalParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitID(@NotNull CalParser.IDContext ctx);
}