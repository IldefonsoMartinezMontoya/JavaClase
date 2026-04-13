package Ficheros;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio6 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        try (BufferedReader br = new BufferedReader(new FileReader("Tema 7/src/Texto/documento.txt"))) {
            String linea;
            String entrada = sc.next();
            int contador = 1;
            List<Integer> lista = new ArrayList<>();
            while ((linea = br.readLine()) != null) {
                if (linea.contains(entrada)) {
                    lista.add(contador);
                }
                contador++;
            }
            System.out.println(STR."Palabra: \{entrada} encontrada en lineas: \{lista}");
        } catch (FileNotFoundException e) {
            System.out.println("Fichero no encontrado");
        } catch (IOException e) {
            System.out.println("Ocurrió un error al leer el fichero");
        }
    }
}
