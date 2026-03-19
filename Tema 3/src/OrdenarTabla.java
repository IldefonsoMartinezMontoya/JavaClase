import java.util.Random;
public class OrdenarTabla {
    public static void main(String[] args) {
        Random rnd = new Random();

        int[][] num = new int[10][2];

                // Rellenar con elementos aleatorios
        for (int i = 0; i < 10; i++) {
                    num[i][0] = rnd.nextInt(1, 6);
                    num[i][1] = rnd.nextInt(1, 1000);
        }

                // Mostrar la tabla
        System.out.println("Original:");
        for (int i = 0; i < 10; i++) {
            System.out.printf("[%d] -> %d, %03d\n", i, num[i][0], num[i][1]);
        }

                // Ordenar
        boolean hayCambios;
        for (int j = 0; j < 9; j++) {
            hayCambios = false;
            for (int i = 0; i < 9 - j; i++) {
                if (num[i][0] > num[i + 1][0] ||
                        num[i][0] == num[i + 1][0] && num[i][1] > num[i + 1][1]) {
                    for (int columna = 0; columna < 2; columna++) {
                        int aux = num[i][columna];
                        num[i][columna] = num[i + 1][columna];
                        num[i + 1][columna] = aux;
                        hayCambios = true;
                    }
                }
            }
            if (!hayCambios) {
                        break;
            }
        }

        // Mostrar la tabla
        System.out.println("Ordenada:");
        for (int i = 0; i < 10; i++) {
            System.out.printf("[%d] -> %d, %03d\n", i, num[i][0], num[i][1]);
        }
    }
}

