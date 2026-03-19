import java.util.Scanner;

public class IBAN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Escribe el IBAN -> ");
            String cadena = sc.nextLine();
            if (cadena.matches("[Ff][Ii][Nn]*")) {
                break;
            }
            if (cadena.matches("[A-Z]{2}[A-Z\\d]{14,32}")) {
                System.out.print("ES IBAN");
                if (cadena.matches("(ES|PT)\\d{14,32}")) {
                    System.out.println(" Y ES PENINSULAR");
                }
            } else {
                System.out.println("NO");
            }
        }
    }
}
