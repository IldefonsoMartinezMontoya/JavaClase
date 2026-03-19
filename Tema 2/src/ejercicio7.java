import java.util.Scanner;

public class ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cadena = sc.nextLine();

        for (int i = 0; i < cadena.length(); i++) {
            char c = cadena.charAt(i);

            if (Character.isLetter(c)){
                System.out.print(c);
            }else {
                System.out.print(" ");
            }
        }
    }
}
