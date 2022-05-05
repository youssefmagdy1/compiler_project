import org.antlr.v4.runtime.*;


public class MyJavaListener extends JavaParserBaseListener{
    TokenStreamRewriter rewriter;
    TokenStreamRewriter rewriter2;
    String block, alter;
    String[] blocks = {"for", "if", "while", "do", "try", "switch", "else",
                        "finally", "catch", "method"} ;
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

      /***************************************************************************//**
     * fn MyListenerParser(JavaParser parser)
     * The Consturtor of the class
     *  rewriter is used to rewrite the tokens => Java injections 
     * rewriter2 is used to rewrite the tokens => HTML Tages injections
     * This initializes the parser while making a JavaParser instance
     * @param tokens TokenStream
     ******************************************************************************/
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
        String str = " \n import java.util.HashSet; // Import the HashSet class \n " ;
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

        if(ctx.getChild(2).getText().charAt(0) =='{') {
            addBreakPoint(ctx.ifS.getStart(), "if" , ifblockindex );
        }else{
            rewriter.insertBefore(ctx.ifS.getStart(), '{');
            addBreakPoint(ctx.ifS.getStop(), "if" , ifblockindex,"}\n");
        }

//        if(ctx.getParent())
        preInserter(ctx.ifS , "IF_", ifblockindex);
        ifblockindex++;

        super.enterIf_s(ctx);
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
            if(!ctx.elseS.getStart().getText().equals("if")){
                if(ctx.getChild(1).getText().charAt(0) =='{') {
                    addBreakPoint(ctx.elseS.getStart(), "else" , elseblockindex );
                }
                else{
                    rewriter.insertAfter(ctx.ELSE().getSymbol(), '{');
                    addBreakPoint(ctx.elseS.getStop(), "else" , elseblockindex,"}\n");
                }
            }
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

    // TODO :  switch
//    @Override
//    public void enterSwitch_s(JavaParser.Switch_sContext ctx) {
//        block = String.format("\"SWITCH_%d\"", switchblockindex);
//        alter = "\n\t\tSystem.out.println("+block+");";
//        rewriter.insertBefore(ctx.getStop(), alter);
//        preInserter(ctx, "SWITCH_", switchblockindex);
//        switchblockindex++;
//        super.enterSwitch_s(ctx);
//    }

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
        preInserter(ctx.getParent().getParent().getParent(), "METHOD_", methodblockindex);
        methodblockindex++;

        super.enterMethodBody(ctx);
    }

    //    /**
