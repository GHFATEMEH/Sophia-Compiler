// Generated from /Users/zahrayazdani/Documents/courses/compiler/project/2/new codes/src/main/grammar/Sophia.g4 by ANTLR 4.8
package parsers;

    import main.ast.types.*;
    import main.ast.types.functionPointer.*;
    import main.ast.types.list.*;
    import main.ast.types.single.*;
    import main.ast.nodes.*;
    import main.ast.nodes.declaration.*;
    import main.ast.nodes.declaration.classDec.*;
    import main.ast.nodes.declaration.classDec.classMembersDec.*;
    import main.ast.nodes.declaration.variableDec.*;
    import main.ast.nodes.expression.*;
    import main.ast.nodes.expression.operators.*;
    import main.ast.nodes.expression.values.*;
    import main.ast.nodes.expression.values.primitive.*;
    import main.ast.nodes.statement.*;
    import main.ast.nodes.statement.loop.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SophiaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		DEF=1, EXTENDS=2, CLASS=3, PRINT=4, FUNC=5, NEW=6, CONTINUE=7, BREAK=8, 
		RETURN=9, FOREACH=10, IN=11, FOR=12, IF=13, ELSE=14, BOOLEAN=15, STRING=16, 
		INT=17, VOID=18, NULL=19, LIST=20, TRUE=21, FALSE=22, THIS=23, ARROW=24, 
		GREATER_THAN=25, LESS_THAN=26, NOT_EQUAL=27, EQUAL=28, MULT=29, DIVIDE=30, 
		MOD=31, PLUS=32, MINUS=33, AND=34, OR=35, NOT=36, QUESTION_MARK=37, ASSIGN=38, 
		INCREMENT=39, DECREMENT=40, LPAR=41, RPAR=42, LBRACK=43, RBRACK=44, LBRACE=45, 
		RBRACE=46, SHARP=47, COMMA=48, DOT=49, COLON=50, SEMICOLLON=51, INT_VALUE=52, 
		IDENTIFIER=53, STRING_VALUE=54, COMMENT=55, WS=56;
	public static final int
		RULE_sophia = 0, RULE_program = 1, RULE_sophiaClass = 2, RULE_varDeclaration = 3, 
		RULE_method = 4, RULE_constructor = 5, RULE_methodArguments = 6, RULE_variableWithType = 7, 
		RULE_type = 8, RULE_classType = 9, RULE_listType = 10, RULE_listItemsTypes = 11, 
		RULE_listItemType = 12, RULE_functionPointerType = 13, RULE_typesWithComma = 14, 
		RULE_primitiveDataType = 15, RULE_methodBody = 16, RULE_statement = 17, 
		RULE_block = 18, RULE_assignmentStatement = 19, RULE_assignment = 20, 
		RULE_printStatement = 21, RULE_returnStatement = 22, RULE_methodCallStatement = 23, 
		RULE_methodCall = 24, RULE_methodCallArguments = 25, RULE_continueBreakStatement = 26, 
		RULE_forStatement = 27, RULE_foreachStatement = 28, RULE_ifStatement = 29, 
		RULE_expression = 30, RULE_orExpression = 31, RULE_andExpression = 32, 
		RULE_equalityExpression = 33, RULE_relationalExpression = 34, RULE_additiveExpression = 35, 
		RULE_multiplicativeExpression = 36, RULE_preUnaryExpression = 37, RULE_postUnaryExpression = 38, 
		RULE_accessExpression = 39, RULE_otherExpression = 40, RULE_newExpression = 41, 
		RULE_values = 42, RULE_boolValue = 43, RULE_listValue = 44, RULE_identifier = 45;
	private static String[] makeRuleNames() {
		return new String[] {
			"sophia", "program", "sophiaClass", "varDeclaration", "method", "constructor", 
			"methodArguments", "variableWithType", "type", "classType", "listType", 
			"listItemsTypes", "listItemType", "functionPointerType", "typesWithComma", 
			"primitiveDataType", "methodBody", "statement", "block", "assignmentStatement", 
			"assignment", "printStatement", "returnStatement", "methodCallStatement", 
			"methodCall", "methodCallArguments", "continueBreakStatement", "forStatement", 
			"foreachStatement", "ifStatement", "expression", "orExpression", "andExpression", 
			"equalityExpression", "relationalExpression", "additiveExpression", "multiplicativeExpression", 
			"preUnaryExpression", "postUnaryExpression", "accessExpression", "otherExpression", 
			"newExpression", "values", "boolValue", "listValue", "identifier"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'def'", "'extends'", "'class'", "'print'", "'func'", "'new'", 
			"'continue'", "'break'", "'return'", "'foreach'", "'in'", "'for'", "'if'", 
			"'else'", "'bool'", "'string'", "'int'", "'void'", "'null'", "'list'", 
			"'true'", "'false'", "'this'", "'->'", "'>'", "'<'", "'!='", "'=='", 
			"'*'", "'/'", "'%'", "'+'", "'-'", "'&&'", "'||'", "'!'", "'?'", "'='", 
			"'++'", "'--'", "'('", "')'", "'['", "']'", "'{'", "'}'", "'#'", "','", 
			"'.'", "':'", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "DEF", "EXTENDS", "CLASS", "PRINT", "FUNC", "NEW", "CONTINUE", 
			"BREAK", "RETURN", "FOREACH", "IN", "FOR", "IF", "ELSE", "BOOLEAN", "STRING", 
			"INT", "VOID", "NULL", "LIST", "TRUE", "FALSE", "THIS", "ARROW", "GREATER_THAN", 
			"LESS_THAN", "NOT_EQUAL", "EQUAL", "MULT", "DIVIDE", "MOD", "PLUS", "MINUS", 
			"AND", "OR", "NOT", "QUESTION_MARK", "ASSIGN", "INCREMENT", "DECREMENT", 
			"LPAR", "RPAR", "LBRACK", "RBRACK", "LBRACE", "RBRACE", "SHARP", "COMMA", 
			"DOT", "COLON", "SEMICOLLON", "INT_VALUE", "IDENTIFIER", "STRING_VALUE", 
			"COMMENT", "WS"
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
	public String getGrammarFileName() { return "Sophia.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SophiaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class SophiaContext extends ParserRuleContext {
		public Program sophiaProgram;
		public ProgramContext p;
		public TerminalNode EOF() { return getToken(SophiaParser.EOF, 0); }
		public ProgramContext program() {
			return getRuleContext(ProgramContext.class,0);
		}
		public SophiaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sophia; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterSophia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitSophia(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitSophia(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SophiaContext sophia() throws RecognitionException {
		SophiaContext _localctx = new SophiaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_sophia);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			((SophiaContext)_localctx).p = program();
			((SophiaContext)_localctx).sophiaProgram =  ((SophiaContext)_localctx).p.programRet;
			setState(94);
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

	public static class ProgramContext extends ParserRuleContext {
		public Program programRet;
		public SophiaClassContext c;
		public List<SophiaClassContext> sophiaClass() {
			return getRuleContexts(SophiaClassContext.class);
		}
		public SophiaClassContext sophiaClass(int i) {
			return getRuleContext(SophiaClassContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{

			        ((ProgramContext)_localctx).programRet =  new Program();
			        _localctx.programRet.setLine(1);
			    
			setState(102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CLASS) {
				{
				{
				setState(97);
				((ProgramContext)_localctx).c = sophiaClass();
				_localctx.programRet.addClass(((ProgramContext)_localctx).c.sophiaClassRet);
				}
				}
				setState(104);
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

	public static class SophiaClassContext extends ParserRuleContext {
		public ClassDeclaration sophiaClassRet;
		public Token c1;
		public IdentifierContext i;
		public VarDeclarationContext v;
		public MethodContext m;
		public ConstructorContext c;
		public TerminalNode LBRACE() { return getToken(SophiaParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(SophiaParser.RBRACE, 0); }
		public TerminalNode CLASS() { return getToken(SophiaParser.CLASS, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode EXTENDS() { return getToken(SophiaParser.EXTENDS, 0); }
		public ConstructorContext constructor() {
			return getRuleContext(ConstructorContext.class,0);
		}
		public List<VarDeclarationContext> varDeclaration() {
			return getRuleContexts(VarDeclarationContext.class);
		}
		public VarDeclarationContext varDeclaration(int i) {
			return getRuleContext(VarDeclarationContext.class,i);
		}
		public List<MethodContext> method() {
			return getRuleContexts(MethodContext.class);
		}
		public MethodContext method(int i) {
			return getRuleContext(MethodContext.class,i);
		}
		public SophiaClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sophiaClass; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterSophiaClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitSophiaClass(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitSophiaClass(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SophiaClassContext sophiaClass() throws RecognitionException {
		SophiaClassContext _localctx = new SophiaClassContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_sophiaClass);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			((SophiaClassContext)_localctx).c1 = match(CLASS);
			setState(106);
			((SophiaClassContext)_localctx).i = identifier();

			        ((SophiaClassContext)_localctx).sophiaClassRet =  new ClassDeclaration(((SophiaClassContext)_localctx).i.identifierRet);
			        _localctx.sophiaClassRet.setLine(((SophiaClassContext)_localctx).c1.getLine());
			    
			setState(112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(108);
				match(EXTENDS);
				setState(109);
				((SophiaClassContext)_localctx).i = identifier();
				_localctx.sophiaClassRet.setParentClassName(((SophiaClassContext)_localctx).i.identifierRet);
				}
			}

			setState(114);
			match(LBRACE);
			setState(150);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				{
				setState(123);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						setState(121);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case IDENTIFIER:
							{
							setState(115);
							((SophiaClassContext)_localctx).v = varDeclaration();

							            FieldDeclaration field = new FieldDeclaration(((SophiaClassContext)_localctx).v.varDeclarationRet);
							            field.setLine(((SophiaClassContext)_localctx).v.varDeclarationRet.getLine());
							            _localctx.sophiaClassRet.addField(field);

							        
							}
							break;
						case DEF:
							{
							setState(118);
							((SophiaClassContext)_localctx).m = method();
							_localctx.sophiaClassRet.addMethod(((SophiaClassContext)_localctx).m.methodRet);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						} 
					}
					setState(125);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				}
				setState(126);
				((SophiaClassContext)_localctx).c = constructor();
				_localctx.sophiaClassRet.setConstructor(((SophiaClassContext)_localctx).c.constructorRet);
				setState(136);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DEF || _la==IDENTIFIER) {
					{
					setState(134);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case IDENTIFIER:
						{
						setState(128);
						((SophiaClassContext)_localctx).v = varDeclaration();

						             FieldDeclaration field = new FieldDeclaration(((SophiaClassContext)_localctx).v.varDeclarationRet);
						             field.setLine(((SophiaClassContext)_localctx).v.varDeclarationRet.getLine());
						             _localctx.sophiaClassRet.addField(field);
						         
						}
						break;
					case DEF:
						{
						setState(131);
						((SophiaClassContext)_localctx).m = method();
						_localctx.sophiaClassRet.addMethod(((SophiaClassContext)_localctx).m.methodRet);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(138);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			case 2:
				{
				{
				setState(147);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DEF || _la==IDENTIFIER) {
					{
					setState(145);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case IDENTIFIER:
						{
						setState(139);
						((SophiaClassContext)_localctx).v = varDeclaration();

						            FieldDeclaration field = new FieldDeclaration(((SophiaClassContext)_localctx).v.varDeclarationRet);
						            field.setLine(((SophiaClassContext)_localctx).v.varDeclarationRet.getLine());
						            _localctx.sophiaClassRet.addField(field);
						         
						}
						break;
					case DEF:
						{
						setState(142);
						((SophiaClassContext)_localctx).m = method();
						_localctx.sophiaClassRet.addMethod(((SophiaClassContext)_localctx).m.methodRet);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(149);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			}
			setState(152);
			match(RBRACE);
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

	public static class VarDeclarationContext extends ParserRuleContext {
		public VarDeclaration varDeclarationRet;
		public IdentifierContext i;
		public TypeContext t;
		public TerminalNode COLON() { return getToken(SophiaParser.COLON, 0); }
		public TerminalNode SEMICOLLON() { return getToken(SophiaParser.SEMICOLLON, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public VarDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterVarDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitVarDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitVarDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDeclarationContext varDeclaration() throws RecognitionException {
		VarDeclarationContext _localctx = new VarDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_varDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			((VarDeclarationContext)_localctx).i = identifier();
			setState(155);
			match(COLON);
			setState(156);
			((VarDeclarationContext)_localctx).t = type();

			        ((VarDeclarationContext)_localctx).varDeclarationRet =  new VarDeclaration(((VarDeclarationContext)_localctx).i.identifierRet, ((VarDeclarationContext)_localctx).t.typeRet);
			        _localctx.varDeclarationRet.setLine(((VarDeclarationContext)_localctx).i.identifierRet.getLine());
			    
			setState(158);
			match(SEMICOLLON);
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

	public static class MethodContext extends ParserRuleContext {
		public MethodDeclaration methodRet;
		public Token d;
		public TypeContext t;
		public IdentifierContext i;
		public MethodArgumentsContext ma;
		public MethodBodyContext mb;
		public TerminalNode LPAR() { return getToken(SophiaParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(SophiaParser.RPAR, 0); }
		public TerminalNode LBRACE() { return getToken(SophiaParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(SophiaParser.RBRACE, 0); }
		public TerminalNode DEF() { return getToken(SophiaParser.DEF, 0); }
		public MethodArgumentsContext methodArguments() {
			return getRuleContext(MethodArgumentsContext.class,0);
		}
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public TerminalNode VOID() { return getToken(SophiaParser.VOID, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public MethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterMethod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitMethod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitMethod(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodContext method() throws RecognitionException {
		MethodContext _localctx = new MethodContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_method);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			((MethodContext)_localctx).d = match(DEF);
			setState(169);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FUNC:
			case BOOLEAN:
			case STRING:
			case INT:
			case LIST:
			case IDENTIFIER:
				{
				setState(161);
				((MethodContext)_localctx).t = type();
				setState(162);
				((MethodContext)_localctx).i = identifier();

				            ((MethodContext)_localctx).methodRet =  new MethodDeclaration(((MethodContext)_localctx).i.identifierRet, ((MethodContext)_localctx).t.typeRet);
				            _localctx.methodRet.setLine(((MethodContext)_localctx).d.getLine());
				            _localctx.methodRet.setDoesReturn(true);
				        
				}
				break;
			case VOID:
				{
				setState(165);
				match(VOID);
				setState(166);
				((MethodContext)_localctx).i = identifier();

				            ((MethodContext)_localctx).methodRet =  new MethodDeclaration(((MethodContext)_localctx).i.identifierRet, new NullType());
				            _localctx.methodRet.setLine(((MethodContext)_localctx).d.getLine());
				            _localctx.methodRet.setDoesReturn(false);
				        
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(171);
			match(LPAR);
			setState(172);
			((MethodContext)_localctx).ma = methodArguments();
			setState(173);
			match(RPAR);
			setState(174);
			match(LBRACE);
			setState(175);
			((MethodContext)_localctx).mb = methodBody();
			setState(176);
			match(RBRACE);

			        _localctx.methodRet.setArgs(((MethodContext)_localctx).ma.methodArgumentsRet);
			        _localctx.methodRet.setBody(((MethodContext)_localctx).mb.methodBodyRetBody);
			        _localctx.methodRet.setLocalVars(((MethodContext)_localctx).mb.methodBodyRetLocalVars);
			   
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

	public static class ConstructorContext extends ParserRuleContext {
		public ConstructorDeclaration constructorRet;
		public Token d;
		public IdentifierContext i;
		public MethodArgumentsContext ma;
		public MethodBodyContext mb;
		public TerminalNode LPAR() { return getToken(SophiaParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(SophiaParser.RPAR, 0); }
		public TerminalNode LBRACE() { return getToken(SophiaParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(SophiaParser.RBRACE, 0); }
		public TerminalNode DEF() { return getToken(SophiaParser.DEF, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public MethodArgumentsContext methodArguments() {
			return getRuleContext(MethodArgumentsContext.class,0);
		}
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public ConstructorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterConstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitConstructor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitConstructor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorContext constructor() throws RecognitionException {
		ConstructorContext _localctx = new ConstructorContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_constructor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			((ConstructorContext)_localctx).d = match(DEF);
			setState(180);
			((ConstructorContext)_localctx).i = identifier();
			setState(181);
			match(LPAR);

			        ((ConstructorContext)_localctx).constructorRet =  new ConstructorDeclaration(((ConstructorContext)_localctx).i.identifierRet);
			        _localctx.constructorRet.setLine(((ConstructorContext)_localctx).d.getLine());
			        _localctx.constructorRet.setDoesReturn(false);
			    
			setState(183);
			((ConstructorContext)_localctx).ma = methodArguments();
			setState(184);
			match(RPAR);
			setState(185);
			match(LBRACE);
			setState(186);
			((ConstructorContext)_localctx).mb = methodBody();
			setState(187);
			match(RBRACE);

			        _localctx.constructorRet.setArgs(((ConstructorContext)_localctx).ma.methodArgumentsRet);
			        _localctx.constructorRet.setBody(((ConstructorContext)_localctx).mb.methodBodyRetBody);
			        _localctx.constructorRet.setLocalVars(((ConstructorContext)_localctx).mb.methodBodyRetLocalVars);
			   
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

	public static class MethodArgumentsContext extends ParserRuleContext {
		public ArrayList<VarDeclaration> methodArgumentsRet;
		public VariableWithTypeContext v;
		public List<VariableWithTypeContext> variableWithType() {
			return getRuleContexts(VariableWithTypeContext.class);
		}
		public VariableWithTypeContext variableWithType(int i) {
			return getRuleContext(VariableWithTypeContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SophiaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SophiaParser.COMMA, i);
		}
		public MethodArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterMethodArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitMethodArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitMethodArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodArgumentsContext methodArguments() throws RecognitionException {
		MethodArgumentsContext _localctx = new MethodArgumentsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_methodArguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((MethodArgumentsContext)_localctx).methodArgumentsRet =  new ArrayList<>();
			setState(202);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(191);
				((MethodArgumentsContext)_localctx).v = variableWithType();
				_localctx.methodArgumentsRet.add(((MethodArgumentsContext)_localctx).v.variableWithTypeRet);
				setState(199);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(193);
					match(COMMA);
					setState(194);
					((MethodArgumentsContext)_localctx).v = variableWithType();
					_localctx.methodArgumentsRet.add(((MethodArgumentsContext)_localctx).v.variableWithTypeRet);
					}
					}
					setState(201);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static class VariableWithTypeContext extends ParserRuleContext {
		public VarDeclaration variableWithTypeRet;
		public IdentifierContext i;
		public TypeContext t;
		public TerminalNode COLON() { return getToken(SophiaParser.COLON, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public VariableWithTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableWithType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterVariableWithType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitVariableWithType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitVariableWithType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableWithTypeContext variableWithType() throws RecognitionException {
		VariableWithTypeContext _localctx = new VariableWithTypeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_variableWithType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			((VariableWithTypeContext)_localctx).i = identifier();
			setState(205);
			match(COLON);
			setState(206);
			((VariableWithTypeContext)_localctx).t = type();

			        ((VariableWithTypeContext)_localctx).variableWithTypeRet =  new VarDeclaration(((VariableWithTypeContext)_localctx).i.identifierRet, ((VariableWithTypeContext)_localctx).t.typeRet);
			        _localctx.variableWithTypeRet.setLine(((VariableWithTypeContext)_localctx).i.identifierRet.getLine());
			    
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

	public static class TypeContext extends ParserRuleContext {
		public Type typeRet;
		public PrimitiveDataTypeContext p;
		public ListTypeContext l;
		public FunctionPointerTypeContext f;
		public ClassTypeContext c;
		public PrimitiveDataTypeContext primitiveDataType() {
			return getRuleContext(PrimitiveDataTypeContext.class,0);
		}
		public ListTypeContext listType() {
			return getRuleContext(ListTypeContext.class,0);
		}
		public FunctionPointerTypeContext functionPointerType() {
			return getRuleContext(FunctionPointerTypeContext.class,0);
		}
		public ClassTypeContext classType() {
			return getRuleContext(ClassTypeContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_type);
		try {
			setState(221);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case STRING:
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(209);
				((TypeContext)_localctx).p = primitiveDataType();
				((TypeContext)_localctx).typeRet =  ((TypeContext)_localctx).p.primitiveDataTypeRet;
				}
				break;
			case LIST:
				enterOuterAlt(_localctx, 2);
				{
				setState(212);
				((TypeContext)_localctx).l = listType();
				((TypeContext)_localctx).typeRet =  ((TypeContext)_localctx).l.listTypeRet;
				}
				break;
			case FUNC:
				enterOuterAlt(_localctx, 3);
				{
				setState(215);
				((TypeContext)_localctx).f = functionPointerType();
				((TypeContext)_localctx).typeRet =  ((TypeContext)_localctx).f.functionPointerTypeRet;
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 4);
				{
				setState(218);
				((TypeContext)_localctx).c = classType();
				((TypeContext)_localctx).typeRet =  ((TypeContext)_localctx).c.classTypeRet;
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

	public static class ClassTypeContext extends ParserRuleContext {
		public ClassType classTypeRet;
		public IdentifierContext i;
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ClassTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterClassType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitClassType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitClassType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassTypeContext classType() throws RecognitionException {
		ClassTypeContext _localctx = new ClassTypeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_classType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			((ClassTypeContext)_localctx).i = identifier();
			((ClassTypeContext)_localctx).classTypeRet =  new ClassType(((ClassTypeContext)_localctx).i.identifierRet);
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

	public static class ListTypeContext extends ParserRuleContext {
		public ListType listTypeRet;
		public Token i;
		public TypeContext t;
		public ListItemsTypesContext l;
		public TerminalNode LIST() { return getToken(SophiaParser.LIST, 0); }
		public TerminalNode LPAR() { return getToken(SophiaParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(SophiaParser.RPAR, 0); }
		public TerminalNode SHARP() { return getToken(SophiaParser.SHARP, 0); }
		public TerminalNode INT_VALUE() { return getToken(SophiaParser.INT_VALUE, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ListItemsTypesContext listItemsTypes() {
			return getRuleContext(ListItemsTypesContext.class,0);
		}
		public ListTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterListType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitListType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitListType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListTypeContext listType() throws RecognitionException {
		ListTypeContext _localctx = new ListTypeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_listType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			match(LIST);
			setState(227);
			match(LPAR);
			setState(236);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_VALUE:
				{
				{
				setState(228);
				((ListTypeContext)_localctx).i = match(INT_VALUE);
				setState(229);
				match(SHARP);
				setState(230);
				((ListTypeContext)_localctx).t = type();
				((ListTypeContext)_localctx).listTypeRet =  new ListType((((ListTypeContext)_localctx).i!=null?Integer.valueOf(((ListTypeContext)_localctx).i.getText()):0), new ListNameType(((ListTypeContext)_localctx).t.typeRet));
				}
				}
				break;
			case FUNC:
			case BOOLEAN:
			case STRING:
			case INT:
			case LIST:
			case IDENTIFIER:
				{
				{
				setState(233);
				((ListTypeContext)_localctx).l = listItemsTypes();
				((ListTypeContext)_localctx).listTypeRet =  new ListType(((ListTypeContext)_localctx).l.listItemsTypesRet);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(238);
			match(RPAR);
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

	public static class ListItemsTypesContext extends ParserRuleContext {
		public ArrayList<ListNameType> listItemsTypesRet;
		public ListItemTypeContext l;
		public List<ListItemTypeContext> listItemType() {
			return getRuleContexts(ListItemTypeContext.class);
		}
		public ListItemTypeContext listItemType(int i) {
			return getRuleContext(ListItemTypeContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SophiaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SophiaParser.COMMA, i);
		}
		public ListItemsTypesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listItemsTypes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterListItemsTypes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitListItemsTypes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitListItemsTypes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListItemsTypesContext listItemsTypes() throws RecognitionException {
		ListItemsTypesContext _localctx = new ListItemsTypesContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_listItemsTypes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((ListItemsTypesContext)_localctx).listItemsTypesRet =  new ArrayList<>();
			setState(241);
			((ListItemsTypesContext)_localctx).l = listItemType();
			_localctx.listItemsTypesRet.add(((ListItemsTypesContext)_localctx).l.listItemTypeRet);
			setState(249);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(243);
				match(COMMA);
				setState(244);
				((ListItemsTypesContext)_localctx).l = listItemType();
				_localctx.listItemsTypesRet.add(((ListItemsTypesContext)_localctx).l.listItemTypeRet);
				}
				}
				setState(251);
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

	public static class ListItemTypeContext extends ParserRuleContext {
		public ListNameType listItemTypeRet;
		public VariableWithTypeContext v;
		public TypeContext t;
		public VariableWithTypeContext variableWithType() {
			return getRuleContext(VariableWithTypeContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ListItemTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listItemType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterListItemType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitListItemType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitListItemType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListItemTypeContext listItemType() throws RecognitionException {
		ListItemTypeContext _localctx = new ListItemTypeContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_listItemType);
		try {
			setState(258);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(252);
				((ListItemTypeContext)_localctx).v = variableWithType();
				((ListItemTypeContext)_localctx).listItemTypeRet =  new ListNameType(((ListItemTypeContext)_localctx).v.variableWithTypeRet);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(255);
				((ListItemTypeContext)_localctx).t = type();
				((ListItemTypeContext)_localctx).listItemTypeRet =  new ListNameType(((ListItemTypeContext)_localctx).t.typeRet);
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

	public static class FunctionPointerTypeContext extends ParserRuleContext {
		public FptrType functionPointerTypeRet;
		public TypesWithCommaContext t;
		public TypeContext ty;
		public TerminalNode FUNC() { return getToken(SophiaParser.FUNC, 0); }
		public TerminalNode LESS_THAN() { return getToken(SophiaParser.LESS_THAN, 0); }
		public TerminalNode ARROW() { return getToken(SophiaParser.ARROW, 0); }
		public TerminalNode GREATER_THAN() { return getToken(SophiaParser.GREATER_THAN, 0); }
		public List<TerminalNode> VOID() { return getTokens(SophiaParser.VOID); }
		public TerminalNode VOID(int i) {
			return getToken(SophiaParser.VOID, i);
		}
		public TypesWithCommaContext typesWithComma() {
			return getRuleContext(TypesWithCommaContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public FunctionPointerTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionPointerType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterFunctionPointerType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitFunctionPointerType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitFunctionPointerType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionPointerTypeContext functionPointerType() throws RecognitionException {
		FunctionPointerTypeContext _localctx = new FunctionPointerTypeContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_functionPointerType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			((FunctionPointerTypeContext)_localctx).functionPointerTypeRet =  new FptrType();
			setState(261);
			match(FUNC);
			setState(262);
			match(LESS_THAN);
			setState(268);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VOID:
				{
				setState(263);
				match(VOID);
				_localctx.functionPointerTypeRet.setArgumentsTypes(new ArrayList<>());
				}
				break;
			case FUNC:
			case BOOLEAN:
			case STRING:
			case INT:
			case LIST:
			case IDENTIFIER:
				{
				setState(265);
				((FunctionPointerTypeContext)_localctx).t = typesWithComma();
				_localctx.functionPointerTypeRet.setArgumentsTypes(((FunctionPointerTypeContext)_localctx).t.typesWithCommaRet);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(270);
			match(ARROW);
			setState(276);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VOID:
				{
				setState(271);
				match(VOID);
				_localctx.functionPointerTypeRet.setReturnType(new NullType());
				}
				break;
			case FUNC:
			case BOOLEAN:
			case STRING:
			case INT:
			case LIST:
			case IDENTIFIER:
				{
				setState(273);
				((FunctionPointerTypeContext)_localctx).ty = type();
				_localctx.functionPointerTypeRet.setReturnType(((FunctionPointerTypeContext)_localctx).ty.typeRet);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(278);
			match(GREATER_THAN);
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

	public static class TypesWithCommaContext extends ParserRuleContext {
		public ArrayList<Type> typesWithCommaRet;
		public TypeContext t;
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SophiaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SophiaParser.COMMA, i);
		}
		public TypesWithCommaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typesWithComma; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterTypesWithComma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitTypesWithComma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitTypesWithComma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypesWithCommaContext typesWithComma() throws RecognitionException {
		TypesWithCommaContext _localctx = new TypesWithCommaContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_typesWithComma);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((TypesWithCommaContext)_localctx).typesWithCommaRet =  new ArrayList<>();
			setState(281);
			((TypesWithCommaContext)_localctx).t = type();
			_localctx.typesWithCommaRet.add(((TypesWithCommaContext)_localctx).t.typeRet);
			setState(289);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(283);
				match(COMMA);
				setState(284);
				((TypesWithCommaContext)_localctx).t = type();
				_localctx.typesWithCommaRet.add(((TypesWithCommaContext)_localctx).t.typeRet);
				}
				}
				setState(291);
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

	public static class PrimitiveDataTypeContext extends ParserRuleContext {
		public Type primitiveDataTypeRet;
		public TerminalNode INT() { return getToken(SophiaParser.INT, 0); }
		public TerminalNode STRING() { return getToken(SophiaParser.STRING, 0); }
		public TerminalNode BOOLEAN() { return getToken(SophiaParser.BOOLEAN, 0); }
		public PrimitiveDataTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveDataType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterPrimitiveDataType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitPrimitiveDataType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitPrimitiveDataType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimitiveDataTypeContext primitiveDataType() throws RecognitionException {
		PrimitiveDataTypeContext _localctx = new PrimitiveDataTypeContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_primitiveDataType);
		try {
			setState(298);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(292);
				match(INT);
				((PrimitiveDataTypeContext)_localctx).primitiveDataTypeRet =  new IntType();
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(294);
				match(STRING);
				((PrimitiveDataTypeContext)_localctx).primitiveDataTypeRet =  new StringType();
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 3);
				{
				setState(296);
				match(BOOLEAN);
				((PrimitiveDataTypeContext)_localctx).primitiveDataTypeRet =  new BoolType();
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

	public static class MethodBodyContext extends ParserRuleContext {
		public ArrayList<VarDeclaration> methodBodyRetLocalVars;
		public ArrayList<Statement> methodBodyRetBody;
		public VarDeclarationContext v;
		public StatementContext s;
		public List<VarDeclarationContext> varDeclaration() {
			return getRuleContexts(VarDeclarationContext.class);
		}
		public VarDeclarationContext varDeclaration(int i) {
			return getRuleContext(VarDeclarationContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public MethodBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterMethodBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitMethodBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitMethodBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodBodyContext methodBody() throws RecognitionException {
		MethodBodyContext _localctx = new MethodBodyContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_methodBody);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{

			        ((MethodBodyContext)_localctx).methodBodyRetLocalVars =  new ArrayList<>();
			        ((MethodBodyContext)_localctx).methodBodyRetBody =  new ArrayList<>();
			    
			setState(306);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(301);
					((MethodBodyContext)_localctx).v = varDeclaration();
					_localctx.methodBodyRetLocalVars.add(((MethodBodyContext)_localctx).v.varDeclarationRet);
					}
					} 
				}
				setState(308);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			}
			setState(314);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << NEW) | (1L << CONTINUE) | (1L << BREAK) | (1L << RETURN) | (1L << FOREACH) | (1L << FOR) | (1L << IF) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << THIS) | (1L << MINUS) | (1L << NOT) | (1L << INCREMENT) | (1L << DECREMENT) | (1L << LPAR) | (1L << LBRACK) | (1L << LBRACE) | (1L << INT_VALUE) | (1L << IDENTIFIER) | (1L << STRING_VALUE))) != 0)) {
				{
				{
				setState(309);
				((MethodBodyContext)_localctx).s = statement();
				_localctx.methodBodyRetBody.add(((MethodBodyContext)_localctx).s.statementRet);
				}
				}
				setState(316);
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

	public static class StatementContext extends ParserRuleContext {
		public Statement statementRet;
		public ForStatementContext f;
		public ForeachStatementContext foreach;
		public IfStatementContext ifstate;
		public AssignmentStatementContext assign;
		public PrintStatementContext print;
		public ContinueBreakStatementContext countinue;
		public MethodCallStatementContext methodcall;
		public ReturnStatementContext r;
		public BlockContext b;
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public ForeachStatementContext foreachStatement() {
			return getRuleContext(ForeachStatementContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public AssignmentStatementContext assignmentStatement() {
			return getRuleContext(AssignmentStatementContext.class,0);
		}
		public PrintStatementContext printStatement() {
			return getRuleContext(PrintStatementContext.class,0);
		}
		public ContinueBreakStatementContext continueBreakStatement() {
			return getRuleContext(ContinueBreakStatementContext.class,0);
		}
		public MethodCallStatementContext methodCallStatement() {
			return getRuleContext(MethodCallStatementContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_statement);
		try {
			setState(344);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(317);
				((StatementContext)_localctx).f = forStatement();
				((StatementContext)_localctx).statementRet =  ((StatementContext)_localctx).f.forStatementRet;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(320);
				((StatementContext)_localctx).foreach = foreachStatement();
				((StatementContext)_localctx).statementRet =  ((StatementContext)_localctx).foreach.foreachStatementRet;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(323);
				((StatementContext)_localctx).ifstate = ifStatement();
				((StatementContext)_localctx).statementRet =  ((StatementContext)_localctx).ifstate.ifStatementRet;
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(326);
				((StatementContext)_localctx).assign = assignmentStatement();
				((StatementContext)_localctx).statementRet =  ((StatementContext)_localctx).assign.assignmentStatementRet;
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(329);
				((StatementContext)_localctx).print = printStatement();
				((StatementContext)_localctx).statementRet =  ((StatementContext)_localctx).print.printStatementRet;
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(332);
				((StatementContext)_localctx).countinue = continueBreakStatement();
				((StatementContext)_localctx).statementRet =  ((StatementContext)_localctx).countinue.continueBreakStatementRet;
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(335);
				((StatementContext)_localctx).methodcall = methodCallStatement();
				((StatementContext)_localctx).statementRet =  ((StatementContext)_localctx).methodcall.methodCallStatementRet;
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(338);
				((StatementContext)_localctx).r = returnStatement();
				((StatementContext)_localctx).statementRet =  ((StatementContext)_localctx).r.returnStatementRet;
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(341);
				((StatementContext)_localctx).b = block();
				((StatementContext)_localctx).statementRet =  ((StatementContext)_localctx).b.blockRet;
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

	public static class BlockContext extends ParserRuleContext {
		public BlockStmt blockRet;
		public Token lbrace;
		public StatementContext s;
		public TerminalNode RBRACE() { return getToken(SophiaParser.RBRACE, 0); }
		public TerminalNode LBRACE() { return getToken(SophiaParser.LBRACE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((BlockContext)_localctx).blockRet =  new BlockStmt();
			setState(347);
			((BlockContext)_localctx).lbrace = match(LBRACE);
			_localctx.blockRet.setLine(((BlockContext)_localctx).lbrace.getLine());
			setState(354);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << NEW) | (1L << CONTINUE) | (1L << BREAK) | (1L << RETURN) | (1L << FOREACH) | (1L << FOR) | (1L << IF) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << THIS) | (1L << MINUS) | (1L << NOT) | (1L << INCREMENT) | (1L << DECREMENT) | (1L << LPAR) | (1L << LBRACK) | (1L << LBRACE) | (1L << INT_VALUE) | (1L << IDENTIFIER) | (1L << STRING_VALUE))) != 0)) {
				{
				{
				setState(349);
				((BlockContext)_localctx).s = statement();
				_localctx.blockRet.addStatement(((BlockContext)_localctx).s.statementRet);
				}
				}
				setState(356);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(357);
			match(RBRACE);
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

	public static class AssignmentStatementContext extends ParserRuleContext {
		public AssignmentStmt assignmentStatementRet;
		public AssignmentContext a;
		public TerminalNode SEMICOLLON() { return getToken(SophiaParser.SEMICOLLON, 0); }
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public AssignmentStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterAssignmentStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitAssignmentStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitAssignmentStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentStatementContext assignmentStatement() throws RecognitionException {
		AssignmentStatementContext _localctx = new AssignmentStatementContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_assignmentStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(359);
			((AssignmentStatementContext)_localctx).a = assignment();
			((AssignmentStatementContext)_localctx).assignmentStatementRet =  ((AssignmentStatementContext)_localctx).a.assignmentRet;
			setState(361);
			match(SEMICOLLON);
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

	public static class AssignmentContext extends ParserRuleContext {
		public AssignmentStmt assignmentRet;
		public OrExpressionContext or;
		public Token a;
		public ExpressionContext e;
		public OrExpressionContext orExpression() {
			return getRuleContext(OrExpressionContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(SophiaParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(363);
			((AssignmentContext)_localctx).or = orExpression();
			setState(364);
			((AssignmentContext)_localctx).a = match(ASSIGN);
			setState(365);
			((AssignmentContext)_localctx).e = expression();

			        ((AssignmentContext)_localctx).assignmentRet =  new AssignmentStmt(((AssignmentContext)_localctx).or.orExpressionRet, ((AssignmentContext)_localctx).e.expressionRet);
			        _localctx.assignmentRet.setLine(((AssignmentContext)_localctx).a.getLine());
			    
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

	public static class PrintStatementContext extends ParserRuleContext {
		public PrintStmt printStatementRet;
		public Token p;
		public ExpressionContext e;
		public TerminalNode LPAR() { return getToken(SophiaParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(SophiaParser.RPAR, 0); }
		public TerminalNode SEMICOLLON() { return getToken(SophiaParser.SEMICOLLON, 0); }
		public TerminalNode PRINT() { return getToken(SophiaParser.PRINT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PrintStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterPrintStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitPrintStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitPrintStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintStatementContext printStatement() throws RecognitionException {
		PrintStatementContext _localctx = new PrintStatementContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_printStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(368);
			((PrintStatementContext)_localctx).p = match(PRINT);
			setState(369);
			match(LPAR);
			setState(370);
			((PrintStatementContext)_localctx).e = expression();

			        ((PrintStatementContext)_localctx).printStatementRet =  new PrintStmt(((PrintStatementContext)_localctx).e.expressionRet);
			        _localctx.printStatementRet.setLine(((PrintStatementContext)_localctx).p.getLine());
			    
			setState(372);
			match(RPAR);
			setState(373);
			match(SEMICOLLON);
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

	public static class ReturnStatementContext extends ParserRuleContext {
		public ReturnStmt returnStatementRet;
		public Token r;
		public ExpressionContext e;
		public TerminalNode SEMICOLLON() { return getToken(SophiaParser.SEMICOLLON, 0); }
		public TerminalNode RETURN() { return getToken(SophiaParser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitReturnStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_returnStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((ReturnStatementContext)_localctx).returnStatementRet =  new ReturnStmt();
			setState(376);
			((ReturnStatementContext)_localctx).r = match(RETURN);
			_localctx.returnStatementRet.setLine(((ReturnStatementContext)_localctx).r.getLine());
			setState(381);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << THIS) | (1L << MINUS) | (1L << NOT) | (1L << INCREMENT) | (1L << DECREMENT) | (1L << LPAR) | (1L << LBRACK) | (1L << INT_VALUE) | (1L << IDENTIFIER) | (1L << STRING_VALUE))) != 0)) {
				{
				setState(378);
				((ReturnStatementContext)_localctx).e = expression();
				_localctx.returnStatementRet.setReturnedExpr(((ReturnStatementContext)_localctx).e.expressionRet);
				}
			}

			setState(383);
			match(SEMICOLLON);
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

	public static class MethodCallStatementContext extends ParserRuleContext {
		public MethodCallStmt methodCallStatementRet;
		public MethodCallContext m;
		public TerminalNode SEMICOLLON() { return getToken(SophiaParser.SEMICOLLON, 0); }
		public MethodCallContext methodCall() {
			return getRuleContext(MethodCallContext.class,0);
		}
		public MethodCallStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodCallStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterMethodCallStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitMethodCallStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitMethodCallStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodCallStatementContext methodCallStatement() throws RecognitionException {
		MethodCallStatementContext _localctx = new MethodCallStatementContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_methodCallStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(385);
			((MethodCallStatementContext)_localctx).m = methodCall();

			        ((MethodCallStatementContext)_localctx).methodCallStatementRet =  new MethodCallStmt(((MethodCallStatementContext)_localctx).m.methodCallRet);
			        _localctx.methodCallStatementRet.setLine(((MethodCallStatementContext)_localctx).m.methodCallRet.getLine());
			    
			setState(387);
			match(SEMICOLLON);
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

	public static class MethodCallContext extends ParserRuleContext {
		public MethodCall methodCallRet;
		public OtherExpressionContext o;
		public Token lpar;
		public MethodCallArgumentsContext m;
		public IdentifierContext i;
		public Token lbrack;
		public ExpressionContext e;
		public Token l;
		public OtherExpressionContext otherExpression() {
			return getRuleContext(OtherExpressionContext.class,0);
		}
		public List<TerminalNode> RPAR() { return getTokens(SophiaParser.RPAR); }
		public TerminalNode RPAR(int i) {
			return getToken(SophiaParser.RPAR, i);
		}
		public List<TerminalNode> LPAR() { return getTokens(SophiaParser.LPAR); }
		public TerminalNode LPAR(int i) {
			return getToken(SophiaParser.LPAR, i);
		}
		public List<MethodCallArgumentsContext> methodCallArguments() {
			return getRuleContexts(MethodCallArgumentsContext.class);
		}
		public MethodCallArgumentsContext methodCallArguments(int i) {
			return getRuleContext(MethodCallArgumentsContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(SophiaParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(SophiaParser.DOT, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(SophiaParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(SophiaParser.RBRACK, i);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> LBRACK() { return getTokens(SophiaParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(SophiaParser.LBRACK, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public MethodCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterMethodCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitMethodCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitMethodCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodCallContext methodCall() throws RecognitionException {
		MethodCallContext _localctx = new MethodCallContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_methodCall);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(389);
			((MethodCallContext)_localctx).o = otherExpression();
			((MethodCallContext)_localctx).methodCallRet =  new MethodCall(((MethodCallContext)_localctx).o.otherExpressionRet);
			setState(407);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(405);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case LPAR:
						{
						{
						setState(391);
						((MethodCallContext)_localctx).lpar = match(LPAR);
						setState(392);
						((MethodCallContext)_localctx).m = methodCallArguments();

						            MethodCall m = new MethodCall(_localctx.methodCallRet.getInstance(), ((MethodCallContext)_localctx).m.methodCallArgumentsRet);
						            m.setLine(((MethodCallContext)_localctx).lpar.getLine());
						            _localctx.methodCallRet.setInstance(m);
						        
						setState(394);
						match(RPAR);
						}
						}
						break;
					case DOT:
						{
						{
						setState(396);
						match(DOT);
						setState(397);
						((MethodCallContext)_localctx).i = identifier();

						            ObjectOrListMemberAccess objectList = new ObjectOrListMemberAccess(_localctx.methodCallRet.getInstance() ,((MethodCallContext)_localctx).i.identifierRet);
						            objectList.setLine(((MethodCallContext)_localctx).i.identifierRet.getLine());
						            _localctx.methodCallRet.setInstance(objectList);
						        
						}
						}
						break;
					case LBRACK:
						{
						{
						setState(400);
						((MethodCallContext)_localctx).lbrack = match(LBRACK);
						setState(401);
						((MethodCallContext)_localctx).e = expression();

						            ListAccessByIndex listAccess = new ListAccessByIndex(_localctx.methodCallRet.getInstance(), ((MethodCallContext)_localctx).e.expressionRet);
						            listAccess.setLine(((MethodCallContext)_localctx).lbrack.getLine());
						            _localctx.methodCallRet.setInstance(listAccess);
						        
						setState(403);
						match(RBRACK);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(409);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			}
			{
			setState(410);
			((MethodCallContext)_localctx).l = match(LPAR);
			setState(411);
			((MethodCallContext)_localctx).m = methodCallArguments();
			setState(412);
			match(RPAR);
			}

			        _localctx.methodCallRet.setArgs(((MethodCallContext)_localctx).m.methodCallArgumentsRet);
			        _localctx.methodCallRet.setLine(((MethodCallContext)_localctx).l.getLine());
			    
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

	public static class MethodCallArgumentsContext extends ParserRuleContext {
		public ArrayList<Expression> methodCallArgumentsRet;
		public ExpressionContext e1;
		public ExpressionContext e2;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SophiaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SophiaParser.COMMA, i);
		}
		public MethodCallArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodCallArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterMethodCallArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitMethodCallArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitMethodCallArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodCallArgumentsContext methodCallArguments() throws RecognitionException {
		MethodCallArgumentsContext _localctx = new MethodCallArgumentsContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_methodCallArguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((MethodCallArgumentsContext)_localctx).methodCallArgumentsRet =  new ArrayList<>();
			setState(428);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << THIS) | (1L << MINUS) | (1L << NOT) | (1L << INCREMENT) | (1L << DECREMENT) | (1L << LPAR) | (1L << LBRACK) | (1L << INT_VALUE) | (1L << IDENTIFIER) | (1L << STRING_VALUE))) != 0)) {
				{
				setState(417);
				((MethodCallArgumentsContext)_localctx).e1 = expression();
				_localctx.methodCallArgumentsRet.add(((MethodCallArgumentsContext)_localctx).e1.expressionRet);
				setState(425);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(419);
					match(COMMA);
					setState(420);
					((MethodCallArgumentsContext)_localctx).e2 = expression();
					_localctx.methodCallArgumentsRet.add(((MethodCallArgumentsContext)_localctx).e2.expressionRet);
					}
					}
					setState(427);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static class ContinueBreakStatementContext extends ParserRuleContext {
		public Statement continueBreakStatementRet;
		public Token b;
		public Token c;
		public TerminalNode SEMICOLLON() { return getToken(SophiaParser.SEMICOLLON, 0); }
		public TerminalNode BREAK() { return getToken(SophiaParser.BREAK, 0); }
		public TerminalNode CONTINUE() { return getToken(SophiaParser.CONTINUE, 0); }
		public ContinueBreakStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continueBreakStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterContinueBreakStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitContinueBreakStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitContinueBreakStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContinueBreakStatementContext continueBreakStatement() throws RecognitionException {
		ContinueBreakStatementContext _localctx = new ContinueBreakStatementContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_continueBreakStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(434);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BREAK:
				{
				setState(430);
				((ContinueBreakStatementContext)_localctx).b = match(BREAK);

				        ((ContinueBreakStatementContext)_localctx).continueBreakStatementRet =  new BreakStmt();
				        _localctx.continueBreakStatementRet.setLine(((ContinueBreakStatementContext)_localctx).b.getLine());
				    
				}
				break;
			case CONTINUE:
				{
				setState(432);
				((ContinueBreakStatementContext)_localctx).c = match(CONTINUE);

				        ((ContinueBreakStatementContext)_localctx).continueBreakStatementRet =  new ContinueStmt();
				        _localctx.continueBreakStatementRet.setLine(((ContinueBreakStatementContext)_localctx).c.getLine());
				    
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(436);
			match(SEMICOLLON);
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

	public static class ForStatementContext extends ParserRuleContext {
		public ForStmt forStatementRet;
		public Token f;
		public AssignmentContext init;
		public ExpressionContext e;
		public AssignmentContext update;
		public StatementContext s;
		public TerminalNode LPAR() { return getToken(SophiaParser.LPAR, 0); }
		public List<TerminalNode> SEMICOLLON() { return getTokens(SophiaParser.SEMICOLLON); }
		public TerminalNode SEMICOLLON(int i) {
			return getToken(SophiaParser.SEMICOLLON, i);
		}
		public TerminalNode RPAR() { return getToken(SophiaParser.RPAR, 0); }
		public TerminalNode FOR() { return getToken(SophiaParser.FOR, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public List<AssignmentContext> assignment() {
			return getRuleContexts(AssignmentContext.class);
		}
		public AssignmentContext assignment(int i) {
			return getRuleContext(AssignmentContext.class,i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitForStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitForStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_forStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((ForStatementContext)_localctx).forStatementRet =  new ForStmt();
			setState(439);
			((ForStatementContext)_localctx).f = match(FOR);
			_localctx.forStatementRet.setLine(((ForStatementContext)_localctx).f.getLine());
			setState(441);
			match(LPAR);
			setState(445);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << THIS) | (1L << MINUS) | (1L << NOT) | (1L << INCREMENT) | (1L << DECREMENT) | (1L << LPAR) | (1L << LBRACK) | (1L << INT_VALUE) | (1L << IDENTIFIER) | (1L << STRING_VALUE))) != 0)) {
				{
				setState(442);
				((ForStatementContext)_localctx).init = assignment();
				_localctx.forStatementRet.setInitialize(((ForStatementContext)_localctx).init.assignmentRet);
				}
			}

			setState(447);
			match(SEMICOLLON);
			setState(451);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << THIS) | (1L << MINUS) | (1L << NOT) | (1L << INCREMENT) | (1L << DECREMENT) | (1L << LPAR) | (1L << LBRACK) | (1L << INT_VALUE) | (1L << IDENTIFIER) | (1L << STRING_VALUE))) != 0)) {
				{
				setState(448);
				((ForStatementContext)_localctx).e = expression();
				_localctx.forStatementRet.setCondition(((ForStatementContext)_localctx).e.expressionRet);
				}
			}

			setState(453);
			match(SEMICOLLON);
			setState(457);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << THIS) | (1L << MINUS) | (1L << NOT) | (1L << INCREMENT) | (1L << DECREMENT) | (1L << LPAR) | (1L << LBRACK) | (1L << INT_VALUE) | (1L << IDENTIFIER) | (1L << STRING_VALUE))) != 0)) {
				{
				setState(454);
				((ForStatementContext)_localctx).update = assignment();
				_localctx.forStatementRet.setUpdate(((ForStatementContext)_localctx).update.assignmentRet);
				}
			}

			setState(459);
			match(RPAR);
			setState(460);
			((ForStatementContext)_localctx).s = statement();
			_localctx.forStatementRet.setBody(((ForStatementContext)_localctx).s.statementRet);
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

	public static class ForeachStatementContext extends ParserRuleContext {
		public ForeachStmt foreachStatementRet;
		public Token f;
		public IdentifierContext i;
		public ExpressionContext e;
		public StatementContext s;
		public TerminalNode LPAR() { return getToken(SophiaParser.LPAR, 0); }
		public TerminalNode IN() { return getToken(SophiaParser.IN, 0); }
		public TerminalNode RPAR() { return getToken(SophiaParser.RPAR, 0); }
		public TerminalNode FOREACH() { return getToken(SophiaParser.FOREACH, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ForeachStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foreachStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterForeachStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitForeachStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitForeachStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForeachStatementContext foreachStatement() throws RecognitionException {
		ForeachStatementContext _localctx = new ForeachStatementContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_foreachStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(463);
			((ForeachStatementContext)_localctx).f = match(FOREACH);
			setState(464);
			match(LPAR);
			setState(465);
			((ForeachStatementContext)_localctx).i = identifier();
			setState(466);
			match(IN);
			setState(467);
			((ForeachStatementContext)_localctx).e = expression();

			        ((ForeachStatementContext)_localctx).foreachStatementRet =  new ForeachStmt(((ForeachStatementContext)_localctx).i.identifierRet, ((ForeachStatementContext)_localctx).e.expressionRet);
			        _localctx.foreachStatementRet.setLine(((ForeachStatementContext)_localctx).f.getLine());
			    
			setState(469);
			match(RPAR);
			setState(470);
			((ForeachStatementContext)_localctx).s = statement();
			_localctx.foreachStatementRet.setBody(((ForeachStatementContext)_localctx).s.statementRet);
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

	public static class IfStatementContext extends ParserRuleContext {
		public ConditionalStmt ifStatementRet;
		public Token i;
		public ExpressionContext e;
		public StatementContext s;
		public TerminalNode LPAR() { return getToken(SophiaParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(SophiaParser.RPAR, 0); }
		public TerminalNode IF() { return getToken(SophiaParser.IF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(SophiaParser.ELSE, 0); }
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_ifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(473);
			((IfStatementContext)_localctx).i = match(IF);
			setState(474);
			match(LPAR);
			setState(475);
			((IfStatementContext)_localctx).e = expression();
			setState(476);
			match(RPAR);
			setState(477);
			((IfStatementContext)_localctx).s = statement();

			        ((IfStatementContext)_localctx).ifStatementRet =  new ConditionalStmt(((IfStatementContext)_localctx).e.expressionRet, ((IfStatementContext)_localctx).s.statementRet);
			        _localctx.ifStatementRet.setLine(((IfStatementContext)_localctx).i.getLine());
			    
			setState(483);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				{
				setState(479);
				match(ELSE);
				setState(480);
				((IfStatementContext)_localctx).s = statement();
				_localctx.ifStatementRet.setElseBody(((IfStatementContext)_localctx).s.statementRet);
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

	public static class ExpressionContext extends ParserRuleContext {
		public Expression expressionRet;
		public OrExpressionContext o;
		public Token a;
		public ExpressionContext e;
		public OrExpressionContext orExpression() {
			return getRuleContext(OrExpressionContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(SophiaParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(485);
			((ExpressionContext)_localctx).o = orExpression();
			((ExpressionContext)_localctx).expressionRet =  ((ExpressionContext)_localctx).o.orExpressionRet;
			setState(491);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(487);
				((ExpressionContext)_localctx).a = match(ASSIGN);
				setState(488);
				((ExpressionContext)_localctx).e = expression();

				            ((ExpressionContext)_localctx).expressionRet =  new BinaryExpression(_localctx.expressionRet, ((ExpressionContext)_localctx).e.expressionRet, BinaryOperator.assign);
				            _localctx.expressionRet.setLine(((ExpressionContext)_localctx).a.getLine());
				        
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

	public static class OrExpressionContext extends ParserRuleContext {
		public Expression orExpressionRet;
		public AndExpressionContext a;
		public Token o;
		public List<AndExpressionContext> andExpression() {
			return getRuleContexts(AndExpressionContext.class);
		}
		public AndExpressionContext andExpression(int i) {
			return getRuleContext(AndExpressionContext.class,i);
		}
		public List<TerminalNode> OR() { return getTokens(SophiaParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(SophiaParser.OR, i);
		}
		public OrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitOrExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrExpressionContext orExpression() throws RecognitionException {
		OrExpressionContext _localctx = new OrExpressionContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_orExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(493);
			((OrExpressionContext)_localctx).a = andExpression();
			((OrExpressionContext)_localctx).orExpressionRet =  ((OrExpressionContext)_localctx).a.andExpressionRet;
			setState(501);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(495);
				((OrExpressionContext)_localctx).o = match(OR);
				setState(496);
				((OrExpressionContext)_localctx).a = andExpression();

				            ((OrExpressionContext)_localctx).orExpressionRet =  new BinaryExpression(_localctx.orExpressionRet, ((OrExpressionContext)_localctx).a.andExpressionRet, BinaryOperator.or);
				            _localctx.orExpressionRet.setLine(((OrExpressionContext)_localctx).o.getLine());
				        
				}
				}
				setState(503);
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

	public static class AndExpressionContext extends ParserRuleContext {
		public Expression andExpressionRet;
		public EqualityExpressionContext e;
		public Token a;
		public List<EqualityExpressionContext> equalityExpression() {
			return getRuleContexts(EqualityExpressionContext.class);
		}
		public EqualityExpressionContext equalityExpression(int i) {
			return getRuleContext(EqualityExpressionContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(SophiaParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(SophiaParser.AND, i);
		}
		public AndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitAndExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitAndExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AndExpressionContext andExpression() throws RecognitionException {
		AndExpressionContext _localctx = new AndExpressionContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_andExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(504);
			((AndExpressionContext)_localctx).e = equalityExpression();
			((AndExpressionContext)_localctx).andExpressionRet =  ((AndExpressionContext)_localctx).e.equalityExpressionRet;
			setState(512);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(506);
				((AndExpressionContext)_localctx).a = match(AND);
				setState(507);
				((AndExpressionContext)_localctx).e = equalityExpression();

				            ((AndExpressionContext)_localctx).andExpressionRet =  new BinaryExpression(_localctx.andExpressionRet, ((AndExpressionContext)_localctx).e.equalityExpressionRet, BinaryOperator.and);
				            _localctx.andExpressionRet.setLine(((AndExpressionContext)_localctx).a.getLine());
				        
				}
				}
				setState(514);
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

	public static class EqualityExpressionContext extends ParserRuleContext {
		public Expression equalityExpressionRet;
		public RelationalExpressionContext r;
		public Token e;
		public Token n;
		public List<RelationalExpressionContext> relationalExpression() {
			return getRuleContexts(RelationalExpressionContext.class);
		}
		public RelationalExpressionContext relationalExpression(int i) {
			return getRuleContext(RelationalExpressionContext.class,i);
		}
		public List<TerminalNode> EQUAL() { return getTokens(SophiaParser.EQUAL); }
		public TerminalNode EQUAL(int i) {
			return getToken(SophiaParser.EQUAL, i);
		}
		public List<TerminalNode> NOT_EQUAL() { return getTokens(SophiaParser.NOT_EQUAL); }
		public TerminalNode NOT_EQUAL(int i) {
			return getToken(SophiaParser.NOT_EQUAL, i);
		}
		public EqualityExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalityExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterEqualityExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitEqualityExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitEqualityExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqualityExpressionContext equalityExpression() throws RecognitionException {
		EqualityExpressionContext _localctx = new EqualityExpressionContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_equalityExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(515);
			((EqualityExpressionContext)_localctx).r = relationalExpression();
			((EqualityExpressionContext)_localctx).equalityExpressionRet =  ((EqualityExpressionContext)_localctx).r.relationalExpressionRet;
			setState(527);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NOT_EQUAL || _la==EQUAL) {
				{
				setState(525);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case EQUAL:
					{
					setState(517);
					((EqualityExpressionContext)_localctx).e = match(EQUAL);
					setState(518);
					((EqualityExpressionContext)_localctx).r = relationalExpression();

					            ((EqualityExpressionContext)_localctx).equalityExpressionRet =  new BinaryExpression(_localctx.equalityExpressionRet, ((EqualityExpressionContext)_localctx).r.relationalExpressionRet, BinaryOperator.eq);
					            _localctx.equalityExpressionRet.setLine(((EqualityExpressionContext)_localctx).e.getLine());
					        
					}
					break;
				case NOT_EQUAL:
					{
					setState(521);
					((EqualityExpressionContext)_localctx).n = match(NOT_EQUAL);
					setState(522);
					((EqualityExpressionContext)_localctx).r = relationalExpression();

					            ((EqualityExpressionContext)_localctx).equalityExpressionRet =  new BinaryExpression(_localctx.equalityExpressionRet, ((EqualityExpressionContext)_localctx).r.relationalExpressionRet, BinaryOperator.neq);
					            _localctx.equalityExpressionRet.setLine(((EqualityExpressionContext)_localctx).n.getLine());
					        
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(529);
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

	public static class RelationalExpressionContext extends ParserRuleContext {
		public Expression relationalExpressionRet;
		public AdditiveExpressionContext a;
		public Token g;
		public Token l;
		public List<AdditiveExpressionContext> additiveExpression() {
			return getRuleContexts(AdditiveExpressionContext.class);
		}
		public AdditiveExpressionContext additiveExpression(int i) {
			return getRuleContext(AdditiveExpressionContext.class,i);
		}
		public List<TerminalNode> GREATER_THAN() { return getTokens(SophiaParser.GREATER_THAN); }
		public TerminalNode GREATER_THAN(int i) {
			return getToken(SophiaParser.GREATER_THAN, i);
		}
		public List<TerminalNode> LESS_THAN() { return getTokens(SophiaParser.LESS_THAN); }
		public TerminalNode LESS_THAN(int i) {
			return getToken(SophiaParser.LESS_THAN, i);
		}
		public RelationalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterRelationalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitRelationalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitRelationalExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationalExpressionContext relationalExpression() throws RecognitionException {
		RelationalExpressionContext _localctx = new RelationalExpressionContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_relationalExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(530);
			((RelationalExpressionContext)_localctx).a = additiveExpression();
			((RelationalExpressionContext)_localctx).relationalExpressionRet =  ((RelationalExpressionContext)_localctx).a.additiveExpressionRet;
			setState(542);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==GREATER_THAN || _la==LESS_THAN) {
				{
				setState(540);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case GREATER_THAN:
					{
					setState(532);
					((RelationalExpressionContext)_localctx).g = match(GREATER_THAN);
					setState(533);
					((RelationalExpressionContext)_localctx).a = additiveExpression();

					            ((RelationalExpressionContext)_localctx).relationalExpressionRet =  new BinaryExpression(_localctx.relationalExpressionRet, ((RelationalExpressionContext)_localctx).a.additiveExpressionRet, BinaryOperator.gt);
					            _localctx.relationalExpressionRet.setLine(((RelationalExpressionContext)_localctx).g.getLine());
					        
					}
					break;
				case LESS_THAN:
					{
					setState(536);
					((RelationalExpressionContext)_localctx).l = match(LESS_THAN);
					setState(537);
					((RelationalExpressionContext)_localctx).a = additiveExpression();

					            ((RelationalExpressionContext)_localctx).relationalExpressionRet =  new BinaryExpression(_localctx.relationalExpressionRet, ((RelationalExpressionContext)_localctx).a.additiveExpressionRet, BinaryOperator.lt);
					            _localctx.relationalExpressionRet.setLine(((RelationalExpressionContext)_localctx).l.getLine());
					        
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(544);
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

	public static class AdditiveExpressionContext extends ParserRuleContext {
		public Expression additiveExpressionRet;
		public MultiplicativeExpressionContext m;
		public Token plus;
		public Token minus;
		public List<MultiplicativeExpressionContext> multiplicativeExpression() {
			return getRuleContexts(MultiplicativeExpressionContext.class);
		}
		public MultiplicativeExpressionContext multiplicativeExpression(int i) {
			return getRuleContext(MultiplicativeExpressionContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(SophiaParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(SophiaParser.PLUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(SophiaParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(SophiaParser.MINUS, i);
		}
		public AdditiveExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterAdditiveExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitAdditiveExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitAdditiveExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AdditiveExpressionContext additiveExpression() throws RecognitionException {
		AdditiveExpressionContext _localctx = new AdditiveExpressionContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_additiveExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(545);
			((AdditiveExpressionContext)_localctx).m = multiplicativeExpression();
			((AdditiveExpressionContext)_localctx).additiveExpressionRet =  ((AdditiveExpressionContext)_localctx).m.multiplicativeExpressionRet;
			setState(557);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==MINUS) {
				{
				setState(555);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PLUS:
					{
					setState(547);
					((AdditiveExpressionContext)_localctx).plus = match(PLUS);
					setState(548);
					((AdditiveExpressionContext)_localctx).m = multiplicativeExpression();

					            ((AdditiveExpressionContext)_localctx).additiveExpressionRet =  new BinaryExpression(_localctx.additiveExpressionRet, ((AdditiveExpressionContext)_localctx).m.multiplicativeExpressionRet, BinaryOperator.add);
					            _localctx.additiveExpressionRet.setLine(((AdditiveExpressionContext)_localctx).plus.getLine());
					        
					}
					break;
				case MINUS:
					{
					setState(551);
					((AdditiveExpressionContext)_localctx).minus = match(MINUS);
					setState(552);
					((AdditiveExpressionContext)_localctx).m = multiplicativeExpression();

					            ((AdditiveExpressionContext)_localctx).additiveExpressionRet =  new BinaryExpression(_localctx.additiveExpressionRet, ((AdditiveExpressionContext)_localctx).m.multiplicativeExpressionRet, BinaryOperator.sub);
					            _localctx.additiveExpressionRet.setLine(((AdditiveExpressionContext)_localctx).minus.getLine());
					        
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(559);
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

	public static class MultiplicativeExpressionContext extends ParserRuleContext {
		public Expression multiplicativeExpressionRet;
		public PreUnaryExpressionContext p;
		public Token m;
		public Token d;
		public List<PreUnaryExpressionContext> preUnaryExpression() {
			return getRuleContexts(PreUnaryExpressionContext.class);
		}
		public PreUnaryExpressionContext preUnaryExpression(int i) {
			return getRuleContext(PreUnaryExpressionContext.class,i);
		}
		public List<TerminalNode> MULT() { return getTokens(SophiaParser.MULT); }
		public TerminalNode MULT(int i) {
			return getToken(SophiaParser.MULT, i);
		}
		public List<TerminalNode> DIVIDE() { return getTokens(SophiaParser.DIVIDE); }
		public TerminalNode DIVIDE(int i) {
			return getToken(SophiaParser.DIVIDE, i);
		}
		public List<TerminalNode> MOD() { return getTokens(SophiaParser.MOD); }
		public TerminalNode MOD(int i) {
			return getToken(SophiaParser.MOD, i);
		}
		public MultiplicativeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterMultiplicativeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitMultiplicativeExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitMultiplicativeExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplicativeExpressionContext multiplicativeExpression() throws RecognitionException {
		MultiplicativeExpressionContext _localctx = new MultiplicativeExpressionContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_multiplicativeExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(560);
			((MultiplicativeExpressionContext)_localctx).p = preUnaryExpression();
			((MultiplicativeExpressionContext)_localctx).multiplicativeExpressionRet =  ((MultiplicativeExpressionContext)_localctx).p.preUnaryExpressionRet;
			setState(576);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MULT) | (1L << DIVIDE) | (1L << MOD))) != 0)) {
				{
				setState(574);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case MULT:
					{
					setState(562);
					((MultiplicativeExpressionContext)_localctx).m = match(MULT);
					setState(563);
					((MultiplicativeExpressionContext)_localctx).p = preUnaryExpression();

					            ((MultiplicativeExpressionContext)_localctx).multiplicativeExpressionRet =  new BinaryExpression(_localctx.multiplicativeExpressionRet, ((MultiplicativeExpressionContext)_localctx).p.preUnaryExpressionRet, BinaryOperator.mult);
					            _localctx.multiplicativeExpressionRet.setLine(((MultiplicativeExpressionContext)_localctx).m.getLine());
					        
					}
					break;
				case DIVIDE:
					{
					setState(566);
					((MultiplicativeExpressionContext)_localctx).d = match(DIVIDE);
					setState(567);
					((MultiplicativeExpressionContext)_localctx).p = preUnaryExpression();

					            ((MultiplicativeExpressionContext)_localctx).multiplicativeExpressionRet =  new BinaryExpression(_localctx.multiplicativeExpressionRet, ((MultiplicativeExpressionContext)_localctx).p.preUnaryExpressionRet, BinaryOperator.div);
					            _localctx.multiplicativeExpressionRet.setLine(((MultiplicativeExpressionContext)_localctx).d.getLine());
					        
					}
					break;
				case MOD:
					{
					setState(570);
					((MultiplicativeExpressionContext)_localctx).m = match(MOD);
					setState(571);
					((MultiplicativeExpressionContext)_localctx).p = preUnaryExpression();

					            ((MultiplicativeExpressionContext)_localctx).multiplicativeExpressionRet =  new BinaryExpression(_localctx.multiplicativeExpressionRet, ((MultiplicativeExpressionContext)_localctx).p.preUnaryExpressionRet, BinaryOperator.mod);
					            _localctx.multiplicativeExpressionRet.setLine(((MultiplicativeExpressionContext)_localctx).m.getLine());
					        
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(578);
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

	public static class PreUnaryExpressionContext extends ParserRuleContext {
		public Expression preUnaryExpressionRet;
		public Token i;
		public PreUnaryExpressionContext p;
		public PostUnaryExpressionContext post;
		public TerminalNode NOT() { return getToken(SophiaParser.NOT, 0); }
		public PreUnaryExpressionContext preUnaryExpression() {
			return getRuleContext(PreUnaryExpressionContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(SophiaParser.MINUS, 0); }
		public TerminalNode INCREMENT() { return getToken(SophiaParser.INCREMENT, 0); }
		public TerminalNode DECREMENT() { return getToken(SophiaParser.DECREMENT, 0); }
		public PostUnaryExpressionContext postUnaryExpression() {
			return getRuleContext(PostUnaryExpressionContext.class,0);
		}
		public PreUnaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_preUnaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterPreUnaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitPreUnaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitPreUnaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PreUnaryExpressionContext preUnaryExpression() throws RecognitionException {
		PreUnaryExpressionContext _localctx = new PreUnaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_preUnaryExpression);
		try {
			setState(600);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MINUS:
			case NOT:
			case INCREMENT:
			case DECREMENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(595);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NOT:
					{
					setState(579);
					((PreUnaryExpressionContext)_localctx).i = match(NOT);
					setState(580);
					((PreUnaryExpressionContext)_localctx).p = preUnaryExpression();

					            ((PreUnaryExpressionContext)_localctx).preUnaryExpressionRet =  new UnaryExpression(((PreUnaryExpressionContext)_localctx).p.preUnaryExpressionRet, UnaryOperator.not);
					            _localctx.preUnaryExpressionRet.setLine(((PreUnaryExpressionContext)_localctx).i.getLine());
					        
					}
					break;
				case MINUS:
					{
					setState(583);
					((PreUnaryExpressionContext)_localctx).i = match(MINUS);
					setState(584);
					((PreUnaryExpressionContext)_localctx).p = preUnaryExpression();

					            ((PreUnaryExpressionContext)_localctx).preUnaryExpressionRet =  new UnaryExpression(((PreUnaryExpressionContext)_localctx).p.preUnaryExpressionRet, UnaryOperator.minus);
					            _localctx.preUnaryExpressionRet.setLine(((PreUnaryExpressionContext)_localctx).i.getLine());
					        
					}
					break;
				case INCREMENT:
					{
					setState(587);
					((PreUnaryExpressionContext)_localctx).i = match(INCREMENT);
					setState(588);
					((PreUnaryExpressionContext)_localctx).p = preUnaryExpression();

					            ((PreUnaryExpressionContext)_localctx).preUnaryExpressionRet =  new UnaryExpression(((PreUnaryExpressionContext)_localctx).p.preUnaryExpressionRet, UnaryOperator.preinc);
					            _localctx.preUnaryExpressionRet.setLine(((PreUnaryExpressionContext)_localctx).i.getLine());
					        
					}
					break;
				case DECREMENT:
					{
					setState(591);
					((PreUnaryExpressionContext)_localctx).i = match(DECREMENT);
					setState(592);
					((PreUnaryExpressionContext)_localctx).p = preUnaryExpression();

					            ((PreUnaryExpressionContext)_localctx).preUnaryExpressionRet =  new UnaryExpression(((PreUnaryExpressionContext)_localctx).p.preUnaryExpressionRet, UnaryOperator.predec);
					            _localctx.preUnaryExpressionRet.setLine(((PreUnaryExpressionContext)_localctx).i.getLine());
					        
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case NEW:
			case NULL:
			case TRUE:
			case FALSE:
			case THIS:
			case LPAR:
			case LBRACK:
			case INT_VALUE:
			case IDENTIFIER:
			case STRING_VALUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(597);
				((PreUnaryExpressionContext)_localctx).post = postUnaryExpression();
				((PreUnaryExpressionContext)_localctx).preUnaryExpressionRet =  ((PreUnaryExpressionContext)_localctx).post.postUnaryExpressionRet;
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

	public static class PostUnaryExpressionContext extends ParserRuleContext {
		public Expression postUnaryExpressionRet;
		public AccessExpressionContext a;
		public Token i;
		public Token d;
		public AccessExpressionContext accessExpression() {
			return getRuleContext(AccessExpressionContext.class,0);
		}
		public TerminalNode INCREMENT() { return getToken(SophiaParser.INCREMENT, 0); }
		public TerminalNode DECREMENT() { return getToken(SophiaParser.DECREMENT, 0); }
		public PostUnaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postUnaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterPostUnaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitPostUnaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitPostUnaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PostUnaryExpressionContext postUnaryExpression() throws RecognitionException {
		PostUnaryExpressionContext _localctx = new PostUnaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_postUnaryExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(602);
			((PostUnaryExpressionContext)_localctx).a = accessExpression();
			((PostUnaryExpressionContext)_localctx).postUnaryExpressionRet =  ((PostUnaryExpressionContext)_localctx).a.accessExpressionRet;
			setState(608);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INCREMENT:
				{
				setState(604);
				((PostUnaryExpressionContext)_localctx).i = match(INCREMENT);

				            ((PostUnaryExpressionContext)_localctx).postUnaryExpressionRet =  new UnaryExpression(((PostUnaryExpressionContext)_localctx).a.accessExpressionRet, UnaryOperator.postinc);
				            _localctx.postUnaryExpressionRet.setLine(((PostUnaryExpressionContext)_localctx).i.getLine());
				        
				}
				break;
			case DECREMENT:
				{
				setState(606);
				((PostUnaryExpressionContext)_localctx).d = match(DECREMENT);

				            ((PostUnaryExpressionContext)_localctx).postUnaryExpressionRet =  new UnaryExpression(((PostUnaryExpressionContext)_localctx).a.accessExpressionRet, UnaryOperator.postdec);
				            _localctx.postUnaryExpressionRet.setLine(((PostUnaryExpressionContext)_localctx).d.getLine());
				        
				}
				break;
			case GREATER_THAN:
			case LESS_THAN:
			case NOT_EQUAL:
			case EQUAL:
			case MULT:
			case DIVIDE:
			case MOD:
			case PLUS:
			case MINUS:
			case AND:
			case OR:
			case ASSIGN:
			case RPAR:
			case RBRACK:
			case COMMA:
			case SEMICOLLON:
				break;
			default:
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

	public static class AccessExpressionContext extends ParserRuleContext {
		public Expression accessExpressionRet;
		public OtherExpressionContext o;
		public Token l;
		public MethodCallArgumentsContext m;
		public IdentifierContext i;
		public Token lbrack;
		public ExpressionContext e;
		public OtherExpressionContext otherExpression() {
			return getRuleContext(OtherExpressionContext.class,0);
		}
		public List<TerminalNode> RPAR() { return getTokens(SophiaParser.RPAR); }
		public TerminalNode RPAR(int i) {
			return getToken(SophiaParser.RPAR, i);
		}
		public List<TerminalNode> DOT() { return getTokens(SophiaParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(SophiaParser.DOT, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(SophiaParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(SophiaParser.RBRACK, i);
		}
		public List<TerminalNode> LPAR() { return getTokens(SophiaParser.LPAR); }
		public TerminalNode LPAR(int i) {
			return getToken(SophiaParser.LPAR, i);
		}
		public List<MethodCallArgumentsContext> methodCallArguments() {
			return getRuleContexts(MethodCallArgumentsContext.class);
		}
		public MethodCallArgumentsContext methodCallArguments(int i) {
			return getRuleContext(MethodCallArgumentsContext.class,i);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> LBRACK() { return getTokens(SophiaParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(SophiaParser.LBRACK, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public AccessExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accessExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterAccessExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitAccessExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitAccessExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AccessExpressionContext accessExpression() throws RecognitionException {
		AccessExpressionContext _localctx = new AccessExpressionContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_accessExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(610);
			((AccessExpressionContext)_localctx).o = otherExpression();
			((AccessExpressionContext)_localctx).accessExpressionRet =  ((AccessExpressionContext)_localctx).o.otherExpressionRet;
			setState(628);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAR) | (1L << LBRACK) | (1L << DOT))) != 0)) {
				{
				setState(626);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LPAR:
					{
					{
					setState(612);
					((AccessExpressionContext)_localctx).l = match(LPAR);
					setState(613);
					((AccessExpressionContext)_localctx).m = methodCallArguments();

					            MethodCall method = new MethodCall(_localctx.accessExpressionRet, ((AccessExpressionContext)_localctx).m.methodCallArgumentsRet);
					            method.setLine(((AccessExpressionContext)_localctx).l.getLine());
					            ((AccessExpressionContext)_localctx).accessExpressionRet =  method;
					        
					setState(615);
					match(RPAR);
					}
					}
					break;
				case DOT:
					{
					{
					setState(617);
					match(DOT);
					setState(618);
					((AccessExpressionContext)_localctx).i = identifier();

					            ObjectOrListMemberAccess object = new ObjectOrListMemberAccess(_localctx.accessExpressionRet ,((AccessExpressionContext)_localctx).i.identifierRet);
					            object.setLine(((AccessExpressionContext)_localctx).i.identifierRet.getLine());
					            ((AccessExpressionContext)_localctx).accessExpressionRet =  object;
					        
					}
					}
					break;
				case LBRACK:
					{
					{
					setState(621);
					((AccessExpressionContext)_localctx).lbrack = match(LBRACK);
					setState(622);
					((AccessExpressionContext)_localctx).e = expression();

					            ListAccessByIndex listAccess = new ListAccessByIndex(_localctx.accessExpressionRet, ((AccessExpressionContext)_localctx).e.expressionRet);
					            listAccess.setLine(((AccessExpressionContext)_localctx).lbrack.getLine());
					            ((AccessExpressionContext)_localctx).accessExpressionRet =  listAccess;
					        
					setState(624);
					match(RBRACK);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(630);
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

	public static class OtherExpressionContext extends ParserRuleContext {
		public Expression otherExpressionRet;
		public Token t;
		public NewExpressionContext n;
		public ValuesContext v;
		public IdentifierContext i;
		public ExpressionContext e;
		public TerminalNode THIS() { return getToken(SophiaParser.THIS, 0); }
		public NewExpressionContext newExpression() {
			return getRuleContext(NewExpressionContext.class,0);
		}
		public ValuesContext values() {
			return getRuleContext(ValuesContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LPAR() { return getToken(SophiaParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(SophiaParser.RPAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public OtherExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_otherExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterOtherExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitOtherExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitOtherExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OtherExpressionContext otherExpression() throws RecognitionException {
		OtherExpressionContext _localctx = new OtherExpressionContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_otherExpression);
		try {
			setState(648);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case THIS:
				enterOuterAlt(_localctx, 1);
				{
				setState(631);
				((OtherExpressionContext)_localctx).t = match(THIS);

				        ((OtherExpressionContext)_localctx).otherExpressionRet =  new ThisClass();
				        _localctx.otherExpressionRet.setLine(((OtherExpressionContext)_localctx).t.getLine());
				    
				}
				break;
			case NEW:
				enterOuterAlt(_localctx, 2);
				{
				setState(633);
				((OtherExpressionContext)_localctx).n = newExpression();
				((OtherExpressionContext)_localctx).otherExpressionRet =  ((OtherExpressionContext)_localctx).n.newExpressionRet;
				}
				break;
			case NULL:
			case TRUE:
			case FALSE:
			case LBRACK:
			case INT_VALUE:
			case STRING_VALUE:
				enterOuterAlt(_localctx, 3);
				{
				setState(636);
				((OtherExpressionContext)_localctx).v = values();
				((OtherExpressionContext)_localctx).otherExpressionRet =  ((OtherExpressionContext)_localctx).v.valuesRet;
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 4);
				{
				setState(639);
				((OtherExpressionContext)_localctx).i = identifier();
				((OtherExpressionContext)_localctx).otherExpressionRet =  ((OtherExpressionContext)_localctx).i.identifierRet;
				}
				break;
			case LPAR:
				enterOuterAlt(_localctx, 5);
				{
				setState(642);
				match(LPAR);
				{
				setState(643);
				((OtherExpressionContext)_localctx).e = expression();
				((OtherExpressionContext)_localctx).otherExpressionRet =  ((OtherExpressionContext)_localctx).e.expressionRet;
				}
				setState(646);
				match(RPAR);
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

	public static class NewExpressionContext extends ParserRuleContext {
		public NewClassInstance newExpressionRet;
		public Token n;
		public ClassTypeContext c;
		public MethodCallArgumentsContext m;
		public TerminalNode LPAR() { return getToken(SophiaParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(SophiaParser.RPAR, 0); }
		public TerminalNode NEW() { return getToken(SophiaParser.NEW, 0); }
		public ClassTypeContext classType() {
			return getRuleContext(ClassTypeContext.class,0);
		}
		public MethodCallArgumentsContext methodCallArguments() {
			return getRuleContext(MethodCallArgumentsContext.class,0);
		}
		public NewExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterNewExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitNewExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitNewExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NewExpressionContext newExpression() throws RecognitionException {
		NewExpressionContext _localctx = new NewExpressionContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_newExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(650);
			((NewExpressionContext)_localctx).n = match(NEW);
			setState(651);
			((NewExpressionContext)_localctx).c = classType();
			setState(652);
			match(LPAR);
			setState(653);
			((NewExpressionContext)_localctx).m = methodCallArguments();

			        ((NewExpressionContext)_localctx).newExpressionRet =  new NewClassInstance(((NewExpressionContext)_localctx).c.classTypeRet, ((NewExpressionContext)_localctx).m.methodCallArgumentsRet);
			        _localctx.newExpressionRet.setLine(((NewExpressionContext)_localctx).n.getLine());
			    
			setState(655);
			match(RPAR);
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

	public static class ValuesContext extends ParserRuleContext {
		public Value valuesRet;
		public BoolValueContext b;
		public Token s;
		public Token i;
		public Token n;
		public ListValueContext l;
		public BoolValueContext boolValue() {
			return getRuleContext(BoolValueContext.class,0);
		}
		public TerminalNode STRING_VALUE() { return getToken(SophiaParser.STRING_VALUE, 0); }
		public TerminalNode INT_VALUE() { return getToken(SophiaParser.INT_VALUE, 0); }
		public TerminalNode NULL() { return getToken(SophiaParser.NULL, 0); }
		public ListValueContext listValue() {
			return getRuleContext(ListValueContext.class,0);
		}
		public ValuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_values; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterValues(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitValues(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitValues(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValuesContext values() throws RecognitionException {
		ValuesContext _localctx = new ValuesContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_values);
		try {
			setState(669);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 1);
				{
				setState(657);
				((ValuesContext)_localctx).b = boolValue();

				        ((ValuesContext)_localctx).valuesRet =  ((ValuesContext)_localctx).b.boolValueRet;
				    
				}
				break;
			case STRING_VALUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(660);
				((ValuesContext)_localctx).s = match(STRING_VALUE);

				        ((ValuesContext)_localctx).valuesRet =  new StringValue((((ValuesContext)_localctx).s!=null?((ValuesContext)_localctx).s.getText():null));
				        _localctx.valuesRet.setLine(((ValuesContext)_localctx).s.getLine());
				    
				}
				break;
			case INT_VALUE:
				enterOuterAlt(_localctx, 3);
				{
				setState(662);
				((ValuesContext)_localctx).i = match(INT_VALUE);

				        ((ValuesContext)_localctx).valuesRet =  new IntValue((((ValuesContext)_localctx).i!=null?Integer.valueOf(((ValuesContext)_localctx).i.getText()):0));
				        _localctx.valuesRet.setLine(((ValuesContext)_localctx).i.getLine());
				    
				}
				break;
			case NULL:
				enterOuterAlt(_localctx, 4);
				{
				setState(664);
				((ValuesContext)_localctx).n = match(NULL);

				        ((ValuesContext)_localctx).valuesRet =  new NullValue();
				        _localctx.valuesRet.setLine(((ValuesContext)_localctx).n.getLine());
				    
				}
				break;
			case LBRACK:
				enterOuterAlt(_localctx, 5);
				{
				setState(666);
				((ValuesContext)_localctx).l = listValue();

				        ((ValuesContext)_localctx).valuesRet =  ((ValuesContext)_localctx).l.listValueRet;
				    
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

	public static class BoolValueContext extends ParserRuleContext {
		public BoolValue boolValueRet;
		public Token t;
		public Token f;
		public TerminalNode TRUE() { return getToken(SophiaParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(SophiaParser.FALSE, 0); }
		public BoolValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterBoolValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitBoolValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitBoolValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolValueContext boolValue() throws RecognitionException {
		BoolValueContext _localctx = new BoolValueContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_boolValue);
		try {
			setState(675);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(671);
				((BoolValueContext)_localctx).t = match(TRUE);

				        ((BoolValueContext)_localctx).boolValueRet =  new BoolValue(true);
				        _localctx.boolValueRet.setLine(((BoolValueContext)_localctx).t.getLine());
				    
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 2);
				{
				setState(673);
				((BoolValueContext)_localctx).f = match(FALSE);

				        ((BoolValueContext)_localctx).boolValueRet =  new BoolValue(false);
				        _localctx.boolValueRet.setLine(((BoolValueContext)_localctx).f.getLine());
				    
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

	public static class ListValueContext extends ParserRuleContext {
		public ListValue listValueRet;
		public Token l;
		public MethodCallArgumentsContext m;
		public TerminalNode RBRACK() { return getToken(SophiaParser.RBRACK, 0); }
		public TerminalNode LBRACK() { return getToken(SophiaParser.LBRACK, 0); }
		public MethodCallArgumentsContext methodCallArguments() {
			return getRuleContext(MethodCallArgumentsContext.class,0);
		}
		public ListValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterListValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitListValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitListValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListValueContext listValue() throws RecognitionException {
		ListValueContext _localctx = new ListValueContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_listValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(677);
			((ListValueContext)_localctx).l = match(LBRACK);
			setState(678);
			((ListValueContext)_localctx).m = methodCallArguments();

			        ((ListValueContext)_localctx).listValueRet =  new ListValue(((ListValueContext)_localctx).m.methodCallArgumentsRet);
			        _localctx.listValueRet.setLine(((ListValueContext)_localctx).l.getLine());
			    
			setState(680);
			match(RBRACK);
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

	public static class IdentifierContext extends ParserRuleContext {
		public Identifier identifierRet;
		public Token i;
		public TerminalNode IDENTIFIER() { return getToken(SophiaParser.IDENTIFIER, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(682);
			((IdentifierContext)_localctx).i = match(IDENTIFIER);

			        ((IdentifierContext)_localctx).identifierRet =  new Identifier((((IdentifierContext)_localctx).i!=null?((IdentifierContext)_localctx).i.getText():null));
			        _localctx.identifierRet.setLine(((IdentifierContext)_localctx).i.getLine());
			    
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3:\u02b0\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\7\3g\n\3\f\3\16"+
		"\3j\13\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4s\n\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\7\4|\n\4\f\4\16\4\177\13\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4\u0089"+
		"\n\4\f\4\16\4\u008c\13\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4\u0094\n\4\f\4\16"+
		"\4\u0097\13\4\5\4\u0099\n\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u00ac\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\7\b\u00c8\n\b\f\b\16\b\u00cb\13\b\5\b\u00cd\n\b\3\t\3\t\3\t\3\t\3"+
		"\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00e0\n\n\3\13"+
		"\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00ef\n\f\3\f\3"+
		"\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u00fa\n\r\f\r\16\r\u00fd\13\r\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\5\16\u0105\n\16\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\5\17\u010f\n\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u0117\n"+
		"\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u0122\n\20\f\20"+
		"\16\20\u0125\13\20\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u012d\n\21\3\22"+
		"\3\22\3\22\3\22\7\22\u0133\n\22\f\22\16\22\u0136\13\22\3\22\3\22\3\22"+
		"\7\22\u013b\n\22\f\22\16\22\u013e\13\22\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u015b\n\23\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\7\24\u0163\n\24\f\24\16\24\u0166\13\24\3\24\3\24\3\25\3\25"+
		"\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u0180\n\30\3\30\3\30\3\31\3\31\3\31"+
		"\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\7\32\u0198\n\32\f\32\16\32\u019b\13\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\7\33\u01aa\n\33\f\33"+
		"\16\33\u01ad\13\33\5\33\u01af\n\33\3\34\3\34\3\34\3\34\5\34\u01b5\n\34"+
		"\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u01c0\n\35\3\35\3\35"+
		"\3\35\3\35\5\35\u01c6\n\35\3\35\3\35\3\35\3\35\5\35\u01cc\n\35\3\35\3"+
		"\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3"+
		"\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\5\37\u01e6\n\37\3 \3 \3 \3"+
		" \3 \3 \5 \u01ee\n \3!\3!\3!\3!\3!\3!\7!\u01f6\n!\f!\16!\u01f9\13!\3\""+
		"\3\"\3\"\3\"\3\"\3\"\7\"\u0201\n\"\f\"\16\"\u0204\13\"\3#\3#\3#\3#\3#"+
		"\3#\3#\3#\3#\3#\7#\u0210\n#\f#\16#\u0213\13#\3$\3$\3$\3$\3$\3$\3$\3$\3"+
		"$\3$\7$\u021f\n$\f$\16$\u0222\13$\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\7%\u022e"+
		"\n%\f%\16%\u0231\13%\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\7&\u0241"+
		"\n&\f&\16&\u0244\13&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3"+
		"\'\3\'\3\'\3\'\5\'\u0256\n\'\3\'\3\'\3\'\5\'\u025b\n\'\3(\3(\3(\3(\3("+
		"\3(\5(\u0263\n(\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\7)\u0275"+
		"\n)\f)\16)\u0278\13)\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3"+
		"*\5*\u028b\n*\3+\3+\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3"+
		",\5,\u02a0\n,\3-\3-\3-\3-\5-\u02a6\n-\3.\3.\3.\3.\3.\3/\3/\3/\3/\2\2\60"+
		"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFH"+
		"JLNPRTVXZ\\\2\2\2\u02cc\2^\3\2\2\2\4b\3\2\2\2\6k\3\2\2\2\b\u009c\3\2\2"+
		"\2\n\u00a2\3\2\2\2\f\u00b5\3\2\2\2\16\u00c0\3\2\2\2\20\u00ce\3\2\2\2\22"+
		"\u00df\3\2\2\2\24\u00e1\3\2\2\2\26\u00e4\3\2\2\2\30\u00f2\3\2\2\2\32\u0104"+
		"\3\2\2\2\34\u0106\3\2\2\2\36\u011a\3\2\2\2 \u012c\3\2\2\2\"\u012e\3\2"+
		"\2\2$\u015a\3\2\2\2&\u015c\3\2\2\2(\u0169\3\2\2\2*\u016d\3\2\2\2,\u0172"+
		"\3\2\2\2.\u0179\3\2\2\2\60\u0183\3\2\2\2\62\u0187\3\2\2\2\64\u01a2\3\2"+
		"\2\2\66\u01b4\3\2\2\28\u01b8\3\2\2\2:\u01d1\3\2\2\2<\u01db\3\2\2\2>\u01e7"+
		"\3\2\2\2@\u01ef\3\2\2\2B\u01fa\3\2\2\2D\u0205\3\2\2\2F\u0214\3\2\2\2H"+
		"\u0223\3\2\2\2J\u0232\3\2\2\2L\u025a\3\2\2\2N\u025c\3\2\2\2P\u0264\3\2"+
		"\2\2R\u028a\3\2\2\2T\u028c\3\2\2\2V\u029f\3\2\2\2X\u02a5\3\2\2\2Z\u02a7"+
		"\3\2\2\2\\\u02ac\3\2\2\2^_\5\4\3\2_`\b\2\1\2`a\7\2\2\3a\3\3\2\2\2bh\b"+
		"\3\1\2cd\5\6\4\2de\b\3\1\2eg\3\2\2\2fc\3\2\2\2gj\3\2\2\2hf\3\2\2\2hi\3"+
		"\2\2\2i\5\3\2\2\2jh\3\2\2\2kl\7\5\2\2lm\5\\/\2mr\b\4\1\2no\7\4\2\2op\5"+
		"\\/\2pq\b\4\1\2qs\3\2\2\2rn\3\2\2\2rs\3\2\2\2st\3\2\2\2t\u0098\7/\2\2"+
		"uv\5\b\5\2vw\b\4\1\2w|\3\2\2\2xy\5\n\6\2yz\b\4\1\2z|\3\2\2\2{u\3\2\2\2"+
		"{x\3\2\2\2|\177\3\2\2\2}{\3\2\2\2}~\3\2\2\2~\u0080\3\2\2\2\177}\3\2\2"+
		"\2\u0080\u0081\5\f\7\2\u0081\u008a\b\4\1\2\u0082\u0083\5\b\5\2\u0083\u0084"+
		"\b\4\1\2\u0084\u0089\3\2\2\2\u0085\u0086\5\n\6\2\u0086\u0087\b\4\1\2\u0087"+
		"\u0089\3\2\2\2\u0088\u0082\3\2\2\2\u0088\u0085\3\2\2\2\u0089\u008c\3\2"+
		"\2\2\u008a\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u0099\3\2\2\2\u008c"+
		"\u008a\3\2\2\2\u008d\u008e\5\b\5\2\u008e\u008f\b\4\1\2\u008f\u0094\3\2"+
		"\2\2\u0090\u0091\5\n\6\2\u0091\u0092\b\4\1\2\u0092\u0094\3\2\2\2\u0093"+
		"\u008d\3\2\2\2\u0093\u0090\3\2\2\2\u0094\u0097\3\2\2\2\u0095\u0093\3\2"+
		"\2\2\u0095\u0096\3\2\2\2\u0096\u0099\3\2\2\2\u0097\u0095\3\2\2\2\u0098"+
		"}\3\2\2\2\u0098\u0095\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u009b\7\60\2\2"+
		"\u009b\7\3\2\2\2\u009c\u009d\5\\/\2\u009d\u009e\7\64\2\2\u009e\u009f\5"+
		"\22\n\2\u009f\u00a0\b\5\1\2\u00a0\u00a1\7\65\2\2\u00a1\t\3\2\2\2\u00a2"+
		"\u00ab\7\3\2\2\u00a3\u00a4\5\22\n\2\u00a4\u00a5\5\\/\2\u00a5\u00a6\b\6"+
		"\1\2\u00a6\u00ac\3\2\2\2\u00a7\u00a8\7\24\2\2\u00a8\u00a9\5\\/\2\u00a9"+
		"\u00aa\b\6\1\2\u00aa\u00ac\3\2\2\2\u00ab\u00a3\3\2\2\2\u00ab\u00a7\3\2"+
		"\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00ae\7+\2\2\u00ae\u00af\5\16\b\2\u00af"+
		"\u00b0\7,\2\2\u00b0\u00b1\7/\2\2\u00b1\u00b2\5\"\22\2\u00b2\u00b3\7\60"+
		"\2\2\u00b3\u00b4\b\6\1\2\u00b4\13\3\2\2\2\u00b5\u00b6\7\3\2\2\u00b6\u00b7"+
		"\5\\/\2\u00b7\u00b8\7+\2\2\u00b8\u00b9\b\7\1\2\u00b9\u00ba\5\16\b\2\u00ba"+
		"\u00bb\7,\2\2\u00bb\u00bc\7/\2\2\u00bc\u00bd\5\"\22\2\u00bd\u00be\7\60"+
		"\2\2\u00be\u00bf\b\7\1\2\u00bf\r\3\2\2\2\u00c0\u00cc\b\b\1\2\u00c1\u00c2"+
		"\5\20\t\2\u00c2\u00c9\b\b\1\2\u00c3\u00c4\7\62\2\2\u00c4\u00c5\5\20\t"+
		"\2\u00c5\u00c6\b\b\1\2\u00c6\u00c8\3\2\2\2\u00c7\u00c3\3\2\2\2\u00c8\u00cb"+
		"\3\2\2\2\u00c9\u00c7\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00cd\3\2\2\2\u00cb"+
		"\u00c9\3\2\2\2\u00cc\u00c1\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\17\3\2\2"+
		"\2\u00ce\u00cf\5\\/\2\u00cf\u00d0\7\64\2\2\u00d0\u00d1\5\22\n\2\u00d1"+
		"\u00d2\b\t\1\2\u00d2\21\3\2\2\2\u00d3\u00d4\5 \21\2\u00d4\u00d5\b\n\1"+
		"\2\u00d5\u00e0\3\2\2\2\u00d6\u00d7\5\26\f\2\u00d7\u00d8\b\n\1\2\u00d8"+
		"\u00e0\3\2\2\2\u00d9\u00da\5\34\17\2\u00da\u00db\b\n\1\2\u00db\u00e0\3"+
		"\2\2\2\u00dc\u00dd\5\24\13\2\u00dd\u00de\b\n\1\2\u00de\u00e0\3\2\2\2\u00df"+
		"\u00d3\3\2\2\2\u00df\u00d6\3\2\2\2\u00df\u00d9\3\2\2\2\u00df\u00dc\3\2"+
		"\2\2\u00e0\23\3\2\2\2\u00e1\u00e2\5\\/\2\u00e2\u00e3\b\13\1\2\u00e3\25"+
		"\3\2\2\2\u00e4\u00e5\7\26\2\2\u00e5\u00ee\7+\2\2\u00e6\u00e7\7\66\2\2"+
		"\u00e7\u00e8\7\61\2\2\u00e8\u00e9\5\22\n\2\u00e9\u00ea\b\f\1\2\u00ea\u00ef"+
		"\3\2\2\2\u00eb\u00ec\5\30\r\2\u00ec\u00ed\b\f\1\2\u00ed\u00ef\3\2\2\2"+
		"\u00ee\u00e6\3\2\2\2\u00ee\u00eb\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00f1"+
		"\7,\2\2\u00f1\27\3\2\2\2\u00f2\u00f3\b\r\1\2\u00f3\u00f4\5\32\16\2\u00f4"+
		"\u00fb\b\r\1\2\u00f5\u00f6\7\62\2\2\u00f6\u00f7\5\32\16\2\u00f7\u00f8"+
		"\b\r\1\2\u00f8\u00fa\3\2\2\2\u00f9\u00f5\3\2\2\2\u00fa\u00fd\3\2\2\2\u00fb"+
		"\u00f9\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\31\3\2\2\2\u00fd\u00fb\3\2\2"+
		"\2\u00fe\u00ff\5\20\t\2\u00ff\u0100\b\16\1\2\u0100\u0105\3\2\2\2\u0101"+
		"\u0102\5\22\n\2\u0102\u0103\b\16\1\2\u0103\u0105\3\2\2\2\u0104\u00fe\3"+
		"\2\2\2\u0104\u0101\3\2\2\2\u0105\33\3\2\2\2\u0106\u0107\b\17\1\2\u0107"+
		"\u0108\7\7\2\2\u0108\u010e\7\34\2\2\u0109\u010a\7\24\2\2\u010a\u010f\b"+
		"\17\1\2\u010b\u010c\5\36\20\2\u010c\u010d\b\17\1\2\u010d\u010f\3\2\2\2"+
		"\u010e\u0109\3\2\2\2\u010e\u010b\3\2\2\2\u010f\u0110\3\2\2\2\u0110\u0116"+
		"\7\32\2\2\u0111\u0112\7\24\2\2\u0112\u0117\b\17\1\2\u0113\u0114\5\22\n"+
		"\2\u0114\u0115\b\17\1\2\u0115\u0117\3\2\2\2\u0116\u0111\3\2\2\2\u0116"+
		"\u0113\3\2\2\2\u0117\u0118\3\2\2\2\u0118\u0119\7\33\2\2\u0119\35\3\2\2"+
		"\2\u011a\u011b\b\20\1\2\u011b\u011c\5\22\n\2\u011c\u0123\b\20\1\2\u011d"+
		"\u011e\7\62\2\2\u011e\u011f\5\22\n\2\u011f\u0120\b\20\1\2\u0120\u0122"+
		"\3\2\2\2\u0121\u011d\3\2\2\2\u0122\u0125\3\2\2\2\u0123\u0121\3\2\2\2\u0123"+
		"\u0124\3\2\2\2\u0124\37\3\2\2\2\u0125\u0123\3\2\2\2\u0126\u0127\7\23\2"+
		"\2\u0127\u012d\b\21\1\2\u0128\u0129\7\22\2\2\u0129\u012d\b\21\1\2\u012a"+
		"\u012b\7\21\2\2\u012b\u012d\b\21\1\2\u012c\u0126\3\2\2\2\u012c\u0128\3"+
		"\2\2\2\u012c\u012a\3\2\2\2\u012d!\3\2\2\2\u012e\u0134\b\22\1\2\u012f\u0130"+
		"\5\b\5\2\u0130\u0131\b\22\1\2\u0131\u0133\3\2\2\2\u0132\u012f\3\2\2\2"+
		"\u0133\u0136\3\2\2\2\u0134\u0132\3\2\2\2\u0134\u0135\3\2\2\2\u0135\u013c"+
		"\3\2\2\2\u0136\u0134\3\2\2\2\u0137\u0138\5$\23\2\u0138\u0139\b\22\1\2"+
		"\u0139\u013b\3\2\2\2\u013a\u0137\3\2\2\2\u013b\u013e\3\2\2\2\u013c\u013a"+
		"\3\2\2\2\u013c\u013d\3\2\2\2\u013d#\3\2\2\2\u013e\u013c\3\2\2\2\u013f"+
		"\u0140\58\35\2\u0140\u0141\b\23\1\2\u0141\u015b\3\2\2\2\u0142\u0143\5"+
		":\36\2\u0143\u0144\b\23\1\2\u0144\u015b\3\2\2\2\u0145\u0146\5<\37\2\u0146"+
		"\u0147\b\23\1\2\u0147\u015b\3\2\2\2\u0148\u0149\5(\25\2\u0149\u014a\b"+
		"\23\1\2\u014a\u015b\3\2\2\2\u014b\u014c\5,\27\2\u014c\u014d\b\23\1\2\u014d"+
		"\u015b\3\2\2\2\u014e\u014f\5\66\34\2\u014f\u0150\b\23\1\2\u0150\u015b"+
		"\3\2\2\2\u0151\u0152\5\60\31\2\u0152\u0153\b\23\1\2\u0153\u015b\3\2\2"+
		"\2\u0154\u0155\5.\30\2\u0155\u0156\b\23\1\2\u0156\u015b\3\2\2\2\u0157"+
		"\u0158\5&\24\2\u0158\u0159\b\23\1\2\u0159\u015b\3\2\2\2\u015a\u013f\3"+
		"\2\2\2\u015a\u0142\3\2\2\2\u015a\u0145\3\2\2\2\u015a\u0148\3\2\2\2\u015a"+
		"\u014b\3\2\2\2\u015a\u014e\3\2\2\2\u015a\u0151\3\2\2\2\u015a\u0154\3\2"+
		"\2\2\u015a\u0157\3\2\2\2\u015b%\3\2\2\2\u015c\u015d\b\24\1\2\u015d\u015e"+
		"\7/\2\2\u015e\u0164\b\24\1\2\u015f\u0160\5$\23\2\u0160\u0161\b\24\1\2"+
		"\u0161\u0163\3\2\2\2\u0162\u015f\3\2\2\2\u0163\u0166\3\2\2\2\u0164\u0162"+
		"\3\2\2\2\u0164\u0165\3\2\2\2\u0165\u0167\3\2\2\2\u0166\u0164\3\2\2\2\u0167"+
		"\u0168\7\60\2\2\u0168\'\3\2\2\2\u0169\u016a\5*\26\2\u016a\u016b\b\25\1"+
		"\2\u016b\u016c\7\65\2\2\u016c)\3\2\2\2\u016d\u016e\5@!\2\u016e\u016f\7"+
		"(\2\2\u016f\u0170\5> \2\u0170\u0171\b\26\1\2\u0171+\3\2\2\2\u0172\u0173"+
		"\7\6\2\2\u0173\u0174\7+\2\2\u0174\u0175\5> \2\u0175\u0176\b\27\1\2\u0176"+
		"\u0177\7,\2\2\u0177\u0178\7\65\2\2\u0178-\3\2\2\2\u0179\u017a\b\30\1\2"+
		"\u017a\u017b\7\13\2\2\u017b\u017f\b\30\1\2\u017c\u017d\5> \2\u017d\u017e"+
		"\b\30\1\2\u017e\u0180\3\2\2\2\u017f\u017c\3\2\2\2\u017f\u0180\3\2\2\2"+
		"\u0180\u0181\3\2\2\2\u0181\u0182\7\65\2\2\u0182/\3\2\2\2\u0183\u0184\5"+
		"\62\32\2\u0184\u0185\b\31\1\2\u0185\u0186\7\65\2\2\u0186\61\3\2\2\2\u0187"+
		"\u0188\5R*\2\u0188\u0199\b\32\1\2\u0189\u018a\7+\2\2\u018a\u018b\5\64"+
		"\33\2\u018b\u018c\b\32\1\2\u018c\u018d\7,\2\2\u018d\u0198\3\2\2\2\u018e"+
		"\u018f\7\63\2\2\u018f\u0190\5\\/\2\u0190\u0191\b\32\1\2\u0191\u0198\3"+
		"\2\2\2\u0192\u0193\7-\2\2\u0193\u0194\5> \2\u0194\u0195\b\32\1\2\u0195"+
		"\u0196\7.\2\2\u0196\u0198\3\2\2\2\u0197\u0189\3\2\2\2\u0197\u018e\3\2"+
		"\2\2\u0197\u0192\3\2\2\2\u0198\u019b\3\2\2\2\u0199\u0197\3\2\2\2\u0199"+
		"\u019a\3\2\2\2\u019a\u019c\3\2\2\2\u019b\u0199\3\2\2\2\u019c\u019d\7+"+
		"\2\2\u019d\u019e\5\64\33\2\u019e\u019f\7,\2\2\u019f\u01a0\3\2\2\2\u01a0"+
		"\u01a1\b\32\1\2\u01a1\63\3\2\2\2\u01a2\u01ae\b\33\1\2\u01a3\u01a4\5> "+
		"\2\u01a4\u01ab\b\33\1\2\u01a5\u01a6\7\62\2\2\u01a6\u01a7\5> \2\u01a7\u01a8"+
		"\b\33\1\2\u01a8\u01aa\3\2\2\2\u01a9\u01a5\3\2\2\2\u01aa\u01ad\3\2\2\2"+
		"\u01ab\u01a9\3\2\2\2\u01ab\u01ac\3\2\2\2\u01ac\u01af\3\2\2\2\u01ad\u01ab"+
		"\3\2\2\2\u01ae\u01a3\3\2\2\2\u01ae\u01af\3\2\2\2\u01af\65\3\2\2\2\u01b0"+
		"\u01b1\7\n\2\2\u01b1\u01b5\b\34\1\2\u01b2\u01b3\7\t\2\2\u01b3\u01b5\b"+
		"\34\1\2\u01b4\u01b0\3\2\2\2\u01b4\u01b2\3\2\2\2\u01b5\u01b6\3\2\2\2\u01b6"+
		"\u01b7\7\65\2\2\u01b7\67\3\2\2\2\u01b8\u01b9\b\35\1\2\u01b9\u01ba\7\16"+
		"\2\2\u01ba\u01bb\b\35\1\2\u01bb\u01bf\7+\2\2\u01bc\u01bd\5*\26\2\u01bd"+
		"\u01be\b\35\1\2\u01be\u01c0\3\2\2\2\u01bf\u01bc\3\2\2\2\u01bf\u01c0\3"+
		"\2\2\2\u01c0\u01c1\3\2\2\2\u01c1\u01c5\7\65\2\2\u01c2\u01c3\5> \2\u01c3"+
		"\u01c4\b\35\1\2\u01c4\u01c6\3\2\2\2\u01c5\u01c2\3\2\2\2\u01c5\u01c6\3"+
		"\2\2\2\u01c6\u01c7\3\2\2\2\u01c7\u01cb\7\65\2\2\u01c8\u01c9\5*\26\2\u01c9"+
		"\u01ca\b\35\1\2\u01ca\u01cc\3\2\2\2\u01cb\u01c8\3\2\2\2\u01cb\u01cc\3"+
		"\2\2\2\u01cc\u01cd\3\2\2\2\u01cd\u01ce\7,\2\2\u01ce\u01cf\5$\23\2\u01cf"+
		"\u01d0\b\35\1\2\u01d09\3\2\2\2\u01d1\u01d2\7\f\2\2\u01d2\u01d3\7+\2\2"+
		"\u01d3\u01d4\5\\/\2\u01d4\u01d5\7\r\2\2\u01d5\u01d6\5> \2\u01d6\u01d7"+
		"\b\36\1\2\u01d7\u01d8\7,\2\2\u01d8\u01d9\5$\23\2\u01d9\u01da\b\36\1\2"+
		"\u01da;\3\2\2\2\u01db\u01dc\7\17\2\2\u01dc\u01dd\7+\2\2\u01dd\u01de\5"+
		"> \2\u01de\u01df\7,\2\2\u01df\u01e0\5$\23\2\u01e0\u01e5\b\37\1\2\u01e1"+
		"\u01e2\7\20\2\2\u01e2\u01e3\5$\23\2\u01e3\u01e4\b\37\1\2\u01e4\u01e6\3"+
		"\2\2\2\u01e5\u01e1\3\2\2\2\u01e5\u01e6\3\2\2\2\u01e6=\3\2\2\2\u01e7\u01e8"+
		"\5@!\2\u01e8\u01ed\b \1\2\u01e9\u01ea\7(\2\2\u01ea\u01eb\5> \2\u01eb\u01ec"+
		"\b \1\2\u01ec\u01ee\3\2\2\2\u01ed\u01e9\3\2\2\2\u01ed\u01ee\3\2\2\2\u01ee"+
		"?\3\2\2\2\u01ef\u01f0\5B\"\2\u01f0\u01f7\b!\1\2\u01f1\u01f2\7%\2\2\u01f2"+
		"\u01f3\5B\"\2\u01f3\u01f4\b!\1\2\u01f4\u01f6\3\2\2\2\u01f5\u01f1\3\2\2"+
		"\2\u01f6\u01f9\3\2\2\2\u01f7\u01f5\3\2\2\2\u01f7\u01f8\3\2\2\2\u01f8A"+
		"\3\2\2\2\u01f9\u01f7\3\2\2\2\u01fa\u01fb\5D#\2\u01fb\u0202\b\"\1\2\u01fc"+
		"\u01fd\7$\2\2\u01fd\u01fe\5D#\2\u01fe\u01ff\b\"\1\2\u01ff\u0201\3\2\2"+
		"\2\u0200\u01fc\3\2\2\2\u0201\u0204\3\2\2\2\u0202\u0200\3\2\2\2\u0202\u0203"+
		"\3\2\2\2\u0203C\3\2\2\2\u0204\u0202\3\2\2\2\u0205\u0206\5F$\2\u0206\u0211"+
		"\b#\1\2\u0207\u0208\7\36\2\2\u0208\u0209\5F$\2\u0209\u020a\b#\1\2\u020a"+
		"\u0210\3\2\2\2\u020b\u020c\7\35\2\2\u020c\u020d\5F$\2\u020d\u020e\b#\1"+
		"\2\u020e\u0210\3\2\2\2\u020f\u0207\3\2\2\2\u020f\u020b\3\2\2\2\u0210\u0213"+
		"\3\2\2\2\u0211\u020f\3\2\2\2\u0211\u0212\3\2\2\2\u0212E\3\2\2\2\u0213"+
		"\u0211\3\2\2\2\u0214\u0215\5H%\2\u0215\u0220\b$\1\2\u0216\u0217\7\33\2"+
		"\2\u0217\u0218\5H%\2\u0218\u0219\b$\1\2\u0219\u021f\3\2\2\2\u021a\u021b"+
		"\7\34\2\2\u021b\u021c\5H%\2\u021c\u021d\b$\1\2\u021d\u021f\3\2\2\2\u021e"+
		"\u0216\3\2\2\2\u021e\u021a\3\2\2\2\u021f\u0222\3\2\2\2\u0220\u021e\3\2"+
		"\2\2\u0220\u0221\3\2\2\2\u0221G\3\2\2\2\u0222\u0220\3\2\2\2\u0223\u0224"+
		"\5J&\2\u0224\u022f\b%\1\2\u0225\u0226\7\"\2\2\u0226\u0227\5J&\2\u0227"+
		"\u0228\b%\1\2\u0228\u022e\3\2\2\2\u0229\u022a\7#\2\2\u022a\u022b\5J&\2"+
		"\u022b\u022c\b%\1\2\u022c\u022e\3\2\2\2\u022d\u0225\3\2\2\2\u022d\u0229"+
		"\3\2\2\2\u022e\u0231\3\2\2\2\u022f\u022d\3\2\2\2\u022f\u0230\3\2\2\2\u0230"+
		"I\3\2\2\2\u0231\u022f\3\2\2\2\u0232\u0233\5L\'\2\u0233\u0242\b&\1\2\u0234"+
		"\u0235\7\37\2\2\u0235\u0236\5L\'\2\u0236\u0237\b&\1\2\u0237\u0241\3\2"+
		"\2\2\u0238\u0239\7 \2\2\u0239\u023a\5L\'\2\u023a\u023b\b&\1\2\u023b\u0241"+
		"\3\2\2\2\u023c\u023d\7!\2\2\u023d\u023e\5L\'\2\u023e\u023f\b&\1\2\u023f"+
		"\u0241\3\2\2\2\u0240\u0234\3\2\2\2\u0240\u0238\3\2\2\2\u0240\u023c\3\2"+
		"\2\2\u0241\u0244\3\2\2\2\u0242\u0240\3\2\2\2\u0242\u0243\3\2\2\2\u0243"+
		"K\3\2\2\2\u0244\u0242\3\2\2\2\u0245\u0246\7&\2\2\u0246\u0247\5L\'\2\u0247"+
		"\u0248\b\'\1\2\u0248\u0256\3\2\2\2\u0249\u024a\7#\2\2\u024a\u024b\5L\'"+
		"\2\u024b\u024c\b\'\1\2\u024c\u0256\3\2\2\2\u024d\u024e\7)\2\2\u024e\u024f"+
		"\5L\'\2\u024f\u0250\b\'\1\2\u0250\u0256\3\2\2\2\u0251\u0252\7*\2\2\u0252"+
		"\u0253\5L\'\2\u0253\u0254\b\'\1\2\u0254\u0256\3\2\2\2\u0255\u0245\3\2"+
		"\2\2\u0255\u0249\3\2\2\2\u0255\u024d\3\2\2\2\u0255\u0251\3\2\2\2\u0256"+
		"\u025b\3\2\2\2\u0257\u0258\5N(\2\u0258\u0259\b\'\1\2\u0259\u025b\3\2\2"+
		"\2\u025a\u0255\3\2\2\2\u025a\u0257\3\2\2\2\u025bM\3\2\2\2\u025c\u025d"+
		"\5P)\2\u025d\u0262\b(\1\2\u025e\u025f\7)\2\2\u025f\u0263\b(\1\2\u0260"+
		"\u0261\7*\2\2\u0261\u0263\b(\1\2\u0262\u025e\3\2\2\2\u0262\u0260\3\2\2"+
		"\2\u0262\u0263\3\2\2\2\u0263O\3\2\2\2\u0264\u0265\5R*\2\u0265\u0276\b"+
		")\1\2\u0266\u0267\7+\2\2\u0267\u0268\5\64\33\2\u0268\u0269\b)\1\2\u0269"+
		"\u026a\7,\2\2\u026a\u0275\3\2\2\2\u026b\u026c\7\63\2\2\u026c\u026d\5\\"+
		"/\2\u026d\u026e\b)\1\2\u026e\u0275\3\2\2\2\u026f\u0270\7-\2\2\u0270\u0271"+
		"\5> \2\u0271\u0272\b)\1\2\u0272\u0273\7.\2\2\u0273\u0275\3\2\2\2\u0274"+
		"\u0266\3\2\2\2\u0274\u026b\3\2\2\2\u0274\u026f\3\2\2\2\u0275\u0278\3\2"+
		"\2\2\u0276\u0274\3\2\2\2\u0276\u0277\3\2\2\2\u0277Q\3\2\2\2\u0278\u0276"+
		"\3\2\2\2\u0279\u027a\7\31\2\2\u027a\u028b\b*\1\2\u027b\u027c\5T+\2\u027c"+
		"\u027d\b*\1\2\u027d\u028b\3\2\2\2\u027e\u027f\5V,\2\u027f\u0280\b*\1\2"+
		"\u0280\u028b\3\2\2\2\u0281\u0282\5\\/\2\u0282\u0283\b*\1\2\u0283\u028b"+
		"\3\2\2\2\u0284\u0285\7+\2\2\u0285\u0286\5> \2\u0286\u0287\b*\1\2\u0287"+
		"\u0288\3\2\2\2\u0288\u0289\7,\2\2\u0289\u028b\3\2\2\2\u028a\u0279\3\2"+
		"\2\2\u028a\u027b\3\2\2\2\u028a\u027e\3\2\2\2\u028a\u0281\3\2\2\2\u028a"+
		"\u0284\3\2\2\2\u028bS\3\2\2\2\u028c\u028d\7\b\2\2\u028d\u028e\5\24\13"+
		"\2\u028e\u028f\7+\2\2\u028f\u0290\5\64\33\2\u0290\u0291\b+\1\2\u0291\u0292"+
		"\7,\2\2\u0292U\3\2\2\2\u0293\u0294\5X-\2\u0294\u0295\b,\1\2\u0295\u02a0"+
		"\3\2\2\2\u0296\u0297\78\2\2\u0297\u02a0\b,\1\2\u0298\u0299\7\66\2\2\u0299"+
		"\u02a0\b,\1\2\u029a\u029b\7\25\2\2\u029b\u02a0\b,\1\2\u029c\u029d\5Z."+
		"\2\u029d\u029e\b,\1\2\u029e\u02a0\3\2\2\2\u029f\u0293\3\2\2\2\u029f\u0296"+
		"\3\2\2\2\u029f\u0298\3\2\2\2\u029f\u029a\3\2\2\2\u029f\u029c\3\2\2\2\u02a0"+
		"W\3\2\2\2\u02a1\u02a2\7\27\2\2\u02a2\u02a6\b-\1\2\u02a3\u02a4\7\30\2\2"+
		"\u02a4\u02a6\b-\1\2\u02a5\u02a1\3\2\2\2\u02a5\u02a3\3\2\2\2\u02a6Y\3\2"+
		"\2\2\u02a7\u02a8\7-\2\2\u02a8\u02a9\5\64\33\2\u02a9\u02aa\b.\1\2\u02aa"+
		"\u02ab\7.\2\2\u02ab[\3\2\2\2\u02ac\u02ad\7\67\2\2\u02ad\u02ae\b/\1\2\u02ae"+
		"]\3\2\2\2\67hr{}\u0088\u008a\u0093\u0095\u0098\u00ab\u00c9\u00cc\u00df"+
		"\u00ee\u00fb\u0104\u010e\u0116\u0123\u012c\u0134\u013c\u015a\u0164\u017f"+
		"\u0197\u0199\u01ab\u01ae\u01b4\u01bf\u01c5\u01cb\u01e5\u01ed\u01f7\u0202"+
		"\u020f\u0211\u021e\u0220\u022d\u022f\u0240\u0242\u0255\u025a\u0262\u0274"+
		"\u0276\u028a\u029f\u02a5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}