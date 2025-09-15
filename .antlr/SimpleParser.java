// Generated from /workspaces/Compilers-Team-Nemesis/Simple.g4 by ANTLR 4.13.1
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
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, NEWLINE=16, 
		INT=17, WHITESPACE=18, WORD=19, STRING=20;
	public static final int
		RULE_prog = 0, RULE_assignment = 1, RULE_expr = 2, RULE_conditionals = 3, 
		RULE_if_statement = 4, RULE_else_statement = 5, RULE_if_block = 6;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "assignment", "expr", "conditionals", "if_statement", "else_statement", 
			"if_block"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'multiply'", "'divide'", "'mod'", "'add'", "'minus'", "'('", 
			"')'", "'equal to'", "'greater than'", "'less'", "'is'", "'if not'", 
			"'{'", "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "NEWLINE", "INT", "WHITESPACE", "WORD", "STRING"
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
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(SimpleParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(SimpleParser.NEWLINE, i);
		}
		public List<If_blockContext> if_block() {
			return getRuleContexts(If_blockContext.class);
		}
		public If_blockContext if_block(int i) {
			return getRuleContext(If_blockContext.class,i);
		}
		public List<AssignmentContext> assignment() {
			return getRuleContexts(AssignmentContext.class);
		}
		public AssignmentContext assignment(int i) {
			return getRuleContext(AssignmentContext.class,i);
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
			setState(44);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(19);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__6 || _la==INT) {
					{
					{
					setState(14);
					expr(0);
					setState(15);
					match(NEWLINE);
					}
					}
					setState(21);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(27);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__11) {
					{
					{
					setState(22);
					if_block();
					setState(23);
					match(NEWLINE);
					}
					}
					setState(29);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(35);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WORD) {
					{
					{
					setState(30);
					assignment();
					setState(31);
					match(NEWLINE);
					}
					}
					setState(37);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(41);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(38);
					match(NEWLINE);
					}
					}
					setState(43);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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
	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode WORD() { return getToken(SimpleParser.WORD, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode STRING() { return getToken(SimpleParser.STRING, 0); }
		public TerminalNode INT() { return getToken(SimpleParser.INT, 0); }
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
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(46);
				match(WORD);
				setState(47);
				match(T__0);
				setState(48);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(49);
				match(WORD);
				setState(50);
				match(T__0);
				setState(51);
				match(STRING);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(52);
				match(WORD);
				setState(53);
				match(T__0);
				setState(54);
				match(INT);
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
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				{
				setState(58);
				match(INT);
				}
				break;
			case T__6:
				{
				setState(59);
				match(T__6);
				setState(60);
				expr(0);
				setState(61);
				match(T__7);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(73);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(71);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(65);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(66);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 28L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(67);
						expr(5);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(68);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(69);
						_la = _input.LA(1);
						if ( !(_la==T__4 || _la==T__5) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(70);
						expr(4);
						}
						break;
					}
					} 
				}
				setState(75);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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
	public static class ConditionalsContext extends ParserRuleContext {
		public ConditionalsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionals; }
	}

	public final ConditionalsContext conditionals() throws RecognitionException {
		ConditionalsContext _localctx = new ConditionalsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_conditionals);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 3584L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class If_statementContext extends ParserRuleContext {
		public ConditionalsContext conditionals() {
			return getRuleContext(ConditionalsContext.class,0);
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
		public List<TerminalNode> WORD() { return getTokens(SimpleParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(SimpleParser.WORD, i);
		}
		public If_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_statement; }
	}

	public final If_statementContext if_statement() throws RecognitionException {
		If_statementContext _localctx = new If_statementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_if_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			match(T__11);
			setState(82);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(79);
				match(INT);
				}
				break;
			case 2:
				{
				setState(80);
				expr(0);
				}
				break;
			case 3:
				{
				setState(81);
				match(WORD);
				}
				break;
			}
			setState(84);
			conditionals();
			setState(88);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(85);
				match(INT);
				}
				break;
			case 2:
				{
				setState(86);
				expr(0);
				}
				break;
			case 3:
				{
				setState(87);
				match(WORD);
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
	public static class Else_statementContext extends ParserRuleContext {
		public Else_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_statement; }
	}

	public final Else_statementContext else_statement() throws RecognitionException {
		Else_statementContext _localctx = new Else_statementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_else_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			match(T__12);
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
		public List<ProgContext> prog() {
			return getRuleContexts(ProgContext.class);
		}
		public ProgContext prog(int i) {
			return getRuleContext(ProgContext.class,i);
		}
		public List<Else_statementContext> else_statement() {
			return getRuleContexts(Else_statementContext.class);
		}
		public Else_statementContext else_statement(int i) {
			return getRuleContext(Else_statementContext.class,i);
		}
		public If_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_block; }
	}

	public final If_blockContext if_block() throws RecognitionException {
		If_blockContext _localctx = new If_blockContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_if_block);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			if_statement();
			setState(93);
			match(T__13);
			setState(94);
			prog();
			setState(95);
			match(T__14);
			setState(104);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(96);
					else_statement();
					setState(97);
					if_statement();
					setState(98);
					match(T__13);
					setState(99);
					prog();
					setState(100);
					match(T__14);
					}
					} 
				}
				setState(106);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			setState(112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__12) {
				{
				setState(107);
				else_statement();
				setState(108);
				match(T__13);
				setState(109);
				prog();
				setState(110);
				match(T__14);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 2:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		case 1:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0014s\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0005\u0000\u0012\b\u0000\n\u0000\f\u0000\u0015\t\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0005\u0000\u001a\b\u0000\n\u0000\f\u0000\u001d"+
		"\t\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0005\u0000\"\b\u0000\n\u0000"+
		"\f\u0000%\t\u0000\u0001\u0000\u0005\u0000(\b\u0000\n\u0000\f\u0000+\t"+
		"\u0000\u0003\u0000-\b\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003"+
		"\u00018\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0003\u0002@\b\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002H\b\u0002\n\u0002"+
		"\f\u0002K\t\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0003\u0004S\b\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0003\u0004Y\b\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006g\b\u0006\n\u0006"+
		"\f\u0006j\t\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0003\u0006q\b\u0006\u0001\u0006\u0000\u0001\u0004\u0007\u0000"+
		"\u0002\u0004\u0006\b\n\f\u0000\u0003\u0001\u0000\u0002\u0004\u0001\u0000"+
		"\u0005\u0006\u0001\u0000\t\u000b}\u0000,\u0001\u0000\u0000\u0000\u0002"+
		"7\u0001\u0000\u0000\u0000\u0004?\u0001\u0000\u0000\u0000\u0006L\u0001"+
		"\u0000\u0000\u0000\bN\u0001\u0000\u0000\u0000\nZ\u0001\u0000\u0000\u0000"+
		"\f\\\u0001\u0000\u0000\u0000\u000e\u000f\u0003\u0004\u0002\u0000\u000f"+
		"\u0010\u0005\u0010\u0000\u0000\u0010\u0012\u0001\u0000\u0000\u0000\u0011"+
		"\u000e\u0001\u0000\u0000\u0000\u0012\u0015\u0001\u0000\u0000\u0000\u0013"+
		"\u0011\u0001\u0000\u0000\u0000\u0013\u0014\u0001\u0000\u0000\u0000\u0014"+
		"-\u0001\u0000\u0000\u0000\u0015\u0013\u0001\u0000\u0000\u0000\u0016\u0017"+
		"\u0003\f\u0006\u0000\u0017\u0018\u0005\u0010\u0000\u0000\u0018\u001a\u0001"+
		"\u0000\u0000\u0000\u0019\u0016\u0001\u0000\u0000\u0000\u001a\u001d\u0001"+
		"\u0000\u0000\u0000\u001b\u0019\u0001\u0000\u0000\u0000\u001b\u001c\u0001"+
		"\u0000\u0000\u0000\u001c-\u0001\u0000\u0000\u0000\u001d\u001b\u0001\u0000"+
		"\u0000\u0000\u001e\u001f\u0003\u0002\u0001\u0000\u001f \u0005\u0010\u0000"+
		"\u0000 \"\u0001\u0000\u0000\u0000!\u001e\u0001\u0000\u0000\u0000\"%\u0001"+
		"\u0000\u0000\u0000#!\u0001\u0000\u0000\u0000#$\u0001\u0000\u0000\u0000"+
		"$-\u0001\u0000\u0000\u0000%#\u0001\u0000\u0000\u0000&(\u0005\u0010\u0000"+
		"\u0000\'&\u0001\u0000\u0000\u0000(+\u0001\u0000\u0000\u0000)\'\u0001\u0000"+
		"\u0000\u0000)*\u0001\u0000\u0000\u0000*-\u0001\u0000\u0000\u0000+)\u0001"+
		"\u0000\u0000\u0000,\u0013\u0001\u0000\u0000\u0000,\u001b\u0001\u0000\u0000"+
		"\u0000,#\u0001\u0000\u0000\u0000,)\u0001\u0000\u0000\u0000-\u0001\u0001"+
		"\u0000\u0000\u0000./\u0005\u0013\u0000\u0000/0\u0005\u0001\u0000\u0000"+
		"08\u0003\u0004\u0002\u000012\u0005\u0013\u0000\u000023\u0005\u0001\u0000"+
		"\u000038\u0005\u0014\u0000\u000045\u0005\u0013\u0000\u000056\u0005\u0001"+
		"\u0000\u000068\u0005\u0011\u0000\u00007.\u0001\u0000\u0000\u000071\u0001"+
		"\u0000\u0000\u000074\u0001\u0000\u0000\u00008\u0003\u0001\u0000\u0000"+
		"\u00009:\u0006\u0002\uffff\uffff\u0000:@\u0005\u0011\u0000\u0000;<\u0005"+
		"\u0007\u0000\u0000<=\u0003\u0004\u0002\u0000=>\u0005\b\u0000\u0000>@\u0001"+
		"\u0000\u0000\u0000?9\u0001\u0000\u0000\u0000?;\u0001\u0000\u0000\u0000"+
		"@I\u0001\u0000\u0000\u0000AB\n\u0004\u0000\u0000BC\u0007\u0000\u0000\u0000"+
		"CH\u0003\u0004\u0002\u0005DE\n\u0003\u0000\u0000EF\u0007\u0001\u0000\u0000"+
		"FH\u0003\u0004\u0002\u0004GA\u0001\u0000\u0000\u0000GD\u0001\u0000\u0000"+
		"\u0000HK\u0001\u0000\u0000\u0000IG\u0001\u0000\u0000\u0000IJ\u0001\u0000"+
		"\u0000\u0000J\u0005\u0001\u0000\u0000\u0000KI\u0001\u0000\u0000\u0000"+
		"LM\u0007\u0002\u0000\u0000M\u0007\u0001\u0000\u0000\u0000NR\u0005\f\u0000"+
		"\u0000OS\u0005\u0011\u0000\u0000PS\u0003\u0004\u0002\u0000QS\u0005\u0013"+
		"\u0000\u0000RO\u0001\u0000\u0000\u0000RP\u0001\u0000\u0000\u0000RQ\u0001"+
		"\u0000\u0000\u0000ST\u0001\u0000\u0000\u0000TX\u0003\u0006\u0003\u0000"+
		"UY\u0005\u0011\u0000\u0000VY\u0003\u0004\u0002\u0000WY\u0005\u0013\u0000"+
		"\u0000XU\u0001\u0000\u0000\u0000XV\u0001\u0000\u0000\u0000XW\u0001\u0000"+
		"\u0000\u0000Y\t\u0001\u0000\u0000\u0000Z[\u0005\r\u0000\u0000[\u000b\u0001"+
		"\u0000\u0000\u0000\\]\u0003\b\u0004\u0000]^\u0005\u000e\u0000\u0000^_"+
		"\u0003\u0000\u0000\u0000_h\u0005\u000f\u0000\u0000`a\u0003\n\u0005\u0000"+
		"ab\u0003\b\u0004\u0000bc\u0005\u000e\u0000\u0000cd\u0003\u0000\u0000\u0000"+
		"de\u0005\u000f\u0000\u0000eg\u0001\u0000\u0000\u0000f`\u0001\u0000\u0000"+
		"\u0000gj\u0001\u0000\u0000\u0000hf\u0001\u0000\u0000\u0000hi\u0001\u0000"+
		"\u0000\u0000ip\u0001\u0000\u0000\u0000jh\u0001\u0000\u0000\u0000kl\u0003"+
		"\n\u0005\u0000lm\u0005\u000e\u0000\u0000mn\u0003\u0000\u0000\u0000no\u0005"+
		"\u000f\u0000\u0000oq\u0001\u0000\u0000\u0000pk\u0001\u0000\u0000\u0000"+
		"pq\u0001\u0000\u0000\u0000q\r\u0001\u0000\u0000\u0000\r\u0013\u001b#)"+
		",7?GIRXhp";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}