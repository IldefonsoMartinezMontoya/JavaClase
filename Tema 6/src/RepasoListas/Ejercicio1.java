package RepasoListas;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio1 {
    static void main() {
        List<Integer> lista = new ArrayList<>();

        for (int i = 0; i < 100; i+= 10) {
            lista.add(i);
            System.out.println();
        }
        System.out.println(lista);
        for (int elemento : lista) {
            System.out.print(STR."\{elemento} ");
        }
        System.out.println();
        for (int elemento : lista.reversed()) {
            System.out.print(STR."\{elemento} ");
        }
    }
}
