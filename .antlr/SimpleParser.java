// Generated from c:/Users/hayde/OneDrive/Desktop/Classes/CSC320/Nemesis/Compilers-Team-Nemesis/Simple.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class SimpleParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, STRING=27, INT=28, DECIMAL=29, WORD=30, COMMENT_LINE=31, 
		WHITESPACE=32;
	public static final int
		RULE_prog = 0, RULE_assignment = 1, RULE_statement = 2, RULE_expr = 3, 
		RULE_conditional_statements = 4, RULE_condition = 5, RULE_if_statement = 6, 
		RULE_else_statement = 7, RULE_if_block = 8, RULE_for_statement = 9, RULE_while_statement = 10, 
		RULE_statementBlock = 11, RULE_input = 12, RULE_input_string = 13, RULE_input_number = 14, 
		RULE_input_decimal = 15, RULE_output = 16;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "assignment", "statement", "expr", "conditional_statements", 
			"condition", "if_statement", "else_statement", "if_block", "for_statement", 
			"while_statement", "statementBlock", "input", "input_string", "input_number", 
			"input_decimal", "output"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'multiply'", "'divide'", "'mod'", "'add'", "'minus'", "'('", 
			"')'", "'not'", "'equal to'", "'greater than'", "'less than'", "'less than or equal to'", 
			"'greater than or equal to'", "'is'", "'if not'", "'{'", "'}'", "'repeat'", 
			"'while'", "'continue'", "'break'", "'input string'", "'input number'", 
			"'input decimal'", "'print'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "STRING", "INT", "DECIMAL", "WORD", "COMMENT_LINE", 
			"WHITESPACE"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Simple.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SimpleParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1410891904L) != 0)) {
				{
				{
				setState(34);
				statement();
				}
				}
				setState(39);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentContext extends ParserRuleContext {
		public List<TerminalNode> WORD() { return getTokens(SimpleParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(SimpleParser.WORD, i);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode STRING() { return getToken(SimpleParser.STRING, 0); }
		public TerminalNode INT() { return getToken(SimpleParser.INT, 0); }
		public InputContext input() {
			return getRuleContext(InputContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_assignment);
		try {
			setState(55);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(40);
				match(WORD);
				setState(41);
				match(T__0);
				setState(42);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(43);
				match(WORD);
				setState(44);
				match(T__0);
				setState(45);
				match(STRING);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(46);
				match(WORD);
				setState(47);
				match(T__0);
				setState(48);
				match(INT);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(49);
				match(WORD);
				setState(50);
				match(T__0);
				setState(51);
				input();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(52);
				match(WORD);
				setState(53);
				match(T__0);
				setState(54);
				match(WORD);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public For_statementContext for_statement() {
			return getRuleContext(For_statementContext.class,0);
		}
		public While_statementContext while_statement() {
			return getRuleContext(While_statementContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public If_blockContext if_block() {
			return getRuleContext(If_blockContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public OutputContext output() {
			return getRuleContext(OutputContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		try {
			setState(64);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(57);
				for_statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(58);
				while_statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(59);
				expr(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(60);
				if_block();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(61);
				assignment();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(62);
				condition();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(63);
				output();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(SimpleParser.INT, 0); }
		public TerminalNode WORD() { return getToken(SimpleParser.WORD, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				{
				setState(67);
				match(INT);
				}
				break;
			case WORD:
				{
				setState(68);
				match(WORD);
				}
				break;
			case T__6:
				{
				setState(69);
				match(T__6);
				setState(70);
				expr(0);
				setState(71);
				match(T__7);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(83);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(81);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(75);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(76);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 28L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(77);
						expr(6);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(78);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(79);
						_la = _input.LA(1);
						if ( !(_la==T__4 || _la==T__5) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(80);
						expr(5);
						}
						break;
					}
					} 
				}
				setState(85);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Conditional_statementsContext extends ParserRuleContext {
		public Conditional_statementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional_statements; }
	}

	public final Conditional_statementsContext conditional_statements() throws RecognitionException {
		Conditional_statementsContext _localctx = new Conditional_statementsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_conditional_statements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(87);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__8) {
				{
				setState(86);
				match(T__8);
				}
			}

			setState(89);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 31744L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConditionContext extends ParserRuleContext {
		public Conditional_statementsContext conditional_statements() {
			return getRuleContext(Conditional_statementsContext.class,0);
		}
		public List<TerminalNode> WORD() { return getTokens(SimpleParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(SimpleParser.WORD, i);
		}
		public List<TerminalNode> INT() { return getTokens(SimpleParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(SimpleParser.INT, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(91);
				match(WORD);
				}
				break;
			case 2:
				{
				setState(92);
				match(INT);
				}
				break;
			case 3:
				{
				setState(93);
				expr(0);
				}
				break;
			}
			setState(96);
			conditional_statements();
			setState(100);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(97);
				match(WORD);
				}
				break;
			case 2:
				{
				setState(98);
				match(INT);
				}
				break;
			case 3:
				{
				setState(99);
				expr(0);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class If_statementContext extends ParserRuleContext {
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public If_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_statement; }
	}

	public final If_statementContext if_statement() throws RecognitionException {
		If_statementContext _localctx = new If_statementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_if_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			match(T__14);
			setState(103);
			condition();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Else_statementContext extends ParserRuleContext {
		public Else_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_statement; }
	}

	public final Else_statementContext else_statement() throws RecognitionException {
		Else_statementContext _localctx = new Else_statementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_else_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			match(T__15);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class If_blockContext extends ParserRuleContext {
		public List<If_statementContext> if_statement() {
			return getRuleContexts(If_statementContext.class);
		}
		public If_statementContext if_statement(int i) {
			return getRuleContext(If_statementContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<Else_statementContext> else_statement() {
			return getRuleContexts(Else_statementContext.class);
		}
		public Else_statementContext else_statement(int i) {
			return getRuleContext(Else_statementContext.class,i);
		}
		public ProgContext prog() {
			return getRuleContext(ProgContext.class,0);
		}
		public If_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_block; }
	}

	public final If_blockContext if_block() throws RecognitionException {
		If_blockContext _localctx = new If_blockContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_if_block);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			if_statement();
			setState(108);
			match(T__16);
			setState(109);
			statement();
			setState(110);
			match(T__17);
			setState(119);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(111);
					else_statement();
					setState(112);
					if_statement();
					setState(113);
					match(T__16);
					setState(114);
					statement();
					setState(115);
					match(T__17);
					}
					} 
				}
				setState(121);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			setState(127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__15) {
				{
				setState(122);
				else_statement();
				setState(123);
				match(T__16);
				setState(124);
				prog();
				setState(125);
				match(T__17);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class For_statementContext extends ParserRuleContext {
		public StatementBlockContext statementBlock() {
			return getRuleContext(StatementBlockContext.class,0);
		}
		public TerminalNode INT() { return getToken(SimpleParser.INT, 0); }
		public For_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_statement; }
	}

	public final For_statementContext for_statement() throws RecognitionException {
		For_statementContext _localctx = new For_statementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_for_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			match(T__18);
			{
			setState(130);
			match(INT);
			}
			setState(131);
			statementBlock();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class While_statementContext extends ParserRuleContext {
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public StatementBlockContext statementBlock() {
			return getRuleContext(StatementBlockContext.class,0);
		}
		public While_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_statement; }
	}

	public final While_statementContext while_statement() throws RecognitionException {
		While_statementContext _localctx = new While_statementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_while_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			match(T__19);
			setState(134);
			condition();
			setState(135);
			statementBlock();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementBlockContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public StatementBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementBlock; }
	}

	public final StatementBlockContext statementBlock() throws RecognitionException {
		StatementBlockContext _localctx = new StatementBlockContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_statementBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			match(T__16);
			setState(143);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1417183360L) != 0)) {
				{
				setState(141);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__6:
				case T__14:
				case T__18:
				case T__19:
				case T__25:
				case INT:
				case WORD:
					{
					setState(138);
					statement();
					}
					break;
				case T__20:
					{
					setState(139);
					match(T__20);
					}
					break;
				case T__21:
					{
					setState(140);
					match(T__21);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(145);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(146);
			match(T__17);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InputContext extends ParserRuleContext {
		public Input_decimalContext input_decimal() {
			return getRuleContext(Input_decimalContext.class,0);
		}
		public Input_stringContext input_string() {
			return getRuleContext(Input_stringContext.class,0);
		}
		public Input_numberContext input_number() {
			return getRuleContext(Input_numberContext.class,0);
		}
		public InputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input; }
	}

	public final InputContext input() throws RecognitionException {
		InputContext _localctx = new InputContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_input);
		try {
			setState(151);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__24:
				enterOuterAlt(_localctx, 1);
				{
				setState(148);
				input_decimal();
				}
				break;
			case T__22:
				enterOuterAlt(_localctx, 2);
				{
				setState(149);
				input_string();
				}
				break;
			case T__23:
				enterOuterAlt(_localctx, 3);
				{
				setState(150);
				input_number();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Input_stringContext extends ParserRuleContext {
		public Input_stringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input_string; }
	}

	public final Input_stringContext input_string() throws RecognitionException {
		Input_stringContext _localctx = new Input_stringContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_input_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			match(T__22);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Input_numberContext extends ParserRuleContext {
		public Input_numberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input_number; }
	}

	public final Input_numberContext input_number() throws RecognitionException {
		Input_numberContext _localctx = new Input_numberContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_input_number);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			match(T__23);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Input_decimalContext extends ParserRuleContext {
		public Input_decimalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input_decimal; }
	}

	public final Input_decimalContext input_decimal() throws RecognitionException {
		Input_decimalContext _localctx = new Input_decimalContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_input_decimal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			match(T__24);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OutputContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(SimpleParser.STRING, 0); }
		public TerminalNode DECIMAL() { return getToken(SimpleParser.DECIMAL, 0); }
		public TerminalNode INT() { return getToken(SimpleParser.INT, 0); }
		public TerminalNode WORD() { return getToken(SimpleParser.WORD, 0); }
		public OutputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_output; }
	}

	public final OutputContext output() throws RecognitionException {
		OutputContext _localctx = new OutputContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_output);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			match(T__25);
			setState(160);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 2013265920L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 3:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		case 1:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001 \u00a3\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0001\u0000\u0005\u0000$\b\u0000\n\u0000\f\u0000"+
		"\'\t\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u00018\b\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0003\u0002A\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003J\b\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0005\u0003R\b\u0003\n\u0003\f\u0003U\t\u0003\u0001\u0004\u0003\u0004"+
		"X\b\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0003\u0005_\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0003\u0005e\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0005\bv\b\b\n\b\f\by\t\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0003\b\u0080\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0005"+
		"\u000b\u008e\b\u000b\n\u000b\f\u000b\u0091\t\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\f\u0001\f\u0001\f\u0003\f\u0098\b\f\u0001\r\u0001\r\u0001\u000e"+
		"\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0000\u0001\u0006\u0011\u0000\u0002\u0004\u0006\b\n\f\u000e"+
		"\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \u0000\u0004\u0001\u0000"+
		"\u0002\u0004\u0001\u0000\u0005\u0006\u0001\u0000\n\u000e\u0001\u0000\u001b"+
		"\u001e\u00ac\u0000%\u0001\u0000\u0000\u0000\u00027\u0001\u0000\u0000\u0000"+
		"\u0004@\u0001\u0000\u0000\u0000\u0006I\u0001\u0000\u0000\u0000\bW\u0001"+
		"\u0000\u0000\u0000\n^\u0001\u0000\u0000\u0000\ff\u0001\u0000\u0000\u0000"+
		"\u000ei\u0001\u0000\u0000\u0000\u0010k\u0001\u0000\u0000\u0000\u0012\u0081"+
		"\u0001\u0000\u0000\u0000\u0014\u0085\u0001\u0000\u0000\u0000\u0016\u0089"+
		"\u0001\u0000\u0000\u0000\u0018\u0097\u0001\u0000\u0000\u0000\u001a\u0099"+
		"\u0001\u0000\u0000\u0000\u001c\u009b\u0001\u0000\u0000\u0000\u001e\u009d"+
		"\u0001\u0000\u0000\u0000 \u009f\u0001\u0000\u0000\u0000\"$\u0003\u0004"+
		"\u0002\u0000#\"\u0001\u0000\u0000\u0000$\'\u0001\u0000\u0000\u0000%#\u0001"+
		"\u0000\u0000\u0000%&\u0001\u0000\u0000\u0000&\u0001\u0001\u0000\u0000"+
		"\u0000\'%\u0001\u0000\u0000\u0000()\u0005\u001e\u0000\u0000)*\u0005\u0001"+
		"\u0000\u0000*8\u0003\u0006\u0003\u0000+,\u0005\u001e\u0000\u0000,-\u0005"+
		"\u0001\u0000\u0000-8\u0005\u001b\u0000\u0000./\u0005\u001e\u0000\u0000"+
		"/0\u0005\u0001\u0000\u000008\u0005\u001c\u0000\u000012\u0005\u001e\u0000"+
		"\u000023\u0005\u0001\u0000\u000038\u0003\u0018\f\u000045\u0005\u001e\u0000"+
		"\u000056\u0005\u0001\u0000\u000068\u0005\u001e\u0000\u00007(\u0001\u0000"+
		"\u0000\u00007+\u0001\u0000\u0000\u00007.\u0001\u0000\u0000\u000071\u0001"+
		"\u0000\u0000\u000074\u0001\u0000\u0000\u00008\u0003\u0001\u0000\u0000"+
		"\u00009A\u0003\u0012\t\u0000:A\u0003\u0014\n\u0000;A\u0003\u0006\u0003"+
		"\u0000<A\u0003\u0010\b\u0000=A\u0003\u0002\u0001\u0000>A\u0003\n\u0005"+
		"\u0000?A\u0003 \u0010\u0000@9\u0001\u0000\u0000\u0000@:\u0001\u0000\u0000"+
		"\u0000@;\u0001\u0000\u0000\u0000@<\u0001\u0000\u0000\u0000@=\u0001\u0000"+
		"\u0000\u0000@>\u0001\u0000\u0000\u0000@?\u0001\u0000\u0000\u0000A\u0005"+
		"\u0001\u0000\u0000\u0000BC\u0006\u0003\uffff\uffff\u0000CJ\u0005\u001c"+
		"\u0000\u0000DJ\u0005\u001e\u0000\u0000EF\u0005\u0007\u0000\u0000FG\u0003"+
		"\u0006\u0003\u0000GH\u0005\b\u0000\u0000HJ\u0001\u0000\u0000\u0000IB\u0001"+
		"\u0000\u0000\u0000ID\u0001\u0000\u0000\u0000IE\u0001\u0000\u0000\u0000"+
		"JS\u0001\u0000\u0000\u0000KL\n\u0005\u0000\u0000LM\u0007\u0000\u0000\u0000"+
		"MR\u0003\u0006\u0003\u0006NO\n\u0004\u0000\u0000OP\u0007\u0001\u0000\u0000"+
		"PR\u0003\u0006\u0003\u0005QK\u0001\u0000\u0000\u0000QN\u0001\u0000\u0000"+
		"\u0000RU\u0001\u0000\u0000\u0000SQ\u0001\u0000\u0000\u0000ST\u0001\u0000"+
		"\u0000\u0000T\u0007\u0001\u0000\u0000\u0000US\u0001\u0000\u0000\u0000"+
		"VX\u0005\t\u0000\u0000WV\u0001\u0000\u0000\u0000WX\u0001\u0000\u0000\u0000"+
		"XY\u0001\u0000\u0000\u0000YZ\u0007\u0002\u0000\u0000Z\t\u0001\u0000\u0000"+
		"\u0000[_\u0005\u001e\u0000\u0000\\_\u0005\u001c\u0000\u0000]_\u0003\u0006"+
		"\u0003\u0000^[\u0001\u0000\u0000\u0000^\\\u0001\u0000\u0000\u0000^]\u0001"+
		"\u0000\u0000\u0000_`\u0001\u0000\u0000\u0000`d\u0003\b\u0004\u0000ae\u0005"+
		"\u001e\u0000\u0000be\u0005\u001c\u0000\u0000ce\u0003\u0006\u0003\u0000"+
		"da\u0001\u0000\u0000\u0000db\u0001\u0000\u0000\u0000dc\u0001\u0000\u0000"+
		"\u0000e\u000b\u0001\u0000\u0000\u0000fg\u0005\u000f\u0000\u0000gh\u0003"+
		"\n\u0005\u0000h\r\u0001\u0000\u0000\u0000ij\u0005\u0010\u0000\u0000j\u000f"+
		"\u0001\u0000\u0000\u0000kl\u0003\f\u0006\u0000lm\u0005\u0011\u0000\u0000"+
		"mn\u0003\u0004\u0002\u0000nw\u0005\u0012\u0000\u0000op\u0003\u000e\u0007"+
		"\u0000pq\u0003\f\u0006\u0000qr\u0005\u0011\u0000\u0000rs\u0003\u0004\u0002"+
		"\u0000st\u0005\u0012\u0000\u0000tv\u0001\u0000\u0000\u0000uo\u0001\u0000"+
		"\u0000\u0000vy\u0001\u0000\u0000\u0000wu\u0001\u0000\u0000\u0000wx\u0001"+
		"\u0000\u0000\u0000x\u007f\u0001\u0000\u0000\u0000yw\u0001\u0000\u0000"+
		"\u0000z{\u0003\u000e\u0007\u0000{|\u0005\u0011\u0000\u0000|}\u0003\u0000"+
		"\u0000\u0000}~\u0005\u0012\u0000\u0000~\u0080\u0001\u0000\u0000\u0000"+
		"\u007fz\u0001\u0000\u0000\u0000\u007f\u0080\u0001\u0000\u0000\u0000\u0080"+
		"\u0011\u0001\u0000\u0000\u0000\u0081\u0082\u0005\u0013\u0000\u0000\u0082"+
		"\u0083\u0005\u001c\u0000\u0000\u0083\u0084\u0003\u0016\u000b\u0000\u0084"+
		"\u0013\u0001\u0000\u0000\u0000\u0085\u0086\u0005\u0014\u0000\u0000\u0086"+
		"\u0087\u0003\n\u0005\u0000\u0087\u0088\u0003\u0016\u000b\u0000\u0088\u0015"+
		"\u0001\u0000\u0000\u0000\u0089\u008f\u0005\u0011\u0000\u0000\u008a\u008e"+
		"\u0003\u0004\u0002\u0000\u008b\u008e\u0005\u0015\u0000\u0000\u008c\u008e"+
		"\u0005\u0016\u0000\u0000\u008d\u008a\u0001\u0000\u0000\u0000\u008d\u008b"+
		"\u0001\u0000\u0000\u0000\u008d\u008c\u0001\u0000\u0000\u0000\u008e\u0091"+
		"\u0001\u0000\u0000\u0000\u008f\u008d\u0001\u0000\u0000\u0000\u008f\u0090"+
		"\u0001\u0000\u0000\u0000\u0090\u0092\u0001\u0000\u0000\u0000\u0091\u008f"+
		"\u0001\u0000\u0000\u0000\u0092\u0093\u0005\u0012\u0000\u0000\u0093\u0017"+
		"\u0001\u0000\u0000\u0000\u0094\u0098\u0003\u001e\u000f\u0000\u0095\u0098"+
		"\u0003\u001a\r\u0000\u0096\u0098\u0003\u001c\u000e\u0000\u0097\u0094\u0001"+
		"\u0000\u0000\u0000\u0097\u0095\u0001\u0000\u0000\u0000\u0097\u0096\u0001"+
		"\u0000\u0000\u0000\u0098\u0019\u0001\u0000\u0000\u0000\u0099\u009a\u0005"+
		"\u0017\u0000\u0000\u009a\u001b\u0001\u0000\u0000\u0000\u009b\u009c\u0005"+
		"\u0018\u0000\u0000\u009c\u001d\u0001\u0000\u0000\u0000\u009d\u009e\u0005"+
		"\u0019\u0000\u0000\u009e\u001f\u0001\u0000\u0000\u0000\u009f\u00a0\u0005"+
		"\u001a\u0000\u0000\u00a0\u00a1\u0007\u0003\u0000\u0000\u00a1!\u0001\u0000"+
		"\u0000\u0000\u000e%7@IQSW^dw\u007f\u008d\u008f\u0097";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}