package SerializaciónDeObjetos;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio1 {
    static Scanner sc = new Scanner(System.in);
    public static void calificaciones(String nombre, List<Double> notas) {
        File archivo = new File(STR."Tema 7/src/SerializaciónDeObjetos/\{nombre}.dat");
        try {
            if (archivo.exists()) {
                System.out.println(STR."-- Datos \{nombre} --");
                BufferedReader br = new BufferedReader(new FileReader(archivo));
                String linea;
                while ((linea = br.readLine()) != null) {
                    System.out.println(linea);
                }
            } else {
                System.out.println("No existen datos. Creando nuevo fichero...");
                nombre = sc.nextLine();
                try (BufferedWriter bw = new BufferedWriter(new FileWriter(STR."Tema 7/src/SerializaciónDeObjetos/\{nombre}.dat"))){
                    double nota;
                    while (true) {
                        nota = sc.nextInt();
                        if (nota < 0) {
                            break;
                        } else {
                            notas.add(nota);
                        }
                    }
                    bw.write(notas.toString());
                    System.out.println("Archivo creado");
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    static void main() {
        calificaciones("Emanuel", new ArrayList<>());
    }
}
