package Listas.Ejercicio11;

import org.ietf.jgss.GSSContext;

public class PrincipalEjercicio11 {
    public static void main(String[] args) {
        Ejercicio11 j11 = new Ejercicio11("8245 LMN", "Ilde");
        Ejercicio11 j12 = new Ejercicio11("8245 LMN", "Ilde");
        Ejercicio11 j13 = new Ejercicio11("4827 MZT", "Ilde");
        Gestor.darDeAlta(j13);
        Gestor.darDeAlta(j13);
        Gestor.darDeAlta(j13);
        Gestor.listarTodos();
        Gestor.aparcar("4827 MZT", 44);
    }
}
