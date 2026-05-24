package ComponentesAvanzados;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Ejercicio3 extends JFrame {
    private JTextArea texto;
    public Ejercicio3() {
        setTitle("OreEditor");
        setSize(800, 600);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(2, 0));

        JPanel textico = new JPanel(new BorderLayout());
        texto = new JTextArea();
        JScrollPane desplazable = new JScrollPane(texto);
        textico.add(desplazable);
        textico.setVisible(true);

        JPanel bar = new JPanel();
        JMenuBar menu = new JMenuBar();

        JMenu Archivo = new JMenu("Archivo");
        JMenuItem nuevo = new JMenuItem("nuevo");
        nuevo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                texto.setText("");
            }
        });
        JMenuItem abrir = new JMenuItem("abrir");
        JMenuItem guardar = new JMenuItem("guardar");
        guardar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser selector = new JFileChooser();
                selector.setDialogTitle("Guardar archivo");

                int seleccion = selector.showSaveDialog(Ejercicio3.this);
                if (seleccion == JFileChooser.APPROVE_OPTION) {
                    java.io.File archivo = selector.getSelectedFile();
                    try (java.io.BufferedWriter br = new java.io.BufferedWriter(new java.io.FileWriter(archivo))){
                        br.write(texto.getText());
                        JOptionPane.showMessageDialog(Ejercicio3.this, "Archivo guardado exitosamente",
                                "Guarado", JOptionPane.INFORMATION_MESSAGE);
                    } catch (java.io.IOException ex) {
                        JOptionPane.showMessageDialog(Ejercicio3.this,
                                STR."Error al guardar el archivo: \{ex.getMessage()}",
                                "Error",
                                JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        });
        JSeparator separadora = new JSeparator();
        JMenuItem salir = new JMenuItem("salir");
        salir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        Archivo.add(nuevo);
        Archivo.add(abrir);
        Archivo.add(guardar);
        Archivo.add(separadora);
        Archivo.add(salir);

        JMenu Edicion = new JMenu("Edición");
        JMenuItem copiar = new JMenuItem("copiar");
        JMenuItem cortar = new JMenuItem("cortar");
        JMenuItem pegar = new JMenuItem("pegar");
        Edicion.add(copiar);
        Edicion.add(cortar);
        Edicion.add(pegar);

        menu.add(Archivo);
        menu.add(Edicion);

        bar.add(menu);
        add(bar);
        add(textico);
        setVisible(true);
    }

    static void main() {
        SwingUtilities.invokeLater(Ejercicio3::new);
    }
}
