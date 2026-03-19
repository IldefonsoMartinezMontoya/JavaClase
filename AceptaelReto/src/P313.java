import java.util.Scanner;

public class P313 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            P313();
        }
    }

    public static void P313() {
     int saldo = sc.nextInt();
     int cambio = sc.nextInt();

        saldo = saldo + cambio;

     if (saldo >= 0){

         System.out.println("SI");
     }else {
         System.out.println("NO");
     }
    }
}
