public class MinhaApp {

    public static void main(String[] args) {
        Pato p = new Pato();

        p.setComportamentoVoar(new NaoVoar());

        p.voar();
        p.grasnar();

    }
}