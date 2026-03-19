import java.util.Scanner;

public class ejercicio1_arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[100];
        int cuenta = 0;

        while (cuenta < 100) {
            int n = sc.nextInt();
            if (n < 0) {
                break;
            }
            numeros[cuenta] = n;
            cuenta++;
        }
        while (true) {
            int min = sc.nextInt();
            int max = sc.nextInt();
            if (min < 0 || max < 0) {
                break;
            }
            int total = 0;
            for (int i = 0; i < cuenta; i++) {
                if (numeros[i] >= min && numeros[i] <= max) {
                    total++;
                }
            }
            System.out.println(total);
        }

    }
}
