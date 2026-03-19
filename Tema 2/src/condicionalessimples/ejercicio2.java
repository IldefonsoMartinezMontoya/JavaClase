package condicionalessimples;

import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String n = sc.nextLine();

        if (n.equals("Chuck")){
            System.out.println("Bienvenido, jefe");
        }else {
            System.out.println("Hola "+ n);
        }
    }
}
