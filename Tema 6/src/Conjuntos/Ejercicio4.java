package Conjuntos;

import java.util.*;

public class Ejercicio4 {
    static void main() {
        Random r = new Random();
        Set<Integer> conjunto = new HashSet<>();
        while (conjunto.size() < 6) {
            conjunto.add(r.nextInt(1, 50));
        }
        List<Integer> lista = new ArrayList<>(conjunto);
        Collections.sort(lista);
        System.out.println(lista);
    }
}
