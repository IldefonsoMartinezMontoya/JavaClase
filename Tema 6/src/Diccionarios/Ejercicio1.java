package Diccionarios;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Ejercicio1 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        String palabreja = sc.next();
        Map<String, Integer> diccionario = new TreeMap<>();
        while (true) {
            if (palabreja.equalsIgnoreCase(".")) {
                break;
            } else {
                palabreja = palabreja.toLowerCase();
                if (diccionario.containsKey(palabreja)) {
                    diccionario.put(palabreja, diccionario.get(palabreja) + 1);
                } else {
                    diccionario.put(palabreja, 1);
                }
                for (Map.Entry<String, Integer> entry : diccionario.entrySet()) {
                    System.out.println(STR."\{entry.getKey()}: \{entry.getValue()}");
                }
            }
        }
    }
}

