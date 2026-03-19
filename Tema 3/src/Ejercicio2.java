import javax.sound.midi.MidiFileFormat;
import java.util.Calendar;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String cadena = sc.nextLine();
        String cad1 = cadena.substring(0,3);
        String cad2 = cadena.substring(cadena.length()-2);
        int fin = 5;
        if (cadena.length() < fin){
            fin = cadena.length();
        }
        String cad3 = cadena.substring(2, fin);

        System.out.println(cad1);
        System.out.println(cad2);
        System.out.println(cad3);
    }
}
