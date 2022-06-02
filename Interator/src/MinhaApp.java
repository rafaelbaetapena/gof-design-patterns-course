public class MinhaApp {

    public static void main(String[] args) {
        Zoo zoo = new ZooImpl();

        zoo.addAnimal(new Animal("tigre", "mamifero"));
        zoo.addAnimal(new Animal("pinguim", "ave"));
        zoo.addAnimal(new Animal("jacaré", "reptil"));
        zoo.addAnimal(new Animal("leão", "mamifero"));
        zoo.addAnimal(new Animal("elefante", "mamifero"));

        AveIterator aveIterator = new AveIterator(zoo);

        while(aveIterator.hasNext()){
            System.out.println(aveIterator.next().getNome());
        }

        System.out.println("--------");

        MamiferoIterator mamiferoIterator = new MamiferoIterator(zoo);

        while(mamiferoIterator.hasNext()){
            System.out.println(mamiferoIterator.next().getNome());
        }
    }

}