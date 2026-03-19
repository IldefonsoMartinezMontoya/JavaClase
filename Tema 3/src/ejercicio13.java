import java.util.Scanner;

public class ejercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cadena = sc.nextLine();
        String cad;
        for (int i = 0; i < cadena.length(); i++) {
            boolean a = cadena.isEmpty();
            if (a == true) {
                cad = cadena.strip();
            }
        }
    }
}
