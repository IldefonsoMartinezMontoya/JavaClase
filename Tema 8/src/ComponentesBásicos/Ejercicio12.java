package ComponentesBásicos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class Ejercicio12 extends JFrame {
    public Ejercicio12() {
        setTitle("Santo y Seña");
        setSize(800, 600);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        JButton boton = new JButton("Entrar");
        boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == boton) {
                    JDialog dialogo = new JDialog(Ejercicio12.this, "Formulario", true);
                    dialogo.setSize(400, 300);
                    dialogo.setLayout(new GridLayout(3, 3));
                    dialogo.setResizable(false);
                    JLabel usuario = new JLabel("Insertar Usuario: ");
                    JTextField texto1 = new JTextField();
                    dialogo.add(usuario);
                    dialogo.add(texto1);
                    JLabel contraseña = new JLabel("Insertar Contraseña: ");
                    JTextField texto2 = new JTextField();
                    dialogo.add(contraseña);
                    dialogo.add(texto2);
                    JButton cancelar = new JButton("Cancelar");
                    cancelar.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            if (e.getSource() == cancelar) {
                               dialogo.dispose();
                            }
                        }
                    });
                    JButton ingresar = new JButton("Ingresar");
                    ingresar.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            if (e.getSource() == ingresar) {
                                if (Objects.equals(texto1.getText(), "estudiante") && Objects.equals(texto2.getText(), "oretania")) {
                                    JOptionPane.showMessageDialog(null, "BIENVENIDO/A");
                                    dialogo.dispose();
                                } else {
                                    JOptionPane.showMessageDialog(null, "USUARIO o CONTRASEÑA INCORRECTOS");
                                }
                            }
                        }
                    });
                    ingresar.setVisible(true);
                    dialogo.add(cancelar);
                    dialogo.add(ingresar);
                    dialogo.setVisible(true);
                }

            }
        });

        add(boton);
        setVisible(true);
    }

    static void main() {
        SwingUtilities.invokeLater(Ejercicio12::new);
    }
}
