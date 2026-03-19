public class Ejercicio4_arrays {
    public static void main(String[] args) {
        int[] entrada = {3, 5, 7, 2, 8, 1};

        System.out.print("ENTRADA: {");
        for (int i = 0; i < 6; i++) {
            System.out.printf("%2d", entrada[i]);

        }
        System.out.print(" }");
        System.out.println();
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5 - i; j++) {
                if (entrada[j] > entrada[i]) {
                    int aux;
                    aux = entrada[j];
                    entrada[j] = entrada[j + 1];
                    entrada[j + 1] = aux;
                }
            }
        }
        System.out.print("ORDENADO: MAYOR: ");
        for (int i = 0; i < 6; i++) {
            System.out.printf("%2d", entrada[i]);
        }
        System.out.println();
    }
}
