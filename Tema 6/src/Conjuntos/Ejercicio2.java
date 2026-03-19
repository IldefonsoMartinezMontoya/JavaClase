package Conjuntos;

import java.util.*;

public class Ejercicio2 {
    static void main() {
        Random r = new Random();
        Set<Integer> numeric1 = new HashSet<>(20);
        Set<Integer> numeric2 = new TreeSet<>();
        Set<Integer> numeric3 = new LinkedHashSet<>(20);
        for (int i = 0; i < 20; i++) {
            numeric1.add(r.nextInt(10, 100));
            numeric2.add(r.nextInt(10, 100));
            numeric3.add(r.nextInt(10, 100));
        }
        System.out.println(numeric1);
        System.out.println(numeric2);
        System.out.println(numeric3);
    }
}
