package RepasoFlotaEspacial;

public class NaveCarga extends NaveEspacial{
    private double cargaMaxima;
    private double cargaActual;
    public NaveCarga(String nombre, int tripulacion, double cargaMaxima) {
        super(nombre, tripulacion);
        setCargaMaxima(cargaMaxima);
    }
    public void cargar(double peso) {
        if (this.cargaActual + peso > this.cargaMaxima) {
            throw new IllegalArgumentException("No es posible cargar la nave: se supera la carga máxima permitida.");
        }
        this.cargaActual += peso;
        System.out.println("¡Carga realizada con éxito!");
    }

    public double getCargaMaxima() {
        return cargaMaxima;
    }

    private void setCargaMaxima(double cargaMaxima) {
        if (cargaMaxima < 0) {
            throw new IllegalArgumentException("No puede ser negativa");
        } else {
            this.cargaMaxima = cargaMaxima;
        }
    }
}
