public class MinhaApp {

    public static void main(String[] args) {

        Figura f = FiguraFactory.getFigura("linha");
        f.desenha("amarela");

        f = FiguraFactory.getFigura("oval não preenchida");
        f.desenha("vermelha");

        f = FiguraFactory.getFigura("oval preenchida");
        f.desenha("azul");
    }

}