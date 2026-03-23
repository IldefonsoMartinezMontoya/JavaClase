package Direcciones;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio1 {
    static void main() {
        while (introducirPalabras());
    }
    public static boolean introducirPalabras() {
        Scanner sc = new Scanner(System.in);
        String palabreja = sc.next();
        Map<String, Integer> diccionario = new HashMap<>();
        if (palabreja.equalsIgnoreCase(".")) {
            return false;
        } else {
            diccionario.put(palabreja, 1);
            Integer numero = diccionario.get(palabreja);
            numero++;
        }
        return true;
    }
}
