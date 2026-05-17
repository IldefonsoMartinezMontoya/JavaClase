package ComponentesBásicos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayDeque;

public class Ejercicio5 extends JFrame {
    public Ejercicio5() {
        setTitle("¿Quien soy?");
        setSize(800, 600);
        setResizable(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        JButton norte = new JButton("Norte");
        norte.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                JOptionPane.showMessageDialog(null, "Has pulsado Norte");
            }
        });
        add(norte, BorderLayout.NORTH);
        JButton sur = new JButton("Sur");
        sur.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                JOptionPane.showMessageDialog(null, "Has pulsado Sur");
            }
        });
        add(sur, BorderLayout.SOUTH);
        JButton este = new JButton("Este");
        este.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                JOptionPane.showMessageDialog(null, "Has pulsado Este");
            }
        });
        add(este, BorderLayout.EAST);
        JButton oeste = new JButton("Oeste");
        oeste.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                JOptionPane.showMessageDialog(null, "Has pulsado Oeste");
            }
        });
        add(oeste, BorderLayout.WEST);
        JButton centro = new JButton("Centro");
        centro.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                JOptionPane.showMessageDialog(null, "Has pulsado Centro");
            }
        });
        add(centro, BorderLayout.CENTER);
        setVisible(true);
    }

    static void main() {
        SwingUtilities.invokeLater(Ejercicio5::new);
    }
}
