import java.util.Random;

public class sopadeletras {
    public static void main(String[] args) {
        char[][] sopa = generarSopa(5);

        System.out.println("Resultado:");
        mostrarSopa(sopa);
    }

    private static void mostrarSopa(char[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (j != 0) {
                    System.out.print(' ');
                }
                System.out.print(matriz[i][j]);
            }
            System.out.println();
        }
    }

    private static char[][] generarSopa(int n) {
        Random r = new Random();
        char[][] sopa = new char[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sopa[i][j] = (char) ('A' + r.nextInt(26));
            }
        }

        return sopa;
    }
}