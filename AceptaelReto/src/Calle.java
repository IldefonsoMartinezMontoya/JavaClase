import java.util.Scanner;

public class Calle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        if (n != 0) {
            if (n % 2 == 0)
                System.out.println("DERECHA");
            if (n % 2 != 0)
                System.out.println("IZQUIERDA");
        }
    }
}