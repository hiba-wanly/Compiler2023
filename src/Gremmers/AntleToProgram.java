package Gremmers;

import syntax.projectParser;
import syntax.projectParserBaseVisitor;

public class AntleToProgram extends projectParserBaseVisitor<Program> {

    @Override
    public Program visitProg(projectParser.ProgContext ctx) {
//        return super.visitProg(ctx);
        Program pp = new Program();
        AntlrToAST ast = new AntlrToAST();
        for(int i = 0 ; i< ctx.element().size() ;i++){
            pp.addGrammers(ast.visitElement(ctx.element().get(i)));
        }
        return  pp ;
    }

}
