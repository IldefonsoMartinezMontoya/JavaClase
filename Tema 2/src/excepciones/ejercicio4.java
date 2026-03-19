package excepciones;

import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean valida = false;
        String matricula = sc.nextLine();

        if (matricula.length() != 7){
            System.out.println("La matricula debe tener 7 caracteres");
        }
        String numeros = matricula.substring(0,4);
        String letras = matricula.substring(4,7);

        
    }
}
