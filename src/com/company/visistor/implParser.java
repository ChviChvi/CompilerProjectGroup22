// Generated from C:/Users/Christiaan Vink/IdeaProjects/CompilerProjectGroup22/src/com/company\impl.g4 by ANTLR 4.10.1
package com.company.visistor;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class implParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, Reset=4, WHITESPACE=5, COMMENT=6, ARROW=7, LONGCOMMENT=8;
	public static final int
		RULE_start = 0, RULE_reset = 1, RULE_oscillator = 2, RULE_expr = 3, RULE_latch = 4, 
		RULE_oscillatorM = 5, RULE_and = 6, RULE_input = 7, RULE_update = 8, RULE_simulate = 9;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "reset", "oscillator", "expr", "latch", "oscillatorM", "and", 
			"input", "update", "simulate"
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

	@Override
	public String getGrammarFileName() { return "impl.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public implParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class StartContext extends ParserRuleContext {
		public ResetContext reset() {
			return getRuleContext(ResetContext.class,0);
		}
		public TerminalNode EOF() { return getToken(implParser.EOF, 0); }
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).exitStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof implVisitor ) return ((implVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(20);
			reset();
			setState(21);
			match(EOF);
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

	public static class ResetContext extends ParserRuleContext {
		public TerminalNode Reset() { return getToken(implParser.Reset, 0); }
		public List<OscillatorContext> oscillator() {
			return getRuleContexts(OscillatorContext.class);
		}
		public OscillatorContext oscillator(int i) {
			return getRuleContext(OscillatorContext.class,i);
		}
		public ResetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reset; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).enterReset(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).exitReset(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof implVisitor ) return ((implVisitor<? extends T>)visitor).visitReset(this);
			else return visitor.visitChildren(this);
		}
	}

	public final void reset() throws RecognitionException {
		ResetContext _localctx = new ResetContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_reset);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Reset) {
				{
				setState(23);
				match(Reset);
				}
			}

			setState(27); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(26);
				oscillator();
				}
				}
				setState(29); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2))) != 0) );
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
		//return _localctx;
	}

	public static class OscillatorContext extends ParserRuleContext {
		public InputContext input() {
			return getRuleContext(InputContext.class,0);
		}
		public OscillatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oscillator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).enterOscillator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).exitOscillator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof implVisitor ) return ((implVisitor<? extends T>)visitor).visitOscillator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OscillatorContext oscillator() throws RecognitionException {
		OscillatorContext _localctx = new OscillatorContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_oscillator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31);
			input();
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

	public static class ExprContext extends ParserRuleContext {
		public InputContext input() {
			return getRuleContext(InputContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof implVisitor ) return ((implVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33);
			input();
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

	public static class LatchContext extends ParserRuleContext {
		public OscillatorMContext oscillatorM() {
			return getRuleContext(OscillatorMContext.class,0);
		}
		public LatchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_latch; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).enterLatch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).exitLatch(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof implVisitor ) return ((implVisitor<? extends T>)visitor).visitLatch(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LatchContext latch() throws RecognitionException {
		LatchContext _localctx = new LatchContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_latch);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			oscillatorM();
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

	public static class OscillatorMContext extends ParserRuleContext {
		public OscillatorMContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oscillatorM; }
	 
		public OscillatorMContext() { }
		public void copyFrom(OscillatorMContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class OutputContext extends OscillatorMContext {
		public SimulateContext simulate() {
			return getRuleContext(SimulateContext.class,0);
		}
		public OutputContext(OscillatorMContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).enterOutput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).exitOutput(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof implVisitor ) return ((implVisitor<? extends T>)visitor).visitOutput(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OscillatorMContext oscillatorM() throws RecognitionException {
		OscillatorMContext _localctx = new OscillatorMContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_oscillatorM);
		try {
			_localctx = new OutputContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			simulate();
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

	public static class AndContext extends ParserRuleContext {
		public AndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_and; }
	 
		public AndContext() { }
		public void copyFrom(AndContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ANDContext extends AndContext {
		public ANDContext(AndContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).enterAND(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).exitAND(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof implVisitor ) return ((implVisitor<? extends T>)visitor).visitAND(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AndContext and() throws RecognitionException {
		AndContext _localctx = new AndContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_and);
		try {
			_localctx = new ANDContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
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

	public static class InputContext extends ParserRuleContext {
		public InputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input; }
	 
		public InputContext() { }
		public void copyFrom(InputContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ZEROContext extends InputContext {
		public Token eq;
		public OscillatorMContext oscillatorM() {
			return getRuleContext(OscillatorMContext.class,0);
		}
		public ZEROContext(InputContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).enterZERO(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).exitZERO(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof implVisitor ) return ((implVisitor<? extends T>)visitor).visitZERO(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ONEContext extends InputContext {
		public Token eq;
		public OscillatorMContext oscillatorM() {
			return getRuleContext(OscillatorMContext.class,0);
		}
		public ONEContext(InputContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).enterONE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).exitONE(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof implVisitor ) return ((implVisitor<? extends T>)visitor).visitONE(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InputContext input() throws RecognitionException {
		InputContext _localctx = new InputContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_input);
		int _la;
		try {
			setState(51);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				_localctx = new ONEContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(42);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(41);
					((ONEContext)_localctx).eq = match(T__0);
					}
				}

				setState(44);
				match(T__1);
				setState(45);
				oscillatorM();
				}
				break;
			case 2:
				_localctx = new ZEROContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(47);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(46);
					((ZEROContext)_localctx).eq = match(T__0);
					}
				}

				setState(49);
				match(T__2);
				setState(50);
				oscillatorM();
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

	public static class UpdateContext extends ParserRuleContext {
		public UpdateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_update; }
	 
		public UpdateContext() { }
		public void copyFrom(UpdateContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CircuitContext extends UpdateContext {
		public CircuitContext(UpdateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).enterCircuit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).exitCircuit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof implVisitor ) return ((implVisitor<? extends T>)visitor).visitCircuit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UpdateContext update() throws RecognitionException {
		UpdateContext _localctx = new UpdateContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_update);
		try {
			_localctx = new CircuitContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
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

	public static class SimulateContext extends ParserRuleContext {
		public SimulateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simulate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).enterSimulate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).exitSimulate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof implVisitor ) return ((implVisitor<? extends T>)visitor).visitSimulate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimulateContext simulate() throws RecognitionException {
		SimulateContext _localctx = new SimulateContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_simulate);
		try {
			enterOuterAlt(_localctx, 1);
			{
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

	public static final String _serializedATN =
		"\u0004\u0001\b:\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0003\u0001\u0019\b\u0001\u0001\u0001\u0004\u0001\u001c\b\u0001\u000b"+
		"\u0001\f\u0001\u001d\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0007\u0003\u0007+\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003"+
		"\u00070\b\u0007\u0001\u0007\u0001\u0007\u0003\u00074\b\u0007\u0001\b\u0001"+
		"\b\u0001\t\u0001\t\u0001\t\u0000\u0000\n\u0000\u0002\u0004\u0006\b\n\f"+
		"\u000e\u0010\u0012\u0000\u00004\u0000\u0014\u0001\u0000\u0000\u0000\u0002"+
		"\u0018\u0001\u0000\u0000\u0000\u0004\u001f\u0001\u0000\u0000\u0000\u0006"+
		"!\u0001\u0000\u0000\u0000\b#\u0001\u0000\u0000\u0000\n%\u0001\u0000\u0000"+
		"\u0000\f\'\u0001\u0000\u0000\u0000\u000e3\u0001\u0000\u0000\u0000\u0010"+
		"5\u0001\u0000\u0000\u0000\u00127\u0001\u0000\u0000\u0000\u0014\u0015\u0003"+
		"\u0002\u0001\u0000\u0015\u0016\u0005\u0000\u0000\u0001\u0016\u0001\u0001"+
		"\u0000\u0000\u0000\u0017\u0019\u0005\u0004\u0000\u0000\u0018\u0017\u0001"+
		"\u0000\u0000\u0000\u0018\u0019\u0001\u0000\u0000\u0000\u0019\u001b\u0001"+
		"\u0000\u0000\u0000\u001a\u001c\u0003\u0004\u0002\u0000\u001b\u001a\u0001"+
		"\u0000\u0000\u0000\u001c\u001d\u0001\u0000\u0000\u0000\u001d\u001b\u0001"+
		"\u0000\u0000\u0000\u001d\u001e\u0001\u0000\u0000\u0000\u001e\u0003\u0001"+
		"\u0000\u0000\u0000\u001f \u0003\u000e\u0007\u0000 \u0005\u0001\u0000\u0000"+
		"\u0000!\"\u0003\u000e\u0007\u0000\"\u0007\u0001\u0000\u0000\u0000#$\u0003"+
		"\n\u0005\u0000$\t\u0001\u0000\u0000\u0000%&\u0003\u0012\t\u0000&\u000b"+
		"\u0001\u0000\u0000\u0000\'(\u0001\u0000\u0000\u0000(\r\u0001\u0000\u0000"+
		"\u0000)+\u0005\u0001\u0000\u0000*)\u0001\u0000\u0000\u0000*+\u0001\u0000"+
		"\u0000\u0000+,\u0001\u0000\u0000\u0000,-\u0005\u0002\u0000\u0000-4\u0003"+
		"\n\u0005\u0000.0\u0005\u0001\u0000\u0000/.\u0001\u0000\u0000\u0000/0\u0001"+
		"\u0000\u0000\u000001\u0001\u0000\u0000\u000012\u0005\u0003\u0000\u0000"+
		"24\u0003\n\u0005\u00003*\u0001\u0000\u0000\u00003/\u0001\u0000\u0000\u0000"+
		"4\u000f\u0001\u0000\u0000\u000056\u0001\u0000\u0000\u00006\u0011\u0001"+
		"\u0000\u0000\u000078\u0001\u0000\u0000\u00008\u0013\u0001\u0000\u0000"+
		"\u0000\u0005\u0018\u001d*/3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}