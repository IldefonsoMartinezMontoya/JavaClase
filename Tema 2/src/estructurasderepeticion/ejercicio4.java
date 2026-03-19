package estructurasderepeticion;

import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String cadena = sc.nextLine();
        int n = sc.nextInt();
        char direccion = sc.next().toUpperCase().charAt(0);
        int longitud = cadena.length();

        if (n <= longitud){
            System.out.println("La cadena tiene " + longitud + " caracteres o mas. Nose añade nada mas");
        }else {
            int faltan;
            faltan = n - longitud;
            String puntos;
            puntos = ".".repeat(faltan);

            if (direccion == 'D') {
                cadena = puntos + cadena;
            } else if (direccion == 'I') {
                cadena = cadena + puntos;
            } else {
                System.out.println("Caracter no valido. Usa 'I' o 'D'");
            }
            System.out.println(cadena);
        }

        }
}
