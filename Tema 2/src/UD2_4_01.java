import java.util.Scanner;

public class UD2_4_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            int a = sc.nextInt();
            int b = sc.nextInt();

            System.out.println("a entre b es" + (a / b));
        } catch (ArithmeticException e) {
            System.err.println("No se puede dividir por cero");
        }
    }
}