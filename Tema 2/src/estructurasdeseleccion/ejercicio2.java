package estructurasdeseleccion;

import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nota = sc.nextDouble();

        if (nota < 2){
            System.out.println("Deficiente");
        } else if (nota == 2 || nota == 3 || nota == 4) {
            System.out.println("Insuficiente");
        } else if (nota == 5) {
            System.out.println("Suficiente");
        } else if (nota == 6) {
            System.out.println("Bien");
        } else if (nota == 7 || nota == 8) {
            System.out.println("Notable");
        } else if (nota == 9 || nota == 10) {
            System.out.println("Sobresaliente");
        } else if (nota < 0 || nota > 10) {
            System.out.println("Nota incorrecta");
        }
    }
}
