package Conjuntos;

import java.util.*;

public class Ejercicio7 {
    static void main() {
        Set<String> listaCoches = new HashSet<>();
        while(seleccionarCoches(listaCoches));
    }
    public static boolean seleccionarCoches(Set<String> listaCoches) {
        Scanner sc = new Scanner(System.in);
        String modeloCoche = sc.nextLine();
        int contador = 0;
        while (!modeloCoche.isEmpty()) {
            contador++;
            listaCoches.add(modeloCoche);
            modeloCoche = sc.nextLine();
        }
        List<String> listaOrdenada = new ArrayList<>(listaCoches);
        System.out.println(STR."Se han introducido \{contador} coches");
        System.out.println(listaOrdenada);
        return false;
    }
}
