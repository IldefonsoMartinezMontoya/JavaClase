import java.util.NoSuchElementException;
import java.util.Scanner;

public class validador {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nombre de usuario: ");
        String nombre = sc.nextLine();

        if (nombre.matches("[a-z][a-z\\d]{2,9}")) {
            System.out.println("Es correcto");
        } else {
            System.out.println("No es correcto");
        }
    }
}
