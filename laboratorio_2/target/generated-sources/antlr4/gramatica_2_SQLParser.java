// Generated from gramatica_2_SQL.g4 by ANTLR 4.4
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class gramatica_2_SQLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SELECT=1, DELETE=2, UPDATE=3, ALL=4, DISTINCT=5, FROM=6, WHERE=7, NOT=8, 
		OR=9, AND=10, SET=11, ASC=12, DESC=13, ID=14, ORDER_BY=15, PUNTO_COMA=16, 
		ASTERISCO=17, COMA=18, IGUAL=19, COMILLA=20, WS=21;
	public static final String[] tokenNames = {
		"<INVALID>", "'SELECT'", "'DELETE'", "'UPDATE'", "'ALL'", "'DISTINCT'", 
		"'FROM'", "'WHERE'", "'NOT'", "'OR'", "'AND'", "'SET'", "'ASC'", "'DESC'", 
		"ID", "'ORDER BY'", "';'", "'*'", "','", "'='", "'''", "WS"
	};
	public static final int
		RULE_consulta = 0, RULE_select = 1, RULE_update = 2, RULE_delete = 3, 
		RULE_from = 4, RULE_order_by = 5, RULE_where = 6, RULE_condicion_asc_desc = 7, 
		RULE_nombre_de_campo_coma = 8, RULE_condicion_AND_OR = 9, RULE_condicion_coma = 10, 
		RULE_condicion = 11;
	public static final String[] ruleNames = {
		"consulta", "select", "update", "delete", "from", "order_by", "where", 
		"condicion_asc_desc", "nombre_de_campo_coma", "condicion_AND_OR", "condicion_coma", 
		"condicion"
	};

	@Override
	public String getGrammarFileName() { return "gramatica_2_SQL.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public gramatica_2_SQLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ConsultaContext extends ParserRuleContext {
		public UpdateContext update() {
			return getRuleContext(UpdateContext.class,0);
		}
		public DeleteContext delete() {
			return getRuleContext(DeleteContext.class,0);
		}
		public SelectContext select() {
			return getRuleContext(SelectContext.class,0);
		}
		public ConsultaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_consulta; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramatica_2_SQLListener ) ((gramatica_2_SQLListener)listener).enterConsulta(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramatica_2_SQLListener ) ((gramatica_2_SQLListener)listener).exitConsulta(this);
		}
	}

	public final ConsultaContext consulta() throws RecognitionException {
		ConsultaContext _localctx = new ConsultaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_consulta);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(27);
			switch (_input.LA(1)) {
			case SELECT:
				{
				setState(24); select();
				}
				break;
			case UPDATE:
				{
				setState(25); update();
				}
				break;
			case DELETE:
				{
				setState(26); delete();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class SelectContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(gramatica_2_SQLParser.ID, 0); }
		public List<Nombre_de_campo_comaContext> nombre_de_campo_coma() {
			return getRuleContexts(Nombre_de_campo_comaContext.class);
		}
		public Nombre_de_campo_comaContext nombre_de_campo_coma(int i) {
			return getRuleContext(Nombre_de_campo_comaContext.class,i);
		}
		public TerminalNode SELECT() { return getToken(gramatica_2_SQLParser.SELECT, 0); }
		public FromContext from() {
			return getRuleContext(FromContext.class,0);
		}
		public TerminalNode DISTINCT() { return getToken(gramatica_2_SQLParser.DISTINCT, 0); }
		public TerminalNode ASTERISCO() { return getToken(gramatica_2_SQLParser.ASTERISCO, 0); }
		public TerminalNode ALL() { return getToken(gramatica_2_SQLParser.ALL, 0); }
		public SelectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramatica_2_SQLListener ) ((gramatica_2_SQLListener)listener).enterSelect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramatica_2_SQLListener ) ((gramatica_2_SQLListener)listener).exitSelect(this);
		}
	}

	public final SelectContext select() throws RecognitionException {
		SelectContext _localctx = new SelectContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_select);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(29); match(SELECT);
			setState(39);
			switch (_input.LA(1)) {
			case ASTERISCO:
				{
				setState(30); match(ASTERISCO);
				}
				break;
			case ALL:
			case DISTINCT:
				{
				{
				setState(31);
				_la = _input.LA(1);
				if ( !(_la==ALL || _la==DISTINCT) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				{
				setState(35);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(32); nombre_de_campo_coma();
						}
						} 
					}
					setState(37);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
				}
				setState(38); match(ID);
				}
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(41); from();
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
		public TerminalNode ID() { return getToken(gramatica_2_SQLParser.ID, 0); }
		public CondicionContext condicion() {
			return getRuleContext(CondicionContext.class,0);
		}
		public TerminalNode UPDATE() { return getToken(gramatica_2_SQLParser.UPDATE, 0); }
		public WhereContext where() {
			return getRuleContext(WhereContext.class,0);
		}
		public TerminalNode SET() { return getToken(gramatica_2_SQLParser.SET, 0); }
		public Condicion_comaContext condicion_coma(int i) {
			return getRuleContext(Condicion_comaContext.class,i);
		}
		public List<Condicion_comaContext> condicion_coma() {
			return getRuleContexts(Condicion_comaContext.class);
		}
		public UpdateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_update; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramatica_2_SQLListener ) ((gramatica_2_SQLListener)listener).enterUpdate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramatica_2_SQLListener ) ((gramatica_2_SQLListener)listener).exitUpdate(this);
		}
	}

	public final UpdateContext update() throws RecognitionException {
		UpdateContext _localctx = new UpdateContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_update);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(43); match(UPDATE);
			setState(44); match(ID);
			setState(45); match(SET);
			setState(49);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(46); condicion_coma();
					}
					} 
				}
				setState(51);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			setState(52); condicion();
			setState(53); where();
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

	public static class DeleteContext extends ParserRuleContext {
		public TerminalNode DELETE() { return getToken(gramatica_2_SQLParser.DELETE, 0); }
		public FromContext from() {
			return getRuleContext(FromContext.class,0);
		}
		public DeleteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delete; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramatica_2_SQLListener ) ((gramatica_2_SQLListener)listener).enterDelete(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramatica_2_SQLListener ) ((gramatica_2_SQLListener)listener).exitDelete(this);
		}
	}

	public final DeleteContext delete() throws RecognitionException {
		DeleteContext _localctx = new DeleteContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_delete);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55); match(DELETE);
			setState(56); from();
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

	public static class FromContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(gramatica_2_SQLParser.ID, 0); }
		public WhereContext where() {
			return getRuleContext(WhereContext.class,0);
		}
		public Order_byContext order_by() {
			return getRuleContext(Order_byContext.class,0);
		}
		public TerminalNode FROM() { return getToken(gramatica_2_SQLParser.FROM, 0); }
		public TerminalNode PUNTO_COMA() { return getToken(gramatica_2_SQLParser.PUNTO_COMA, 0); }
		public FromContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_from; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramatica_2_SQLListener ) ((gramatica_2_SQLListener)listener).enterFrom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramatica_2_SQLListener ) ((gramatica_2_SQLListener)listener).exitFrom(this);
		}
	}

	public final FromContext from() throws RecognitionException {
		FromContext _localctx = new FromContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_from);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58); match(FROM);
			setState(59); match(ID);
			setState(63);
			switch (_input.LA(1)) {
			case PUNTO_COMA:
				{
				setState(60); match(PUNTO_COMA);
				}
				break;
			case ORDER_BY:
				{
				setState(61); order_by();
				}
				break;
			case WHERE:
				{
				setState(62); where();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Order_byContext extends ParserRuleContext {
		public List<Nombre_de_campo_comaContext> nombre_de_campo_coma() {
			return getRuleContexts(Nombre_de_campo_comaContext.class);
		}
		public Condicion_asc_descContext condicion_asc_desc() {
			return getRuleContext(Condicion_asc_descContext.class,0);
		}
		public Nombre_de_campo_comaContext nombre_de_campo_coma(int i) {
			return getRuleContext(Nombre_de_campo_comaContext.class,i);
		}
		public TerminalNode ORDER_BY() { return getToken(gramatica_2_SQLParser.ORDER_BY, 0); }
		public Order_byContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_order_by; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramatica_2_SQLListener ) ((gramatica_2_SQLListener)listener).enterOrder_by(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramatica_2_SQLListener ) ((gramatica_2_SQLListener)listener).exitOrder_by(this);
		}
	}

	public final Order_byContext order_by() throws RecognitionException {
		Order_byContext _localctx = new Order_byContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_order_by);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(65); match(ORDER_BY);
			setState(69);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(66); nombre_de_campo_coma();
					}
					} 
				}
				setState(71);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			setState(72); condicion_asc_desc();
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

	public static class WhereContext extends ParserRuleContext {
		public List<TerminalNode> NOT() { return getTokens(gramatica_2_SQLParser.NOT); }
		public Condicion_AND_ORContext condicion_AND_OR(int i) {
			return getRuleContext(Condicion_AND_ORContext.class,i);
		}
		public CondicionContext condicion() {
			return getRuleContext(CondicionContext.class,0);
		}
		public TerminalNode WHERE() { return getToken(gramatica_2_SQLParser.WHERE, 0); }
		public List<Condicion_AND_ORContext> condicion_AND_OR() {
			return getRuleContexts(Condicion_AND_ORContext.class);
		}
		public TerminalNode PUNTO_COMA() { return getToken(gramatica_2_SQLParser.PUNTO_COMA, 0); }
		public TerminalNode NOT(int i) {
			return getToken(gramatica_2_SQLParser.NOT, i);
		}
		public WhereContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_where; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramatica_2_SQLListener ) ((gramatica_2_SQLListener)listener).enterWhere(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramatica_2_SQLListener ) ((gramatica_2_SQLListener)listener).exitWhere(this);
		}
	}

	public final WhereContext where() throws RecognitionException {
		WhereContext _localctx = new WhereContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_where);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(74); match(WHERE);
			setState(78);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NOT) {
				{
				{
				setState(75); match(NOT);
				}
				}
				setState(80);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(84);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(81); condicion_AND_OR();
					}
					} 
				}
				setState(86);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			setState(87); condicion();
			setState(88); match(PUNTO_COMA);
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

	public static class Condicion_asc_descContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(gramatica_2_SQLParser.ID, 0); }
		public TerminalNode ASC() { return getToken(gramatica_2_SQLParser.ASC, 0); }
		public TerminalNode PUNTO_COMA() { return getToken(gramatica_2_SQLParser.PUNTO_COMA, 0); }
		public TerminalNode DESC() { return getToken(gramatica_2_SQLParser.DESC, 0); }
		public Condicion_asc_descContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicion_asc_desc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramatica_2_SQLListener ) ((gramatica_2_SQLListener)listener).enterCondicion_asc_desc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramatica_2_SQLListener ) ((gramatica_2_SQLListener)listener).exitCondicion_asc_desc(this);
		}
	}

	public final Condicion_asc_descContext condicion_asc_desc() throws RecognitionException {
		Condicion_asc_descContext _localctx = new Condicion_asc_descContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_condicion_asc_desc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90); match(ID);
			setState(91);
			_la = _input.LA(1);
			if ( !(_la==ASC || _la==DESC) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(92); match(PUNTO_COMA);
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

	public static class Nombre_de_campo_comaContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(gramatica_2_SQLParser.ID, 0); }
		public TerminalNode COMA() { return getToken(gramatica_2_SQLParser.COMA, 0); }
		public Nombre_de_campo_comaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nombre_de_campo_coma; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramatica_2_SQLListener ) ((gramatica_2_SQLListener)listener).enterNombre_de_campo_coma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramatica_2_SQLListener ) ((gramatica_2_SQLListener)listener).exitNombre_de_campo_coma(this);
		}
	}

	public final Nombre_de_campo_comaContext nombre_de_campo_coma() throws RecognitionException {
		Nombre_de_campo_comaContext _localctx = new Nombre_de_campo_comaContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_nombre_de_campo_coma);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94); match(ID);
			setState(95); match(COMA);
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

	public static class Condicion_AND_ORContext extends ParserRuleContext {
		public CondicionContext condicion() {
			return getRuleContext(CondicionContext.class,0);
		}
		public TerminalNode AND() { return getToken(gramatica_2_SQLParser.AND, 0); }
		public TerminalNode OR() { return getToken(gramatica_2_SQLParser.OR, 0); }
		public Condicion_AND_ORContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicion_AND_OR; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramatica_2_SQLListener ) ((gramatica_2_SQLListener)listener).enterCondicion_AND_OR(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramatica_2_SQLListener ) ((gramatica_2_SQLListener)listener).exitCondicion_AND_OR(this);
		}
	}

	public final Condicion_AND_ORContext condicion_AND_OR() throws RecognitionException {
		Condicion_AND_ORContext _localctx = new Condicion_AND_ORContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_condicion_AND_OR);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97); condicion();
			setState(98);
			_la = _input.LA(1);
			if ( !(_la==OR || _la==AND) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class Condicion_comaContext extends ParserRuleContext {
		public CondicionContext condicion() {
			return getRuleContext(CondicionContext.class,0);
		}
		public TerminalNode COMA() { return getToken(gramatica_2_SQLParser.COMA, 0); }
		public Condicion_comaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicion_coma; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramatica_2_SQLListener ) ((gramatica_2_SQLListener)listener).enterCondicion_coma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramatica_2_SQLListener ) ((gramatica_2_SQLListener)listener).exitCondicion_coma(this);
		}
	}

	public final Condicion_comaContext condicion_coma() throws RecognitionException {
		Condicion_comaContext _localctx = new Condicion_comaContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_condicion_coma);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100); condicion();
			setState(101); match(COMA);
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
		public List<TerminalNode> ID() { return getTokens(gramatica_2_SQLParser.ID); }
		public TerminalNode COMILLA(int i) {
			return getToken(gramatica_2_SQLParser.COMILLA, i);
		}
		public TerminalNode ID(int i) {
			return getToken(gramatica_2_SQLParser.ID, i);
		}
		public List<TerminalNode> COMILLA() { return getTokens(gramatica_2_SQLParser.COMILLA); }
		public TerminalNode IGUAL() { return getToken(gramatica_2_SQLParser.IGUAL, 0); }
		public CondicionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramatica_2_SQLListener ) ((gramatica_2_SQLListener)listener).enterCondicion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramatica_2_SQLListener ) ((gramatica_2_SQLListener)listener).exitCondicion(this);
		}
	}

	public final CondicionContext condicion() throws RecognitionException {
		CondicionContext _localctx = new CondicionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_condicion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103); match(ID);
			setState(104); match(IGUAL);
			setState(105); match(COMILLA);
			setState(106); match(ID);
			setState(107); match(COMILLA);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\27p\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\4\r\t\r\3\2\3\2\3\2\5\2\36\n\2\3\3\3\3\3\3\3\3\7\3$\n\3\f\3\16"+
		"\3\'\13\3\3\3\5\3*\n\3\3\3\3\3\3\4\3\4\3\4\3\4\7\4\62\n\4\f\4\16\4\65"+
		"\13\4\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\5\6B\n\6\3\7\3\7\7\7"+
		"F\n\7\f\7\16\7I\13\7\3\7\3\7\3\b\3\b\7\bO\n\b\f\b\16\bR\13\b\3\b\7\bU"+
		"\n\b\f\b\16\bX\13\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13"+
		"\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\2\2\16\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\2\5\3\2\6\7\3\2\16\17\3\2\13\fm\2\35\3\2\2\2\4\37\3\2\2\2"+
		"\6-\3\2\2\2\b9\3\2\2\2\n<\3\2\2\2\fC\3\2\2\2\16L\3\2\2\2\20\\\3\2\2\2"+
		"\22`\3\2\2\2\24c\3\2\2\2\26f\3\2\2\2\30i\3\2\2\2\32\36\5\4\3\2\33\36\5"+
		"\6\4\2\34\36\5\b\5\2\35\32\3\2\2\2\35\33\3\2\2\2\35\34\3\2\2\2\36\3\3"+
		"\2\2\2\37)\7\3\2\2 *\7\23\2\2!%\t\2\2\2\"$\5\22\n\2#\"\3\2\2\2$\'\3\2"+
		"\2\2%#\3\2\2\2%&\3\2\2\2&(\3\2\2\2\'%\3\2\2\2(*\7\20\2\2) \3\2\2\2)!\3"+
		"\2\2\2*+\3\2\2\2+,\5\n\6\2,\5\3\2\2\2-.\7\5\2\2./\7\20\2\2/\63\7\r\2\2"+
		"\60\62\5\26\f\2\61\60\3\2\2\2\62\65\3\2\2\2\63\61\3\2\2\2\63\64\3\2\2"+
		"\2\64\66\3\2\2\2\65\63\3\2\2\2\66\67\5\30\r\2\678\5\16\b\28\7\3\2\2\2"+
		"9:\7\4\2\2:;\5\n\6\2;\t\3\2\2\2<=\7\b\2\2=A\7\20\2\2>B\7\22\2\2?B\5\f"+
		"\7\2@B\5\16\b\2A>\3\2\2\2A?\3\2\2\2A@\3\2\2\2B\13\3\2\2\2CG\7\21\2\2D"+
		"F\5\22\n\2ED\3\2\2\2FI\3\2\2\2GE\3\2\2\2GH\3\2\2\2HJ\3\2\2\2IG\3\2\2\2"+
		"JK\5\20\t\2K\r\3\2\2\2LP\7\t\2\2MO\7\n\2\2NM\3\2\2\2OR\3\2\2\2PN\3\2\2"+
		"\2PQ\3\2\2\2QV\3\2\2\2RP\3\2\2\2SU\5\24\13\2TS\3\2\2\2UX\3\2\2\2VT\3\2"+
		"\2\2VW\3\2\2\2WY\3\2\2\2XV\3\2\2\2YZ\5\30\r\2Z[\7\22\2\2[\17\3\2\2\2\\"+
		"]\7\20\2\2]^\t\3\2\2^_\7\22\2\2_\21\3\2\2\2`a\7\20\2\2ab\7\24\2\2b\23"+
		"\3\2\2\2cd\5\30\r\2de\t\4\2\2e\25\3\2\2\2fg\5\30\r\2gh\7\24\2\2h\27\3"+
		"\2\2\2ij\7\20\2\2jk\7\25\2\2kl\7\26\2\2lm\7\20\2\2mn\7\26\2\2n\31\3\2"+
		"\2\2\n\35%)\63AGPV";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}