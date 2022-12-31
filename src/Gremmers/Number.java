package Gremmers;

public class Number extends AST{

    int num ;
    public Number(int num ){
        this.num=num ;
    }

    @Override
    public String toString() {
        return new Integer(num).toString();
    }
}
