// Generated from Simple.g4 by ANTLR 4.13.2
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
	 * Enter a parse tree produced by {@link SimpleParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(SimpleParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(SimpleParser.StatementContext ctx);
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
	/**
	 * Enter a parse tree produced by {@link SimpleParser#else_statement}.
	 * @param ctx the parse tree
	 */
	void enterElse_statement(SimpleParser.Else_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#else_statement}.
	 * @param ctx the parse tree
	 */
	void exitElse_statement(SimpleParser.Else_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#if_block}.
	 * @param ctx the parse tree
	 */
	void enterIf_block(SimpleParser.If_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#if_block}.
	 * @param ctx the parse tree
	 */
	void exitIf_block(SimpleParser.If_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#for_statement}.
	 * @param ctx the parse tree
	 */
	void enterFor_statement(SimpleParser.For_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#for_statement}.
	 * @param ctx the parse tree
	 */
	void exitFor_statement(SimpleParser.For_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#statementBlock}.
	 * @param ctx the parse tree
	 */
	void enterStatementBlock(SimpleParser.StatementBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#statementBlock}.
	 * @param ctx the parse tree
	 */
	void exitStatementBlock(SimpleParser.StatementBlockContext ctx);
}