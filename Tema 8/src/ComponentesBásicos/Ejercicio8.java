package ComponentesBásicos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Ejercicio8 extends JFrame {
        static int multiplo = 0;
        static JLabel[] etiquetas = new JLabel[10];
    public Ejercicio8() {
        setTitle("Tabla de multiplicar");
        setSize(800, 600);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(0, 3));
        JPanel panel1 = new JPanel(new GridBagLayout());
        JPanel panel2 = new JPanel(new GridBagLayout());
        JPanel panel3 = new JPanel(new GridLayout(10, 1));
        JTextField texto = new JTextField(20);
        JButton boton = new JButton("Calcular");
        boton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                multiplo = Integer.parseInt(texto.getText());
                for (int i = 0; i < 10; i++) {
                    etiquetas[i].setText(STR."\{multiplo} x \{i + 1} = \{multiplo * (i + 1)}");
                }
            }
        });
        panel1.add(texto);
        panel1.setVisible(true);
        panel2.add(boton);
        panel2.setVisible(true);
        for (int i = 0; i < 10; i++) {
            etiquetas[i] = new JLabel(STR."\{multiplo} x \{i} = \{multiplo * i}", JLabel.CENTER);
            etiquetas[i].setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
            panel3.add(etiquetas[i]);
        }
        panel3.setVisible(true);
        add(panel1);
        add(panel2);
        add(panel3);
        setVisible(true);
    }

    static void main() {
        SwingUtilities.invokeLater(Ejercicio8::new);
    }
}