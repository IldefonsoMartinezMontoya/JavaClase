import java.util.Scanner;

public class P659 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        while (casoDePrueba());
    }

    public static boolean casoDePrueba() {
        int n = sc.nextInt();

        if (n == 0) {
            return false;
        }
        int unidades = n % 10;
        n = n/10;
        int decenas = n % 10;
        n = n/10;
        int centenas = n % 10;
        n = n/10;
        int mil = n % 10;
        n = n/10;
        int miles = n % 10;
        n = n/10;
        int millares = n % 10;
        n = n/10;
        int millones =n % 10;
        n = n/10;

        for (int i = 0; i < millones; i++) {
            System.out.print("H");
        }
        for (int i = 0; i < millares; i++) {
            System.out.print("R");
        }
        for (int i = 0; i < miles; i++) {
            System.out.print("D");
        }
        for (int i = 0; i < mil; i++) {
            System.out.print("F");
        }
        for (int i = 0; i < centenas; i++) {
            System.out.print("C");
        }
        for (int i = 0; i < decenas; i++) {
            System.out.print("G");
        }
        for (int i = 0; i < unidades; i++) {
            System.out.print("T");
        }
        System.out.println();

        return true;

        }

    }

