import java.util.Iterator;

public class AnfibioIterator implements Iterator<Animal> {

    private final Zoo zoo;
    private int pos = 0;

    public AnfibioIterator(Zoo zoo){
        this.zoo = zoo;
    }

    public boolean hasNext() {
        for(int i=pos; i < zoo.getAnimais().size(); i++) {
            Animal a = zoo.getAnimais().get(i);
            if(a.getClasse().equalsIgnoreCase("anfibio")){
                return true;
            }
        }
        return false;
    }

    public Animal next() {
        while(pos < zoo.getAnimais().size()) {
            Animal a = zoo.getAnimais().get(pos);
            pos++;

            if(a.getClasse().equalsIgnoreCase("anfibio")){
                return a;
            }
        }
        return null;
    }

}