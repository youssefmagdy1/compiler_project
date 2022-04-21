
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.File;  // Import the File class
import java.io.FileWriter;   // Import the FileWriter class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

public class Generate_tree {
    public static void main(String[] args)  throws  Exception{

        // take the input from file
        String fileStr = "";
        String fileName = "test3.java" ;
        try {
            File myFile = new File("test/"+ fileName);
            Scanner myReader = new Scanner(myFile);
            while (myReader.hasNextLine()) {
                String str = myReader.nextLine() ;
                fileStr = fileStr.concat(str ) + "\n";
            }
            myReader.close();
        }catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }


        ANTLRInputStream input = new  ANTLRInputStream(fileStr) ;

        // input => lexer => token => parserTree
        JavaLexer lexer = new JavaLexer( input ) ;
        CommonTokenStream tokens = new CommonTokenStream(lexer ) ;
        JavaParser parser = new JavaParser(tokens) ;

        ParseTree tree = parser.compilationUnit() ; // parser tree of  first rule

        // listener
        JavaListener listener = new JavaListener(parser) ;
        ParseTreeWalker.DEFAULT.walk(listener, tree);

        // write the answer to file
        File myObj = new File("test/"+fileName);
        if (!myObj.createNewFile()) {
            myObj.delete() ;
            myObj = new File("test/"+fileName);
        }
        FileWriter myWriter = new FileWriter("test/"+fileName);
        myWriter.write(listener.ret_string);
        myWriter.close();



        // visitor
//        JavaVisitor visitor = new JavaVisitor();
//        visitor.visit( tree );


    }
}
