package RepasoFlotaEspacial;

public class NaveEspacial {
    private String nombre;
    private int tripulacion;

    public NaveEspacial(String nombre, int tripulacion) {
        setNombre(nombre);
        setTripulacion(tripulacion);
    }
    public void activarSistemaDefensa() {
        System.out.println(STR."\{nombre}: Escudos básicos activados");
    }

    public String getNombre() {
        return nombre;
    }

    private void setNombre(String nombre) {
        if (nombre.isBlank()) {
            throw new IllegalArgumentException("No puede estar vacío");
        } else {
            this.nombre = nombre;
        }
    }

    public int getTripulacion() {
        return tripulacion;
    }

    private void setTripulacion(int tripulacion) {
        if (tripulacion < 0) {
            throw new IllegalArgumentException("No puede ser negativa");
        } else {
            this.tripulacion = tripulacion;
        }
    }
}
