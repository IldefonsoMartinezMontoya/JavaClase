import java.util.Scanner;

public class Tabladel8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca un número");

        int n = sc.nextInt();

        System.out.println("Tabla de Multiplicar");

        int a = 1;

        do {
            System.out.println(n+" x "+a+" = "+n*a);
            a++;
        }while (a <= 10);
    }
}
