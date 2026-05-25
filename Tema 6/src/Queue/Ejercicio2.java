package Queue;

import java.util.Scanner;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.regex.Pattern;

public class Ejercicio2 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        BlockingQueue<String> cola = new ArrayBlockingQueue<>(5);
        while (true) {
            String opcion = sc.nextLine().trim();
            if (opcion.equalsIgnoreCase("fin")) {
                System.out.println(STR."Clientes en cola: \{cola.size()}");
                break;
            } else if (opcion.matches("LLEGA .+")) {
                String nombre = opcion.substring(6);
                if (cola.remainingCapacity() > 0) {
                    cola.add(nombre);
                    System.out.println(STR."\{nombre} entra a la cola");
                } else {
                    System.out.println(STR."\{nombre} no cabe en la cola");
                }
            } else if (opcion.equals("SIGUIENTE")) {
                if (!cola.isEmpty()) {
                    String elemento = cola.poll();
                    System.out.println(STR."Es el turno de \{elemento}");
                } else {
                    System.out.println("No hay nadie esperando en la cola");
                }
            } else if (opcion.matches("^SALE \\w+")) {
                String nombre = opcion.substring(5);
                if (cola.contains(nombre)) {
                    cola.remove(nombre);
                    System.out.println(STR."\{nombre} abandona la cola");
                } else {
                    System.out.println("Cliente desconocido");
                }
            } else {
                System.out.println("Error: No es el formato correcto. Intente de nuevo.");
            }
        }
    }
}