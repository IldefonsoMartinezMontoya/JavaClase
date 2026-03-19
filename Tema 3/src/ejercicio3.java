import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.io.CharArrayReader;
import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cadena = sc.nextLine();

        for (int i = 0; i < cadena.length(); i++) {
            System.out.println(cadena.substring(0, i + 1));
        }
        System.out.println(cadena);
        for (int i = cadena.length() - 1; i >= 0; i--) {
            System.out.println(cadena.substring(0, i + 1));
        }
    }
}
