// Generated from /Users/isabelcruz/Desktop/compilers/antlr/LittleDuck.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LittleDuckParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, ID=24, STRING=25, 
		CTE_I=26, CTE_F=27, WHITESPACE=28;
	public static final int
		RULE_program = 0, RULE_varsRule = 1, RULE_var1 = 2, RULE_var2 = 3, RULE_var3 = 4, 
		RULE_bloque = 5, RULE_estatuto = 6, RULE_asignacion = 7, RULE_condicion = 8, 
		RULE_cond1 = 9, RULE_expresion = 10, RULE_expr1 = 11, RULE_expr2 = 12, 
		RULE_exp = 13, RULE_exp1 = 14, RULE_termino = 15, RULE_term1 = 16, RULE_tipo = 17, 
		RULE_escritura = 18, RULE_print1 = 19, RULE_print2 = 20, RULE_factor = 21, 
		RULE_var_cte = 22;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "varsRule", "var1", "var2", "var3", "bloque", "estatuto", 
			"asignacion", "condicion", "cond1", "expresion", "expr1", "expr2", "exp", 
			"exp1", "termino", "term1", "tipo", "escritura", "print1", "print2", 
			"factor", "var_cte"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'program'", "':'", "'var'", "';'", "','", "'ID'", "'{'", "'}'", 
			"'='", "'if'", "'('", "')'", "'else'", "'<'", "'>'", "'<>'", "'+'", "'-'", 
			"'*'", "'/'", "'int'", "'float'", "'print'", null, null, "'i'", "'f'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"ID", "STRING", "CTE_I", "CTE_F", "WHITESPACE"
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
	public String getGrammarFileName() { return "LittleDuck.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LittleDuckParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(LittleDuckParser.ID, 0); }
		public VarsRuleContext varsRule() {
			return getRuleContext(VarsRuleContext.class,0);
		}
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public TerminalNode EOF() { return getToken(LittleDuckParser.EOF, 0); }
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			match(T__0);
			setState(47);
			match(ID);
			setState(48);
			match(T__1);
			setState(49);
			varsRule();
			setState(50);
			bloque();
			setState(51);
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

	public static class VarsRuleContext extends ParserRuleContext {
		public Var1Context var1() {
			return getRuleContext(Var1Context.class,0);
		}
		public VarsRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varsRule; }
	}

	public final VarsRuleContext varsRule() throws RecognitionException {
		VarsRuleContext _localctx = new VarsRuleContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_varsRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			match(T__2);
			setState(54);
			var1();
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

	public static class Var1Context extends ParserRuleContext {
		public TerminalNode ID() { return getToken(LittleDuckParser.ID, 0); }
		public Var2Context var2() {
			return getRuleContext(Var2Context.class,0);
		}
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public Var3Context var3() {
			return getRuleContext(Var3Context.class,0);
		}
		public Var1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var1; }
	}

	public final Var1Context var1() throws RecognitionException {
		Var1Context _localctx = new Var1Context(_ctx, getState());
		enterRule(_localctx, 4, RULE_var1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			match(ID);
			setState(57);
			var2();
			setState(58);
			match(T__1);
			setState(59);
			tipo();
			setState(60);
			match(T__3);
			setState(61);
			var3();
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

	public static class Var2Context extends ParserRuleContext {
		public Var2Context var2() {
			return getRuleContext(Var2Context.class,0);
		}
		public Var2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var2; }
	}

	public final Var2Context var2() throws RecognitionException {
		Var2Context _localctx = new Var2Context(_ctx, getState());
		enterRule(_localctx, 6, RULE_var2);
		try {
			setState(67);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(63);
				match(T__4);
				setState(64);
				match(T__5);
				setState(65);
				var2();
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class Var3Context extends ParserRuleContext {
		public Var1Context var1() {
			return getRuleContext(Var1Context.class,0);
		}
		public Var3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var3; }
	}

	public final Var3Context var3() throws RecognitionException {
		Var3Context _localctx = new Var3Context(_ctx, getState());
		enterRule(_localctx, 8, RULE_var3);
		try {
			setState(71);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(70);
				var1();
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

	public static class BloqueContext extends ParserRuleContext {
		public List<EstatutoContext> estatuto() {
			return getRuleContexts(EstatutoContext.class);
		}
		public EstatutoContext estatuto(int i) {
			return getRuleContext(EstatutoContext.class,i);
		}
		public BloqueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloque; }
	}

	public final BloqueContext bloque() throws RecognitionException {
		BloqueContext _localctx = new BloqueContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_bloque);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			match(T__6);
			setState(77);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__22) | (1L << ID))) != 0)) {
				{
				{
				setState(74);
				estatuto();
				}
				}
				setState(79);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(80);
			match(T__7);
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

	public static class EstatutoContext extends ParserRuleContext {
		public AsignacionContext asignacion() {
			return getRuleContext(AsignacionContext.class,0);
		}
		public CondicionContext condicion() {
			return getRuleContext(CondicionContext.class,0);
		}
		public EscrituraContext escritura() {
			return getRuleContext(EscrituraContext.class,0);
		}
		public EstatutoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_estatuto; }
	}

	public final EstatutoContext estatuto() throws RecognitionException {
		EstatutoContext _localctx = new EstatutoContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_estatuto);
		try {
			setState(85);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(82);
				asignacion();
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 2);
				{
				setState(83);
				condicion();
				}
				break;
			case T__22:
				enterOuterAlt(_localctx, 3);
				{
				setState(84);
				escritura();
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

	public static class AsignacionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(LittleDuckParser.ID, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public AsignacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignacion; }
	}

	public final AsignacionContext asignacion() throws RecognitionException {
		AsignacionContext _localctx = new AsignacionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_asignacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			match(ID);
			setState(88);
			match(T__8);
			setState(89);
			expresion();
			setState(90);
			match(T__3);
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

	public static class CondicionContext extends ParserRuleContext {
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public Cond1Context cond1() {
			return getRuleContext(Cond1Context.class,0);
		}
		public CondicionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicion; }
	}

	public final CondicionContext condicion() throws RecognitionException {
		CondicionContext _localctx = new CondicionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_condicion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			match(T__9);
			setState(93);
			match(T__10);
			setState(94);
			expresion();
			setState(95);
			match(T__11);
			setState(96);
			bloque();
			setState(97);
			cond1();
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

	public static class Cond1Context extends ParserRuleContext {
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public Cond1Context cond1() {
			return getRuleContext(Cond1Context.class,0);
		}
		public Cond1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cond1; }
	}

	public final Cond1Context cond1() throws RecognitionException {
		Cond1Context _localctx = new Cond1Context(_ctx, getState());
		enterRule(_localctx, 18, RULE_cond1);
		try {
			setState(104);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				enterOuterAlt(_localctx, 1);
				{
				setState(99);
				match(T__3);
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 2);
				{
				setState(100);
				match(T__12);
				setState(101);
				bloque();
				setState(102);
				cond1();
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

	public static class ExpresionContext extends ParserRuleContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public Expr1Context expr1() {
			return getRuleContext(Expr1Context.class,0);
		}
		public ExpresionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresion; }
	}

	public final ExpresionContext expresion() throws RecognitionException {
		ExpresionContext _localctx = new ExpresionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_expresion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			exp();
			setState(107);
			expr1();
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

	public static class Expr1Context extends ParserRuleContext {
		public Expr2Context expr2() {
			return getRuleContext(Expr2Context.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public Expr1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr1; }
	}

	public final Expr1Context expr1() throws RecognitionException {
		Expr1Context _localctx = new Expr1Context(_ctx, getState());
		enterRule(_localctx, 22, RULE_expr1);
		try {
			setState(113);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
			case T__4:
			case T__11:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case T__13:
			case T__14:
			case T__15:
				enterOuterAlt(_localctx, 2);
				{
				setState(110);
				expr2();
				setState(111);
				exp();
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

	public static class Expr2Context extends ParserRuleContext {
		public Expr2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr2; }
	}

	public final Expr2Context expr2() throws RecognitionException {
		Expr2Context _localctx = new Expr2Context(_ctx, getState());
		enterRule(_localctx, 24, RULE_expr2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__14) | (1L << T__15))) != 0)) ) {
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

	public static class ExpContext extends ParserRuleContext {
		public TerminoContext termino() {
			return getRuleContext(TerminoContext.class,0);
		}
		public Exp1Context exp1() {
			return getRuleContext(Exp1Context.class,0);
		}
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
	}

	public final ExpContext exp() throws RecognitionException {
		ExpContext _localctx = new ExpContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_exp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			termino();
			setState(118);
			exp1();
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

	public static class Exp1Context extends ParserRuleContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public Exp1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp1; }
	}

	public final Exp1Context exp1() throws RecognitionException {
		Exp1Context _localctx = new Exp1Context(_ctx, getState());
		enterRule(_localctx, 28, RULE_exp1);
		try {
			setState(125);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
			case T__4:
			case T__11:
			case T__13:
			case T__14:
			case T__15:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 2);
				{
				setState(121);
				match(T__16);
				setState(122);
				exp();
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 3);
				{
				setState(123);
				match(T__17);
				setState(124);
				exp();
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

	public static class TerminoContext extends ParserRuleContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public Term1Context term1() {
			return getRuleContext(Term1Context.class,0);
		}
		public TerminoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termino; }
	}

	public final TerminoContext termino() throws RecognitionException {
		TerminoContext _localctx = new TerminoContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_termino);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			factor();
			setState(128);
			term1();
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

	public static class Term1Context extends ParserRuleContext {
		public TerminoContext termino() {
			return getRuleContext(TerminoContext.class,0);
		}
		public Term1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term1; }
	}

	public final Term1Context term1() throws RecognitionException {
		Term1Context _localctx = new Term1Context(_ctx, getState());
		enterRule(_localctx, 32, RULE_term1);
		int _la;
		try {
			setState(133);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__18:
			case T__19:
				enterOuterAlt(_localctx, 1);
				{
				setState(130);
				_la = _input.LA(1);
				if ( !(_la==T__18 || _la==T__19) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(131);
				termino();
				}
				break;
			case T__3:
			case T__4:
			case T__11:
			case T__13:
			case T__14:
			case T__15:
			case T__16:
			case T__17:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class TipoContext extends ParserRuleContext {
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_tipo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			_la = _input.LA(1);
			if ( !(_la==T__20 || _la==T__21) ) {
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

	public static class EscrituraContext extends ParserRuleContext {
		public Print1Context print1() {
			return getRuleContext(Print1Context.class,0);
		}
		public EscrituraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_escritura; }
	}

	public final EscrituraContext escritura() throws RecognitionException {
		EscrituraContext _localctx = new EscrituraContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_escritura);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			match(T__22);
			setState(138);
			match(T__10);
			setState(139);
			print1();
			setState(140);
			match(T__11);
			setState(141);
			match(T__3);
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

	public static class Print1Context extends ParserRuleContext {
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public Print2Context print2() {
			return getRuleContext(Print2Context.class,0);
		}
		public TerminalNode STRING() { return getToken(LittleDuckParser.STRING, 0); }
		public Print1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print1; }
	}

	public final Print1Context print1() throws RecognitionException {
		Print1Context _localctx = new Print1Context(_ctx, getState());
		enterRule(_localctx, 38, RULE_print1);
		try {
			setState(148);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__10:
			case T__18:
			case T__19:
			case ID:
			case CTE_I:
			case CTE_F:
				enterOuterAlt(_localctx, 1);
				{
				setState(143);
				expresion();
				setState(144);
				print2();
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(146);
				match(STRING);
				setState(147);
				print2();
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

	public static class Print2Context extends ParserRuleContext {
		public Print1Context print1() {
			return getRuleContext(Print1Context.class,0);
		}
		public Print2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print2; }
	}

	public final Print2Context print2() throws RecognitionException {
		Print2Context _localctx = new Print2Context(_ctx, getState());
		enterRule(_localctx, 40, RULE_print2);
		try {
			setState(153);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(150);
				match(T__4);
				setState(151);
				print1();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class FactorContext extends ParserRuleContext {
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public Var_cteContext var_cte() {
			return getRuleContext(Var_cteContext.class,0);
		}
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_factor);
		int _la;
		try {
			setState(162);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__10:
				enterOuterAlt(_localctx, 1);
				{
				setState(155);
				match(T__10);
				setState(156);
				expresion();
				setState(157);
				match(T__11);
				}
				break;
			case ID:
			case CTE_I:
			case CTE_F:
				enterOuterAlt(_localctx, 2);
				{
				setState(159);
				var_cte();
				}
				break;
			case T__18:
			case T__19:
				enterOuterAlt(_localctx, 3);
				{
				setState(160);
				_la = _input.LA(1);
				if ( !(_la==T__18 || _la==T__19) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(161);
				var_cte();
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

	public static class Var_cteContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(LittleDuckParser.ID, 0); }
		public TerminalNode CTE_I() { return getToken(LittleDuckParser.CTE_I, 0); }
		public TerminalNode CTE_F() { return getToken(LittleDuckParser.CTE_F, 0); }
		public Var_cteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_cte; }
	}

	public final Var_cteContext var_cte() throws RecognitionException {
		Var_cteContext _localctx = new Var_cteContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_var_cte);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << CTE_I) | (1L << CTE_F))) != 0)) ) {
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\36\u00a9\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5"+
		"\3\5\5\5F\n\5\3\6\3\6\5\6J\n\6\3\7\3\7\7\7N\n\7\f\7\16\7Q\13\7\3\7\3\7"+
		"\3\b\3\b\3\b\5\bX\n\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\13\3\13\3\13\3\13\3\13\5\13k\n\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\5\rt"+
		"\n\r\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\5\20\u0080\n\20"+
		"\3\21\3\21\3\21\3\22\3\22\3\22\5\22\u0088\n\22\3\23\3\23\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\5\25\u0097\n\25\3\26\3\26\3\26"+
		"\5\26\u009c\n\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u00a5\n\27\3"+
		"\30\3\30\3\30\2\2\31\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\2"+
		"\6\3\2\20\22\3\2\25\26\3\2\27\30\4\2\32\32\34\35\2\u009f\2\60\3\2\2\2"+
		"\4\67\3\2\2\2\6:\3\2\2\2\bE\3\2\2\2\nI\3\2\2\2\fK\3\2\2\2\16W\3\2\2\2"+
		"\20Y\3\2\2\2\22^\3\2\2\2\24j\3\2\2\2\26l\3\2\2\2\30s\3\2\2\2\32u\3\2\2"+
		"\2\34w\3\2\2\2\36\177\3\2\2\2 \u0081\3\2\2\2\"\u0087\3\2\2\2$\u0089\3"+
		"\2\2\2&\u008b\3\2\2\2(\u0096\3\2\2\2*\u009b\3\2\2\2,\u00a4\3\2\2\2.\u00a6"+
		"\3\2\2\2\60\61\7\3\2\2\61\62\7\32\2\2\62\63\7\4\2\2\63\64\5\4\3\2\64\65"+
		"\5\f\7\2\65\66\7\2\2\3\66\3\3\2\2\2\678\7\5\2\289\5\6\4\29\5\3\2\2\2:"+
		";\7\32\2\2;<\5\b\5\2<=\7\4\2\2=>\5$\23\2>?\7\6\2\2?@\5\n\6\2@\7\3\2\2"+
		"\2AB\7\7\2\2BC\7\b\2\2CF\5\b\5\2DF\3\2\2\2EA\3\2\2\2ED\3\2\2\2F\t\3\2"+
		"\2\2GJ\3\2\2\2HJ\5\6\4\2IG\3\2\2\2IH\3\2\2\2J\13\3\2\2\2KO\7\t\2\2LN\5"+
		"\16\b\2ML\3\2\2\2NQ\3\2\2\2OM\3\2\2\2OP\3\2\2\2PR\3\2\2\2QO\3\2\2\2RS"+
		"\7\n\2\2S\r\3\2\2\2TX\5\20\t\2UX\5\22\n\2VX\5&\24\2WT\3\2\2\2WU\3\2\2"+
		"\2WV\3\2\2\2X\17\3\2\2\2YZ\7\32\2\2Z[\7\13\2\2[\\\5\26\f\2\\]\7\6\2\2"+
		"]\21\3\2\2\2^_\7\f\2\2_`\7\r\2\2`a\5\26\f\2ab\7\16\2\2bc\5\f\7\2cd\5\24"+
		"\13\2d\23\3\2\2\2ek\7\6\2\2fg\7\17\2\2gh\5\f\7\2hi\5\24\13\2ik\3\2\2\2"+
		"je\3\2\2\2jf\3\2\2\2k\25\3\2\2\2lm\5\34\17\2mn\5\30\r\2n\27\3\2\2\2ot"+
		"\3\2\2\2pq\5\32\16\2qr\5\34\17\2rt\3\2\2\2so\3\2\2\2sp\3\2\2\2t\31\3\2"+
		"\2\2uv\t\2\2\2v\33\3\2\2\2wx\5 \21\2xy\5\36\20\2y\35\3\2\2\2z\u0080\3"+
		"\2\2\2{|\7\23\2\2|\u0080\5\34\17\2}~\7\24\2\2~\u0080\5\34\17\2\177z\3"+
		"\2\2\2\177{\3\2\2\2\177}\3\2\2\2\u0080\37\3\2\2\2\u0081\u0082\5,\27\2"+
		"\u0082\u0083\5\"\22\2\u0083!\3\2\2\2\u0084\u0085\t\3\2\2\u0085\u0088\5"+
		" \21\2\u0086\u0088\3\2\2\2\u0087\u0084\3\2\2\2\u0087\u0086\3\2\2\2\u0088"+
		"#\3\2\2\2\u0089\u008a\t\4\2\2\u008a%\3\2\2\2\u008b\u008c\7\31\2\2\u008c"+
		"\u008d\7\r\2\2\u008d\u008e\5(\25\2\u008e\u008f\7\16\2\2\u008f\u0090\7"+
		"\6\2\2\u0090\'\3\2\2\2\u0091\u0092\5\26\f\2\u0092\u0093\5*\26\2\u0093"+
		"\u0097\3\2\2\2\u0094\u0095\7\33\2\2\u0095\u0097\5*\26\2\u0096\u0091\3"+
		"\2\2\2\u0096\u0094\3\2\2\2\u0097)\3\2\2\2\u0098\u0099\7\7\2\2\u0099\u009c"+
		"\5(\25\2\u009a\u009c\3\2\2\2\u009b\u0098\3\2\2\2\u009b\u009a\3\2\2\2\u009c"+
		"+\3\2\2\2\u009d\u009e\7\r\2\2\u009e\u009f\5\26\f\2\u009f\u00a0\7\16\2"+
		"\2\u00a0\u00a5\3\2\2\2\u00a1\u00a5\5.\30\2\u00a2\u00a3\t\3\2\2\u00a3\u00a5"+
		"\5.\30\2\u00a4\u009d\3\2\2\2\u00a4\u00a1\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a5"+
		"-\3\2\2\2\u00a6\u00a7\t\5\2\2\u00a7/\3\2\2\2\rEIOWjs\177\u0087\u0096\u009b"+
		"\u00a4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}