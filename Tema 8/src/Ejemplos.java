import javax.swing.*;
import java.awt.*;

public class Ejemplos extends JFrame {
    public Ejemplos() {
        setTitle("Ejemplo");
        setSize(480, 240);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //FlowLayout
        //setLayout(new FlowLayout(FlowLayout.LEFT, 20,//Separacion Horizontal 10 //Vertical));
        //add(new JButton("Botón 1"));
        //add(new JButton("Botón 2"));
        //add(new JButton("Botón 3"));
        //add(new JButton("Botón 4"));
        //add(new JButton("Botón 5"));
        //setVisible(true);

        //BorderLayout
        //add(new JButton("PAGE_START"), BorderLayout.PAGE_START);
        //add(new JButton("PAGE_END"), BorderLayout.PAGE_END);
        //add(new JButton("LINE_START"), BorderLayout.LINE_START);
        //add(new JButton("LINE_END"), BorderLayout.LINE_END);
        //add(new JButton("CENTER"), BorderLayout.CENTER);
        //setVisible(true);

        //GridLayout
        //setLayout(new GridLayout(3, 0, 10, 10));
        //add(new JButton("Botón 1"));
        //add(new JButton("Botón 2"));
        //add(new JButton("Botón 3"));
        //add(new JButton("Botón 4"));
        //add(new JButton("Botón 5"));
        //add(new JButton("Botón 6"));
        //add(new JButton("Botón 7"));
        //add(new JButton("Botón 8"));
        //add(new JButton("Botón 9"));
        //add(new JButton("Botón 10"));
        //setVisible(true);

        //BoxLayout
        //EspacioFijo
        //setLayout(new BoxLayout(getContentPane(), BoxLayout.X_AXIS));
        //add(new JButton("Botón 1"));
        //add(Box.createHorizontalStrut(25)); // Espacio horizontal
        //add(new JButton("Botón 2"));
        //add(new JButton("Botón 3"));
        //add(new JButton("Botón 4"));
        //add(new JButton("Botón 5"));
        //add(new JButton("Botón 6"));
        //add(new JButton("Botón 7"));
        //setVisible(true);
        //EspacioFlexible
        //setLayout(new BoxLayout(getContentPane(), BoxLayout.X_AXIS));
        //add(Box.createHorizontalGlue()); // Espacio flexible
        //add(new JButton("Botón 1"));
        //add(new JButton("Botón 2"));
        //add(new JButton("Botón 3"));
        //setVisible(true);
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(Ejemplos::new);
    }

}
