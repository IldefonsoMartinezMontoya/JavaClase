import java.util.Scanner;

public class solopares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] n = new int[10];
        int contador = 0;
        //int suma;
        for (int i = 0; i < 10; i++) {
            n[i] = sc.nextInt();
        }
        char a;
        do {
            System.out.println("¿(P)ares o (I)mpares?");
            a = sc.next().charAt(0);
        }while (a != 'P' && a != 'I');
        for (int i = 0; i < 10; i++) {
            if ( n[i] % 2 == 0 && a == 'P'){
                System.out.print(n[i] + " ");
                contador++;
            }
            if (n[i] % 2 != 0 && a == 'I') {
                System.out.print(n[i] + " ");
                contador++;
            }
        }
        //suma += contador;
        System.out.println();
        System.out.println("Son " + contador + " números");
        //System.out.println("Suman" + suma);
    }
}
