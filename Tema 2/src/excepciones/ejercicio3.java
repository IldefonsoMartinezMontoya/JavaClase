package excepciones;

import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.nextLine();
        String b = sc.nextLine();
        int numeroa;
        int numerob;
        try {
            numeroa = Integer.parseInt(a);
            numerob = Integer.parseInt(b);
            try {
                System.out.println(numeroa / numerob);
            } catch (ArithmeticException e) {
                System.out.println("Numero no valido");
            }
        }catch (NumberFormatException e) {
            System.out.println("Numero no valido");
        }
        }

    }
