import java.util.Scanner;

public class UD2_4_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean repetir = true;
        while (repetir) {


            try {


                String matricula = sc.next();
                String letras = matricula.substring(4);
                String numeros = matricula.substring(0, 4);
                System.out.println(letras);
                System.out.println(numeros);

                repetir = false;
            } catch (StringIndexOutOfBoundsException e) {
                System.out.println("Matricula no valida");
            }
        }
    }
}
