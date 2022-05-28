public class MinhaApp {

    public static void main(String[] args) {

        PlugBrasileiro plugBrasileiro = new PlugBrasileiro();
        TomadaBrasileira tomadaBras = new TomadaBrasileira();
        String retornoTomandaBras = tomadaBras.conecta(plugBrasileiro);
        System.out.println(retornoTomandaBras);

        System.out.println("-------------");

        PlugAmericano plugEUA = new PlugAmericano();
        TomadaAmericana tomadaEUA = new TomadaAmericana();
        String retornoTomaraEUA = tomadaEUA.conecta(plugEUA);
        System.out.println(retornoTomaraEUA);

        System.out.println("-------------");

        AdapterEUAtoBrasil tomadaModificada = new AdapterEUAtoBrasil();
        String retornoAdapter = tomadaModificada.conecta(plugEUA);

        System.out.println(retornoAdapter);

    }
}