package Empresa;

public class Ejercicio_1_EmpleadoEnPracticas extends Ejercicio_1_empleado {
    public Ejercicio_1_EmpleadoEnPracticas(String nombre, int id, int salarioBase) {
        super(nombre, id, salarioBase);
        if (salarioBase != 0) {
            throw new IllegalArgumentException("No tiene salario");
        }
    }
    @Override
    public double calcularSalario() {
        return 0;
    }
    @Override
    public void trabajar() {
        System.out.println("En prácticas");
    }

    @Override
    public void tomarVacaciones() {
        throw new VacacionesNoDisponiblesException("No puede irse de vacasciones");
    }

}
