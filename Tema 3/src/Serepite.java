import java.util.Scanner;

public class Serepite {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] n = new int[10];

        for (int i = 0; i < 10; i++) {
            n[i] = sc.nextInt();
        }
        while (true) {
            int buscado = sc.nextInt();
            if (buscado == 0) {
                break;
            }
            int encontrados = 0;
            for (int i = 0; i < 10; i++) {
                if (n[i] == buscado) {
                    encontrados++;
                }
            }
            System.out.println(encontrados);
        }
    }
}
