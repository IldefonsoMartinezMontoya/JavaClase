import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cadena;

        do {
            cadena = sc.nextLine();
            int inicio = 0;
            int fin = cadena.length() - 1;
            boolean palindromo = true;
            while (inicio < fin){
                char cinicio = cadena.charAt(inicio);
                while (!Character.isLetter(cinicio) && inicio < cadena.length() - 1){
                    inicio++;
                    cinicio = cadena.charAt(inicio);
                }
                char cfin = cadena.charAt(fin);
                while (!Character.isLetter(cfin) && fin > 0){
                    fin--;
                    cfin = cadena.charAt(fin);
                }
                if (cinicio != cfin){
                    palindromo = false;
                    break;
                }
                inicio++;
                fin--;
            }
            if (palindromo){
                System.out.println("SI");
            }else {
                System.out.println("NO");
            }
        }while (!cadena.isEmpty());


    }
}
