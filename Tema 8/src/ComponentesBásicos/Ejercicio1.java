package ComponentesBásicos;

import DiseñoDeLayouts.Ejercicio3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Ejercicio1 extends JFrame{
    public Ejercicio1() {
        setTitle("Mostrar Coordenadas");
        setSize(600, 400);
        setResizable(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel Panel1 = new JPanel(new FlowLayout(FlowLayout.CENTER, 20, 170));
        JTextField x = new JTextField(5);
        JTextField y = new JTextField(5);
        Panel1.add(x);
        Panel1.add(y);
        Panel1.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                x.setText(String.valueOf(e.getX()));
                y.setText(String.valueOf(e.getY()));
            }
        });
        Panel1.setVisible(true);
        add(Panel1);
        setVisible(true);
    }
    static void main() {
        SwingUtilities.invokeLater(Ejercicio1::new);
    }
}
