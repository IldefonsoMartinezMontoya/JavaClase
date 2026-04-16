package Ficheros;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio10 {
    static void main() {
        try (BufferedReader br = new BufferedReader(new FileReader("Tema 7/src/Texto/registro.txt"))) {
            String linea;
            String[] partes;
            int contadorTotal = 0;
            int contadorInformacion = 0;
            int contadorError = 0;
            int contadorWarning = 0;
            while ((linea = br.readLine()) != null) {
                contadorTotal++;
                 partes = linea.split(" ");
                 if (partes[2].contains("INFORMATION")) {
                     contadorInformacion++;
                 } else if (partes[2].contains("ERROR")) {
                     contadorError++;
                 } else if (partes[2].contains("WARNING")) {
                     contadorWarning++;
                 }
            }
            System.out.printf("INFORMATION: %d/%d (%.0f%%)%n", contadorInformacion, contadorTotal, (double) contadorInformacion /contadorTotal * 100);
            System.out.printf("ERROR: %d/%d (%.0f%%)%n", contadorError, contadorTotal, (double) contadorError /contadorTotal * 100);
            System.out.printf("WARNING: %d/%d (%.0f%%)%n", contadorWarning, contadorTotal, (double) contadorWarning /contadorTotal * 100);
        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado");
        } catch (IOException e) {
            System.out.println("Error de lectura");
        }
    }
}
