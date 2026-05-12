package ComponentesBásicos;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Ejercicio2 extends JFrame {
    public Ejercicio2() {
        setTitle("LabelDestroyer");
        setSize(800, 400);
        setResizable(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        JPanel Panel1 = new JPanel(new GridLayout(8, 8));
        Panel1.setBorder(new EmptyBorder(40, 40, 40, 40));
        for (int i = 0; i < 64; i++) {
            JLabel disparables = new JLabel("Dispárame");
            disparables.setHorizontalAlignment(JLabel.CENTER);
            disparables.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    Panel1.remove(disparables);
                    Panel1.revalidate();
                    Panel1.repaint();
                }
            });
        }
        add(Panel1, BorderLayout.CENTER);
        Panel1.setVisible(true);
        setVisible(true);
    }

    static void main() {
        SwingUtilities.invokeLater(Ejercicio2::new);
    }
}
