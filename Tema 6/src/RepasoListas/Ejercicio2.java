package RepasoListas;

import java.text.CollationElementIterator;
import java.util.*;

public class Ejercicio2 {
    static void main() {
        Random r = new Random();
        List<Integer> lista = new ArrayList<>(20);
        for (int i = 0; i < 20; i++) {
            lista.add(r.nextInt(21));
        }
        int suma = 0;
        for (int elemento : lista) {
            suma += elemento;
        }
        System.out.println(suma);
        System.out.println(Collections.min(lista));
        System.out.println(Collections.max(lista));
        System.out.println(suma / lista.size());
    }
}
