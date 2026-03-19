package excepciones;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import javax.xml.transform.sax.SAXSource;
import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca dos numeros");
        int n = sc.nextInt();
        int b = sc.nextInt();

        try {
            System.out.println(n / b);
        }catch (ArithmeticException e){
            System.out.println("No se puede dividir por cero");
        }
    }
}
