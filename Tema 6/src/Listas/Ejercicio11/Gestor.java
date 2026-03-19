package Listas.Ejercicio11;

import java.util.*;

public class Gestor {
    static List<Ejercicio11> parking = new ArrayList<>();
    public static void darDeAlta(Ejercicio11 v) {
        parking.add(v);
    }
    public static void darDeBaja(Ejercicio11 v) {
        parking.remove(v);
    }
    public static void listarTodos() {
        System.out.println(parking);
    }
    public static void aparcar(String matricula, int plaza) {
        for (Ejercicio11 v : parking) {
            if (v.getNumeroDePlaza() == plaza) {
                throw new IllegalArgumentException("La plaza ya está ocupada");
            }
        }
        for (Ejercicio11 v : parking) {
            if (v.getMatricula().equals(matricula)) {
                v.numeroDePlaza = plaza;
                System.out.println(STR."Vehículo aparcado en plaza \{plaza}");
                return;
            } else {
                System.out.println("El vehículo no existe");
            }
        }
    }
    public static void listarAparcados() {
        for (Ejercicio11 v : parking) {
            if (v.getNumeroDePlaza() != 0){
                System.out.println(v);
            }
        }
    }
    public static void desAparcar(String matricula, int plaza) {
        for (Ejercicio11 v : parking) {
            if (v.getNumeroDePlaza() != plaza) {
                throw new IllegalArgumentException("La plaza no está ocupada");
            } else {
                v.numeroDePlaza = plaza;
                plaza = 0;
                System.out.println("El vehículo ya no está en ninguna plaza");
            }
        }
    }
    public static void ordenarPorMatricula() {
        System.out.println(parking.stream().sorted());
    }
}
