import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String cad;
        do {
            cad = sc.nextLine();
            for (int i = 0; i < cad.length(); i++) {
                char a = cad.charAt(i);
                if (Character.isLowerCase(a)){
                    a = Character.toUpperCase(a);
                }else if (Character.isUpperCase(a)) {
                    a = Character.toLowerCase(a);
                }
                System.out.print(a);
            }
            System.out.println();
        }while (!cad.equalsIgnoreCase("Final"));

    }
}
