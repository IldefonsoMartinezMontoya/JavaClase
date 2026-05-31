package RepasoListas;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;

public class Ejercicio10 {
    public static List<Character> crearSecuencia(String cadena) {
        List<Character> secuencia = new ArrayList<>();
        cadena = cadena.replace(" ", "");
        for (char c : cadena.toCharArray()) {
            secuencia.add(c);
        }
        return secuencia;
    }
    public static void completarSecuencia(List<Character> secuencia, int longitud) {
        Random random = new Random();
        while (secuencia.size() < longitud) {
            int posicionAleatoria = random.nextInt(secuencia.size() + 1);
            secuencia.add(posicionAleatoria, '-');
        }
    }
    public static double compararSecuencias(List<Character> secuenciaA, List<Character> secuenciaB) {
        // 1. Igualar longitudes antes de comparar si es necesario
        if (secuenciaA.size() < secuenciaB.size()) {
            completarSecuencia(secuenciaA, secuenciaB.size());
        } else if (secuenciaB.size() < secuenciaA.size()) {
            completarSecuencia(secuenciaB, secuenciaA.size());
        }

        // 2. Crear los objetos Iterator obligatorios para recorrer las listas
        Iterator<Character> itA = secuenciaA.iterator();
        Iterator<Character> itB = secuenciaB.iterator();

        int coincidencias = 0;
        int totalElementos = secuenciaA.size(); // Ambas miden lo mismo ahora

        // 3. Recorrer en orden carácter a carácter
        while (itA.hasNext() && itB.hasNext()) {
            char caracterA = itA.next();
            char caracterB = itB.next();

            // Se considera coincidencia si son iguales y NO son un guion '-'
            if (caracterA == caracterB && caracterA != '-') {
                coincidencias++;
            }
        }

        // 4. Calcular y devolver el porcentaje
        if (totalElementos == 0) {
            return 0.0; // Evitar división por cero si ambas listas estuvieran vacías
        }

        return ((double) coincidencias / totalElementos) * 100;
    }
}
