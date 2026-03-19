package condicionalessimples;

import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        if (n % 2 == 0){
            System.out.println("ES MÚLTIPLO DE 2");
        } else if (n % 3 == 0) {
            System.out.println("ES MÚLTIPLO DE 3");
        } else if (n % 5 == 0) {
            System.out.println("ES MÚLTIPLO DE 5");
        } else if (n % 7 == 0) {
            System.out.println("ES MÚLTIPLO DE 7");
        }
    }
}
