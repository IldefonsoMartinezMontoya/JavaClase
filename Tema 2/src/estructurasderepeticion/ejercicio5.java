package estructurasderepeticion;

import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pared = 0;
        int n = sc.nextInt();
        char d = sc.next().charAt(0);

        System.out.println("+------------+");
        if (n >= 1 && n <= 7 || n >= 10 && n <= 12) {
            if (n == 1){
                System.out.println("| " + "AS" + "         |");
            } else if (n == 10) {
                System.out.println("| " + "SOTA" + "       |");
            } else if (n == 11) {
                System.out.println("| " + "CABALLO" + "    |");
            } else if (n == 12) {
                System.out.println("| " + "REY" + "        |");
            }else {
                System.out.println("| " + n + "          |");
            }
            if (d == 'C'){
                System.out.println("| " +"COPAS" + "      |");
            } else if (d == 'E') {
                System.out.println("| " +"ESPADAS" + "    |");
            } else if (d == 'O') {
                System.out.println("| " +"OROS" + "       |");
            } else if (d == 'B') {
                System.out.println("| " +"BASTOS" + "     |");
            }
        }else {
            System.out.println("numero no valido");
        }
        do {
            System.out.println("|            |");
            pared++;
        }while (pared < 5);

        if (n >= 1 && n <= 7 || n >= 10 && n <= 12) {
            if (n == 1) {
                System.out.println("|"+"         "+"AS"+" |");
            } else if (n == 10) {
                System.out.println("|"+"       "+"SOTA"+" |");
            } else if (n == 11) {
                System.out.println("|"+"    "+"CABALLO"+" |");
            } else if (n == 12) {
                System.out.println("|"+"        "+"REY"+" |");
            } else {
                System.out.println("|" + "          " + n + " |");
            }
        }
        System.out.println("+------------+");

    }
}
