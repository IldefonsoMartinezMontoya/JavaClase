import java.util.Random;

public class Matriz1 {
    public static void main(String[] args) {
        Random r = new Random();
        int[][] numeros = new int[5][6];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 6; j++) {
                numeros[i][j] = r.nextInt(1000, 2001);
            }
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(numeros[i][j] + " ");
            }
            System.out.println();
        }
        int suma;
        for (int fila = 0; fila < 5; fila++) {
            suma = 0;
            for (int columna = 0; columna < 6; columna++) {
                suma += numeros[0][columna];
            }
            System.out.println("La fila" + (fila + 1) + " suma " + suma);
        }

        for (int columna = 0; columna < 6; columna++) {
            suma = 0;
            for (int fila = 0; fila < 5; fila++) {
                suma += numeros[fila][columna];
            }
            System.out.println("La columna " + (columna + 1) + " suma " + suma);
        }
        suma = 0;
        for (int columna = 0; columna < 6; columna++) {
            for (int fila = 0; fila < 5; fila++) {
                suma += numeros[fila][columna];
            }
        }
        System.out.println("En total suman " + suma);
    }
}
