import javax.swing.*;
import java.awt.*;

public class Janela extends JFrame {

    private static Janela j = null;

    private Janela() {
        setPreferredSize(new Dimension(640, 480));
    }

    public static Janela getInstance() {
        if(j==null) {
            j = new Janela();
        }
        return j;
    }
}
