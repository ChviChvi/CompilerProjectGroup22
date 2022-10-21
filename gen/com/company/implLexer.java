// Generated from C:/Users/Christiaan Vink/IdeaProjects/CompilerProjectGroup22/src/com/company\impl.g4 by ANTLR 4.10.1
package com.company;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class implLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, Reset=4, WHITESPACE=5, COMMENT=6, ARROW=7, LONGCOMMENT=8;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "Reset", "WHITESPACE", "COMMENT", "ARROW", "LONGCOMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'1'", "'0'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "Reset", "WHITESPACE", "COMMENT", "ARROW", "LONGCOMMENT"
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


	public implLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "impl.g4"; }

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
		"\u0004\u0000\bG\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0004\u0004\u001b\b\u0004"+
		"\u000b\u0004\f\u0004\u001c\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0005\u0005%\b\u0005\n\u0005\f\u0005(\t\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0004\u00078\b\u0007\u000b\u0007\f\u00079\u0001"+
		"\u0007\u0001\u0007\u0005\u0007>\b\u0007\n\u0007\f\u0007A\t\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0000\u0000\b\u0001"+
		"\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007"+
		"\u000f\b\u0001\u0000\u0005\u0001\u000001\u0003\u0000\t\n\r\r  \u0001\u0000"+
		"\n\n\u0001\u0000**\u0001\u0000//K\u0000\u0001\u0001\u0000\u0000\u0000"+
		"\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000"+
		"\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000"+
		"\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f"+
		"\u0001\u0000\u0000\u0000\u0001\u0011\u0001\u0000\u0000\u0000\u0003\u0013"+
		"\u0001\u0000\u0000\u0000\u0005\u0015\u0001\u0000\u0000\u0000\u0007\u0017"+
		"\u0001\u0000\u0000\u0000\t\u001a\u0001\u0000\u0000\u0000\u000b \u0001"+
		"\u0000\u0000\u0000\r+\u0001\u0000\u0000\u0000\u000f3\u0001\u0000\u0000"+
		"\u0000\u0011\u0012\u0005=\u0000\u0000\u0012\u0002\u0001\u0000\u0000\u0000"+
		"\u0013\u0014\u00051\u0000\u0000\u0014\u0004\u0001\u0000\u0000\u0000\u0015"+
		"\u0016\u00050\u0000\u0000\u0016\u0006\u0001\u0000\u0000\u0000\u0017\u0018"+
		"\u0007\u0000\u0000\u0000\u0018\b\u0001\u0000\u0000\u0000\u0019\u001b\u0007"+
		"\u0001\u0000\u0000\u001a\u0019\u0001\u0000\u0000\u0000\u001b\u001c\u0001"+
		"\u0000\u0000\u0000\u001c\u001a\u0001\u0000\u0000\u0000\u001c\u001d\u0001"+
		"\u0000\u0000\u0000\u001d\u001e\u0001\u0000\u0000\u0000\u001e\u001f\u0006"+
		"\u0004\u0000\u0000\u001f\n\u0001\u0000\u0000\u0000 !\u0005/\u0000\u0000"+
		"!\"\u0005/\u0000\u0000\"&\u0001\u0000\u0000\u0000#%\b\u0002\u0000\u0000"+
		"$#\u0001\u0000\u0000\u0000%(\u0001\u0000\u0000\u0000&$\u0001\u0000\u0000"+
		"\u0000&\'\u0001\u0000\u0000\u0000\')\u0001\u0000\u0000\u0000(&\u0001\u0000"+
		"\u0000\u0000)*\u0006\u0005\u0000\u0000*\f\u0001\u0000\u0000\u0000+,\u0005"+
		"-\u0000\u0000,-\u0005>\u0000\u0000-.\u0001\u0000\u0000\u0000./\u0005&"+
		"\u0000\u0000/0\u0005&\u0000\u000001\u0001\u0000\u0000\u000012\u0006\u0006"+
		"\u0000\u00002\u000e\u0001\u0000\u0000\u000034\u0005/\u0000\u000045\u0005"+
		"*\u0000\u00005?\u0001\u0000\u0000\u000068\b\u0003\u0000\u000076\u0001"+
		"\u0000\u0000\u000089\u0001\u0000\u0000\u000097\u0001\u0000\u0000\u0000"+
		"9:\u0001\u0000\u0000\u0000:>\u0001\u0000\u0000\u0000;<\u0005*\u0000\u0000"+
		"<>\b\u0004\u0000\u0000=7\u0001\u0000\u0000\u0000=;\u0001\u0000\u0000\u0000"+
		">A\u0001\u0000\u0000\u0000?=\u0001\u0000\u0000\u0000?@\u0001\u0000\u0000"+
		"\u0000@B\u0001\u0000\u0000\u0000A?\u0001\u0000\u0000\u0000BC\u0005*\u0000"+
		"\u0000CD\u0005/\u0000\u0000DE\u0001\u0000\u0000\u0000EF\u0006\u0007\u0000"+
		"\u0000F\u0010\u0001\u0000\u0000\u0000\u0006\u0000\u001c&9=?\u0001\u0006"+
		"\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}