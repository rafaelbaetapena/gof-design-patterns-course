public class MinhaApp {

    public static void main(String[] args) {
        Partitura.carregaNotas();

        Partitura.getNota("Do").desenha();
        Partitura.getNota("Re").desenha();
        Partitura.getNota("Mi").desenha();
        Partitura.getNota("Fa").desenha();
        Partitura.getNota("Fa").desenha();
        Partitura.getNota("Fa").desenha();
        Partitura.getNota("Do").desenha();
        Partitura.getNota("Re").desenha();
        Partitura.getNota("Do").desenha();
        Partitura.getNota("Re").desenha();
        Partitura.getNota("Re").desenha();
        Partitura.getNota("Re").desenha();
    }
}