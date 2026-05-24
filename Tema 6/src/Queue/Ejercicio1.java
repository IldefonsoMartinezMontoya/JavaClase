package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class Ejercicio1 {
    static void main() {
        Queue<Integer> colaOriginal = new LinkedList<>();
        colaOriginal.add(10);
        colaOriginal.add(20);
        colaOriginal.add(30);
        colaOriginal.add(40);
        System.out.println(STR."Cola original al inicio: \{colaOriginal}");

        Queue<Integer> colaInvertida = new LinkedList<>();
        LinkedList<Integer> listaIntermedia = new LinkedList<>();
        Queue<Integer> colaAuxiliar = new LinkedList<>();
        while (!colaOriginal.isEmpty()) {
            int elemento = colaOriginal.poll();
            listaIntermedia.add(elemento);
            colaAuxiliar.add(elemento);
        }
        while (!colaAuxiliar.isEmpty()) {
            colaOriginal.add(colaAuxiliar.poll());
        }
        while (!listaIntermedia.isEmpty()) {
            colaInvertida.add(listaIntermedia.removeFirst());
        }
        System.out.println(STR."Cola original al final : \{colaOriginal}");
        System.out.println(STR."Nueva cola invertida   : \{colaInvertida}");
    }
}
