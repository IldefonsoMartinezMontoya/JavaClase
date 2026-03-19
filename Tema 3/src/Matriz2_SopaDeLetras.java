import java.util.Random;

public class Matriz2_SopaDeLetras {
    public static void main(String[] args) {
        Random r = new Random();
        char[][] sopa = new char[10][10];

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                sopa[i][j] = (char) ('A' + r.nextInt(26));
            }
        }
        System.out.println("Resultado:");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(sopa[i][j] + " ");
            }
            System.out.println();
        }
    }
}
