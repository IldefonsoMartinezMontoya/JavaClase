package DiseñoDeLayouts.Ejercicio6;

import javax.swing.*;
import java.awt.*;

public class HojaCalculoFrame extends JFrame {
    private int numFilas;
    private int numColumnas;
    private char Caracter;
    private int fila;

    public HojaCalculoFrame(int numFilas, int numColumnas, char caracter, int fila) throws HeadlessException {
        setNumFilas(numFilas);
        setNumColumnas(numColumnas);
        setCaracter(caracter);
        setFila(fila);
    }
    public void Hoja() {
        setTitle("Hoja de Calculo");
        setSize(800, 600);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        JPanel total = new JPanel(new BorderLayout());
        JPanel rejilla = new JPanel(new GridLayout(getNumFilas(), getNumColumnas()));
        total.add(rejilla, BorderLayout.CENTER);
        for (int i = 0; i < getNumColumnas(); i++) {
            JLabel num = new JLabel()
        }

    }
    public int getNumFilas() {
        return numFilas;
    }

    public void setNumFilas(int numFilas) {
        if (numFilas <= 0) {
            throw new IllegalArgumentException("No puede no tener filas");
        } else {
            this.numFilas = numFilas;
        }
    }

    public int getNumColumnas() {
        return numColumnas;
    }

    public void setNumColumnas(int numColumnas) {
        if (numColumnas <= 0) {
            throw new IllegalArgumentException("No puede no tener columnas");
        } else {
            this.numColumnas = numColumnas;
        }
    }

    public char getCaracter() {
        return Caracter;
    }

    public void setCaracter(char caracter) {
        if (caracter == ' ') {
            throw new IllegalArgumentException("No puede estar vacío");
        } else {
            Caracter = caracter;
        }
    }

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        if (fila < 0) {
            throw new IllegalArgumentException("No puede ser negativo");
        } else {
            this.fila = fila;
        }
    }
}
