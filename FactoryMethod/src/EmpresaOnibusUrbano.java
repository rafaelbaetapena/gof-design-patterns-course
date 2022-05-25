import java.util.Calendar;

public class EmpresaOnibusUrbano extends Empresa {

    public Passagem emitePassagem(String origem, String destino, Calendar dataHoraPartida) {
        return new PassagemOnibusUrbano(origem, destino, dataHoraPartida);
    }
}
