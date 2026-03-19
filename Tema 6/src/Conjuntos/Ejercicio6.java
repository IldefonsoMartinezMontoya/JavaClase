package Conjuntos;

import java.util.*;

public class Ejercicio6 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        Set<String> conjuntoA = new TreeSet<>();
        Set<String> conjuntoB = new TreeSet<>();
        String palabreja;
        do {
            palabreja = sc.next();
            conjuntoA.add(palabreja);
        } while (!palabreja.equalsIgnoreCase("fin"));
        do {
            palabreja = sc.next();
            conjuntoB.add(palabreja);
        } while (!palabreja.equalsIgnoreCase("fin"));
        System.out.println(conjuntoA);
        System.out.println(conjuntoB);
        List<String> comunes = new ArrayList<>(conjuntoA);
        List<String> noComunes = new ArrayList<>(conjuntoB);
        comunes.retainAll(conjuntoB);
        System.out.println(comunes);
        comunes.removeAll(conjuntoB);
        System.out.println(comunes);
        noComunes.removeAll(conjuntoA);
        System.out.println(noComunes);
    }
}
