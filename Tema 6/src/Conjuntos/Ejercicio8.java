package Conjuntos;

import java.util.*;

public class Ejercicio8 {
    static void main() {
        Random r = new Random();
        List<Integer> lista = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            lista.add(r.nextInt(10, 100));
        }
        Set<Integer> sinDuplicados = new HashSet<>(lista);
        System.out.println(sinDuplicados);
    }
}
