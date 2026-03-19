package Empresa;

public abstract class Ejercicio_1_empleado {
    protected String nombre;
    protected int id;
    protected int salarioBase;
    int precioHoraExtra = 20;
    public Ejercicio_1_empleado(String nombre, int id, int salarioBase) {
        if (id < 0 || salarioBase < 0) {
            throw new IllegalArgumentException("No valido");
        } else {
            this.nombre = nombre;
            this.id = id;
            this.salarioBase = salarioBase;
        }
    }
    public abstract double calcularSalario();
    public abstract void trabajar();
    public void setPrecioHoraExtra(int precioHoraExtra) {
        if (precioHoraExtra < 0) {
            throw new IllegalArgumentException("No puede ser negativo");
        } else {
            this.precioHoraExtra = precioHoraExtra;
        }
    }
    public final String mostrarInformacion() {
        return String.format(nombre + " " +
                id + " " + salarioBase);
    }
    public abstract void tomarVacaciones();
}
