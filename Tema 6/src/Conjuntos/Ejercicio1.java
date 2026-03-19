package Conjuntos;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Ejercicio1 {
    static void main() {
        Set<Integer> numeric = new HashSet<>();
        for (int i = 0; i < 100; i+= 10) {
            numeric.add(i);
        }
        System.out.println(numeric);
        for (int v : numeric) {
            System.out.print(STR."\{v} ");
        }
    }
}
