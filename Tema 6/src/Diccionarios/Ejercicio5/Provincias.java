package Diccionarios.Ejercicio5;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Provincias {
    static Map<String, Integer> filaAL = new TreeMap<>() {{
        filaAL.put("AL", 0);
        filaAL.put("CA", 484);
        filaAL.put("CO", 332);
        filaAL.put("GR", 160);
        filaAL.put("HU", 516);
        filaAL.put("JA", 228);
        filaAL.put("MA", 219);
        filaAL.put("SE", 422);
    }};
    static Map<String, Integer> filaCA = new TreeMap<>() {{
        filaAL.put("AL", 484);
        filaAL.put("CA", 0);
        filaAL.put("CO", 332);
        filaAL.put("GR", 160);
        filaAL.put("HU", 516);
        filaAL.put("JA", 228);
        filaAL.put("MA", 219);
        filaAL.put("SE", 422);
    }};
    static Map<String, Integer> filaC0 = new TreeMap<>() {{
        filaAL.put("AL", 332);
        filaAL.put("CA", 263);
        filaAL.put("CO", 0);
        filaAL.put("GR", 160);
        filaAL.put("HU", 516);
        filaAL.put("JA", 228);
        filaAL.put("MA", 219);
        filaAL.put("SE", 422);
    }};
    static Map<String, Integer> filaGR = new TreeMap<>() {{
        filaAL.put("AL", 160);
        filaAL.put("CA", 335);
        filaAL.put("CO", 166);
        filaAL.put("GR", 0);
        filaAL.put("HU", 516);
        filaAL.put("JA", 228);
        filaAL.put("MA", 219);
        filaAL.put("SE", 422);
    }};
    static Map<String, Integer> filaHU = new TreeMap<>() {{
        filaAL.put("AL", 516);
        filaAL.put("CA", 219);
        filaAL.put("CO", 232);
        filaAL.put("GR", 350);
        filaAL.put("HU", 0);
        filaAL.put("JA", 228);
        filaAL.put("MA", 219);
        filaAL.put("SE", 422);
    }};
    static Map<String, Integer> filaJA = new TreeMap<>() {{
        filaAL.put("AL", 228);
        filaAL.put("CA", 367);
        filaAL.put("CO", 104);
        filaAL.put("GR", 99);
        filaAL.put("HU", 336);
        filaAL.put("JA", 0);
        filaAL.put("MA", 219);
        filaAL.put("SE", 422);
    }};
    static Map<String, Integer> filaMA = new TreeMap<>() {{
        filaAL.put("AL", 219);
        filaAL.put("CA", 265);
        filaAL.put("CO", 187);
        filaAL.put("GR", 129);
        filaAL.put("HU", 313);
        filaAL.put("JA", 209);
        filaAL.put("MA", 0);
        filaAL.put("SE", 219);
    }};
    static Map<String, Integer> filaSE = new TreeMap<>() {{
        filaAL.put("AL", 422);
        filaAL.put("CA", 125);
        filaAL.put("CO", 138);
        filaAL.put("GR", 256);
        filaAL.put("HU", 94);
        filaAL.put("JA", 242);
        filaAL.put("MA", 219);
        filaAL.put("SE", 0);
    }};
    static  Map<String, Map<String, Integer>> tabla = new TreeMap<>() {{
        put("AL", filaAL);
    }};
    static List<String> provincias = new ArrayList<>();
    public static void proxima(String provincia) {}
    public static void distancia(String origen, String destino) {}
}
