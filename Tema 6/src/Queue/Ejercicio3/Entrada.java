package Queue.Ejercicio3;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class Entrada {
    private int id;
    private static  final AtomicInteger contador = new AtomicInteger(0);
    private Tipo tipo;
    private static final PriorityQueue<Entrada> cola = new PriorityQueue<>(Comparator.comparing(Entrada::getTipo));
    public Entrada(Tipo tipo) {
        setTipo(tipo);
        id = contador.incrementAndGet();
    }

    @Override
    public String toString() {
        return STR."Entrada #\{id} (\{tipo})";
    }

    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("[1] Nueva entrada VIP");
        System.out.println("[2] Nueva entrada Normal");
        System.out.println("[3] Pasar al siguiente");
        System.out.println("[4] Salir");
        int opcion;
        do {
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    Tipo tip = Tipo.VIP;
                    Entrada entrada = new Entrada(tip);
                    cola.add(entrada);
                    System.out.print("Creada: ");
                    System.out.println(entrada);
                    System.out.println(STR."Entadas en cola: \{cola.size()}");
                    break;
                case 2:
                    Tipo tip2 = Tipo.NORMAL;
                    Entrada e2 = new Entrada(tip2);
                    cola.add(e2);
                    System.out.print("Creada: ");
                    System.out.println(e2);
                    System.out.println(STR."Entadas en cola: \{cola.size()}");
                    break;
                case 3:
                    if (cola.isEmpty()) {
                        System.out.println("No hay entradas pendientes");
                    } else {
                        Entrada atendida = cola.poll();
                        System.out.println(STR."Atendiendo: Entrada # \{atendida.getId()} (\{atendida.getTipo()})");
                        System.out.println(STR."Entadas en cola: \{cola.size()}");
                    }
                    break;
            }
        } while (opcion != 4);
    }

    public Tipo getTipo() {
        return tipo;
    }
    public int getId() {
        return this.id;
    }

    private void setTipo(Tipo tipo) {
        if (!tipo.equals(Tipo.VIP) && !tipo.equals(Tipo.NORMAL)) {
            throw new IllegalArgumentException("Tiene que ser VIP o Normal");
        } else {
            this.tipo = tipo;
        }
    }
}
