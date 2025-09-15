// Generated from /workspaces/Compilers-Team-Nemesis/Simple.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SimpleParser}.
 */
public interface SimpleListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SimpleParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(SimpleParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(SimpleParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(SimpleParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(SimpleParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(SimpleParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(SimpleParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#conditionals}.
	 * @param ctx the parse tree
	 */
	void enterConditionals(SimpleParser.ConditionalsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#conditionals}.
	 * @param ctx the parse tree
	 */
	void exitConditionals(SimpleParser.ConditionalsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void enterIf_statement(SimpleParser.If_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void exitIf_statement(SimpleParser.If_statementContext ctx);
}