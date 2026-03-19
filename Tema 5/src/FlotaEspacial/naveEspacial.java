package FlotaEspacial;

public class naveEspacial {
    private String nombre;
    private int tripulacion;

    public naveEspacial(String nombre, int tripulacion) {
        setNombre(nombre);
        setTripulacion(tripulacion);
    }
    public void activarSistemaDefensa() {
        System.out.println(nombre + ": Escudos básicos activados");
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        if (nombre.isBlank()) {
            throw new IllegalArgumentException("No puede estar vacío");
        } else {
            this.nombre = nombre;
        }
    }
    public int getTripulacion() {
        return tripulacion;
    }
    public void setTripulacion(int tripulacion) {
        if (tripulacion < 0) {
            throw new IllegalArgumentException("No puede ser un número negativo");
        } else {
            this.tripulacion = tripulacion;
        }
    }
}
