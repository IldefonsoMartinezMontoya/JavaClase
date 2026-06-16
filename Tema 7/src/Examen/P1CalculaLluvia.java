package Examen;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class P1CalculaLluvia {

    public static void main(String[] args) {
        int totalGranAcumulado = 0;

        // ==========================================
        // APARTADOS A, B y C: PROCESAMIENTO Y SALIDA
        // ==========================================
        try (Scanner sc = new Scanner(new File("Tema 7/src/Examen/lluvia.txt"));
             BufferedWriter bw = new BufferedWriter(new FileWriter("Tema 7/src/Examen/salida.txt"))) {

            int minimo = 0;
            if (sc.hasNextLine()) {
                minimo = Integer.parseInt(sc.nextLine().trim());
            }

            while (sc.hasNextLine()) {
                String linea = sc.nextLine();
                String[] partes = linea.split(" ");

                if (partes.length == 0 || partes[0].trim().isEmpty()) continue;

                String nombreMes = partes[0].trim();
                int totalMes = 0;

                for (int i = 1; i < partes.length; i++) {
                    String parte = partes[i].trim();
                    if (parte.isEmpty()) continue;

                    try {
                        int numero = Integer.parseInt(parte);
                        if (numero == -1) break;
                        totalMes += numero;
                    } catch (NumberFormatException ignored) {}
                }

                if (totalMes >= minimo) {
                    bw.write(nombreMes + " " + totalMes);
                    bw.newLine();
                    totalGranAcumulado += totalMes;
                }
            }
            bw.write("Total " + totalGranAcumulado);
            bw.newLine();

        } catch (IOException e) {
            System.out.println("Error en apartados A-C: " + e.getMessage());
        }

        // ==========================================
        // APARTADO D: MAPA, SERIALIZACIÓN Y LECTURA
        // ==========================================
        // 1. Volver a leer el fichero y rellenar el diccionario acumulando datos
        Map<String, Integer> lista = new HashMap<>();

        try (Scanner sc2 = new Scanner(new File("Tema 7/src/Examen/lluvia.txt"))) {
            // Saltamos la primera línea del mínimo
            if (sc2.hasNextLine()) sc2.nextLine();

            while (sc2.hasNextLine()) {
                String linea = sc2.nextLine();
                String[] partes = linea.split(" ");
                if (partes.length == 0 || partes[0].trim().isEmpty()) continue;

                String nombreMes = partes[0].trim();
                int totalMes = 0;

                for (int i = 1; i < partes.length; i++) {
                    String parte = partes[i].trim();
                    if (parte.isEmpty()) continue;
                    try {
                        int numero = Integer.parseInt(parte);
                        if (numero == -1) break;
                        totalMes += numero;
                    } catch (NumberFormatException ignored) {}
                }

                // CORRECCIÓN: Acumular si el mes ya existe en el mapa
                if (lista.containsKey(nombreMes)) {
                    lista.put(nombreMes, lista.get(nombreMes) + totalMes);
                } else {
                    lista.put(nombreMes, totalMes);
                }
            }
        } catch (IOException e) {
            System.out.println("Error al releer el fichero: " + e.getMessage());
        }

        // 2. Serializar el mapa en "total.dat"
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Tema 7/src/Examen/total.dat"))) {
            oos.writeObject(lista); // Aquí se guarda el objeto de forma binaria
        } catch (IOException e) {
            System.out.println("Error al serializar: " + e.getMessage());
        }

        // 3. Recuperar en otra variable y mostrar por consola
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Tema 7/src/Examen/total.dat"))) {
            // Deserializamos y casteamos al tipo de mapa correspondiente
            @SuppressWarnings("unchecked")
            Map<String, Integer> listaRecuperada = (Map<String, Integer>) ois.readObject();

            System.out.println("--- Contenido recuperado de total.dat ---");
            System.out.println(listaRecuperada);

        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error al deserializar: " + e.getMessage());
        }
    }
}