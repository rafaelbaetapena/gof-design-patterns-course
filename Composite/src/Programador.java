public class Programador extends Empregado {

    public Programador(String nome, double salario) {
        super(nome, salario);
    }

    public void print() {
        System.out.println(super.nome + ", $" + super.salario);
    }

    public void add(Empregado e) {
        System.out.println("Não é possível adicionar empregado subordinado do programador");
    }

    public void remove(Empregado e) {
        System.out.println("Não é possível remover empregado subordinado do programador");
    }
}