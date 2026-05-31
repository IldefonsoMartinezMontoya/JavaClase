package RepasoListas;

import RepasoListas.Ejercicio10;

import java.util.List;
import java.util.Scanner;

public class Principal10 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // 1. Leer y mostrar la primera secuencia
        System.out.print("Introduce la primera secuencia de ADN: ");
        String entrada1 = teclado.nextLine();
        List<Character> secuencia1 = Ejercicio10.crearSecuencia(entrada1);
        System.out.println(STR."Secuencia 1 guardada: \{secuencia1}");

        // 2. Leer y mostrar la segunda secuencia
        System.out.print("Introduce la segunda secuencia de ADN: ");
        String entrada2 = teclado.nextLine();
        List<Character> secuencia2 = Ejercicio10.crearSecuencia(entrada2);
        System.out.println(STR."Secuencia 2 guardada: \{secuencia2}");

        System.out.println("\n--- Procesando y comparando ---");

        // 3. Comparar las secuencias invocando a la otra clase
        double porcentaje = Ejercicio10.compararSecuencias(secuencia1, secuencia2);

        // Mostramos el estado final de las listas (tras aplicar guiones si hiciera falta)
        System.out.println(STR."Secuencia 1 final: \{secuencia1}");
        System.out.println(STR."Secuencia 2 final: \{secuencia2}");

        // 4. Mostrar resultado del porcentaje
        System.out.printf("El porcentaje de coincidencia es: %.2f%%\n", porcentaje);

        teclado.close();
    }
}