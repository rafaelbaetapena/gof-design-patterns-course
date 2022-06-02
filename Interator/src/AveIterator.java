import java.util.Iterator;

public class AveIterator implements Iterator<Animal> {

    private final Zoo zoo;
    private int pos = 0;

    public AveIterator(Zoo zoo){
        this.zoo = zoo;
    }

    public boolean hasNext() {
        for(int i=pos; i < zoo.getAnimais().size(); i++) {
            Animal a = zoo.getAnimais().get(i);
            if(a.getClasse().equalsIgnoreCase("ave")){
                return true;
            }
        }
        return false;
    }

    public Animal next() {
        while(pos < zoo.getAnimais().size()) {
            Animal a = zoo.getAnimais().get(pos);
            pos++;

            if(a.getClasse().equalsIgnoreCase("ave")){
                return a;
            }
        }
        return null;
    }

}