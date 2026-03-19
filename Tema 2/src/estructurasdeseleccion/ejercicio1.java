package estructurasdeseleccion;

import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int ficha1laod1 = sc.nextInt();
        int ficha1lado2 = sc.nextInt();
        int ficha2lado1 = sc.nextInt();
        int ficha2lado2 = sc.nextInt();

        if (ficha1laod1 < 1 || ficha1laod1 > 6 || ficha1lado2 < 1 || ficha1lado2 > 6
        || ficha2lado1 < 1 || ficha2lado1 > 6 || ficha2lado2 < 1 || ficha2lado2 > 6){
            System.out.println("Fichas no válidas");
        }

        if (ficha1laod1 == ficha2lado1 || ficha1laod1 == ficha2lado2 || ficha1lado2 == ficha2lado2 || ficha1lado2 == ficha2lado1){
            System.out.println("Pueden conectarse");
        }else {
            System.out.println("No pueden conectarse");
        }
    }
}
