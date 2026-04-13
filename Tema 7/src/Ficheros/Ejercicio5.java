package Ficheros;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio5 {
    static void main() {
        try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\estudiante\\Desktop\\Progrmacion_1\\Tema 7\\src\\Texto\\entrada.txt"))) {
            String linea;
            int contadorLineas = 0;
            int contadorCaracteres = 0;
            String[] partes = new String[0];
            while ((linea = br.readLine()) != null) {
                contadorCaracteres = linea.length();
                contadorLineas++;
                partes = linea.split("\\s+");
            }
            System.out.println(STR."Numero de lineas: \{contadorLineas} -- Numero de C//L: \{contadorCaracteres} -- Numero de palabras totales: \{partes.length}");
        } catch (FileNotFoundException e) {
            System.out.println("Fichero no encontrado");
        } catch (IOException e) {
            System.out.println("Ocurrió un error al leer el fichero");
        }
    }
}
