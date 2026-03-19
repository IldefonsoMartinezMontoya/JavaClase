import java.util.Scanner;

public class P233 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (P233()) ;
    }

    public static boolean P233() {
        int n = sc.nextInt();
        if (n == 0) {
            return false;
        }
        if (n > 0 && n < 10) {
            System.out.println(n);
        } else if (n >= 10) {
            int dividendo = n;
            int divisor = 9;

            int resto;
            resto = dividendo % divisor;

            if (resto != 0){
                System.out.print(resto);
            }

            for (int i = 0; i < n / 9; i++) {
                System.out.print(9);


            }
            System.out.println();

        }return true;
    }
}