package DiseñoDeLayouts;

import javax.swing.*;
import java.awt.*;

public class Ejercicio4 extends JFrame {
    public Ejercicio4() {
        setTitle("Formulario de Entrada");
        setSize(400, 150);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(3, 2, 5, 5));

        JPanel panel1 = new JPanel();
        JLabel labelUsuario = new JLabel("Nombre de usuario:", SwingConstants.RIGHT);
        JTextField textoUsuario = new JTextField(20);
        panel1.add(labelUsuario);
        panel1.add(textoUsuario);

        JPanel panel2 = new JPanel();
        JLabel labelPass = new JLabel("Contraseña:", SwingConstants.RIGHT);
        JPasswordField textoPass = new JPasswordField(20);
        panel2.add(labelPass);
        panel2.add(textoPass);

        JPanel panel3 = new JPanel();
        JButton botonEntrar = new JButton("Entrar en la aplicación");
        panel3.add(botonEntrar);
        add(panel1);
        add(panel2);
        add(panel3);
        setVisible(true);
        panel1.setVisible(true);
        panel2.setVisible(true);
        panel3.setVisible(true);
    }

    static void main() { SwingUtilities.invokeLater(Ejercicio4::new);}
}
