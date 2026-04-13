package Ficheros;
import java.io.*;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        try (
                Scanner sc = new Scanner(new File("C:\\Users\\estudiante\\Desktop\\fichero1.txt"));
                PrintWriter writer = new PrintWriter(new FileWriter("fichero2.txt", true))
        ) {
            String linea;

            while (sc.hasNextLine()) {
                linea = sc.nextLine();

                String[] partes = linea.split(" ");
                if (partes.length != 2) {
                    System.out.println(STR."Línea con formato incorrecto (se esperaban 2 palabras): \{linea}");
                    continue;
                }

                writer.println(linea);
            }

        } catch (FileNotFoundException e) {
            System.out.println("Fichero no encontrado");
        } catch (IOException e) {
            System.out.println("Ocurrió un error al leer el fichero");
        }
    }
}