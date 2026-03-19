import java.util.Scanner;

public class identificadores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Escribe el identificador -> ");
            String cadena = sc.nextLine();
            if (cadena.startsWith("\\d")) {
                System.out.println("No válido");
            }else if (cadena.equalsIgnoreCase("fin")) {
                break;
            }
            if (cadena.matches("[a-zA-Z$_][a-zA-Z$_\\d]{3,14}")) {
                System.out.println("SI");
            }
        }
    }
}