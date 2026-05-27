package ComponentesBásicos;

import javax.swing.*;
import javax.swing.plaf.basic.DefaultMenuLayout;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;
import java.util.Random;

public class Ejercicio11 extends JFrame {
    static Random r = new Random();
    static int intentos = 0;
    static String binario = "";
    static int num = r.nextInt(1, 32);
    public Ejercicio11() {
        setTitle(STR."\{intentos} intentos");
        setSize(800, 600);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(0, 2));
        JPanel numerico = new JPanel(new BorderLayout());
        JLabel numeron = new JLabel(String.valueOf(num), SwingConstants.CENTER);
        numerico.add(numeron, BorderLayout.CENTER);
        numeron.setFont(new Font("Arial", Font.BOLD, 50));
        numerico.setVisible(true);
        JPanel butones = new JPanel(new GridLayout(5, 0));

        for (int i = 0; i < 5; i++) {
            JToggleButton buton = new JToggleButton("0");
            buton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (buton.isSelected()) {
                        buton.setText("1");
                        intentos++;
                    } else {
                        buton.setText("0");
                        intentos++;
                    }
                    setTitle(STR."\{intentos} intentos");
                    Component[] listabotones = butones.getComponents();
                    for (int j = 0; j < listabotones.length; j++) {
                        JToggleButton actual = (JToggleButton) listabotones[j];
                        binario += actual.getText();
                    }
                    int binari = Integer.parseInt(binario, 2);
                    if (binari == num) {
                        JOptionPane.showMessageDialog(null, STR."Acertaste \{num}");
                    }
                    repaint();
                    revalidate();
                }
            });
            butones.add(buton);
        }
        butones.setVisible(true);
        add(numerico);
        add(butones);
        setVisible(true);
    }

    static void main() {
        SwingUtilities.invokeLater(Ejercicio11::new);
    }
}
