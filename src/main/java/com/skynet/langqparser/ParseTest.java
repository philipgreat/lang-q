
package com.skynet.lingqparser; 
import java.io.*;
import java.io.*;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.tree.*;


public class ParseTest{
    
    public static void main(String args[]){
        String javaClassContent = "LangQ moto";
        LangQLexer lexer = new LangQLexer(CharStreams.fromString(javaClassContent));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        LangQParser parser = new LangQParser(tokens);
        ParseTree tree = parser.r();
        ParseTreeWalker walker = new ParseTreeWalker();
        GenericNodeListener listener= new GenericNodeListener();
        walker.walk(listener, tree);

    }


}