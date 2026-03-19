import java.util.Random;

public class repetidos {
    public static void main(String[] args) {
        Random r = new Random();
        int[] numeros = new int[5];
        int[] estrellas = new int[2];
        for (int i = 0; i < numeros.length; i++) {
            boolean repetido;
            do {
                numeros[i] = r.nextInt(1, 51);
                repetido = false;
                for (int j = 0; j < i; j++) {
                    if (numeros[i] == numeros[j]) {
                        repetido = true;
                        System.out.println("Repetido el " + numeros[i]);
                        break;
                    }
                }
            }while (repetido);
        }

        for (int i = 0; i < estrellas.length; i++) {
            boolean repetido;
            do {
                estrellas[i] = r.nextInt(1, 13);
                repetido = false;
                for (int j = 0; j < i; j++) {
                    if(estrellas[i] == estrellas[j]) {
                        repetido = true;
                        System.out.println("Repetido el " + estrellas[i]);
                        break;
                    }
                }
            }while (repetido);
        }
        System.out.print("Numeros: ");
        for (int num : numeros){
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.print("Estrellas: ");
        for (int num : estrellas){
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
