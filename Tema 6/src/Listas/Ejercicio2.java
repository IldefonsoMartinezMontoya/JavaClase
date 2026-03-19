package Listas;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;

public class Ejercicio2 {
    public static void main(String[] args) {
        Random r = new Random();
        ArrayList<Integer> lista = new ArrayList<Integer>(20);
        for (int i = 0; i < 20; i++) {
            lista.add(r.nextInt(21));
        }
        System.out.println(lista);
        int total = 0;
        for (int numero : lista) {
            total += numero;
        }
        System.out.println(total);
        int min = Collections.min(lista);
        System.out.println(min);
        int max = Collections.max(lista);
        System.out.println(max);
        int avg = total / lista.size();
        System.out.println(avg);
    }
}
