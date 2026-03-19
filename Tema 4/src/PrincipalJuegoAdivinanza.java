import java.util.Scanner;

public class PrincipalJuegoAdivinanza {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        JuegoAdivinanza j = new JuegoAdivinanza();
        boolean salir = false;
        while (!salir) {
            System.out.println("Llevas " + j.getNumIntentos());
        }

    }
}
