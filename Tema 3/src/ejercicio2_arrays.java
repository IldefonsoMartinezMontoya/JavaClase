import java.util.Scanner;

public class ejercicio2_arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[][] a = new char[5][5];

        for (int i = 0; i < 5; i++) {
            String cadena = sc.next();
            for (int j = 0; j < 5; j++) {
                a[i][j] = cadena.charAt(j);
            }
        }
        System.out.println();
        for (int j = 0; j < 5; j++) {
            for (int i = 0; i < 5; i++) {
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
    }
}
