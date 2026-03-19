import java.util.Random;
import java.util.Scanner;

public class BuscandoElmentos {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        int[] num = new int[10];

        for (int i = 0; i < num.length; i++) {
            num[i] = r.nextInt(1,21);
        }
        System.out.print("Contenido: ");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%02d ", num[i]);
        }
        System.out.println();

        while (true){
            System.out.println("Valor a buscar (0=FIN): ");
            int n = sc.nextInt();
            if (n == 0) {
                break;
            }
            boolean encontrado = false;
            for (int i = 0; i < 10; i++) {
                if (num[i] == n) {
                    if (encontrado){
                        System.out.println(", ");

                    }
                    encontrado = true;
                    System.out.printf("num[%d] ", i);
                }
            }
            if (!encontrado){
                System.out.println("No encontrado");
            }else {
                System.out.println();
            }
        }

    }
}
