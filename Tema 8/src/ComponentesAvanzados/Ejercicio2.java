package ComponentesAvanzados;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Ejercicio2 extends JFrame {
    private int Rojo;
    private int Verde;
    private int Azul;
    private final JPanel panelMuestraColor;
    private final char[] diccionarioHex =
            {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    public Ejercicio2() {
        setTitle("Va de Colores");
        setSize(800, 600);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(3,0));

        JPanel colorines = new JPanel(new GridLayout(6, 1));
        JSlider rojo = new JSlider(SwingConstants.HORIZONTAL, 0, 255, 127);
        rojo.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                Rojo = rojo.getValue();
                actualizarColor();
            }
        });
        JSlider verde = new JSlider(SwingConstants.HORIZONTAL, 0, 255, 127);
        verde.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                Verde = verde.getValue();
                actualizarColor();
            }
        });
        JSlider azul = new JSlider(SwingConstants.HORIZONTAL, 0, 255, 127);
        azul.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                Azul = azul.getValue();
                actualizarColor();
            }
        });

        JLabel rojillo = new JLabel("Rojo \n", JLabel.CENTER);
        colorines.add(rojillo);
        colorines.add(rojo);
        JLabel verdillo = new JLabel("Verde \n", JLabel.CENTER);
        colorines.add(verdillo);
        colorines.add(verde);
        JLabel azulillo = new JLabel("Azul \n", JLabel.CENTER);
        colorines.add(azulillo);
        colorines.add(azul);
        add(colorines);

        panelMuestraColor = new JPanel();
        actualizarColor();
        add(panelMuestraColor);

        JPanel botonique = new JPanel(new GridLayout(2, 0));
        JButton botonico = new JButton("Mostrar Hexadecimal");
        JTextField textonico = new JTextField();
        botonico.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                char cocienteRojo = diccionarioHex[Rojo / 16];
                char restoRojo = diccionarioHex[Rojo % 16];
                char cocienteVerde = diccionarioHex[Verde / 16];
                char restoVerde = diccionarioHex[Verde % 16];
                char cocienteAzul = diccionarioHex[Azul / 16];
                char restoAzul = diccionarioHex[Azul % 16];
                textonico.setText(STR."#\{cocienteRojo}\{restoRojo}\{cocienteVerde}\{restoVerde}\{cocienteAzul}\{restoAzul}");
            }
        });
        botonique.add(botonico);
        botonique.add(textonico);
        add(botonique);
        botonique.setVisible(true);
        panelMuestraColor.setVisible(true);
        colorines.setVisible(true);
        setVisible(true);
    }

    private void actualizarColor() {
        Color colorAsignado = new Color(Rojo, Verde, Azul);
        panelMuestraColor.setBackground(colorAsignado);
    }

    static void main() {
        SwingUtilities.invokeLater(Ejercicio2::new);
    }
}
