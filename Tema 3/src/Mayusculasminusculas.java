import java.util.Scanner;

public class Mayusculasminusculas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cad;

        do {
            cad = sc.nextLine();
            String minus = cad.toLowerCase();
            System.out.println(minus);
        }while (!cad.equalsIgnoreCase("Final"));

    }
}
