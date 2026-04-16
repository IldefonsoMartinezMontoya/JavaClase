package Ficheros.Ejercicio11;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
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
    public void leerLibro() {
        List<Libro> lista = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("Tema 7/src/Texto/libros.csv"))){
            String linea;
            String[] partes;
            while ((linea = br.readLine()) != null) {
                partes = linea.split(";");
                Libro l1 = new Libro(
                        Integer.parseInt(partes[0]),
                        partes[1],
                        partes[2],
                        Integer.parseInt(partes[3]),
                        partes[4]
                );
                lista.add(l1);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado");
        } catch (IOException e) {
            System.out.println("Error de lectura");
        }
    }
    public void clasificarPorGenero() {
        try (BufferedReader br = new BufferedReader(new FileReader("Tema 7/src/Texto/libros.csv"))){
            Map<String, Integer> mapa = new HashMap<>();
            String linea;
            String[] partes;
            while ((linea = br.readLine()) != null) {
                partes = linea.split(";");

            }
        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado");
        } catch (IOException e) {
            System.out.println("Error de lectura");
        }
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
