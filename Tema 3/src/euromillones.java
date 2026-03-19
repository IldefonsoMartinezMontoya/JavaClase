import java.util.Scanner;

public class euromillones {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        while (casoDePrueba());
    }
    public static boolean casoDePrueba() {
        int[] numeros = new int[5];
        int[] estrellas = new int[2];
        int repetidosnum = 0;
        int repetidoses = 0;
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = sc.nextInt();
        }
        for (int i = 0; i < numeros.length; i++) {
            estrellas[i] = sc.nextInt();
        }
        int[] apuesta1 = new int[5];
        int[] apuesta2 = new int[2];
        for (int j = 0; j < apuesta1.length; j++) {
            apuesta1[j] = sc.nextInt();
        }
        for (int j = 0; j < apuesta2.length; j++) {
            apuesta2[j] = sc.nextInt();
        }

        if (apuesta1 == numeros){
            repetidosnum++;
        }
        if (apuesta2 == estrellas){
            repetidoses++;
        }
        System.out.println(repetidosnum + " " + repetidoses);
        return true;
    }
}
