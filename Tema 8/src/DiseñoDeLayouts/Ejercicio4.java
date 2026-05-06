package DiseñoDeLayouts;

import javax.swing.*;
import java.awt.*;

public class Ejercicio4 extends JFrame {
    public Ejercicio4() {
        setTitle("Formulario de Entrada");
        setSize(400, 200);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout());

        JLabel label = new JLabel("Raul pitogordo");
        add(label);
        setVisible(true);
    }

    static void main() { SwingUtilities.invokeLater(Ejercicio4::new);}
}
