package RepasoContabilidadEmpresa;

public final class Gerente extends EmpleadoTiempoCompleto{
    public Gerente(String nombre, int id, int salarioBase) {
        super(nombre, id, salarioBase);
    }

    @Override
    public double calcularSalario() {
        return super.calcularSalario() * 1.20;
    }

    @Override
    public void tomarVacaciones() {
        throw new VacacionesNoDisponiblesException("No se puede ir");
    }
}
