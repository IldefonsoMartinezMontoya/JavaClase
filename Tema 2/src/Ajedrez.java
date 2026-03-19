import java.util.Scanner;

public class Ajedrez {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        char c = sc.next().charAt(0);

        linea(n);
        boolean relleno = false;
        for (int i = 0; i <8; i++) {
            System.out.println("|");
            for (int a = 0; a < n - 2; a++) {
                if (relleno){
                    System.out.println("c");
                }else {
                    System.out.println(" ");
                }
            } relleno = ! relleno;
            System.out.println("|");
        }
    }

    private static void linea(int n) {
        for (int i = 0; i <8; i++) {
            System.out.print(" + ");

            for (int l = 0; l < n - 2; l++) {
                System.out.print("-");
            }
        }
    }

}
