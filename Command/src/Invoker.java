import java.util.ArrayList;
import java.util.List;

public class Invoker {

    private List<Command> comandos = new ArrayList<>();
    private int current = 0;

    public void compute(Command command){
        command.execute();
        comandos.add(command);
        current++;
    }

    public void undo(int levels){
        for (int i = 0; i < levels; i++) {
            if (current > 0) {

                Command command = comandos.remove(--current);
                command.undo();
            }
        }
    }


}