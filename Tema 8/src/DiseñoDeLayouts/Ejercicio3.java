package DiseñoDeLayouts;

import javax.swing.*;
import java.awt.*;

public class Ejercicio3 extends JFrame {
    public Ejercicio3() {
        setTitle("Calculadora Básica");
        setSize(480, 400);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        JTextField campo = new JTextField();
        add(campo, BorderLayout.NORTH);
        JPanel panelNumerico = new JPanel();
        add(panelNumerico);
        panelNumerico.setLayout(new GridLayout(4, 4));
        panelNumerico.add(new JButton("7"));
        panelNumerico.add(new JButton("8"));
        panelNumerico.add(new JButton("9"));
        panelNumerico.add(new JButton("/"));
        panelNumerico.add(new JButton("4"));
        panelNumerico.add(new JButton("5"));
        panelNumerico.add(new JButton("6"));
        panelNumerico.add(new JButton("x"));
        panelNumerico.add(new JButton("1"));
        panelNumerico.add(new JButton("2"));
        panelNumerico.add(new JButton("3"));
        panelNumerico.add(new JButton("-"));
        panelNumerico.add(new JButton("."));
        panelNumerico.add(new JButton("0"));
        panelNumerico.add(new JButton("="));
        panelNumerico.add(new JButton("+"));

        panelNumerico.setVisible(true);
        setVisible(true);

    }

    static void main() {
        SwingUtilities.invokeLater(Ejercicio3::new);
    }
}
