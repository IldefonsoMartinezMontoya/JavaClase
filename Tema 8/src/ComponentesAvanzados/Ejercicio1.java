package ComponentesAvanzados;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio1 extends JFrame {
    public Ejercicio1() {
        setTitle("Cuentalíneas");
        setSize(800, 600);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(2, 0));
        JPanel paneltextico = new JPanel(new BorderLayout());
        JTextArea texto = new JTextArea();
        paneltextico.add(texto);

        JPanel panelbotonico = new JPanel(new FlowLayout());
        JButton boton = new JButton("Contar");
        boton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                String contenido = texto.getText();
                String[] lineas = contenido.split("\n");
                int contador = 0;
                for (String linea : lineas) {
                    if (!linea.trim().isEmpty()) {
                        contador++;
                    }
                }
                JOptionPane.showMessageDialog(texto, STR."Líneas con texto: \{contador}");
            }
        });
        panelbotonico.add(boton);
        panelbotonico.setVisible(true);
        paneltextico.setVisible(true);
        add(paneltextico);
        add(panelbotonico);
        setVisible(true);
    }

    static void main() {
        SwingUtilities.invokeLater(Ejercicio1::new);
    }
}
