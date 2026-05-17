package RepasoContabilidadEmpresa;

public class EmpleadoEnPracticas extends Empleado{
    public EmpleadoEnPracticas(String nombre, int id, int salarioBase) {
        super(nombre, id, 0);
    }

    @Override
    public double calcularSalario() {
        return 0;
    }

    @Override
    public void trabajar() {
    }

    @Override
    public void tomarVacaciones() {
        throw new VacacionesNoDisponiblesException("No se puede ir");
    }
}
