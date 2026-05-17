package RepasoContabilidadEmpresa;

public class EmpleadoTiempoParcial extends Empleado{
    public EmpleadoTiempoParcial(String nombre, int id, int salarioBase) {
        super(nombre, id, salarioBase);
    }

    @Override
    public double calcularSalario() {
        return super.getSalarioBase() * 0.8;
    }

    @Override
    public void trabajar() {
        System.out.println("Trabajando a tiempo Parcial");
    }

    @Override
    public void tomarVacaciones() {
        throw new VacacionesNoDisponiblesException("No se puede ir");
    }
}
