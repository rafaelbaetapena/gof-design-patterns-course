public class MinhaApp {

    public static void main(String[] args) {
        Game game = new Futebol();
        game.play();

        System.out.println("------");

        game = new Basquete();
        game.play();
    }
}