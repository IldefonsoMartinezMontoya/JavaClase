package Listas.Ejercicio10;

import java.util.ArrayList;
import java.util.Random;

public class Ejercicio10 {
    Random r = new Random();
    private final ArrayList<Character> lista = new ArrayList<>();
    private final ArrayList<Character> lista2 = new ArrayList<>();
    private String secuencia;
    public Ejercicio10(String secuencia) {
        setSecuencia(secuencia);
    }
    public void crearSecuencia() {
        char[] caracteres = secuencia.toCharArray();
        for (char c : caracteres) {
            lista.add(c);
            lista2.add(c);
        }
        System.out.println(lista);
    }
    public void completarSecuencia(int longitud) {
        int añadir = longitud - lista.size();
        for (int i = 0; i < añadir; i++) {
            int indiceAleatorio = r.nextInt(lista.size() + 1);
            lista2.add(indiceAleatorio, '-');
        }
        System.out.println(lista2);
    }
    public void compararSecuencia() {
        int contador2 = 0;
        for (int i = lista2.size() - 1; i >= 0; i--) {
            if (lista2.get(i) != '-') {
                contador2++;
            }
        }
        double total =  (double) contador2 / lista2.size() * 100;
        System.out.printf("%.2f", total );
        System.out.println("%");
    }
    public void limpiar() {
        lista.clear();
        lista2.clear();
    }
    public String getSecuencia() {
        return secuencia;
    }
    public void setSecuencia(String secuencia) {
        if (secuencia.isBlank()) {
            throw new IllegalArgumentException("No puede estar vacía");
        } else {
            this.secuencia = secuencia;
        }
    }

}
