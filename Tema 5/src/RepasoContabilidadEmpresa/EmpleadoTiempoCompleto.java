package RepasoContabilidadEmpresa;

public class EmpleadoTiempoCompleto extends Empleado{
    private int horasExtras;
    static int precioHoraExtra = 20;
    public EmpleadoTiempoCompleto(String nombre, int id, int salarioBase) {
        super(nombre, id, salarioBase);
        horasExtras = 0;
    }
    public EmpleadoTiempoCompleto(String nombre, int id, int salarioBase, int horasExtras) {
        super(nombre, id, salarioBase);
        setHorasExtras(horasExtras);
    }

    @Override
    public double calcularSalario() {
        return super.getSalarioBase() + precioHoraExtra;
    }

    @Override
    public void trabajar() {
        System.out.println("Trabajando a tiempo Completo");
    }

    @Override
    public void tomarVacaciones() {
        System.out.println("Se va de vacaciones");
    }

    public void addHorasExtras(int incremento) {
        this.horasExtras += incremento;
    }

    public void reiniciaHorasExtras() {
        this.horasExtras = 0;
    }

    public void setPrecioHoraExtra(int precio) {
        precioHoraExtra = precio;
    }
    public int getHorasExtras() {
        return horasExtras;
    }

    public void setHorasExtras(int horasExtras) {
        if (horasExtras < 0) {
            throw new IllegalArgumentException("No pueden ser negativas");
        } else {
            this.horasExtras = horasExtras;
        }
    }
}
