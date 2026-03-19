package condicionalessimples;

import java.util.Scanner;

public class ejericicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int carta = sc.nextInt();

        if (carta < 1 || carta > 12 || carta == 8 || carta == 9){
            System.out.println("CARTA NO VÁLIDA");
        }

        if (carta >= 1 && carta <= 7){
            System.out.println(carta);
        } else if (carta == 10) {
            System.out.println("SOTA");
        } else if (carta == 11) {
            System.out.println("CABALLO");
        }else if (carta == 12){
            System.out.println("Rey");
        }

    }
}
