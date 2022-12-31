package Gremmers;

public class Float extends AST{
//    String num ;
//    public Float(String num ){
//        this.num=num ;
//    }
//
//    @Override
//    public String toString() {
//       return num;
//    }
    private String FLOAT;

    public void setFLOAT(String FLOAT){
        this.FLOAT=FLOAT;
    }

    @Override
    public String toString() {
        return FLOAT;
    }
}
