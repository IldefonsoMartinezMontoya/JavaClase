package Ficheros;
import java.io.*;

public class Ejercicio8 {
    static void main() {
        try (BufferedReader br = new BufferedReader(new FileReader("Tema 7/src/Texto/Entrada1.txt"));
             BufferedReader br2 = new BufferedReader(new FileReader("Tema 7/src/Texto/Entrada2.txt"));
             BufferedWriter bw = new BufferedWriter(new FileWriter("Tema 7/src/Texto/salida_fusionada.txt", true))){
            String linea1;
            String linea2;
            while ((linea1 = br.readLine()) != null && (linea2 = br2.readLine()) != null) {
                bw.write(STR."\{linea1} ");
                bw.newLine();
                bw.write(STR."\{linea2} ");
                bw.newLine();
            }
        } catch (FileNotFoundException e) {
            System.out.println("Fichero no encontrado");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try (BufferedReader br3 = new BufferedReader(new FileReader("Tema 7/src/Texto/salida_fusionada.txt"))
        ) {
            String linea3;

            while ((linea3 = br3.readLine()) != null) {
                System.out.println(linea3);
            }

        } catch (IOException e) {
            System.out.println("Error al leer");
        }
        try (BufferedReader br3 = new BufferedReader(new FileReader("Tema 7/src/Texto/salida_fusionada.txt"))) {
            String linea3;
            while ((linea3 = br3.readLine()) != null) {
                System.out.println(linea3);
            }
        } catch (IOException e) {
            System.out.println("Error al leer");
        }
    }
}
