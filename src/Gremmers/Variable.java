package Gremmers;

public class Variable extends AST{

    String id ;

    public Variable(String id){
        this.id=id;
    }

    @Override
    public String toString() {
        return id;
    }
}
