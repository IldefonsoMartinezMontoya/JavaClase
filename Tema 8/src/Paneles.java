import javax.swing.*;
import java.awt.*;
public class Paneles extends JFrame{
    public Paneles() {
        setTitle("Paneles");
        setSize(480, 240);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        setBackground(Color.RED);
        JPanel panel = new JPanel();
        // Esta línea es opcional, pero es una buena práctica
        panel.setLayout(new FlowLayout());
        // Asignamos el panel a la ventana
        add(new JButton("Botón 1"));
        add(panel);
        panel.setBackground(Color.green);
        panel.add(new JButton("Botón 2"));
        panel.add(new JButton("Botón 3"));
        panel.add(new JButton("Botón 4"));
        // Hacemos visible la ventana
        setVisible(true);
        panel.setVisible(true);

    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(Paneles::new);
    }
}
