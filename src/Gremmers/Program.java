package Gremmers;

import java.util.ArrayList;
import java.util.List;

public class Program {

    public List<AST> grams;

    public  Program(){
        this.grams = new ArrayList<>();
    }

    public void addGrammers( AST g ){

        grams.add(g);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for(AST child : this.grams){
            stringBuilder.append(child);
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
//        return this.grams.toString();
    }
}
