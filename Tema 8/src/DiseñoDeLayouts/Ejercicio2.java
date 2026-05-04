package DiseñoDeLayouts;

import javax.swing.*;
import java.awt.*;

public class Ejercicio2 extends JFrame {
    public Ejercicio2() {
        setTitle("Rejilla de Botones");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(6, 8));
        for (int i = 1; i < 49; i++) {
            add(new JButton(STR."Botón \{i}"));
        }
        setVisible(true);
    }

    static void main() {
        SwingUtilities.invokeLater(Ejercicio2::new);
    }
}