//	 * {@inheritDoc}
//	 *
//	 * <p>HANDLING FOR ENTRING each statment : IF WHILE DO IF SWITCH TRY</p>
//     * @param ctx StatementContext
//     *
//	 */
//    @Override
//    public void enterStatement(JavaParser.StatementContext ctx) {
//        switch (ctx.start.getText()){
//            case "while":
//                block = String.format("\"WHILE_%d\"", whileblockindex);
//                alter = "\n\t\tSystem.out.println("+block+");";
//
//                // solve repeating problem
//                // first if check that it is not with
//
//                if(ctx.getChild(2).getText().charAt(0) =='{') {
//                    rewriter.insertAfter(ctx.whileS.getStart(), alter);
//                }else{
//                    rewriter.insertBefore(ctx.whileS.getStart(), '{');
//                    rewriter.insertAfter(ctx.whileS.getStop(), alter+"\n\t\t}");
//                }
//                preInserter(ctx, "WHILE_", whileblockindex);
//                whileblockindex++;
//                break;
//            case "for":
//                block = String.format("\"FOR_%d\"", forblockindex);
//                alter = "\n\t\tSystem.out.println("+block+");";
//
//                // solve repeating problem
//                String _s0 = String.format("FOR_%d", forblockindex);
//                String _s1 = "boolean " + _s0 + " = false ; \n" ;
//                alter  = "if(!" + _s0 + "){" + alter + "\n" +_s0  + "= true ;}";
//                rewriter.insertBefore(ctx.getStart() , _s1);
//
//                if(ctx.getChild(4).getText().charAt(0) =='{') {
//                    rewriter.insertAfter(ctx.forS.getStart(), alter);
//                }else{
//                    rewriter.insertBefore(ctx.forS.getStart(), '{');
//                    rewriter.insertAfter(ctx.forS.getStop(), alter+"\n\t\t}");
//                }
//                preInserter(ctx, "FOR_", forblockindex);
//                forblockindex++;
//                break;
//            case "do":
//                block = String.format("\"DO_%d\"", doblockindex);
//                alter = "\n\t\tSystem.out.println("+block+");";
//                if(ctx.getChild(1).getText().charAt(0) =='{') {
//                    rewriter.insertAfter(ctx.doS.getStart(), alter);
//                }else{
//                    rewriter.insertAfter(ctx.getStart(), '{');
//                    rewriter.insertAfter(ctx.doS.getStop(), alter+"\n\t\t}");
//                }
//                preInserter(ctx, "DO_", doblockindex);
//                doblockindex++;
//                break;
//            case "if":
//                block = String.format("\"IF_%d\"", ifblockindex);
//                alter = "\n\t\tSystem.out.println("+block+");";
//                if(ctx.getChild(2).getText().charAt(0) =='{') {
//                    rewriter.insertAfter(ctx.ifS.getStart(), alter);
//                }else{
//                    rewriter.insertBefore(ctx.ifS.getStart(), '{');
//                    rewriter.insertAfter(ctx.ifS.getStop(), alter+"\n\t\t}");
//                }
//                preInserter(ctx, "IF_", ifblockindex);
//                ifblockindex++;
//                break;
//            case "switch":
//                block = String.format("\"SWITCH_%d\"", switchblockindex);
//                alter = "\n\t\tSystem.out.println("+block+");";
//                rewriter.insertBefore(ctx.getStop(), alter);
//                preInserter(ctx, "SWITCH_", switchblockindex);
//                switchblockindex++;
//                break;
//            case "try":
//                block = String.format("\"TRY_%d\"", tryblockindex);
//                alter = "\n\t\tSystem.out.println("+block+");";
//                rewriter.insertAfter(ctx.tryB.start, alter);
//                preInserter(ctx, "TRY_", tryblockindex);
//                tryblockindex++;
//            default:
//                ;
//        }
//        super.enterStatement(ctx);
//    }
//
//    /**
//	 * {@inheritDoc}
//	 *
//	 * <p>HANDLING FOR ENTRING CATCH STATEMENT</p>
//     * @param ctx CatchClauseContext
//     *
//	 */
//    @Override
//    public void enterCatchClause(JavaParser.CatchClauseContext ctx) {
//        block = String.format("\"CATCH_%d\"", catchblockindex);
//        alter = "\n\t\tSystem.out.println("+block+");";
//        rewriter.insertAfter(ctx.catchB.getStart(), alter);
//        preInserter(ctx, "CATCH_", catchblockindex);
//        catchblockindex++;
//        super.enterCatchClause(ctx);
//    }
//
//
//     /**
//	 * {@inheritDoc}
//	 *
//	 * <p>HANDLING FOR ENTRING FINALLY STATEMENT</p>
//     * @param ctx FinallyBlockContext
//     *
//	 */
//    @Override
//    public void enterFinallyBlock(JavaParser.FinallyBlockContext ctx) {
//        block = String.format("\"FINALLY_%d\"", finallyblockindex);
//        alter = "\n\t\tSystem.out.println("+block+");";
//        rewriter.insertAfter(ctx.block().getStart(), alter);
//        preInserter(ctx, "FINALLY_", finallyblockindex);
//        finallyblockindex++;
//        super.enterFinallyBlock(ctx);
//    }
//    /**
//	 * {@inheritDoc}
//	 *
//	 * <p>HANDLING FOR ENTRING ELSE STATEMENT</p>
//     * @param ctx StatementContext
//     *
//	 */
//    @Override
//    public void enterElseStatement(JavaParser.ElseStatementContext ctx) {
//
//        block = String.format("\"ELSE_%d\"", elseblockindex);
//        alter = "\n\t\tSystem.out.println("+block+");";
//        if(ctx.getChildCount()>0){
//
//
//
//
//            if(!ctx.elseS.getStart().getText().equals("if")){
//                if(ctx.getChild(1).getText().charAt(0) =='{') {
//                    rewriter.insertAfter(ctx.elseS.getStart(), alter);
//
//                }
//                else{
//                    rewriter.insertAfter(ctx.ELSE().getSymbol(), '{');
//                    rewriter.insertAfter(ctx.elseS.getStop(), alter+"\n\t\t}");
//
//                }
//            }
//            preInserter(ctx, "ELSE_", elseblockindex);
//            elseblockindex++;
//        }
//
//
//        super.enterElseStatement(ctx);
//    }
//
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
}
