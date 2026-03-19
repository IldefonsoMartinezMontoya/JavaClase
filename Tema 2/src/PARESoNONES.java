import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class PARESoNONES {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un número");

        int n = sc.nextInt();


            if (n % 2 == 0){
                System.out.println("PAR");
            }else {
                System.out.println("IMPAR");
            }
    }
}
