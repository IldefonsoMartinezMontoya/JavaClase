package Ficheros;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio9 {
    static void main() {
        try (BufferedReader br = new BufferedReader(new FileReader("Tema 7/src/Texto/Calificaciones.txt"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(" ");
                System.out.println(partes[0] + partes[1]);
            }
        } catch (FileNotFoundException e) {
            System.out.println("error");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
