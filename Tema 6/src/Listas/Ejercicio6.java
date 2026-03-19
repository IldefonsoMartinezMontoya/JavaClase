package Listas;

import java.util.ArrayList;
import java.util.Random;

public class Ejercicio6 {
    public static void main(String[] args) {
        Random r = new Random();
        ArrayList<Integer> todos = new ArrayList<>(20);
        for (int i = 0; i < 20; i++) {
            todos.add(r.nextInt(100));
        }
        ArrayList<Integer> pares = new ArrayList<>();
        ArrayList<Integer> impares = new ArrayList<>();
        for (int numero : todos) {
            if (numero % 2 == 0) {
                pares.add(numero);
            } else {
                impares.add(numero);
            }
        }
        System.out.println(todos);
        System.out.println(pares);
        System.out.println(impares);
    }
}
