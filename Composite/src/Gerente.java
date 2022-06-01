import java.util.ArrayList;
import java.util.List;

public class Gerente extends Empregado {

    private List<Empregado> listaSubordinados = new ArrayList<>();

    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    public void print() {
        System.out.println(super.nome + ", $" + super.salario);
        for (Empregado e : listaSubordinados) {
            e.print();
        }
    }

    public void add(Empregado e) {
        listaSubordinados.add(e);
    }

    public void remove(Empregado e) {
        listaSubordinados.remove(e);
    }
}