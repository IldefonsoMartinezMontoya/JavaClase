package estructurasderepeticion;

import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero;
        int anterior;
        boolean creciente = false;
        boolean decreciente = false;
        anterior = sc.nextInt();
        if (anterior < 0){
            System.out.println("No se han introducido numeros validos");
        }else {
            do {
                numero = sc.nextInt();
                if (numero >= 0){
                    if (numero > anterior){
                        creciente = true;
                    } else if (numero < anterior) {
                        decreciente = true;
                    }
                    anterior = numero;
                }
            }while (numero >= 0);

            System.out.println();
            if (creciente && !decreciente){
                System.out.println("La secuencia es creciente");
            } else if (decreciente && !creciente) {
                System.out.println("La secuencia es decreciente");
            }else {
                System.out.println("La secuencia no es ni creciente ni decreciente");
            }
        }
    }
}
