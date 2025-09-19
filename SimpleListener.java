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
	 * Enter a parse tree produced by {@link SimpleParser#conditional_statements}.
	 * @param ctx the parse tree
	 */
	void enterConditional_statements(SimpleParser.Conditional_statementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#conditional_statements}.
	 * @param ctx the parse tree
	 */
	void exitConditional_statements(SimpleParser.Conditional_statementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(SimpleParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(SimpleParser.ConditionContext ctx);
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
	 * Enter a parse tree produced by {@link SimpleParser#while_statement}.
	 * @param ctx the parse tree
	 */
	void enterWhile_statement(SimpleParser.While_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#while_statement}.
	 * @param ctx the parse tree
	 */
	void exitWhile_statement(SimpleParser.While_statementContext ctx);
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
	/**
	 * Enter a parse tree produced by {@link SimpleParser#input_string}.
	 * @param ctx the parse tree
	 */
	void enterInput_string(SimpleParser.Input_stringContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#input_string}.
	 * @param ctx the parse tree
	 */
	void exitInput_string(SimpleParser.Input_stringContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#input_number}.
	 * @param ctx the parse tree
	 */
	void enterInput_number(SimpleParser.Input_numberContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#input_number}.
	 * @param ctx the parse tree
	 */
	void exitInput_number(SimpleParser.Input_numberContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#input_decimal}.
	 * @param ctx the parse tree
	 */
	void enterInput_decimal(SimpleParser.Input_decimalContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#input_decimal}.
	 * @param ctx the parse tree
	 */
	void exitInput_decimal(SimpleParser.Input_decimalContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#output}.
	 * @param ctx the parse tree
	 */
	void enterOutput(SimpleParser.OutputContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#output}.
	 * @param ctx the parse tree
	 */
	void exitOutput(SimpleParser.OutputContext ctx);
}