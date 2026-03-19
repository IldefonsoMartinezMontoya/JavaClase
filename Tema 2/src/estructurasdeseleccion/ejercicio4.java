package estructurasdeseleccion;

import java.io.FilterOutputStream;
import java.util.Scanner;

public class ejercicio4 {
    public static double carta(int carta) {
        if (carta <= 7 && carta >= 1) {
            return carta;
        } else if (carta == 10 || carta == 11 || carta == 12) {
            return 0.5;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double total = 0;

        for (int i = 1; i < 3; i++) {
            int carta = sc.nextInt();
            total += carta(carta);
        }
        System.out.println("Tu puntuación es: "+ total);

        if (total < 7.5){
            System.out.println("Te has quedado corto");
        } else if (total == 7.5) {
            System.out.println("¡Has ganado!");
        }else {
            System.out.println("Te has pasado");
        }
    }
}