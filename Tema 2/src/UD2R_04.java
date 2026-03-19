import java.util.IllegalFormatCodePointException;
import java.util.Scanner;

public class UD2R_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pA = 0;
        int pB = 0;
        int ventaja = 0;

        do {
            dibujarjuego(pA, pB, ventaja);
            char r;
            do {
                System.out.println("¿Quien gana? A/B:");
                r = sc.next().charAt(0);
            }while (r != 'A' && r != 'B');

            if (pA == 3 && pB == 3) { //40 iguales
                if (ventaja == 0 && r == 'A') {
                    ventaja = 1;
                } else if (ventaja == 0 && r == 'B') {
                    ventaja = 2;
                } else if (ventaja == 1 && r == 'A') {
                    pA++;
                    ventaja = 0;
                } else if (ventaja == 2 && r == 'B') {
                    pB++;
                    ventaja = 0;
                } else {
                    ventaja = 0;
                }
            }else {
                if (r == 'A') {
                    pA++;
                } else {
                    pB++;
                }
            }
        }while (pA < 4 && pB < 4);
        if (pA == 4){
            System.out.println("Ha ganado A");
        }else {
            System.out.println("Ha ganado B");
        }
    }

    public static void dibujarjuego(int pA, int pB, int ventaja) {
        System.out.println(mostrarpuntos(pA) + "-" + mostrarpuntos(pB));
        if (ventaja == 1){
            System.out.println("A tiene la ventaja");
        } else if (ventaja == 2) {
            System.out.println("B tiene la ventaja");
        }
        }


    public static int mostrarpuntos(int P){
        int puntos;
        switch (P){
            case 0:
                puntos = 0;
                break;
            case 1:
                puntos = 15;
                break;
            case 2:
                puntos = 30;
                break;
            case 3:
                puntos = 40;
                break;
            default:
                puntos = 0;
        }
        return puntos;
    }
}
