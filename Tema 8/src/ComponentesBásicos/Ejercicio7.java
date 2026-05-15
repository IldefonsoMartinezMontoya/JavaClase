package ComponentesBásicos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ejercicio7 extends JFrame {
    public Ejercicio7() {
        setTitle("Copiando el día de la semana");
        setSize(640, 120);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JTextField textamen = new JTextField("Pulsa un Botón", 20);
        textamen.setHorizontalAlignment(JTextField.CENTER);

        ActionListener listenerDias = e -> {
            textamen.setText(e.getActionCommand());
        };

        JPanel dias = new JPanel(new FlowLayout(FlowLayout.CENTER, 5, 2));
        String[] nombresDias = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};

        for (String dia : nombresDias) {
            JButton boton = new JButton(dia);
            boton.addActionListener(listenerDias);
            dias.add(boton);
        }

        add(dias, BorderLayout.NORTH);
        add(textamen, BorderLayout.SOUTH);

        setVisible(true);
    }
    static void main(String[] args) {
        SwingUtilities.invokeLater(Ejercicio7::new);
    }
}