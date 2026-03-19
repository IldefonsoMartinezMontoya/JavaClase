import java.util.Scanner;

public class ejercicio9 {
    static Scanner sc = new Scanner(System.in);
    public static int contar(String cad, char a){
        int n = cad.indexOf(a);
        int m = cad.lastIndexOf(a);

        if (n == -1) {
            return -1;
        } else if (n == m) {
            return 0;
        }
        return  n - m - 1;

    }
    public static void main(String[] args) {
        String cadena = sc.nextLine();
        char a = sc.next().charAt(0);

        int resultado = contar(cadena, a);

        System.out.println(a + " " + resultado);
        }
    }
