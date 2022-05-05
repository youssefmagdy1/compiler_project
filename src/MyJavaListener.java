import org.antlr.v4.runtime.*;


public class MyJavaListener extends JavaParserBaseListener{
    TokenStreamRewriter rewriter;
    TokenStreamRewriter rewriter2;
    String block, alter;
    String[] blocks = {"for", "if", "while", "do", "try", "switch", "else",
                    "finally", "catch", "method" , "case" ,"preExpression" ,
                    "GpreExpression"};
    int ifblockindex = 0;
    int elseblockindex = 0;
    int doblockindex = 0;
    int forblockindex = 0;
    int whileblockindex = 0;
    int catchblockindex = 0;
    int switchblockindex = 0;
    int tryblockindex = 0;
    int finallyblockindex = 0;
    int methodblockindex = 0;
    int caseblockindex = 0;
    int preExpressionindex = 0;
    int gPreExpressionindex = 0;
    String booleanOperation = "" ;

      /***********************************************************************
     * fn MyListenerParser(JavaParser parser)
     * The Consturtor of the class
     *  rewriter is used to rewrite the tokens => Java injections 
     * rewriter2 is used to rewrite the tokens => HTML Tages injections
     * This initializes the parser while making a JavaParser instance
     * @param tokens TokenStream
     *************************************************************************/
    public MyJavaListener(TokenStream tokens){
        rewriter = new TokenStreamRewriter(tokens); // 
        rewriter2 =  new TokenStreamRewriter(tokens) ; //
    }

    /**
	 * {@inheritDoc}
	 *
	 * <p>GETTER for the second rewriter </p>
     * 
	 */
    public TokenStreamRewriter getRewriter2(){
        return  rewriter2 ;
    }


    /**
     * {@inheritDoc}
     *
     * <p> insert package needed /p>
     * @param ctx StatementContext
     *
     */
    @Override
    public void enterTypeDeclaration(JavaParser.TypeDeclarationContext ctx) {
        // insert package need to be used before declare any class
        String str = " \n import java.util.HashSet; //  HashSet class \n " ;
        rewriter.insertBefore(ctx.start ,str  );

        super.enterTypeDeclaration(ctx);
    }

    /**
     * {@inheritDoc}
     *
     * <p> define hashset for each block /p>
     * @param ctx StatementContext
     *
     */
    @Override
    public void enterClassBody(JavaParser.ClassBodyContext ctx) {
        String str = "\n";
        for(String block : blocks) {
            str += "static HashSet<Integer> __"+ block
                    +" = new HashSet<Integer>(); \n" ;
        }
        rewriter.insertAfter( ctx.LBRACE().getSymbol(), str );
        super.enterClassBody(ctx);
    }

    /**
     * {@inheritDoc}
     *
     * <p>INSERT the breakpoint after the token </p>
     * @param t Token
     * @param blockName String
     * @param blockIndex int
     *
     */
    public void addBreakPoint ( Token t,  String blockName, int blockIndex)
    {
        String addedString = constructBreakPoint(blockName , blockIndex);
        rewriter.insertAfter(t  ,addedString );
    }

    /**
     * {@inheritDoc}
     *
     * <p>RETURN string of break point should be placed </p>
     * @param blockName String
     * @param blockIndex int
     *
     */
    public void addBreakPoint ( Token t,  String blockName, int blockIndex,
                                String next  )
    {
        String addedString = constructBreakPoint(blockName , blockIndex);
        addedString += next ;
        rewriter.insertAfter(t  ,addedString );
    }


    /**
     * {@inheritDoc}
     *
     * <p>RETURN string of break point should be placed </p>
     * @param blockName String
     * @param blockIndex int
     *
     */
    private String constructBreakPoint (String blockName, int blockIndex )
    {
        block = String.format("\""+blockName+"_%d\"", blockIndex);
        String addedString = String.format(
                "\nif(! __" +blockName+ ".contains(%d)){" ,blockIndex ) ;
        addedString += "System.out.println("+block+");" ;
        addedString += String.format("__"+blockName+".add(%d);}", blockIndex );

        return  addedString ;
    }

    /**
     * {@inheritDoc}
     *
     * <p>HANDLING FOR ENTRING IF STATEMENT</p>
     * @param ctx CatchClauseContext
     *
     */
    @Override
    public void enterIf_s(JavaParser.If_sContext ctx) {

        //        bouns part
        String parEx =  parExpression(ctx.parExpression().expression()) ;
        checkParExpression(parEx , ctx.start  );
        preInserter(ctx.start , ctx.parExpression().stop,  "preExpression_" ,
                preExpressionindex);
        preExpressionindex ++ ; gPreExpressionindex ++ ;


        if(ctx.getChild(2).getText().charAt(0) =='{') {
            addBreakPoint(ctx.ifS.getStart(), "if" , ifblockindex );
        }else{
            rewriter.insertBefore(ctx.ifS.getStart(), '{');
            addBreakPoint(ctx.ifS.getStop(), "if" , ifblockindex,"}\n");
        }
        preInserter(ctx , "IF_", ifblockindex);
        ifblockindex++;



        super.enterIf_s(ctx);
    }

