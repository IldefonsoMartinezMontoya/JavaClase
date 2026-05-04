package DiseñoDeLayouts;

import javax.swing.*;
import java.awt.*;

public class Ejercicio1 extends JFrame {
    public Ejercicio1() {
        setTitle("Dias Laborales");
        setSize(480, 240);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout(FlowLayout.CENTER, 20, 10));
        add(new JButton("Lunes"));
        add(new JButton("Martes"));
        add(new JButton("Miercoles"));
        add(new JButton("Jueves"));
        add(new JButton("Viernes"));
        setVisible(true);
    }

    static void main() {
        SwingUtilities.invokeLater(Ejercicio1::new);
    }
}
