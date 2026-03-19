public class invertir {
    public static void main(String[] args) {
        int[] n = {1, 2, 3, 4, 5, 6, 7, 8};

        System.out.print("Antes: ");
        for (int num : n) {
            System.out.print(num + " ");
        }
        System.out.println();

         invertir(n);
    }
    public static void invertir(int[] v) {
        for (int i = 0; i < v.length / 2; i++) {
            int aux = v[i];
            v[i] = v[v.length - 1 - i];
            v[v.length - 1 - i] = aux;
        }
        System.out.print("Despues: ");
        for (int num : v) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
