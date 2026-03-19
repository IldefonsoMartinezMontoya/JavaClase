package Empresa;

public class Ejercicio_1_EmpleaadoTiempoCompleto extends Ejercicio_1_empleado {
    private int horasExtras;
    public Ejercicio_1_EmpleaadoTiempoCompleto(String nombre, int id, int salarioBase) {
        super(nombre, id, salarioBase);
        horasExtras = 0;
    }
    public Ejercicio_1_EmpleaadoTiempoCompleto(String nombre, int id, int salarioBase, int horasExtras) {
        super(nombre, id, salarioBase);
        this.horasExtras = horasExtras;
    }
    @Override
    public double calcularSalario() {
        if (horasExtras > 0) {
            salarioBase += horasExtras * precioHoraExtra;
            return salarioBase;
        } else {
            return salarioBase;
        }
    }
    @Override
    public void trabajar() {
        System.out.println("Trabajando a tiempo completo");
    }
    @Override
    public void tomarVacaciones() {
        System.out.println("Se va de vacaciones");
    }
    public void addHorasExtras(int incremento) {
        if (incremento < 0) {
            throw new IllegalArgumentException("No puede ser negativo");
        } else {
            horasExtras = horasExtras + incremento;
        }
    }
    public void reiniciaHorasExtras() {
        horasExtras = 0;
    }
}
