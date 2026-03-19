import java.util.Scanner;

public class P150_2 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        while (casoDePrueba());
    }

    public static boolean casoDePrueba() {
        int n = sc.nextInt();
        char a = sc.next().charAt(0);
        if (n == 0 && a == '0') {
            return false;
        } else {
            System.out.print("  ");
            for (int i = 0; i < n; i++) {
                System.out.print(a);
            }
            System.out.println();
            System.out.print(" ");
            for (int j = 0; j < n + 2; j++) {
                System.out.print(a);
            }
            System.out.println();
            for (int j = 0; j < n + 4; j++) {
                System.out.print(a);
            }
            System.out.println();
            System.out.print(" ");
            for (int i = 0; i < n + 2; i++) {
                System.out.print(a);
            }
            System.out.println();
            System.out.print("  ");
            for (int j = 0; j < n; j++) {
                System.out.print(a);
            }
            System.out.println();
        }
        return true;
    }
}
