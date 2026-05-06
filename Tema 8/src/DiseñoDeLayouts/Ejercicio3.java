package DiseñoDeLayouts;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class Ejercicio3 extends JFrame {
    double num1 = 0;
    String operador = "";
    int contadorIgual = 0;
    public Ejercicio3() {
        setTitle("Calculadora Básica");
        setSize(480, 600);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        JTextField campo = new JTextField();
        campo.setHorizontalAlignment(JTextField.RIGHT);
        campo.setFont(new Font("Arial", Font.PLAIN, 40));
        campo.setPreferredSize(new Dimension(100, 100));
        add(campo, BorderLayout.NORTH);
        ActionListener listener = e -> {
            JButton boton = (JButton) e.getSource();
            String texto = boton.getText();
            if (texto.matches("[0-9.]")) {
                campo.setText(campo.getText() + texto);
            } else if (texto.matches("[+\\-x/]")) {
                num1 = Double.parseDouble(campo.getText());
                operador = texto;
                campo.setText("");
            } else if (texto.equals("=")) {
                contadorIgual++;
                if (contadorIgual == 2) {
                    campo.setText("");
                    num1 = 0;
                    operador = "";
                    contadorIgual = 0;
                    return;
                }
                double num2 = Double.parseDouble(campo.getText());
                double resultado = 0;
                if (operador.equals("+")) {
                    resultado = num1 + num2;
                } else if (operador.equals("-")) {
                    resultado = num1 - num2;
                } else if (operador.equals("x")) {
                    resultado = num1 * num2;
                } else if (operador.equals("/")) {
                    resultado = num1 / num2;
                }
                campo.setText(String.valueOf(resultado));
            } else {
                contadorIgual = 0;
            }
        };
        JPanel panelNumerico = new JPanel();
        add(panelNumerico);
        panelNumerico.setLayout(new GridLayout(4, 4));
        for (int i = 7; i < 10; i++) {
            JButton boton = new JButton(String.valueOf(i));
            boton.addActionListener(listener);
            panelNumerico.add(boton);
        }
        JButton botondiv = new JButton("/");
        botondiv.addActionListener(listener);
        panelNumerico.add(botondiv);
        for (int i = 4; i < 7; i++) {
            JButton boton = new JButton(String.valueOf(i));
            boton.addActionListener(listener);
            panelNumerico.add(boton);
        }
        panelNumerico.add(new JButton("x"));
        for (int i = 1; i < 4; i++) {
            JButton boton = new JButton(String.valueOf(i));
            boton.addActionListener(listener);
            panelNumerico.add(boton);
        }
        JButton botonmenos = new JButton("-");
        botonmenos.addActionListener(listener);
        panelNumerico.add(botonmenos);
        JButton botonpunto = new JButton(".");
        botonpunto.addActionListener(listener);
        panelNumerico.add(botonpunto);
        JButton boton0 = new JButton(String.valueOf(0));
        boton0.addActionListener(listener);
        panelNumerico.add(boton0);
        JButton botonigual= new JButton("=");
        botonigual.addActionListener(listener);
        panelNumerico.add(botonigual);
        JButton botonmas = new JButton("+");
        botonmas.addActionListener(listener);
        panelNumerico.add(botonmas);

        panelNumerico.setVisible(true);
        setVisible(true);

    }

    static void main() {
        SwingUtilities.invokeLater(Ejercicio3::new);
    }
}
