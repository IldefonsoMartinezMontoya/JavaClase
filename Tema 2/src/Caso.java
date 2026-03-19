import java.util.Scanner;

public class Caso {
    public static void main(String[] args) {
        Scanner caso = new Scanner(System.in);
        System.out.println("Introduzca un número");

        int entrada = caso.nextInt();

        switch (entrada){
            case 1:
                System.out.println("El número es uno");
                break;
            case 2:
                System.out.println("El número es dos");
                break;
            case 3:
                System.out.println("El número es tres");
                break;
            default:
                System.out.println("Número no valido");
        }
    }
}
