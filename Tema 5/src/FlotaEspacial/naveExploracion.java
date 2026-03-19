package FlotaEspacial;

public class naveExploracion extends naveEspacial {
    private double rango;
    public naveExploracion(String nombre, int tripulacion, double rango) {
        super(nombre, tripulacion);
        if (rango < 0) {
            throw new IllegalArgumentException("No puede ir hacia atras");
        } else {
            this.rango = rango;
        }
    }
    public void explorar() {
        boolean verdadero = rango > 100;
        if (verdadero) {
            System.out.println(getNombre() + " explora un radio de " + rango + " años luz");
        } else {
            System.out.println(verdadero);
        }
    }
}
