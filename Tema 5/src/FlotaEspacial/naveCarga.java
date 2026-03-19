package FlotaEspacial;

public class naveCarga extends naveEspacial {
    private double cargaMaxima;
    public naveCarga(String nombre, int tripulacion, double cargaMaxima) {
        super(nombre, tripulacion);
        if (cargaMaxima < 0) {
            throw new IllegalArgumentException("No puede estar vacía");
        } else {
            this.cargaMaxima = cargaMaxima;
        }
    }

    public void cargar(double peso) {
        double cargaTotal = 0;
        if (peso > cargaMaxima) {
            throw new IllegalArgumentException("Impsible, demasiado peso");
        } else {
            cargaTotal += peso;
            System.out.println("¡Carga realizada con éxito! Carga actual: " + cargaTotal + "T");
        }
    }

    @Override
    public void activarSistemaDefensa() {
        System.out.println(getNombre() + ": Escudos reforzados para protección de la carga activados");
    }
}
