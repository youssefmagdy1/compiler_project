/*

TODO : error with comments //
    parser cannot read it
 */

import java.lang.reflect.Method;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

public class JavaListener extends  JavaParserBaseListener{
    JavaParser parser;
    int level = 0 ;
    String ret_string = "" ;

    public JavaListener(JavaParser _parser) {
        this.parser = _parser ;
    }


    @Override
    public void enterEveryRule(ParserRuleContext ctx) {
            level ++ ;
            super.enterEveryRule(ctx);
    }

    @Override
    public void exitEveryRule(ParserRuleContext ctx) {
//        System.out.printf("</%s>%n"  ,parser.getRuleNames()[ctx.getRuleIndex()]);
        -- level ;
        super.exitEveryRule(ctx);
    }

    @Override
    public void visitTerminal(TerminalNode node) {
        final String value = node.getText();
        if (!value.matches("\\s+"))
        {
            String text = node.getText() + " " ;
            ret_string = ret_string.concat(text) ;
            if( text.equals("; ") || text.equals("{ ")  ) {
                ret_string = ret_string.concat("\n ") ;
            }
        }
        super.visitTerminal(node);
    }

    @Override
    public void enterBlock(JavaParser.BlockContext ctx) {

        System.out.println("done");
        String line  = Integer.toString( ctx.start.getLine());


        // the string want to make tree from
        String str = "System.out.println("+'"'+ "the BLOCK at line "+ line +"have benn visited " + '"'+ ");" ;

        // put the child before last one in the tree which is curl brackets
        int n = ctx.getChildCount();
        ParseTree temp = ctx.children.get(n-1);
        ctx.children.set(n-1 , GenerateTreeFromStrE(str) ) ;
        ctx.children.add( temp   ) ;


        super.enterBlock(ctx);
    }




    private ParseTree GenerateTreeFromStrE (String str  )
    {
        ANTLRInputStream input = new  ANTLRInputStream(str) ;

        JavaLexer lexer = new JavaLexer( input ) ;
        CommonTokenStream tokens = new CommonTokenStream(lexer ) ;
        JavaParser parser = new JavaParser(tokens) ;

        ParseTree tree = parser.statement() ; // parser tree of  first rule
        return tree  ;
    }


}
