import Gremmers.AntleToProgram;
import Gremmers.Program;
import syntax.projectParser;
import syntax.projectLexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {

//        System.out.println("Hello world!");
        try {
            String source = "folders/test1.txt";
            CharStream input = CharStreams.fromFileName(source);
            projectLexer lexer = new projectLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            projectParser parser = new projectParser(tokens);
            ParseTree dartAST = parser.prog();

            AntleToProgram programVisitor = new AntleToProgram();
            Program prog = (Program) programVisitor.visit(dartAST);

            System.out.println(prog);
            System.out.println("hiii");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}