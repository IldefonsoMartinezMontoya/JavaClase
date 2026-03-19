package condicionalessimples;

import java.util.Scanner;

public class ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a == b){
            System.out.println("a es igual a b");
        }

        if (a > b){
            System.out.println("a es mayor que b");
        }else if (b > a){
            System.out.println("b es mayor que a");
        }
    }
}
