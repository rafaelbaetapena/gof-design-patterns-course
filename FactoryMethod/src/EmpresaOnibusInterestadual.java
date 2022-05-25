import java.util.Calendar;

public class EmpresaOnibusInterestadual extends Empresa {

    public Passagem emitePassagem(String origem, String destino, Calendar dataHoraPartida) {
        return new PassagemOnibusInterestadual(origem, destino, dataHoraPartida);
    }
}