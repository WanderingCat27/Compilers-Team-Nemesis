// Generated from /workspaces/Compilers-Team-Nemesis/Simple.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class SimpleLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, NEWLINE=13, INT=14, WHITESPACE=15, WORD=16, 
		STRING=17;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "NEWLINE", "INT", "WHITESPACE", "WORD", "STRING"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'multiply'", "'divide'", "'mod'", "'add'", "'minus'", "'('", 
			"')'", "'equal to'", "'greater than'", "'less'", "'is'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "NEWLINE", "INT", "WHITESPACE", "WORD", "STRING"
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


	public SimpleLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Simple.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\u0011\u0088\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\f\u0005\fg\b\f\n\f\f\fj\t\f\u0001\f\u0004\fm\b\f\u000b"+
		"\f\f\fn\u0001\r\u0004\rr\b\r\u000b\r\f\rs\u0001\u000e\u0004\u000ew\b\u000e"+
		"\u000b\u000e\f\u000ex\u0001\u000e\u0001\u000e\u0001\u000f\u0003\u000f"+
		"~\b\u000f\u0001\u0010\u0001\u0010\u0005\u0010\u0082\b\u0010\n\u0010\f"+
		"\u0010\u0085\t\u0010\u0001\u0010\u0001\u0010\u0000\u0000\u0011\u0001\u0001"+
		"\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f"+
		"\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f"+
		"\u001f\u0010!\u0011\u0001\u0000\u0005\u0002\u0000\n\n\r\r\u0001\u0000"+
		"09\u0002\u0000\t\t  \u0002\u0000AZaz\u0003\u000009AZaz\u008c\u0000\u0001"+
		"\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005"+
		"\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001"+
		"\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000"+
		"\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000"+
		"\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000"+
		"\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000"+
		"\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000"+
		"\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000"+
		"\u0000\u0001#\u0001\u0000\u0000\u0000\u0003%\u0001\u0000\u0000\u0000\u0005"+
		".\u0001\u0000\u0000\u0000\u00075\u0001\u0000\u0000\u0000\t9\u0001\u0000"+
		"\u0000\u0000\u000b=\u0001\u0000\u0000\u0000\rC\u0001\u0000\u0000\u0000"+
		"\u000fE\u0001\u0000\u0000\u0000\u0011G\u0001\u0000\u0000\u0000\u0013P"+
		"\u0001\u0000\u0000\u0000\u0015]\u0001\u0000\u0000\u0000\u0017b\u0001\u0000"+
		"\u0000\u0000\u0019h\u0001\u0000\u0000\u0000\u001bq\u0001\u0000\u0000\u0000"+
		"\u001dv\u0001\u0000\u0000\u0000\u001f}\u0001\u0000\u0000\u0000!\u007f"+
		"\u0001\u0000\u0000\u0000#$\u0005=\u0000\u0000$\u0002\u0001\u0000\u0000"+
		"\u0000%&\u0005m\u0000\u0000&\'\u0005u\u0000\u0000\'(\u0005l\u0000\u0000"+
		"()\u0005t\u0000\u0000)*\u0005i\u0000\u0000*+\u0005p\u0000\u0000+,\u0005"+
		"l\u0000\u0000,-\u0005y\u0000\u0000-\u0004\u0001\u0000\u0000\u0000./\u0005"+
		"d\u0000\u0000/0\u0005i\u0000\u000001\u0005v\u0000\u000012\u0005i\u0000"+
		"\u000023\u0005d\u0000\u000034\u0005e\u0000\u00004\u0006\u0001\u0000\u0000"+
		"\u000056\u0005m\u0000\u000067\u0005o\u0000\u000078\u0005d\u0000\u0000"+
		"8\b\u0001\u0000\u0000\u00009:\u0005a\u0000\u0000:;\u0005d\u0000\u0000"+
		";<\u0005d\u0000\u0000<\n\u0001\u0000\u0000\u0000=>\u0005m\u0000\u0000"+
		">?\u0005i\u0000\u0000?@\u0005n\u0000\u0000@A\u0005u\u0000\u0000AB\u0005"+
		"s\u0000\u0000B\f\u0001\u0000\u0000\u0000CD\u0005(\u0000\u0000D\u000e\u0001"+
		"\u0000\u0000\u0000EF\u0005)\u0000\u0000F\u0010\u0001\u0000\u0000\u0000"+
		"GH\u0005e\u0000\u0000HI\u0005q\u0000\u0000IJ\u0005u\u0000\u0000JK\u0005"+
		"a\u0000\u0000KL\u0005l\u0000\u0000LM\u0005 \u0000\u0000MN\u0005t\u0000"+
		"\u0000NO\u0005o\u0000\u0000O\u0012\u0001\u0000\u0000\u0000PQ\u0005g\u0000"+
		"\u0000QR\u0005r\u0000\u0000RS\u0005e\u0000\u0000ST\u0005a\u0000\u0000"+
		"TU\u0005t\u0000\u0000UV\u0005e\u0000\u0000VW\u0005r\u0000\u0000WX\u0005"+
		" \u0000\u0000XY\u0005t\u0000\u0000YZ\u0005h\u0000\u0000Z[\u0005a\u0000"+
		"\u0000[\\\u0005n\u0000\u0000\\\u0014\u0001\u0000\u0000\u0000]^\u0005l"+
		"\u0000\u0000^_\u0005e\u0000\u0000_`\u0005s\u0000\u0000`a\u0005s\u0000"+
		"\u0000a\u0016\u0001\u0000\u0000\u0000bc\u0005i\u0000\u0000cd\u0005s\u0000"+
		"\u0000d\u0018\u0001\u0000\u0000\u0000eg\u0003\u001d\u000e\u0000fe\u0001"+
		"\u0000\u0000\u0000gj\u0001\u0000\u0000\u0000hf\u0001\u0000\u0000\u0000"+
		"hi\u0001\u0000\u0000\u0000il\u0001\u0000\u0000\u0000jh\u0001\u0000\u0000"+
		"\u0000km\u0007\u0000\u0000\u0000lk\u0001\u0000\u0000\u0000mn\u0001\u0000"+
		"\u0000\u0000nl\u0001\u0000\u0000\u0000no\u0001\u0000\u0000\u0000o\u001a"+
		"\u0001\u0000\u0000\u0000pr\u0007\u0001\u0000\u0000qp\u0001\u0000\u0000"+
		"\u0000rs\u0001\u0000\u0000\u0000sq\u0001\u0000\u0000\u0000st\u0001\u0000"+
		"\u0000\u0000t\u001c\u0001\u0000\u0000\u0000uw\u0007\u0002\u0000\u0000"+
		"vu\u0001\u0000\u0000\u0000wx\u0001\u0000\u0000\u0000xv\u0001\u0000\u0000"+
		"\u0000xy\u0001\u0000\u0000\u0000yz\u0001\u0000\u0000\u0000z{\u0006\u000e"+
		"\u0000\u0000{\u001e\u0001\u0000\u0000\u0000|~\u0007\u0003\u0000\u0000"+
		"}|\u0001\u0000\u0000\u0000~ \u0001\u0000\u0000\u0000\u007f\u0083\u0005"+
		"\"\u0000\u0000\u0080\u0082\u0007\u0004\u0000\u0000\u0081\u0080\u0001\u0000"+
		"\u0000\u0000\u0082\u0085\u0001\u0000\u0000\u0000\u0083\u0081\u0001\u0000"+
		"\u0000\u0000\u0083\u0084\u0001\u0000\u0000\u0000\u0084\u0086\u0001\u0000"+
		"\u0000\u0000\u0085\u0083\u0001\u0000\u0000\u0000\u0086\u0087\u0005\"\u0000"+
		"\u0000\u0087\"\u0001\u0000\u0000\u0000\b\u0000hnsx}\u0081\u0083\u0001"+
		"\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}