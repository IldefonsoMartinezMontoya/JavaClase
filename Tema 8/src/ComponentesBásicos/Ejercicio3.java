package ComponentesBásicos;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Objects;
import java.util.jar.JarEntry;

public class Ejercicio3 extends JFrame {
    public Ejercicio3() {
        setTitle("ChuckDestroyer");
        setSize(800, 600);
        setResizable(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        JPanel panel1 = new JPanel(new GridLayout(5, 5));
        panel1.setBorder(new EmptyBorder(40, 40, 40, 40));
        for (int i = 0; i < 25; i++) {
            // Sustituye tu línea de ImageIcon original por esta:
            ImageIcon original = new ImageIcon(Objects.requireNonNull(getClass().getResource("/ComponentesBásicos/mamahuevaso.jpg")));
            Image escalado = original.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH);
            ImageIcon chuck = new ImageIcon(escalado);
            JLabel disparable = new JLabel("Dale Duro", chuck, JLabel.CENTER);
            disparable.setHorizontalTextPosition(JLabel.RIGHT);
            disparable.setVerticalTextPosition(JLabel.CENTER);
            disparable.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
            disparable.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    Component clickado = (Component) e.getSource();
                    panel1.remove(clickado);
                    panel1.repaint();
                    if (panel1.getComponentCount() == 0) {
                        JOptionPane.showMessageDialog(null, "Chuck ha dejado que salgas con vida");
                        System.exit(0);
                    }
                }
            });
            panel1.add(disparable);
        }
        panel1.setVisible(true);
        add(panel1);
        setVisible(true);
    }

    static void main() {
        SwingUtilities.invokeLater(Ejercicio3::new);
    }
}
