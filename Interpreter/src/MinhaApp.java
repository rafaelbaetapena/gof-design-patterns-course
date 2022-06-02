import java.util.ArrayList;
import java.util.List;

public class MinhaApp {

    public static void main(String[] args) {

        String romano = "MCMXXVIII";
        Contexto context = new Contexto(romano);
        
        List<Expressao> tree = new ArrayList<>();
        tree.add(new Milhar());
        tree.add(new Centena());
        tree.add(new Dezena());
        tree.add(new Unidade());

        //Interpreter
        for (Expressao exp : tree) {
            exp.Interpret(context);
        }

        System.out.println(context.getOutput());
    }

}