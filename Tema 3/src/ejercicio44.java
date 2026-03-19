import java.util.Scanner;

public class ejercicio44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cadena = sc.nextLine();
        int a = 0;
        int e = 0;
        int i = 0;
        int o = 0;
        int u = 0;


        for (int j = 0; j < cadena.length(); j++) {
            char h = cadena.charAt(j);
            switch (h){
                case 'A':
                case 'a':
                    a++;
                    break;
                case 'E':
                case 'e':
                    e++;
                    break;
                case 'I':
                case 'i':
                    i++;
                    break;
                case 'O':
                case 'o':
                    o++;
                    break;
                case 'U':
                case 'u':
                    u++;
                    break;
            }
        }
        if (a > 0) {
            System.out.println("'A' -> " + a);
        }
        if (e > 0) {
            System.out.println("'E' -> " + e);
        }
        if (i > 0) {
            System.out.println("'I' -> " + i);
        }
        if (o > 0) {
            System.out.println("'O' -> " + o);
        }
        if (u > 0) {
            System.out.println("'U' -> " + u);
        }

    }
}