    /**
     * {@inheritDoc}
     *
     * <p>helper method to check par expression  </p>
     * @param leftChild string
     * @param t Token
     */
    private void checkParExpression(String leftChild , Token t ) {
        String addString ="" , bp = "";
        if(!booleanOperation.equals("")) {
            // check for orange part
            addString = "if(" + leftChild + "){";
            bp = constructBreakPoint("preExpression", preExpressionindex);
            addString += bp + "}";

            // check for green part
            addString += "else { "; // here should add else
            bp = constructBreakPoint("GpreExpression", gPreExpressionindex-1);
            addString += bp + "}" ;

        }
        else {
            bp = constructBreakPoint("GpreExpression", gPreExpressionindex-1);
            addString += bp ;
        }
        rewriter.insertBefore(t, addString);

    }


    /**
     * {@inheritDoc}
     *
     * <p>HANDLING FOR ENTRING ELSE STATEMENT</p>
     * @param ctx CatchClauseContext
     *
     */
    @Override
    public void enterElseStatement(JavaParser.ElseStatementContext ctx) {

        if(ctx.getChildCount()>0){
//            if(!ctx.elseS.getStart().getText().equals("if")){
                if(ctx.getChild(1).getText().charAt(0) =='{') {
                    addBreakPoint(ctx.elseS.getStart(), "else" ,
                            elseblockindex );
                }
                else{
                    rewriter.insertAfter(ctx.ELSE().getSymbol(), '{');
                    addBreakPoint(ctx.elseS.getStop(), "else" , elseblockindex,
                            "}\n");
                }
//            }
            preInserter(ctx.elseS, "ELSE_", elseblockindex);
            elseblockindex++;
        }

        super.enterElseStatement(ctx);
    }

    /**
     * {@inheritDoc}
     *
     * <p>HANDLING FOR ENTRING FOR STATEMENT</p>
     * @param ctx CatchClauseContext
     *
     */
    @Override
    public void enterFor_s(JavaParser.For_sContext ctx) {

        // bouns
        String parEx =  parExpression(ctx.forControl().expression()) ;
        checkParExpression(parEx , ctx.start  );
        preInserter(ctx.start , ctx.forControl().stop,  "preExpression_" ,
                preExpressionindex);
        preExpressionindex ++ ;gPreExpressionindex ++ ;


        if(ctx.getChild(4).getText().charAt(0) =='{') {
            addBreakPoint(ctx.forS.getStart(), "for" , forblockindex );
        }else{
            rewriter.insertBefore(ctx.forS.getStart(), '{');
            addBreakPoint(ctx.forS.getStop(), "for" , forblockindex,"}\n");
        }
        preInserter(ctx.forS, "FOR_", forblockindex);
        forblockindex++;

        super.enterFor_s(ctx);
    }

    /**
     * {@inheritDoc}
     *
     * <p>HANDLING FOR ENTRING WHILE STATEMENT</p>
     * @param ctx CatchClauseContext
     *
     */
    @Override
    public void enterWhile_s(JavaParser.While_sContext ctx) {

        // bouns part
        String parEx =  parExpression(ctx.parExpression().expression()) ;
        checkParExpression(parEx , ctx.start  );
        preInserter(ctx.start , ctx.parExpression().stop,  "preExpression_" ,
                preExpressionindex);
        preExpressionindex ++ ;gPreExpressionindex ++ ;

        if(ctx.getChild(2).getText().charAt(0) =='{') {
            addBreakPoint(ctx.whileS.getStart(), "while" , whileblockindex );
        }else{
            rewriter.insertBefore(ctx.whileS.getStart(), '{');
            addBreakPoint(ctx.whileS.getStop(), "for" , forblockindex,"}\n");

        }
        preInserter(ctx.whileS, "WHILE_", whileblockindex);
        whileblockindex++;

        super.enterWhile_s(ctx);
    }

    /**
     * {@inheritDoc}
     *
     * <p>HANDLING FOR ENTRING TRY STATEMENT</p>
     * @param ctx CatchClauseContext
     *
     */
    @Override
    public void enterTry_1_s(JavaParser.Try_1_sContext ctx) {
        addBreakPoint(ctx.tryB.start , "try" , tryblockindex);
        preInserter(ctx.tryB, "TRY_", tryblockindex);
        tryblockindex++;
        super.enterTry_1_s(ctx);
    }

