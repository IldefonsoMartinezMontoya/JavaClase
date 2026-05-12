package DiseñoDeLayouts;

import javax.swing.*;
import javax.swing.border.MatteBorder;
import java.awt.*;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;

public class Ejercicio5 extends JFrame{
    String fechaActual = new SimpleDateFormat("MM/yyyy").format(new Date());
    public Ejercicio5() {
        setTitle("Reproductor Multimedia");
        setSize(700, 300);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout(10, 0));

        JPanel panel1 = new JPanel();
        panel1.setLayout(new GridLayout(1, 3));
        panel1.setBorder(new MatteBorder(0, 0, 2, 0, Color.BLACK));

        JLabel fecha = new JLabel(fechaActual, SwingConstants.CENTER);
        panel1.add(fecha);
        JLabel tiempo = new JLabel("00:00 / 04:03", SwingConstants.CENTER);
        panel1.add(tiempo);
        JLabel formato = new JLabel("Formato: MP3", SwingConstants.CENTER);
        panel1.add(formato);
        add(panel1, BorderLayout.NORTH);
        panel1.setVisible(true);

        JPanel panel2 = new JPanel();
        panel2.setLayout(new BorderLayout(2, 2));
        panel2.setBorder(new MatteBorder(0, 0, 2, 0, Color.BLACK));

        JLabel musica = new JLabel("Supersubmarina - Extrema Debilididad", SwingConstants.CENTER);
        panel2.add(musica);
        add(panel2, BorderLayout.CENTER);
        setVisible(true);
        panel2.setVisible(true);

        JPanel panel3 = new JPanel();
        panel3.setPreferredSize(new Dimension(700, 75));
        panel3.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 25));

        Dimension tamaño = new Dimension(90, 30);
        JButton atras = new JButton("⏮");
        atras.setPreferredSize(tamaño);
        panel3.add(atras);
        JButton pauseplay = new JButton(" ⏯");
        pauseplay.setPreferredSize(tamaño);
        panel3.add(pauseplay);
        JButton adelante = new JButton("⏭");
        adelante.setPreferredSize(tamaño);
        panel3.add(adelante);
        JButton parar = new JButton("⏹");
        parar.setPreferredSize(tamaño);
        panel3.add(parar);
        add(panel3, BorderLayout.SOUTH);
        panel3.setVisible(true);

        setVisible(true);
    }

    static void main() { SwingUtilities.invokeLater(Ejercicio5::new); }
}
