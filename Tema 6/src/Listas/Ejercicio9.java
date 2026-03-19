package Listas;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Ejercicio9 {
    public static void main(String[] args) {
        Random r = new Random();
        ArrayList<Integer> lista = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            lista.add(r.nextInt(10, 100));
        }
        Collections.sort(lista);
        System.out.println(lista);
        ArrayList<Integer> lista2 = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            lista2.add(r.nextInt(10, 100));
        }
        Collections.sort(lista2);
        System.out.println(lista2);
        ArrayList<Integer> fusion = combinar(lista, lista2);
        System.out.println(fusion);
    }
    public static ArrayList<Integer> combinar(ArrayList<Integer> l1, ArrayList<Integer> l2) {
        ArrayList<Integer> ressultado = new ArrayList<>();
        int i = 0;
        int j = 0;
        while (i < l1.size() && j < l2.size()) {
            if (l1.get(i) <= l2.get(j)) {
                ressultado.add(l1.get(i));
                i++;
            } else {
                ressultado.add(l2.get(j));
                j++;
            }
        }
        while (i < l1.size()) {
            ressultado.add(l1.get(i));
            i++;
        }
        while (j < l2.size()) {
            ressultado.add(l2.get(j));
            j++;
        }
        return ressultado;
    }
}
