import java.util.Random;
import java.util.Scanner;

public class OrdenandoVectoresBurbuja {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        int[] num = new int[10];

        for (int i = 0; i < num.length; i++) {
            num[i] = r.nextInt(1,21);
        }
        System.out.print("  Antes: ");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%02d ", num[i]);
        }
        System.out.println();

        for (int j = 0; j < 9; j++) {
            boolean hayCambios = false;
            for (int i = 0; i < 9 - j; i++) {
                if (num[i] > num[i + 1]) {
                    int aux = num[i];
                    num[i] = num[i + 1];
                    num[i + 1] = aux;
                    hayCambios = true;
                }

            }
            if (!hayCambios){
                break;
            }
        }
        System.out.print("Despues: ");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%02d ", num[i]);
        }
        System.out.println();

        int buscado = sc.nextInt();
        int inicio = 0;
        int fin = num.length;
        while (inicio <= fin) {
            int medio = (inicio + fin) / 2;
            if (num[medio] == buscado) {
                System.out.printf("Encontrado en num[%d]\n", medio);
                break;
            } else if (num[medio] < buscado) {
                inicio = medio + 1;
            }else {
                inicio = medio - 1;
            }
        }

    }
}
