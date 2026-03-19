package excepciones;

import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();

        try {
            int numero = Integer.parseInt(n);
            System.out.println(numero);
        }catch (NumberFormatException e){
            System.out.println("No es un numero valido");
        }
    }
}
