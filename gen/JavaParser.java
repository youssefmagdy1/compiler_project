// Generated from /home/youssef/collage/forth year/second_term/compiler/project/compiler_project/JavaParser.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JavaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ABSTRACT=1, ASSERT=2, BOOLEAN=3, BREAK=4, BYTE=5, CASE=6, CATCH=7, CHAR=8, 
		CLASS=9, CONST=10, CONTINUE=11, DEFAULT=12, DO=13, DOUBLE=14, ELSE=15, 
		ENUM=16, EXTENDS=17, FINAL=18, FINALLY=19, FLOAT=20, FOR=21, IF=22, GOTO=23, 
		IMPLEMENTS=24, IMPORT=25, INSTANCEOF=26, INT=27, INTERFACE=28, LONG=29, 
		NATIVE=30, NEW=31, PACKAGE=32, PRIVATE=33, PROTECTED=34, PUBLIC=35, RETURN=36, 
		SHORT=37, STATIC=38, STRICTFP=39, SUPER=40, SWITCH=41, SYNCHRONIZED=42, 
		THIS=43, THROW=44, THROWS=45, TRANSIENT=46, TRY=47, VOID=48, VOLATILE=49, 
		WHILE=50, MODULE=51, OPEN=52, REQUIRES=53, EXPORTS=54, OPENS=55, TO=56, 
		USES=57, PROVIDES=58, WITH=59, TRANSITIVE=60, VAR=61, YIELD=62, RECORD=63, 
		SEALED=64, PERMITS=65, NON_SEALED=66, DECIMAL_LITERAL=67, HEX_LITERAL=68, 
		OCT_LITERAL=69, BINARY_LITERAL=70, FLOAT_LITERAL=71, HEX_FLOAT_LITERAL=72, 
		BOOL_LITERAL=73, CHAR_LITERAL=74, STRING_LITERAL=75, TEXT_BLOCK=76, NULL_LITERAL=77, 
		LPAREN=78, RPAREN=79, LBRACE=80, RBRACE=81, LBRACK=82, RBRACK=83, SEMI=84, 
		COMMA=85, DOT=86, ASSIGN=87, GT=88, LT=89, BANG=90, TILDE=91, QUESTION=92, 
		COLON=93, EQUAL=94, LE=95, GE=96, NOTEQUAL=97, AND=98, OR=99, INC=100, 
		DEC=101, ADD=102, SUB=103, MUL=104, DIV=105, BITAND=106, BITOR=107, CARET=108, 
		MOD=109, ADD_ASSIGN=110, SUB_ASSIGN=111, MUL_ASSIGN=112, DIV_ASSIGN=113, 
		AND_ASSIGN=114, OR_ASSIGN=115, XOR_ASSIGN=116, MOD_ASSIGN=117, LSHIFT_ASSIGN=118, 
		RSHIFT_ASSIGN=119, URSHIFT_ASSIGN=120, ARROW=121, COLONCOLON=122, AT=123, 
		ELLIPSIS=124, WS=125, COMMENT=126, LINE_COMMENT=127, IDENTIFIER=128;
	public static final int
		RULE_compilationUnit = 0, RULE_packageDeclaration = 1, RULE_importDeclaration = 2, 
		RULE_typeDeclaration = 3, RULE_modifier = 4, RULE_classOrInterfaceModifier = 5, 
		RULE_variableModifier = 6, RULE_classDeclaration = 7, RULE_typeParameters = 8, 
		RULE_typeParameter = 9, RULE_typeBound = 10, RULE_enumDeclaration = 11, 
		RULE_enumConstants = 12, RULE_enumConstant = 13, RULE_enumBodyDeclarations = 14, 
		RULE_interfaceDeclaration = 15, RULE_classBody = 16, RULE_interfaceBody = 17, 
		RULE_classBodyDeclaration = 18, RULE_memberDeclaration = 19, RULE_methodDeclaration = 20, 
		RULE_methodBody = 21, RULE_typeTypeOrVoid = 22, RULE_genericMethodDeclaration = 23, 
		RULE_genericConstructorDeclaration = 24, RULE_constructorDeclaration = 25, 
		RULE_fieldDeclaration = 26, RULE_interfaceBodyDeclaration = 27, RULE_interfaceMemberDeclaration = 28, 
		RULE_constDeclaration = 29, RULE_constantDeclarator = 30, RULE_interfaceMethodDeclaration = 31, 
		RULE_interfaceMethodModifier = 32, RULE_genericInterfaceMethodDeclaration = 33, 
		RULE_interfaceCommonBodyDeclaration = 34, RULE_variableDeclarators = 35, 
		RULE_variableDeclarator = 36, RULE_variableDeclaratorId = 37, RULE_variableInitializer = 38, 
		RULE_arrayInitializer = 39, RULE_classOrInterfaceType = 40, RULE_typeArgument = 41, 
		RULE_qualifiedNameList = 42, RULE_formalParameters = 43, RULE_receiverParameter = 44, 
		RULE_formalParameterList = 45, RULE_formalParameter = 46, RULE_lastFormalParameter = 47, 
		RULE_lambdaLVTIList = 48, RULE_lambdaLVTIParameter = 49, RULE_qualifiedName = 50, 
		RULE_literal = 51, RULE_integerLiteral = 52, RULE_floatLiteral = 53, RULE_altAnnotationQualifiedName = 54, 
		RULE_annotation = 55, RULE_elementValuePairs = 56, RULE_elementValuePair = 57, 
		RULE_elementValue = 58, RULE_elementValueArrayInitializer = 59, RULE_annotationTypeDeclaration = 60, 
		RULE_annotationTypeBody = 61, RULE_annotationTypeElementDeclaration = 62, 
		RULE_annotationTypeElementRest = 63, RULE_annotationMethodOrConstantRest = 64, 
		RULE_annotationMethodRest = 65, RULE_annotationConstantRest = 66, RULE_defaultValue = 67, 
		RULE_moduleDeclaration = 68, RULE_moduleBody = 69, RULE_moduleDirective = 70, 
		RULE_requiresModifier = 71, RULE_recordDeclaration = 72, RULE_recordHeader = 73, 
		RULE_recordComponentList = 74, RULE_recordComponent = 75, RULE_recordBody = 76, 
		RULE_block = 77, RULE_blockStatement = 78, RULE_localVariableDeclaration = 79, 
		RULE_identifier = 80, RULE_localTypeDeclaration = 81, RULE_statement = 82, 
		RULE_elseStatement = 83, RULE_catchClause = 84, RULE_catchType = 85, RULE_finallyBlock = 86, 
		RULE_resourceSpecification = 87, RULE_resources = 88, RULE_resource = 89, 
		RULE_switchBlockStatementGroup = 90, RULE_switchLabel = 91, RULE_forControl = 92, 
		RULE_forInit = 93, RULE_enhancedForControl = 94, RULE_parExpression = 95, 
		RULE_expressionList = 96, RULE_methodCall = 97, RULE_expression = 98, 
		RULE_pattern = 99, RULE_lambdaExpression = 100, RULE_lambdaParameters = 101, 
		RULE_lambdaBody = 102, RULE_primary = 103, RULE_switchExpression = 104, 
		RULE_switchLabeledRule = 105, RULE_guardedPattern = 106, RULE_switchRuleOutcome = 107, 
		RULE_classType = 108, RULE_creator = 109, RULE_createdName = 110, RULE_innerCreator = 111, 
		RULE_arrayCreatorRest = 112, RULE_classCreatorRest = 113, RULE_explicitGenericInvocation = 114, 
		RULE_typeArgumentsOrDiamond = 115, RULE_nonWildcardTypeArgumentsOrDiamond = 116, 
		RULE_nonWildcardTypeArguments = 117, RULE_typeList = 118, RULE_typeType = 119, 
		RULE_primitiveType = 120, RULE_typeArguments = 121, RULE_superSuffix = 122, 
		RULE_explicitGenericInvocationSuffix = 123, RULE_arguments = 124;
	private static String[] makeRuleNames() {
		return new String[] {
			"compilationUnit", "packageDeclaration", "importDeclaration", "typeDeclaration", 
			"modifier", "classOrInterfaceModifier", "variableModifier", "classDeclaration", 
			"typeParameters", "typeParameter", "typeBound", "enumDeclaration", "enumConstants", 
			"enumConstant", "enumBodyDeclarations", "interfaceDeclaration", "classBody", 
			"interfaceBody", "classBodyDeclaration", "memberDeclaration", "methodDeclaration", 
			"methodBody", "typeTypeOrVoid", "genericMethodDeclaration", "genericConstructorDeclaration", 
			"constructorDeclaration", "fieldDeclaration", "interfaceBodyDeclaration", 
			"interfaceMemberDeclaration", "constDeclaration", "constantDeclarator", 
			"interfaceMethodDeclaration", "interfaceMethodModifier", "genericInterfaceMethodDeclaration", 
			"interfaceCommonBodyDeclaration", "variableDeclarators", "variableDeclarator", 
			"variableDeclaratorId", "variableInitializer", "arrayInitializer", "classOrInterfaceType", 
			"typeArgument", "qualifiedNameList", "formalParameters", "receiverParameter", 
			"formalParameterList", "formalParameter", "lastFormalParameter", "lambdaLVTIList", 
			"lambdaLVTIParameter", "qualifiedName", "literal", "integerLiteral", 
			"floatLiteral", "altAnnotationQualifiedName", "annotation", "elementValuePairs", 
			"elementValuePair", "elementValue", "elementValueArrayInitializer", "annotationTypeDeclaration", 
			"annotationTypeBody", "annotationTypeElementDeclaration", "annotationTypeElementRest", 
			"annotationMethodOrConstantRest", "annotationMethodRest", "annotationConstantRest", 
			"defaultValue", "moduleDeclaration", "moduleBody", "moduleDirective", 
			"requiresModifier", "recordDeclaration", "recordHeader", "recordComponentList", 
			"recordComponent", "recordBody", "block", "blockStatement", "localVariableDeclaration", 
			"identifier", "localTypeDeclaration", "statement", "elseStatement", "catchClause", 
			"catchType", "finallyBlock", "resourceSpecification", "resources", "resource", 
			"switchBlockStatementGroup", "switchLabel", "forControl", "forInit", 
			"enhancedForControl", "parExpression", "expressionList", "methodCall", 
			"expression", "pattern", "lambdaExpression", "lambdaParameters", "lambdaBody", 
			"primary", "switchExpression", "switchLabeledRule", "guardedPattern", 
			"switchRuleOutcome", "classType", "creator", "createdName", "innerCreator", 
			"arrayCreatorRest", "classCreatorRest", "explicitGenericInvocation", 
			"typeArgumentsOrDiamond", "nonWildcardTypeArgumentsOrDiamond", "nonWildcardTypeArguments", 
			"typeList", "typeType", "primitiveType", "typeArguments", "superSuffix", 
			"explicitGenericInvocationSuffix", "arguments"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'abstract'", "'assert'", "'boolean'", "'break'", "'byte'", "'case'", 
			"'catch'", "'char'", "'class'", "'const'", "'continue'", "'default'", 
			"'do'", "'double'", "'else'", "'enum'", "'extends'", "'final'", "'finally'", 
			"'float'", "'for'", "'if'", "'goto'", "'implements'", "'import'", "'instanceof'", 
			"'int'", "'interface'", "'long'", "'native'", "'new'", "'package'", "'private'", 
			"'protected'", "'public'", "'return'", "'short'", "'static'", "'strictfp'", 
			"'super'", "'switch'", "'synchronized'", "'this'", "'throw'", "'throws'", 
			"'transient'", "'try'", "'void'", "'volatile'", "'while'", "'module'", 
			"'open'", "'requires'", "'exports'", "'opens'", "'to'", "'uses'", "'provides'", 
			"'with'", "'transitive'", "'var'", "'yield'", "'record'", "'sealed'", 
			"'permits'", "'non-sealed'", null, null, null, null, null, null, null, 
			null, null, null, "'null'", "'('", "')'", "'{'", "'}'", "'['", "']'", 
			"';'", "','", "'.'", "'='", "'>'", "'<'", "'!'", "'~'", "'?'", "':'", 
			"'=='", "'<='", "'>='", "'!='", "'&&'", "'||'", "'++'", "'--'", "'+'", 
			"'-'", "'*'", "'/'", "'&'", "'|'", "'^'", "'%'", "'+='", "'-='", "'*='", 
			"'/='", "'&='", "'|='", "'^='", "'%='", "'<<='", "'>>='", "'>>>='", "'->'", 
			"'::'", "'@'", "'...'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ABSTRACT", "ASSERT", "BOOLEAN", "BREAK", "BYTE", "CASE", "CATCH", 
			"CHAR", "CLASS", "CONST", "CONTINUE", "DEFAULT", "DO", "DOUBLE", "ELSE", 
			"ENUM", "EXTENDS", "FINAL", "FINALLY", "FLOAT", "FOR", "IF", "GOTO", 
			"IMPLEMENTS", "IMPORT", "INSTANCEOF", "INT", "INTERFACE", "LONG", "NATIVE", 
			"NEW", "PACKAGE", "PRIVATE", "PROTECTED", "PUBLIC", "RETURN", "SHORT", 
			"STATIC", "STRICTFP", "SUPER", "SWITCH", "SYNCHRONIZED", "THIS", "THROW", 
			"THROWS", "TRANSIENT", "TRY", "VOID", "VOLATILE", "WHILE", "MODULE", 
			"OPEN", "REQUIRES", "EXPORTS", "OPENS", "TO", "USES", "PROVIDES", "WITH", 
			"TRANSITIVE", "VAR", "YIELD", "RECORD", "SEALED", "PERMITS", "NON_SEALED", 
			"DECIMAL_LITERAL", "HEX_LITERAL", "OCT_LITERAL", "BINARY_LITERAL", "FLOAT_LITERAL", 
			"HEX_FLOAT_LITERAL", "BOOL_LITERAL", "CHAR_LITERAL", "STRING_LITERAL", 
			"TEXT_BLOCK", "NULL_LITERAL", "LPAREN", "RPAREN", "LBRACE", "RBRACE", 
			"LBRACK", "RBRACK", "SEMI", "COMMA", "DOT", "ASSIGN", "GT", "LT", "BANG", 
			"TILDE", "QUESTION", "COLON", "EQUAL", "LE", "GE", "NOTEQUAL", "AND", 
			"OR", "INC", "DEC", "ADD", "SUB", "MUL", "DIV", "BITAND", "BITOR", "CARET", 
			"MOD", "ADD_ASSIGN", "SUB_ASSIGN", "MUL_ASSIGN", "DIV_ASSIGN", "AND_ASSIGN", 
			"OR_ASSIGN", "XOR_ASSIGN", "MOD_ASSIGN", "LSHIFT_ASSIGN", "RSHIFT_ASSIGN", 
			"URSHIFT_ASSIGN", "ARROW", "COLONCOLON", "AT", "ELLIPSIS", "WS", "COMMENT", 
			"LINE_COMMENT", "IDENTIFIER"
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
	public String getGrammarFileName() { return "JavaParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public JavaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class CompilationUnitContext extends ParserRuleContext {
		public PackageDeclarationContext packageDeclaration() {
			return getRuleContext(PackageDeclarationContext.class,0);
		}
		public List<ImportDeclarationContext> importDeclaration() {
			return getRuleContexts(ImportDeclarationContext.class);
		}
		public ImportDeclarationContext importDeclaration(int i) {
			return getRuleContext(ImportDeclarationContext.class,i);
		}
		public List<TypeDeclarationContext> typeDeclaration() {
			return getRuleContexts(TypeDeclarationContext.class);
		}
		public TypeDeclarationContext typeDeclaration(int i) {
			return getRuleContext(TypeDeclarationContext.class,i);
		}
		public ModuleDeclarationContext moduleDeclaration() {
			return getRuleContext(ModuleDeclarationContext.class,0);
		}
		public TerminalNode EOF() { return getToken(JavaParser.EOF, 0); }
		public CompilationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilationUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterCompilationUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitCompilationUnit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitCompilationUnit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompilationUnitContext compilationUnit() throws RecognitionException {
		CompilationUnitContext _localctx = new CompilationUnitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_compilationUnit);
		int _la;
		try {
			setState(268);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(251);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(250);
					packageDeclaration();
					}
					break;
				}
				setState(256);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==IMPORT) {
					{
					{
					setState(253);
					importDeclaration();
					}
					}
					setState(258);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(262);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 1)) & ~0x3f) == 0 && ((1L << (_la - 1)) & ((1L << (ABSTRACT - 1)) | (1L << (CLASS - 1)) | (1L << (ENUM - 1)) | (1L << (FINAL - 1)) | (1L << (INTERFACE - 1)) | (1L << (PRIVATE - 1)) | (1L << (PROTECTED - 1)) | (1L << (PUBLIC - 1)) | (1L << (STATIC - 1)) | (1L << (STRICTFP - 1)) | (1L << (MODULE - 1)) | (1L << (OPEN - 1)) | (1L << (REQUIRES - 1)) | (1L << (EXPORTS - 1)) | (1L << (OPENS - 1)) | (1L << (TO - 1)) | (1L << (USES - 1)) | (1L << (PROVIDES - 1)) | (1L << (WITH - 1)) | (1L << (TRANSITIVE - 1)) | (1L << (VAR - 1)) | (1L << (YIELD - 1)) | (1L << (RECORD - 1)) | (1L << (SEALED - 1)))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (PERMITS - 65)) | (1L << (NON_SEALED - 65)) | (1L << (SEMI - 65)) | (1L << (AT - 65)) | (1L << (IDENTIFIER - 65)))) != 0)) {
					{
					{
					setState(259);
					typeDeclaration();
					}
					}
					setState(264);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(265);
				moduleDeclaration();
				setState(266);
				match(EOF);
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

	public static class PackageDeclarationContext extends ParserRuleContext {
		public TerminalNode PACKAGE() { return getToken(JavaParser.PACKAGE, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(JavaParser.SEMI, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public PackageDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterPackageDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitPackageDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitPackageDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PackageDeclarationContext packageDeclaration() throws RecognitionException {
		PackageDeclarationContext _localctx = new PackageDeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_packageDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 51)) & ~0x3f) == 0 && ((1L << (_la - 51)) & ((1L << (MODULE - 51)) | (1L << (OPEN - 51)) | (1L << (REQUIRES - 51)) | (1L << (EXPORTS - 51)) | (1L << (OPENS - 51)) | (1L << (TO - 51)) | (1L << (USES - 51)) | (1L << (PROVIDES - 51)) | (1L << (WITH - 51)) | (1L << (TRANSITIVE - 51)) | (1L << (VAR - 51)) | (1L << (YIELD - 51)) | (1L << (RECORD - 51)) | (1L << (SEALED - 51)) | (1L << (PERMITS - 51)))) != 0) || _la==AT || _la==IDENTIFIER) {
				{
				{
				setState(270);
				annotation();
				}
				}
				setState(275);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(276);
			match(PACKAGE);
			setState(277);
			qualifiedName();
			setState(278);
			match(SEMI);
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

	public static class ImportDeclarationContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(JavaParser.IMPORT, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(JavaParser.SEMI, 0); }
		public TerminalNode STATIC() { return getToken(JavaParser.STATIC, 0); }
		public TerminalNode DOT() { return getToken(JavaParser.DOT, 0); }
		public TerminalNode MUL() { return getToken(JavaParser.MUL, 0); }
		public ImportDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterImportDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitImportDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitImportDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportDeclarationContext importDeclaration() throws RecognitionException {
		ImportDeclarationContext _localctx = new ImportDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_importDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
			match(IMPORT);
			setState(282);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STATIC) {
				{
				setState(281);
				match(STATIC);
				}
			}

			setState(284);
			qualifiedName();
			setState(287);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOT) {
				{
				setState(285);
				match(DOT);
				setState(286);
				match(MUL);
				}
			}

			setState(289);
			match(SEMI);
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

	public static class TypeDeclarationContext extends ParserRuleContext {
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public EnumDeclarationContext enumDeclaration() {
			return getRuleContext(EnumDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public AnnotationTypeDeclarationContext annotationTypeDeclaration() {
			return getRuleContext(AnnotationTypeDeclarationContext.class,0);
		}
		public RecordDeclarationContext recordDeclaration() {
			return getRuleContext(RecordDeclarationContext.class,0);
		}
		public List<ClassOrInterfaceModifierContext> classOrInterfaceModifier() {
			return getRuleContexts(ClassOrInterfaceModifierContext.class);
		}
		public ClassOrInterfaceModifierContext classOrInterfaceModifier(int i) {
			return getRuleContext(ClassOrInterfaceModifierContext.class,i);
		}
		public TerminalNode SEMI() { return getToken(JavaParser.SEMI, 0); }
		public TypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterTypeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitTypeDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitTypeDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeDeclarationContext typeDeclaration() throws RecognitionException {
		TypeDeclarationContext _localctx = new TypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_typeDeclaration);
		try {
			int _alt;
			setState(305);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ABSTRACT:
			case CLASS:
			case ENUM:
			case FINAL:
			case INTERFACE:
			case PRIVATE:
			case PROTECTED:
			case PUBLIC:
			case STATIC:
			case STRICTFP:
			case MODULE:
			case OPEN:
			case REQUIRES:
			case EXPORTS:
			case OPENS:
			case TO:
			case USES:
			case PROVIDES:
			case WITH:
			case TRANSITIVE:
			case VAR:
			case YIELD:
			case RECORD:
			case SEALED:
			case PERMITS:
			case NON_SEALED:
			case AT:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(294);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(291);
						classOrInterfaceModifier();
						}
						} 
					}
					setState(296);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				}
				setState(302);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CLASS:
					{
					setState(297);
					classDeclaration();
					}
					break;
				case ENUM:
					{
					setState(298);
					enumDeclaration();
					}
					break;
				case INTERFACE:
					{
					setState(299);
					interfaceDeclaration();
					}
					break;
				case AT:
					{
					setState(300);
					annotationTypeDeclaration();
					}
					break;
				case RECORD:
					{
					setState(301);
					recordDeclaration();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				setState(304);
				match(SEMI);
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

	public static class ModifierContext extends ParserRuleContext {
		public ClassOrInterfaceModifierContext classOrInterfaceModifier() {
			return getRuleContext(ClassOrInterfaceModifierContext.class,0);
		}
		public TerminalNode NATIVE() { return getToken(JavaParser.NATIVE, 0); }
		public TerminalNode SYNCHRONIZED() { return getToken(JavaParser.SYNCHRONIZED, 0); }
		public TerminalNode TRANSIENT() { return getToken(JavaParser.TRANSIENT, 0); }
		public TerminalNode VOLATILE() { return getToken(JavaParser.VOLATILE, 0); }
		public ModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModifierContext modifier() throws RecognitionException {
		ModifierContext _localctx = new ModifierContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_modifier);
		try {
			setState(312);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ABSTRACT:
			case FINAL:
			case PRIVATE:
			case PROTECTED:
			case PUBLIC:
			case STATIC:
			case STRICTFP:
			case MODULE:
			case OPEN:
			case REQUIRES:
			case EXPORTS:
			case OPENS:
			case TO:
			case USES:
			case PROVIDES:
			case WITH:
			case TRANSITIVE:
			case VAR:
			case YIELD:
			case RECORD:
			case SEALED:
			case PERMITS:
			case NON_SEALED:
			case AT:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(307);
				classOrInterfaceModifier();
				}
				break;
			case NATIVE:
				enterOuterAlt(_localctx, 2);
				{
				setState(308);
				match(NATIVE);
				}
				break;
			case SYNCHRONIZED:
				enterOuterAlt(_localctx, 3);
				{
				setState(309);
				match(SYNCHRONIZED);
				}
				break;
			case TRANSIENT:
				enterOuterAlt(_localctx, 4);
				{
				setState(310);
				match(TRANSIENT);
				}
				break;
			case VOLATILE:
				enterOuterAlt(_localctx, 5);
				{
				setState(311);
				match(VOLATILE);
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

	public static class ClassOrInterfaceModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public TerminalNode PUBLIC() { return getToken(JavaParser.PUBLIC, 0); }
		public TerminalNode PROTECTED() { return getToken(JavaParser.PROTECTED, 0); }
		public TerminalNode PRIVATE() { return getToken(JavaParser.PRIVATE, 0); }
		public TerminalNode STATIC() { return getToken(JavaParser.STATIC, 0); }
		public TerminalNode ABSTRACT() { return getToken(JavaParser.ABSTRACT, 0); }
		public TerminalNode FINAL() { return getToken(JavaParser.FINAL, 0); }
		public TerminalNode STRICTFP() { return getToken(JavaParser.STRICTFP, 0); }
		public TerminalNode SEALED() { return getToken(JavaParser.SEALED, 0); }
		public TerminalNode NON_SEALED() { return getToken(JavaParser.NON_SEALED, 0); }
		public ClassOrInterfaceModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classOrInterfaceModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterClassOrInterfaceModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitClassOrInterfaceModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitClassOrInterfaceModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassOrInterfaceModifierContext classOrInterfaceModifier() throws RecognitionException {
		ClassOrInterfaceModifierContext _localctx = new ClassOrInterfaceModifierContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_classOrInterfaceModifier);
		try {
			setState(324);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(314);
				annotation();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(315);
				match(PUBLIC);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(316);
				match(PROTECTED);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(317);
				match(PRIVATE);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(318);
				match(STATIC);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(319);
				match(ABSTRACT);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(320);
				match(FINAL);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(321);
				match(STRICTFP);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(322);
				match(SEALED);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(323);
				match(NON_SEALED);
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

	public static class VariableModifierContext extends ParserRuleContext {
		public TerminalNode FINAL() { return getToken(JavaParser.FINAL, 0); }
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public VariableModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterVariableModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitVariableModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitVariableModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableModifierContext variableModifier() throws RecognitionException {
		VariableModifierContext _localctx = new VariableModifierContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_variableModifier);
		try {
			setState(328);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FINAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(326);
				match(FINAL);
				}
				break;
			case MODULE:
			case OPEN:
			case REQUIRES:
			case EXPORTS:
			case OPENS:
			case TO:
			case USES:
			case PROVIDES:
			case WITH:
			case TRANSITIVE:
			case VAR:
			case YIELD:
			case RECORD:
			case SEALED:
			case PERMITS:
			case AT:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(327);
				annotation();
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

	public static class ClassDeclarationContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(JavaParser.CLASS, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public TerminalNode EXTENDS() { return getToken(JavaParser.EXTENDS, 0); }
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public TerminalNode IMPLEMENTS() { return getToken(JavaParser.IMPLEMENTS, 0); }
		public List<TypeListContext> typeList() {
			return getRuleContexts(TypeListContext.class);
		}
		public TypeListContext typeList(int i) {
			return getRuleContext(TypeListContext.class,i);
		}
		public TerminalNode PERMITS() { return getToken(JavaParser.PERMITS, 0); }
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitClassDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitClassDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_classDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(330);
			match(CLASS);
			setState(331);
			identifier();
			setState(333);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(332);
				typeParameters();
				}
			}

			setState(337);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(335);
				match(EXTENDS);
				setState(336);
				typeType();
				}
			}

			setState(341);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(339);
				match(IMPLEMENTS);
				setState(340);
				typeList();
				}
			}

			setState(345);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PERMITS) {
				{
				setState(343);
				match(PERMITS);
				setState(344);
				typeList();
				}
			}

			setState(347);
			classBody();
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

	public static class TypeParametersContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(JavaParser.LT, 0); }
		public List<TypeParameterContext> typeParameter() {
			return getRuleContexts(TypeParameterContext.class);
		}
		public TypeParameterContext typeParameter(int i) {
			return getRuleContext(TypeParameterContext.class,i);
		}
		public TerminalNode GT() { return getToken(JavaParser.GT, 0); }
		public List<TerminalNode> COMMA() { return getTokens(JavaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JavaParser.COMMA, i);
		}
		public TypeParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterTypeParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitTypeParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitTypeParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeParametersContext typeParameters() throws RecognitionException {
		TypeParametersContext _localctx = new TypeParametersContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_typeParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(349);
			match(LT);
			setState(350);
			typeParameter();
			setState(355);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(351);
				match(COMMA);
				setState(352);
				typeParameter();
				}
				}
				setState(357);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(358);
			match(GT);
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

	public static class TypeParameterContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public TerminalNode EXTENDS() { return getToken(JavaParser.EXTENDS, 0); }
		public TypeBoundContext typeBound() {
			return getRuleContext(TypeBoundContext.class,0);
		}
		public TypeParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterTypeParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitTypeParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitTypeParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeParameterContext typeParameter() throws RecognitionException {
		TypeParameterContext _localctx = new TypeParameterContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_typeParameter);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(363);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(360);
					annotation();
					}
					} 
				}
				setState(365);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			}
			setState(366);
			identifier();
			setState(375);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(367);
				match(EXTENDS);
				setState(371);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(368);
						annotation();
						}
						} 
					}
					setState(373);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
				}
				setState(374);
				typeBound();
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

	public static class TypeBoundContext extends ParserRuleContext {
		public List<TypeTypeContext> typeType() {
			return getRuleContexts(TypeTypeContext.class);
		}
		public TypeTypeContext typeType(int i) {
			return getRuleContext(TypeTypeContext.class,i);
		}
		public List<TerminalNode> BITAND() { return getTokens(JavaParser.BITAND); }
		public TerminalNode BITAND(int i) {
			return getToken(JavaParser.BITAND, i);
		}
		public TypeBoundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeBound; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterTypeBound(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitTypeBound(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitTypeBound(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeBoundContext typeBound() throws RecognitionException {
		TypeBoundContext _localctx = new TypeBoundContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_typeBound);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(377);
			typeType();
			setState(382);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BITAND) {
				{
				{
				setState(378);
				match(BITAND);
				setState(379);
				typeType();
				}
				}
				setState(384);
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

	public static class EnumDeclarationContext extends ParserRuleContext {
		public TerminalNode ENUM() { return getToken(JavaParser.ENUM, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LBRACE() { return getToken(JavaParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(JavaParser.RBRACE, 0); }
		public TerminalNode IMPLEMENTS() { return getToken(JavaParser.IMPLEMENTS, 0); }
		public TypeListContext typeList() {
			return getRuleContext(TypeListContext.class,0);
		}
		public EnumConstantsContext enumConstants() {
			return getRuleContext(EnumConstantsContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(JavaParser.COMMA, 0); }
		public EnumBodyDeclarationsContext enumBodyDeclarations() {
			return getRuleContext(EnumBodyDeclarationsContext.class,0);
		}
		public EnumDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterEnumDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitEnumDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitEnumDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumDeclarationContext enumDeclaration() throws RecognitionException {
		EnumDeclarationContext _localctx = new EnumDeclarationContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_enumDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(385);
			match(ENUM);
			setState(386);
			identifier();
			setState(389);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(387);
				match(IMPLEMENTS);
				setState(388);
				typeList();
				}
			}

			setState(391);
			match(LBRACE);
			setState(393);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 51)) & ~0x3f) == 0 && ((1L << (_la - 51)) & ((1L << (MODULE - 51)) | (1L << (OPEN - 51)) | (1L << (REQUIRES - 51)) | (1L << (EXPORTS - 51)) | (1L << (OPENS - 51)) | (1L << (TO - 51)) | (1L << (USES - 51)) | (1L << (PROVIDES - 51)) | (1L << (WITH - 51)) | (1L << (TRANSITIVE - 51)) | (1L << (VAR - 51)) | (1L << (YIELD - 51)) | (1L << (RECORD - 51)) | (1L << (SEALED - 51)) | (1L << (PERMITS - 51)))) != 0) || _la==AT || _la==IDENTIFIER) {
				{
				setState(392);
				enumConstants();
				}
			}

			setState(396);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(395);
				match(COMMA);
				}
			}

			setState(399);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(398);
				enumBodyDeclarations();
				}
			}

			setState(401);
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

	public static class EnumConstantsContext extends ParserRuleContext {
		public List<EnumConstantContext> enumConstant() {
			return getRuleContexts(EnumConstantContext.class);
		}
		public EnumConstantContext enumConstant(int i) {
			return getRuleContext(EnumConstantContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JavaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JavaParser.COMMA, i);
		}
		public EnumConstantsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumConstants; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterEnumConstants(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitEnumConstants(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitEnumConstants(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumConstantsContext enumConstants() throws RecognitionException {
		EnumConstantsContext _localctx = new EnumConstantsContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_enumConstants);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(403);
			enumConstant();
			setState(408);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(404);
					match(COMMA);
					setState(405);
					enumConstant();
					}
					} 
				}
				setState(410);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
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

	public static class EnumConstantContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public EnumConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumConstant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterEnumConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitEnumConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitEnumConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumConstantContext enumConstant() throws RecognitionException {
		EnumConstantContext _localctx = new EnumConstantContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_enumConstant);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(414);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(411);
					annotation();
					}
					} 
				}
				setState(416);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			}
			setState(417);
			identifier();
			setState(419);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(418);
				arguments();
				}
			}

			setState(422);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACE) {
				{
				setState(421);
				classBody();
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

	public static class EnumBodyDeclarationsContext extends ParserRuleContext {
		public TerminalNode SEMI() { return getToken(JavaParser.SEMI, 0); }
		public List<ClassBodyDeclarationContext> classBodyDeclaration() {
			return getRuleContexts(ClassBodyDeclarationContext.class);
		}
		public ClassBodyDeclarationContext classBodyDeclaration(int i) {
			return getRuleContext(ClassBodyDeclarationContext.class,i);
		}
		public EnumBodyDeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumBodyDeclarations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterEnumBodyDeclarations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitEnumBodyDeclarations(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitEnumBodyDeclarations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumBodyDeclarationsContext enumBodyDeclarations() throws RecognitionException {
		EnumBodyDeclarationsContext _localctx = new EnumBodyDeclarationsContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_enumBodyDeclarations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(424);
			match(SEMI);
			setState(428);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 1)) & ~0x3f) == 0 && ((1L << (_la - 1)) & ((1L << (ABSTRACT - 1)) | (1L << (BOOLEAN - 1)) | (1L << (BYTE - 1)) | (1L << (CHAR - 1)) | (1L << (CLASS - 1)) | (1L << (DOUBLE - 1)) | (1L << (ENUM - 1)) | (1L << (FINAL - 1)) | (1L << (FLOAT - 1)) | (1L << (INT - 1)) | (1L << (INTERFACE - 1)) | (1L << (LONG - 1)) | (1L << (NATIVE - 1)) | (1L << (PRIVATE - 1)) | (1L << (PROTECTED - 1)) | (1L << (PUBLIC - 1)) | (1L << (SHORT - 1)) | (1L << (STATIC - 1)) | (1L << (STRICTFP - 1)) | (1L << (SYNCHRONIZED - 1)) | (1L << (TRANSIENT - 1)) | (1L << (VOID - 1)) | (1L << (VOLATILE - 1)) | (1L << (MODULE - 1)) | (1L << (OPEN - 1)) | (1L << (REQUIRES - 1)) | (1L << (EXPORTS - 1)) | (1L << (OPENS - 1)) | (1L << (TO - 1)) | (1L << (USES - 1)) | (1L << (PROVIDES - 1)) | (1L << (WITH - 1)) | (1L << (TRANSITIVE - 1)) | (1L << (VAR - 1)) | (1L << (YIELD - 1)) | (1L << (RECORD - 1)) | (1L << (SEALED - 1)))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (PERMITS - 65)) | (1L << (NON_SEALED - 65)) | (1L << (LBRACE - 65)) | (1L << (SEMI - 65)) | (1L << (LT - 65)) | (1L << (AT - 65)) | (1L << (IDENTIFIER - 65)))) != 0)) {
				{
				{
				setState(425);
				classBodyDeclaration();
				}
				}
				setState(430);
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

	public static class InterfaceDeclarationContext extends ParserRuleContext {
		public TerminalNode INTERFACE() { return getToken(JavaParser.INTERFACE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public InterfaceBodyContext interfaceBody() {
			return getRuleContext(InterfaceBodyContext.class,0);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public TerminalNode EXTENDS() { return getToken(JavaParser.EXTENDS, 0); }
		public List<TypeListContext> typeList() {
			return getRuleContexts(TypeListContext.class);
		}
		public TypeListContext typeList(int i) {
			return getRuleContext(TypeListContext.class,i);
		}
		public TerminalNode PERMITS() { return getToken(JavaParser.PERMITS, 0); }
		public InterfaceDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterInterfaceDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitInterfaceDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitInterfaceDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceDeclarationContext interfaceDeclaration() throws RecognitionException {
		InterfaceDeclarationContext _localctx = new InterfaceDeclarationContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_interfaceDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(431);
			match(INTERFACE);
			setState(432);
			identifier();
			setState(434);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(433);
				typeParameters();
				}
			}

			setState(438);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(436);
				match(EXTENDS);
				setState(437);
				typeList();
				}
			}

			setState(442);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PERMITS) {
				{
				setState(440);
				match(PERMITS);
				setState(441);
				typeList();
				}
			}

			setState(444);
			interfaceBody();
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

	public static class ClassBodyContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(JavaParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(JavaParser.RBRACE, 0); }
		public List<ClassBodyDeclarationContext> classBodyDeclaration() {
			return getRuleContexts(ClassBodyDeclarationContext.class);
		}
		public ClassBodyDeclarationContext classBodyDeclaration(int i) {
			return getRuleContext(ClassBodyDeclarationContext.class,i);
		}
		public ClassBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterClassBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitClassBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitClassBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassBodyContext classBody() throws RecognitionException {
		ClassBodyContext _localctx = new ClassBodyContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_classBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(446);
			match(LBRACE);
			setState(450);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 1)) & ~0x3f) == 0 && ((1L << (_la - 1)) & ((1L << (ABSTRACT - 1)) | (1L << (BOOLEAN - 1)) | (1L << (BYTE - 1)) | (1L << (CHAR - 1)) | (1L << (CLASS - 1)) | (1L << (DOUBLE - 1)) | (1L << (ENUM - 1)) | (1L << (FINAL - 1)) | (1L << (FLOAT - 1)) | (1L << (INT - 1)) | (1L << (INTERFACE - 1)) | (1L << (LONG - 1)) | (1L << (NATIVE - 1)) | (1L << (PRIVATE - 1)) | (1L << (PROTECTED - 1)) | (1L << (PUBLIC - 1)) | (1L << (SHORT - 1)) | (1L << (STATIC - 1)) | (1L << (STRICTFP - 1)) | (1L << (SYNCHRONIZED - 1)) | (1L << (TRANSIENT - 1)) | (1L << (VOID - 1)) | (1L << (VOLATILE - 1)) | (1L << (MODULE - 1)) | (1L << (OPEN - 1)) | (1L << (REQUIRES - 1)) | (1L << (EXPORTS - 1)) | (1L << (OPENS - 1)) | (1L << (TO - 1)) | (1L << (USES - 1)) | (1L << (PROVIDES - 1)) | (1L << (WITH - 1)) | (1L << (TRANSITIVE - 1)) | (1L << (VAR - 1)) | (1L << (YIELD - 1)) | (1L << (RECORD - 1)) | (1L << (SEALED - 1)))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (PERMITS - 65)) | (1L << (NON_SEALED - 65)) | (1L << (LBRACE - 65)) | (1L << (SEMI - 65)) | (1L << (LT - 65)) | (1L << (AT - 65)) | (1L << (IDENTIFIER - 65)))) != 0)) {
				{
				{
				setState(447);
				classBodyDeclaration();
				}
				}
				setState(452);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(453);
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

	public static class InterfaceBodyContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(JavaParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(JavaParser.RBRACE, 0); }
		public List<InterfaceBodyDeclarationContext> interfaceBodyDeclaration() {
			return getRuleContexts(InterfaceBodyDeclarationContext.class);
		}
		public InterfaceBodyDeclarationContext interfaceBodyDeclaration(int i) {
			return getRuleContext(InterfaceBodyDeclarationContext.class,i);
		}
		public InterfaceBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterInterfaceBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitInterfaceBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitInterfaceBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceBodyContext interfaceBody() throws RecognitionException {
		InterfaceBodyContext _localctx = new InterfaceBodyContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_interfaceBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(455);
			match(LBRACE);
			setState(459);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 1)) & ~0x3f) == 0 && ((1L << (_la - 1)) & ((1L << (ABSTRACT - 1)) | (1L << (BOOLEAN - 1)) | (1L << (BYTE - 1)) | (1L << (CHAR - 1)) | (1L << (CLASS - 1)) | (1L << (DEFAULT - 1)) | (1L << (DOUBLE - 1)) | (1L << (ENUM - 1)) | (1L << (FINAL - 1)) | (1L << (FLOAT - 1)) | (1L << (INT - 1)) | (1L << (INTERFACE - 1)) | (1L << (LONG - 1)) | (1L << (NATIVE - 1)) | (1L << (PRIVATE - 1)) | (1L << (PROTECTED - 1)) | (1L << (PUBLIC - 1)) | (1L << (SHORT - 1)) | (1L << (STATIC - 1)) | (1L << (STRICTFP - 1)) | (1L << (SYNCHRONIZED - 1)) | (1L << (TRANSIENT - 1)) | (1L << (VOID - 1)) | (1L << (VOLATILE - 1)) | (1L << (MODULE - 1)) | (1L << (OPEN - 1)) | (1L << (REQUIRES - 1)) | (1L << (EXPORTS - 1)) | (1L << (OPENS - 1)) | (1L << (TO - 1)) | (1L << (USES - 1)) | (1L << (PROVIDES - 1)) | (1L << (WITH - 1)) | (1L << (TRANSITIVE - 1)) | (1L << (VAR - 1)) | (1L << (YIELD - 1)) | (1L << (RECORD - 1)) | (1L << (SEALED - 1)))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (PERMITS - 65)) | (1L << (NON_SEALED - 65)) | (1L << (SEMI - 65)) | (1L << (LT - 65)) | (1L << (AT - 65)) | (1L << (IDENTIFIER - 65)))) != 0)) {
				{
				{
				setState(456);
				interfaceBodyDeclaration();
				}
				}
				setState(461);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(462);
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

	public static class ClassBodyDeclarationContext extends ParserRuleContext {
		public TerminalNode SEMI() { return getToken(JavaParser.SEMI, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode STATIC() { return getToken(JavaParser.STATIC, 0); }
		public MemberDeclarationContext memberDeclaration() {
			return getRuleContext(MemberDeclarationContext.class,0);
		}
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public ClassBodyDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBodyDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterClassBodyDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitClassBodyDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitClassBodyDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassBodyDeclarationContext classBodyDeclaration() throws RecognitionException {
		ClassBodyDeclarationContext _localctx = new ClassBodyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_classBodyDeclaration);
		int _la;
		try {
			int _alt;
			setState(476);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(464);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(466);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STATIC) {
					{
					setState(465);
					match(STATIC);
					}
				}

				setState(468);
				block();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(472);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(469);
						modifier();
						}
						} 
					}
					setState(474);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
				}
				setState(475);
				memberDeclaration();
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

	public static class MemberDeclarationContext extends ParserRuleContext {
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public GenericMethodDeclarationContext genericMethodDeclaration() {
			return getRuleContext(GenericMethodDeclarationContext.class,0);
		}
		public FieldDeclarationContext fieldDeclaration() {
			return getRuleContext(FieldDeclarationContext.class,0);
		}
		public ConstructorDeclarationContext constructorDeclaration() {
			return getRuleContext(ConstructorDeclarationContext.class,0);
		}
		public GenericConstructorDeclarationContext genericConstructorDeclaration() {
			return getRuleContext(GenericConstructorDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public AnnotationTypeDeclarationContext annotationTypeDeclaration() {
			return getRuleContext(AnnotationTypeDeclarationContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public EnumDeclarationContext enumDeclaration() {
			return getRuleContext(EnumDeclarationContext.class,0);
		}
		public RecordDeclarationContext recordDeclaration() {
			return getRuleContext(RecordDeclarationContext.class,0);
		}
		public MemberDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterMemberDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitMemberDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitMemberDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MemberDeclarationContext memberDeclaration() throws RecognitionException {
		MemberDeclarationContext _localctx = new MemberDeclarationContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_memberDeclaration);
		try {
			setState(488);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(478);
				methodDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(479);
				genericMethodDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(480);
				fieldDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(481);
				constructorDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(482);
				genericConstructorDeclaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(483);
				interfaceDeclaration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(484);
				annotationTypeDeclaration();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(485);
				classDeclaration();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(486);
				enumDeclaration();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(487);
				recordDeclaration();
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

	public static class MethodDeclarationContext extends ParserRuleContext {
		public TypeTypeOrVoidContext typeTypeOrVoid() {
			return getRuleContext(TypeTypeOrVoidContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public List<TerminalNode> LBRACK() { return getTokens(JavaParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(JavaParser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(JavaParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(JavaParser.RBRACK, i);
		}
		public TerminalNode THROWS() { return getToken(JavaParser.THROWS, 0); }
		public QualifiedNameListContext qualifiedNameList() {
			return getRuleContext(QualifiedNameListContext.class,0);
		}
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitMethodDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitMethodDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_methodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(490);
			typeTypeOrVoid();
			setState(491);
			identifier();
			setState(492);
			formalParameters();
			setState(497);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(493);
				match(LBRACK);
				setState(494);
				match(RBRACK);
				}
				}
				setState(499);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(502);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(500);
				match(THROWS);
				setState(501);
				qualifiedNameList();
				}
			}

			setState(504);
			methodBody();
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
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(JavaParser.SEMI, 0); }
		public MethodBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterMethodBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitMethodBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitMethodBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodBodyContext methodBody() throws RecognitionException {
		MethodBodyContext _localctx = new MethodBodyContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_methodBody);
		try {
			setState(508);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(506);
				block();
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				setState(507);
				match(SEMI);
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

	public static class TypeTypeOrVoidContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public TerminalNode VOID() { return getToken(JavaParser.VOID, 0); }
		public TypeTypeOrVoidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeTypeOrVoid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterTypeTypeOrVoid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitTypeTypeOrVoid(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitTypeTypeOrVoid(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeTypeOrVoidContext typeTypeOrVoid() throws RecognitionException {
		TypeTypeOrVoidContext _localctx = new TypeTypeOrVoidContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_typeTypeOrVoid);
		try {
			setState(512);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
			case MODULE:
			case OPEN:
			case REQUIRES:
			case EXPORTS:
			case OPENS:
			case TO:
			case USES:
			case PROVIDES:
			case WITH:
			case TRANSITIVE:
			case VAR:
			case YIELD:
			case RECORD:
			case SEALED:
			case PERMITS:
			case AT:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(510);
				typeType();
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 2);
				{
				setState(511);
				match(VOID);
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

	public static class GenericMethodDeclarationContext extends ParserRuleContext {
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public GenericMethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericMethodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterGenericMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitGenericMethodDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitGenericMethodDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GenericMethodDeclarationContext genericMethodDeclaration() throws RecognitionException {
		GenericMethodDeclarationContext _localctx = new GenericMethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_genericMethodDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(514);
			typeParameters();
			setState(515);
			methodDeclaration();
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

	public static class GenericConstructorDeclarationContext extends ParserRuleContext {
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public ConstructorDeclarationContext constructorDeclaration() {
			return getRuleContext(ConstructorDeclarationContext.class,0);
		}
		public GenericConstructorDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericConstructorDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterGenericConstructorDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitGenericConstructorDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitGenericConstructorDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GenericConstructorDeclarationContext genericConstructorDeclaration() throws RecognitionException {
		GenericConstructorDeclarationContext _localctx = new GenericConstructorDeclarationContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_genericConstructorDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(517);
			typeParameters();
			setState(518);
			constructorDeclaration();
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

	public static class ConstructorDeclarationContext extends ParserRuleContext {
		public BlockContext constructorBody;
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode THROWS() { return getToken(JavaParser.THROWS, 0); }
		public QualifiedNameListContext qualifiedNameList() {
			return getRuleContext(QualifiedNameListContext.class,0);
		}
		public ConstructorDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterConstructorDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitConstructorDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitConstructorDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorDeclarationContext constructorDeclaration() throws RecognitionException {
		ConstructorDeclarationContext _localctx = new ConstructorDeclarationContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_constructorDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(520);
			identifier();
			setState(521);
			formalParameters();
			setState(524);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(522);
				match(THROWS);
				setState(523);
				qualifiedNameList();
				}
			}

			setState(526);
			((ConstructorDeclarationContext)_localctx).constructorBody = block();
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

	public static class FieldDeclarationContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public VariableDeclaratorsContext variableDeclarators() {
			return getRuleContext(VariableDeclaratorsContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(JavaParser.SEMI, 0); }
		public FieldDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterFieldDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitFieldDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitFieldDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldDeclarationContext fieldDeclaration() throws RecognitionException {
		FieldDeclarationContext _localctx = new FieldDeclarationContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_fieldDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(528);
			typeType();
			setState(529);
			variableDeclarators();
			setState(530);
			match(SEMI);
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

	public static class InterfaceBodyDeclarationContext extends ParserRuleContext {
		public InterfaceMemberDeclarationContext interfaceMemberDeclaration() {
			return getRuleContext(InterfaceMemberDeclarationContext.class,0);
		}
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public TerminalNode SEMI() { return getToken(JavaParser.SEMI, 0); }
		public InterfaceBodyDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceBodyDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterInterfaceBodyDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitInterfaceBodyDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitInterfaceBodyDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceBodyDeclarationContext interfaceBodyDeclaration() throws RecognitionException {
		InterfaceBodyDeclarationContext _localctx = new InterfaceBodyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_interfaceBodyDeclaration);
		try {
			int _alt;
			setState(540);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ABSTRACT:
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case CLASS:
			case DEFAULT:
			case DOUBLE:
			case ENUM:
			case FINAL:
			case FLOAT:
			case INT:
			case INTERFACE:
			case LONG:
			case NATIVE:
			case PRIVATE:
			case PROTECTED:
			case PUBLIC:
			case SHORT:
			case STATIC:
			case STRICTFP:
			case SYNCHRONIZED:
			case TRANSIENT:
			case VOID:
			case VOLATILE:
			case MODULE:
			case OPEN:
			case REQUIRES:
			case EXPORTS:
			case OPENS:
			case TO:
			case USES:
			case PROVIDES:
			case WITH:
			case TRANSITIVE:
			case VAR:
			case YIELD:
			case RECORD:
			case SEALED:
			case PERMITS:
			case NON_SEALED:
			case LT:
			case AT:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(535);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(532);
						modifier();
						}
						} 
					}
					setState(537);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
				}
				setState(538);
				interfaceMemberDeclaration();
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				setState(539);
				match(SEMI);
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

	public static class InterfaceMemberDeclarationContext extends ParserRuleContext {
		public ConstDeclarationContext constDeclaration() {
			return getRuleContext(ConstDeclarationContext.class,0);
		}
		public InterfaceMethodDeclarationContext interfaceMethodDeclaration() {
			return getRuleContext(InterfaceMethodDeclarationContext.class,0);
		}
		public GenericInterfaceMethodDeclarationContext genericInterfaceMethodDeclaration() {
			return getRuleContext(GenericInterfaceMethodDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public AnnotationTypeDeclarationContext annotationTypeDeclaration() {
			return getRuleContext(AnnotationTypeDeclarationContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public EnumDeclarationContext enumDeclaration() {
			return getRuleContext(EnumDeclarationContext.class,0);
		}
		public RecordDeclarationContext recordDeclaration() {
			return getRuleContext(RecordDeclarationContext.class,0);
		}
		public InterfaceMemberDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceMemberDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterInterfaceMemberDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitInterfaceMemberDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitInterfaceMemberDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceMemberDeclarationContext interfaceMemberDeclaration() throws RecognitionException {
		InterfaceMemberDeclarationContext _localctx = new InterfaceMemberDeclarationContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_interfaceMemberDeclaration);
		try {
			setState(550);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(542);
				constDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(543);
				interfaceMethodDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(544);
				genericInterfaceMethodDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(545);
				interfaceDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(546);
				annotationTypeDeclaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(547);
				classDeclaration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(548);
				enumDeclaration();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(549);
				recordDeclaration();
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

	public static class ConstDeclarationContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public List<ConstantDeclaratorContext> constantDeclarator() {
			return getRuleContexts(ConstantDeclaratorContext.class);
		}
		public ConstantDeclaratorContext constantDeclarator(int i) {
			return getRuleContext(ConstantDeclaratorContext.class,i);
		}
		public TerminalNode SEMI() { return getToken(JavaParser.SEMI, 0); }
		public List<TerminalNode> COMMA() { return getTokens(JavaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JavaParser.COMMA, i);
		}
		public ConstDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterConstDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitConstDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitConstDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstDeclarationContext constDeclaration() throws RecognitionException {
		ConstDeclarationContext _localctx = new ConstDeclarationContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_constDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(552);
			typeType();
			setState(553);
			constantDeclarator();
			setState(558);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(554);
				match(COMMA);
				setState(555);
				constantDeclarator();
				}
				}
				setState(560);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(561);
			match(SEMI);
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

	public static class ConstantDeclaratorContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(JavaParser.ASSIGN, 0); }
		public VariableInitializerContext variableInitializer() {
			return getRuleContext(VariableInitializerContext.class,0);
		}
		public List<TerminalNode> LBRACK() { return getTokens(JavaParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(JavaParser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(JavaParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(JavaParser.RBRACK, i);
		}
		public ConstantDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterConstantDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitConstantDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitConstantDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantDeclaratorContext constantDeclarator() throws RecognitionException {
		ConstantDeclaratorContext _localctx = new ConstantDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_constantDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(563);
			identifier();
			setState(568);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(564);
				match(LBRACK);
				setState(565);
				match(RBRACK);
				}
				}
				setState(570);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(571);
			match(ASSIGN);
			setState(572);
			variableInitializer();
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

	public static class InterfaceMethodDeclarationContext extends ParserRuleContext {
		public InterfaceCommonBodyDeclarationContext interfaceCommonBodyDeclaration() {
			return getRuleContext(InterfaceCommonBodyDeclarationContext.class,0);
		}
		public List<InterfaceMethodModifierContext> interfaceMethodModifier() {
			return getRuleContexts(InterfaceMethodModifierContext.class);
		}
		public InterfaceMethodModifierContext interfaceMethodModifier(int i) {
			return getRuleContext(InterfaceMethodModifierContext.class,i);
		}
		public InterfaceMethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceMethodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterInterfaceMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitInterfaceMethodDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitInterfaceMethodDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceMethodDeclarationContext interfaceMethodDeclaration() throws RecognitionException {
		InterfaceMethodDeclarationContext _localctx = new InterfaceMethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_interfaceMethodDeclaration);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(577);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(574);
					interfaceMethodModifier();
					}
					} 
				}
				setState(579);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
			}
			setState(580);
			interfaceCommonBodyDeclaration();
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

	public static class InterfaceMethodModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public TerminalNode PUBLIC() { return getToken(JavaParser.PUBLIC, 0); }
		public TerminalNode ABSTRACT() { return getToken(JavaParser.ABSTRACT, 0); }
		public TerminalNode DEFAULT() { return getToken(JavaParser.DEFAULT, 0); }
		public TerminalNode STATIC() { return getToken(JavaParser.STATIC, 0); }
		public TerminalNode STRICTFP() { return getToken(JavaParser.STRICTFP, 0); }
		public InterfaceMethodModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceMethodModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterInterfaceMethodModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitInterfaceMethodModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitInterfaceMethodModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceMethodModifierContext interfaceMethodModifier() throws RecognitionException {
		InterfaceMethodModifierContext _localctx = new InterfaceMethodModifierContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_interfaceMethodModifier);
		try {
			setState(588);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MODULE:
			case OPEN:
			case REQUIRES:
			case EXPORTS:
			case OPENS:
			case TO:
			case USES:
			case PROVIDES:
			case WITH:
			case TRANSITIVE:
			case VAR:
			case YIELD:
			case RECORD:
			case SEALED:
			case PERMITS:
			case AT:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(582);
				annotation();
				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(583);
				match(PUBLIC);
				}
				break;
			case ABSTRACT:
				enterOuterAlt(_localctx, 3);
				{
				setState(584);
				match(ABSTRACT);
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 4);
				{
				setState(585);
				match(DEFAULT);
				}
				break;
			case STATIC:
				enterOuterAlt(_localctx, 5);
				{
				setState(586);
				match(STATIC);
				}
				break;
			case STRICTFP:
				enterOuterAlt(_localctx, 6);
				{
				setState(587);
				match(STRICTFP);
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

	public static class GenericInterfaceMethodDeclarationContext extends ParserRuleContext {
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public InterfaceCommonBodyDeclarationContext interfaceCommonBodyDeclaration() {
			return getRuleContext(InterfaceCommonBodyDeclarationContext.class,0);
		}
		public List<InterfaceMethodModifierContext> interfaceMethodModifier() {
			return getRuleContexts(InterfaceMethodModifierContext.class);
		}
		public InterfaceMethodModifierContext interfaceMethodModifier(int i) {
			return getRuleContext(InterfaceMethodModifierContext.class,i);
		}
		public GenericInterfaceMethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericInterfaceMethodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterGenericInterfaceMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitGenericInterfaceMethodDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitGenericInterfaceMethodDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GenericInterfaceMethodDeclarationContext genericInterfaceMethodDeclaration() throws RecognitionException {
		GenericInterfaceMethodDeclarationContext _localctx = new GenericInterfaceMethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_genericInterfaceMethodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(593);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 1)) & ~0x3f) == 0 && ((1L << (_la - 1)) & ((1L << (ABSTRACT - 1)) | (1L << (DEFAULT - 1)) | (1L << (PUBLIC - 1)) | (1L << (STATIC - 1)) | (1L << (STRICTFP - 1)) | (1L << (MODULE - 1)) | (1L << (OPEN - 1)) | (1L << (REQUIRES - 1)) | (1L << (EXPORTS - 1)) | (1L << (OPENS - 1)) | (1L << (TO - 1)) | (1L << (USES - 1)) | (1L << (PROVIDES - 1)) | (1L << (WITH - 1)) | (1L << (TRANSITIVE - 1)) | (1L << (VAR - 1)) | (1L << (YIELD - 1)) | (1L << (RECORD - 1)) | (1L << (SEALED - 1)))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (PERMITS - 65)) | (1L << (AT - 65)) | (1L << (IDENTIFIER - 65)))) != 0)) {
				{
				{
				setState(590);
				interfaceMethodModifier();
				}
				}
				setState(595);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(596);
			typeParameters();
			setState(597);
			interfaceCommonBodyDeclaration();
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

	public static class InterfaceCommonBodyDeclarationContext extends ParserRuleContext {
		public TypeTypeOrVoidContext typeTypeOrVoid() {
			return getRuleContext(TypeTypeOrVoidContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public List<TerminalNode> LBRACK() { return getTokens(JavaParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(JavaParser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(JavaParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(JavaParser.RBRACK, i);
		}
		public TerminalNode THROWS() { return getToken(JavaParser.THROWS, 0); }
		public QualifiedNameListContext qualifiedNameList() {
			return getRuleContext(QualifiedNameListContext.class,0);
		}
		public InterfaceCommonBodyDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceCommonBodyDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterInterfaceCommonBodyDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitInterfaceCommonBodyDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitInterfaceCommonBodyDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceCommonBodyDeclarationContext interfaceCommonBodyDeclaration() throws RecognitionException {
		InterfaceCommonBodyDeclarationContext _localctx = new InterfaceCommonBodyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_interfaceCommonBodyDeclaration);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(602);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(599);
					annotation();
					}
					} 
				}
				setState(604);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			}
			setState(605);
			typeTypeOrVoid();
			setState(606);
			identifier();
			setState(607);
			formalParameters();
			setState(612);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(608);
				match(LBRACK);
				setState(609);
				match(RBRACK);
				}
				}
				setState(614);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(617);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(615);
				match(THROWS);
				setState(616);
				qualifiedNameList();
				}
			}

			setState(619);
			methodBody();
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

	public static class VariableDeclaratorsContext extends ParserRuleContext {
		public List<VariableDeclaratorContext> variableDeclarator() {
			return getRuleContexts(VariableDeclaratorContext.class);
		}
		public VariableDeclaratorContext variableDeclarator(int i) {
			return getRuleContext(VariableDeclaratorContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JavaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JavaParser.COMMA, i);
		}
		public VariableDeclaratorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarators; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterVariableDeclarators(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitVariableDeclarators(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitVariableDeclarators(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclaratorsContext variableDeclarators() throws RecognitionException {
		VariableDeclaratorsContext _localctx = new VariableDeclaratorsContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_variableDeclarators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(621);
			variableDeclarator();
			setState(626);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(622);
				match(COMMA);
				setState(623);
				variableDeclarator();
				}
				}
				setState(628);
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

	public static class VariableDeclaratorContext extends ParserRuleContext {
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(JavaParser.ASSIGN, 0); }
		public VariableInitializerContext variableInitializer() {
			return getRuleContext(VariableInitializerContext.class,0);
		}
		public VariableDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterVariableDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitVariableDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitVariableDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclaratorContext variableDeclarator() throws RecognitionException {
		VariableDeclaratorContext _localctx = new VariableDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_variableDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(629);
			variableDeclaratorId();
			setState(632);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(630);
				match(ASSIGN);
				setState(631);
				variableInitializer();
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

	public static class VariableDeclaratorIdContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<TerminalNode> LBRACK() { return getTokens(JavaParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(JavaParser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(JavaParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(JavaParser.RBRACK, i);
		}
		public VariableDeclaratorIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaratorId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterVariableDeclaratorId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitVariableDeclaratorId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitVariableDeclaratorId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclaratorIdContext variableDeclaratorId() throws RecognitionException {
		VariableDeclaratorIdContext _localctx = new VariableDeclaratorIdContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_variableDeclaratorId);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(634);
			identifier();
			setState(639);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(635);
				match(LBRACK);
				setState(636);
				match(RBRACK);
				}
				}
				setState(641);
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

	public static class VariableInitializerContext extends ParserRuleContext {
		public ArrayInitializerContext arrayInitializer() {
			return getRuleContext(ArrayInitializerContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterVariableInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitVariableInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitVariableInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableInitializerContext variableInitializer() throws RecognitionException {
		VariableInitializerContext _localctx = new VariableInitializerContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_variableInitializer);
		try {
			setState(644);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(642);
				arrayInitializer();
				}
				break;
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case NEW:
			case SHORT:
			case SUPER:
			case SWITCH:
			case THIS:
			case VOID:
			case MODULE:
			case OPEN:
			case REQUIRES:
			case EXPORTS:
			case OPENS:
			case TO:
			case USES:
			case PROVIDES:
			case WITH:
			case TRANSITIVE:
			case VAR:
			case YIELD:
			case RECORD:
			case SEALED:
			case PERMITS:
			case DECIMAL_LITERAL:
			case HEX_LITERAL:
			case OCT_LITERAL:
			case BINARY_LITERAL:
			case FLOAT_LITERAL:
			case HEX_FLOAT_LITERAL:
			case BOOL_LITERAL:
			case CHAR_LITERAL:
			case STRING_LITERAL:
			case TEXT_BLOCK:
			case NULL_LITERAL:
			case LPAREN:
			case LT:
			case BANG:
			case TILDE:
			case INC:
			case DEC:
			case ADD:
			case SUB:
			case AT:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(643);
				expression(0);
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

	public static class ArrayInitializerContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(JavaParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(JavaParser.RBRACE, 0); }
		public List<VariableInitializerContext> variableInitializer() {
			return getRuleContexts(VariableInitializerContext.class);
		}
		public VariableInitializerContext variableInitializer(int i) {
			return getRuleContext(VariableInitializerContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JavaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JavaParser.COMMA, i);
		}
		public ArrayInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterArrayInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitArrayInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitArrayInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayInitializerContext arrayInitializer() throws RecognitionException {
		ArrayInitializerContext _localctx = new ArrayInitializerContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_arrayInitializer);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(646);
			match(LBRACE);
			setState(658);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 3)) & ~0x3f) == 0 && ((1L << (_la - 3)) & ((1L << (BOOLEAN - 3)) | (1L << (BYTE - 3)) | (1L << (CHAR - 3)) | (1L << (DOUBLE - 3)) | (1L << (FLOAT - 3)) | (1L << (INT - 3)) | (1L << (LONG - 3)) | (1L << (NEW - 3)) | (1L << (SHORT - 3)) | (1L << (SUPER - 3)) | (1L << (SWITCH - 3)) | (1L << (THIS - 3)) | (1L << (VOID - 3)) | (1L << (MODULE - 3)) | (1L << (OPEN - 3)) | (1L << (REQUIRES - 3)) | (1L << (EXPORTS - 3)) | (1L << (OPENS - 3)) | (1L << (TO - 3)) | (1L << (USES - 3)) | (1L << (PROVIDES - 3)) | (1L << (WITH - 3)) | (1L << (TRANSITIVE - 3)) | (1L << (VAR - 3)) | (1L << (YIELD - 3)) | (1L << (RECORD - 3)) | (1L << (SEALED - 3)) | (1L << (PERMITS - 3)))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (DECIMAL_LITERAL - 67)) | (1L << (HEX_LITERAL - 67)) | (1L << (OCT_LITERAL - 67)) | (1L << (BINARY_LITERAL - 67)) | (1L << (FLOAT_LITERAL - 67)) | (1L << (HEX_FLOAT_LITERAL - 67)) | (1L << (BOOL_LITERAL - 67)) | (1L << (CHAR_LITERAL - 67)) | (1L << (STRING_LITERAL - 67)) | (1L << (TEXT_BLOCK - 67)) | (1L << (NULL_LITERAL - 67)) | (1L << (LPAREN - 67)) | (1L << (LBRACE - 67)) | (1L << (LT - 67)) | (1L << (BANG - 67)) | (1L << (TILDE - 67)) | (1L << (INC - 67)) | (1L << (DEC - 67)) | (1L << (ADD - 67)) | (1L << (SUB - 67)) | (1L << (AT - 67)) | (1L << (IDENTIFIER - 67)))) != 0)) {
				{
				setState(647);
				variableInitializer();
				setState(652);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(648);
						match(COMMA);
						setState(649);
						variableInitializer();
						}
						} 
					}
					setState(654);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
				}
				setState(656);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(655);
					match(COMMA);
					}
				}

				}
			}

			setState(660);
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

	public static class ClassOrInterfaceTypeContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TypeArgumentsContext> typeArguments() {
			return getRuleContexts(TypeArgumentsContext.class);
		}
		public TypeArgumentsContext typeArguments(int i) {
			return getRuleContext(TypeArgumentsContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(JavaParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(JavaParser.DOT, i);
		}
		public ClassOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classOrInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterClassOrInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitClassOrInterfaceType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitClassOrInterfaceType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassOrInterfaceTypeContext classOrInterfaceType() throws RecognitionException {
		ClassOrInterfaceTypeContext _localctx = new ClassOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_classOrInterfaceType);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(662);
			identifier();
			setState(664);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
			case 1:
				{
				setState(663);
				typeArguments();
				}
				break;
			}
			setState(673);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(666);
					match(DOT);
					setState(667);
					identifier();
					setState(669);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
					case 1:
						{
						setState(668);
						typeArguments();
						}
						break;
					}
					}
					} 
				}
				setState(675);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
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

	public static class TypeArgumentContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public TerminalNode QUESTION() { return getToken(JavaParser.QUESTION, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public TerminalNode EXTENDS() { return getToken(JavaParser.EXTENDS, 0); }
		public TerminalNode SUPER() { return getToken(JavaParser.SUPER, 0); }
		public TypeArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArgument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterTypeArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitTypeArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitTypeArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeArgumentContext typeArgument() throws RecognitionException {
		TypeArgumentContext _localctx = new TypeArgumentContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_typeArgument);
		int _la;
		try {
			setState(688);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(676);
				typeType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(680);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 51)) & ~0x3f) == 0 && ((1L << (_la - 51)) & ((1L << (MODULE - 51)) | (1L << (OPEN - 51)) | (1L << (REQUIRES - 51)) | (1L << (EXPORTS - 51)) | (1L << (OPENS - 51)) | (1L << (TO - 51)) | (1L << (USES - 51)) | (1L << (PROVIDES - 51)) | (1L << (WITH - 51)) | (1L << (TRANSITIVE - 51)) | (1L << (VAR - 51)) | (1L << (YIELD - 51)) | (1L << (RECORD - 51)) | (1L << (SEALED - 51)) | (1L << (PERMITS - 51)))) != 0) || _la==AT || _la==IDENTIFIER) {
					{
					{
					setState(677);
					annotation();
					}
					}
					setState(682);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(683);
				match(QUESTION);
				setState(686);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EXTENDS || _la==SUPER) {
					{
					setState(684);
					_la = _input.LA(1);
					if ( !(_la==EXTENDS || _la==SUPER) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(685);
					typeType();
					}
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

	public static class QualifiedNameListContext extends ParserRuleContext {
		public List<QualifiedNameContext> qualifiedName() {
			return getRuleContexts(QualifiedNameContext.class);
		}
		public QualifiedNameContext qualifiedName(int i) {
			return getRuleContext(QualifiedNameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JavaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JavaParser.COMMA, i);
		}
		public QualifiedNameListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedNameList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterQualifiedNameList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitQualifiedNameList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitQualifiedNameList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedNameListContext qualifiedNameList() throws RecognitionException {
		QualifiedNameListContext _localctx = new QualifiedNameListContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_qualifiedNameList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(690);
			qualifiedName();
			setState(695);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(691);
				match(COMMA);
				setState(692);
				qualifiedName();
				}
				}
				setState(697);
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

	public static class FormalParametersContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(JavaParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(JavaParser.RPAREN, 0); }
		public ReceiverParameterContext receiverParameter() {
			return getRuleContext(ReceiverParameterContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(JavaParser.COMMA, 0); }
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public FormalParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterFormalParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitFormalParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitFormalParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParametersContext formalParameters() throws RecognitionException {
		FormalParametersContext _localctx = new FormalParametersContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_formalParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(698);
			match(LPAREN);
			setState(710);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
			case 1:
				{
				setState(700);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 3)) & ~0x3f) == 0 && ((1L << (_la - 3)) & ((1L << (BOOLEAN - 3)) | (1L << (BYTE - 3)) | (1L << (CHAR - 3)) | (1L << (DOUBLE - 3)) | (1L << (FLOAT - 3)) | (1L << (INT - 3)) | (1L << (LONG - 3)) | (1L << (SHORT - 3)) | (1L << (MODULE - 3)) | (1L << (OPEN - 3)) | (1L << (REQUIRES - 3)) | (1L << (EXPORTS - 3)) | (1L << (OPENS - 3)) | (1L << (TO - 3)) | (1L << (USES - 3)) | (1L << (PROVIDES - 3)) | (1L << (WITH - 3)) | (1L << (TRANSITIVE - 3)) | (1L << (VAR - 3)) | (1L << (YIELD - 3)) | (1L << (RECORD - 3)) | (1L << (SEALED - 3)) | (1L << (PERMITS - 3)))) != 0) || _la==AT || _la==IDENTIFIER) {
					{
					setState(699);
					receiverParameter();
					}
				}

				}
				break;
			case 2:
				{
				setState(702);
				receiverParameter();
				setState(705);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(703);
					match(COMMA);
					setState(704);
					formalParameterList();
					}
				}

				}
				break;
			case 3:
				{
				setState(708);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 3)) & ~0x3f) == 0 && ((1L << (_la - 3)) & ((1L << (BOOLEAN - 3)) | (1L << (BYTE - 3)) | (1L << (CHAR - 3)) | (1L << (DOUBLE - 3)) | (1L << (FINAL - 3)) | (1L << (FLOAT - 3)) | (1L << (INT - 3)) | (1L << (LONG - 3)) | (1L << (SHORT - 3)) | (1L << (MODULE - 3)) | (1L << (OPEN - 3)) | (1L << (REQUIRES - 3)) | (1L << (EXPORTS - 3)) | (1L << (OPENS - 3)) | (1L << (TO - 3)) | (1L << (USES - 3)) | (1L << (PROVIDES - 3)) | (1L << (WITH - 3)) | (1L << (TRANSITIVE - 3)) | (1L << (VAR - 3)) | (1L << (YIELD - 3)) | (1L << (RECORD - 3)) | (1L << (SEALED - 3)) | (1L << (PERMITS - 3)))) != 0) || _la==AT || _la==IDENTIFIER) {
					{
					setState(707);
					formalParameterList();
					}
				}

				}
				break;
			}
			setState(712);
			match(RPAREN);
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

	public static class ReceiverParameterContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public TerminalNode THIS() { return getToken(JavaParser.THIS, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(JavaParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(JavaParser.DOT, i);
		}
		public ReceiverParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_receiverParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterReceiverParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitReceiverParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitReceiverParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReceiverParameterContext receiverParameter() throws RecognitionException {
		ReceiverParameterContext _localctx = new ReceiverParameterContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_receiverParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(714);
			typeType();
			setState(720);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 51)) & ~0x3f) == 0 && ((1L << (_la - 51)) & ((1L << (MODULE - 51)) | (1L << (OPEN - 51)) | (1L << (REQUIRES - 51)) | (1L << (EXPORTS - 51)) | (1L << (OPENS - 51)) | (1L << (TO - 51)) | (1L << (USES - 51)) | (1L << (PROVIDES - 51)) | (1L << (WITH - 51)) | (1L << (TRANSITIVE - 51)) | (1L << (VAR - 51)) | (1L << (YIELD - 51)) | (1L << (RECORD - 51)) | (1L << (SEALED - 51)) | (1L << (PERMITS - 51)))) != 0) || _la==IDENTIFIER) {
				{
				{
				setState(715);
				identifier();
				setState(716);
				match(DOT);
				}
				}
				setState(722);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(723);
			match(THIS);
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

	public static class FormalParameterListContext extends ParserRuleContext {
		public List<FormalParameterContext> formalParameter() {
			return getRuleContexts(FormalParameterContext.class);
		}
		public FormalParameterContext formalParameter(int i) {
			return getRuleContext(FormalParameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JavaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JavaParser.COMMA, i);
		}
		public LastFormalParameterContext lastFormalParameter() {
			return getRuleContext(LastFormalParameterContext.class,0);
		}
		public FormalParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterFormalParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitFormalParameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitFormalParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParameterListContext formalParameterList() throws RecognitionException {
		FormalParameterListContext _localctx = new FormalParameterListContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_formalParameterList);
		int _la;
		try {
			int _alt;
			setState(738);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(725);
				formalParameter();
				setState(730);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,75,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(726);
						match(COMMA);
						setState(727);
						formalParameter();
						}
						} 
					}
					setState(732);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,75,_ctx);
				}
				setState(735);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(733);
					match(COMMA);
					setState(734);
					lastFormalParameter();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(737);
				lastFormalParameter();
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

	public static class FormalParameterContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public FormalParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterFormalParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitFormalParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitFormalParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParameterContext formalParameter() throws RecognitionException {
		FormalParameterContext _localctx = new FormalParameterContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_formalParameter);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(743);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,78,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(740);
					variableModifier();
					}
					} 
				}
				setState(745);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,78,_ctx);
			}
			setState(746);
			typeType();
			setState(747);
			variableDeclaratorId();
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

	public static class LastFormalParameterContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public TerminalNode ELLIPSIS() { return getToken(JavaParser.ELLIPSIS, 0); }
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public LastFormalParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lastFormalParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterLastFormalParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitLastFormalParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitLastFormalParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LastFormalParameterContext lastFormalParameter() throws RecognitionException {
		LastFormalParameterContext _localctx = new LastFormalParameterContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_lastFormalParameter);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(752);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(749);
					variableModifier();
					}
					} 
				}
				setState(754);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
			}
			setState(755);
			typeType();
			setState(759);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 51)) & ~0x3f) == 0 && ((1L << (_la - 51)) & ((1L << (MODULE - 51)) | (1L << (OPEN - 51)) | (1L << (REQUIRES - 51)) | (1L << (EXPORTS - 51)) | (1L << (OPENS - 51)) | (1L << (TO - 51)) | (1L << (USES - 51)) | (1L << (PROVIDES - 51)) | (1L << (WITH - 51)) | (1L << (TRANSITIVE - 51)) | (1L << (VAR - 51)) | (1L << (YIELD - 51)) | (1L << (RECORD - 51)) | (1L << (SEALED - 51)) | (1L << (PERMITS - 51)))) != 0) || _la==AT || _la==IDENTIFIER) {
				{
				{
				setState(756);
				annotation();
				}
				}
				setState(761);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(762);
			match(ELLIPSIS);
			setState(763);
			variableDeclaratorId();
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

	public static class LambdaLVTIListContext extends ParserRuleContext {
		public List<LambdaLVTIParameterContext> lambdaLVTIParameter() {
			return getRuleContexts(LambdaLVTIParameterContext.class);
		}
		public LambdaLVTIParameterContext lambdaLVTIParameter(int i) {
			return getRuleContext(LambdaLVTIParameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JavaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JavaParser.COMMA, i);
		}
		public LambdaLVTIListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaLVTIList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterLambdaLVTIList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitLambdaLVTIList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitLambdaLVTIList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LambdaLVTIListContext lambdaLVTIList() throws RecognitionException {
		LambdaLVTIListContext _localctx = new LambdaLVTIListContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_lambdaLVTIList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(765);
			lambdaLVTIParameter();
			setState(770);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(766);
				match(COMMA);
				setState(767);
				lambdaLVTIParameter();
				}
				}
				setState(772);
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

	public static class LambdaLVTIParameterContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(JavaParser.VAR, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public LambdaLVTIParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaLVTIParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterLambdaLVTIParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitLambdaLVTIParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitLambdaLVTIParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LambdaLVTIParameterContext lambdaLVTIParameter() throws RecognitionException {
		LambdaLVTIParameterContext _localctx = new LambdaLVTIParameterContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_lambdaLVTIParameter);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(776);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,82,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(773);
					variableModifier();
					}
					} 
				}
				setState(778);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,82,_ctx);
			}
			setState(779);
			match(VAR);
			setState(780);
			identifier();
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

	public static class QualifiedNameContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(JavaParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(JavaParser.DOT, i);
		}
		public QualifiedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterQualifiedName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitQualifiedName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitQualifiedName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedNameContext qualifiedName() throws RecognitionException {
		QualifiedNameContext _localctx = new QualifiedNameContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_qualifiedName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(782);
			identifier();
			setState(787);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,83,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(783);
					match(DOT);
					setState(784);
					identifier();
					}
					} 
				}
				setState(789);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,83,_ctx);
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

	public static class LiteralContext extends ParserRuleContext {
		public IntegerLiteralContext integerLiteral() {
			return getRuleContext(IntegerLiteralContext.class,0);
		}
		public FloatLiteralContext floatLiteral() {
			return getRuleContext(FloatLiteralContext.class,0);
		}
		public TerminalNode CHAR_LITERAL() { return getToken(JavaParser.CHAR_LITERAL, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(JavaParser.STRING_LITERAL, 0); }
		public TerminalNode BOOL_LITERAL() { return getToken(JavaParser.BOOL_LITERAL, 0); }
		public TerminalNode NULL_LITERAL() { return getToken(JavaParser.NULL_LITERAL, 0); }
		public TerminalNode TEXT_BLOCK() { return getToken(JavaParser.TEXT_BLOCK, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_literal);
		try {
			setState(797);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DECIMAL_LITERAL:
			case HEX_LITERAL:
			case OCT_LITERAL:
			case BINARY_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(790);
				integerLiteral();
				}
				break;
			case FLOAT_LITERAL:
			case HEX_FLOAT_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(791);
				floatLiteral();
				}
				break;
			case CHAR_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(792);
				match(CHAR_LITERAL);
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(793);
				match(STRING_LITERAL);
				}
				break;
			case BOOL_LITERAL:
				enterOuterAlt(_localctx, 5);
				{
				setState(794);
				match(BOOL_LITERAL);
				}
				break;
			case NULL_LITERAL:
				enterOuterAlt(_localctx, 6);
				{
				setState(795);
				match(NULL_LITERAL);
				}
				break;
			case TEXT_BLOCK:
				enterOuterAlt(_localctx, 7);
				{
				setState(796);
				match(TEXT_BLOCK);
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

	public static class IntegerLiteralContext extends ParserRuleContext {
		public TerminalNode DECIMAL_LITERAL() { return getToken(JavaParser.DECIMAL_LITERAL, 0); }
		public TerminalNode HEX_LITERAL() { return getToken(JavaParser.HEX_LITERAL, 0); }
		public TerminalNode OCT_LITERAL() { return getToken(JavaParser.OCT_LITERAL, 0); }
		public TerminalNode BINARY_LITERAL() { return getToken(JavaParser.BINARY_LITERAL, 0); }
		public IntegerLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integerLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterIntegerLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitIntegerLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitIntegerLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntegerLiteralContext integerLiteral() throws RecognitionException {
		IntegerLiteralContext _localctx = new IntegerLiteralContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_integerLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(799);
			_la = _input.LA(1);
			if ( !(((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (DECIMAL_LITERAL - 67)) | (1L << (HEX_LITERAL - 67)) | (1L << (OCT_LITERAL - 67)) | (1L << (BINARY_LITERAL - 67)))) != 0)) ) {
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

	public static class FloatLiteralContext extends ParserRuleContext {
		public TerminalNode FLOAT_LITERAL() { return getToken(JavaParser.FLOAT_LITERAL, 0); }
		public TerminalNode HEX_FLOAT_LITERAL() { return getToken(JavaParser.HEX_FLOAT_LITERAL, 0); }
		public FloatLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floatLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterFloatLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitFloatLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitFloatLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FloatLiteralContext floatLiteral() throws RecognitionException {
		FloatLiteralContext _localctx = new FloatLiteralContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_floatLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(801);
			_la = _input.LA(1);
			if ( !(_la==FLOAT_LITERAL || _la==HEX_FLOAT_LITERAL) ) {
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

	public static class AltAnnotationQualifiedNameContext extends ParserRuleContext {
		public TerminalNode AT() { return getToken(JavaParser.AT, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(JavaParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(JavaParser.DOT, i);
		}
		public AltAnnotationQualifiedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_altAnnotationQualifiedName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterAltAnnotationQualifiedName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitAltAnnotationQualifiedName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitAltAnnotationQualifiedName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AltAnnotationQualifiedNameContext altAnnotationQualifiedName() throws RecognitionException {
		AltAnnotationQualifiedNameContext _localctx = new AltAnnotationQualifiedNameContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_altAnnotationQualifiedName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(808);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 51)) & ~0x3f) == 0 && ((1L << (_la - 51)) & ((1L << (MODULE - 51)) | (1L << (OPEN - 51)) | (1L << (REQUIRES - 51)) | (1L << (EXPORTS - 51)) | (1L << (OPENS - 51)) | (1L << (TO - 51)) | (1L << (USES - 51)) | (1L << (PROVIDES - 51)) | (1L << (WITH - 51)) | (1L << (TRANSITIVE - 51)) | (1L << (VAR - 51)) | (1L << (YIELD - 51)) | (1L << (RECORD - 51)) | (1L << (SEALED - 51)) | (1L << (PERMITS - 51)))) != 0) || _la==IDENTIFIER) {
				{
				{
				setState(803);
				identifier();
				setState(804);
				match(DOT);
				}
				}
				setState(810);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(811);
			match(AT);
			setState(812);
			identifier();
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

	public static class AnnotationContext extends ParserRuleContext {
		public TerminalNode AT() { return getToken(JavaParser.AT, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public AltAnnotationQualifiedNameContext altAnnotationQualifiedName() {
			return getRuleContext(AltAnnotationQualifiedNameContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(JavaParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(JavaParser.RPAREN, 0); }
		public ElementValuePairsContext elementValuePairs() {
			return getRuleContext(ElementValuePairsContext.class,0);
		}
		public ElementValueContext elementValue() {
			return getRuleContext(ElementValueContext.class,0);
		}
		public AnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterAnnotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitAnnotation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitAnnotation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationContext annotation() throws RecognitionException {
		AnnotationContext _localctx = new AnnotationContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_annotation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(817);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
			case 1:
				{
				setState(814);
				match(AT);
				setState(815);
				qualifiedName();
				}
				break;
			case 2:
				{
				setState(816);
				altAnnotationQualifiedName();
				}
				break;
			}
			setState(825);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(819);
				match(LPAREN);
				setState(822);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
				case 1:
					{
					setState(820);
					elementValuePairs();
					}
					break;
				case 2:
					{
					setState(821);
					elementValue();
					}
					break;
				}
				setState(824);
				match(RPAREN);
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

	public static class ElementValuePairsContext extends ParserRuleContext {
		public List<ElementValuePairContext> elementValuePair() {
			return getRuleContexts(ElementValuePairContext.class);
		}
		public ElementValuePairContext elementValuePair(int i) {
			return getRuleContext(ElementValuePairContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JavaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JavaParser.COMMA, i);
		}
		public ElementValuePairsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValuePairs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterElementValuePairs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitElementValuePairs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitElementValuePairs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementValuePairsContext elementValuePairs() throws RecognitionException {
		ElementValuePairsContext _localctx = new ElementValuePairsContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_elementValuePairs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(827);
			elementValuePair();
			setState(832);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(828);
				match(COMMA);
				setState(829);
				elementValuePair();
				}
				}
				setState(834);
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

	public static class ElementValuePairContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(JavaParser.ASSIGN, 0); }
		public ElementValueContext elementValue() {
			return getRuleContext(ElementValueContext.class,0);
		}
		public ElementValuePairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValuePair; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterElementValuePair(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitElementValuePair(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitElementValuePair(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementValuePairContext elementValuePair() throws RecognitionException {
		ElementValuePairContext _localctx = new ElementValuePairContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_elementValuePair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(835);
			identifier();
			setState(836);
			match(ASSIGN);
			setState(837);
			elementValue();
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

	public static class ElementValueContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public ElementValueArrayInitializerContext elementValueArrayInitializer() {
			return getRuleContext(ElementValueArrayInitializerContext.class,0);
		}
		public ElementValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterElementValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitElementValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitElementValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementValueContext elementValue() throws RecognitionException {
		ElementValueContext _localctx = new ElementValueContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_elementValue);
		try {
			setState(842);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(839);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(840);
				annotation();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(841);
				elementValueArrayInitializer();
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

	public static class ElementValueArrayInitializerContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(JavaParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(JavaParser.RBRACE, 0); }
		public List<ElementValueContext> elementValue() {
			return getRuleContexts(ElementValueContext.class);
		}
		public ElementValueContext elementValue(int i) {
			return getRuleContext(ElementValueContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JavaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JavaParser.COMMA, i);
		}
		public ElementValueArrayInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValueArrayInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterElementValueArrayInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitElementValueArrayInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitElementValueArrayInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementValueArrayInitializerContext elementValueArrayInitializer() throws RecognitionException {
		ElementValueArrayInitializerContext _localctx = new ElementValueArrayInitializerContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_elementValueArrayInitializer);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(844);
			match(LBRACE);
			setState(853);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 3)) & ~0x3f) == 0 && ((1L << (_la - 3)) & ((1L << (BOOLEAN - 3)) | (1L << (BYTE - 3)) | (1L << (CHAR - 3)) | (1L << (DOUBLE - 3)) | (1L << (FLOAT - 3)) | (1L << (INT - 3)) | (1L << (LONG - 3)) | (1L << (NEW - 3)) | (1L << (SHORT - 3)) | (1L << (SUPER - 3)) | (1L << (SWITCH - 3)) | (1L << (THIS - 3)) | (1L << (VOID - 3)) | (1L << (MODULE - 3)) | (1L << (OPEN - 3)) | (1L << (REQUIRES - 3)) | (1L << (EXPORTS - 3)) | (1L << (OPENS - 3)) | (1L << (TO - 3)) | (1L << (USES - 3)) | (1L << (PROVIDES - 3)) | (1L << (WITH - 3)) | (1L << (TRANSITIVE - 3)) | (1L << (VAR - 3)) | (1L << (YIELD - 3)) | (1L << (RECORD - 3)) | (1L << (SEALED - 3)) | (1L << (PERMITS - 3)))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (DECIMAL_LITERAL - 67)) | (1L << (HEX_LITERAL - 67)) | (1L << (OCT_LITERAL - 67)) | (1L << (BINARY_LITERAL - 67)) | (1L << (FLOAT_LITERAL - 67)) | (1L << (HEX_FLOAT_LITERAL - 67)) | (1L << (BOOL_LITERAL - 67)) | (1L << (CHAR_LITERAL - 67)) | (1L << (STRING_LITERAL - 67)) | (1L << (TEXT_BLOCK - 67)) | (1L << (NULL_LITERAL - 67)) | (1L << (LPAREN - 67)) | (1L << (LBRACE - 67)) | (1L << (LT - 67)) | (1L << (BANG - 67)) | (1L << (TILDE - 67)) | (1L << (INC - 67)) | (1L << (DEC - 67)) | (1L << (ADD - 67)) | (1L << (SUB - 67)) | (1L << (AT - 67)) | (1L << (IDENTIFIER - 67)))) != 0)) {
				{
				setState(845);
				elementValue();
				setState(850);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,91,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(846);
						match(COMMA);
						setState(847);
						elementValue();
						}
						} 
					}
					setState(852);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,91,_ctx);
				}
				}
			}

			setState(856);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(855);
				match(COMMA);
				}
			}

			setState(858);
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

	public static class AnnotationTypeDeclarationContext extends ParserRuleContext {
		public TerminalNode AT() { return getToken(JavaParser.AT, 0); }
		public TerminalNode INTERFACE() { return getToken(JavaParser.INTERFACE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public AnnotationTypeBodyContext annotationTypeBody() {
			return getRuleContext(AnnotationTypeBodyContext.class,0);
		}
		public AnnotationTypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterAnnotationTypeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitAnnotationTypeDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitAnnotationTypeDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationTypeDeclarationContext annotationTypeDeclaration() throws RecognitionException {
		AnnotationTypeDeclarationContext _localctx = new AnnotationTypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_annotationTypeDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(860);
			match(AT);
			setState(861);
			match(INTERFACE);
			setState(862);
			identifier();
			setState(863);
			annotationTypeBody();
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

	public static class AnnotationTypeBodyContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(JavaParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(JavaParser.RBRACE, 0); }
		public List<AnnotationTypeElementDeclarationContext> annotationTypeElementDeclaration() {
			return getRuleContexts(AnnotationTypeElementDeclarationContext.class);
		}
		public AnnotationTypeElementDeclarationContext annotationTypeElementDeclaration(int i) {
			return getRuleContext(AnnotationTypeElementDeclarationContext.class,i);
		}
		public AnnotationTypeBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterAnnotationTypeBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitAnnotationTypeBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitAnnotationTypeBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationTypeBodyContext annotationTypeBody() throws RecognitionException {
		AnnotationTypeBodyContext _localctx = new AnnotationTypeBodyContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_annotationTypeBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(865);
			match(LBRACE);
			setState(869);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 1)) & ~0x3f) == 0 && ((1L << (_la - 1)) & ((1L << (ABSTRACT - 1)) | (1L << (BOOLEAN - 1)) | (1L << (BYTE - 1)) | (1L << (CHAR - 1)) | (1L << (CLASS - 1)) | (1L << (DOUBLE - 1)) | (1L << (ENUM - 1)) | (1L << (FINAL - 1)) | (1L << (FLOAT - 1)) | (1L << (INT - 1)) | (1L << (INTERFACE - 1)) | (1L << (LONG - 1)) | (1L << (NATIVE - 1)) | (1L << (PRIVATE - 1)) | (1L << (PROTECTED - 1)) | (1L << (PUBLIC - 1)) | (1L << (SHORT - 1)) | (1L << (STATIC - 1)) | (1L << (STRICTFP - 1)) | (1L << (SYNCHRONIZED - 1)) | (1L << (TRANSIENT - 1)) | (1L << (VOLATILE - 1)) | (1L << (MODULE - 1)) | (1L << (OPEN - 1)) | (1L << (REQUIRES - 1)) | (1L << (EXPORTS - 1)) | (1L << (OPENS - 1)) | (1L << (TO - 1)) | (1L << (USES - 1)) | (1L << (PROVIDES - 1)) | (1L << (WITH - 1)) | (1L << (TRANSITIVE - 1)) | (1L << (VAR - 1)) | (1L << (YIELD - 1)) | (1L << (RECORD - 1)) | (1L << (SEALED - 1)))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (PERMITS - 65)) | (1L << (NON_SEALED - 65)) | (1L << (SEMI - 65)) | (1L << (AT - 65)) | (1L << (IDENTIFIER - 65)))) != 0)) {
				{
				{
				setState(866);
				annotationTypeElementDeclaration();
				}
				}
				setState(871);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(872);
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

	public static class AnnotationTypeElementDeclarationContext extends ParserRuleContext {
		public AnnotationTypeElementRestContext annotationTypeElementRest() {
			return getRuleContext(AnnotationTypeElementRestContext.class,0);
		}
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public TerminalNode SEMI() { return getToken(JavaParser.SEMI, 0); }
		public AnnotationTypeElementDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeElementDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterAnnotationTypeElementDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitAnnotationTypeElementDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitAnnotationTypeElementDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationTypeElementDeclarationContext annotationTypeElementDeclaration() throws RecognitionException {
		AnnotationTypeElementDeclarationContext _localctx = new AnnotationTypeElementDeclarationContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_annotationTypeElementDeclaration);
		try {
			int _alt;
			setState(882);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ABSTRACT:
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case CLASS:
			case DOUBLE:
			case ENUM:
			case FINAL:
			case FLOAT:
			case INT:
			case INTERFACE:
			case LONG:
			case NATIVE:
			case PRIVATE:
			case PROTECTED:
			case PUBLIC:
			case SHORT:
			case STATIC:
			case STRICTFP:
			case SYNCHRONIZED:
			case TRANSIENT:
			case VOLATILE:
			case MODULE:
			case OPEN:
			case REQUIRES:
			case EXPORTS:
			case OPENS:
			case TO:
			case USES:
			case PROVIDES:
			case WITH:
			case TRANSITIVE:
			case VAR:
			case YIELD:
			case RECORD:
			case SEALED:
			case PERMITS:
			case NON_SEALED:
			case AT:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(877);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,95,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(874);
						modifier();
						}
						} 
					}
					setState(879);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,95,_ctx);
				}
				setState(880);
				annotationTypeElementRest();
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				setState(881);
				match(SEMI);
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

	public static class AnnotationTypeElementRestContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public AnnotationMethodOrConstantRestContext annotationMethodOrConstantRest() {
			return getRuleContext(AnnotationMethodOrConstantRestContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(JavaParser.SEMI, 0); }
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public EnumDeclarationContext enumDeclaration() {
			return getRuleContext(EnumDeclarationContext.class,0);
		}
		public AnnotationTypeDeclarationContext annotationTypeDeclaration() {
			return getRuleContext(AnnotationTypeDeclarationContext.class,0);
		}
		public RecordDeclarationContext recordDeclaration() {
			return getRuleContext(RecordDeclarationContext.class,0);
		}
		public AnnotationTypeElementRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeElementRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterAnnotationTypeElementRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitAnnotationTypeElementRest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitAnnotationTypeElementRest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationTypeElementRestContext annotationTypeElementRest() throws RecognitionException {
		AnnotationTypeElementRestContext _localctx = new AnnotationTypeElementRestContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_annotationTypeElementRest);
		try {
			setState(908);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(884);
				typeType();
				setState(885);
				annotationMethodOrConstantRest();
				setState(886);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(888);
				classDeclaration();
				setState(890);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,97,_ctx) ) {
				case 1:
					{
					setState(889);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(892);
				interfaceDeclaration();
				setState(894);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
				case 1:
					{
					setState(893);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(896);
				enumDeclaration();
				setState(898);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
				case 1:
					{
					setState(897);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(900);
				annotationTypeDeclaration();
				setState(902);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,100,_ctx) ) {
				case 1:
					{
					setState(901);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(904);
				recordDeclaration();
				setState(906);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,101,_ctx) ) {
				case 1:
					{
					setState(905);
					match(SEMI);
					}
					break;
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

	public static class AnnotationMethodOrConstantRestContext extends ParserRuleContext {
		public AnnotationMethodRestContext annotationMethodRest() {
			return getRuleContext(AnnotationMethodRestContext.class,0);
		}
		public AnnotationConstantRestContext annotationConstantRest() {
			return getRuleContext(AnnotationConstantRestContext.class,0);
		}
		public AnnotationMethodOrConstantRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationMethodOrConstantRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterAnnotationMethodOrConstantRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitAnnotationMethodOrConstantRest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitAnnotationMethodOrConstantRest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationMethodOrConstantRestContext annotationMethodOrConstantRest() throws RecognitionException {
		AnnotationMethodOrConstantRestContext _localctx = new AnnotationMethodOrConstantRestContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_annotationMethodOrConstantRest);
		try {
			setState(912);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,103,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(910);
				annotationMethodRest();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(911);
				annotationConstantRest();
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

	public static class AnnotationMethodRestContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(JavaParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(JavaParser.RPAREN, 0); }
		public DefaultValueContext defaultValue() {
			return getRuleContext(DefaultValueContext.class,0);
		}
		public AnnotationMethodRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationMethodRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterAnnotationMethodRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitAnnotationMethodRest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitAnnotationMethodRest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationMethodRestContext annotationMethodRest() throws RecognitionException {
		AnnotationMethodRestContext _localctx = new AnnotationMethodRestContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_annotationMethodRest);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(914);
			identifier();
			setState(915);
			match(LPAREN);
			setState(916);
			match(RPAREN);
			setState(918);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DEFAULT) {
				{
				setState(917);
				defaultValue();
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

	public static class AnnotationConstantRestContext extends ParserRuleContext {
		public VariableDeclaratorsContext variableDeclarators() {
			return getRuleContext(VariableDeclaratorsContext.class,0);
		}
		public AnnotationConstantRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationConstantRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterAnnotationConstantRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitAnnotationConstantRest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitAnnotationConstantRest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationConstantRestContext annotationConstantRest() throws RecognitionException {
		AnnotationConstantRestContext _localctx = new AnnotationConstantRestContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_annotationConstantRest);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(920);
			variableDeclarators();
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

	public static class DefaultValueContext extends ParserRuleContext {
		public TerminalNode DEFAULT() { return getToken(JavaParser.DEFAULT, 0); }
		public ElementValueContext elementValue() {
			return getRuleContext(ElementValueContext.class,0);
		}
		public DefaultValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defaultValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterDefaultValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitDefaultValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitDefaultValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefaultValueContext defaultValue() throws RecognitionException {
		DefaultValueContext _localctx = new DefaultValueContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_defaultValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(922);
			match(DEFAULT);
			setState(923);
			elementValue();
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

	public static class ModuleDeclarationContext extends ParserRuleContext {
		public TerminalNode MODULE() { return getToken(JavaParser.MODULE, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public ModuleBodyContext moduleBody() {
			return getRuleContext(ModuleBodyContext.class,0);
		}
		public TerminalNode OPEN() { return getToken(JavaParser.OPEN, 0); }
		public ModuleDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moduleDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterModuleDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitModuleDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitModuleDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModuleDeclarationContext moduleDeclaration() throws RecognitionException {
		ModuleDeclarationContext _localctx = new ModuleDeclarationContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_moduleDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(926);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN) {
				{
				setState(925);
				match(OPEN);
				}
			}

			setState(928);
			match(MODULE);
			setState(929);
			qualifiedName();
			setState(930);
			moduleBody();
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

	public static class ModuleBodyContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(JavaParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(JavaParser.RBRACE, 0); }
		public List<ModuleDirectiveContext> moduleDirective() {
			return getRuleContexts(ModuleDirectiveContext.class);
		}
		public ModuleDirectiveContext moduleDirective(int i) {
			return getRuleContext(ModuleDirectiveContext.class,i);
		}
		public ModuleBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moduleBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterModuleBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitModuleBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitModuleBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModuleBodyContext moduleBody() throws RecognitionException {
		ModuleBodyContext _localctx = new ModuleBodyContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_moduleBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(932);
			match(LBRACE);
			setState(936);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << REQUIRES) | (1L << EXPORTS) | (1L << OPENS) | (1L << USES) | (1L << PROVIDES))) != 0)) {
				{
				{
				setState(933);
				moduleDirective();
				}
				}
				setState(938);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(939);
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

	public static class ModuleDirectiveContext extends ParserRuleContext {
		public TerminalNode REQUIRES() { return getToken(JavaParser.REQUIRES, 0); }
		public List<QualifiedNameContext> qualifiedName() {
			return getRuleContexts(QualifiedNameContext.class);
		}
		public QualifiedNameContext qualifiedName(int i) {
			return getRuleContext(QualifiedNameContext.class,i);
		}
		public TerminalNode SEMI() { return getToken(JavaParser.SEMI, 0); }
		public List<RequiresModifierContext> requiresModifier() {
			return getRuleContexts(RequiresModifierContext.class);
		}
		public RequiresModifierContext requiresModifier(int i) {
			return getRuleContext(RequiresModifierContext.class,i);
		}
		public TerminalNode EXPORTS() { return getToken(JavaParser.EXPORTS, 0); }
		public TerminalNode TO() { return getToken(JavaParser.TO, 0); }
		public TerminalNode OPENS() { return getToken(JavaParser.OPENS, 0); }
		public TerminalNode USES() { return getToken(JavaParser.USES, 0); }
		public TerminalNode PROVIDES() { return getToken(JavaParser.PROVIDES, 0); }
		public TerminalNode WITH() { return getToken(JavaParser.WITH, 0); }
		public ModuleDirectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moduleDirective; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterModuleDirective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitModuleDirective(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitModuleDirective(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModuleDirectiveContext moduleDirective() throws RecognitionException {
		ModuleDirectiveContext _localctx = new ModuleDirectiveContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_moduleDirective);
		int _la;
		try {
			int _alt;
			setState(977);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case REQUIRES:
				enterOuterAlt(_localctx, 1);
				{
				setState(941);
				match(REQUIRES);
				setState(945);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,107,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(942);
						requiresModifier();
						}
						} 
					}
					setState(947);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,107,_ctx);
				}
				setState(948);
				qualifiedName();
				setState(949);
				match(SEMI);
				}
				break;
			case EXPORTS:
				enterOuterAlt(_localctx, 2);
				{
				setState(951);
				match(EXPORTS);
				setState(952);
				qualifiedName();
				setState(955);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TO) {
					{
					setState(953);
					match(TO);
					setState(954);
					qualifiedName();
					}
				}

				setState(957);
				match(SEMI);
				}
				break;
			case OPENS:
				enterOuterAlt(_localctx, 3);
				{
				setState(959);
				match(OPENS);
				setState(960);
				qualifiedName();
				setState(963);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TO) {
					{
					setState(961);
					match(TO);
					setState(962);
					qualifiedName();
					}
				}

				setState(965);
				match(SEMI);
				}
				break;
			case USES:
				enterOuterAlt(_localctx, 4);
				{
				setState(967);
				match(USES);
				setState(968);
				qualifiedName();
				setState(969);
				match(SEMI);
				}
				break;
			case PROVIDES:
				enterOuterAlt(_localctx, 5);
				{
				setState(971);
				match(PROVIDES);
				setState(972);
				qualifiedName();
				setState(973);
				match(WITH);
				setState(974);
				qualifiedName();
				setState(975);
				match(SEMI);
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

	public static class RequiresModifierContext extends ParserRuleContext {
		public TerminalNode TRANSITIVE() { return getToken(JavaParser.TRANSITIVE, 0); }
		public TerminalNode STATIC() { return getToken(JavaParser.STATIC, 0); }
		public RequiresModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_requiresModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterRequiresModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitRequiresModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitRequiresModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RequiresModifierContext requiresModifier() throws RecognitionException {
		RequiresModifierContext _localctx = new RequiresModifierContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_requiresModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(979);
			_la = _input.LA(1);
			if ( !(_la==STATIC || _la==TRANSITIVE) ) {
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

	public static class RecordDeclarationContext extends ParserRuleContext {
		public TerminalNode RECORD() { return getToken(JavaParser.RECORD, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public RecordHeaderContext recordHeader() {
			return getRuleContext(RecordHeaderContext.class,0);
		}
		public RecordBodyContext recordBody() {
			return getRuleContext(RecordBodyContext.class,0);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public TerminalNode IMPLEMENTS() { return getToken(JavaParser.IMPLEMENTS, 0); }
		public TypeListContext typeList() {
			return getRuleContext(TypeListContext.class,0);
		}
		public RecordDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recordDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterRecordDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitRecordDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitRecordDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RecordDeclarationContext recordDeclaration() throws RecognitionException {
		RecordDeclarationContext _localctx = new RecordDeclarationContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_recordDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(981);
			match(RECORD);
			setState(982);
			identifier();
			setState(984);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(983);
				typeParameters();
				}
			}

			setState(986);
			recordHeader();
			setState(989);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(987);
				match(IMPLEMENTS);
				setState(988);
				typeList();
				}
			}

			setState(991);
			recordBody();
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

	public static class RecordHeaderContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(JavaParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(JavaParser.RPAREN, 0); }
		public RecordComponentListContext recordComponentList() {
			return getRuleContext(RecordComponentListContext.class,0);
		}
		public RecordHeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recordHeader; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterRecordHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitRecordHeader(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitRecordHeader(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RecordHeaderContext recordHeader() throws RecognitionException {
		RecordHeaderContext _localctx = new RecordHeaderContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_recordHeader);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(993);
			match(LPAREN);
			setState(995);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 3)) & ~0x3f) == 0 && ((1L << (_la - 3)) & ((1L << (BOOLEAN - 3)) | (1L << (BYTE - 3)) | (1L << (CHAR - 3)) | (1L << (DOUBLE - 3)) | (1L << (FLOAT - 3)) | (1L << (INT - 3)) | (1L << (LONG - 3)) | (1L << (SHORT - 3)) | (1L << (MODULE - 3)) | (1L << (OPEN - 3)) | (1L << (REQUIRES - 3)) | (1L << (EXPORTS - 3)) | (1L << (OPENS - 3)) | (1L << (TO - 3)) | (1L << (USES - 3)) | (1L << (PROVIDES - 3)) | (1L << (WITH - 3)) | (1L << (TRANSITIVE - 3)) | (1L << (VAR - 3)) | (1L << (YIELD - 3)) | (1L << (RECORD - 3)) | (1L << (SEALED - 3)) | (1L << (PERMITS - 3)))) != 0) || _la==AT || _la==IDENTIFIER) {
				{
				setState(994);
				recordComponentList();
				}
			}

			setState(997);
			match(RPAREN);
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

	public static class RecordComponentListContext extends ParserRuleContext {
		public List<RecordComponentContext> recordComponent() {
			return getRuleContexts(RecordComponentContext.class);
		}
		public RecordComponentContext recordComponent(int i) {
			return getRuleContext(RecordComponentContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JavaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JavaParser.COMMA, i);
		}
		public RecordComponentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recordComponentList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterRecordComponentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitRecordComponentList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitRecordComponentList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RecordComponentListContext recordComponentList() throws RecognitionException {
		RecordComponentListContext _localctx = new RecordComponentListContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_recordComponentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(999);
			recordComponent();
			setState(1004);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1000);
				match(COMMA);
				setState(1001);
				recordComponent();
				}
				}
				setState(1006);
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

	public static class RecordComponentContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public RecordComponentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recordComponent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterRecordComponent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitRecordComponent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitRecordComponent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RecordComponentContext recordComponent() throws RecognitionException {
		RecordComponentContext _localctx = new RecordComponentContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_recordComponent);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1007);
			typeType();
			setState(1008);
			identifier();
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

	public static class RecordBodyContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(JavaParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(JavaParser.RBRACE, 0); }
		public List<ClassBodyDeclarationContext> classBodyDeclaration() {
			return getRuleContexts(ClassBodyDeclarationContext.class);
		}
		public ClassBodyDeclarationContext classBodyDeclaration(int i) {
			return getRuleContext(ClassBodyDeclarationContext.class,i);
		}
		public RecordBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recordBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterRecordBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitRecordBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitRecordBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RecordBodyContext recordBody() throws RecognitionException {
		RecordBodyContext _localctx = new RecordBodyContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_recordBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1010);
			match(LBRACE);
			setState(1014);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 1)) & ~0x3f) == 0 && ((1L << (_la - 1)) & ((1L << (ABSTRACT - 1)) | (1L << (BOOLEAN - 1)) | (1L << (BYTE - 1)) | (1L << (CHAR - 1)) | (1L << (CLASS - 1)) | (1L << (DOUBLE - 1)) | (1L << (ENUM - 1)) | (1L << (FINAL - 1)) | (1L << (FLOAT - 1)) | (1L << (INT - 1)) | (1L << (INTERFACE - 1)) | (1L << (LONG - 1)) | (1L << (NATIVE - 1)) | (1L << (PRIVATE - 1)) | (1L << (PROTECTED - 1)) | (1L << (PUBLIC - 1)) | (1L << (SHORT - 1)) | (1L << (STATIC - 1)) | (1L << (STRICTFP - 1)) | (1L << (SYNCHRONIZED - 1)) | (1L << (TRANSIENT - 1)) | (1L << (VOID - 1)) | (1L << (VOLATILE - 1)) | (1L << (MODULE - 1)) | (1L << (OPEN - 1)) | (1L << (REQUIRES - 1)) | (1L << (EXPORTS - 1)) | (1L << (OPENS - 1)) | (1L << (TO - 1)) | (1L << (USES - 1)) | (1L << (PROVIDES - 1)) | (1L << (WITH - 1)) | (1L << (TRANSITIVE - 1)) | (1L << (VAR - 1)) | (1L << (YIELD - 1)) | (1L << (RECORD - 1)) | (1L << (SEALED - 1)))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (PERMITS - 65)) | (1L << (NON_SEALED - 65)) | (1L << (LBRACE - 65)) | (1L << (SEMI - 65)) | (1L << (LT - 65)) | (1L << (AT - 65)) | (1L << (IDENTIFIER - 65)))) != 0)) {
				{
				{
				setState(1011);
				classBodyDeclaration();
				}
				}
				setState(1016);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1017);
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

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(JavaParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(JavaParser.RBRACE, 0); }
		public List<BlockStatementContext> blockStatement() {
			return getRuleContexts(BlockStatementContext.class);
		}
		public BlockStatementContext blockStatement(int i) {
			return getRuleContext(BlockStatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1019);
			match(LBRACE);
			setState(1023);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 1)) & ~0x3f) == 0 && ((1L << (_la - 1)) & ((1L << (ABSTRACT - 1)) | (1L << (ASSERT - 1)) | (1L << (BOOLEAN - 1)) | (1L << (BREAK - 1)) | (1L << (BYTE - 1)) | (1L << (CHAR - 1)) | (1L << (CLASS - 1)) | (1L << (CONTINUE - 1)) | (1L << (DO - 1)) | (1L << (DOUBLE - 1)) | (1L << (FINAL - 1)) | (1L << (FLOAT - 1)) | (1L << (FOR - 1)) | (1L << (IF - 1)) | (1L << (INT - 1)) | (1L << (INTERFACE - 1)) | (1L << (LONG - 1)) | (1L << (NEW - 1)) | (1L << (PRIVATE - 1)) | (1L << (PROTECTED - 1)) | (1L << (PUBLIC - 1)) | (1L << (RETURN - 1)) | (1L << (SHORT - 1)) | (1L << (STATIC - 1)) | (1L << (STRICTFP - 1)) | (1L << (SUPER - 1)) | (1L << (SWITCH - 1)) | (1L << (SYNCHRONIZED - 1)) | (1L << (THIS - 1)) | (1L << (THROW - 1)) | (1L << (TRY - 1)) | (1L << (VOID - 1)) | (1L << (WHILE - 1)) | (1L << (MODULE - 1)) | (1L << (OPEN - 1)) | (1L << (REQUIRES - 1)) | (1L << (EXPORTS - 1)) | (1L << (OPENS - 1)) | (1L << (TO - 1)) | (1L << (USES - 1)) | (1L << (PROVIDES - 1)) | (1L << (WITH - 1)) | (1L << (TRANSITIVE - 1)) | (1L << (VAR - 1)) | (1L << (YIELD - 1)) | (1L << (RECORD - 1)) | (1L << (SEALED - 1)))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (PERMITS - 65)) | (1L << (NON_SEALED - 65)) | (1L << (DECIMAL_LITERAL - 65)) | (1L << (HEX_LITERAL - 65)) | (1L << (OCT_LITERAL - 65)) | (1L << (BINARY_LITERAL - 65)) | (1L << (FLOAT_LITERAL - 65)) | (1L << (HEX_FLOAT_LITERAL - 65)) | (1L << (BOOL_LITERAL - 65)) | (1L << (CHAR_LITERAL - 65)) | (1L << (STRING_LITERAL - 65)) | (1L << (TEXT_BLOCK - 65)) | (1L << (NULL_LITERAL - 65)) | (1L << (LPAREN - 65)) | (1L << (LBRACE - 65)) | (1L << (SEMI - 65)) | (1L << (LT - 65)) | (1L << (BANG - 65)) | (1L << (TILDE - 65)) | (1L << (INC - 65)) | (1L << (DEC - 65)) | (1L << (ADD - 65)) | (1L << (SUB - 65)) | (1L << (AT - 65)) | (1L << (IDENTIFIER - 65)))) != 0)) {
				{
				{
				setState(1020);
				blockStatement();
				}
				}
				setState(1025);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1026);
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

	public static class BlockStatementContext extends ParserRuleContext {
		public LocalVariableDeclarationContext localVariableDeclaration() {
			return getRuleContext(LocalVariableDeclarationContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(JavaParser.SEMI, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public LocalTypeDeclarationContext localTypeDeclaration() {
			return getRuleContext(LocalTypeDeclarationContext.class,0);
		}
		public BlockStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterBlockStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitBlockStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitBlockStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockStatementContext blockStatement() throws RecognitionException {
		BlockStatementContext _localctx = new BlockStatementContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_blockStatement);
		try {
			setState(1033);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,117,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1028);
				localVariableDeclaration();
				setState(1029);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1031);
				statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1032);
				localTypeDeclaration();
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

	public static class LocalVariableDeclarationContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public VariableDeclaratorsContext variableDeclarators() {
			return getRuleContext(VariableDeclaratorsContext.class,0);
		}
		public TerminalNode VAR() { return getToken(JavaParser.VAR, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(JavaParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public LocalVariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localVariableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterLocalVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitLocalVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitLocalVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocalVariableDeclarationContext localVariableDeclaration() throws RecognitionException {
		LocalVariableDeclarationContext _localctx = new LocalVariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_localVariableDeclaration);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1038);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,118,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1035);
					variableModifier();
					}
					} 
				}
				setState(1040);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,118,_ctx);
			}
			setState(1049);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,119,_ctx) ) {
			case 1:
				{
				setState(1041);
				typeType();
				setState(1042);
				variableDeclarators();
				}
				break;
			case 2:
				{
				setState(1044);
				match(VAR);
				setState(1045);
				identifier();
				setState(1046);
				match(ASSIGN);
				setState(1047);
				expression(0);
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

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(JavaParser.IDENTIFIER, 0); }
		public TerminalNode MODULE() { return getToken(JavaParser.MODULE, 0); }
		public TerminalNode OPEN() { return getToken(JavaParser.OPEN, 0); }
		public TerminalNode REQUIRES() { return getToken(JavaParser.REQUIRES, 0); }
		public TerminalNode EXPORTS() { return getToken(JavaParser.EXPORTS, 0); }
		public TerminalNode OPENS() { return getToken(JavaParser.OPENS, 0); }
		public TerminalNode TO() { return getToken(JavaParser.TO, 0); }
		public TerminalNode USES() { return getToken(JavaParser.USES, 0); }
		public TerminalNode PROVIDES() { return getToken(JavaParser.PROVIDES, 0); }
		public TerminalNode WITH() { return getToken(JavaParser.WITH, 0); }
		public TerminalNode TRANSITIVE() { return getToken(JavaParser.TRANSITIVE, 0); }
		public TerminalNode YIELD() { return getToken(JavaParser.YIELD, 0); }
		public TerminalNode SEALED() { return getToken(JavaParser.SEALED, 0); }
		public TerminalNode PERMITS() { return getToken(JavaParser.PERMITS, 0); }
		public TerminalNode RECORD() { return getToken(JavaParser.RECORD, 0); }
		public TerminalNode VAR() { return getToken(JavaParser.VAR, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_identifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1051);
			_la = _input.LA(1);
			if ( !(((((_la - 51)) & ~0x3f) == 0 && ((1L << (_la - 51)) & ((1L << (MODULE - 51)) | (1L << (OPEN - 51)) | (1L << (REQUIRES - 51)) | (1L << (EXPORTS - 51)) | (1L << (OPENS - 51)) | (1L << (TO - 51)) | (1L << (USES - 51)) | (1L << (PROVIDES - 51)) | (1L << (WITH - 51)) | (1L << (TRANSITIVE - 51)) | (1L << (VAR - 51)) | (1L << (YIELD - 51)) | (1L << (RECORD - 51)) | (1L << (SEALED - 51)) | (1L << (PERMITS - 51)))) != 0) || _la==IDENTIFIER) ) {
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

	public static class LocalTypeDeclarationContext extends ParserRuleContext {
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public RecordDeclarationContext recordDeclaration() {
			return getRuleContext(RecordDeclarationContext.class,0);
		}
		public List<ClassOrInterfaceModifierContext> classOrInterfaceModifier() {
			return getRuleContexts(ClassOrInterfaceModifierContext.class);
		}
		public ClassOrInterfaceModifierContext classOrInterfaceModifier(int i) {
			return getRuleContext(ClassOrInterfaceModifierContext.class,i);
		}
		public TerminalNode SEMI() { return getToken(JavaParser.SEMI, 0); }
		public LocalTypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localTypeDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterLocalTypeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitLocalTypeDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitLocalTypeDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocalTypeDeclarationContext localTypeDeclaration() throws RecognitionException {
		LocalTypeDeclarationContext _localctx = new LocalTypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_localTypeDeclaration);
		try {
			int _alt;
			setState(1065);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ABSTRACT:
			case CLASS:
			case FINAL:
			case INTERFACE:
			case PRIVATE:
			case PROTECTED:
			case PUBLIC:
			case STATIC:
			case STRICTFP:
			case MODULE:
			case OPEN:
			case REQUIRES:
			case EXPORTS:
			case OPENS:
			case TO:
			case USES:
			case PROVIDES:
			case WITH:
			case TRANSITIVE:
			case VAR:
			case YIELD:
			case RECORD:
			case SEALED:
			case PERMITS:
			case NON_SEALED:
			case AT:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1056);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,120,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1053);
						classOrInterfaceModifier();
						}
						} 
					}
					setState(1058);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,120,_ctx);
				}
				setState(1062);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CLASS:
					{
					setState(1059);
					classDeclaration();
					}
					break;
				case INTERFACE:
					{
					setState(1060);
					interfaceDeclaration();
					}
					break;
				case RECORD:
					{
					setState(1061);
					recordDeclaration();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				setState(1064);
				match(SEMI);
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

	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class If_sContext extends StatementContext {
		public StatementContext ifS;
		public TerminalNode IF() { return getToken(JavaParser.IF, 0); }
		public ParExpressionContext parExpression() {
			return getRuleContext(ParExpressionContext.class,0);
		}
		public ElseStatementContext elseStatement() {
			return getRuleContext(ElseStatementContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public If_sContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterIf_s(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitIf_s(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitIf_s(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Synchronized_sContext extends StatementContext {
		public TerminalNode SYNCHRONIZED() { return getToken(JavaParser.SYNCHRONIZED, 0); }
		public ParExpressionContext parExpression() {
			return getRuleContext(ParExpressionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Synchronized_sContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterSynchronized_s(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitSynchronized_s(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitSynchronized_s(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Yield_sContext extends StatementContext {
		public TerminalNode YIELD() { return getToken(JavaParser.YIELD, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(JavaParser.SEMI, 0); }
		public Yield_sContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterYield_s(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitYield_s(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitYield_s(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Switch_sContext extends StatementContext {
		public Token switchS;
		public TerminalNode SWITCH() { return getToken(JavaParser.SWITCH, 0); }
		public ParExpressionContext parExpression() {
			return getRuleContext(ParExpressionContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(JavaParser.RBRACE, 0); }
		public TerminalNode LBRACE() { return getToken(JavaParser.LBRACE, 0); }
		public List<SwitchBlockStatementGroupContext> switchBlockStatementGroup() {
			return getRuleContexts(SwitchBlockStatementGroupContext.class);
		}
		public SwitchBlockStatementGroupContext switchBlockStatementGroup(int i) {
			return getRuleContext(SwitchBlockStatementGroupContext.class,i);
		}
		public List<SwitchLabelContext> switchLabel() {
			return getRuleContexts(SwitchLabelContext.class);
		}
		public SwitchLabelContext switchLabel(int i) {
			return getRuleContext(SwitchLabelContext.class,i);
		}
		public Switch_sContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterSwitch_s(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitSwitch_s(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitSwitch_s(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Continue_sContext extends StatementContext {
		public TerminalNode CONTINUE() { return getToken(JavaParser.CONTINUE, 0); }
		public TerminalNode SEMI() { return getToken(JavaParser.SEMI, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Continue_sContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterContinue_s(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitContinue_s(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitContinue_s(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class For_sContext extends StatementContext {
		public StatementContext forS;
		public TerminalNode FOR() { return getToken(JavaParser.FOR, 0); }
		public TerminalNode LPAREN() { return getToken(JavaParser.LPAREN, 0); }
		public ForControlContext forControl() {
			return getRuleContext(ForControlContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(JavaParser.RPAREN, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public For_sContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterFor_s(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitFor_s(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitFor_s(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Expression_sContext extends StatementContext {
		public ExpressionContext statementExpression;
		public TerminalNode SEMI() { return getToken(JavaParser.SEMI, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Expression_sContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterExpression_s(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitExpression_s(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitExpression_s(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Identifier_sContext extends StatementContext {
		public IdentifierContext identifierLabel;
		public TerminalNode COLON() { return getToken(JavaParser.COLON, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Identifier_sContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterIdentifier_s(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitIdentifier_s(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitIdentifier_s(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Do_sContext extends StatementContext {
		public StatementContext doS;
		public TerminalNode DO() { return getToken(JavaParser.DO, 0); }
		public TerminalNode WHILE() { return getToken(JavaParser.WHILE, 0); }
		public ParExpressionContext parExpression() {
			return getRuleContext(ParExpressionContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(JavaParser.SEMI, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public Do_sContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterDo_s(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitDo_s(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitDo_s(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Try_1_sContext extends StatementContext {
		public BlockContext tryB;
		public TerminalNode TRY() { return getToken(JavaParser.TRY, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FinallyBlockContext finallyBlock() {
			return getRuleContext(FinallyBlockContext.class,0);
		}
		public List<CatchClauseContext> catchClause() {
			return getRuleContexts(CatchClauseContext.class);
		}
		public CatchClauseContext catchClause(int i) {
			return getRuleContext(CatchClauseContext.class,i);
		}
		public Try_1_sContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterTry_1_s(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitTry_1_s(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitTry_1_s(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class While_sContext extends StatementContext {
		public StatementContext whileS;
		public TerminalNode WHILE() { return getToken(JavaParser.WHILE, 0); }
		public ParExpressionContext parExpression() {
			return getRuleContext(ParExpressionContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public While_sContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterWhile_s(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitWhile_s(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitWhile_s(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Try_2_sContext extends StatementContext {
		public BlockContext tryB;
		public TerminalNode TRY() { return getToken(JavaParser.TRY, 0); }
		public ResourceSpecificationContext resourceSpecification() {
			return getRuleContext(ResourceSpecificationContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<CatchClauseContext> catchClause() {
			return getRuleContexts(CatchClauseContext.class);
		}
		public CatchClauseContext catchClause(int i) {
			return getRuleContext(CatchClauseContext.class,i);
		}
		public FinallyBlockContext finallyBlock() {
			return getRuleContext(FinallyBlockContext.class,0);
		}
		public Try_2_sContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterTry_2_s(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitTry_2_s(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitTry_2_s(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Return_sContext extends StatementContext {
		public TerminalNode RETURN() { return getToken(JavaParser.RETURN, 0); }
		public TerminalNode SEMI() { return getToken(JavaParser.SEMI, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Return_sContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterReturn_s(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitReturn_s(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitReturn_s(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Block_sContext extends StatementContext {
		public BlockContext blockLabel;
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Block_sContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterBlock_s(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitBlock_s(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitBlock_s(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Assert_sContext extends StatementContext {
		public TerminalNode ASSERT() { return getToken(JavaParser.ASSERT, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode SEMI() { return getToken(JavaParser.SEMI, 0); }
		public TerminalNode COLON() { return getToken(JavaParser.COLON, 0); }
		public Assert_sContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterAssert_s(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitAssert_s(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitAssert_s(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Break_sContext extends StatementContext {
		public TerminalNode BREAK() { return getToken(JavaParser.BREAK, 0); }
		public TerminalNode SEMI() { return getToken(JavaParser.SEMI, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Break_sContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterBreak_s(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitBreak_s(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitBreak_s(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Semi_sContext extends StatementContext {
		public TerminalNode SEMI() { return getToken(JavaParser.SEMI, 0); }
		public Semi_sContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterSemi_s(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitSemi_s(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitSemi_s(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Throw_sContext extends StatementContext {
		public TerminalNode THROW() { return getToken(JavaParser.THROW, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(JavaParser.SEMI, 0); }
		public Throw_sContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterThrow_s(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitThrow_s(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitThrow_s(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Switch_e_sContext extends StatementContext {
		public SwitchExpressionContext switchExpression() {
			return getRuleContext(SwitchExpressionContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(JavaParser.SEMI, 0); }
		public Switch_e_sContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterSwitch_e_s(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitSwitch_e_s(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitSwitch_e_s(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_statement);
		int _la;
		try {
			int _alt;
			setState(1178);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,135,_ctx) ) {
			case 1:
				_localctx = new Block_sContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1067);
				((Block_sContext)_localctx).blockLabel = block();
				}
				break;
			case 2:
				_localctx = new Assert_sContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1068);
				match(ASSERT);
				setState(1069);
				expression(0);
				setState(1072);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(1070);
					match(COLON);
					setState(1071);
					expression(0);
					}
				}

				setState(1074);
				match(SEMI);
				}
				break;
			case 3:
				_localctx = new If_sContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1076);
				match(IF);
				setState(1077);
				parExpression();
				setState(1078);
				((If_sContext)_localctx).ifS = statement();
				setState(1079);
				elseStatement();
				}
				break;
			case 4:
				_localctx = new For_sContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1081);
				match(FOR);
				setState(1082);
				match(LPAREN);
				setState(1083);
				forControl();
				setState(1084);
				match(RPAREN);
				setState(1085);
				((For_sContext)_localctx).forS = statement();
				}
				break;
			case 5:
				_localctx = new While_sContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1087);
				match(WHILE);
				setState(1088);
				parExpression();
				setState(1089);
				((While_sContext)_localctx).whileS = statement();
				}
				break;
			case 6:
				_localctx = new Do_sContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(1091);
				match(DO);
				setState(1092);
				((Do_sContext)_localctx).doS = statement();
				setState(1093);
				match(WHILE);
				setState(1094);
				parExpression();
				setState(1095);
				match(SEMI);
				}
				break;
			case 7:
				_localctx = new Try_1_sContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(1097);
				match(TRY);
				setState(1098);
				((Try_1_sContext)_localctx).tryB = block();
				setState(1108);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CATCH:
					{
					setState(1100); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(1099);
						catchClause();
						}
						}
						setState(1102); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==CATCH );
					setState(1105);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==FINALLY) {
						{
						setState(1104);
						finallyBlock();
						}
					}

					}
					break;
				case FINALLY:
					{
					setState(1107);
					finallyBlock();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 8:
				_localctx = new Try_2_sContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(1110);
				match(TRY);
				setState(1111);
				resourceSpecification();
				setState(1112);
				((Try_2_sContext)_localctx).tryB = block();
				setState(1116);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CATCH) {
					{
					{
					setState(1113);
					catchClause();
					}
					}
					setState(1118);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1120);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FINALLY) {
					{
					setState(1119);
					finallyBlock();
					}
				}

				}
				break;
			case 9:
				_localctx = new Switch_sContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(1122);
				match(SWITCH);
				setState(1123);
				parExpression();
				setState(1124);
				((Switch_sContext)_localctx).switchS = match(LBRACE);
				setState(1128);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,129,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1125);
						switchBlockStatementGroup();
						}
						} 
					}
					setState(1130);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,129,_ctx);
				}
				setState(1134);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CASE || _la==DEFAULT) {
					{
					{
					setState(1131);
					switchLabel();
					}
					}
					setState(1136);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1137);
				match(RBRACE);
				}
				break;
			case 10:
				_localctx = new Synchronized_sContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(1139);
				match(SYNCHRONIZED);
				setState(1140);
				parExpression();
				setState(1141);
				block();
				}
				break;
			case 11:
				_localctx = new Return_sContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(1143);
				match(RETURN);
				setState(1145);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 3)) & ~0x3f) == 0 && ((1L << (_la - 3)) & ((1L << (BOOLEAN - 3)) | (1L << (BYTE - 3)) | (1L << (CHAR - 3)) | (1L << (DOUBLE - 3)) | (1L << (FLOAT - 3)) | (1L << (INT - 3)) | (1L << (LONG - 3)) | (1L << (NEW - 3)) | (1L << (SHORT - 3)) | (1L << (SUPER - 3)) | (1L << (SWITCH - 3)) | (1L << (THIS - 3)) | (1L << (VOID - 3)) | (1L << (MODULE - 3)) | (1L << (OPEN - 3)) | (1L << (REQUIRES - 3)) | (1L << (EXPORTS - 3)) | (1L << (OPENS - 3)) | (1L << (TO - 3)) | (1L << (USES - 3)) | (1L << (PROVIDES - 3)) | (1L << (WITH - 3)) | (1L << (TRANSITIVE - 3)) | (1L << (VAR - 3)) | (1L << (YIELD - 3)) | (1L << (RECORD - 3)) | (1L << (SEALED - 3)) | (1L << (PERMITS - 3)))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (DECIMAL_LITERAL - 67)) | (1L << (HEX_LITERAL - 67)) | (1L << (OCT_LITERAL - 67)) | (1L << (BINARY_LITERAL - 67)) | (1L << (FLOAT_LITERAL - 67)) | (1L << (HEX_FLOAT_LITERAL - 67)) | (1L << (BOOL_LITERAL - 67)) | (1L << (CHAR_LITERAL - 67)) | (1L << (STRING_LITERAL - 67)) | (1L << (TEXT_BLOCK - 67)) | (1L << (NULL_LITERAL - 67)) | (1L << (LPAREN - 67)) | (1L << (LT - 67)) | (1L << (BANG - 67)) | (1L << (TILDE - 67)) | (1L << (INC - 67)) | (1L << (DEC - 67)) | (1L << (ADD - 67)) | (1L << (SUB - 67)) | (1L << (AT - 67)) | (1L << (IDENTIFIER - 67)))) != 0)) {
					{
					setState(1144);
					expression(0);
					}
				}

				setState(1147);
				match(SEMI);
				}
				break;
			case 12:
				_localctx = new Throw_sContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(1148);
				match(THROW);
				setState(1149);
				expression(0);
				setState(1150);
				match(SEMI);
				}
				break;
			case 13:
				_localctx = new Break_sContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(1152);
				match(BREAK);
				setState(1154);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 51)) & ~0x3f) == 0 && ((1L << (_la - 51)) & ((1L << (MODULE - 51)) | (1L << (OPEN - 51)) | (1L << (REQUIRES - 51)) | (1L << (EXPORTS - 51)) | (1L << (OPENS - 51)) | (1L << (TO - 51)) | (1L << (USES - 51)) | (1L << (PROVIDES - 51)) | (1L << (WITH - 51)) | (1L << (TRANSITIVE - 51)) | (1L << (VAR - 51)) | (1L << (YIELD - 51)) | (1L << (RECORD - 51)) | (1L << (SEALED - 51)) | (1L << (PERMITS - 51)))) != 0) || _la==IDENTIFIER) {
					{
					setState(1153);
					identifier();
					}
				}

				setState(1156);
				match(SEMI);
				}
				break;
			case 14:
				_localctx = new Continue_sContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(1157);
				match(CONTINUE);
				setState(1159);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 51)) & ~0x3f) == 0 && ((1L << (_la - 51)) & ((1L << (MODULE - 51)) | (1L << (OPEN - 51)) | (1L << (REQUIRES - 51)) | (1L << (EXPORTS - 51)) | (1L << (OPENS - 51)) | (1L << (TO - 51)) | (1L << (USES - 51)) | (1L << (PROVIDES - 51)) | (1L << (WITH - 51)) | (1L << (TRANSITIVE - 51)) | (1L << (VAR - 51)) | (1L << (YIELD - 51)) | (1L << (RECORD - 51)) | (1L << (SEALED - 51)) | (1L << (PERMITS - 51)))) != 0) || _la==IDENTIFIER) {
					{
					setState(1158);
					identifier();
					}
				}

				setState(1161);
				match(SEMI);
				}
				break;
			case 15:
				_localctx = new Yield_sContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(1162);
				match(YIELD);
				setState(1163);
				expression(0);
				setState(1164);
				match(SEMI);
				}
				break;
			case 16:
				_localctx = new Semi_sContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(1166);
				match(SEMI);
				}
				break;
			case 17:
				_localctx = new Expression_sContext(_localctx);
				enterOuterAlt(_localctx, 17);
				{
				setState(1167);
				((Expression_sContext)_localctx).statementExpression = expression(0);
				setState(1168);
				match(SEMI);
				}
				break;
			case 18:
				_localctx = new Switch_e_sContext(_localctx);
				enterOuterAlt(_localctx, 18);
				{
				setState(1170);
				switchExpression();
				setState(1172);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,134,_ctx) ) {
				case 1:
					{
					setState(1171);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 19:
				_localctx = new Identifier_sContext(_localctx);
				enterOuterAlt(_localctx, 19);
				{
				setState(1174);
				((Identifier_sContext)_localctx).identifierLabel = identifier();
				setState(1175);
				match(COLON);
				setState(1176);
				statement();
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

	public static class ElseStatementContext extends ParserRuleContext {
		public StatementContext elseS;
		public TerminalNode ELSE() { return getToken(JavaParser.ELSE, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ElseStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterElseStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitElseStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitElseStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseStatementContext elseStatement() throws RecognitionException {
		ElseStatementContext _localctx = new ElseStatementContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_elseStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1182);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,136,_ctx) ) {
			case 1:
				{
				setState(1180);
				match(ELSE);
				setState(1181);
				((ElseStatementContext)_localctx).elseS = statement();
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

	public static class CatchClauseContext extends ParserRuleContext {
		public BlockContext catchB;
		public TerminalNode CATCH() { return getToken(JavaParser.CATCH, 0); }
		public TerminalNode LPAREN() { return getToken(JavaParser.LPAREN, 0); }
		public CatchTypeContext catchType() {
			return getRuleContext(CatchTypeContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(JavaParser.RPAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public CatchClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterCatchClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitCatchClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitCatchClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CatchClauseContext catchClause() throws RecognitionException {
		CatchClauseContext _localctx = new CatchClauseContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_catchClause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1184);
			match(CATCH);
			setState(1185);
			match(LPAREN);
			setState(1189);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,137,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1186);
					variableModifier();
					}
					} 
				}
				setState(1191);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,137,_ctx);
			}
			setState(1192);
			catchType();
			setState(1193);
			identifier();
			setState(1194);
			match(RPAREN);
			setState(1195);
			((CatchClauseContext)_localctx).catchB = block();
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

	public static class CatchTypeContext extends ParserRuleContext {
		public List<QualifiedNameContext> qualifiedName() {
			return getRuleContexts(QualifiedNameContext.class);
		}
		public QualifiedNameContext qualifiedName(int i) {
			return getRuleContext(QualifiedNameContext.class,i);
		}
		public List<TerminalNode> BITOR() { return getTokens(JavaParser.BITOR); }
		public TerminalNode BITOR(int i) {
			return getToken(JavaParser.BITOR, i);
		}
		public CatchTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterCatchType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitCatchType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitCatchType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CatchTypeContext catchType() throws RecognitionException {
		CatchTypeContext _localctx = new CatchTypeContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_catchType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1197);
			qualifiedName();
			setState(1202);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BITOR) {
				{
				{
				setState(1198);
				match(BITOR);
				setState(1199);
				qualifiedName();
				}
				}
				setState(1204);
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

	public static class FinallyBlockContext extends ParserRuleContext {
		public TerminalNode FINALLY() { return getToken(JavaParser.FINALLY, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FinallyBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_finallyBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterFinallyBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitFinallyBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitFinallyBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FinallyBlockContext finallyBlock() throws RecognitionException {
		FinallyBlockContext _localctx = new FinallyBlockContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_finallyBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1205);
			match(FINALLY);
			setState(1206);
			block();
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

	public static class ResourceSpecificationContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(JavaParser.LPAREN, 0); }
		public ResourcesContext resources() {
			return getRuleContext(ResourcesContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(JavaParser.RPAREN, 0); }
		public TerminalNode SEMI() { return getToken(JavaParser.SEMI, 0); }
		public ResourceSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resourceSpecification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterResourceSpecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitResourceSpecification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitResourceSpecification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ResourceSpecificationContext resourceSpecification() throws RecognitionException {
		ResourceSpecificationContext _localctx = new ResourceSpecificationContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_resourceSpecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1208);
			match(LPAREN);
			setState(1209);
			resources();
			setState(1211);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(1210);
				match(SEMI);
				}
			}

			setState(1213);
			match(RPAREN);
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

	public static class ResourcesContext extends ParserRuleContext {
		public List<ResourceContext> resource() {
			return getRuleContexts(ResourceContext.class);
		}
		public ResourceContext resource(int i) {
			return getRuleContext(ResourceContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(JavaParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(JavaParser.SEMI, i);
		}
		public ResourcesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resources; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterResources(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitResources(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitResources(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ResourcesContext resources() throws RecognitionException {
		ResourcesContext _localctx = new ResourcesContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_resources);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1215);
			resource();
			setState(1220);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,140,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1216);
					match(SEMI);
					setState(1217);
					resource();
					}
					} 
				}
				setState(1222);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,140,_ctx);
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

	public static class ResourceContext extends ParserRuleContext {
		public TerminalNode ASSIGN() { return getToken(JavaParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public TerminalNode VAR() { return getToken(JavaParser.VAR, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public ResourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resource; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterResource(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitResource(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitResource(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ResourceContext resource() throws RecognitionException {
		ResourceContext _localctx = new ResourceContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_resource);
		try {
			int _alt;
			setState(1240);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,143,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1226);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,141,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1223);
						variableModifier();
						}
						} 
					}
					setState(1228);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,141,_ctx);
				}
				setState(1234);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,142,_ctx) ) {
				case 1:
					{
					setState(1229);
					classOrInterfaceType();
					setState(1230);
					variableDeclaratorId();
					}
					break;
				case 2:
					{
					setState(1232);
					match(VAR);
					setState(1233);
					identifier();
					}
					break;
				}
				setState(1236);
				match(ASSIGN);
				setState(1237);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1239);
				identifier();
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

	public static class SwitchBlockStatementGroupContext extends ParserRuleContext {
		public List<SwitchLabelContext> switchLabel() {
			return getRuleContexts(SwitchLabelContext.class);
		}
		public SwitchLabelContext switchLabel(int i) {
			return getRuleContext(SwitchLabelContext.class,i);
		}
		public List<BlockStatementContext> blockStatement() {
			return getRuleContexts(BlockStatementContext.class);
		}
		public BlockStatementContext blockStatement(int i) {
			return getRuleContext(BlockStatementContext.class,i);
		}
		public SwitchBlockStatementGroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchBlockStatementGroup; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterSwitchBlockStatementGroup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitSwitchBlockStatementGroup(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitSwitchBlockStatementGroup(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchBlockStatementGroupContext switchBlockStatementGroup() throws RecognitionException {
		SwitchBlockStatementGroupContext _localctx = new SwitchBlockStatementGroupContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_switchBlockStatementGroup);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1243); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1242);
				switchLabel();
				}
				}
				setState(1245); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CASE || _la==DEFAULT );
			setState(1248); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1247);
				blockStatement();
				}
				}
				setState(1250); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 1)) & ~0x3f) == 0 && ((1L << (_la - 1)) & ((1L << (ABSTRACT - 1)) | (1L << (ASSERT - 1)) | (1L << (BOOLEAN - 1)) | (1L << (BREAK - 1)) | (1L << (BYTE - 1)) | (1L << (CHAR - 1)) | (1L << (CLASS - 1)) | (1L << (CONTINUE - 1)) | (1L << (DO - 1)) | (1L << (DOUBLE - 1)) | (1L << (FINAL - 1)) | (1L << (FLOAT - 1)) | (1L << (FOR - 1)) | (1L << (IF - 1)) | (1L << (INT - 1)) | (1L << (INTERFACE - 1)) | (1L << (LONG - 1)) | (1L << (NEW - 1)) | (1L << (PRIVATE - 1)) | (1L << (PROTECTED - 1)) | (1L << (PUBLIC - 1)) | (1L << (RETURN - 1)) | (1L << (SHORT - 1)) | (1L << (STATIC - 1)) | (1L << (STRICTFP - 1)) | (1L << (SUPER - 1)) | (1L << (SWITCH - 1)) | (1L << (SYNCHRONIZED - 1)) | (1L << (THIS - 1)) | (1L << (THROW - 1)) | (1L << (TRY - 1)) | (1L << (VOID - 1)) | (1L << (WHILE - 1)) | (1L << (MODULE - 1)) | (1L << (OPEN - 1)) | (1L << (REQUIRES - 1)) | (1L << (EXPORTS - 1)) | (1L << (OPENS - 1)) | (1L << (TO - 1)) | (1L << (USES - 1)) | (1L << (PROVIDES - 1)) | (1L << (WITH - 1)) | (1L << (TRANSITIVE - 1)) | (1L << (VAR - 1)) | (1L << (YIELD - 1)) | (1L << (RECORD - 1)) | (1L << (SEALED - 1)))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (PERMITS - 65)) | (1L << (NON_SEALED - 65)) | (1L << (DECIMAL_LITERAL - 65)) | (1L << (HEX_LITERAL - 65)) | (1L << (OCT_LITERAL - 65)) | (1L << (BINARY_LITERAL - 65)) | (1L << (FLOAT_LITERAL - 65)) | (1L << (HEX_FLOAT_LITERAL - 65)) | (1L << (BOOL_LITERAL - 65)) | (1L << (CHAR_LITERAL - 65)) | (1L << (STRING_LITERAL - 65)) | (1L << (TEXT_BLOCK - 65)) | (1L << (NULL_LITERAL - 65)) | (1L << (LPAREN - 65)) | (1L << (LBRACE - 65)) | (1L << (SEMI - 65)) | (1L << (LT - 65)) | (1L << (BANG - 65)) | (1L << (TILDE - 65)) | (1L << (INC - 65)) | (1L << (DEC - 65)) | (1L << (ADD - 65)) | (1L << (SUB - 65)) | (1L << (AT - 65)) | (1L << (IDENTIFIER - 65)))) != 0) );
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

	public static class SwitchLabelContext extends ParserRuleContext {
		public ExpressionContext constantExpression;
		public Token enumConstantName;
		public IdentifierContext varName;
		public TerminalNode CASE() { return getToken(JavaParser.CASE, 0); }
		public TerminalNode COLON() { return getToken(JavaParser.COLON, 0); }
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(JavaParser.IDENTIFIER, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode DEFAULT() { return getToken(JavaParser.DEFAULT, 0); }
		public SwitchLabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchLabel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterSwitchLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitSwitchLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitSwitchLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchLabelContext switchLabel() throws RecognitionException {
		SwitchLabelContext _localctx = new SwitchLabelContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_switchLabel);
		try {
			setState(1263);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CASE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1252);
				match(CASE);
				setState(1258);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,146,_ctx) ) {
				case 1:
					{
					setState(1253);
					((SwitchLabelContext)_localctx).constantExpression = expression(0);
					}
					break;
				case 2:
					{
					setState(1254);
					((SwitchLabelContext)_localctx).enumConstantName = match(IDENTIFIER);
					}
					break;
				case 3:
					{
					setState(1255);
					typeType();
					setState(1256);
					((SwitchLabelContext)_localctx).varName = identifier();
					}
					break;
				}
				setState(1260);
				match(COLON);
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1261);
				match(DEFAULT);
				setState(1262);
				match(COLON);
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

	public static class ForControlContext extends ParserRuleContext {
		public ExpressionListContext forUpdate;
		public EnhancedForControlContext enhancedForControl() {
			return getRuleContext(EnhancedForControlContext.class,0);
		}
		public List<TerminalNode> SEMI() { return getTokens(JavaParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(JavaParser.SEMI, i);
		}
		public ForInitContext forInit() {
			return getRuleContext(ForInitContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ForControlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forControl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterForControl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitForControl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitForControl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForControlContext forControl() throws RecognitionException {
		ForControlContext _localctx = new ForControlContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_forControl);
		int _la;
		try {
			setState(1277);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,151,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1265);
				enhancedForControl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1267);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 3)) & ~0x3f) == 0 && ((1L << (_la - 3)) & ((1L << (BOOLEAN - 3)) | (1L << (BYTE - 3)) | (1L << (CHAR - 3)) | (1L << (DOUBLE - 3)) | (1L << (FINAL - 3)) | (1L << (FLOAT - 3)) | (1L << (INT - 3)) | (1L << (LONG - 3)) | (1L << (NEW - 3)) | (1L << (SHORT - 3)) | (1L << (SUPER - 3)) | (1L << (SWITCH - 3)) | (1L << (THIS - 3)) | (1L << (VOID - 3)) | (1L << (MODULE - 3)) | (1L << (OPEN - 3)) | (1L << (REQUIRES - 3)) | (1L << (EXPORTS - 3)) | (1L << (OPENS - 3)) | (1L << (TO - 3)) | (1L << (USES - 3)) | (1L << (PROVIDES - 3)) | (1L << (WITH - 3)) | (1L << (TRANSITIVE - 3)) | (1L << (VAR - 3)) | (1L << (YIELD - 3)) | (1L << (RECORD - 3)) | (1L << (SEALED - 3)) | (1L << (PERMITS - 3)))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (DECIMAL_LITERAL - 67)) | (1L << (HEX_LITERAL - 67)) | (1L << (OCT_LITERAL - 67)) | (1L << (BINARY_LITERAL - 67)) | (1L << (FLOAT_LITERAL - 67)) | (1L << (HEX_FLOAT_LITERAL - 67)) | (1L << (BOOL_LITERAL - 67)) | (1L << (CHAR_LITERAL - 67)) | (1L << (STRING_LITERAL - 67)) | (1L << (TEXT_BLOCK - 67)) | (1L << (NULL_LITERAL - 67)) | (1L << (LPAREN - 67)) | (1L << (LT - 67)) | (1L << (BANG - 67)) | (1L << (TILDE - 67)) | (1L << (INC - 67)) | (1L << (DEC - 67)) | (1L << (ADD - 67)) | (1L << (SUB - 67)) | (1L << (AT - 67)) | (1L << (IDENTIFIER - 67)))) != 0)) {
					{
					setState(1266);
					forInit();
					}
				}

				setState(1269);
				match(SEMI);
				setState(1271);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 3)) & ~0x3f) == 0 && ((1L << (_la - 3)) & ((1L << (BOOLEAN - 3)) | (1L << (BYTE - 3)) | (1L << (CHAR - 3)) | (1L << (DOUBLE - 3)) | (1L << (FLOAT - 3)) | (1L << (INT - 3)) | (1L << (LONG - 3)) | (1L << (NEW - 3)) | (1L << (SHORT - 3)) | (1L << (SUPER - 3)) | (1L << (SWITCH - 3)) | (1L << (THIS - 3)) | (1L << (VOID - 3)) | (1L << (MODULE - 3)) | (1L << (OPEN - 3)) | (1L << (REQUIRES - 3)) | (1L << (EXPORTS - 3)) | (1L << (OPENS - 3)) | (1L << (TO - 3)) | (1L << (USES - 3)) | (1L << (PROVIDES - 3)) | (1L << (WITH - 3)) | (1L << (TRANSITIVE - 3)) | (1L << (VAR - 3)) | (1L << (YIELD - 3)) | (1L << (RECORD - 3)) | (1L << (SEALED - 3)) | (1L << (PERMITS - 3)))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (DECIMAL_LITERAL - 67)) | (1L << (HEX_LITERAL - 67)) | (1L << (OCT_LITERAL - 67)) | (1L << (BINARY_LITERAL - 67)) | (1L << (FLOAT_LITERAL - 67)) | (1L << (HEX_FLOAT_LITERAL - 67)) | (1L << (BOOL_LITERAL - 67)) | (1L << (CHAR_LITERAL - 67)) | (1L << (STRING_LITERAL - 67)) | (1L << (TEXT_BLOCK - 67)) | (1L << (NULL_LITERAL - 67)) | (1L << (LPAREN - 67)) | (1L << (LT - 67)) | (1L << (BANG - 67)) | (1L << (TILDE - 67)) | (1L << (INC - 67)) | (1L << (DEC - 67)) | (1L << (ADD - 67)) | (1L << (SUB - 67)) | (1L << (AT - 67)) | (1L << (IDENTIFIER - 67)))) != 0)) {
					{
					setState(1270);
					expression(0);
					}
				}

				setState(1273);
				match(SEMI);
				setState(1275);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 3)) & ~0x3f) == 0 && ((1L << (_la - 3)) & ((1L << (BOOLEAN - 3)) | (1L << (BYTE - 3)) | (1L << (CHAR - 3)) | (1L << (DOUBLE - 3)) | (1L << (FLOAT - 3)) | (1L << (INT - 3)) | (1L << (LONG - 3)) | (1L << (NEW - 3)) | (1L << (SHORT - 3)) | (1L << (SUPER - 3)) | (1L << (SWITCH - 3)) | (1L << (THIS - 3)) | (1L << (VOID - 3)) | (1L << (MODULE - 3)) | (1L << (OPEN - 3)) | (1L << (REQUIRES - 3)) | (1L << (EXPORTS - 3)) | (1L << (OPENS - 3)) | (1L << (TO - 3)) | (1L << (USES - 3)) | (1L << (PROVIDES - 3)) | (1L << (WITH - 3)) | (1L << (TRANSITIVE - 3)) | (1L << (VAR - 3)) | (1L << (YIELD - 3)) | (1L << (RECORD - 3)) | (1L << (SEALED - 3)) | (1L << (PERMITS - 3)))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (DECIMAL_LITERAL - 67)) | (1L << (HEX_LITERAL - 67)) | (1L << (OCT_LITERAL - 67)) | (1L << (BINARY_LITERAL - 67)) | (1L << (FLOAT_LITERAL - 67)) | (1L << (HEX_FLOAT_LITERAL - 67)) | (1L << (BOOL_LITERAL - 67)) | (1L << (CHAR_LITERAL - 67)) | (1L << (STRING_LITERAL - 67)) | (1L << (TEXT_BLOCK - 67)) | (1L << (NULL_LITERAL - 67)) | (1L << (LPAREN - 67)) | (1L << (LT - 67)) | (1L << (BANG - 67)) | (1L << (TILDE - 67)) | (1L << (INC - 67)) | (1L << (DEC - 67)) | (1L << (ADD - 67)) | (1L << (SUB - 67)) | (1L << (AT - 67)) | (1L << (IDENTIFIER - 67)))) != 0)) {
					{
					setState(1274);
					((ForControlContext)_localctx).forUpdate = expressionList();
					}
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

	public static class ForInitContext extends ParserRuleContext {
		public LocalVariableDeclarationContext localVariableDeclaration() {
			return getRuleContext(LocalVariableDeclarationContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ForInitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forInit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterForInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitForInit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitForInit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForInitContext forInit() throws RecognitionException {
		ForInitContext _localctx = new ForInitContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_forInit);
		try {
			setState(1281);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,152,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1279);
				localVariableDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1280);
				expressionList();
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

	public static class EnhancedForControlContext extends ParserRuleContext {
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public TerminalNode COLON() { return getToken(JavaParser.COLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public TerminalNode VAR() { return getToken(JavaParser.VAR, 0); }
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public EnhancedForControlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enhancedForControl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterEnhancedForControl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitEnhancedForControl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitEnhancedForControl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnhancedForControlContext enhancedForControl() throws RecognitionException {
		EnhancedForControlContext _localctx = new EnhancedForControlContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_enhancedForControl);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1286);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,153,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1283);
					variableModifier();
					}
					} 
				}
				setState(1288);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,153,_ctx);
			}
			setState(1291);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,154,_ctx) ) {
			case 1:
				{
				setState(1289);
				typeType();
				}
				break;
			case 2:
				{
				setState(1290);
				match(VAR);
				}
				break;
			}
			setState(1293);
			variableDeclaratorId();
			setState(1294);
			match(COLON);
			setState(1295);
			expression(0);
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

	public static class ParExpressionContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(JavaParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(JavaParser.RPAREN, 0); }
		public ParExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterParExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitParExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitParExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParExpressionContext parExpression() throws RecognitionException {
		ParExpressionContext _localctx = new ParExpressionContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_parExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1297);
			match(LPAREN);
			setState(1298);
			expression(0);
			setState(1299);
			match(RPAREN);
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

	public static class ExpressionListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JavaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JavaParser.COMMA, i);
		}
		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitExpressionList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitExpressionList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1301);
			expression(0);
			setState(1306);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1302);
				match(COMMA);
				setState(1303);
				expression(0);
				}
				}
				setState(1308);
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

	public static class MethodCallContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(JavaParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(JavaParser.RPAREN, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public TerminalNode THIS() { return getToken(JavaParser.THIS, 0); }
		public TerminalNode SUPER() { return getToken(JavaParser.SUPER, 0); }
		public MethodCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterMethodCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitMethodCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitMethodCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodCallContext methodCall() throws RecognitionException {
		MethodCallContext _localctx = new MethodCallContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_methodCall);
		int _la;
		try {
			setState(1328);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MODULE:
			case OPEN:
			case REQUIRES:
			case EXPORTS:
			case OPENS:
			case TO:
			case USES:
			case PROVIDES:
			case WITH:
			case TRANSITIVE:
			case VAR:
			case YIELD:
			case RECORD:
			case SEALED:
			case PERMITS:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1309);
				identifier();
				setState(1310);
				match(LPAREN);
				setState(1312);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 3)) & ~0x3f) == 0 && ((1L << (_la - 3)) & ((1L << (BOOLEAN - 3)) | (1L << (BYTE - 3)) | (1L << (CHAR - 3)) | (1L << (DOUBLE - 3)) | (1L << (FLOAT - 3)) | (1L << (INT - 3)) | (1L << (LONG - 3)) | (1L << (NEW - 3)) | (1L << (SHORT - 3)) | (1L << (SUPER - 3)) | (1L << (SWITCH - 3)) | (1L << (THIS - 3)) | (1L << (VOID - 3)) | (1L << (MODULE - 3)) | (1L << (OPEN - 3)) | (1L << (REQUIRES - 3)) | (1L << (EXPORTS - 3)) | (1L << (OPENS - 3)) | (1L << (TO - 3)) | (1L << (USES - 3)) | (1L << (PROVIDES - 3)) | (1L << (WITH - 3)) | (1L << (TRANSITIVE - 3)) | (1L << (VAR - 3)) | (1L << (YIELD - 3)) | (1L << (RECORD - 3)) | (1L << (SEALED - 3)) | (1L << (PERMITS - 3)))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (DECIMAL_LITERAL - 67)) | (1L << (HEX_LITERAL - 67)) | (1L << (OCT_LITERAL - 67)) | (1L << (BINARY_LITERAL - 67)) | (1L << (FLOAT_LITERAL - 67)) | (1L << (HEX_FLOAT_LITERAL - 67)) | (1L << (BOOL_LITERAL - 67)) | (1L << (CHAR_LITERAL - 67)) | (1L << (STRING_LITERAL - 67)) | (1L << (TEXT_BLOCK - 67)) | (1L << (NULL_LITERAL - 67)) | (1L << (LPAREN - 67)) | (1L << (LT - 67)) | (1L << (BANG - 67)) | (1L << (TILDE - 67)) | (1L << (INC - 67)) | (1L << (DEC - 67)) | (1L << (ADD - 67)) | (1L << (SUB - 67)) | (1L << (AT - 67)) | (1L << (IDENTIFIER - 67)))) != 0)) {
					{
					setState(1311);
					expressionList();
					}
				}

				setState(1314);
				match(RPAREN);
				}
				break;
			case THIS:
				enterOuterAlt(_localctx, 2);
				{
				setState(1316);
				match(THIS);
				setState(1317);
				match(LPAREN);
				setState(1319);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 3)) & ~0x3f) == 0 && ((1L << (_la - 3)) & ((1L << (BOOLEAN - 3)) | (1L << (BYTE - 3)) | (1L << (CHAR - 3)) | (1L << (DOUBLE - 3)) | (1L << (FLOAT - 3)) | (1L << (INT - 3)) | (1L << (LONG - 3)) | (1L << (NEW - 3)) | (1L << (SHORT - 3)) | (1L << (SUPER - 3)) | (1L << (SWITCH - 3)) | (1L << (THIS - 3)) | (1L << (VOID - 3)) | (1L << (MODULE - 3)) | (1L << (OPEN - 3)) | (1L << (REQUIRES - 3)) | (1L << (EXPORTS - 3)) | (1L << (OPENS - 3)) | (1L << (TO - 3)) | (1L << (USES - 3)) | (1L << (PROVIDES - 3)) | (1L << (WITH - 3)) | (1L << (TRANSITIVE - 3)) | (1L << (VAR - 3)) | (1L << (YIELD - 3)) | (1L << (RECORD - 3)) | (1L << (SEALED - 3)) | (1L << (PERMITS - 3)))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (DECIMAL_LITERAL - 67)) | (1L << (HEX_LITERAL - 67)) | (1L << (OCT_LITERAL - 67)) | (1L << (BINARY_LITERAL - 67)) | (1L << (FLOAT_LITERAL - 67)) | (1L << (HEX_FLOAT_LITERAL - 67)) | (1L << (BOOL_LITERAL - 67)) | (1L << (CHAR_LITERAL - 67)) | (1L << (STRING_LITERAL - 67)) | (1L << (TEXT_BLOCK - 67)) | (1L << (NULL_LITERAL - 67)) | (1L << (LPAREN - 67)) | (1L << (LT - 67)) | (1L << (BANG - 67)) | (1L << (TILDE - 67)) | (1L << (INC - 67)) | (1L << (DEC - 67)) | (1L << (ADD - 67)) | (1L << (SUB - 67)) | (1L << (AT - 67)) | (1L << (IDENTIFIER - 67)))) != 0)) {
					{
					setState(1318);
					expressionList();
					}
				}

				setState(1321);
				match(RPAREN);
				}
				break;
			case SUPER:
				enterOuterAlt(_localctx, 3);
				{
				setState(1322);
				match(SUPER);
				setState(1323);
				match(LPAREN);
				setState(1325);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 3)) & ~0x3f) == 0 && ((1L << (_la - 3)) & ((1L << (BOOLEAN - 3)) | (1L << (BYTE - 3)) | (1L << (CHAR - 3)) | (1L << (DOUBLE - 3)) | (1L << (FLOAT - 3)) | (1L << (INT - 3)) | (1L << (LONG - 3)) | (1L << (NEW - 3)) | (1L << (SHORT - 3)) | (1L << (SUPER - 3)) | (1L << (SWITCH - 3)) | (1L << (THIS - 3)) | (1L << (VOID - 3)) | (1L << (MODULE - 3)) | (1L << (OPEN - 3)) | (1L << (REQUIRES - 3)) | (1L << (EXPORTS - 3)) | (1L << (OPENS - 3)) | (1L << (TO - 3)) | (1L << (USES - 3)) | (1L << (PROVIDES - 3)) | (1L << (WITH - 3)) | (1L << (TRANSITIVE - 3)) | (1L << (VAR - 3)) | (1L << (YIELD - 3)) | (1L << (RECORD - 3)) | (1L << (SEALED - 3)) | (1L << (PERMITS - 3)))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (DECIMAL_LITERAL - 67)) | (1L << (HEX_LITERAL - 67)) | (1L << (OCT_LITERAL - 67)) | (1L << (BINARY_LITERAL - 67)) | (1L << (FLOAT_LITERAL - 67)) | (1L << (HEX_FLOAT_LITERAL - 67)) | (1L << (BOOL_LITERAL - 67)) | (1L << (CHAR_LITERAL - 67)) | (1L << (STRING_LITERAL - 67)) | (1L << (TEXT_BLOCK - 67)) | (1L << (NULL_LITERAL - 67)) | (1L << (LPAREN - 67)) | (1L << (LT - 67)) | (1L << (BANG - 67)) | (1L << (TILDE - 67)) | (1L << (INC - 67)) | (1L << (DEC - 67)) | (1L << (ADD - 67)) | (1L << (SUB - 67)) | (1L << (AT - 67)) | (1L << (IDENTIFIER - 67)))) != 0)) {
					{
					setState(1324);
					expressionList();
					}
				}

				setState(1327);
				match(RPAREN);
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

	public static class ExpressionContext extends ParserRuleContext {
		public Token prefix;
		public Token bop;
		public Token postfix;
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public MethodCallContext methodCall() {
			return getRuleContext(MethodCallContext.class,0);
		}
		public TerminalNode NEW() { return getToken(JavaParser.NEW, 0); }
		public CreatorContext creator() {
			return getRuleContext(CreatorContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(JavaParser.LPAREN, 0); }
		public List<TypeTypeContext> typeType() {
			return getRuleContexts(TypeTypeContext.class);
		}
		public TypeTypeContext typeType(int i) {
			return getRuleContext(TypeTypeContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(JavaParser.RPAREN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public List<TerminalNode> BITAND() { return getTokens(JavaParser.BITAND); }
		public TerminalNode BITAND(int i) {
			return getToken(JavaParser.BITAND, i);
		}
		public TerminalNode ADD() { return getToken(JavaParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(JavaParser.SUB, 0); }
		public TerminalNode INC() { return getToken(JavaParser.INC, 0); }
		public TerminalNode DEC() { return getToken(JavaParser.DEC, 0); }
		public TerminalNode TILDE() { return getToken(JavaParser.TILDE, 0); }
		public TerminalNode BANG() { return getToken(JavaParser.BANG, 0); }
		public LambdaExpressionContext lambdaExpression() {
			return getRuleContext(LambdaExpressionContext.class,0);
		}
		public SwitchExpressionContext switchExpression() {
			return getRuleContext(SwitchExpressionContext.class,0);
		}
		public TerminalNode COLONCOLON() { return getToken(JavaParser.COLONCOLON, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public ClassTypeContext classType() {
			return getRuleContext(ClassTypeContext.class,0);
		}
		public TerminalNode MUL() { return getToken(JavaParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(JavaParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(JavaParser.MOD, 0); }
		public List<TerminalNode> LT() { return getTokens(JavaParser.LT); }
		public TerminalNode LT(int i) {
			return getToken(JavaParser.LT, i);
		}
		public List<TerminalNode> GT() { return getTokens(JavaParser.GT); }
		public TerminalNode GT(int i) {
			return getToken(JavaParser.GT, i);
		}
		public TerminalNode LE() { return getToken(JavaParser.LE, 0); }
		public TerminalNode GE() { return getToken(JavaParser.GE, 0); }
		public TerminalNode EQUAL() { return getToken(JavaParser.EQUAL, 0); }
		public TerminalNode NOTEQUAL() { return getToken(JavaParser.NOTEQUAL, 0); }
		public TerminalNode CARET() { return getToken(JavaParser.CARET, 0); }
		public TerminalNode BITOR() { return getToken(JavaParser.BITOR, 0); }
		public TerminalNode AND() { return getToken(JavaParser.AND, 0); }
		public TerminalNode OR() { return getToken(JavaParser.OR, 0); }
		public TerminalNode COLON() { return getToken(JavaParser.COLON, 0); }
		public TerminalNode QUESTION() { return getToken(JavaParser.QUESTION, 0); }
		public TerminalNode ASSIGN() { return getToken(JavaParser.ASSIGN, 0); }
		public TerminalNode ADD_ASSIGN() { return getToken(JavaParser.ADD_ASSIGN, 0); }
		public TerminalNode SUB_ASSIGN() { return getToken(JavaParser.SUB_ASSIGN, 0); }
		public TerminalNode MUL_ASSIGN() { return getToken(JavaParser.MUL_ASSIGN, 0); }
		public TerminalNode DIV_ASSIGN() { return getToken(JavaParser.DIV_ASSIGN, 0); }
		public TerminalNode AND_ASSIGN() { return getToken(JavaParser.AND_ASSIGN, 0); }
		public TerminalNode OR_ASSIGN() { return getToken(JavaParser.OR_ASSIGN, 0); }
		public TerminalNode XOR_ASSIGN() { return getToken(JavaParser.XOR_ASSIGN, 0); }
		public TerminalNode RSHIFT_ASSIGN() { return getToken(JavaParser.RSHIFT_ASSIGN, 0); }
		public TerminalNode URSHIFT_ASSIGN() { return getToken(JavaParser.URSHIFT_ASSIGN, 0); }
		public TerminalNode LSHIFT_ASSIGN() { return getToken(JavaParser.LSHIFT_ASSIGN, 0); }
		public TerminalNode MOD_ASSIGN() { return getToken(JavaParser.MOD_ASSIGN, 0); }
		public TerminalNode DOT() { return getToken(JavaParser.DOT, 0); }
		public TerminalNode THIS() { return getToken(JavaParser.THIS, 0); }
		public InnerCreatorContext innerCreator() {
			return getRuleContext(InnerCreatorContext.class,0);
		}
		public TerminalNode SUPER() { return getToken(JavaParser.SUPER, 0); }
		public SuperSuffixContext superSuffix() {
			return getRuleContext(SuperSuffixContext.class,0);
		}
		public ExplicitGenericInvocationContext explicitGenericInvocation() {
			return getRuleContext(ExplicitGenericInvocationContext.class,0);
		}
		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
		}
		public TerminalNode LBRACK() { return getToken(JavaParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(JavaParser.RBRACK, 0); }
		public TerminalNode INSTANCEOF() { return getToken(JavaParser.INSTANCEOF, 0); }
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 196;
		enterRecursionRule(_localctx, 196, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1375);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,165,_ctx) ) {
			case 1:
				{
				setState(1331);
				primary();
				}
				break;
			case 2:
				{
				setState(1332);
				methodCall();
				}
				break;
			case 3:
				{
				setState(1333);
				match(NEW);
				setState(1334);
				creator();
				}
				break;
			case 4:
				{
				setState(1335);
				match(LPAREN);
				setState(1339);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,160,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1336);
						annotation();
						}
						} 
					}
					setState(1341);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,160,_ctx);
				}
				setState(1342);
				typeType();
				setState(1347);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==BITAND) {
					{
					{
					setState(1343);
					match(BITAND);
					setState(1344);
					typeType();
					}
					}
					setState(1349);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1350);
				match(RPAREN);
				setState(1351);
				expression(22);
				}
				break;
			case 5:
				{
				setState(1353);
				((ExpressionContext)_localctx).prefix = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 100)) & ~0x3f) == 0 && ((1L << (_la - 100)) & ((1L << (INC - 100)) | (1L << (DEC - 100)) | (1L << (ADD - 100)) | (1L << (SUB - 100)))) != 0)) ) {
					((ExpressionContext)_localctx).prefix = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1354);
				expression(20);
				}
				break;
			case 6:
				{
				setState(1355);
				((ExpressionContext)_localctx).prefix = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==BANG || _la==TILDE) ) {
					((ExpressionContext)_localctx).prefix = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1356);
				expression(19);
				}
				break;
			case 7:
				{
				setState(1357);
				lambdaExpression();
				}
				break;
			case 8:
				{
				setState(1358);
				switchExpression();
				}
				break;
			case 9:
				{
				setState(1359);
				typeType();
				setState(1360);
				match(COLONCOLON);
				setState(1366);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case MODULE:
				case OPEN:
				case REQUIRES:
				case EXPORTS:
				case OPENS:
				case TO:
				case USES:
				case PROVIDES:
				case WITH:
				case TRANSITIVE:
				case VAR:
				case YIELD:
				case RECORD:
				case SEALED:
				case PERMITS:
				case LT:
				case IDENTIFIER:
					{
					setState(1362);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LT) {
						{
						setState(1361);
						typeArguments();
						}
					}

					setState(1364);
					identifier();
					}
					break;
				case NEW:
					{
					setState(1365);
					match(NEW);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 10:
				{
				setState(1368);
				classType();
				setState(1369);
				match(COLONCOLON);
				setState(1371);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1370);
					typeArguments();
					}
				}

				setState(1373);
				match(NEW);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1460);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,172,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1458);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,171,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1377);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(1378);
						((ExpressionContext)_localctx).bop = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 104)) & ~0x3f) == 0 && ((1L << (_la - 104)) & ((1L << (MUL - 104)) | (1L << (DIV - 104)) | (1L << (MOD - 104)))) != 0)) ) {
							((ExpressionContext)_localctx).bop = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1379);
						expression(19);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1380);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(1381);
						((ExpressionContext)_localctx).bop = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
							((ExpressionContext)_localctx).bop = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1382);
						expression(18);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1383);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(1391);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,166,_ctx) ) {
						case 1:
							{
							setState(1384);
							match(LT);
							setState(1385);
							match(LT);
							}
							break;
						case 2:
							{
							setState(1386);
							match(GT);
							setState(1387);
							match(GT);
							setState(1388);
							match(GT);
							}
							break;
						case 3:
							{
							setState(1389);
							match(GT);
							setState(1390);
							match(GT);
							}
							break;
						}
						setState(1393);
						expression(17);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1394);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(1395);
						((ExpressionContext)_localctx).bop = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 88)) & ~0x3f) == 0 && ((1L << (_la - 88)) & ((1L << (GT - 88)) | (1L << (LT - 88)) | (1L << (LE - 88)) | (1L << (GE - 88)))) != 0)) ) {
							((ExpressionContext)_localctx).bop = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1396);
						expression(16);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1397);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(1398);
						((ExpressionContext)_localctx).bop = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==EQUAL || _la==NOTEQUAL) ) {
							((ExpressionContext)_localctx).bop = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1399);
						expression(14);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1400);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(1401);
						((ExpressionContext)_localctx).bop = match(BITAND);
						setState(1402);
						expression(13);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1403);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(1404);
						((ExpressionContext)_localctx).bop = match(CARET);
						setState(1405);
						expression(12);
						}
						break;
					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1406);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(1407);
						((ExpressionContext)_localctx).bop = match(BITOR);
						setState(1408);
						expression(11);
						}
						break;
					case 9:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1409);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(1410);
						((ExpressionContext)_localctx).bop = match(AND);
						setState(1411);
						expression(10);
						}
						break;
					case 10:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1412);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(1413);
						((ExpressionContext)_localctx).bop = match(OR);
						setState(1414);
						expression(9);
						}
						break;
					case 11:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1415);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(1416);
						((ExpressionContext)_localctx).bop = match(QUESTION);
						setState(1417);
						expression(0);
						setState(1418);
						match(COLON);
						setState(1419);
						expression(7);
						}
						break;
					case 12:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1421);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(1422);
						((ExpressionContext)_localctx).bop = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & ((1L << (ASSIGN - 87)) | (1L << (ADD_ASSIGN - 87)) | (1L << (SUB_ASSIGN - 87)) | (1L << (MUL_ASSIGN - 87)) | (1L << (DIV_ASSIGN - 87)) | (1L << (AND_ASSIGN - 87)) | (1L << (OR_ASSIGN - 87)) | (1L << (XOR_ASSIGN - 87)) | (1L << (MOD_ASSIGN - 87)) | (1L << (LSHIFT_ASSIGN - 87)) | (1L << (RSHIFT_ASSIGN - 87)) | (1L << (URSHIFT_ASSIGN - 87)))) != 0)) ) {
							((ExpressionContext)_localctx).bop = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1423);
						expression(6);
						}
						break;
					case 13:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1424);
						if (!(precpred(_ctx, 26))) throw new FailedPredicateException(this, "precpred(_ctx, 26)");
						setState(1425);
						((ExpressionContext)_localctx).bop = match(DOT);
						setState(1437);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,168,_ctx) ) {
						case 1:
							{
							setState(1426);
							identifier();
							}
							break;
						case 2:
							{
							setState(1427);
							methodCall();
							}
							break;
						case 3:
							{
							setState(1428);
							match(THIS);
							}
							break;
						case 4:
							{
							setState(1429);
							match(NEW);
							setState(1431);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if (_la==LT) {
								{
								setState(1430);
								nonWildcardTypeArguments();
								}
							}

							setState(1433);
							innerCreator();
							}
							break;
						case 5:
							{
							setState(1434);
							match(SUPER);
							setState(1435);
							superSuffix();
							}
							break;
						case 6:
							{
							setState(1436);
							explicitGenericInvocation();
							}
							break;
						}
						}
						break;
					case 14:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1439);
						if (!(precpred(_ctx, 25))) throw new FailedPredicateException(this, "precpred(_ctx, 25)");
						setState(1440);
						match(LBRACK);
						setState(1441);
						expression(0);
						setState(1442);
						match(RBRACK);
						}
						break;
					case 15:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1444);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(1445);
						((ExpressionContext)_localctx).postfix = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==INC || _la==DEC) ) {
							((ExpressionContext)_localctx).postfix = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						break;
					case 16:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1446);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(1447);
						((ExpressionContext)_localctx).bop = match(INSTANCEOF);
						setState(1450);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,169,_ctx) ) {
						case 1:
							{
							setState(1448);
							typeType();
							}
							break;
						case 2:
							{
							setState(1449);
							pattern();
							}
							break;
						}
						}
						break;
					case 17:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1452);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1453);
						match(COLONCOLON);
						setState(1455);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==LT) {
							{
							setState(1454);
							typeArguments();
							}
						}

						setState(1457);
						identifier();
						}
						break;
					}
					} 
				}
				setState(1462);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,172,_ctx);
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

	public static class PatternContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public PatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitPattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitPattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PatternContext pattern() throws RecognitionException {
		PatternContext _localctx = new PatternContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_pattern);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1466);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,173,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1463);
					variableModifier();
					}
					} 
				}
				setState(1468);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,173,_ctx);
			}
			setState(1469);
			typeType();
			setState(1473);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,174,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1470);
					annotation();
					}
					} 
				}
				setState(1475);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,174,_ctx);
			}
			setState(1476);
			identifier();
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

	public static class LambdaExpressionContext extends ParserRuleContext {
		public LambdaParametersContext lambdaParameters() {
			return getRuleContext(LambdaParametersContext.class,0);
		}
		public TerminalNode ARROW() { return getToken(JavaParser.ARROW, 0); }
		public LambdaBodyContext lambdaBody() {
			return getRuleContext(LambdaBodyContext.class,0);
		}
		public LambdaExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterLambdaExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitLambdaExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitLambdaExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LambdaExpressionContext lambdaExpression() throws RecognitionException {
		LambdaExpressionContext _localctx = new LambdaExpressionContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_lambdaExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1478);
			lambdaParameters();
			setState(1479);
			match(ARROW);
			setState(1480);
			lambdaBody();
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

	public static class LambdaParametersContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode LPAREN() { return getToken(JavaParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(JavaParser.RPAREN, 0); }
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(JavaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JavaParser.COMMA, i);
		}
		public LambdaLVTIListContext lambdaLVTIList() {
			return getRuleContext(LambdaLVTIListContext.class,0);
		}
		public LambdaParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterLambdaParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitLambdaParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitLambdaParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LambdaParametersContext lambdaParameters() throws RecognitionException {
		LambdaParametersContext _localctx = new LambdaParametersContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_lambdaParameters);
		int _la;
		try {
			setState(1504);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,178,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1482);
				identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1483);
				match(LPAREN);
				setState(1485);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 3)) & ~0x3f) == 0 && ((1L << (_la - 3)) & ((1L << (BOOLEAN - 3)) | (1L << (BYTE - 3)) | (1L << (CHAR - 3)) | (1L << (DOUBLE - 3)) | (1L << (FINAL - 3)) | (1L << (FLOAT - 3)) | (1L << (INT - 3)) | (1L << (LONG - 3)) | (1L << (SHORT - 3)) | (1L << (MODULE - 3)) | (1L << (OPEN - 3)) | (1L << (REQUIRES - 3)) | (1L << (EXPORTS - 3)) | (1L << (OPENS - 3)) | (1L << (TO - 3)) | (1L << (USES - 3)) | (1L << (PROVIDES - 3)) | (1L << (WITH - 3)) | (1L << (TRANSITIVE - 3)) | (1L << (VAR - 3)) | (1L << (YIELD - 3)) | (1L << (RECORD - 3)) | (1L << (SEALED - 3)) | (1L << (PERMITS - 3)))) != 0) || _la==AT || _la==IDENTIFIER) {
					{
					setState(1484);
					formalParameterList();
					}
				}

				setState(1487);
				match(RPAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1488);
				match(LPAREN);
				setState(1489);
				identifier();
				setState(1494);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1490);
					match(COMMA);
					setState(1491);
					identifier();
					}
					}
					setState(1496);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1497);
				match(RPAREN);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1499);
				match(LPAREN);
				setState(1501);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 18)) & ~0x3f) == 0 && ((1L << (_la - 18)) & ((1L << (FINAL - 18)) | (1L << (MODULE - 18)) | (1L << (OPEN - 18)) | (1L << (REQUIRES - 18)) | (1L << (EXPORTS - 18)) | (1L << (OPENS - 18)) | (1L << (TO - 18)) | (1L << (USES - 18)) | (1L << (PROVIDES - 18)) | (1L << (WITH - 18)) | (1L << (TRANSITIVE - 18)) | (1L << (VAR - 18)) | (1L << (YIELD - 18)) | (1L << (RECORD - 18)) | (1L << (SEALED - 18)) | (1L << (PERMITS - 18)))) != 0) || _la==AT || _la==IDENTIFIER) {
					{
					setState(1500);
					lambdaLVTIList();
					}
				}

				setState(1503);
				match(RPAREN);
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

	public static class LambdaBodyContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public LambdaBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterLambdaBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitLambdaBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitLambdaBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LambdaBodyContext lambdaBody() throws RecognitionException {
		LambdaBodyContext _localctx = new LambdaBodyContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_lambdaBody);
		try {
			setState(1508);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case NEW:
			case SHORT:
			case SUPER:
			case SWITCH:
			case THIS:
			case VOID:
			case MODULE:
			case OPEN:
			case REQUIRES:
			case EXPORTS:
			case OPENS:
			case TO:
			case USES:
			case PROVIDES:
			case WITH:
			case TRANSITIVE:
			case VAR:
			case YIELD:
			case RECORD:
			case SEALED:
			case PERMITS:
			case DECIMAL_LITERAL:
			case HEX_LITERAL:
			case OCT_LITERAL:
			case BINARY_LITERAL:
			case FLOAT_LITERAL:
			case HEX_FLOAT_LITERAL:
			case BOOL_LITERAL:
			case CHAR_LITERAL:
			case STRING_LITERAL:
			case TEXT_BLOCK:
			case NULL_LITERAL:
			case LPAREN:
			case LT:
			case BANG:
			case TILDE:
			case INC:
			case DEC:
			case ADD:
			case SUB:
			case AT:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1506);
				expression(0);
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1507);
				block();
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

	public static class PrimaryContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(JavaParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(JavaParser.RPAREN, 0); }
		public TerminalNode THIS() { return getToken(JavaParser.THIS, 0); }
		public TerminalNode SUPER() { return getToken(JavaParser.SUPER, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TypeTypeOrVoidContext typeTypeOrVoid() {
			return getRuleContext(TypeTypeOrVoidContext.class,0);
		}
		public TerminalNode DOT() { return getToken(JavaParser.DOT, 0); }
		public TerminalNode CLASS() { return getToken(JavaParser.CLASS, 0); }
		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
		}
		public ExplicitGenericInvocationSuffixContext explicitGenericInvocationSuffix() {
			return getRuleContext(ExplicitGenericInvocationSuffixContext.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitPrimary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitPrimary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_primary);
		try {
			setState(1528);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,181,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1510);
				match(LPAREN);
				setState(1511);
				expression(0);
				setState(1512);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1514);
				match(THIS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1515);
				match(SUPER);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1516);
				literal();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1517);
				identifier();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1518);
				typeTypeOrVoid();
				setState(1519);
				match(DOT);
				setState(1520);
				match(CLASS);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1522);
				nonWildcardTypeArguments();
				setState(1526);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SUPER:
				case MODULE:
				case OPEN:
				case REQUIRES:
				case EXPORTS:
				case OPENS:
				case TO:
				case USES:
				case PROVIDES:
				case WITH:
				case TRANSITIVE:
				case VAR:
				case YIELD:
				case RECORD:
				case SEALED:
				case PERMITS:
				case IDENTIFIER:
					{
					setState(1523);
					explicitGenericInvocationSuffix();
					}
					break;
				case THIS:
					{
					setState(1524);
					match(THIS);
					setState(1525);
					arguments();
					}
					break;
				default:
					throw new NoViableAltException(this);
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

	public static class SwitchExpressionContext extends ParserRuleContext {
		public TerminalNode SWITCH() { return getToken(JavaParser.SWITCH, 0); }
		public ParExpressionContext parExpression() {
			return getRuleContext(ParExpressionContext.class,0);
		}
		public TerminalNode LBRACE() { return getToken(JavaParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(JavaParser.RBRACE, 0); }
		public List<SwitchLabeledRuleContext> switchLabeledRule() {
			return getRuleContexts(SwitchLabeledRuleContext.class);
		}
		public SwitchLabeledRuleContext switchLabeledRule(int i) {
			return getRuleContext(SwitchLabeledRuleContext.class,i);
		}
		public SwitchExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterSwitchExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitSwitchExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitSwitchExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchExpressionContext switchExpression() throws RecognitionException {
		SwitchExpressionContext _localctx = new SwitchExpressionContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_switchExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1530);
			match(SWITCH);
			setState(1531);
			parExpression();
			setState(1532);
			match(LBRACE);
			setState(1536);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CASE || _la==DEFAULT) {
				{
				{
				setState(1533);
				switchLabeledRule();
				}
				}
				setState(1538);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1539);
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

	public static class SwitchLabeledRuleContext extends ParserRuleContext {
		public TerminalNode CASE() { return getToken(JavaParser.CASE, 0); }
		public SwitchRuleOutcomeContext switchRuleOutcome() {
			return getRuleContext(SwitchRuleOutcomeContext.class,0);
		}
		public TerminalNode ARROW() { return getToken(JavaParser.ARROW, 0); }
		public TerminalNode COLON() { return getToken(JavaParser.COLON, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public TerminalNode NULL_LITERAL() { return getToken(JavaParser.NULL_LITERAL, 0); }
		public GuardedPatternContext guardedPattern() {
			return getRuleContext(GuardedPatternContext.class,0);
		}
		public TerminalNode DEFAULT() { return getToken(JavaParser.DEFAULT, 0); }
		public SwitchLabeledRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchLabeledRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterSwitchLabeledRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitSwitchLabeledRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitSwitchLabeledRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchLabeledRuleContext switchLabeledRule() throws RecognitionException {
		SwitchLabeledRuleContext _localctx = new SwitchLabeledRuleContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_switchLabeledRule);
		int _la;
		try {
			setState(1552);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CASE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1541);
				match(CASE);
				setState(1545);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,183,_ctx) ) {
				case 1:
					{
					setState(1542);
					expressionList();
					}
					break;
				case 2:
					{
					setState(1543);
					match(NULL_LITERAL);
					}
					break;
				case 3:
					{
					setState(1544);
					guardedPattern(0);
					}
					break;
				}
				setState(1547);
				_la = _input.LA(1);
				if ( !(_la==COLON || _la==ARROW) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1548);
				switchRuleOutcome();
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1549);
				match(DEFAULT);
				setState(1550);
				_la = _input.LA(1);
				if ( !(_la==COLON || _la==ARROW) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1551);
				switchRuleOutcome();
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

	public static class GuardedPatternContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(JavaParser.LPAREN, 0); }
		public GuardedPatternContext guardedPattern() {
			return getRuleContext(GuardedPatternContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(JavaParser.RPAREN, 0); }
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(JavaParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(JavaParser.AND, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public GuardedPatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_guardedPattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterGuardedPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitGuardedPattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitGuardedPattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GuardedPatternContext guardedPattern() throws RecognitionException {
		return guardedPattern(0);
	}

	private GuardedPatternContext guardedPattern(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		GuardedPatternContext _localctx = new GuardedPatternContext(_ctx, _parentState);
		GuardedPatternContext _prevctx = _localctx;
		int _startState = 212;
		enterRecursionRule(_localctx, 212, RULE_guardedPattern, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1580);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				{
				setState(1555);
				match(LPAREN);
				setState(1556);
				guardedPattern(0);
				setState(1557);
				match(RPAREN);
				}
				break;
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FINAL:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
			case MODULE:
			case OPEN:
			case REQUIRES:
			case EXPORTS:
			case OPENS:
			case TO:
			case USES:
			case PROVIDES:
			case WITH:
			case TRANSITIVE:
			case VAR:
			case YIELD:
			case RECORD:
			case SEALED:
			case PERMITS:
			case AT:
			case IDENTIFIER:
				{
				setState(1562);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,185,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1559);
						variableModifier();
						}
						} 
					}
					setState(1564);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,185,_ctx);
				}
				setState(1565);
				typeType();
				setState(1569);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,186,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1566);
						annotation();
						}
						} 
					}
					setState(1571);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,186,_ctx);
				}
				setState(1572);
				identifier();
				setState(1577);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,187,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1573);
						match(AND);
						setState(1574);
						expression(0);
						}
						} 
					}
					setState(1579);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,187,_ctx);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(1587);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,189,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new GuardedPatternContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_guardedPattern);
					setState(1582);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1583);
					match(AND);
					setState(1584);
					expression(0);
					}
					} 
				}
				setState(1589);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,189,_ctx);
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

	public static class SwitchRuleOutcomeContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<BlockStatementContext> blockStatement() {
			return getRuleContexts(BlockStatementContext.class);
		}
		public BlockStatementContext blockStatement(int i) {
			return getRuleContext(BlockStatementContext.class,i);
		}
		public SwitchRuleOutcomeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchRuleOutcome; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterSwitchRuleOutcome(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitSwitchRuleOutcome(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitSwitchRuleOutcome(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchRuleOutcomeContext switchRuleOutcome() throws RecognitionException {
		SwitchRuleOutcomeContext _localctx = new SwitchRuleOutcomeContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_switchRuleOutcome);
		int _la;
		try {
			setState(1597);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,191,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1590);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1594);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 1)) & ~0x3f) == 0 && ((1L << (_la - 1)) & ((1L << (ABSTRACT - 1)) | (1L << (ASSERT - 1)) | (1L << (BOOLEAN - 1)) | (1L << (BREAK - 1)) | (1L << (BYTE - 1)) | (1L << (CHAR - 1)) | (1L << (CLASS - 1)) | (1L << (CONTINUE - 1)) | (1L << (DO - 1)) | (1L << (DOUBLE - 1)) | (1L << (FINAL - 1)) | (1L << (FLOAT - 1)) | (1L << (FOR - 1)) | (1L << (IF - 1)) | (1L << (INT - 1)) | (1L << (INTERFACE - 1)) | (1L << (LONG - 1)) | (1L << (NEW - 1)) | (1L << (PRIVATE - 1)) | (1L << (PROTECTED - 1)) | (1L << (PUBLIC - 1)) | (1L << (RETURN - 1)) | (1L << (SHORT - 1)) | (1L << (STATIC - 1)) | (1L << (STRICTFP - 1)) | (1L << (SUPER - 1)) | (1L << (SWITCH - 1)) | (1L << (SYNCHRONIZED - 1)) | (1L << (THIS - 1)) | (1L << (THROW - 1)) | (1L << (TRY - 1)) | (1L << (VOID - 1)) | (1L << (WHILE - 1)) | (1L << (MODULE - 1)) | (1L << (OPEN - 1)) | (1L << (REQUIRES - 1)) | (1L << (EXPORTS - 1)) | (1L << (OPENS - 1)) | (1L << (TO - 1)) | (1L << (USES - 1)) | (1L << (PROVIDES - 1)) | (1L << (WITH - 1)) | (1L << (TRANSITIVE - 1)) | (1L << (VAR - 1)) | (1L << (YIELD - 1)) | (1L << (RECORD - 1)) | (1L << (SEALED - 1)))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (PERMITS - 65)) | (1L << (NON_SEALED - 65)) | (1L << (DECIMAL_LITERAL - 65)) | (1L << (HEX_LITERAL - 65)) | (1L << (OCT_LITERAL - 65)) | (1L << (BINARY_LITERAL - 65)) | (1L << (FLOAT_LITERAL - 65)) | (1L << (HEX_FLOAT_LITERAL - 65)) | (1L << (BOOL_LITERAL - 65)) | (1L << (CHAR_LITERAL - 65)) | (1L << (STRING_LITERAL - 65)) | (1L << (TEXT_BLOCK - 65)) | (1L << (NULL_LITERAL - 65)) | (1L << (LPAREN - 65)) | (1L << (LBRACE - 65)) | (1L << (SEMI - 65)) | (1L << (LT - 65)) | (1L << (BANG - 65)) | (1L << (TILDE - 65)) | (1L << (INC - 65)) | (1L << (DEC - 65)) | (1L << (ADD - 65)) | (1L << (SUB - 65)) | (1L << (AT - 65)) | (1L << (IDENTIFIER - 65)))) != 0)) {
					{
					{
					setState(1591);
					blockStatement();
					}
					}
					setState(1596);
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

	public static class ClassTypeContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public TerminalNode DOT() { return getToken(JavaParser.DOT, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public ClassTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterClassType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitClassType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitClassType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassTypeContext classType() throws RecognitionException {
		ClassTypeContext _localctx = new ClassTypeContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_classType);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1602);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,192,_ctx) ) {
			case 1:
				{
				setState(1599);
				classOrInterfaceType();
				setState(1600);
				match(DOT);
				}
				break;
			}
			setState(1607);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,193,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1604);
					annotation();
					}
					} 
				}
				setState(1609);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,193,_ctx);
			}
			setState(1610);
			identifier();
			setState(1612);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1611);
				typeArguments();
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

	public static class CreatorContext extends ParserRuleContext {
		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
		}
		public CreatedNameContext createdName() {
			return getRuleContext(CreatedNameContext.class,0);
		}
		public ClassCreatorRestContext classCreatorRest() {
			return getRuleContext(ClassCreatorRestContext.class,0);
		}
		public ArrayCreatorRestContext arrayCreatorRest() {
			return getRuleContext(ArrayCreatorRestContext.class,0);
		}
		public CreatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_creator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterCreator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitCreator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitCreator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreatorContext creator() throws RecognitionException {
		CreatorContext _localctx = new CreatorContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_creator);
		try {
			setState(1623);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1614);
				nonWildcardTypeArguments();
				setState(1615);
				createdName();
				setState(1616);
				classCreatorRest();
				}
				break;
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
			case MODULE:
			case OPEN:
			case REQUIRES:
			case EXPORTS:
			case OPENS:
			case TO:
			case USES:
			case PROVIDES:
			case WITH:
			case TRANSITIVE:
			case VAR:
			case YIELD:
			case RECORD:
			case SEALED:
			case PERMITS:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(1618);
				createdName();
				setState(1621);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LBRACK:
					{
					setState(1619);
					arrayCreatorRest();
					}
					break;
				case LPAREN:
					{
					setState(1620);
					classCreatorRest();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
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

	public static class CreatedNameContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TypeArgumentsOrDiamondContext> typeArgumentsOrDiamond() {
			return getRuleContexts(TypeArgumentsOrDiamondContext.class);
		}
		public TypeArgumentsOrDiamondContext typeArgumentsOrDiamond(int i) {
			return getRuleContext(TypeArgumentsOrDiamondContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(JavaParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(JavaParser.DOT, i);
		}
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public CreatedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createdName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterCreatedName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitCreatedName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitCreatedName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreatedNameContext createdName() throws RecognitionException {
		CreatedNameContext _localctx = new CreatedNameContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_createdName);
		int _la;
		try {
			setState(1640);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MODULE:
			case OPEN:
			case REQUIRES:
			case EXPORTS:
			case OPENS:
			case TO:
			case USES:
			case PROVIDES:
			case WITH:
			case TRANSITIVE:
			case VAR:
			case YIELD:
			case RECORD:
			case SEALED:
			case PERMITS:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1625);
				identifier();
				setState(1627);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1626);
					typeArgumentsOrDiamond();
					}
				}

				setState(1636);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DOT) {
					{
					{
					setState(1629);
					match(DOT);
					setState(1630);
					identifier();
					setState(1632);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LT) {
						{
						setState(1631);
						typeArgumentsOrDiamond();
						}
					}

					}
					}
					setState(1638);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1639);
				primitiveType();
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

	public static class InnerCreatorContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ClassCreatorRestContext classCreatorRest() {
			return getRuleContext(ClassCreatorRestContext.class,0);
		}
		public NonWildcardTypeArgumentsOrDiamondContext nonWildcardTypeArgumentsOrDiamond() {
			return getRuleContext(NonWildcardTypeArgumentsOrDiamondContext.class,0);
		}
		public InnerCreatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_innerCreator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterInnerCreator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitInnerCreator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitInnerCreator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InnerCreatorContext innerCreator() throws RecognitionException {
		InnerCreatorContext _localctx = new InnerCreatorContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_innerCreator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1642);
			identifier();
			setState(1644);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1643);
				nonWildcardTypeArgumentsOrDiamond();
				}
			}

			setState(1646);
			classCreatorRest();
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

	public static class ArrayCreatorRestContext extends ParserRuleContext {
		public List<TerminalNode> LBRACK() { return getTokens(JavaParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(JavaParser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(JavaParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(JavaParser.RBRACK, i);
		}
		public ArrayInitializerContext arrayInitializer() {
			return getRuleContext(ArrayInitializerContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ArrayCreatorRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayCreatorRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterArrayCreatorRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitArrayCreatorRest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitArrayCreatorRest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayCreatorRestContext arrayCreatorRest() throws RecognitionException {
		ArrayCreatorRestContext _localctx = new ArrayCreatorRestContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_arrayCreatorRest);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1648);
			match(LBRACK);
			setState(1676);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RBRACK:
				{
				setState(1649);
				match(RBRACK);
				setState(1654);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(1650);
					match(LBRACK);
					setState(1651);
					match(RBRACK);
					}
					}
					setState(1656);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1657);
				arrayInitializer();
				}
				break;
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case NEW:
			case SHORT:
			case SUPER:
			case SWITCH:
			case THIS:
			case VOID:
			case MODULE:
			case OPEN:
			case REQUIRES:
			case EXPORTS:
			case OPENS:
			case TO:
			case USES:
			case PROVIDES:
			case WITH:
			case TRANSITIVE:
			case VAR:
			case YIELD:
			case RECORD:
			case SEALED:
			case PERMITS:
			case DECIMAL_LITERAL:
			case HEX_LITERAL:
			case OCT_LITERAL:
			case BINARY_LITERAL:
			case FLOAT_LITERAL:
			case HEX_FLOAT_LITERAL:
			case BOOL_LITERAL:
			case CHAR_LITERAL:
			case STRING_LITERAL:
			case TEXT_BLOCK:
			case NULL_LITERAL:
			case LPAREN:
			case LT:
			case BANG:
			case TILDE:
			case INC:
			case DEC:
			case ADD:
			case SUB:
			case AT:
			case IDENTIFIER:
				{
				setState(1658);
				expression(0);
				setState(1659);
				match(RBRACK);
				setState(1666);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,203,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1660);
						match(LBRACK);
						setState(1661);
						expression(0);
						setState(1662);
						match(RBRACK);
						}
						} 
					}
					setState(1668);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,203,_ctx);
				}
				setState(1673);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,204,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1669);
						match(LBRACK);
						setState(1670);
						match(RBRACK);
						}
						} 
					}
					setState(1675);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,204,_ctx);
				}
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

	public static class ClassCreatorRestContext extends ParserRuleContext {
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public ClassCreatorRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classCreatorRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterClassCreatorRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitClassCreatorRest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitClassCreatorRest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassCreatorRestContext classCreatorRest() throws RecognitionException {
		ClassCreatorRestContext _localctx = new ClassCreatorRestContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_classCreatorRest);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1678);
			arguments();
			setState(1680);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,206,_ctx) ) {
			case 1:
				{
				setState(1679);
				classBody();
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

	public static class ExplicitGenericInvocationContext extends ParserRuleContext {
		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
		}
		public ExplicitGenericInvocationSuffixContext explicitGenericInvocationSuffix() {
			return getRuleContext(ExplicitGenericInvocationSuffixContext.class,0);
		}
		public ExplicitGenericInvocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explicitGenericInvocation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterExplicitGenericInvocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitExplicitGenericInvocation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitExplicitGenericInvocation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExplicitGenericInvocationContext explicitGenericInvocation() throws RecognitionException {
		ExplicitGenericInvocationContext _localctx = new ExplicitGenericInvocationContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_explicitGenericInvocation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1682);
			nonWildcardTypeArguments();
			setState(1683);
			explicitGenericInvocationSuffix();
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

	public static class TypeArgumentsOrDiamondContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(JavaParser.LT, 0); }
		public TerminalNode GT() { return getToken(JavaParser.GT, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public TypeArgumentsOrDiamondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArgumentsOrDiamond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterTypeArgumentsOrDiamond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitTypeArgumentsOrDiamond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitTypeArgumentsOrDiamond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeArgumentsOrDiamondContext typeArgumentsOrDiamond() throws RecognitionException {
		TypeArgumentsOrDiamondContext _localctx = new TypeArgumentsOrDiamondContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_typeArgumentsOrDiamond);
		try {
			setState(1688);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,207,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1685);
				match(LT);
				setState(1686);
				match(GT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1687);
				typeArguments();
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

	public static class NonWildcardTypeArgumentsOrDiamondContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(JavaParser.LT, 0); }
		public TerminalNode GT() { return getToken(JavaParser.GT, 0); }
		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
		}
		public NonWildcardTypeArgumentsOrDiamondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonWildcardTypeArgumentsOrDiamond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterNonWildcardTypeArgumentsOrDiamond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitNonWildcardTypeArgumentsOrDiamond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitNonWildcardTypeArgumentsOrDiamond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NonWildcardTypeArgumentsOrDiamondContext nonWildcardTypeArgumentsOrDiamond() throws RecognitionException {
		NonWildcardTypeArgumentsOrDiamondContext _localctx = new NonWildcardTypeArgumentsOrDiamondContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_nonWildcardTypeArgumentsOrDiamond);
		try {
			setState(1693);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,208,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1690);
				match(LT);
				setState(1691);
				match(GT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1692);
				nonWildcardTypeArguments();
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

	public static class NonWildcardTypeArgumentsContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(JavaParser.LT, 0); }
		public TypeListContext typeList() {
			return getRuleContext(TypeListContext.class,0);
		}
		public TerminalNode GT() { return getToken(JavaParser.GT, 0); }
		public NonWildcardTypeArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonWildcardTypeArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterNonWildcardTypeArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitNonWildcardTypeArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitNonWildcardTypeArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NonWildcardTypeArgumentsContext nonWildcardTypeArguments() throws RecognitionException {
		NonWildcardTypeArgumentsContext _localctx = new NonWildcardTypeArgumentsContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_nonWildcardTypeArguments);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1695);
			match(LT);
			setState(1696);
			typeList();
			setState(1697);
			match(GT);
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

	public static class TypeListContext extends ParserRuleContext {
		public List<TypeTypeContext> typeType() {
			return getRuleContexts(TypeTypeContext.class);
		}
		public TypeTypeContext typeType(int i) {
			return getRuleContext(TypeTypeContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JavaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JavaParser.COMMA, i);
		}
		public TypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterTypeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitTypeList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitTypeList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeListContext typeList() throws RecognitionException {
		TypeListContext _localctx = new TypeListContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_typeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1699);
			typeType();
			setState(1704);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1700);
				match(COMMA);
				setState(1701);
				typeType();
				}
				}
				setState(1706);
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

	public static class TypeTypeContext extends ParserRuleContext {
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public List<TerminalNode> LBRACK() { return getTokens(JavaParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(JavaParser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(JavaParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(JavaParser.RBRACK, i);
		}
		public TypeTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterTypeType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitTypeType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitTypeType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeTypeContext typeType() throws RecognitionException {
		TypeTypeContext _localctx = new TypeTypeContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_typeType);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1710);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,210,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1707);
					annotation();
					}
					} 
				}
				setState(1712);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,210,_ctx);
			}
			setState(1715);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MODULE:
			case OPEN:
			case REQUIRES:
			case EXPORTS:
			case OPENS:
			case TO:
			case USES:
			case PROVIDES:
			case WITH:
			case TRANSITIVE:
			case VAR:
			case YIELD:
			case RECORD:
			case SEALED:
			case PERMITS:
			case IDENTIFIER:
				{
				setState(1713);
				classOrInterfaceType();
				}
				break;
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
				{
				setState(1714);
				primitiveType();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1727);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,213,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1720);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (((((_la - 51)) & ~0x3f) == 0 && ((1L << (_la - 51)) & ((1L << (MODULE - 51)) | (1L << (OPEN - 51)) | (1L << (REQUIRES - 51)) | (1L << (EXPORTS - 51)) | (1L << (OPENS - 51)) | (1L << (TO - 51)) | (1L << (USES - 51)) | (1L << (PROVIDES - 51)) | (1L << (WITH - 51)) | (1L << (TRANSITIVE - 51)) | (1L << (VAR - 51)) | (1L << (YIELD - 51)) | (1L << (RECORD - 51)) | (1L << (SEALED - 51)) | (1L << (PERMITS - 51)))) != 0) || _la==AT || _la==IDENTIFIER) {
						{
						{
						setState(1717);
						annotation();
						}
						}
						setState(1722);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1723);
					match(LBRACK);
					setState(1724);
					match(RBRACK);
					}
					} 
				}
				setState(1729);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,213,_ctx);
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

	public static class PrimitiveTypeContext extends ParserRuleContext {
		public TerminalNode BOOLEAN() { return getToken(JavaParser.BOOLEAN, 0); }
		public TerminalNode CHAR() { return getToken(JavaParser.CHAR, 0); }
		public TerminalNode BYTE() { return getToken(JavaParser.BYTE, 0); }
		public TerminalNode SHORT() { return getToken(JavaParser.SHORT, 0); }
		public TerminalNode INT() { return getToken(JavaParser.INT, 0); }
		public TerminalNode LONG() { return getToken(JavaParser.LONG, 0); }
		public TerminalNode FLOAT() { return getToken(JavaParser.FLOAT, 0); }
		public TerminalNode DOUBLE() { return getToken(JavaParser.DOUBLE, 0); }
		public PrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterPrimitiveType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitPrimitiveType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitPrimitiveType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimitiveTypeContext primitiveType() throws RecognitionException {
		PrimitiveTypeContext _localctx = new PrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_primitiveType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1730);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT))) != 0)) ) {
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

	public static class TypeArgumentsContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(JavaParser.LT, 0); }
		public List<TypeArgumentContext> typeArgument() {
			return getRuleContexts(TypeArgumentContext.class);
		}
		public TypeArgumentContext typeArgument(int i) {
			return getRuleContext(TypeArgumentContext.class,i);
		}
		public TerminalNode GT() { return getToken(JavaParser.GT, 0); }
		public List<TerminalNode> COMMA() { return getTokens(JavaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JavaParser.COMMA, i);
		}
		public TypeArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterTypeArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitTypeArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitTypeArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeArgumentsContext typeArguments() throws RecognitionException {
		TypeArgumentsContext _localctx = new TypeArgumentsContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_typeArguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1732);
			match(LT);
			setState(1733);
			typeArgument();
			setState(1738);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1734);
				match(COMMA);
				setState(1735);
				typeArgument();
				}
				}
				setState(1740);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1741);
			match(GT);
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

	public static class SuperSuffixContext extends ParserRuleContext {
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public TerminalNode DOT() { return getToken(JavaParser.DOT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public SuperSuffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_superSuffix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterSuperSuffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitSuperSuffix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitSuperSuffix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SuperSuffixContext superSuffix() throws RecognitionException {
		SuperSuffixContext _localctx = new SuperSuffixContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_superSuffix);
		int _la;
		try {
			setState(1752);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(1743);
				arguments();
				}
				break;
			case DOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1744);
				match(DOT);
				setState(1746);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1745);
					typeArguments();
					}
				}

				setState(1748);
				identifier();
				setState(1750);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,216,_ctx) ) {
				case 1:
					{
					setState(1749);
					arguments();
					}
					break;
				}
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

	public static class ExplicitGenericInvocationSuffixContext extends ParserRuleContext {
		public TerminalNode SUPER() { return getToken(JavaParser.SUPER, 0); }
		public SuperSuffixContext superSuffix() {
			return getRuleContext(SuperSuffixContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public ExplicitGenericInvocationSuffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explicitGenericInvocationSuffix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterExplicitGenericInvocationSuffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitExplicitGenericInvocationSuffix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitExplicitGenericInvocationSuffix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExplicitGenericInvocationSuffixContext explicitGenericInvocationSuffix() throws RecognitionException {
		ExplicitGenericInvocationSuffixContext _localctx = new ExplicitGenericInvocationSuffixContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_explicitGenericInvocationSuffix);
		try {
			setState(1759);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SUPER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1754);
				match(SUPER);
				setState(1755);
				superSuffix();
				}
				break;
			case MODULE:
			case OPEN:
			case REQUIRES:
			case EXPORTS:
			case OPENS:
			case TO:
			case USES:
			case PROVIDES:
			case WITH:
			case TRANSITIVE:
			case VAR:
			case YIELD:
			case RECORD:
			case SEALED:
			case PERMITS:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(1756);
				identifier();
				setState(1757);
				arguments();
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

	public static class ArgumentsContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(JavaParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(JavaParser.RPAREN, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1761);
			match(LPAREN);
			setState(1763);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 3)) & ~0x3f) == 0 && ((1L << (_la - 3)) & ((1L << (BOOLEAN - 3)) | (1L << (BYTE - 3)) | (1L << (CHAR - 3)) | (1L << (DOUBLE - 3)) | (1L << (FLOAT - 3)) | (1L << (INT - 3)) | (1L << (LONG - 3)) | (1L << (NEW - 3)) | (1L << (SHORT - 3)) | (1L << (SUPER - 3)) | (1L << (SWITCH - 3)) | (1L << (THIS - 3)) | (1L << (VOID - 3)) | (1L << (MODULE - 3)) | (1L << (OPEN - 3)) | (1L << (REQUIRES - 3)) | (1L << (EXPORTS - 3)) | (1L << (OPENS - 3)) | (1L << (TO - 3)) | (1L << (USES - 3)) | (1L << (PROVIDES - 3)) | (1L << (WITH - 3)) | (1L << (TRANSITIVE - 3)) | (1L << (VAR - 3)) | (1L << (YIELD - 3)) | (1L << (RECORD - 3)) | (1L << (SEALED - 3)) | (1L << (PERMITS - 3)))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (DECIMAL_LITERAL - 67)) | (1L << (HEX_LITERAL - 67)) | (1L << (OCT_LITERAL - 67)) | (1L << (BINARY_LITERAL - 67)) | (1L << (FLOAT_LITERAL - 67)) | (1L << (HEX_FLOAT_LITERAL - 67)) | (1L << (BOOL_LITERAL - 67)) | (1L << (CHAR_LITERAL - 67)) | (1L << (STRING_LITERAL - 67)) | (1L << (TEXT_BLOCK - 67)) | (1L << (NULL_LITERAL - 67)) | (1L << (LPAREN - 67)) | (1L << (LT - 67)) | (1L << (BANG - 67)) | (1L << (TILDE - 67)) | (1L << (INC - 67)) | (1L << (DEC - 67)) | (1L << (ADD - 67)) | (1L << (SUB - 67)) | (1L << (AT - 67)) | (1L << (IDENTIFIER - 67)))) != 0)) {
				{
				setState(1762);
				expressionList();
				}
			}

			setState(1765);
			match(RPAREN);
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
		case 98:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 106:
			return guardedPattern_sempred((GuardedPatternContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 18);
		case 1:
			return precpred(_ctx, 17);
		case 2:
			return precpred(_ctx, 16);
		case 3:
			return precpred(_ctx, 15);
		case 4:
			return precpred(_ctx, 13);
		case 5:
			return precpred(_ctx, 12);
		case 6:
			return precpred(_ctx, 11);
		case 7:
			return precpred(_ctx, 10);
		case 8:
			return precpred(_ctx, 9);
		case 9:
			return precpred(_ctx, 8);
		case 10:
			return precpred(_ctx, 7);
		case 11:
			return precpred(_ctx, 6);
		case 12:
			return precpred(_ctx, 26);
		case 13:
			return precpred(_ctx, 25);
		case 14:
			return precpred(_ctx, 21);
		case 15:
			return precpred(_ctx, 14);
		case 16:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean guardedPattern_sempred(GuardedPatternContext _localctx, int predIndex) {
		switch (predIndex) {
		case 17:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0080\u06e8\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007"+
		"\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007"+
		"\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007"+
		"\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007"+
		"\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007"+
		"\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007"+
		"\'\u0002(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007"+
		",\u0002-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u0007"+
		"1\u00022\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u0007"+
		"6\u00027\u00077\u00028\u00078\u00029\u00079\u0002:\u0007:\u0002;\u0007"+
		";\u0002<\u0007<\u0002=\u0007=\u0002>\u0007>\u0002?\u0007?\u0002@\u0007"+
		"@\u0002A\u0007A\u0002B\u0007B\u0002C\u0007C\u0002D\u0007D\u0002E\u0007"+
		"E\u0002F\u0007F\u0002G\u0007G\u0002H\u0007H\u0002I\u0007I\u0002J\u0007"+
		"J\u0002K\u0007K\u0002L\u0007L\u0002M\u0007M\u0002N\u0007N\u0002O\u0007"+
		"O\u0002P\u0007P\u0002Q\u0007Q\u0002R\u0007R\u0002S\u0007S\u0002T\u0007"+
		"T\u0002U\u0007U\u0002V\u0007V\u0002W\u0007W\u0002X\u0007X\u0002Y\u0007"+
		"Y\u0002Z\u0007Z\u0002[\u0007[\u0002\\\u0007\\\u0002]\u0007]\u0002^\u0007"+
		"^\u0002_\u0007_\u0002`\u0007`\u0002a\u0007a\u0002b\u0007b\u0002c\u0007"+
		"c\u0002d\u0007d\u0002e\u0007e\u0002f\u0007f\u0002g\u0007g\u0002h\u0007"+
		"h\u0002i\u0007i\u0002j\u0007j\u0002k\u0007k\u0002l\u0007l\u0002m\u0007"+
		"m\u0002n\u0007n\u0002o\u0007o\u0002p\u0007p\u0002q\u0007q\u0002r\u0007"+
		"r\u0002s\u0007s\u0002t\u0007t\u0002u\u0007u\u0002v\u0007v\u0002w\u0007"+
		"w\u0002x\u0007x\u0002y\u0007y\u0002z\u0007z\u0002{\u0007{\u0002|\u0007"+
		"|\u0001\u0000\u0003\u0000\u00fc\b\u0000\u0001\u0000\u0005\u0000\u00ff"+
		"\b\u0000\n\u0000\f\u0000\u0102\t\u0000\u0001\u0000\u0005\u0000\u0105\b"+
		"\u0000\n\u0000\f\u0000\u0108\t\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0003\u0000\u010d\b\u0000\u0001\u0001\u0005\u0001\u0110\b\u0001\n\u0001"+
		"\f\u0001\u0113\t\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0002\u0001\u0002\u0003\u0002\u011b\b\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0003\u0002\u0120\b\u0002\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0005\u0003\u0125\b\u0003\n\u0003\f\u0003\u0128\t\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u012f\b\u0003\u0001"+
		"\u0003\u0003\u0003\u0132\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0003\u0004\u0139\b\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0003\u0005\u0145\b\u0005\u0001\u0006\u0001\u0006\u0003"+
		"\u0006\u0149\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u014e"+
		"\b\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u0152\b\u0007\u0001\u0007"+
		"\u0001\u0007\u0003\u0007\u0156\b\u0007\u0001\u0007\u0001\u0007\u0003\u0007"+
		"\u015a\b\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b"+
		"\u0005\b\u0162\b\b\n\b\f\b\u0165\t\b\u0001\b\u0001\b\u0001\t\u0005\t\u016a"+
		"\b\t\n\t\f\t\u016d\t\t\u0001\t\u0001\t\u0001\t\u0005\t\u0172\b\t\n\t\f"+
		"\t\u0175\t\t\u0001\t\u0003\t\u0178\b\t\u0001\n\u0001\n\u0001\n\u0005\n"+
		"\u017d\b\n\n\n\f\n\u0180\t\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0003\u000b\u0186\b\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u018a"+
		"\b\u000b\u0001\u000b\u0003\u000b\u018d\b\u000b\u0001\u000b\u0003\u000b"+
		"\u0190\b\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0005\f"+
		"\u0197\b\f\n\f\f\f\u019a\t\f\u0001\r\u0005\r\u019d\b\r\n\r\f\r\u01a0\t"+
		"\r\u0001\r\u0001\r\u0003\r\u01a4\b\r\u0001\r\u0003\r\u01a7\b\r\u0001\u000e"+
		"\u0001\u000e\u0005\u000e\u01ab\b\u000e\n\u000e\f\u000e\u01ae\t\u000e\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u01b3\b\u000f\u0001\u000f\u0001"+
		"\u000f\u0003\u000f\u01b7\b\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u01bb"+
		"\b\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0005\u0010\u01c1"+
		"\b\u0010\n\u0010\f\u0010\u01c4\t\u0010\u0001\u0010\u0001\u0010\u0001\u0011"+
		"\u0001\u0011\u0005\u0011\u01ca\b\u0011\n\u0011\f\u0011\u01cd\t\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0003\u0012\u01d3\b\u0012\u0001"+
		"\u0012\u0001\u0012\u0005\u0012\u01d7\b\u0012\n\u0012\f\u0012\u01da\t\u0012"+
		"\u0001\u0012\u0003\u0012\u01dd\b\u0012\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0003\u0013\u01e9\b\u0013\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0005\u0014\u01f0\b\u0014\n\u0014\f\u0014\u01f3"+
		"\t\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u01f7\b\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0015\u0001\u0015\u0003\u0015\u01fd\b\u0015\u0001\u0016"+
		"\u0001\u0016\u0003\u0016\u0201\b\u0016\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0003\u0019\u020d\b\u0019\u0001\u0019\u0001\u0019\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0005\u001b\u0216\b\u001b"+
		"\n\u001b\f\u001b\u0219\t\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u021d"+
		"\b\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0003\u001c\u0227\b\u001c\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0005\u001d\u022d\b\u001d\n\u001d\f\u001d"+
		"\u0230\t\u001d\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0005\u001e\u0237\b\u001e\n\u001e\f\u001e\u023a\t\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001f\u0005\u001f\u0240\b\u001f\n\u001f\f\u001f"+
		"\u0243\t\u001f\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001 \u0001 \u0001"+
		" \u0001 \u0003 \u024d\b \u0001!\u0005!\u0250\b!\n!\f!\u0253\t!\u0001!"+
		"\u0001!\u0001!\u0001\"\u0005\"\u0259\b\"\n\"\f\"\u025c\t\"\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0005\"\u0263\b\"\n\"\f\"\u0266\t\"\u0001\""+
		"\u0001\"\u0003\"\u026a\b\"\u0001\"\u0001\"\u0001#\u0001#\u0001#\u0005"+
		"#\u0271\b#\n#\f#\u0274\t#\u0001$\u0001$\u0001$\u0003$\u0279\b$\u0001%"+
		"\u0001%\u0001%\u0005%\u027e\b%\n%\f%\u0281\t%\u0001&\u0001&\u0003&\u0285"+
		"\b&\u0001\'\u0001\'\u0001\'\u0001\'\u0005\'\u028b\b\'\n\'\f\'\u028e\t"+
		"\'\u0001\'\u0003\'\u0291\b\'\u0003\'\u0293\b\'\u0001\'\u0001\'\u0001("+
		"\u0001(\u0003(\u0299\b(\u0001(\u0001(\u0001(\u0003(\u029e\b(\u0005(\u02a0"+
		"\b(\n(\f(\u02a3\t(\u0001)\u0001)\u0005)\u02a7\b)\n)\f)\u02aa\t)\u0001"+
		")\u0001)\u0001)\u0003)\u02af\b)\u0003)\u02b1\b)\u0001*\u0001*\u0001*\u0005"+
		"*\u02b6\b*\n*\f*\u02b9\t*\u0001+\u0001+\u0003+\u02bd\b+\u0001+\u0001+"+
		"\u0001+\u0003+\u02c2\b+\u0001+\u0003+\u02c5\b+\u0003+\u02c7\b+\u0001+"+
		"\u0001+\u0001,\u0001,\u0001,\u0001,\u0005,\u02cf\b,\n,\f,\u02d2\t,\u0001"+
		",\u0001,\u0001-\u0001-\u0001-\u0005-\u02d9\b-\n-\f-\u02dc\t-\u0001-\u0001"+
		"-\u0003-\u02e0\b-\u0001-\u0003-\u02e3\b-\u0001.\u0005.\u02e6\b.\n.\f."+
		"\u02e9\t.\u0001.\u0001.\u0001.\u0001/\u0005/\u02ef\b/\n/\f/\u02f2\t/\u0001"+
		"/\u0001/\u0005/\u02f6\b/\n/\f/\u02f9\t/\u0001/\u0001/\u0001/\u00010\u0001"+
		"0\u00010\u00050\u0301\b0\n0\f0\u0304\t0\u00011\u00051\u0307\b1\n1\f1\u030a"+
		"\t1\u00011\u00011\u00011\u00012\u00012\u00012\u00052\u0312\b2\n2\f2\u0315"+
		"\t2\u00013\u00013\u00013\u00013\u00013\u00013\u00013\u00033\u031e\b3\u0001"+
		"4\u00014\u00015\u00015\u00016\u00016\u00016\u00056\u0327\b6\n6\f6\u032a"+
		"\t6\u00016\u00016\u00016\u00017\u00017\u00017\u00037\u0332\b7\u00017\u0001"+
		"7\u00017\u00037\u0337\b7\u00017\u00037\u033a\b7\u00018\u00018\u00018\u0005"+
		"8\u033f\b8\n8\f8\u0342\t8\u00019\u00019\u00019\u00019\u0001:\u0001:\u0001"+
		":\u0003:\u034b\b:\u0001;\u0001;\u0001;\u0001;\u0005;\u0351\b;\n;\f;\u0354"+
		"\t;\u0003;\u0356\b;\u0001;\u0003;\u0359\b;\u0001;\u0001;\u0001<\u0001"+
		"<\u0001<\u0001<\u0001<\u0001=\u0001=\u0005=\u0364\b=\n=\f=\u0367\t=\u0001"+
		"=\u0001=\u0001>\u0005>\u036c\b>\n>\f>\u036f\t>\u0001>\u0001>\u0003>\u0373"+
		"\b>\u0001?\u0001?\u0001?\u0001?\u0001?\u0001?\u0003?\u037b\b?\u0001?\u0001"+
		"?\u0003?\u037f\b?\u0001?\u0001?\u0003?\u0383\b?\u0001?\u0001?\u0003?\u0387"+
		"\b?\u0001?\u0001?\u0003?\u038b\b?\u0003?\u038d\b?\u0001@\u0001@\u0003"+
		"@\u0391\b@\u0001A\u0001A\u0001A\u0001A\u0003A\u0397\bA\u0001B\u0001B\u0001"+
		"C\u0001C\u0001C\u0001D\u0003D\u039f\bD\u0001D\u0001D\u0001D\u0001D\u0001"+
		"E\u0001E\u0005E\u03a7\bE\nE\fE\u03aa\tE\u0001E\u0001E\u0001F\u0001F\u0005"+
		"F\u03b0\bF\nF\fF\u03b3\tF\u0001F\u0001F\u0001F\u0001F\u0001F\u0001F\u0001"+
		"F\u0003F\u03bc\bF\u0001F\u0001F\u0001F\u0001F\u0001F\u0001F\u0003F\u03c4"+
		"\bF\u0001F\u0001F\u0001F\u0001F\u0001F\u0001F\u0001F\u0001F\u0001F\u0001"+
		"F\u0001F\u0001F\u0003F\u03d2\bF\u0001G\u0001G\u0001H\u0001H\u0001H\u0003"+
		"H\u03d9\bH\u0001H\u0001H\u0001H\u0003H\u03de\bH\u0001H\u0001H\u0001I\u0001"+
		"I\u0003I\u03e4\bI\u0001I\u0001I\u0001J\u0001J\u0001J\u0005J\u03eb\bJ\n"+
		"J\fJ\u03ee\tJ\u0001K\u0001K\u0001K\u0001L\u0001L\u0005L\u03f5\bL\nL\f"+
		"L\u03f8\tL\u0001L\u0001L\u0001M\u0001M\u0005M\u03fe\bM\nM\fM\u0401\tM"+
		"\u0001M\u0001M\u0001N\u0001N\u0001N\u0001N\u0001N\u0003N\u040a\bN\u0001"+
		"O\u0005O\u040d\bO\nO\fO\u0410\tO\u0001O\u0001O\u0001O\u0001O\u0001O\u0001"+
		"O\u0001O\u0001O\u0003O\u041a\bO\u0001P\u0001P\u0001Q\u0005Q\u041f\bQ\n"+
		"Q\fQ\u0422\tQ\u0001Q\u0001Q\u0001Q\u0003Q\u0427\bQ\u0001Q\u0003Q\u042a"+
		"\bQ\u0001R\u0001R\u0001R\u0001R\u0001R\u0003R\u0431\bR\u0001R\u0001R\u0001"+
		"R\u0001R\u0001R\u0001R\u0001R\u0001R\u0001R\u0001R\u0001R\u0001R\u0001"+
		"R\u0001R\u0001R\u0001R\u0001R\u0001R\u0001R\u0001R\u0001R\u0001R\u0001"+
		"R\u0001R\u0001R\u0001R\u0004R\u044d\bR\u000bR\fR\u044e\u0001R\u0003R\u0452"+
		"\bR\u0001R\u0003R\u0455\bR\u0001R\u0001R\u0001R\u0001R\u0005R\u045b\b"+
		"R\nR\fR\u045e\tR\u0001R\u0003R\u0461\bR\u0001R\u0001R\u0001R\u0001R\u0005"+
		"R\u0467\bR\nR\fR\u046a\tR\u0001R\u0005R\u046d\bR\nR\fR\u0470\tR\u0001"+
		"R\u0001R\u0001R\u0001R\u0001R\u0001R\u0001R\u0001R\u0003R\u047a\bR\u0001"+
		"R\u0001R\u0001R\u0001R\u0001R\u0001R\u0001R\u0003R\u0483\bR\u0001R\u0001"+
		"R\u0001R\u0003R\u0488\bR\u0001R\u0001R\u0001R\u0001R\u0001R\u0001R\u0001"+
		"R\u0001R\u0001R\u0001R\u0001R\u0003R\u0495\bR\u0001R\u0001R\u0001R\u0001"+
		"R\u0003R\u049b\bR\u0001S\u0001S\u0003S\u049f\bS\u0001T\u0001T\u0001T\u0005"+
		"T\u04a4\bT\nT\fT\u04a7\tT\u0001T\u0001T\u0001T\u0001T\u0001T\u0001U\u0001"+
		"U\u0001U\u0005U\u04b1\bU\nU\fU\u04b4\tU\u0001V\u0001V\u0001V\u0001W\u0001"+
		"W\u0001W\u0003W\u04bc\bW\u0001W\u0001W\u0001X\u0001X\u0001X\u0005X\u04c3"+
		"\bX\nX\fX\u04c6\tX\u0001Y\u0005Y\u04c9\bY\nY\fY\u04cc\tY\u0001Y\u0001"+
		"Y\u0001Y\u0001Y\u0001Y\u0003Y\u04d3\bY\u0001Y\u0001Y\u0001Y\u0001Y\u0003"+
		"Y\u04d9\bY\u0001Z\u0004Z\u04dc\bZ\u000bZ\fZ\u04dd\u0001Z\u0004Z\u04e1"+
		"\bZ\u000bZ\fZ\u04e2\u0001[\u0001[\u0001[\u0001[\u0001[\u0001[\u0003[\u04eb"+
		"\b[\u0001[\u0001[\u0001[\u0003[\u04f0\b[\u0001\\\u0001\\\u0003\\\u04f4"+
		"\b\\\u0001\\\u0001\\\u0003\\\u04f8\b\\\u0001\\\u0001\\\u0003\\\u04fc\b"+
		"\\\u0003\\\u04fe\b\\\u0001]\u0001]\u0003]\u0502\b]\u0001^\u0005^\u0505"+
		"\b^\n^\f^\u0508\t^\u0001^\u0001^\u0003^\u050c\b^\u0001^\u0001^\u0001^"+
		"\u0001^\u0001_\u0001_\u0001_\u0001_\u0001`\u0001`\u0001`\u0005`\u0519"+
		"\b`\n`\f`\u051c\t`\u0001a\u0001a\u0001a\u0003a\u0521\ba\u0001a\u0001a"+
		"\u0001a\u0001a\u0001a\u0003a\u0528\ba\u0001a\u0001a\u0001a\u0001a\u0003"+
		"a\u052e\ba\u0001a\u0003a\u0531\ba\u0001b\u0001b\u0001b\u0001b\u0001b\u0001"+
		"b\u0001b\u0005b\u053a\bb\nb\fb\u053d\tb\u0001b\u0001b\u0001b\u0005b\u0542"+
		"\bb\nb\fb\u0545\tb\u0001b\u0001b\u0001b\u0001b\u0001b\u0001b\u0001b\u0001"+
		"b\u0001b\u0001b\u0001b\u0001b\u0003b\u0553\bb\u0001b\u0001b\u0003b\u0557"+
		"\bb\u0001b\u0001b\u0001b\u0003b\u055c\bb\u0001b\u0001b\u0003b\u0560\b"+
		"b\u0001b\u0001b\u0001b\u0001b\u0001b\u0001b\u0001b\u0001b\u0001b\u0001"+
		"b\u0001b\u0001b\u0001b\u0001b\u0003b\u0570\bb\u0001b\u0001b\u0001b\u0001"+
		"b\u0001b\u0001b\u0001b\u0001b\u0001b\u0001b\u0001b\u0001b\u0001b\u0001"+
		"b\u0001b\u0001b\u0001b\u0001b\u0001b\u0001b\u0001b\u0001b\u0001b\u0001"+
		"b\u0001b\u0001b\u0001b\u0001b\u0001b\u0001b\u0001b\u0001b\u0001b\u0001"+
		"b\u0001b\u0001b\u0001b\u0001b\u0003b\u0598\bb\u0001b\u0001b\u0001b\u0001"+
		"b\u0003b\u059e\bb\u0001b\u0001b\u0001b\u0001b\u0001b\u0001b\u0001b\u0001"+
		"b\u0001b\u0001b\u0001b\u0003b\u05ab\bb\u0001b\u0001b\u0001b\u0003b\u05b0"+
		"\bb\u0001b\u0005b\u05b3\bb\nb\fb\u05b6\tb\u0001c\u0005c\u05b9\bc\nc\f"+
		"c\u05bc\tc\u0001c\u0001c\u0005c\u05c0\bc\nc\fc\u05c3\tc\u0001c\u0001c"+
		"\u0001d\u0001d\u0001d\u0001d\u0001e\u0001e\u0001e\u0003e\u05ce\be\u0001"+
		"e\u0001e\u0001e\u0001e\u0001e\u0005e\u05d5\be\ne\fe\u05d8\te\u0001e\u0001"+
		"e\u0001e\u0001e\u0003e\u05de\be\u0001e\u0003e\u05e1\be\u0001f\u0001f\u0003"+
		"f\u05e5\bf\u0001g\u0001g\u0001g\u0001g\u0001g\u0001g\u0001g\u0001g\u0001"+
		"g\u0001g\u0001g\u0001g\u0001g\u0001g\u0001g\u0001g\u0003g\u05f7\bg\u0003"+
		"g\u05f9\bg\u0001h\u0001h\u0001h\u0001h\u0005h\u05ff\bh\nh\fh\u0602\th"+
		"\u0001h\u0001h\u0001i\u0001i\u0001i\u0001i\u0003i\u060a\bi\u0001i\u0001"+
		"i\u0001i\u0001i\u0001i\u0003i\u0611\bi\u0001j\u0001j\u0001j\u0001j\u0001"+
		"j\u0001j\u0005j\u0619\bj\nj\fj\u061c\tj\u0001j\u0001j\u0005j\u0620\bj"+
		"\nj\fj\u0623\tj\u0001j\u0001j\u0001j\u0005j\u0628\bj\nj\fj\u062b\tj\u0003"+
		"j\u062d\bj\u0001j\u0001j\u0001j\u0005j\u0632\bj\nj\fj\u0635\tj\u0001k"+
		"\u0001k\u0005k\u0639\bk\nk\fk\u063c\tk\u0003k\u063e\bk\u0001l\u0001l\u0001"+
		"l\u0003l\u0643\bl\u0001l\u0005l\u0646\bl\nl\fl\u0649\tl\u0001l\u0001l"+
		"\u0003l\u064d\bl\u0001m\u0001m\u0001m\u0001m\u0001m\u0001m\u0001m\u0003"+
		"m\u0656\bm\u0003m\u0658\bm\u0001n\u0001n\u0003n\u065c\bn\u0001n\u0001"+
		"n\u0001n\u0003n\u0661\bn\u0005n\u0663\bn\nn\fn\u0666\tn\u0001n\u0003n"+
		"\u0669\bn\u0001o\u0001o\u0003o\u066d\bo\u0001o\u0001o\u0001p\u0001p\u0001"+
		"p\u0001p\u0005p\u0675\bp\np\fp\u0678\tp\u0001p\u0001p\u0001p\u0001p\u0001"+
		"p\u0001p\u0001p\u0005p\u0681\bp\np\fp\u0684\tp\u0001p\u0001p\u0005p\u0688"+
		"\bp\np\fp\u068b\tp\u0003p\u068d\bp\u0001q\u0001q\u0003q\u0691\bq\u0001"+
		"r\u0001r\u0001r\u0001s\u0001s\u0001s\u0003s\u0699\bs\u0001t\u0001t\u0001"+
		"t\u0003t\u069e\bt\u0001u\u0001u\u0001u\u0001u\u0001v\u0001v\u0001v\u0005"+
		"v\u06a7\bv\nv\fv\u06aa\tv\u0001w\u0005w\u06ad\bw\nw\fw\u06b0\tw\u0001"+
		"w\u0001w\u0003w\u06b4\bw\u0001w\u0005w\u06b7\bw\nw\fw\u06ba\tw\u0001w"+
		"\u0001w\u0005w\u06be\bw\nw\fw\u06c1\tw\u0001x\u0001x\u0001y\u0001y\u0001"+
		"y\u0001y\u0005y\u06c9\by\ny\fy\u06cc\ty\u0001y\u0001y\u0001z\u0001z\u0001"+
		"z\u0003z\u06d3\bz\u0001z\u0001z\u0003z\u06d7\bz\u0003z\u06d9\bz\u0001"+
		"{\u0001{\u0001{\u0001{\u0001{\u0003{\u06e0\b{\u0001|\u0001|\u0003|\u06e4"+
		"\b|\u0001|\u0001|\u0001|\u0000\u0002\u00c4\u00d4}\u0000\u0002\u0004\u0006"+
		"\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,."+
		"02468:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088"+
		"\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0"+
		"\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8"+
		"\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0"+
		"\u00d2\u00d4\u00d6\u00d8\u00da\u00dc\u00de\u00e0\u00e2\u00e4\u00e6\u00e8"+
		"\u00ea\u00ec\u00ee\u00f0\u00f2\u00f4\u00f6\u00f8\u0000\u000f\u0002\u0000"+
		"\u0011\u0011((\u0001\u0000CF\u0001\u0000GH\u0002\u0000&&<<\u0002\u0000"+
		"3A\u0080\u0080\u0001\u0000dg\u0001\u0000Z[\u0002\u0000himm\u0001\u0000"+
		"fg\u0002\u0000XY_`\u0002\u0000^^aa\u0002\u0000WWnx\u0001\u0000de\u0002"+
		"\u0000]]yy\b\u0000\u0003\u0003\u0005\u0005\b\b\u000e\u000e\u0014\u0014"+
		"\u001b\u001b\u001d\u001d%%\u07af\u0000\u010c\u0001\u0000\u0000\u0000\u0002"+
		"\u0111\u0001\u0000\u0000\u0000\u0004\u0118\u0001\u0000\u0000\u0000\u0006"+
		"\u0131\u0001\u0000\u0000\u0000\b\u0138\u0001\u0000\u0000\u0000\n\u0144"+
		"\u0001\u0000\u0000\u0000\f\u0148\u0001\u0000\u0000\u0000\u000e\u014a\u0001"+
		"\u0000\u0000\u0000\u0010\u015d\u0001\u0000\u0000\u0000\u0012\u016b\u0001"+
		"\u0000\u0000\u0000\u0014\u0179\u0001\u0000\u0000\u0000\u0016\u0181\u0001"+
		"\u0000\u0000\u0000\u0018\u0193\u0001\u0000\u0000\u0000\u001a\u019e\u0001"+
		"\u0000\u0000\u0000\u001c\u01a8\u0001\u0000\u0000\u0000\u001e\u01af\u0001"+
		"\u0000\u0000\u0000 \u01be\u0001\u0000\u0000\u0000\"\u01c7\u0001\u0000"+
		"\u0000\u0000$\u01dc\u0001\u0000\u0000\u0000&\u01e8\u0001\u0000\u0000\u0000"+
		"(\u01ea\u0001\u0000\u0000\u0000*\u01fc\u0001\u0000\u0000\u0000,\u0200"+
		"\u0001\u0000\u0000\u0000.\u0202\u0001\u0000\u0000\u00000\u0205\u0001\u0000"+
		"\u0000\u00002\u0208\u0001\u0000\u0000\u00004\u0210\u0001\u0000\u0000\u0000"+
		"6\u021c\u0001\u0000\u0000\u00008\u0226\u0001\u0000\u0000\u0000:\u0228"+
		"\u0001\u0000\u0000\u0000<\u0233\u0001\u0000\u0000\u0000>\u0241\u0001\u0000"+
		"\u0000\u0000@\u024c\u0001\u0000\u0000\u0000B\u0251\u0001\u0000\u0000\u0000"+
		"D\u025a\u0001\u0000\u0000\u0000F\u026d\u0001\u0000\u0000\u0000H\u0275"+
		"\u0001\u0000\u0000\u0000J\u027a\u0001\u0000\u0000\u0000L\u0284\u0001\u0000"+
		"\u0000\u0000N\u0286\u0001\u0000\u0000\u0000P\u0296\u0001\u0000\u0000\u0000"+
		"R\u02b0\u0001\u0000\u0000\u0000T\u02b2\u0001\u0000\u0000\u0000V\u02ba"+
		"\u0001\u0000\u0000\u0000X\u02ca\u0001\u0000\u0000\u0000Z\u02e2\u0001\u0000"+
		"\u0000\u0000\\\u02e7\u0001\u0000\u0000\u0000^\u02f0\u0001\u0000\u0000"+
		"\u0000`\u02fd\u0001\u0000\u0000\u0000b\u0308\u0001\u0000\u0000\u0000d"+
		"\u030e\u0001\u0000\u0000\u0000f\u031d\u0001\u0000\u0000\u0000h\u031f\u0001"+
		"\u0000\u0000\u0000j\u0321\u0001\u0000\u0000\u0000l\u0328\u0001\u0000\u0000"+
		"\u0000n\u0331\u0001\u0000\u0000\u0000p\u033b\u0001\u0000\u0000\u0000r"+
		"\u0343\u0001\u0000\u0000\u0000t\u034a\u0001\u0000\u0000\u0000v\u034c\u0001"+
		"\u0000\u0000\u0000x\u035c\u0001\u0000\u0000\u0000z\u0361\u0001\u0000\u0000"+
		"\u0000|\u0372\u0001\u0000\u0000\u0000~\u038c\u0001\u0000\u0000\u0000\u0080"+
		"\u0390\u0001\u0000\u0000\u0000\u0082\u0392\u0001\u0000\u0000\u0000\u0084"+
		"\u0398\u0001\u0000\u0000\u0000\u0086\u039a\u0001\u0000\u0000\u0000\u0088"+
		"\u039e\u0001\u0000\u0000\u0000\u008a\u03a4\u0001\u0000\u0000\u0000\u008c"+
		"\u03d1\u0001\u0000\u0000\u0000\u008e\u03d3\u0001\u0000\u0000\u0000\u0090"+
		"\u03d5\u0001\u0000\u0000\u0000\u0092\u03e1\u0001\u0000\u0000\u0000\u0094"+
		"\u03e7\u0001\u0000\u0000\u0000\u0096\u03ef\u0001\u0000\u0000\u0000\u0098"+
		"\u03f2\u0001\u0000\u0000\u0000\u009a\u03fb\u0001\u0000\u0000\u0000\u009c"+
		"\u0409\u0001\u0000\u0000\u0000\u009e\u040e\u0001\u0000\u0000\u0000\u00a0"+
		"\u041b\u0001\u0000\u0000\u0000\u00a2\u0429\u0001\u0000\u0000\u0000\u00a4"+
		"\u049a\u0001\u0000\u0000\u0000\u00a6\u049e\u0001\u0000\u0000\u0000\u00a8"+
		"\u04a0\u0001\u0000\u0000\u0000\u00aa\u04ad\u0001\u0000\u0000\u0000\u00ac"+
		"\u04b5\u0001\u0000\u0000\u0000\u00ae\u04b8\u0001\u0000\u0000\u0000\u00b0"+
		"\u04bf\u0001\u0000\u0000\u0000\u00b2\u04d8\u0001\u0000\u0000\u0000\u00b4"+
		"\u04db\u0001\u0000\u0000\u0000\u00b6\u04ef\u0001\u0000\u0000\u0000\u00b8"+
		"\u04fd\u0001\u0000\u0000\u0000\u00ba\u0501\u0001\u0000\u0000\u0000\u00bc"+
		"\u0506\u0001\u0000\u0000\u0000\u00be\u0511\u0001\u0000\u0000\u0000\u00c0"+
		"\u0515\u0001\u0000\u0000\u0000\u00c2\u0530\u0001\u0000\u0000\u0000\u00c4"+
		"\u055f\u0001\u0000\u0000\u0000\u00c6\u05ba\u0001\u0000\u0000\u0000\u00c8"+
		"\u05c6\u0001\u0000\u0000\u0000\u00ca\u05e0\u0001\u0000\u0000\u0000\u00cc"+
		"\u05e4\u0001\u0000\u0000\u0000\u00ce\u05f8\u0001\u0000\u0000\u0000\u00d0"+
		"\u05fa\u0001\u0000\u0000\u0000\u00d2\u0610\u0001\u0000\u0000\u0000\u00d4"+
		"\u062c\u0001\u0000\u0000\u0000\u00d6\u063d\u0001\u0000\u0000\u0000\u00d8"+
		"\u0642\u0001\u0000\u0000\u0000\u00da\u0657\u0001\u0000\u0000\u0000\u00dc"+
		"\u0668\u0001\u0000\u0000\u0000\u00de\u066a\u0001\u0000\u0000\u0000\u00e0"+
		"\u0670\u0001\u0000\u0000\u0000\u00e2\u068e\u0001\u0000\u0000\u0000\u00e4"+
		"\u0692\u0001\u0000\u0000\u0000\u00e6\u0698\u0001\u0000\u0000\u0000\u00e8"+
		"\u069d\u0001\u0000\u0000\u0000\u00ea\u069f\u0001\u0000\u0000\u0000\u00ec"+
		"\u06a3\u0001\u0000\u0000\u0000\u00ee\u06ae\u0001\u0000\u0000\u0000\u00f0"+
		"\u06c2\u0001\u0000\u0000\u0000\u00f2\u06c4\u0001\u0000\u0000\u0000\u00f4"+
		"\u06d8\u0001\u0000\u0000\u0000\u00f6\u06df\u0001\u0000\u0000\u0000\u00f8"+
		"\u06e1\u0001\u0000\u0000\u0000\u00fa\u00fc\u0003\u0002\u0001\u0000\u00fb"+
		"\u00fa\u0001\u0000\u0000\u0000\u00fb\u00fc\u0001\u0000\u0000\u0000\u00fc"+
		"\u0100\u0001\u0000\u0000\u0000\u00fd\u00ff\u0003\u0004\u0002\u0000\u00fe"+
		"\u00fd\u0001\u0000\u0000\u0000\u00ff\u0102\u0001\u0000\u0000\u0000\u0100"+
		"\u00fe\u0001\u0000\u0000\u0000\u0100\u0101\u0001\u0000\u0000\u0000\u0101"+
		"\u0106\u0001\u0000\u0000\u0000\u0102\u0100\u0001\u0000\u0000\u0000\u0103"+
		"\u0105\u0003\u0006\u0003\u0000\u0104\u0103\u0001\u0000\u0000\u0000\u0105"+
		"\u0108\u0001\u0000\u0000\u0000\u0106\u0104\u0001\u0000\u0000\u0000\u0106"+
		"\u0107\u0001\u0000\u0000\u0000\u0107\u010d\u0001\u0000\u0000\u0000\u0108"+
		"\u0106\u0001\u0000\u0000\u0000\u0109\u010a\u0003\u0088D\u0000\u010a\u010b"+
		"\u0005\u0000\u0000\u0001\u010b\u010d\u0001\u0000\u0000\u0000\u010c\u00fb"+
		"\u0001\u0000\u0000\u0000\u010c\u0109\u0001\u0000\u0000\u0000\u010d\u0001"+
		"\u0001\u0000\u0000\u0000\u010e\u0110\u0003n7\u0000\u010f\u010e\u0001\u0000"+
		"\u0000\u0000\u0110\u0113\u0001\u0000\u0000\u0000\u0111\u010f\u0001\u0000"+
		"\u0000\u0000\u0111\u0112\u0001\u0000\u0000\u0000\u0112\u0114\u0001\u0000"+
		"\u0000\u0000\u0113\u0111\u0001\u0000\u0000\u0000\u0114\u0115\u0005 \u0000"+
		"\u0000\u0115\u0116\u0003d2\u0000\u0116\u0117\u0005T\u0000\u0000\u0117"+
		"\u0003\u0001\u0000\u0000\u0000\u0118\u011a\u0005\u0019\u0000\u0000\u0119"+
		"\u011b\u0005&\u0000\u0000\u011a\u0119\u0001\u0000\u0000\u0000\u011a\u011b"+
		"\u0001\u0000\u0000\u0000\u011b\u011c\u0001\u0000\u0000\u0000\u011c\u011f"+
		"\u0003d2\u0000\u011d\u011e\u0005V\u0000\u0000\u011e\u0120\u0005h\u0000"+
		"\u0000\u011f\u011d\u0001\u0000\u0000\u0000\u011f\u0120\u0001\u0000\u0000"+
		"\u0000\u0120\u0121\u0001\u0000\u0000\u0000\u0121\u0122\u0005T\u0000\u0000"+
		"\u0122\u0005\u0001\u0000\u0000\u0000\u0123\u0125\u0003\n\u0005\u0000\u0124"+
		"\u0123\u0001\u0000\u0000\u0000\u0125\u0128\u0001\u0000\u0000\u0000\u0126"+
		"\u0124\u0001\u0000\u0000\u0000\u0126\u0127\u0001\u0000\u0000\u0000\u0127"+
		"\u012e\u0001\u0000\u0000\u0000\u0128\u0126\u0001\u0000\u0000\u0000\u0129"+
		"\u012f\u0003\u000e\u0007\u0000\u012a\u012f\u0003\u0016\u000b\u0000\u012b"+
		"\u012f\u0003\u001e\u000f\u0000\u012c\u012f\u0003x<\u0000\u012d\u012f\u0003"+
		"\u0090H\u0000\u012e\u0129\u0001\u0000\u0000\u0000\u012e\u012a\u0001\u0000"+
		"\u0000\u0000\u012e\u012b\u0001\u0000\u0000\u0000\u012e\u012c\u0001\u0000"+
		"\u0000\u0000\u012e\u012d\u0001\u0000\u0000\u0000\u012f\u0132\u0001\u0000"+
		"\u0000\u0000\u0130\u0132\u0005T\u0000\u0000\u0131\u0126\u0001\u0000\u0000"+
		"\u0000\u0131\u0130\u0001\u0000\u0000\u0000\u0132\u0007\u0001\u0000\u0000"+
		"\u0000\u0133\u0139\u0003\n\u0005\u0000\u0134\u0139\u0005\u001e\u0000\u0000"+
		"\u0135\u0139\u0005*\u0000\u0000\u0136\u0139\u0005.\u0000\u0000\u0137\u0139"+
		"\u00051\u0000\u0000\u0138\u0133\u0001\u0000\u0000\u0000\u0138\u0134\u0001"+
		"\u0000\u0000\u0000\u0138\u0135\u0001\u0000\u0000\u0000\u0138\u0136\u0001"+
		"\u0000\u0000\u0000\u0138\u0137\u0001\u0000\u0000\u0000\u0139\t\u0001\u0000"+
		"\u0000\u0000\u013a\u0145\u0003n7\u0000\u013b\u0145\u0005#\u0000\u0000"+
		"\u013c\u0145\u0005\"\u0000\u0000\u013d\u0145\u0005!\u0000\u0000\u013e"+
		"\u0145\u0005&\u0000\u0000\u013f\u0145\u0005\u0001\u0000\u0000\u0140\u0145"+
		"\u0005\u0012\u0000\u0000\u0141\u0145\u0005\'\u0000\u0000\u0142\u0145\u0005"+
		"@\u0000\u0000\u0143\u0145\u0005B\u0000\u0000\u0144\u013a\u0001\u0000\u0000"+
		"\u0000\u0144\u013b\u0001\u0000\u0000\u0000\u0144\u013c\u0001\u0000\u0000"+
		"\u0000\u0144\u013d\u0001\u0000\u0000\u0000\u0144\u013e\u0001\u0000\u0000"+
		"\u0000\u0144\u013f\u0001\u0000\u0000\u0000\u0144\u0140\u0001\u0000\u0000"+
		"\u0000\u0144\u0141\u0001\u0000\u0000\u0000\u0144\u0142\u0001\u0000\u0000"+
		"\u0000\u0144\u0143\u0001\u0000\u0000\u0000\u0145\u000b\u0001\u0000\u0000"+
		"\u0000\u0146\u0149\u0005\u0012\u0000\u0000\u0147\u0149\u0003n7\u0000\u0148"+
		"\u0146\u0001\u0000\u0000\u0000\u0148\u0147\u0001\u0000\u0000\u0000\u0149"+
		"\r\u0001\u0000\u0000\u0000\u014a\u014b\u0005\t\u0000\u0000\u014b\u014d"+
		"\u0003\u00a0P\u0000\u014c\u014e\u0003\u0010\b\u0000\u014d\u014c\u0001"+
		"\u0000\u0000\u0000\u014d\u014e\u0001\u0000\u0000\u0000\u014e\u0151\u0001"+
		"\u0000\u0000\u0000\u014f\u0150\u0005\u0011\u0000\u0000\u0150\u0152\u0003"+
		"\u00eew\u0000\u0151\u014f\u0001\u0000\u0000\u0000\u0151\u0152\u0001\u0000"+
		"\u0000\u0000\u0152\u0155\u0001\u0000\u0000\u0000\u0153\u0154\u0005\u0018"+
		"\u0000\u0000\u0154\u0156\u0003\u00ecv\u0000\u0155\u0153\u0001\u0000\u0000"+
		"\u0000\u0155\u0156\u0001\u0000\u0000\u0000\u0156\u0159\u0001\u0000\u0000"+
		"\u0000\u0157\u0158\u0005A\u0000\u0000\u0158\u015a\u0003\u00ecv\u0000\u0159"+
		"\u0157\u0001\u0000\u0000\u0000\u0159\u015a\u0001\u0000\u0000\u0000\u015a"+
		"\u015b\u0001\u0000\u0000\u0000\u015b\u015c\u0003 \u0010\u0000\u015c\u000f"+
		"\u0001\u0000\u0000\u0000\u015d\u015e\u0005Y\u0000\u0000\u015e\u0163\u0003"+
		"\u0012\t\u0000\u015f\u0160\u0005U\u0000\u0000\u0160\u0162\u0003\u0012"+
		"\t\u0000\u0161\u015f\u0001\u0000\u0000\u0000\u0162\u0165\u0001\u0000\u0000"+
		"\u0000\u0163\u0161\u0001\u0000\u0000\u0000\u0163\u0164\u0001\u0000\u0000"+
		"\u0000\u0164\u0166\u0001\u0000\u0000\u0000\u0165\u0163\u0001\u0000\u0000"+
		"\u0000\u0166\u0167\u0005X\u0000\u0000\u0167\u0011\u0001\u0000\u0000\u0000"+
		"\u0168\u016a\u0003n7\u0000\u0169\u0168\u0001\u0000\u0000\u0000\u016a\u016d"+
		"\u0001\u0000\u0000\u0000\u016b\u0169\u0001\u0000\u0000\u0000\u016b\u016c"+
		"\u0001\u0000\u0000\u0000\u016c\u016e\u0001\u0000\u0000\u0000\u016d\u016b"+
		"\u0001\u0000\u0000\u0000\u016e\u0177\u0003\u00a0P\u0000\u016f\u0173\u0005"+
		"\u0011\u0000\u0000\u0170\u0172\u0003n7\u0000\u0171\u0170\u0001\u0000\u0000"+
		"\u0000\u0172\u0175\u0001\u0000\u0000\u0000\u0173\u0171\u0001\u0000\u0000"+
		"\u0000\u0173\u0174\u0001\u0000\u0000\u0000\u0174\u0176\u0001\u0000\u0000"+
		"\u0000\u0175\u0173\u0001\u0000\u0000\u0000\u0176\u0178\u0003\u0014\n\u0000"+
		"\u0177\u016f\u0001\u0000\u0000\u0000\u0177\u0178\u0001\u0000\u0000\u0000"+
		"\u0178\u0013\u0001\u0000\u0000\u0000\u0179\u017e\u0003\u00eew\u0000\u017a"+
		"\u017b\u0005j\u0000\u0000\u017b\u017d\u0003\u00eew\u0000\u017c\u017a\u0001"+
		"\u0000\u0000\u0000\u017d\u0180\u0001\u0000\u0000\u0000\u017e\u017c\u0001"+
		"\u0000\u0000\u0000\u017e\u017f\u0001\u0000\u0000\u0000\u017f\u0015\u0001"+
		"\u0000\u0000\u0000\u0180\u017e\u0001\u0000\u0000\u0000\u0181\u0182\u0005"+
		"\u0010\u0000\u0000\u0182\u0185\u0003\u00a0P\u0000\u0183\u0184\u0005\u0018"+
		"\u0000\u0000\u0184\u0186\u0003\u00ecv\u0000\u0185\u0183\u0001\u0000\u0000"+
		"\u0000\u0185\u0186\u0001\u0000\u0000\u0000\u0186\u0187\u0001\u0000\u0000"+
		"\u0000\u0187\u0189\u0005P\u0000\u0000\u0188\u018a\u0003\u0018\f\u0000"+
		"\u0189\u0188\u0001\u0000\u0000\u0000\u0189\u018a\u0001\u0000\u0000\u0000"+
		"\u018a\u018c\u0001\u0000\u0000\u0000\u018b\u018d\u0005U\u0000\u0000\u018c"+
		"\u018b\u0001\u0000\u0000\u0000\u018c\u018d\u0001\u0000\u0000\u0000\u018d"+
		"\u018f\u0001\u0000\u0000\u0000\u018e\u0190\u0003\u001c\u000e\u0000\u018f"+
		"\u018e\u0001\u0000\u0000\u0000\u018f\u0190\u0001\u0000\u0000\u0000\u0190"+
		"\u0191\u0001\u0000\u0000\u0000\u0191\u0192\u0005Q\u0000\u0000\u0192\u0017"+
		"\u0001\u0000\u0000\u0000\u0193\u0198\u0003\u001a\r\u0000\u0194\u0195\u0005"+
		"U\u0000\u0000\u0195\u0197\u0003\u001a\r\u0000\u0196\u0194\u0001\u0000"+
		"\u0000\u0000\u0197\u019a\u0001\u0000\u0000\u0000\u0198\u0196\u0001\u0000"+
		"\u0000\u0000\u0198\u0199\u0001\u0000\u0000\u0000\u0199\u0019\u0001\u0000"+
		"\u0000\u0000\u019a\u0198\u0001\u0000\u0000\u0000\u019b\u019d\u0003n7\u0000"+
		"\u019c\u019b\u0001\u0000\u0000\u0000\u019d\u01a0\u0001\u0000\u0000\u0000"+
		"\u019e\u019c\u0001\u0000\u0000\u0000\u019e\u019f\u0001\u0000\u0000\u0000"+
		"\u019f\u01a1\u0001\u0000\u0000\u0000\u01a0\u019e\u0001\u0000\u0000\u0000"+
		"\u01a1\u01a3\u0003\u00a0P\u0000\u01a2\u01a4\u0003\u00f8|\u0000\u01a3\u01a2"+
		"\u0001\u0000\u0000\u0000\u01a3\u01a4\u0001\u0000\u0000\u0000\u01a4\u01a6"+
		"\u0001\u0000\u0000\u0000\u01a5\u01a7\u0003 \u0010\u0000\u01a6\u01a5\u0001"+
		"\u0000\u0000\u0000\u01a6\u01a7\u0001\u0000\u0000\u0000\u01a7\u001b\u0001"+
		"\u0000\u0000\u0000\u01a8\u01ac\u0005T\u0000\u0000\u01a9\u01ab\u0003$\u0012"+
		"\u0000\u01aa\u01a9\u0001\u0000\u0000\u0000\u01ab\u01ae\u0001\u0000\u0000"+
		"\u0000\u01ac\u01aa\u0001\u0000\u0000\u0000\u01ac\u01ad\u0001\u0000\u0000"+
		"\u0000\u01ad\u001d\u0001\u0000\u0000\u0000\u01ae\u01ac\u0001\u0000\u0000"+
		"\u0000\u01af\u01b0\u0005\u001c\u0000\u0000\u01b0\u01b2\u0003\u00a0P\u0000"+
		"\u01b1\u01b3\u0003\u0010\b\u0000\u01b2\u01b1\u0001\u0000\u0000\u0000\u01b2"+
		"\u01b3\u0001\u0000\u0000\u0000\u01b3\u01b6\u0001\u0000\u0000\u0000\u01b4"+
		"\u01b5\u0005\u0011\u0000\u0000\u01b5\u01b7\u0003\u00ecv\u0000\u01b6\u01b4"+
		"\u0001\u0000\u0000\u0000\u01b6\u01b7\u0001\u0000\u0000\u0000\u01b7\u01ba"+
		"\u0001\u0000\u0000\u0000\u01b8\u01b9\u0005A\u0000\u0000\u01b9\u01bb\u0003"+
		"\u00ecv\u0000\u01ba\u01b8\u0001\u0000\u0000\u0000\u01ba\u01bb\u0001\u0000"+
		"\u0000\u0000\u01bb\u01bc\u0001\u0000\u0000\u0000\u01bc\u01bd\u0003\"\u0011"+
		"\u0000\u01bd\u001f\u0001\u0000\u0000\u0000\u01be\u01c2\u0005P\u0000\u0000"+
		"\u01bf\u01c1\u0003$\u0012\u0000\u01c0\u01bf\u0001\u0000\u0000\u0000\u01c1"+
		"\u01c4\u0001\u0000\u0000\u0000\u01c2\u01c0\u0001\u0000\u0000\u0000\u01c2"+
		"\u01c3\u0001\u0000\u0000\u0000\u01c3\u01c5\u0001\u0000\u0000\u0000\u01c4"+
		"\u01c2\u0001\u0000\u0000\u0000\u01c5\u01c6\u0005Q\u0000\u0000\u01c6!\u0001"+
		"\u0000\u0000\u0000\u01c7\u01cb\u0005P\u0000\u0000\u01c8\u01ca\u00036\u001b"+
		"\u0000\u01c9\u01c8\u0001\u0000\u0000\u0000\u01ca\u01cd\u0001\u0000\u0000"+
		"\u0000\u01cb\u01c9\u0001\u0000\u0000\u0000\u01cb\u01cc\u0001\u0000\u0000"+
		"\u0000\u01cc\u01ce\u0001\u0000\u0000\u0000\u01cd\u01cb\u0001\u0000\u0000"+
		"\u0000\u01ce\u01cf\u0005Q\u0000\u0000\u01cf#\u0001\u0000\u0000\u0000\u01d0"+
		"\u01dd\u0005T\u0000\u0000\u01d1\u01d3\u0005&\u0000\u0000\u01d2\u01d1\u0001"+
		"\u0000\u0000\u0000\u01d2\u01d3\u0001\u0000\u0000\u0000\u01d3\u01d4\u0001"+
		"\u0000\u0000\u0000\u01d4\u01dd\u0003\u009aM\u0000\u01d5\u01d7\u0003\b"+
		"\u0004\u0000\u01d6\u01d5\u0001\u0000\u0000\u0000\u01d7\u01da\u0001\u0000"+
		"\u0000\u0000\u01d8\u01d6\u0001\u0000\u0000\u0000\u01d8\u01d9\u0001\u0000"+
		"\u0000\u0000\u01d9\u01db\u0001\u0000\u0000\u0000\u01da\u01d8\u0001\u0000"+
		"\u0000\u0000\u01db\u01dd\u0003&\u0013\u0000\u01dc\u01d0\u0001\u0000\u0000"+
		"\u0000\u01dc\u01d2\u0001\u0000\u0000\u0000\u01dc\u01d8\u0001\u0000\u0000"+
		"\u0000\u01dd%\u0001\u0000\u0000\u0000\u01de\u01e9\u0003(\u0014\u0000\u01df"+
		"\u01e9\u0003.\u0017\u0000\u01e0\u01e9\u00034\u001a\u0000\u01e1\u01e9\u0003"+
		"2\u0019\u0000\u01e2\u01e9\u00030\u0018\u0000\u01e3\u01e9\u0003\u001e\u000f"+
		"\u0000\u01e4\u01e9\u0003x<\u0000\u01e5\u01e9\u0003\u000e\u0007\u0000\u01e6"+
		"\u01e9\u0003\u0016\u000b\u0000\u01e7\u01e9\u0003\u0090H\u0000\u01e8\u01de"+
		"\u0001\u0000\u0000\u0000\u01e8\u01df\u0001\u0000\u0000\u0000\u01e8\u01e0"+
		"\u0001\u0000\u0000\u0000\u01e8\u01e1\u0001\u0000\u0000\u0000\u01e8\u01e2"+
		"\u0001\u0000\u0000\u0000\u01e8\u01e3\u0001\u0000\u0000\u0000\u01e8\u01e4"+
		"\u0001\u0000\u0000\u0000\u01e8\u01e5\u0001\u0000\u0000\u0000\u01e8\u01e6"+
		"\u0001\u0000\u0000\u0000\u01e8\u01e7\u0001\u0000\u0000\u0000\u01e9\'\u0001"+
		"\u0000\u0000\u0000\u01ea\u01eb\u0003,\u0016\u0000\u01eb\u01ec\u0003\u00a0"+
		"P\u0000\u01ec\u01f1\u0003V+\u0000\u01ed\u01ee\u0005R\u0000\u0000\u01ee"+
		"\u01f0\u0005S\u0000\u0000\u01ef\u01ed\u0001\u0000\u0000\u0000\u01f0\u01f3"+
		"\u0001\u0000\u0000\u0000\u01f1\u01ef\u0001\u0000\u0000\u0000\u01f1\u01f2"+
		"\u0001\u0000\u0000\u0000\u01f2\u01f6\u0001\u0000\u0000\u0000\u01f3\u01f1"+
		"\u0001\u0000\u0000\u0000\u01f4\u01f5\u0005-\u0000\u0000\u01f5\u01f7\u0003"+
		"T*\u0000\u01f6\u01f4\u0001\u0000\u0000\u0000\u01f6\u01f7\u0001\u0000\u0000"+
		"\u0000\u01f7\u01f8\u0001\u0000\u0000\u0000\u01f8\u01f9\u0003*\u0015\u0000"+
		"\u01f9)\u0001\u0000\u0000\u0000\u01fa\u01fd\u0003\u009aM\u0000\u01fb\u01fd"+
		"\u0005T\u0000\u0000\u01fc\u01fa\u0001\u0000\u0000\u0000\u01fc\u01fb\u0001"+
		"\u0000\u0000\u0000\u01fd+\u0001\u0000\u0000\u0000\u01fe\u0201\u0003\u00ee"+
		"w\u0000\u01ff\u0201\u00050\u0000\u0000\u0200\u01fe\u0001\u0000\u0000\u0000"+
		"\u0200\u01ff\u0001\u0000\u0000\u0000\u0201-\u0001\u0000\u0000\u0000\u0202"+
		"\u0203\u0003\u0010\b\u0000\u0203\u0204\u0003(\u0014\u0000\u0204/\u0001"+
		"\u0000\u0000\u0000\u0205\u0206\u0003\u0010\b\u0000\u0206\u0207\u00032"+
		"\u0019\u0000\u02071\u0001\u0000\u0000\u0000\u0208\u0209\u0003\u00a0P\u0000"+
		"\u0209\u020c\u0003V+\u0000\u020a\u020b\u0005-\u0000\u0000\u020b\u020d"+
		"\u0003T*\u0000\u020c\u020a\u0001\u0000\u0000\u0000\u020c\u020d\u0001\u0000"+
		"\u0000\u0000\u020d\u020e\u0001\u0000\u0000\u0000\u020e\u020f\u0003\u009a"+
		"M\u0000\u020f3\u0001\u0000\u0000\u0000\u0210\u0211\u0003\u00eew\u0000"+
		"\u0211\u0212\u0003F#\u0000\u0212\u0213\u0005T\u0000\u0000\u02135\u0001"+
		"\u0000\u0000\u0000\u0214\u0216\u0003\b\u0004\u0000\u0215\u0214\u0001\u0000"+
		"\u0000\u0000\u0216\u0219\u0001\u0000\u0000\u0000\u0217\u0215\u0001\u0000"+
		"\u0000\u0000\u0217\u0218\u0001\u0000\u0000\u0000\u0218\u021a\u0001\u0000"+
		"\u0000\u0000\u0219\u0217\u0001\u0000\u0000\u0000\u021a\u021d\u00038\u001c"+
		"\u0000\u021b\u021d\u0005T\u0000\u0000\u021c\u0217\u0001\u0000\u0000\u0000"+
		"\u021c\u021b\u0001\u0000\u0000\u0000\u021d7\u0001\u0000\u0000\u0000\u021e"+
		"\u0227\u0003:\u001d\u0000\u021f\u0227\u0003>\u001f\u0000\u0220\u0227\u0003"+
		"B!\u0000\u0221\u0227\u0003\u001e\u000f\u0000\u0222\u0227\u0003x<\u0000"+
		"\u0223\u0227\u0003\u000e\u0007\u0000\u0224\u0227\u0003\u0016\u000b\u0000"+
		"\u0225\u0227\u0003\u0090H\u0000\u0226\u021e\u0001\u0000\u0000\u0000\u0226"+
		"\u021f\u0001\u0000\u0000\u0000\u0226\u0220\u0001\u0000\u0000\u0000\u0226"+
		"\u0221\u0001\u0000\u0000\u0000\u0226\u0222\u0001\u0000\u0000\u0000\u0226"+
		"\u0223\u0001\u0000\u0000\u0000\u0226\u0224\u0001\u0000\u0000\u0000\u0226"+
		"\u0225\u0001\u0000\u0000\u0000\u02279\u0001\u0000\u0000\u0000\u0228\u0229"+
		"\u0003\u00eew\u0000\u0229\u022e\u0003<\u001e\u0000\u022a\u022b\u0005U"+
		"\u0000\u0000\u022b\u022d\u0003<\u001e\u0000\u022c\u022a\u0001\u0000\u0000"+
		"\u0000\u022d\u0230\u0001\u0000\u0000\u0000\u022e\u022c\u0001\u0000\u0000"+
		"\u0000\u022e\u022f\u0001\u0000\u0000\u0000\u022f\u0231\u0001\u0000\u0000"+
		"\u0000\u0230\u022e\u0001\u0000\u0000\u0000\u0231\u0232\u0005T\u0000\u0000"+
		"\u0232;\u0001\u0000\u0000\u0000\u0233\u0238\u0003\u00a0P\u0000\u0234\u0235"+
		"\u0005R\u0000\u0000\u0235\u0237\u0005S\u0000\u0000\u0236\u0234\u0001\u0000"+
		"\u0000\u0000\u0237\u023a\u0001\u0000\u0000\u0000\u0238\u0236\u0001\u0000"+
		"\u0000\u0000\u0238\u0239\u0001\u0000\u0000\u0000\u0239\u023b\u0001\u0000"+
		"\u0000\u0000\u023a\u0238\u0001\u0000\u0000\u0000\u023b\u023c\u0005W\u0000"+
		"\u0000\u023c\u023d\u0003L&\u0000\u023d=\u0001\u0000\u0000\u0000\u023e"+
		"\u0240\u0003@ \u0000\u023f\u023e\u0001\u0000\u0000\u0000\u0240\u0243\u0001"+
		"\u0000\u0000\u0000\u0241\u023f\u0001\u0000\u0000\u0000\u0241\u0242\u0001"+
		"\u0000\u0000\u0000\u0242\u0244\u0001\u0000\u0000\u0000\u0243\u0241\u0001"+
		"\u0000\u0000\u0000\u0244\u0245\u0003D\"\u0000\u0245?\u0001\u0000\u0000"+
		"\u0000\u0246\u024d\u0003n7\u0000\u0247\u024d\u0005#\u0000\u0000\u0248"+
		"\u024d\u0005\u0001\u0000\u0000\u0249\u024d\u0005\f\u0000\u0000\u024a\u024d"+
		"\u0005&\u0000\u0000\u024b\u024d\u0005\'\u0000\u0000\u024c\u0246\u0001"+
		"\u0000\u0000\u0000\u024c\u0247\u0001\u0000\u0000\u0000\u024c\u0248\u0001"+
		"\u0000\u0000\u0000\u024c\u0249\u0001\u0000\u0000\u0000\u024c\u024a\u0001"+
		"\u0000\u0000\u0000\u024c\u024b\u0001\u0000\u0000\u0000\u024dA\u0001\u0000"+
		"\u0000\u0000\u024e\u0250\u0003@ \u0000\u024f\u024e\u0001\u0000\u0000\u0000"+
		"\u0250\u0253\u0001\u0000\u0000\u0000\u0251\u024f\u0001\u0000\u0000\u0000"+
		"\u0251\u0252\u0001\u0000\u0000\u0000\u0252\u0254\u0001\u0000\u0000\u0000"+
		"\u0253\u0251\u0001\u0000\u0000\u0000\u0254\u0255\u0003\u0010\b\u0000\u0255"+
		"\u0256\u0003D\"\u0000\u0256C\u0001\u0000\u0000\u0000\u0257\u0259\u0003"+
		"n7\u0000\u0258\u0257\u0001\u0000\u0000\u0000\u0259\u025c\u0001\u0000\u0000"+
		"\u0000\u025a\u0258\u0001\u0000\u0000\u0000\u025a\u025b\u0001\u0000\u0000"+
		"\u0000\u025b\u025d\u0001\u0000\u0000\u0000\u025c\u025a\u0001\u0000\u0000"+
		"\u0000\u025d\u025e\u0003,\u0016\u0000\u025e\u025f\u0003\u00a0P\u0000\u025f"+
		"\u0264\u0003V+\u0000\u0260\u0261\u0005R\u0000\u0000\u0261\u0263\u0005"+
		"S\u0000\u0000\u0262\u0260\u0001\u0000\u0000\u0000\u0263\u0266\u0001\u0000"+
		"\u0000\u0000\u0264\u0262\u0001\u0000\u0000\u0000\u0264\u0265\u0001\u0000"+
		"\u0000\u0000\u0265\u0269\u0001\u0000\u0000\u0000\u0266\u0264\u0001\u0000"+
		"\u0000\u0000\u0267\u0268\u0005-\u0000\u0000\u0268\u026a\u0003T*\u0000"+
		"\u0269\u0267\u0001\u0000\u0000\u0000\u0269\u026a\u0001\u0000\u0000\u0000"+
		"\u026a\u026b\u0001\u0000\u0000\u0000\u026b\u026c\u0003*\u0015\u0000\u026c"+
		"E\u0001\u0000\u0000\u0000\u026d\u0272\u0003H$\u0000\u026e\u026f\u0005"+
		"U\u0000\u0000\u026f\u0271\u0003H$\u0000\u0270\u026e\u0001\u0000\u0000"+
		"\u0000\u0271\u0274\u0001\u0000\u0000\u0000\u0272\u0270\u0001\u0000\u0000"+
		"\u0000\u0272\u0273\u0001\u0000\u0000\u0000\u0273G\u0001\u0000\u0000\u0000"+
		"\u0274\u0272\u0001\u0000\u0000\u0000\u0275\u0278\u0003J%\u0000\u0276\u0277"+
		"\u0005W\u0000\u0000\u0277\u0279\u0003L&\u0000\u0278\u0276\u0001\u0000"+
		"\u0000\u0000\u0278\u0279\u0001\u0000\u0000\u0000\u0279I\u0001\u0000\u0000"+
		"\u0000\u027a\u027f\u0003\u00a0P\u0000\u027b\u027c\u0005R\u0000\u0000\u027c"+
		"\u027e\u0005S\u0000\u0000\u027d\u027b\u0001\u0000\u0000\u0000\u027e\u0281"+
		"\u0001\u0000\u0000\u0000\u027f\u027d\u0001\u0000\u0000\u0000\u027f\u0280"+
		"\u0001\u0000\u0000\u0000\u0280K\u0001\u0000\u0000\u0000\u0281\u027f\u0001"+
		"\u0000\u0000\u0000\u0282\u0285\u0003N\'\u0000\u0283\u0285\u0003\u00c4"+
		"b\u0000\u0284\u0282\u0001\u0000\u0000\u0000\u0284\u0283\u0001\u0000\u0000"+
		"\u0000\u0285M\u0001\u0000\u0000\u0000\u0286\u0292\u0005P\u0000\u0000\u0287"+
		"\u028c\u0003L&\u0000\u0288\u0289\u0005U\u0000\u0000\u0289\u028b\u0003"+
		"L&\u0000\u028a\u0288\u0001\u0000\u0000\u0000\u028b\u028e\u0001\u0000\u0000"+
		"\u0000\u028c\u028a\u0001\u0000\u0000\u0000\u028c\u028d\u0001\u0000\u0000"+
		"\u0000\u028d\u0290\u0001\u0000\u0000\u0000\u028e\u028c\u0001\u0000\u0000"+
		"\u0000\u028f\u0291\u0005U\u0000\u0000\u0290\u028f\u0001\u0000\u0000\u0000"+
		"\u0290\u0291\u0001\u0000\u0000\u0000\u0291\u0293\u0001\u0000\u0000\u0000"+
		"\u0292\u0287\u0001\u0000\u0000\u0000\u0292\u0293\u0001\u0000\u0000\u0000"+
		"\u0293\u0294\u0001\u0000\u0000\u0000\u0294\u0295\u0005Q\u0000\u0000\u0295"+
		"O\u0001\u0000\u0000\u0000\u0296\u0298\u0003\u00a0P\u0000\u0297\u0299\u0003"+
		"\u00f2y\u0000\u0298\u0297\u0001\u0000\u0000\u0000\u0298\u0299\u0001\u0000"+
		"\u0000\u0000\u0299\u02a1\u0001\u0000\u0000\u0000\u029a\u029b\u0005V\u0000"+
		"\u0000\u029b\u029d\u0003\u00a0P\u0000\u029c\u029e\u0003\u00f2y\u0000\u029d"+
		"\u029c\u0001\u0000\u0000\u0000\u029d\u029e\u0001\u0000\u0000\u0000\u029e"+
		"\u02a0\u0001\u0000\u0000\u0000\u029f\u029a\u0001\u0000\u0000\u0000\u02a0"+
		"\u02a3\u0001\u0000\u0000\u0000\u02a1\u029f\u0001\u0000\u0000\u0000\u02a1"+
		"\u02a2\u0001\u0000\u0000\u0000\u02a2Q\u0001\u0000\u0000\u0000\u02a3\u02a1"+
		"\u0001\u0000\u0000\u0000\u02a4\u02b1\u0003\u00eew\u0000\u02a5\u02a7\u0003"+
		"n7\u0000\u02a6\u02a5\u0001\u0000\u0000\u0000\u02a7\u02aa\u0001\u0000\u0000"+
		"\u0000\u02a8\u02a6\u0001\u0000\u0000\u0000\u02a8\u02a9\u0001\u0000\u0000"+
		"\u0000\u02a9\u02ab\u0001\u0000\u0000\u0000\u02aa\u02a8\u0001\u0000\u0000"+
		"\u0000\u02ab\u02ae\u0005\\\u0000\u0000\u02ac\u02ad\u0007\u0000\u0000\u0000"+
		"\u02ad\u02af\u0003\u00eew\u0000\u02ae\u02ac\u0001\u0000\u0000\u0000\u02ae"+
		"\u02af\u0001\u0000\u0000\u0000\u02af\u02b1\u0001\u0000\u0000\u0000\u02b0"+
		"\u02a4\u0001\u0000\u0000\u0000\u02b0\u02a8\u0001\u0000\u0000\u0000\u02b1"+
		"S\u0001\u0000\u0000\u0000\u02b2\u02b7\u0003d2\u0000\u02b3\u02b4\u0005"+
		"U\u0000\u0000\u02b4\u02b6\u0003d2\u0000\u02b5\u02b3\u0001\u0000\u0000"+
		"\u0000\u02b6\u02b9\u0001\u0000\u0000\u0000\u02b7\u02b5\u0001\u0000\u0000"+
		"\u0000\u02b7\u02b8\u0001\u0000\u0000\u0000\u02b8U\u0001\u0000\u0000\u0000"+
		"\u02b9\u02b7\u0001\u0000\u0000\u0000\u02ba\u02c6\u0005N\u0000\u0000\u02bb"+
		"\u02bd\u0003X,\u0000\u02bc\u02bb\u0001\u0000\u0000\u0000\u02bc\u02bd\u0001"+
		"\u0000\u0000\u0000\u02bd\u02c7\u0001\u0000\u0000\u0000\u02be\u02c1\u0003"+
		"X,\u0000\u02bf\u02c0\u0005U\u0000\u0000\u02c0\u02c2\u0003Z-\u0000\u02c1"+
		"\u02bf\u0001\u0000\u0000\u0000\u02c1\u02c2\u0001\u0000\u0000\u0000\u02c2"+
		"\u02c7\u0001\u0000\u0000\u0000\u02c3\u02c5\u0003Z-\u0000\u02c4\u02c3\u0001"+
		"\u0000\u0000\u0000\u02c4\u02c5\u0001\u0000\u0000\u0000\u02c5\u02c7\u0001"+
		"\u0000\u0000\u0000\u02c6\u02bc\u0001\u0000\u0000\u0000\u02c6\u02be\u0001"+
		"\u0000\u0000\u0000\u02c6\u02c4\u0001\u0000\u0000\u0000\u02c7\u02c8\u0001"+
		"\u0000\u0000\u0000\u02c8\u02c9\u0005O\u0000\u0000\u02c9W\u0001\u0000\u0000"+
		"\u0000\u02ca\u02d0\u0003\u00eew\u0000\u02cb\u02cc\u0003\u00a0P\u0000\u02cc"+
		"\u02cd\u0005V\u0000\u0000\u02cd\u02cf\u0001\u0000\u0000\u0000\u02ce\u02cb"+
		"\u0001\u0000\u0000\u0000\u02cf\u02d2\u0001\u0000\u0000\u0000\u02d0\u02ce"+
		"\u0001\u0000\u0000\u0000\u02d0\u02d1\u0001\u0000\u0000\u0000\u02d1\u02d3"+
		"\u0001\u0000\u0000\u0000\u02d2\u02d0\u0001\u0000\u0000\u0000\u02d3\u02d4"+
		"\u0005+\u0000\u0000\u02d4Y\u0001\u0000\u0000\u0000\u02d5\u02da\u0003\\"+
		".\u0000\u02d6\u02d7\u0005U\u0000\u0000\u02d7\u02d9\u0003\\.\u0000\u02d8"+
		"\u02d6\u0001\u0000\u0000\u0000\u02d9\u02dc\u0001\u0000\u0000\u0000\u02da"+
		"\u02d8\u0001\u0000\u0000\u0000\u02da\u02db\u0001\u0000\u0000\u0000\u02db"+
		"\u02df\u0001\u0000\u0000\u0000\u02dc\u02da\u0001\u0000\u0000\u0000\u02dd"+
		"\u02de\u0005U\u0000\u0000\u02de\u02e0\u0003^/\u0000\u02df\u02dd\u0001"+
		"\u0000\u0000\u0000\u02df\u02e0\u0001\u0000\u0000\u0000\u02e0\u02e3\u0001"+
		"\u0000\u0000\u0000\u02e1\u02e3\u0003^/\u0000\u02e2\u02d5\u0001\u0000\u0000"+
		"\u0000\u02e2\u02e1\u0001\u0000\u0000\u0000\u02e3[\u0001\u0000\u0000\u0000"+
		"\u02e4\u02e6\u0003\f\u0006\u0000\u02e5\u02e4\u0001\u0000\u0000\u0000\u02e6"+
		"\u02e9\u0001\u0000\u0000\u0000\u02e7\u02e5\u0001\u0000\u0000\u0000\u02e7"+
		"\u02e8\u0001\u0000\u0000\u0000\u02e8\u02ea\u0001\u0000\u0000\u0000\u02e9"+
		"\u02e7\u0001\u0000\u0000\u0000\u02ea\u02eb\u0003\u00eew\u0000\u02eb\u02ec"+
		"\u0003J%\u0000\u02ec]\u0001\u0000\u0000\u0000\u02ed\u02ef\u0003\f\u0006"+
		"\u0000\u02ee\u02ed\u0001\u0000\u0000\u0000\u02ef\u02f2\u0001\u0000\u0000"+
		"\u0000\u02f0\u02ee\u0001\u0000\u0000\u0000\u02f0\u02f1\u0001\u0000\u0000"+
		"\u0000\u02f1\u02f3\u0001\u0000\u0000\u0000\u02f2\u02f0\u0001\u0000\u0000"+
		"\u0000\u02f3\u02f7\u0003\u00eew\u0000\u02f4\u02f6\u0003n7\u0000\u02f5"+
		"\u02f4\u0001\u0000\u0000\u0000\u02f6\u02f9\u0001\u0000\u0000\u0000\u02f7"+
		"\u02f5\u0001\u0000\u0000\u0000\u02f7\u02f8\u0001\u0000\u0000\u0000\u02f8"+
		"\u02fa\u0001\u0000\u0000\u0000\u02f9\u02f7\u0001\u0000\u0000\u0000\u02fa"+
		"\u02fb\u0005|\u0000\u0000\u02fb\u02fc\u0003J%\u0000\u02fc_\u0001\u0000"+
		"\u0000\u0000\u02fd\u0302\u0003b1\u0000\u02fe\u02ff\u0005U\u0000\u0000"+
		"\u02ff\u0301\u0003b1\u0000\u0300\u02fe\u0001\u0000\u0000\u0000\u0301\u0304"+
		"\u0001\u0000\u0000\u0000\u0302\u0300\u0001\u0000\u0000\u0000\u0302\u0303"+
		"\u0001\u0000\u0000\u0000\u0303a\u0001\u0000\u0000\u0000\u0304\u0302\u0001"+
		"\u0000\u0000\u0000\u0305\u0307\u0003\f\u0006\u0000\u0306\u0305\u0001\u0000"+
		"\u0000\u0000\u0307\u030a\u0001\u0000\u0000\u0000\u0308\u0306\u0001\u0000"+
		"\u0000\u0000\u0308\u0309\u0001\u0000\u0000\u0000\u0309\u030b\u0001\u0000"+
		"\u0000\u0000\u030a\u0308\u0001\u0000\u0000\u0000\u030b\u030c\u0005=\u0000"+
		"\u0000\u030c\u030d\u0003\u00a0P\u0000\u030dc\u0001\u0000\u0000\u0000\u030e"+
		"\u0313\u0003\u00a0P\u0000\u030f\u0310\u0005V\u0000\u0000\u0310\u0312\u0003"+
		"\u00a0P\u0000\u0311\u030f\u0001\u0000\u0000\u0000\u0312\u0315\u0001\u0000"+
		"\u0000\u0000\u0313\u0311\u0001\u0000\u0000\u0000\u0313\u0314\u0001\u0000"+
		"\u0000\u0000\u0314e\u0001\u0000\u0000\u0000\u0315\u0313\u0001\u0000\u0000"+
		"\u0000\u0316\u031e\u0003h4\u0000\u0317\u031e\u0003j5\u0000\u0318\u031e"+
		"\u0005J\u0000\u0000\u0319\u031e\u0005K\u0000\u0000\u031a\u031e\u0005I"+
		"\u0000\u0000\u031b\u031e\u0005M\u0000\u0000\u031c\u031e\u0005L\u0000\u0000"+
		"\u031d\u0316\u0001\u0000\u0000\u0000\u031d\u0317\u0001\u0000\u0000\u0000"+
		"\u031d\u0318\u0001\u0000\u0000\u0000\u031d\u0319\u0001\u0000\u0000\u0000"+
		"\u031d\u031a\u0001\u0000\u0000\u0000\u031d\u031b\u0001\u0000\u0000\u0000"+
		"\u031d\u031c\u0001\u0000\u0000\u0000\u031eg\u0001\u0000\u0000\u0000\u031f"+
		"\u0320\u0007\u0001\u0000\u0000\u0320i\u0001\u0000\u0000\u0000\u0321\u0322"+
		"\u0007\u0002\u0000\u0000\u0322k\u0001\u0000\u0000\u0000\u0323\u0324\u0003"+
		"\u00a0P\u0000\u0324\u0325\u0005V\u0000\u0000\u0325\u0327\u0001\u0000\u0000"+
		"\u0000\u0326\u0323\u0001\u0000\u0000\u0000\u0327\u032a\u0001\u0000\u0000"+
		"\u0000\u0328\u0326\u0001\u0000\u0000\u0000\u0328\u0329\u0001\u0000\u0000"+
		"\u0000\u0329\u032b\u0001\u0000\u0000\u0000\u032a\u0328\u0001\u0000\u0000"+
		"\u0000\u032b\u032c\u0005{\u0000\u0000\u032c\u032d\u0003\u00a0P\u0000\u032d"+
		"m\u0001\u0000\u0000\u0000\u032e\u032f\u0005{\u0000\u0000\u032f\u0332\u0003"+
		"d2\u0000\u0330\u0332\u0003l6\u0000\u0331\u032e\u0001\u0000\u0000\u0000"+
		"\u0331\u0330\u0001\u0000\u0000\u0000\u0332\u0339\u0001\u0000\u0000\u0000"+
		"\u0333\u0336\u0005N\u0000\u0000\u0334\u0337\u0003p8\u0000\u0335\u0337"+
		"\u0003t:\u0000\u0336\u0334\u0001\u0000\u0000\u0000\u0336\u0335\u0001\u0000"+
		"\u0000\u0000\u0336\u0337\u0001\u0000\u0000\u0000\u0337\u0338\u0001\u0000"+
		"\u0000\u0000\u0338\u033a\u0005O\u0000\u0000\u0339\u0333\u0001\u0000\u0000"+
		"\u0000\u0339\u033a\u0001\u0000\u0000\u0000\u033ao\u0001\u0000\u0000\u0000"+
		"\u033b\u0340\u0003r9\u0000\u033c\u033d\u0005U\u0000\u0000\u033d\u033f"+
		"\u0003r9\u0000\u033e\u033c\u0001\u0000\u0000\u0000\u033f\u0342\u0001\u0000"+
		"\u0000\u0000\u0340\u033e\u0001\u0000\u0000\u0000\u0340\u0341\u0001\u0000"+
		"\u0000\u0000\u0341q\u0001\u0000\u0000\u0000\u0342\u0340\u0001\u0000\u0000"+
		"\u0000\u0343\u0344\u0003\u00a0P\u0000\u0344\u0345\u0005W\u0000\u0000\u0345"+
		"\u0346\u0003t:\u0000\u0346s\u0001\u0000\u0000\u0000\u0347\u034b\u0003"+
		"\u00c4b\u0000\u0348\u034b\u0003n7\u0000\u0349\u034b\u0003v;\u0000\u034a"+
		"\u0347\u0001\u0000\u0000\u0000\u034a\u0348\u0001\u0000\u0000\u0000\u034a"+
		"\u0349\u0001\u0000\u0000\u0000\u034bu\u0001\u0000\u0000\u0000\u034c\u0355"+
		"\u0005P\u0000\u0000\u034d\u0352\u0003t:\u0000\u034e\u034f\u0005U\u0000"+
		"\u0000\u034f\u0351\u0003t:\u0000\u0350\u034e\u0001\u0000\u0000\u0000\u0351"+
		"\u0354\u0001\u0000\u0000\u0000\u0352\u0350\u0001\u0000\u0000\u0000\u0352"+
		"\u0353\u0001\u0000\u0000\u0000\u0353\u0356\u0001\u0000\u0000\u0000\u0354"+
		"\u0352\u0001\u0000\u0000\u0000\u0355\u034d\u0001\u0000\u0000\u0000\u0355"+
		"\u0356\u0001\u0000\u0000\u0000\u0356\u0358\u0001\u0000\u0000\u0000\u0357"+
		"\u0359\u0005U\u0000\u0000\u0358\u0357\u0001\u0000\u0000\u0000\u0358\u0359"+
		"\u0001\u0000\u0000\u0000\u0359\u035a\u0001\u0000\u0000\u0000\u035a\u035b"+
		"\u0005Q\u0000\u0000\u035bw\u0001\u0000\u0000\u0000\u035c\u035d\u0005{"+
		"\u0000\u0000\u035d\u035e\u0005\u001c\u0000\u0000\u035e\u035f\u0003\u00a0"+
		"P\u0000\u035f\u0360\u0003z=\u0000\u0360y\u0001\u0000\u0000\u0000\u0361"+
		"\u0365\u0005P\u0000\u0000\u0362\u0364\u0003|>\u0000\u0363\u0362\u0001"+
		"\u0000\u0000\u0000\u0364\u0367\u0001\u0000\u0000\u0000\u0365\u0363\u0001"+
		"\u0000\u0000\u0000\u0365\u0366\u0001\u0000\u0000\u0000\u0366\u0368\u0001"+
		"\u0000\u0000\u0000\u0367\u0365\u0001\u0000\u0000\u0000\u0368\u0369\u0005"+
		"Q\u0000\u0000\u0369{\u0001\u0000\u0000\u0000\u036a\u036c\u0003\b\u0004"+
		"\u0000\u036b\u036a\u0001\u0000\u0000\u0000\u036c\u036f\u0001\u0000\u0000"+
		"\u0000\u036d\u036b\u0001\u0000\u0000\u0000\u036d\u036e\u0001\u0000\u0000"+
		"\u0000\u036e\u0370\u0001\u0000\u0000\u0000\u036f\u036d\u0001\u0000\u0000"+
		"\u0000\u0370\u0373\u0003~?\u0000\u0371\u0373\u0005T\u0000\u0000\u0372"+
		"\u036d\u0001\u0000\u0000\u0000\u0372\u0371\u0001\u0000\u0000\u0000\u0373"+
		"}\u0001\u0000\u0000\u0000\u0374\u0375\u0003\u00eew\u0000\u0375\u0376\u0003"+
		"\u0080@\u0000\u0376\u0377\u0005T\u0000\u0000\u0377\u038d\u0001\u0000\u0000"+
		"\u0000\u0378\u037a\u0003\u000e\u0007\u0000\u0379\u037b\u0005T\u0000\u0000"+
		"\u037a\u0379\u0001\u0000\u0000\u0000\u037a\u037b\u0001\u0000\u0000\u0000"+
		"\u037b\u038d\u0001\u0000\u0000\u0000\u037c\u037e\u0003\u001e\u000f\u0000"+
		"\u037d\u037f\u0005T\u0000\u0000\u037e\u037d\u0001\u0000\u0000\u0000\u037e"+
		"\u037f\u0001\u0000\u0000\u0000\u037f\u038d\u0001\u0000\u0000\u0000\u0380"+
		"\u0382\u0003\u0016\u000b\u0000\u0381\u0383\u0005T\u0000\u0000\u0382\u0381"+
		"\u0001\u0000\u0000\u0000\u0382\u0383\u0001\u0000\u0000\u0000\u0383\u038d"+
		"\u0001\u0000\u0000\u0000\u0384\u0386\u0003x<\u0000\u0385\u0387\u0005T"+
		"\u0000\u0000\u0386\u0385\u0001\u0000\u0000\u0000\u0386\u0387\u0001\u0000"+
		"\u0000\u0000\u0387\u038d\u0001\u0000\u0000\u0000\u0388\u038a\u0003\u0090"+
		"H\u0000\u0389\u038b\u0005T\u0000\u0000\u038a\u0389\u0001\u0000\u0000\u0000"+
		"\u038a\u038b\u0001\u0000\u0000\u0000\u038b\u038d\u0001\u0000\u0000\u0000"+
		"\u038c\u0374\u0001\u0000\u0000\u0000\u038c\u0378\u0001\u0000\u0000\u0000"+
		"\u038c\u037c\u0001\u0000\u0000\u0000\u038c\u0380\u0001\u0000\u0000\u0000"+
		"\u038c\u0384\u0001\u0000\u0000\u0000\u038c\u0388\u0001\u0000\u0000\u0000"+
		"\u038d\u007f\u0001\u0000\u0000\u0000\u038e\u0391\u0003\u0082A\u0000\u038f"+
		"\u0391\u0003\u0084B\u0000\u0390\u038e\u0001\u0000\u0000\u0000\u0390\u038f"+
		"\u0001\u0000\u0000\u0000\u0391\u0081\u0001\u0000\u0000\u0000\u0392\u0393"+
		"\u0003\u00a0P\u0000\u0393\u0394\u0005N\u0000\u0000\u0394\u0396\u0005O"+
		"\u0000\u0000\u0395\u0397\u0003\u0086C\u0000\u0396\u0395\u0001\u0000\u0000"+
		"\u0000\u0396\u0397\u0001\u0000\u0000\u0000\u0397\u0083\u0001\u0000\u0000"+
		"\u0000\u0398\u0399\u0003F#\u0000\u0399\u0085\u0001\u0000\u0000\u0000\u039a"+
		"\u039b\u0005\f\u0000\u0000\u039b\u039c\u0003t:\u0000\u039c\u0087\u0001"+
		"\u0000\u0000\u0000\u039d\u039f\u00054\u0000\u0000\u039e\u039d\u0001\u0000"+
		"\u0000\u0000\u039e\u039f\u0001\u0000\u0000\u0000\u039f\u03a0\u0001\u0000"+
		"\u0000\u0000\u03a0\u03a1\u00053\u0000\u0000\u03a1\u03a2\u0003d2\u0000"+
		"\u03a2\u03a3\u0003\u008aE\u0000\u03a3\u0089\u0001\u0000\u0000\u0000\u03a4"+
		"\u03a8\u0005P\u0000\u0000\u03a5\u03a7\u0003\u008cF\u0000\u03a6\u03a5\u0001"+
		"\u0000\u0000\u0000\u03a7\u03aa\u0001\u0000\u0000\u0000\u03a8\u03a6\u0001"+
		"\u0000\u0000\u0000\u03a8\u03a9\u0001\u0000\u0000\u0000\u03a9\u03ab\u0001"+
		"\u0000\u0000\u0000\u03aa\u03a8\u0001\u0000\u0000\u0000\u03ab\u03ac\u0005"+
		"Q\u0000\u0000\u03ac\u008b\u0001\u0000\u0000\u0000\u03ad\u03b1\u00055\u0000"+
		"\u0000\u03ae\u03b0\u0003\u008eG\u0000\u03af\u03ae\u0001\u0000\u0000\u0000"+
		"\u03b0\u03b3\u0001\u0000\u0000\u0000\u03b1\u03af\u0001\u0000\u0000\u0000"+
		"\u03b1\u03b2\u0001\u0000\u0000\u0000\u03b2\u03b4\u0001\u0000\u0000\u0000"+
		"\u03b3\u03b1\u0001\u0000\u0000\u0000\u03b4\u03b5\u0003d2\u0000\u03b5\u03b6"+
		"\u0005T\u0000\u0000\u03b6\u03d2\u0001\u0000\u0000\u0000\u03b7\u03b8\u0005"+
		"6\u0000\u0000\u03b8\u03bb\u0003d2\u0000\u03b9\u03ba\u00058\u0000\u0000"+
		"\u03ba\u03bc\u0003d2\u0000\u03bb\u03b9\u0001\u0000\u0000\u0000\u03bb\u03bc"+
		"\u0001\u0000\u0000\u0000\u03bc\u03bd\u0001\u0000\u0000\u0000\u03bd\u03be"+
		"\u0005T\u0000\u0000\u03be\u03d2\u0001\u0000\u0000\u0000\u03bf\u03c0\u0005"+
		"7\u0000\u0000\u03c0\u03c3\u0003d2\u0000\u03c1\u03c2\u00058\u0000\u0000"+
		"\u03c2\u03c4\u0003d2\u0000\u03c3\u03c1\u0001\u0000\u0000\u0000\u03c3\u03c4"+
		"\u0001\u0000\u0000\u0000\u03c4\u03c5\u0001\u0000\u0000\u0000\u03c5\u03c6"+
		"\u0005T\u0000\u0000\u03c6\u03d2\u0001\u0000\u0000\u0000\u03c7\u03c8\u0005"+
		"9\u0000\u0000\u03c8\u03c9\u0003d2\u0000\u03c9\u03ca\u0005T\u0000\u0000"+
		"\u03ca\u03d2\u0001\u0000\u0000\u0000\u03cb\u03cc\u0005:\u0000\u0000\u03cc"+
		"\u03cd\u0003d2\u0000\u03cd\u03ce\u0005;\u0000\u0000\u03ce\u03cf\u0003"+
		"d2\u0000\u03cf\u03d0\u0005T\u0000\u0000\u03d0\u03d2\u0001\u0000\u0000"+
		"\u0000\u03d1\u03ad\u0001\u0000\u0000\u0000\u03d1\u03b7\u0001\u0000\u0000"+
		"\u0000\u03d1\u03bf\u0001\u0000\u0000\u0000\u03d1\u03c7\u0001\u0000\u0000"+
		"\u0000\u03d1\u03cb\u0001\u0000\u0000\u0000\u03d2\u008d\u0001\u0000\u0000"+
		"\u0000\u03d3\u03d4\u0007\u0003\u0000\u0000\u03d4\u008f\u0001\u0000\u0000"+
		"\u0000\u03d5\u03d6\u0005?\u0000\u0000\u03d6\u03d8\u0003\u00a0P\u0000\u03d7"+
		"\u03d9\u0003\u0010\b\u0000\u03d8\u03d7\u0001\u0000\u0000\u0000\u03d8\u03d9"+
		"\u0001\u0000\u0000\u0000\u03d9\u03da\u0001\u0000\u0000\u0000\u03da\u03dd"+
		"\u0003\u0092I\u0000\u03db\u03dc\u0005\u0018\u0000\u0000\u03dc\u03de\u0003"+
		"\u00ecv\u0000\u03dd\u03db\u0001\u0000\u0000\u0000\u03dd\u03de\u0001\u0000"+
		"\u0000\u0000\u03de\u03df\u0001\u0000\u0000\u0000\u03df\u03e0\u0003\u0098"+
		"L\u0000\u03e0\u0091\u0001\u0000\u0000\u0000\u03e1\u03e3\u0005N\u0000\u0000"+
		"\u03e2\u03e4\u0003\u0094J\u0000\u03e3\u03e2\u0001\u0000\u0000\u0000\u03e3"+
		"\u03e4\u0001\u0000\u0000\u0000\u03e4\u03e5\u0001\u0000\u0000\u0000\u03e5"+
		"\u03e6\u0005O\u0000\u0000\u03e6\u0093\u0001\u0000\u0000\u0000\u03e7\u03ec"+
		"\u0003\u0096K\u0000\u03e8\u03e9\u0005U\u0000\u0000\u03e9\u03eb\u0003\u0096"+
		"K\u0000\u03ea\u03e8\u0001\u0000\u0000\u0000\u03eb\u03ee\u0001\u0000\u0000"+
		"\u0000\u03ec\u03ea\u0001\u0000\u0000\u0000\u03ec\u03ed\u0001\u0000\u0000"+
		"\u0000\u03ed\u0095\u0001\u0000\u0000\u0000\u03ee\u03ec\u0001\u0000\u0000"+
		"\u0000\u03ef\u03f0\u0003\u00eew\u0000\u03f0\u03f1\u0003\u00a0P\u0000\u03f1"+
		"\u0097\u0001\u0000\u0000\u0000\u03f2\u03f6\u0005P\u0000\u0000\u03f3\u03f5"+
		"\u0003$\u0012\u0000\u03f4\u03f3\u0001\u0000\u0000\u0000\u03f5\u03f8\u0001"+
		"\u0000\u0000\u0000\u03f6\u03f4\u0001\u0000\u0000\u0000\u03f6\u03f7\u0001"+
		"\u0000\u0000\u0000\u03f7\u03f9\u0001\u0000\u0000\u0000\u03f8\u03f6\u0001"+
		"\u0000\u0000\u0000\u03f9\u03fa\u0005Q\u0000\u0000\u03fa\u0099\u0001\u0000"+
		"\u0000\u0000\u03fb\u03ff\u0005P\u0000\u0000\u03fc\u03fe\u0003\u009cN\u0000"+
		"\u03fd\u03fc\u0001\u0000\u0000\u0000\u03fe\u0401\u0001\u0000\u0000\u0000"+
		"\u03ff\u03fd\u0001\u0000\u0000\u0000\u03ff\u0400\u0001\u0000\u0000\u0000"+
		"\u0400\u0402\u0001\u0000\u0000\u0000\u0401\u03ff\u0001\u0000\u0000\u0000"+
		"\u0402\u0403\u0005Q\u0000\u0000\u0403\u009b\u0001\u0000\u0000\u0000\u0404"+
		"\u0405\u0003\u009eO\u0000\u0405\u0406\u0005T\u0000\u0000\u0406\u040a\u0001"+
		"\u0000\u0000\u0000\u0407\u040a\u0003\u00a4R\u0000\u0408\u040a\u0003\u00a2"+
		"Q\u0000\u0409\u0404\u0001\u0000\u0000\u0000\u0409\u0407\u0001\u0000\u0000"+
		"\u0000\u0409\u0408\u0001\u0000\u0000\u0000\u040a\u009d\u0001\u0000\u0000"+
		"\u0000\u040b\u040d\u0003\f\u0006\u0000\u040c\u040b\u0001\u0000\u0000\u0000"+
		"\u040d\u0410\u0001\u0000\u0000\u0000\u040e\u040c\u0001\u0000\u0000\u0000"+
		"\u040e\u040f\u0001\u0000\u0000\u0000\u040f\u0419\u0001\u0000\u0000\u0000"+
		"\u0410\u040e\u0001\u0000\u0000\u0000\u0411\u0412\u0003\u00eew\u0000\u0412"+
		"\u0413\u0003F#\u0000\u0413\u041a\u0001\u0000\u0000\u0000\u0414\u0415\u0005"+
		"=\u0000\u0000\u0415\u0416\u0003\u00a0P\u0000\u0416\u0417\u0005W\u0000"+
		"\u0000\u0417\u0418\u0003\u00c4b\u0000\u0418\u041a\u0001\u0000\u0000\u0000"+
		"\u0419\u0411\u0001\u0000\u0000\u0000\u0419\u0414\u0001\u0000\u0000\u0000"+
		"\u041a\u009f\u0001\u0000\u0000\u0000\u041b\u041c\u0007\u0004\u0000\u0000"+
		"\u041c\u00a1\u0001\u0000\u0000\u0000\u041d\u041f\u0003\n\u0005\u0000\u041e"+
		"\u041d\u0001\u0000\u0000\u0000\u041f\u0422\u0001\u0000\u0000\u0000\u0420"+
		"\u041e\u0001\u0000\u0000\u0000\u0420\u0421\u0001\u0000\u0000\u0000\u0421"+
		"\u0426\u0001\u0000\u0000\u0000\u0422\u0420\u0001\u0000\u0000\u0000\u0423"+
		"\u0427\u0003\u000e\u0007\u0000\u0424\u0427\u0003\u001e\u000f\u0000\u0425"+
		"\u0427\u0003\u0090H\u0000\u0426\u0423\u0001\u0000\u0000\u0000\u0426\u0424"+
		"\u0001\u0000\u0000\u0000\u0426\u0425\u0001\u0000\u0000\u0000\u0427\u042a"+
		"\u0001\u0000\u0000\u0000\u0428\u042a\u0005T\u0000\u0000\u0429\u0420\u0001"+
		"\u0000\u0000\u0000\u0429\u0428\u0001\u0000\u0000\u0000\u042a\u00a3\u0001"+
		"\u0000\u0000\u0000\u042b\u049b\u0003\u009aM\u0000\u042c\u042d\u0005\u0002"+
		"\u0000\u0000\u042d\u0430\u0003\u00c4b\u0000\u042e\u042f\u0005]\u0000\u0000"+
		"\u042f\u0431\u0003\u00c4b\u0000\u0430\u042e\u0001\u0000\u0000\u0000\u0430"+
		"\u0431\u0001\u0000\u0000\u0000\u0431\u0432\u0001\u0000\u0000\u0000\u0432"+
		"\u0433\u0005T\u0000\u0000\u0433\u049b\u0001\u0000\u0000\u0000\u0434\u0435"+
		"\u0005\u0016\u0000\u0000\u0435\u0436\u0003\u00be_\u0000\u0436\u0437\u0003"+
		"\u00a4R\u0000\u0437\u0438\u0003\u00a6S\u0000\u0438\u049b\u0001\u0000\u0000"+
		"\u0000\u0439\u043a\u0005\u0015\u0000\u0000\u043a\u043b\u0005N\u0000\u0000"+
		"\u043b\u043c\u0003\u00b8\\\u0000\u043c\u043d\u0005O\u0000\u0000\u043d"+
		"\u043e\u0003\u00a4R\u0000\u043e\u049b\u0001\u0000\u0000\u0000\u043f\u0440"+
		"\u00052\u0000\u0000\u0440\u0441\u0003\u00be_\u0000\u0441\u0442\u0003\u00a4"+
		"R\u0000\u0442\u049b\u0001\u0000\u0000\u0000\u0443\u0444\u0005\r\u0000"+
		"\u0000\u0444\u0445\u0003\u00a4R\u0000\u0445\u0446\u00052\u0000\u0000\u0446"+
		"\u0447\u0003\u00be_\u0000\u0447\u0448\u0005T\u0000\u0000\u0448\u049b\u0001"+
		"\u0000\u0000\u0000\u0449\u044a\u0005/\u0000\u0000\u044a\u0454\u0003\u009a"+
		"M\u0000\u044b\u044d\u0003\u00a8T\u0000\u044c\u044b\u0001\u0000\u0000\u0000"+
		"\u044d\u044e\u0001\u0000\u0000\u0000\u044e\u044c\u0001\u0000\u0000\u0000"+
		"\u044e\u044f\u0001\u0000\u0000\u0000\u044f\u0451\u0001\u0000\u0000\u0000"+
		"\u0450\u0452\u0003\u00acV\u0000\u0451\u0450\u0001\u0000\u0000\u0000\u0451"+
		"\u0452\u0001\u0000\u0000\u0000\u0452\u0455\u0001\u0000\u0000\u0000\u0453"+
		"\u0455\u0003\u00acV\u0000\u0454\u044c\u0001\u0000\u0000\u0000\u0454\u0453"+
		"\u0001\u0000\u0000\u0000\u0455\u049b\u0001\u0000\u0000\u0000\u0456\u0457"+
		"\u0005/\u0000\u0000\u0457\u0458\u0003\u00aeW\u0000\u0458\u045c\u0003\u009a"+
		"M\u0000\u0459\u045b\u0003\u00a8T\u0000\u045a\u0459\u0001\u0000\u0000\u0000"+
		"\u045b\u045e\u0001\u0000\u0000\u0000\u045c\u045a\u0001\u0000\u0000\u0000"+
		"\u045c\u045d\u0001\u0000\u0000\u0000\u045d\u0460\u0001\u0000\u0000\u0000"+
		"\u045e\u045c\u0001\u0000\u0000\u0000\u045f\u0461\u0003\u00acV\u0000\u0460"+
		"\u045f\u0001\u0000\u0000\u0000\u0460\u0461\u0001\u0000\u0000\u0000\u0461"+
		"\u049b\u0001\u0000\u0000\u0000\u0462\u0463\u0005)\u0000\u0000\u0463\u0464"+
		"\u0003\u00be_\u0000\u0464\u0468\u0005P\u0000\u0000\u0465\u0467\u0003\u00b4"+
		"Z\u0000\u0466\u0465\u0001\u0000\u0000\u0000\u0467\u046a\u0001\u0000\u0000"+
		"\u0000\u0468\u0466\u0001\u0000\u0000\u0000\u0468\u0469\u0001\u0000\u0000"+
		"\u0000\u0469\u046e\u0001\u0000\u0000\u0000\u046a\u0468\u0001\u0000\u0000"+
		"\u0000\u046b\u046d\u0003\u00b6[\u0000\u046c\u046b\u0001\u0000\u0000\u0000"+
		"\u046d\u0470\u0001\u0000\u0000\u0000\u046e\u046c\u0001\u0000\u0000\u0000"+
		"\u046e\u046f\u0001\u0000\u0000\u0000\u046f\u0471\u0001\u0000\u0000\u0000"+
		"\u0470\u046e\u0001\u0000\u0000\u0000\u0471\u0472\u0005Q\u0000\u0000\u0472"+
		"\u049b\u0001\u0000\u0000\u0000\u0473\u0474\u0005*\u0000\u0000\u0474\u0475"+
		"\u0003\u00be_\u0000\u0475\u0476\u0003\u009aM\u0000\u0476\u049b\u0001\u0000"+
		"\u0000\u0000\u0477\u0479\u0005$\u0000\u0000\u0478\u047a\u0003\u00c4b\u0000"+
		"\u0479\u0478\u0001\u0000\u0000\u0000\u0479\u047a\u0001\u0000\u0000\u0000"+
		"\u047a\u047b\u0001\u0000\u0000\u0000\u047b\u049b\u0005T\u0000\u0000\u047c"+
		"\u047d\u0005,\u0000\u0000\u047d\u047e\u0003\u00c4b\u0000\u047e\u047f\u0005"+
		"T\u0000\u0000\u047f\u049b\u0001\u0000\u0000\u0000\u0480\u0482\u0005\u0004"+
		"\u0000\u0000\u0481\u0483\u0003\u00a0P\u0000\u0482\u0481\u0001\u0000\u0000"+
		"\u0000\u0482\u0483\u0001\u0000\u0000\u0000\u0483\u0484\u0001\u0000\u0000"+
		"\u0000\u0484\u049b\u0005T\u0000\u0000\u0485\u0487\u0005\u000b\u0000\u0000"+
		"\u0486\u0488\u0003\u00a0P\u0000\u0487\u0486\u0001\u0000\u0000\u0000\u0487"+
		"\u0488\u0001\u0000\u0000\u0000\u0488\u0489\u0001\u0000\u0000\u0000\u0489"+
		"\u049b\u0005T\u0000\u0000\u048a\u048b\u0005>\u0000\u0000\u048b\u048c\u0003"+
		"\u00c4b\u0000\u048c\u048d\u0005T\u0000\u0000\u048d\u049b\u0001\u0000\u0000"+
		"\u0000\u048e\u049b\u0005T\u0000\u0000\u048f\u0490\u0003\u00c4b\u0000\u0490"+
		"\u0491\u0005T\u0000\u0000\u0491\u049b\u0001\u0000\u0000\u0000\u0492\u0494"+
		"\u0003\u00d0h\u0000\u0493\u0495\u0005T\u0000\u0000\u0494\u0493\u0001\u0000"+
		"\u0000\u0000\u0494\u0495\u0001\u0000\u0000\u0000\u0495\u049b\u0001\u0000"+
		"\u0000\u0000\u0496\u0497\u0003\u00a0P\u0000\u0497\u0498\u0005]\u0000\u0000"+
		"\u0498\u0499\u0003\u00a4R\u0000\u0499\u049b\u0001\u0000\u0000\u0000\u049a"+
		"\u042b\u0001\u0000\u0000\u0000\u049a\u042c\u0001\u0000\u0000\u0000\u049a"+
		"\u0434\u0001\u0000\u0000\u0000\u049a\u0439\u0001\u0000\u0000\u0000\u049a"+
		"\u043f\u0001\u0000\u0000\u0000\u049a\u0443\u0001\u0000\u0000\u0000\u049a"+
		"\u0449\u0001\u0000\u0000\u0000\u049a\u0456\u0001\u0000\u0000\u0000\u049a"+
		"\u0462\u0001\u0000\u0000\u0000\u049a\u0473\u0001\u0000\u0000\u0000\u049a"+
		"\u0477\u0001\u0000\u0000\u0000\u049a\u047c\u0001\u0000\u0000\u0000\u049a"+
		"\u0480\u0001\u0000\u0000\u0000\u049a\u0485\u0001\u0000\u0000\u0000\u049a"+
		"\u048a\u0001\u0000\u0000\u0000\u049a\u048e\u0001\u0000\u0000\u0000\u049a"+
		"\u048f\u0001\u0000\u0000\u0000\u049a\u0492\u0001\u0000\u0000\u0000\u049a"+
		"\u0496\u0001\u0000\u0000\u0000\u049b\u00a5\u0001\u0000\u0000\u0000\u049c"+
		"\u049d\u0005\u000f\u0000\u0000\u049d\u049f\u0003\u00a4R\u0000\u049e\u049c"+
		"\u0001\u0000\u0000\u0000\u049e\u049f\u0001\u0000\u0000\u0000\u049f\u00a7"+
		"\u0001\u0000\u0000\u0000\u04a0\u04a1\u0005\u0007\u0000\u0000\u04a1\u04a5"+
		"\u0005N\u0000\u0000\u04a2\u04a4\u0003\f\u0006\u0000\u04a3\u04a2\u0001"+
		"\u0000\u0000\u0000\u04a4\u04a7\u0001\u0000\u0000\u0000\u04a5\u04a3\u0001"+
		"\u0000\u0000\u0000\u04a5\u04a6\u0001\u0000\u0000\u0000\u04a6\u04a8\u0001"+
		"\u0000\u0000\u0000\u04a7\u04a5\u0001\u0000\u0000\u0000\u04a8\u04a9\u0003"+
		"\u00aaU\u0000\u04a9\u04aa\u0003\u00a0P\u0000\u04aa\u04ab\u0005O\u0000"+
		"\u0000\u04ab\u04ac\u0003\u009aM\u0000\u04ac\u00a9\u0001\u0000\u0000\u0000"+
		"\u04ad\u04b2\u0003d2\u0000\u04ae\u04af\u0005k\u0000\u0000\u04af\u04b1"+
		"\u0003d2\u0000\u04b0\u04ae\u0001\u0000\u0000\u0000\u04b1\u04b4\u0001\u0000"+
		"\u0000\u0000\u04b2\u04b0\u0001\u0000\u0000\u0000\u04b2\u04b3\u0001\u0000"+
		"\u0000\u0000\u04b3\u00ab\u0001\u0000\u0000\u0000\u04b4\u04b2\u0001\u0000"+
		"\u0000\u0000\u04b5\u04b6\u0005\u0013\u0000\u0000\u04b6\u04b7\u0003\u009a"+
		"M\u0000\u04b7\u00ad\u0001\u0000\u0000\u0000\u04b8\u04b9\u0005N\u0000\u0000"+
		"\u04b9\u04bb\u0003\u00b0X\u0000\u04ba\u04bc\u0005T\u0000\u0000\u04bb\u04ba"+
		"\u0001\u0000\u0000\u0000\u04bb\u04bc\u0001\u0000\u0000\u0000\u04bc\u04bd"+
		"\u0001\u0000\u0000\u0000\u04bd\u04be\u0005O\u0000\u0000\u04be\u00af\u0001"+
		"\u0000\u0000\u0000\u04bf\u04c4\u0003\u00b2Y\u0000\u04c0\u04c1\u0005T\u0000"+
		"\u0000\u04c1\u04c3\u0003\u00b2Y\u0000\u04c2\u04c0\u0001\u0000\u0000\u0000"+
		"\u04c3\u04c6\u0001\u0000\u0000\u0000\u04c4\u04c2\u0001\u0000\u0000\u0000"+
		"\u04c4\u04c5\u0001\u0000\u0000\u0000\u04c5\u00b1\u0001\u0000\u0000\u0000"+
		"\u04c6\u04c4\u0001\u0000\u0000\u0000\u04c7\u04c9\u0003\f\u0006\u0000\u04c8"+
		"\u04c7\u0001\u0000\u0000\u0000\u04c9\u04cc\u0001\u0000\u0000\u0000\u04ca"+
		"\u04c8\u0001\u0000\u0000\u0000\u04ca\u04cb\u0001\u0000\u0000\u0000\u04cb"+
		"\u04d2\u0001\u0000\u0000\u0000\u04cc\u04ca\u0001\u0000\u0000\u0000\u04cd"+
		"\u04ce\u0003P(\u0000\u04ce\u04cf\u0003J%\u0000\u04cf\u04d3\u0001\u0000"+
		"\u0000\u0000\u04d0\u04d1\u0005=\u0000\u0000\u04d1\u04d3\u0003\u00a0P\u0000"+
		"\u04d2\u04cd\u0001\u0000\u0000\u0000\u04d2\u04d0\u0001\u0000\u0000\u0000"+
		"\u04d3\u04d4\u0001\u0000\u0000\u0000\u04d4\u04d5\u0005W\u0000\u0000\u04d5"+
		"\u04d6\u0003\u00c4b\u0000\u04d6\u04d9\u0001\u0000\u0000\u0000\u04d7\u04d9"+
		"\u0003\u00a0P\u0000\u04d8\u04ca\u0001\u0000\u0000\u0000\u04d8\u04d7\u0001"+
		"\u0000\u0000\u0000\u04d9\u00b3\u0001\u0000\u0000\u0000\u04da\u04dc\u0003"+
		"\u00b6[\u0000\u04db\u04da\u0001\u0000\u0000\u0000\u04dc\u04dd\u0001\u0000"+
		"\u0000\u0000\u04dd\u04db\u0001\u0000\u0000\u0000\u04dd\u04de\u0001\u0000"+
		"\u0000\u0000\u04de\u04e0\u0001\u0000\u0000\u0000\u04df\u04e1\u0003\u009c"+
		"N\u0000\u04e0\u04df\u0001\u0000\u0000\u0000\u04e1\u04e2\u0001\u0000\u0000"+
		"\u0000\u04e2\u04e0\u0001\u0000\u0000\u0000\u04e2\u04e3\u0001\u0000\u0000"+
		"\u0000\u04e3\u00b5\u0001\u0000\u0000\u0000\u04e4\u04ea\u0005\u0006\u0000"+
		"\u0000\u04e5\u04eb\u0003\u00c4b\u0000\u04e6\u04eb\u0005\u0080\u0000\u0000"+
		"\u04e7\u04e8\u0003\u00eew\u0000\u04e8\u04e9\u0003\u00a0P\u0000\u04e9\u04eb"+
		"\u0001\u0000\u0000\u0000\u04ea\u04e5\u0001\u0000\u0000\u0000\u04ea\u04e6"+
		"\u0001\u0000\u0000\u0000\u04ea\u04e7\u0001\u0000\u0000\u0000\u04eb\u04ec"+
		"\u0001\u0000\u0000\u0000\u04ec\u04f0\u0005]\u0000\u0000\u04ed\u04ee\u0005"+
		"\f\u0000\u0000\u04ee\u04f0\u0005]\u0000\u0000\u04ef\u04e4\u0001\u0000"+
		"\u0000\u0000\u04ef\u04ed\u0001\u0000\u0000\u0000\u04f0\u00b7\u0001\u0000"+
		"\u0000\u0000\u04f1\u04fe\u0003\u00bc^\u0000\u04f2\u04f4\u0003\u00ba]\u0000"+
		"\u04f3\u04f2\u0001\u0000\u0000\u0000\u04f3\u04f4\u0001\u0000\u0000\u0000"+
		"\u04f4\u04f5\u0001\u0000\u0000\u0000\u04f5\u04f7\u0005T\u0000\u0000\u04f6"+
		"\u04f8\u0003\u00c4b\u0000\u04f7\u04f6\u0001\u0000\u0000\u0000\u04f7\u04f8"+
		"\u0001\u0000\u0000\u0000\u04f8\u04f9\u0001\u0000\u0000\u0000\u04f9\u04fb"+
		"\u0005T\u0000\u0000\u04fa\u04fc\u0003\u00c0`\u0000\u04fb\u04fa\u0001\u0000"+
		"\u0000\u0000\u04fb\u04fc\u0001\u0000\u0000\u0000\u04fc\u04fe\u0001\u0000"+
		"\u0000\u0000\u04fd\u04f1\u0001\u0000\u0000\u0000\u04fd\u04f3\u0001\u0000"+
		"\u0000\u0000\u04fe\u00b9\u0001\u0000\u0000\u0000\u04ff\u0502\u0003\u009e"+
		"O\u0000\u0500\u0502\u0003\u00c0`\u0000\u0501\u04ff\u0001\u0000\u0000\u0000"+
		"\u0501\u0500\u0001\u0000\u0000\u0000\u0502\u00bb\u0001\u0000\u0000\u0000"+
		"\u0503\u0505\u0003\f\u0006\u0000\u0504\u0503\u0001\u0000\u0000\u0000\u0505"+
		"\u0508\u0001\u0000\u0000\u0000\u0506\u0504\u0001\u0000\u0000\u0000\u0506"+
		"\u0507\u0001\u0000\u0000\u0000\u0507\u050b\u0001\u0000\u0000\u0000\u0508"+
		"\u0506\u0001\u0000\u0000\u0000\u0509\u050c\u0003\u00eew\u0000\u050a\u050c"+
		"\u0005=\u0000\u0000\u050b\u0509\u0001\u0000\u0000\u0000\u050b\u050a\u0001"+
		"\u0000\u0000\u0000\u050c\u050d\u0001\u0000\u0000\u0000\u050d\u050e\u0003"+
		"J%\u0000\u050e\u050f\u0005]\u0000\u0000\u050f\u0510\u0003\u00c4b\u0000"+
		"\u0510\u00bd\u0001\u0000\u0000\u0000\u0511\u0512\u0005N\u0000\u0000\u0512"+
		"\u0513\u0003\u00c4b\u0000\u0513\u0514\u0005O\u0000\u0000\u0514\u00bf\u0001"+
		"\u0000\u0000\u0000\u0515\u051a\u0003\u00c4b\u0000\u0516\u0517\u0005U\u0000"+
		"\u0000\u0517\u0519\u0003\u00c4b\u0000\u0518\u0516\u0001\u0000\u0000\u0000"+
		"\u0519\u051c\u0001\u0000\u0000\u0000\u051a\u0518\u0001\u0000\u0000\u0000"+
		"\u051a\u051b\u0001\u0000\u0000\u0000\u051b\u00c1\u0001\u0000\u0000\u0000"+
		"\u051c\u051a\u0001\u0000\u0000\u0000\u051d\u051e\u0003\u00a0P\u0000\u051e"+
		"\u0520\u0005N\u0000\u0000\u051f\u0521\u0003\u00c0`\u0000\u0520\u051f\u0001"+
		"\u0000\u0000\u0000\u0520\u0521\u0001\u0000\u0000\u0000\u0521\u0522\u0001"+
		"\u0000\u0000\u0000\u0522\u0523\u0005O\u0000\u0000\u0523\u0531\u0001\u0000"+
		"\u0000\u0000\u0524\u0525\u0005+\u0000\u0000\u0525\u0527\u0005N\u0000\u0000"+
		"\u0526\u0528\u0003\u00c0`\u0000\u0527\u0526\u0001\u0000\u0000\u0000\u0527"+
		"\u0528\u0001\u0000\u0000\u0000\u0528\u0529\u0001\u0000\u0000\u0000\u0529"+
		"\u0531\u0005O\u0000\u0000\u052a\u052b\u0005(\u0000\u0000\u052b\u052d\u0005"+
		"N\u0000\u0000\u052c\u052e\u0003\u00c0`\u0000\u052d\u052c\u0001\u0000\u0000"+
		"\u0000\u052d\u052e\u0001\u0000\u0000\u0000\u052e\u052f\u0001\u0000\u0000"+
		"\u0000\u052f\u0531\u0005O\u0000\u0000\u0530\u051d\u0001\u0000\u0000\u0000"+
		"\u0530\u0524\u0001\u0000\u0000\u0000\u0530\u052a\u0001\u0000\u0000\u0000"+
		"\u0531\u00c3\u0001\u0000\u0000\u0000\u0532\u0533\u0006b\uffff\uffff\u0000"+
		"\u0533\u0560\u0003\u00ceg\u0000\u0534\u0560\u0003\u00c2a\u0000\u0535\u0536"+
		"\u0005\u001f\u0000\u0000\u0536\u0560\u0003\u00dam\u0000\u0537\u053b\u0005"+
		"N\u0000\u0000\u0538\u053a\u0003n7\u0000\u0539\u0538\u0001\u0000\u0000"+
		"\u0000\u053a\u053d\u0001\u0000\u0000\u0000\u053b\u0539\u0001\u0000\u0000"+
		"\u0000\u053b\u053c\u0001\u0000\u0000\u0000\u053c\u053e\u0001\u0000\u0000"+
		"\u0000\u053d\u053b\u0001\u0000\u0000\u0000\u053e\u0543\u0003\u00eew\u0000"+
		"\u053f\u0540\u0005j\u0000\u0000\u0540\u0542\u0003\u00eew\u0000\u0541\u053f"+
		"\u0001\u0000\u0000\u0000\u0542\u0545\u0001\u0000\u0000\u0000\u0543\u0541"+
		"\u0001\u0000\u0000\u0000\u0543\u0544\u0001\u0000\u0000\u0000\u0544\u0546"+
		"\u0001\u0000\u0000\u0000\u0545\u0543\u0001\u0000\u0000\u0000\u0546\u0547"+
		"\u0005O\u0000\u0000\u0547\u0548\u0003\u00c4b\u0016\u0548\u0560\u0001\u0000"+
		"\u0000\u0000\u0549\u054a\u0007\u0005\u0000\u0000\u054a\u0560\u0003\u00c4"+
		"b\u0014\u054b\u054c\u0007\u0006\u0000\u0000\u054c\u0560\u0003\u00c4b\u0013"+
		"\u054d\u0560\u0003\u00c8d\u0000\u054e\u0560\u0003\u00d0h\u0000\u054f\u0550"+
		"\u0003\u00eew\u0000\u0550\u0556\u0005z\u0000\u0000\u0551\u0553\u0003\u00f2"+
		"y\u0000\u0552\u0551\u0001\u0000\u0000\u0000\u0552\u0553\u0001\u0000\u0000"+
		"\u0000\u0553\u0554\u0001\u0000\u0000\u0000\u0554\u0557\u0003\u00a0P\u0000"+
		"\u0555\u0557\u0005\u001f\u0000\u0000\u0556\u0552\u0001\u0000\u0000\u0000"+
		"\u0556\u0555\u0001\u0000\u0000\u0000\u0557\u0560\u0001\u0000\u0000\u0000"+
		"\u0558\u0559\u0003\u00d8l\u0000\u0559\u055b\u0005z\u0000\u0000\u055a\u055c"+
		"\u0003\u00f2y\u0000\u055b\u055a\u0001\u0000\u0000\u0000\u055b\u055c\u0001"+
		"\u0000\u0000\u0000\u055c\u055d\u0001\u0000\u0000\u0000\u055d\u055e\u0005"+
		"\u001f\u0000\u0000\u055e\u0560\u0001\u0000\u0000\u0000\u055f\u0532\u0001"+
		"\u0000\u0000\u0000\u055f\u0534\u0001\u0000\u0000\u0000\u055f\u0535\u0001"+
		"\u0000\u0000\u0000\u055f\u0537\u0001\u0000\u0000\u0000\u055f\u0549\u0001"+
		"\u0000\u0000\u0000\u055f\u054b\u0001\u0000\u0000\u0000\u055f\u054d\u0001"+
		"\u0000\u0000\u0000\u055f\u054e\u0001\u0000\u0000\u0000\u055f\u054f\u0001"+
		"\u0000\u0000\u0000\u055f\u0558\u0001\u0000\u0000\u0000\u0560\u05b4\u0001"+
		"\u0000\u0000\u0000\u0561\u0562\n\u0012\u0000\u0000\u0562\u0563\u0007\u0007"+
		"\u0000\u0000\u0563\u05b3\u0003\u00c4b\u0013\u0564\u0565\n\u0011\u0000"+
		"\u0000\u0565\u0566\u0007\b\u0000\u0000\u0566\u05b3\u0003\u00c4b\u0012"+
		"\u0567\u056f\n\u0010\u0000\u0000\u0568\u0569\u0005Y\u0000\u0000\u0569"+
		"\u0570\u0005Y\u0000\u0000\u056a\u056b\u0005X\u0000\u0000\u056b\u056c\u0005"+
		"X\u0000\u0000\u056c\u0570\u0005X\u0000\u0000\u056d\u056e\u0005X\u0000"+
		"\u0000\u056e\u0570\u0005X\u0000\u0000\u056f\u0568\u0001\u0000\u0000\u0000"+
		"\u056f\u056a\u0001\u0000\u0000\u0000\u056f\u056d\u0001\u0000\u0000\u0000"+
		"\u0570\u0571\u0001\u0000\u0000\u0000\u0571\u05b3\u0003\u00c4b\u0011\u0572"+
		"\u0573\n\u000f\u0000\u0000\u0573\u0574\u0007\t\u0000\u0000\u0574\u05b3"+
		"\u0003\u00c4b\u0010\u0575\u0576\n\r\u0000\u0000\u0576\u0577\u0007\n\u0000"+
		"\u0000\u0577\u05b3\u0003\u00c4b\u000e\u0578\u0579\n\f\u0000\u0000\u0579"+
		"\u057a\u0005j\u0000\u0000\u057a\u05b3\u0003\u00c4b\r\u057b\u057c\n\u000b"+
		"\u0000\u0000\u057c\u057d\u0005l\u0000\u0000\u057d\u05b3\u0003\u00c4b\f"+
		"\u057e\u057f\n\n\u0000\u0000\u057f\u0580\u0005k\u0000\u0000\u0580\u05b3"+
		"\u0003\u00c4b\u000b\u0581\u0582\n\t\u0000\u0000\u0582\u0583\u0005b\u0000"+
		"\u0000\u0583\u05b3\u0003\u00c4b\n\u0584\u0585\n\b\u0000\u0000\u0585\u0586"+
		"\u0005c\u0000\u0000\u0586\u05b3\u0003\u00c4b\t\u0587\u0588\n\u0007\u0000"+
		"\u0000\u0588\u0589\u0005\\\u0000\u0000\u0589\u058a\u0003\u00c4b\u0000"+
		"\u058a\u058b\u0005]\u0000\u0000\u058b\u058c\u0003\u00c4b\u0007\u058c\u05b3"+
		"\u0001\u0000\u0000\u0000\u058d\u058e\n\u0006\u0000\u0000\u058e\u058f\u0007"+
		"\u000b\u0000\u0000\u058f\u05b3\u0003\u00c4b\u0006\u0590\u0591\n\u001a"+
		"\u0000\u0000\u0591\u059d\u0005V\u0000\u0000\u0592\u059e\u0003\u00a0P\u0000"+
		"\u0593\u059e\u0003\u00c2a\u0000\u0594\u059e\u0005+\u0000\u0000\u0595\u0597"+
		"\u0005\u001f\u0000\u0000\u0596\u0598\u0003\u00eau\u0000\u0597\u0596\u0001"+
		"\u0000\u0000\u0000\u0597\u0598\u0001\u0000\u0000\u0000\u0598\u0599\u0001"+
		"\u0000\u0000\u0000\u0599\u059e\u0003\u00deo\u0000\u059a\u059b\u0005(\u0000"+
		"\u0000\u059b\u059e\u0003\u00f4z\u0000\u059c\u059e\u0003\u00e4r\u0000\u059d"+
		"\u0592\u0001\u0000\u0000\u0000\u059d\u0593\u0001\u0000\u0000\u0000\u059d"+
		"\u0594\u0001\u0000\u0000\u0000\u059d\u0595\u0001\u0000\u0000\u0000\u059d"+
		"\u059a\u0001\u0000\u0000\u0000\u059d\u059c\u0001\u0000\u0000\u0000\u059e"+
		"\u05b3\u0001\u0000\u0000\u0000\u059f\u05a0\n\u0019\u0000\u0000\u05a0\u05a1"+
		"\u0005R\u0000\u0000\u05a1\u05a2\u0003\u00c4b\u0000\u05a2\u05a3\u0005S"+
		"\u0000\u0000\u05a3\u05b3\u0001\u0000\u0000\u0000\u05a4\u05a5\n\u0015\u0000"+
		"\u0000\u05a5\u05b3\u0007\f\u0000\u0000\u05a6\u05a7\n\u000e\u0000\u0000"+
		"\u05a7\u05aa\u0005\u001a\u0000\u0000\u05a8\u05ab\u0003\u00eew\u0000\u05a9"+
		"\u05ab\u0003\u00c6c\u0000\u05aa\u05a8\u0001\u0000\u0000\u0000\u05aa\u05a9"+
		"\u0001\u0000\u0000\u0000\u05ab\u05b3\u0001\u0000\u0000\u0000\u05ac\u05ad"+
		"\n\u0003\u0000\u0000\u05ad\u05af\u0005z\u0000\u0000\u05ae\u05b0\u0003"+
		"\u00f2y\u0000\u05af\u05ae\u0001\u0000\u0000\u0000\u05af\u05b0\u0001\u0000"+
		"\u0000\u0000\u05b0\u05b1\u0001\u0000\u0000\u0000\u05b1\u05b3\u0003\u00a0"+
		"P\u0000\u05b2\u0561\u0001\u0000\u0000\u0000\u05b2\u0564\u0001\u0000\u0000"+
		"\u0000\u05b2\u0567\u0001\u0000\u0000\u0000\u05b2\u0572\u0001\u0000\u0000"+
		"\u0000\u05b2\u0575\u0001\u0000\u0000\u0000\u05b2\u0578\u0001\u0000\u0000"+
		"\u0000\u05b2\u057b\u0001\u0000\u0000\u0000\u05b2\u057e\u0001\u0000\u0000"+
		"\u0000\u05b2\u0581\u0001\u0000\u0000\u0000\u05b2\u0584\u0001\u0000\u0000"+
		"\u0000\u05b2\u0587\u0001\u0000\u0000\u0000\u05b2\u058d\u0001\u0000\u0000"+
		"\u0000\u05b2\u0590\u0001\u0000\u0000\u0000\u05b2\u059f\u0001\u0000\u0000"+
		"\u0000\u05b2\u05a4\u0001\u0000\u0000\u0000\u05b2\u05a6\u0001\u0000\u0000"+
		"\u0000\u05b2\u05ac\u0001\u0000\u0000\u0000\u05b3\u05b6\u0001\u0000\u0000"+
		"\u0000\u05b4\u05b2\u0001\u0000\u0000\u0000\u05b4\u05b5\u0001\u0000\u0000"+
		"\u0000\u05b5\u00c5\u0001\u0000\u0000\u0000\u05b6\u05b4\u0001\u0000\u0000"+
		"\u0000\u05b7\u05b9\u0003\f\u0006\u0000\u05b8\u05b7\u0001\u0000\u0000\u0000"+
		"\u05b9\u05bc\u0001\u0000\u0000\u0000\u05ba\u05b8\u0001\u0000\u0000\u0000"+
		"\u05ba\u05bb\u0001\u0000\u0000\u0000\u05bb\u05bd\u0001\u0000\u0000\u0000"+
		"\u05bc\u05ba\u0001\u0000\u0000\u0000\u05bd\u05c1\u0003\u00eew\u0000\u05be"+
		"\u05c0\u0003n7\u0000\u05bf\u05be\u0001\u0000\u0000\u0000\u05c0\u05c3\u0001"+
		"\u0000\u0000\u0000\u05c1\u05bf\u0001\u0000\u0000\u0000\u05c1\u05c2\u0001"+
		"\u0000\u0000\u0000\u05c2\u05c4\u0001\u0000\u0000\u0000\u05c3\u05c1\u0001"+
		"\u0000\u0000\u0000\u05c4\u05c5\u0003\u00a0P\u0000\u05c5\u00c7\u0001\u0000"+
		"\u0000\u0000\u05c6\u05c7\u0003\u00cae\u0000\u05c7\u05c8\u0005y\u0000\u0000"+
		"\u05c8\u05c9\u0003\u00ccf\u0000\u05c9\u00c9\u0001\u0000\u0000\u0000\u05ca"+
		"\u05e1\u0003\u00a0P\u0000\u05cb\u05cd\u0005N\u0000\u0000\u05cc\u05ce\u0003"+
		"Z-\u0000\u05cd\u05cc\u0001\u0000\u0000\u0000\u05cd\u05ce\u0001\u0000\u0000"+
		"\u0000\u05ce\u05cf\u0001\u0000\u0000\u0000\u05cf\u05e1\u0005O\u0000\u0000"+
		"\u05d0\u05d1\u0005N\u0000\u0000\u05d1\u05d6\u0003\u00a0P\u0000\u05d2\u05d3"+
		"\u0005U\u0000\u0000\u05d3\u05d5\u0003\u00a0P\u0000\u05d4\u05d2\u0001\u0000"+
		"\u0000\u0000\u05d5\u05d8\u0001\u0000\u0000\u0000\u05d6\u05d4\u0001\u0000"+
		"\u0000\u0000\u05d6\u05d7\u0001\u0000\u0000\u0000\u05d7\u05d9\u0001\u0000"+
		"\u0000\u0000\u05d8\u05d6\u0001\u0000\u0000\u0000\u05d9\u05da\u0005O\u0000"+
		"\u0000\u05da\u05e1\u0001\u0000\u0000\u0000\u05db\u05dd\u0005N\u0000\u0000"+
		"\u05dc\u05de\u0003`0\u0000\u05dd\u05dc\u0001\u0000\u0000\u0000\u05dd\u05de"+
		"\u0001\u0000\u0000\u0000\u05de\u05df\u0001\u0000\u0000\u0000\u05df\u05e1"+
		"\u0005O\u0000\u0000\u05e0\u05ca\u0001\u0000\u0000\u0000\u05e0\u05cb\u0001"+
		"\u0000\u0000\u0000\u05e0\u05d0\u0001\u0000\u0000\u0000\u05e0\u05db\u0001"+
		"\u0000\u0000\u0000\u05e1\u00cb\u0001\u0000\u0000\u0000\u05e2\u05e5\u0003"+
		"\u00c4b\u0000\u05e3\u05e5\u0003\u009aM\u0000\u05e4\u05e2\u0001\u0000\u0000"+
		"\u0000\u05e4\u05e3\u0001\u0000\u0000\u0000\u05e5\u00cd\u0001\u0000\u0000"+
		"\u0000\u05e6\u05e7\u0005N\u0000\u0000\u05e7\u05e8\u0003\u00c4b\u0000\u05e8"+
		"\u05e9\u0005O\u0000\u0000\u05e9\u05f9\u0001\u0000\u0000\u0000\u05ea\u05f9"+
		"\u0005+\u0000\u0000\u05eb\u05f9\u0005(\u0000\u0000\u05ec\u05f9\u0003f"+
		"3\u0000\u05ed\u05f9\u0003\u00a0P\u0000\u05ee\u05ef\u0003,\u0016\u0000"+
		"\u05ef\u05f0\u0005V\u0000\u0000\u05f0\u05f1\u0005\t\u0000\u0000\u05f1"+
		"\u05f9\u0001\u0000\u0000\u0000\u05f2\u05f6\u0003\u00eau\u0000\u05f3\u05f7"+
		"\u0003\u00f6{\u0000\u05f4\u05f5\u0005+\u0000\u0000\u05f5\u05f7\u0003\u00f8"+
		"|\u0000\u05f6\u05f3\u0001\u0000\u0000\u0000\u05f6\u05f4\u0001\u0000\u0000"+
		"\u0000\u05f7\u05f9\u0001\u0000\u0000\u0000\u05f8\u05e6\u0001\u0000\u0000"+
		"\u0000\u05f8\u05ea\u0001\u0000\u0000\u0000\u05f8\u05eb\u0001\u0000\u0000"+
		"\u0000\u05f8\u05ec\u0001\u0000\u0000\u0000\u05f8\u05ed\u0001\u0000\u0000"+
		"\u0000\u05f8\u05ee\u0001\u0000\u0000\u0000\u05f8\u05f2\u0001\u0000\u0000"+
		"\u0000\u05f9\u00cf\u0001\u0000\u0000\u0000\u05fa\u05fb\u0005)\u0000\u0000"+
		"\u05fb\u05fc\u0003\u00be_\u0000\u05fc\u0600\u0005P\u0000\u0000\u05fd\u05ff"+
		"\u0003\u00d2i\u0000\u05fe\u05fd\u0001\u0000\u0000\u0000\u05ff\u0602\u0001"+
		"\u0000\u0000\u0000\u0600\u05fe\u0001\u0000\u0000\u0000\u0600\u0601\u0001"+
		"\u0000\u0000\u0000\u0601\u0603\u0001\u0000\u0000\u0000\u0602\u0600\u0001"+
		"\u0000\u0000\u0000\u0603\u0604\u0005Q\u0000\u0000\u0604\u00d1\u0001\u0000"+
		"\u0000\u0000\u0605\u0609\u0005\u0006\u0000\u0000\u0606\u060a\u0003\u00c0"+
		"`\u0000\u0607\u060a\u0005M\u0000\u0000\u0608\u060a\u0003\u00d4j\u0000"+
		"\u0609\u0606\u0001\u0000\u0000\u0000\u0609\u0607\u0001\u0000\u0000\u0000"+
		"\u0609\u0608\u0001\u0000\u0000\u0000\u060a\u060b\u0001\u0000\u0000\u0000"+
		"\u060b\u060c\u0007\r\u0000\u0000\u060c\u0611\u0003\u00d6k\u0000\u060d"+
		"\u060e\u0005\f\u0000\u0000\u060e\u060f\u0007\r\u0000\u0000\u060f\u0611"+
		"\u0003\u00d6k\u0000\u0610\u0605\u0001\u0000\u0000\u0000\u0610\u060d\u0001"+
		"\u0000\u0000\u0000\u0611\u00d3\u0001\u0000\u0000\u0000\u0612\u0613\u0006"+
		"j\uffff\uffff\u0000\u0613\u0614\u0005N\u0000\u0000\u0614\u0615\u0003\u00d4"+
		"j\u0000\u0615\u0616\u0005O\u0000\u0000\u0616\u062d\u0001\u0000\u0000\u0000"+
		"\u0617\u0619\u0003\f\u0006\u0000\u0618\u0617\u0001\u0000\u0000\u0000\u0619"+
		"\u061c\u0001\u0000\u0000\u0000\u061a\u0618\u0001\u0000\u0000\u0000\u061a"+
		"\u061b\u0001\u0000\u0000\u0000\u061b\u061d\u0001\u0000\u0000\u0000\u061c"+
		"\u061a\u0001\u0000\u0000\u0000\u061d\u0621\u0003\u00eew\u0000\u061e\u0620"+
		"\u0003n7\u0000\u061f\u061e\u0001\u0000\u0000\u0000\u0620\u0623\u0001\u0000"+
		"\u0000\u0000\u0621\u061f\u0001\u0000\u0000\u0000\u0621\u0622\u0001\u0000"+
		"\u0000\u0000\u0622\u0624\u0001\u0000\u0000\u0000\u0623\u0621\u0001\u0000"+
		"\u0000\u0000\u0624\u0629\u0003\u00a0P\u0000\u0625\u0626\u0005b\u0000\u0000"+
		"\u0626\u0628\u0003\u00c4b\u0000\u0627\u0625\u0001\u0000\u0000\u0000\u0628"+
		"\u062b\u0001\u0000\u0000\u0000\u0629\u0627\u0001\u0000\u0000\u0000\u0629"+
		"\u062a\u0001\u0000\u0000\u0000\u062a\u062d\u0001\u0000\u0000\u0000\u062b"+
		"\u0629\u0001\u0000\u0000\u0000\u062c\u0612\u0001\u0000\u0000\u0000\u062c"+
		"\u061a\u0001\u0000\u0000\u0000\u062d\u0633\u0001\u0000\u0000\u0000\u062e"+
		"\u062f\n\u0001\u0000\u0000\u062f\u0630\u0005b\u0000\u0000\u0630\u0632"+
		"\u0003\u00c4b\u0000\u0631\u062e\u0001\u0000\u0000\u0000\u0632\u0635\u0001"+
		"\u0000\u0000\u0000\u0633\u0631\u0001\u0000\u0000\u0000\u0633\u0634\u0001"+
		"\u0000\u0000\u0000\u0634\u00d5\u0001\u0000\u0000\u0000\u0635\u0633\u0001"+
		"\u0000\u0000\u0000\u0636\u063e\u0003\u009aM\u0000\u0637\u0639\u0003\u009c"+
		"N\u0000\u0638\u0637\u0001\u0000\u0000\u0000\u0639\u063c\u0001\u0000\u0000"+
		"\u0000\u063a\u0638\u0001\u0000\u0000\u0000\u063a\u063b\u0001\u0000\u0000"+
		"\u0000\u063b\u063e\u0001\u0000\u0000\u0000\u063c\u063a\u0001\u0000\u0000"+
		"\u0000\u063d\u0636\u0001\u0000\u0000\u0000\u063d\u063a\u0001\u0000\u0000"+
		"\u0000\u063e\u00d7\u0001\u0000\u0000\u0000\u063f\u0640\u0003P(\u0000\u0640"+
		"\u0641\u0005V\u0000\u0000\u0641\u0643\u0001\u0000\u0000\u0000\u0642\u063f"+
		"\u0001\u0000\u0000\u0000\u0642\u0643\u0001\u0000\u0000\u0000\u0643\u0647"+
		"\u0001\u0000\u0000\u0000\u0644\u0646\u0003n7\u0000\u0645\u0644\u0001\u0000"+
		"\u0000\u0000\u0646\u0649\u0001\u0000\u0000\u0000\u0647\u0645\u0001\u0000"+
		"\u0000\u0000\u0647\u0648\u0001\u0000\u0000\u0000\u0648\u064a\u0001\u0000"+
		"\u0000\u0000\u0649\u0647\u0001\u0000\u0000\u0000\u064a\u064c\u0003\u00a0"+
		"P\u0000\u064b\u064d\u0003\u00f2y\u0000\u064c\u064b\u0001\u0000\u0000\u0000"+
		"\u064c\u064d\u0001\u0000\u0000\u0000\u064d\u00d9\u0001\u0000\u0000\u0000"+
		"\u064e\u064f\u0003\u00eau\u0000\u064f\u0650\u0003\u00dcn\u0000\u0650\u0651"+
		"\u0003\u00e2q\u0000\u0651\u0658\u0001\u0000\u0000\u0000\u0652\u0655\u0003"+
		"\u00dcn\u0000\u0653\u0656\u0003\u00e0p\u0000\u0654\u0656\u0003\u00e2q"+
		"\u0000\u0655\u0653\u0001\u0000\u0000\u0000\u0655\u0654\u0001\u0000\u0000"+
		"\u0000\u0656\u0658\u0001\u0000\u0000\u0000\u0657\u064e\u0001\u0000\u0000"+
		"\u0000\u0657\u0652\u0001\u0000\u0000\u0000\u0658\u00db\u0001\u0000\u0000"+
		"\u0000\u0659\u065b\u0003\u00a0P\u0000\u065a\u065c\u0003\u00e6s\u0000\u065b"+
		"\u065a\u0001\u0000\u0000\u0000\u065b\u065c\u0001\u0000\u0000\u0000\u065c"+
		"\u0664\u0001\u0000\u0000\u0000\u065d\u065e\u0005V\u0000\u0000\u065e\u0660"+
		"\u0003\u00a0P\u0000\u065f\u0661\u0003\u00e6s\u0000\u0660\u065f\u0001\u0000"+
		"\u0000\u0000\u0660\u0661\u0001\u0000\u0000\u0000\u0661\u0663\u0001\u0000"+
		"\u0000\u0000\u0662\u065d\u0001\u0000\u0000\u0000\u0663\u0666\u0001\u0000"+
		"\u0000\u0000\u0664\u0662\u0001\u0000\u0000\u0000\u0664\u0665\u0001\u0000"+
		"\u0000\u0000\u0665\u0669\u0001\u0000\u0000\u0000\u0666\u0664\u0001\u0000"+
		"\u0000\u0000\u0667\u0669\u0003\u00f0x\u0000\u0668\u0659\u0001\u0000\u0000"+
		"\u0000\u0668\u0667\u0001\u0000\u0000\u0000\u0669\u00dd\u0001\u0000\u0000"+
		"\u0000\u066a\u066c\u0003\u00a0P\u0000\u066b\u066d\u0003\u00e8t\u0000\u066c"+
		"\u066b\u0001\u0000\u0000\u0000\u066c\u066d\u0001\u0000\u0000\u0000\u066d"+
		"\u066e\u0001\u0000\u0000\u0000\u066e\u066f\u0003\u00e2q\u0000\u066f\u00df"+
		"\u0001\u0000\u0000\u0000\u0670\u068c\u0005R\u0000\u0000\u0671\u0676\u0005"+
		"S\u0000\u0000\u0672\u0673\u0005R\u0000\u0000\u0673\u0675\u0005S\u0000"+
		"\u0000\u0674\u0672\u0001\u0000\u0000\u0000\u0675\u0678\u0001\u0000\u0000"+
		"\u0000\u0676\u0674\u0001\u0000\u0000\u0000\u0676\u0677\u0001\u0000\u0000"+
		"\u0000\u0677\u0679\u0001\u0000\u0000\u0000\u0678\u0676\u0001\u0000\u0000"+
		"\u0000\u0679\u068d\u0003N\'\u0000\u067a\u067b\u0003\u00c4b\u0000\u067b"+
		"\u0682\u0005S\u0000\u0000\u067c\u067d\u0005R\u0000\u0000\u067d\u067e\u0003"+
		"\u00c4b\u0000\u067e\u067f\u0005S\u0000\u0000\u067f\u0681\u0001\u0000\u0000"+
		"\u0000\u0680\u067c\u0001\u0000\u0000\u0000\u0681\u0684\u0001\u0000\u0000"+
		"\u0000\u0682\u0680\u0001\u0000\u0000\u0000\u0682\u0683\u0001\u0000\u0000"+
		"\u0000\u0683\u0689\u0001\u0000\u0000\u0000\u0684\u0682\u0001\u0000\u0000"+
		"\u0000\u0685\u0686\u0005R\u0000\u0000\u0686\u0688\u0005S\u0000\u0000\u0687"+
		"\u0685\u0001\u0000\u0000\u0000\u0688\u068b\u0001\u0000\u0000\u0000\u0689"+
		"\u0687\u0001\u0000\u0000\u0000\u0689\u068a\u0001\u0000\u0000\u0000\u068a"+
		"\u068d\u0001\u0000\u0000\u0000\u068b\u0689\u0001\u0000\u0000\u0000\u068c"+
		"\u0671\u0001\u0000\u0000\u0000\u068c\u067a\u0001\u0000\u0000\u0000\u068d"+
		"\u00e1\u0001\u0000\u0000\u0000\u068e\u0690\u0003\u00f8|\u0000\u068f\u0691"+
		"\u0003 \u0010\u0000\u0690\u068f\u0001\u0000\u0000\u0000\u0690\u0691\u0001"+
		"\u0000\u0000\u0000\u0691\u00e3\u0001\u0000\u0000\u0000\u0692\u0693\u0003"+
		"\u00eau\u0000\u0693\u0694\u0003\u00f6{\u0000\u0694\u00e5\u0001\u0000\u0000"+
		"\u0000\u0695\u0696\u0005Y\u0000\u0000\u0696\u0699\u0005X\u0000\u0000\u0697"+
		"\u0699\u0003\u00f2y\u0000\u0698\u0695\u0001\u0000\u0000\u0000\u0698\u0697"+
		"\u0001\u0000\u0000\u0000\u0699\u00e7\u0001\u0000\u0000\u0000\u069a\u069b"+
		"\u0005Y\u0000\u0000\u069b\u069e\u0005X\u0000\u0000\u069c\u069e\u0003\u00ea"+
		"u\u0000\u069d\u069a\u0001\u0000\u0000\u0000\u069d\u069c\u0001\u0000\u0000"+
		"\u0000\u069e\u00e9\u0001\u0000\u0000\u0000\u069f\u06a0\u0005Y\u0000\u0000"+
		"\u06a0\u06a1\u0003\u00ecv\u0000\u06a1\u06a2\u0005X\u0000\u0000\u06a2\u00eb"+
		"\u0001\u0000\u0000\u0000\u06a3\u06a8\u0003\u00eew\u0000\u06a4\u06a5\u0005"+
		"U\u0000\u0000\u06a5\u06a7\u0003\u00eew\u0000\u06a6\u06a4\u0001\u0000\u0000"+
		"\u0000\u06a7\u06aa\u0001\u0000\u0000\u0000\u06a8\u06a6\u0001\u0000\u0000"+
		"\u0000\u06a8\u06a9\u0001\u0000\u0000\u0000\u06a9\u00ed\u0001\u0000\u0000"+
		"\u0000\u06aa\u06a8\u0001\u0000\u0000\u0000\u06ab\u06ad\u0003n7\u0000\u06ac"+
		"\u06ab\u0001\u0000\u0000\u0000\u06ad\u06b0\u0001\u0000\u0000\u0000\u06ae"+
		"\u06ac\u0001\u0000\u0000\u0000\u06ae\u06af\u0001\u0000\u0000\u0000\u06af"+
		"\u06b3\u0001\u0000\u0000\u0000\u06b0\u06ae\u0001\u0000\u0000\u0000\u06b1"+
		"\u06b4\u0003P(\u0000\u06b2\u06b4\u0003\u00f0x\u0000\u06b3\u06b1\u0001"+
		"\u0000\u0000\u0000\u06b3\u06b2\u0001\u0000\u0000\u0000\u06b4\u06bf\u0001"+
		"\u0000\u0000\u0000\u06b5\u06b7\u0003n7\u0000\u06b6\u06b5\u0001\u0000\u0000"+
		"\u0000\u06b7\u06ba\u0001\u0000\u0000\u0000\u06b8\u06b6\u0001\u0000\u0000"+
		"\u0000\u06b8\u06b9\u0001\u0000\u0000\u0000\u06b9\u06bb\u0001\u0000\u0000"+
		"\u0000\u06ba\u06b8\u0001\u0000\u0000\u0000\u06bb\u06bc\u0005R\u0000\u0000"+
		"\u06bc\u06be\u0005S\u0000\u0000\u06bd\u06b8\u0001\u0000\u0000\u0000\u06be"+
		"\u06c1\u0001\u0000\u0000\u0000\u06bf\u06bd\u0001\u0000\u0000\u0000\u06bf"+
		"\u06c0\u0001\u0000\u0000\u0000\u06c0\u00ef\u0001\u0000\u0000\u0000\u06c1"+
		"\u06bf\u0001\u0000\u0000\u0000\u06c2\u06c3\u0007\u000e\u0000\u0000\u06c3"+
		"\u00f1\u0001\u0000\u0000\u0000\u06c4\u06c5\u0005Y\u0000\u0000\u06c5\u06ca"+
		"\u0003R)\u0000\u06c6\u06c7\u0005U\u0000\u0000\u06c7\u06c9\u0003R)\u0000"+
		"\u06c8\u06c6\u0001\u0000\u0000\u0000\u06c9\u06cc\u0001\u0000\u0000\u0000"+
		"\u06ca\u06c8\u0001\u0000\u0000\u0000\u06ca\u06cb\u0001\u0000\u0000\u0000"+
		"\u06cb\u06cd\u0001\u0000\u0000\u0000\u06cc\u06ca\u0001\u0000\u0000\u0000"+
		"\u06cd\u06ce\u0005X\u0000\u0000\u06ce\u00f3\u0001\u0000\u0000\u0000\u06cf"+
		"\u06d9\u0003\u00f8|\u0000\u06d0\u06d2\u0005V\u0000\u0000\u06d1\u06d3\u0003"+
		"\u00f2y\u0000\u06d2\u06d1\u0001\u0000\u0000\u0000\u06d2\u06d3\u0001\u0000"+
		"\u0000\u0000\u06d3\u06d4\u0001\u0000\u0000\u0000\u06d4\u06d6\u0003\u00a0"+
		"P\u0000\u06d5\u06d7\u0003\u00f8|\u0000\u06d6\u06d5\u0001\u0000\u0000\u0000"+
		"\u06d6\u06d7\u0001\u0000\u0000\u0000\u06d7\u06d9\u0001\u0000\u0000\u0000"+
		"\u06d8\u06cf\u0001\u0000\u0000\u0000\u06d8\u06d0\u0001\u0000\u0000\u0000"+
		"\u06d9\u00f5\u0001\u0000\u0000\u0000\u06da\u06db\u0005(\u0000\u0000\u06db"+
		"\u06e0\u0003\u00f4z\u0000\u06dc\u06dd\u0003\u00a0P\u0000\u06dd\u06de\u0003"+
		"\u00f8|\u0000\u06de\u06e0\u0001\u0000\u0000\u0000\u06df\u06da\u0001\u0000"+
		"\u0000\u0000\u06df\u06dc\u0001\u0000\u0000\u0000\u06e0\u00f7\u0001\u0000"+
		"\u0000\u0000\u06e1\u06e3\u0005N\u0000\u0000\u06e2\u06e4\u0003\u00c0`\u0000"+
		"\u06e3\u06e2\u0001\u0000\u0000\u0000\u06e3\u06e4\u0001\u0000\u0000\u0000"+
		"\u06e4\u06e5\u0001\u0000\u0000\u0000\u06e5\u06e6\u0005O\u0000\u0000\u06e6"+
		"\u00f9\u0001\u0000\u0000\u0000\u00dc\u00fb\u0100\u0106\u010c\u0111\u011a"+
		"\u011f\u0126\u012e\u0131\u0138\u0144\u0148\u014d\u0151\u0155\u0159\u0163"+
		"\u016b\u0173\u0177\u017e\u0185\u0189\u018c\u018f\u0198\u019e\u01a3\u01a6"+
		"\u01ac\u01b2\u01b6\u01ba\u01c2\u01cb\u01d2\u01d8\u01dc\u01e8\u01f1\u01f6"+
		"\u01fc\u0200\u020c\u0217\u021c\u0226\u022e\u0238\u0241\u024c\u0251\u025a"+
		"\u0264\u0269\u0272\u0278\u027f\u0284\u028c\u0290\u0292\u0298\u029d\u02a1"+
		"\u02a8\u02ae\u02b0\u02b7\u02bc\u02c1\u02c4\u02c6\u02d0\u02da\u02df\u02e2"+
		"\u02e7\u02f0\u02f7\u0302\u0308\u0313\u031d\u0328\u0331\u0336\u0339\u0340"+
		"\u034a\u0352\u0355\u0358\u0365\u036d\u0372\u037a\u037e\u0382\u0386\u038a"+
		"\u038c\u0390\u0396\u039e\u03a8\u03b1\u03bb\u03c3\u03d1\u03d8\u03dd\u03e3"+
		"\u03ec\u03f6\u03ff\u0409\u040e\u0419\u0420\u0426\u0429\u0430\u044e\u0451"+
		"\u0454\u045c\u0460\u0468\u046e\u0479\u0482\u0487\u0494\u049a\u049e\u04a5"+
		"\u04b2\u04bb\u04c4\u04ca\u04d2\u04d8\u04dd\u04e2\u04ea\u04ef\u04f3\u04f7"+
		"\u04fb\u04fd\u0501\u0506\u050b\u051a\u0520\u0527\u052d\u0530\u053b\u0543"+
		"\u0552\u0556\u055b\u055f\u056f\u0597\u059d\u05aa\u05af\u05b2\u05b4\u05ba"+
		"\u05c1\u05cd\u05d6\u05dd\u05e0\u05e4\u05f6\u05f8\u0600\u0609\u0610\u061a"+
		"\u0621\u0629\u062c\u0633\u063a\u063d\u0642\u0647\u064c\u0655\u0657\u065b"+
		"\u0660\u0664\u0668\u066c\u0676\u0682\u0689\u068c\u0690\u0698\u069d\u06a8"+
		"\u06ae\u06b3\u06b8\u06bf\u06ca\u06d2\u06d6\u06d8\u06df\u06e3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}