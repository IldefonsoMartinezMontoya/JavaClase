import java.util.Scanner;

public class Edad {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);

        System.out.println("Introduzca un número");

             int edad; edad = entrada.nextInt();

             if (edad>=18)
                 System.out.println("Es mayor de edad");
             else if (edad<18)
             {
                 System.out.println("No es mayor de edad");
             }
    }
}
