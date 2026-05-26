package ComponentesAvanzados;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Random;

public class Ejercicio4 extends JFrame {
    public Ejercicio4() {
        setTitle("Simulador de Dados");
        setSize(800, 600);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(3, 0));
        JPanel superior = new JPanel();
        JLabel cantidadDados = new JLabel("Cantidad de Dados: ");
        SpinnerNumberModel numDads = new SpinnerNumberModel(1, 1, 5, 1);
        JSpinner spinnerDados = new JSpinner(numDads);
        JButton BOTON = new JButton("Lanzar");
        superior.add(cantidadDados);
        superior.add(spinnerDados);
        superior.add(BOTON);
        superior.setVisible(true);

        JPanel central = new JPanel(new FlowLayout(FlowLayout.CENTER, 15, 0));
        JLabel[] dados = new JLabel[5];
        for (int i = 0; i < dados.length; i++) {
            dados[i] = new JLabel();
            central.add(dados[i]);
        }
        central.setVisible(true);
        JPanel inferiror = new JPanel();
        JTextArea texto = new JTextArea(8,40);
        texto.setEditable(false);
        JScrollPane dentroTexto = new JScrollPane(texto);
        inferiror.add(dentroTexto);
        inferiror.setVisible(true);
        List<String> historial = new ArrayList<>();
        BOTON.addActionListener(e -> {
            texto.setText("");
            Random r = new Random();
            int cantidad = (int) spinnerDados.getValue();
            int contador = 0;
            for (int i = 0; i < dados.length; i++) {
                if (i < cantidad) {
                    int valor = r.nextInt(1, 7);
                    contador += valor;
                    ImageIcon icono = new ImageIcon(Objects.requireNonNull(getClass().getResource(STR."/ComponentesAvanzados/Imagenes/\{valor}.jpg")));
                    Image imagenEscalada = icono.getImage().getScaledInstance(80, 80, Image.SCALE_SMOOTH);
                    ImageIcon iconoFinal = new ImageIcon(imagenEscalada);
                    dados[i].setIcon(iconoFinal);
                } else {
                    dados[i].setIcon(null);
                }
            }
            texto.setText(String.valueOf(contador));
            String registroActual = STR."Tirada: \{cantidad} dados -> Suma total = \{contador}";
            historial.add(registroActual);
            if (historial.size() > 10) {
                historial.removeFirst();
            }

        });

        add(superior);
        add(central);
        add(inferiror);
        setVisible(true);
    }

    static void main() {
        SwingUtilities.invokeLater(Ejercicio4::new);
    }
}
