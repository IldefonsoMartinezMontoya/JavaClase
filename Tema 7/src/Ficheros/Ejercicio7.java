package Ficheros;

import java.io.*;
import java.util.Scanner;

public class Ejercicio7 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        String entrada = "";
        while (!entrada.equalsIgnoreCase("Salir")) {
            System.out.println("¿Qué quiere hacer?");
            entrada = sc.next();
            switch (entrada) {
                case "Añadir":
                    System.out.print("Asigne nombre: ");
                    String nombre = sc.next();
                    System.out.print("Asigne telefono: ");
                    String apellido = sc.next();
                    try (BufferedWriter bw = new BufferedWriter(new FileWriter("Tema 7/src/Texto/agenda.txt", true))){
                        bw.write(STR."\{nombre}: ");
                        bw.write(apellido);
                        bw.newLine();
                        System.out.println("Contacto Asignado");
                    } catch (FileNotFoundException e) {
                        System.out.println("Fichero no encontrado");
                    } catch (IOException e) {
                        System.out.println("Ocurrió un error al leer el fichero");
                    }
                    break;
                case "Listar":
                    try (BufferedReader br = new BufferedReader(new FileReader("Tema 7/src/Texto/agenda.txt"))){
                        String linea;
                        while ((linea = br.readLine()) != null) {
                            String[] partes = linea.split(": ");

                            if (partes.length == 2) {
                                String nombre2 = partes[0];
                                String telefono = partes[1];
                                System.out.println(STR."nombre: \{nombre2}; telefono: \{telefono}");
                            }
                        }
                    } catch (FileNotFoundException e) {
                        System.out.println("Fichero no encontrado");
                    } catch (IOException e) {
                        System.out.println("Ocurrió un error al leer el fichero");
                    }
                    break;
                case "Buscar":
                    try (BufferedReader br = new BufferedReader(new FileReader("Tema 7/src/Texto/agenda.txt"))){
                        System.out.print("Nombre de contacto: ");
                        String pregunta = sc.next();
                        String linea;
                        while ((linea = br.readLine()) != null) {
                            if (linea.contains(pregunta)) {
                                String[] partes = linea.split(": ");
                                String telefono = partes[1];
                                System.out.println(STR."telefono: \{telefono}");
                            }
                        }
                    } catch (FileNotFoundException e) {
                        System.out.println("Fichero no encontrado");
                    } catch (IOException e) {
                        System.out.println("Ocurrió un error al leer el fichero");
                    }
                    break;
                case "Salir":
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        }
    }
}
