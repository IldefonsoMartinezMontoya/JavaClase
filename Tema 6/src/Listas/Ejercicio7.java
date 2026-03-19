package Listas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Ejercicio7 {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();
        for (int i = 0; i < 49; i++) {
            lista.add(i);
        }
        Collections.shuffle(lista);
        List<Integer> resultadoSorteo = lista.subList(0, 6);

        System.out.println(lista);
        System.out.println(resultadoSorteo);
    }
}