    /**
     * {@inheritDoc}
     *
     * <p>HANDLING FOR ENTRING TRY STATEMENT</p>
     * @param ctx CatchClauseContext
     *
     */
    @Override
    public void enterTry_2_s(JavaParser.Try_2_sContext ctx) {
        addBreakPoint(ctx.tryB.start , "try" , tryblockindex);
        preInserter(ctx.tryB, "TRY_", tryblockindex);
        tryblockindex++;
        super.enterTry_2_s(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>HANDLING FOR ENTRING SWITCH STATEMENT</p>
     * @param ctx CatchClauseContext
     *
     */

    @Override
    public void enterSwitchLabel(JavaParser.SwitchLabelContext ctx) {
        addBreakPoint(ctx.stop , "case" , caseblockindex);
        preInserter(ctx.getParent(), "case_", caseblockindex);
        rewriter.insertAfter(ctx.stop, alter);
        caseblockindex++;

        super.enterSwitchLabel(ctx);
    }

    /**
     * {@inheritDoc}
     *
     * <p>HANDLING FOR ENTRING DO STATEMENT</p>
     * @param ctx CatchClauseContext
     *
     */
    @Override
    public void enterDo_s(JavaParser.Do_sContext ctx) {

        if(ctx.getChild(1).getText().charAt(0) =='{') {
            addBreakPoint(ctx.doS.getStart(), "do" , doblockindex );
        }else{
            rewriter.insertAfter(ctx.getStart(), '{');
            addBreakPoint(ctx.doS.getStop(), "do" , doblockindex,"}\n");
        }
        preInserter(ctx.doS, "DO_", doblockindex);
        doblockindex++;
        super.enterDo_s(ctx);
    }

    /**
     * {@inheritDoc}
     *
     * <p>HANDLING FOR ENTRING FINALLY STATEMENT</p>
     * @param ctx FinallyBlockContext
     *
     */
    @Override
    public void enterFinallyBlock(JavaParser.FinallyBlockContext ctx) {
        addBreakPoint(ctx.block().getStart() , "finally" ,finallyblockindex );
        preInserter(ctx, "FINALLY_", finallyblockindex);
        finallyblockindex++;
        super.enterFinallyBlock(ctx);
    }

    /**
     * {@inheritDoc}
     *
     * <p>HANDLING FOR ENTRING CATCH STATEMENT</p>
     * @param ctx CatchClauseContext
     *
     */
    @Override
    public void enterCatchClause(JavaParser.CatchClauseContext ctx) {
        addBreakPoint(ctx.catchB.getStart() , "catch" ,catchblockindex );
        preInserter(ctx, "CATCH_", catchblockindex);
        catchblockindex++;
        super.enterCatchClause(ctx);
    }

    /**
     * {@inheritDoc}
     *
     * <p>HANDLING FOR ENTRING METHOD BODY</p>
     * @param ctx CatchClauseContext
     *
     */
    @Override
    public void enterMethodBody(JavaParser.MethodBodyContext ctx) {
        addBreakPoint(ctx.block().getStart(), "method" ,methodblockindex );
        preInserter(ctx.getParent().getParent().getParent(), "METHOD_",
                methodblockindex);
        methodblockindex++;

        super.enterMethodBody(ctx);
    }

     /**
	 * {@inheritDoc}
	 *
	 * <p>helper method to inster the HTML tag PRE before every statment</p>
     * @param ctx ParserRuleContext
     * @param s String
     * @param index int
     *
	 */
    void preInserter(ParserRuleContext ctx, String s, int index){
        String html_div =" <pre id='"+s+index+"'>";
        rewriter2.insertBefore(ctx.start ,html_div);

        rewriter2.insertAfter(ctx.stop, "</pre>");
    }

    /**
     * {@inheritDoc}
     *
     * <p>helper method to inster the HTML tag PRE before every statment</p>
     * @param end Token
     * @param start Token
     * @param s String
     * @param index int
     *
     */
    void preInserter(Token start,Token end ,  String s, int index){
        String html_div =" <span id='"+s+index+"'>";
        rewriter2.insertBefore(start,html_div);

        rewriter2.insertAfter(end, "</span>");
    }

    /**
     * {@inheritDoc}
     *
     * <p>helper method to check the par expression rule  : return the left
     *    child to check at, if there is not boolean operation will return true
     * </p>
     * @param ctx ParserRuleContext
     *
     */
    private String parExpression (JavaParser.ExpressionContext ctx) {
        // check if there is a boolean operation
        try {
            if (ctx.bop != null) {
                String bop = ctx.bop.getText();
                if (bop.equals("||") || bop.equals("&&")) {
                    booleanOperation = bop;
                    return ctx.getChild(0).getText(); // left child
                }
            }
        }catch (Exception e ) {

        }
        booleanOperation = "" ;
        return "" ;
    }

}
