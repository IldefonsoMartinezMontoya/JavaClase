package ComponentesBásicos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.lang.runtime.TemplateRuntime;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Ejercicio10 extends JFrame {
    static List<JLabel> labels = new ArrayList<>();
    static Random r = new Random();
    static JLabel chivata;
    public Ejercicio10() {
        setTitle("Bingo");
        setSize(800, 600);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        JPanel paneltexto = new JPanel(new BorderLayout());
        JPanel panelnumerico = new JPanel(new GridLayout(9, 10));
        JPanel botones = new JPanel(new FlowLayout());
        JTextField texto = new JTextField();
        texto.setPreferredSize(new Dimension(texto.getPreferredSize().width, 60));
        paneltexto.add(texto);
        for (int i = 0; i < 90; i++) {
            JLabel numeros = new JLabel(String.valueOf(i + 1), JLabel.CENTER);
            numeros.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
            numeros.setOpaque(true);
            panelnumerico.add(numeros);
            labels.add(numeros);
        }
        JButton boton = new JButton("Sacar Bola");
        boton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (chivata != null) {
                    chivata.setBackground(Color.YELLOW);
                }
                int num = r.nextInt(labels.size());
                JLabel elegida = labels.get(num);
                elegida.setBackground(Color.RED);
                chivata = elegida;
                texto.setText(elegida.getText());
            }
        });
        botones.add(boton);
        panelnumerico.setVisible(true);
        paneltexto.setVisible(true);
        botones.setVisible(true);

        add(paneltexto, BorderLayout.NORTH);
        add(panelnumerico, BorderLayout.CENTER);
        add(botones, BorderLayout.SOUTH);
        setVisible(true);
    }

    static void main() {
        SwingUtilities.invokeLater(Ejercicio10::new);
    }
}
