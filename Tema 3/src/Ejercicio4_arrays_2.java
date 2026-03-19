import java.util.Random;
import java.util.Scanner;

public class Ejercicio4_arrays_2 {
    public static void main(String[] args) {
        int[] entrada = {3, 5, 7, 2, 8, 1};

        System.out.print("  Antes: ");
        for (int i = 0; i < 6; i++) {
            System.out.printf("%02d ", entrada[i]);
        }
        System.out.println();

        for (int j = 0; j < 5; j++) {
            boolean hayCambios = false;
            for (int i = 0; i < 5 - j; i++) {
                if (entrada[i] > entrada[i + 1]) {
                    int aux = entrada[i];
                    entrada[i] = entrada[i + 1];
                    entrada[i + 1] = aux;
                    hayCambios = true;
                }

            }
            if (!hayCambios){
                break;
            }
        }
        System.out.print("Despues: ");
        for (int i = 0; i < 6; i++) {
            System.out.printf("%02d ", entrada[i]);
        }
        System.out.println();
        System.out.println("Mayor: " + entrada[5] + " " + "Menor: " + entrada[0]);

    }
}
