import java.util.Scanner;

public class P184_2 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        while (casoDePrueba());
    }

    public static boolean casoDePrueba() {
        int n = sc.nextInt();
        String cadena = sc.next();
        for (int i = 0; i < n; i++) {
            int horas1 = Integer.parseInt(cadena.substring(0,2));
            int horas2 = Integer.parseInt(cadena.substring(6,8));
            int minutos1 = Integer.parseInt(cadena.substring(3,5));
            int minutos2 = Integer.parseInt(cadena.substring(9));
            int sumah;
            int sumam;
            if (minutos1 >= 59) {
                horas1++;
            } else if (minutos2 >= 59) {
                horas2++;
            }
            if (horas1 > horas2) {
                sumah = horas1 - horas2;
            }else {
                sumah = horas2 - horas1;
            }
            if (minutos1 > minutos2) {
                sumam = minutos1 - minutos2;
            } else {
                sumam = minutos2 - minutos1;
            }
            System.out.printf("%02d",sumah + ":" +"%02d", sumam);
        }
        return false;
    }
}
