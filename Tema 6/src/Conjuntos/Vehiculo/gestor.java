package Conjuntos.Vehiculo;

import java.util.Set;
import java.util.TreeSet;

public class gestor {
    static Set<Vehiculo> parking = new TreeSet<>();
    public static void anyadir(Vehiculo v) {
        parking.add(v);
    }
    public static void mostrar() {
        System.out.println(parking);
    }
}
