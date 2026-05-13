package ComponentesBásicos;

import javax.swing.*;

public class Ejercicio5 extends JFrame {
    public Ejercicio5() {
        setTitle("¿Quien soy?");
        setSize(800, 600);
        setResizable(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    static void main() {
        SwingUtilities.invokeLater(Ejercicio5::new);
    }
}
