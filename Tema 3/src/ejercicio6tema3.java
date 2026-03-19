import java.util.Scanner;

public class ejercicio6tema3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String cadena = sc.nextLine();

        System.out.println(tieneRepetidos(cadena));
    }

    private static boolean tieneRepetidos(String cadena) {
        boolean repetidos = false;

        for (int i = 0; i < cadena.length(); i++) {
            char c = cadena.charAt(i);
            for (int j = i + 1; j < cadena.length(); j++) {
                if (cadena.charAt(j) == c){
                    repetidos = true;
                    break;
                }
            }
            if (repetidos){
                break;
            }
        }
        return repetidos;
    }
}
