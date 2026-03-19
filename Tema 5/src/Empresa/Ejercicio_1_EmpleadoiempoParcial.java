package Empresa;

public class Ejercicio_1_EmpleadoiempoParcial extends Ejercicio_1_empleado {
    public Ejercicio_1_EmpleadoiempoParcial(String nombre, int id, int salarioBase) {
        super(nombre, id, salarioBase);
    }
    @Override
    public double calcularSalario() {
        return salarioBase * 0.8;
    }
    @Override
    public void trabajar() {
        System.out.println("Trabajando a tiempo parcial");
    }

    @Override
    public void tomarVacaciones() {
        throw new VacacionesNoDisponiblesException("No puede irse de vacaiones");
    }
}
