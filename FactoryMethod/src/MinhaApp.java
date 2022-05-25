import java.util.Calendar;
import java.util.GregorianCalendar;

public class MinhaApp {

    public static void main(String[] args) {
        Empresa viacaoABCLocal = new EmpresaOnibusUrbano();

        Empresa viacaoXYZInter = new EmpresaOnibusInterestadual();

        Passagem pUrbano = viacaoABCLocal.emitePassagem(
                "São Paulo",
                "Campinas",
                new GregorianCalendar(2016, Calendar.MARCH, 10, 11, 0));

        Passagem pInterestadual = viacaoXYZInter.emitePassagem(
                "São Paulo",
                "Rio de Janeiro",
                new GregorianCalendar(2016, Calendar.APRIL, 20, 8, 30));

        pUrbano.exibeDetalhes();

        pInterestadual.exibeDetalhes();
    }
}
