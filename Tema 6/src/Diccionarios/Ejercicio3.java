package Diccionarios;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio3 {
    static Scanner sc = new Scanner(System.in);
    static String palabreja;
    static Map<LocalDate, Integer> fecha = new HashMap<>();
    static void main() {
            while (meterfechas());
        }

    private static boolean meterfechas() {
        palabreja = sc.nextLine();
        if (palabreja.isEmpty()) {
            System.out.println(STR."Fechas de sorteos válidas: \{fecha}");
            String comprobarFecha = sc.nextLine();
            String subpalabra = palabreja.substring(12);
            int contador = 0;
            if (palabreja.matches(comprobarFecha)) {
                for (int i = 0; i < subpalabra.length(); i++) {
                    if (comprobarFecha.matches(subpalabra)) {
                        contador++;
                    }
                    System.out.println(STR."Aciertos: \{contador}");
                }
            } else {
                return false;
            }
            return false;
        } else {
            if (palabreja.matches("\\d{4}-(0[1-9]|1[0-2])-(0[1-9]|[12][0-9]|3[01]) (\\d{1,2}\\s)\\d{1,2}")) {
                String subpalabra1 =  palabreja.substring(0, 11);
                LocalDate fech = LocalDate.parse(subpalabra1);
                if (fecha.containsKey(fech)) {
                    fecha.put(fech, fecha.get(fech) + 1);
                } else {
                    fecha.put(fech, 1);
                }
            }
        }
        return true;
    }
    private static void mostrar() {
        String comprobarFecha = sc.nextLine();
        String subpalabra = palabreja.substring(12);
        int contador = 0;
        if (palabreja.matches(comprobarFecha)) {
            for (int i = 0; i < subpalabra.length(); i++) {
                if (comprobarFecha.matches(subpalabra)) {
                    contador++;
                }
                System.out.println(STR."Aciertos: \{contador}");
            }
        }
    }
}

