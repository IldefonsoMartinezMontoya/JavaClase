package Listas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Ejercicio8 {
    public static void main(String[] args) {
        Random r = new Random();
        ArrayList<Integer> lista = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            lista.add(r.nextInt(10, 100));
        }
        System.out.println(lista);
        System.out.println(Collections.min(lista));
        System.out.println(Collections.max(lista));
    }
}
