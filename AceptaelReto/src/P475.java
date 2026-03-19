import java.util.Scanner;

public class P475 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            casoDePrueba();
        }
    }

    public static void casoDePrueba() {
        String buscar = "STANLEE";
        String linea = sc.nextLine().toUpperCase();
        
        int indiceletra = 0;
        int encontrados = 0;
        for (int i = 0; i < linea.length(); i++) {
            if (linea.charAt(i) == buscar.charAt(indiceletra)) {
                indiceletra++;
                if (indiceletra == buscar.length())  {
                    indiceletra = 0;
                    encontrados++;
                }
            }
        }
        System.out.println(encontrados);
    }
}
