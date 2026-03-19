import java.util.Scanner;

public class P644 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        while (casoDePrueba());
    }

    public static boolean casoDePrueba() {
       int A = sc.nextInt();
       int M = 24;
       int N = 5;

        if (A == 0){
            System.out.println("Año no válido");
            return false;
        }

       int a = A % 19;
       int b = A % 4;
       int c = A % 7;
       int d = (19*a + M) % 30;
       int e = (2*b + 4*c + 6*d + N) % 7;
       int f = d + e;
       int dia;
       int dia2;

       if (f < 10){
           dia = d + e + 22;
            System.out.println("El Domingo de Pascua será el: " + dia + " de marzo");
        }else {
           dia2 = d + e - 9;
           System.out.println("El Domingo de Pascua será el: " + dia2 + " de abril");
       }
       return true;
    }
}
