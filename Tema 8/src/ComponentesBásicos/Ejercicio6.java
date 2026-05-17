package ComponentesBásicos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class Ejercicio6 extends JFrame {
    static int contador = 0;
    public Ejercicio6() {
        setTitle("Incrementando y Decrementando");
        setSize(300, 120);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(true);
        setLayout(new FlowLayout(FlowLayout.CENTER, 10, 0));
        JButton decremento = new JButton("-1");
        JButton cero = new JButton(String.valueOf(contador));
        JButton incremento = new JButton("+1");
        decremento.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                contador--;
                cero.setText(String.valueOf(contador));
            }
        });
        add(decremento);
        cero.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                contador = 0;
                cero.setText("0");
            }
        });
        add(cero);
        incremento.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                contador++;
                cero.setText(String.valueOf(contador));
            }
        });
        add(incremento);
        setVisible(true);
    }
    static void main() {
        SwingUtilities.invokeLater(Ejercicio6::new);
    }
}
