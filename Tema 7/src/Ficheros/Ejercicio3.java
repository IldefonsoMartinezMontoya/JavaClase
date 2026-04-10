package Ficheros;
import java.io.*;

public class Ejercicio3 {
    static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("\"C:\\Users\\estudiante\\Desktop\\fichero1.txt\""));
             BufferedWriter bw = new BufferedWriter(new FileWriter("fichero2.txt", true))) {
                 String linea;
                  while ((linea = br.readLine()) != null) {
                      String[] partes = linea.split(" ");
                     if (partes.length != 2) {
                         System.out.println(STR."Línea con formato incorrecto (se esperaban 2 palabras): \{linea}");
                         continue;
                     }
                     bw.write(linea);
                     bw.newLine();
                  }
        } catch (FileNotFoundException e) {
            System.out.println("Fichero no encontrado");
        } catch (IOException e) {
            System.out.println("Ocurrió un error al leer el fichero");
        }
    }
}
