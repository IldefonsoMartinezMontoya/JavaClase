import java.util.Scanner;

public class P172 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (casoDePrueba()) ;
    }

    public static boolean casoDePrueba() {
        int n = sc.nextInt();
        String cadena = sc.nextLine();
        for (int j = 0; j < cadena.length(); j++) {
            char a = sc.next().charAt(0);
            boolean d = a == 'D';
            boolean i = a == 'I';
            if (n == 0) {
                return false;
            }
            if (d || i) {
                System.out.println("TODOS COMEN");
            } else if (d && i) {
                System.out.println("ALGUNO NO COME");
            } else {
                System.out.println("TODOS COMEN");
            }
        }
        return true;
    }
}
