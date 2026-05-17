package RepasoContabilidadEmpresa;

public class Becario extends EmpleadoEnPracticas{
    public Becario(String nombre, int id, int salarioBase) {
        super(nombre, id, salarioBase);
    }

    @Override
    public double calcularSalario() {
        return 500;
    }

    @Override
    public void tomarVacaciones() {
        throw new VacacionesNoDisponiblesException("No se puede ir");
    }
}
