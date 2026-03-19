package Empresa;

public final class Ejercicio_1_Gerente extends Ejercicio_1_EmpleaadoTiempoCompleto {
    public Ejercicio_1_Gerente(String nombre, int id, int salarioBase) {
        super(nombre, id, salarioBase);
    }
    @Override
    public double calcularSalario() {
        return salarioBase * 1.20;
    }
    @Override
    public void tomarVacaciones() {
        super.tomarVacaciones();
    }
}
