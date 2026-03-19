package estructurasdeseleccion;

import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int recto = sc.nextInt();
        int angulo2 = sc.nextInt();
        int angulo3 = sc.nextInt();
        int triangulo; triangulo = recto + angulo2 + angulo3;

        if (triangulo > 180){
            System.out.println("No es posible formar un triángulo");
        } else if (recto == 90) {
            System.out.println("Triángulo rectángulo");
        } else if (recto < 90) {
            System.out.println("Triángulo acutángulo");
        }else if (recto > 90){
            System.out.println("Triángulo obtusángulo");
        }
    }
}
