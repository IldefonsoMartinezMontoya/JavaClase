package Ficheros;
import java.io.*;
import java.util.Scanner;

public class Ejercicio4 {
    static void main(String[] args) {
        try (Scanner sc = new Scanner(new FileReader("\"C:\\Users\\estudiante\\Desktop\\fichero1.txt\""));
             PrintWriter writer = new PrintWriter(new FileWriter("\"C:\\Users\\estudiante\\Desktop\\fichero1.txt\""));
             BufferedWriter bw = new BufferedWriter(new FileWriter("fichero2.txt", true))) {
            String linea;
            while (sc.hasNext()) {
                String[] partes = sc.split(" ");
                if (partes.length != 2) {
                    System.out.println(STR."Línea con formato incorrecto (se esperaban 2 palabras): \{linea}");
                    continue;
                }
                bw.write(linea);
                bw.newLine();
                writer.println(linea);

            }
        } catch (FileNotFoundException e) {
            System.out.println("Fichero no encontrado");
        } catch (IOException e) {
            System.out.println("Ocurrió un error al leer el fichero");
        }
    }
}

