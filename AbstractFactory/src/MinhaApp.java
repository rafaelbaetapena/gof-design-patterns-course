import java.util.Calendar;
import java.util.GregorianCalendar;

public class MinhaApp {

    public static void main(String[] args) {

        EmpresaOnibus viacaoXYZ = new ConcreteEmpresaOnibus();

        PassagemOnibusUrbano pUrbano = viacaoXYZ.emitePassagemOnibusUrbano(
                "São Paulo",
                "Campinas",
                new GregorianCalendar(2016, Calendar.MARCH, 10, 11, 0));

        PassagemOnibusInterestadual pInterestadual = viacaoXYZ.emitePassagemOnibusInterestadual(
                "São Paulo",
                "Rio de Janeiro",
                new GregorianCalendar(2016, Calendar.APRIL, 20, 8, 30));

        pUrbano.exibeDetalhes();

        pInterestadual.exibeDetalhes();
    }

}
