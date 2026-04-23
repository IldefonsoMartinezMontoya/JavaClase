package Ficheros.Ejercicio11;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Libro {
    protected int id;
    protected String titulo;
    protected String autor;
    protected int anyo;
    protected String genero;

    public Libro(int id, String titulo, String autor, int anyo, String genero) {
        setId(id);
        setTitulo(titulo);
        setAutor(autor);
        setAnyo(anyo);
        setGenero(genero);
    }
    @Override
    public String toString() {
        return STR."{id=\{id}, titulo='\{titulo}' por autor='\{autor}' (anyo=\{anyo}) - genero='\{genero}'}";
    }
    static void leerLibro() {
        List<Libro> lista = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("Tema 7/src/Texto/libros.csv"))){
            String linea;
            String[] partes;
            while ((linea = br.readLine()) != null) {
                partes = linea.split(";");
                Libro libro = new Libro(
                        Integer.parseInt(partes[0]),
                        partes[1],
                        partes[2],
                        Integer.parseInt(partes[3]),
                        partes[4]
                );
                lista.add(libro);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado");
        } catch (IOException e) {
            System.out.println("Error de lectura");
        }
    }
    static void clasificarPorGenero() {
        try (BufferedReader br = new BufferedReader(new FileReader("Tema 7/src/Texto/libros.csv"))){
            Map<String, Integer> mapa = new HashMap<>();
            String linea;
            String[] partes;
            while ((linea = br.readLine()) != null) {
                partes = linea.split(";");
                if (!mapa.containsKey(partes[4])) {
                    mapa.put(partes[4], 1);
                } else {
                    mapa.put(partes[4], mapa.get(partes[4]) + 1);
                }
            }
            System.out.println(mapa);
        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado");
        } catch (IOException e) {
            System.out.println("Error de lectura");
        }
    }
    static void clasificarPorEdad() {
        List<Libro> lista = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("Tema 7/src/Texto/libros.csv"))){
            String linea;
            String[] partes;
            while ((linea = br.readLine()) != null) {
                partes = linea.split(";");
                try {
                    Libro l1 = new Libro(
                            Integer.parseInt(partes[0]),
                            partes[1],
                            partes[2],
                            Integer.parseInt(partes[3]),
                            partes[4]
                    );
                    lista.add(l1);
                } catch (IllegalArgumentException e) {
                    System.out.println(STR."Omitiendo libro '\{partes[1]}': \{e.getMessage()}");
                }
            }
            System.out.println(lista.stream().sorted(java.util.Comparator.comparingInt(Libro::getAnyo)).toList());
        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado");
        } catch (IOException e) {
            System.out.println("Error de lectura");
        }
    }
    static void guardarLibros() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("Tema 7/src/Texto/libros_XXI.txt", true));
        BufferedReader br = new BufferedReader(new FileReader("Tema 7/src/Texto/libros.csv"))) {
            String linea;
            String[] partes;
            while ((linea = br.readLine()) != null) {
                partes = linea.split(";");
                try {
                    bw.write(partes[0]);
                    bw.write("--");
                    bw.write(partes[1]);
                    bw.write("--");
                    bw.write(partes[2]);
                    bw.write("--");
                    bw.write(partes[3]);
                    bw.write("--");
                    bw.write(partes[4]);
                    bw.newLine();
                } catch (IllegalArgumentException e) {
                    System.out.println(STR."Omitiendo libro '\{partes[1]}': \{e.getMessage()}");
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado");
        } catch (IOException e) {
            System.out.println("Error de lectura");
        }
    }
    static void main() {
        System.out.println("--- Clasificación por Género ---");
        clasificarPorGenero();

        System.out.println("\n--- Clasificación por Edad/Año ---");
        clasificarPorEdad();

        guardarLibros();
        System.out.println("--- Libros Guardados ---");
    }
    public int getId() {
        return id;
    }
    private void setId(int id) {
        if (id < 0) {
            throw new IllegalArgumentException("No puede ser negativo");
        } else {
            this.id = id;
        }
    }
    public String getTitulo() {
        return titulo;
    }
    private void setTitulo(String titulo) {
        if (titulo.isBlank()) {
            throw new IllegalArgumentException("No puede estar vacío");
        } else {
            this.titulo = titulo;
        }
    }
    public String getAutor() {
        return autor;
    }
    private void setAutor(String autor) {
        if (autor.isBlank()) {
            throw new IllegalArgumentException("No puede estar vacío");
        } else {
            this.autor = autor;
        }
    }
    public int getAnyo() {
        return anyo;
    }
    private void setAnyo(int anyo) {
        if (anyo < 0) {
            throw new IllegalArgumentException("No puede ser negativo");
        } else {
            this.anyo = anyo;
        }
    }
    public String getGenero() {
        return genero;
    }
    private void setGenero(String genero) {
        if (genero.isBlank()) {
            throw new IllegalArgumentException("No puede estar vacío");
        } else {
            this.genero = genero;
        }
    }
}
