package estructurasderepeticion;

import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        int cuentaneg = 0;
        int cuentacer = 0;
        int cuentapos = 0;

        for (int i = 0; i < 10; i++) {
            n = sc.nextInt();
            if (n < 0){
                cuentaneg++;
            }
            if (n == 0){
                cuentacer++;
            }
            if (n > 0){
                cuentapos++;
            }
        }
        System.out.println(cuentaneg + " numeros negativos");
        System.out.println(cuentacer + " ceros");
        System.out.println(cuentapos + " numeros positivos");
    }
}
