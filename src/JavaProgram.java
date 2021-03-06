import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.*;
import java.util.*;
import javax.tools.JavaCompiler;
import javax.tools.ToolProvider;

public class JavaProgram {

    static String outputFileName ;
    static String outputJavaFileName ;
    static String outputDir ;

    public static  void main(String[] args) throws Exception {


        Scanner sc = new Scanner(System.in); //System.in is a standard input
        System.out.println("\nDo u have a test path for me? ...");
        System.out.println("Enter 1 for yes or 0 for no...");
        String response = sc.nextLine();
        if(response == "1"){
            String path = sc.nextLine();
            try{
                processor(path, "0");
            }catch (Exception e){
                System.out.println(e);
            }
        }else{
            System.out.println("Will i do have 5 defaults if u want to run them!");
            System.out.println("Enter a number of test or -1 to run all");
            String testNumber = sc.nextLine();

            if(testNumber.equals("-1")){
                int i = 1;
                while (i<6){
                    processor("test/test_"+i+".java",""+i);
                    i++;
                }
            }else {
                int no_test  =  Integer.parseInt(testNumber) ;
                if(no_test <= 6 )
                    processor("test/test_"+testNumber+".java", testNumber);
            }
        }

    }

    /**
	 * {@inheritDoc}
	 *
	 * <p>PARSING SOURCE TO TOKEN AND GENERATE THE PARSING TREE</p>
     * @param input CharStream
     * 
	 */
    public static  MyJavaListener generateAndWalkParserTree(CharStream input ){
        JavaLexer lexer = new JavaLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        JavaParser parser = new JavaParser(tokens);
        ParseTree tree = parser.compilationUnit();

        ParseTreeWalker walker = new ParseTreeWalker();
        MyJavaListener extractor = new MyJavaListener(tokens);
        walker.walk(extractor, tree); // initiate walk of tree with listener

        return extractor ;
    }


    /**
	 * {@inheritDoc}
	 *
	 * <p>INSERCT JAVA MODIFICATIONS</p>
     * @param extractor MyJavaListener 
     * @param testNumber String
     * 
	 */
    public static File  generateJavaInjectionCode (MyJavaListener extractor,
                                                   String testNumber)
            throws IOException
    {
        // output file and directory
         outputFileName = "output_" + testNumber;
         outputJavaFileName = outputFileName + ".java";
         outputDir = "output/";

        // write the answer to file
        File outputJavaFile = new File(outputDir + outputJavaFileName);
        if (!outputJavaFile.createNewFile()) {
            boolean res = outputJavaFile.delete();
            outputJavaFile = new File(outputDir + outputJavaFileName);
        }
        FileWriter myWriter = new FileWriter(outputDir + outputJavaFileName);
        String javaOutput = extractor.rewriter.getText()
                .replace("test", "output") ;
        myWriter.write(javaOutput);
        myWriter.close();

        return  outputJavaFile ;
    }

     /**
	 * {@inheritDoc}
	 *
	 * <p>RUN THE INSERCTED JAVA MODIFICATIONS AND INDCATE THE VISITED LINES</p>
     * @param outputJavaFile File
     * 
	 */
    public static BufferedReader runJavaInjectionCode (File outputJavaFile){

        Process theProcess = null;
        BufferedReader inStream = null;
        String outputFileName= outputJavaFile.getName() ;

        outputJavaFile.getParentFile().mkdirs();

        // Compile source file.
        JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
        compiler.run(null, System.out, null, outputJavaFile.getPath());
        try{
            theProcess = Runtime.getRuntime().exec(
                    "java output/"+outputFileName);
        }
        catch(IOException e){
            System.err.println("Error on exec() method");
            e.printStackTrace();
        }
        inStream = new BufferedReader(
                new InputStreamReader(theProcess.getInputStream()));

        return  inStream ;

    }

    /**
	 * {@inheritDoc}
	 *
	 * <p>CONVERT JAVA TO HTML AND INSERT PRE TAG BEFORE EVERY BLOCK </p>
     * @param inStream BufferedReader
     * @param extractor MyJavaListener
     *
	 */
    public static void writeHtml (BufferedReader  inStream ,
                                  MyJavaListener extractor) throws IOException {

        // TODO : add file to another directory
        File outputHtmlFile = new File(outputDir+"html/"+outputFileName+".html");
        FileWriter myHtmlWriter = new FileWriter(
                outputDir +"html/"+outputFileName+".html" );

        myHtmlWriter.write( "<html> \n<head> \n<style>\n" +
                "body{background: chartreuse;}\n pre{background : lightsalmon}\n"+
                "pre{display:inline ;}") ;
        String s = null;
        // write style of the code

        while ((s = inStream.readLine()) != null) {
            if(!s.matches(".+_[0-9]+"))
            {
                continue;
            }
            System.out.println(s);
            if(s.matches("(.*)GpreExpression(.*)"))
            {
                System.out.print("doneeeeeeeeeeee ");
                s = "#"+s.replace("G" ,"")
                        +"{background:chartreuse !important}\n";
            }else if (s.matches("(.*)preExpression(.*)")){
                s = "#"+s+"{background:orange}\n" ;
            } else {
                s = "#"+s+"{background:chartreuse}\n" ;
            }
            myHtmlWriter.write(s);
        }

        myHtmlWriter.write("</style>\n </head>\n <body> "+
                "<pre style='background: chartreuse;'>\n") ;
        myHtmlWriter.write(extractor.getRewriter2().getText()
                .replace("\n", "<br>"));
        myHtmlWriter.write(" </pre></body> \n</html> \n") ;

        myHtmlWriter.close();


    }


    /**
	 * {@inheritDoc}
	 *
	 * <p>HELPER METHOD</p>
     * @param path String 
     * @param testNum String
     * 
	 */
    static void processor(String path, String testNum) throws IOException {
        CharStream input = CharStreams.fromFileName(path);

        MyJavaListener extractor =  generateAndWalkParserTree(input ) ;

        File outputJavaFile =  generateJavaInjectionCode(extractor , testNum) ;

        BufferedReader inStream = runJavaInjectionCode (outputJavaFile) ;

        writeHtml(inStream ,extractor) ;
    }




}
