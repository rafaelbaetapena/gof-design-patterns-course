public class MinhaApp {

    public static void main(String[] args) {
        Professor grad = new ProfessorGraduacao(new ProfessorImplGraduacao());
        grad.op();

        System.out.println("----------------------------");

        grad = new ProfessorGraduacao(new ProfessorImplPosGraduacao());
        grad.op();
    }
}