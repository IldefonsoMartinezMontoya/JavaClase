package Ficheros;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio2 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("salida.txt", true))) {
            String palabreja;
            while (true) {
                palabreja = sc.next();
                if (palabreja.equals("FIN")) {
                    break;
                } else {
                    bw.write(STR."\{palabreja} ");
                }
                bw.newLine();
            }
        } catch (FileNotFoundException e) {
            System.out.println("Fichero no encontrado");
        } catch (IOException e) {
            System.out.println("Ocurrió un error al leer el fichero");
        }
    }
}
