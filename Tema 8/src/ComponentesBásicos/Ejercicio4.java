package ComponentesBásicos;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Ejercicio4 extends JFrame {
    public Ejercicio4() {
        setTitle("Etiqueta Coloreada");
        setSize(800, 600);
        setResizable(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        JPanel panel1 = new JPanel(new GridLayout(10, 10));
        panel1.setBorder(new EmptyBorder(40, 40, 40, 40));
        for (int i = 0; i < 100; i++) {
            JLabel marcable = new JLabel("Márcame");
            marcable.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
            marcable.setBackground(Color.BLUE);
            marcable.setOpaque(true);
            marcable.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseEntered(MouseEvent e) {
                    marcable.setBackground(Color.green);
                }
                public void mouseExited(MouseEvent e) {
                    marcable.setBackground(Color.blue);
                }
            });
            panel1.add(marcable);
        }
        panel1.setVisible(true);
        add(panel1);
        setVisible(true);
    }

    static void main() {
        SwingUtilities.invokeLater(Ejercicio4::new);
    }
}
