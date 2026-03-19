import java.util.Random;

public class Euromillones1 {
    public static void main(String[] args) {
        Random r = new Random();
        int[] numeros = new int[5];

        for (int i = 0; i < numeros.length; i++) {
            boolean repetido;
            do {
                numeros[i] = r.nextInt(1, 51);
                repetido = false;
                for (int j = 0; j < i; j++) {
                    if (numeros[i] == numeros[j]) {
                        repetido = true;
                        break;
                    }
                }
            } while (repetido);
        }

        int[] estrellas = new int[2];

        for (int i = 0; i < 2; i++) {
            boolean repetido;
            do {
                estrellas[i] = r.nextInt(1, 13);
                repetido = false;
                for (int j = 0; j < i; j++) {
                    if (estrellas[i] == estrellas[j]) {
                        repetido = true;
                        break;
                    }
                }
            } while (repetido);
        }

        System.out.print("Números: ");
        for (int num : numeros) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.print("Estrellas: ");
        for (int num : estrellas) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
