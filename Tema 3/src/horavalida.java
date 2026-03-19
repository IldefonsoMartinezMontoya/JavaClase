import java.util.Scanner;

public class horavalida {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Escribe HH:MM:SS -> ");
            String cadena = sc.nextLine();
            if (cadena.toUpperCase().startsWith("FIN")) {
                break;
            }
            if (cadena.matches("([01]\\d|2[0-3]):[0-5]\\d:[0-5]\\d")){
                System.out.println("SI");
            } else {
                System.out.println("NO");
            }
        }
    }
}
