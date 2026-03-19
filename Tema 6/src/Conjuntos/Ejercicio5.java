package Conjuntos;

import java.util.*;

public class Ejercicio5 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        Set<String> conjunto = new LinkedHashSet<>();
        String palabreja;
        int contador = 0;
        do {
            contador++;
            palabreja = sc.next();
            conjunto.add(palabreja);
        } while (!palabreja.equalsIgnoreCase("."));
        System.out.println(STR."Se han introducido \{contador} palabras únicas");
        System.out.println(conjunto);
    }
}
