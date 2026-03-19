package estructurasdeseleccion;

import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int b = sc.nextInt();
        int a = sc.nextInt();
        int c = sc.nextInt();
        int raiz; raiz = (int) Math.pow(b,2)-4*a*c;

        if (raiz == 0){
            System.out.println("ÚNICA SOLUCIÓN");
        }else if (raiz > 0){
            System.out.println("DOS SOLUCIONES");
        } else if (raiz < 0) {
            System.out.println("SIN SOLUCIÓN REAL");
        }
    }
}
