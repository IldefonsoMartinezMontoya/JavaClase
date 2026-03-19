package Empresa;

public class Ejercicio_1_Becario extends Ejercicio_1_EmpleadoEnPracticas {
    public Ejercicio_1_Becario(String nombre, int id, int salarioBase) {
        super(nombre, id, salarioBase);
    }
    @Override
    public double calcularSalario() {
        return 500;
    }

    @Override
    public void tomarVacaciones() {
        super.tomarVacaciones();
    }
}
