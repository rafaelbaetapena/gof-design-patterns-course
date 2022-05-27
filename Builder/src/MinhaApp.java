public class MinhaApp {

    public static void main(String[] args) {
        Cozinha cozinha = new Cozinha();

        SanduicheBuilder b1 = new HamburguerBuilder();
        SanduicheBuilder b2 = new FishBuilder();

        cozinha.fazSanduiche(b1);
        b1.getSanduiche();

        System.out.println("--------------------------");

        cozinha.fazSanduiche(b2);
        b2.getSanduiche();
    }

}