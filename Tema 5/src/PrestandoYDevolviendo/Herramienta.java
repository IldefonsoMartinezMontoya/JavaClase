package PrestandoYDevolviendo;

import java.util.Scanner;

public class Herramienta {
    private boolean prestado;
    private boolean prestamo;
    public void prestar() {
        prestado = true;
        System.out.println("No lo tengo");
    }
    public void devolver() {
        System.out.println("¿Me lo devuelves?");
        Scanner sc = new Scanner(System.in);
        char a = sc.next().charAt(0);
        switch (a) {
            case 'S':
                System.out.println("Devuelto");
                prestamo = false;
                break;
            case 'N':
                System.out.println("No devuelto");
                prestamo = true;
                break;
            default:
                System.out.println("Te Quieroooooooooooo");
        }
    }
}
