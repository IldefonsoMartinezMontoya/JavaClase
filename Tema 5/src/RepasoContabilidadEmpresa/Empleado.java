package RepasoContabilidadEmpresa;

public abstract class Empleado {
    private String nombre;
    private int id;
    private int salarioBase;

    public Empleado(String nombre, int id, int salarioBase) {
        setNombre(nombre);
        setId(id);
        setSalarioBase(salarioBase);
    }

    public abstract double calcularSalario();

    public abstract void trabajar();

    public final void mostrarInformacion() {
        System.out.println(STR."Nombre: \{nombre} ID: \{id} Salario Base: \{salarioBase}");
    }

    public abstract void tomarVacaciones();

    public String getNombre() {
        return nombre;
    }

    private void setNombre(String nombre) {
        if (nombre.isBlank()) {
            throw new IllegalArgumentException("No puede estar vacío");
        } else {
            this.nombre = nombre;
        }
    }

    public int getId() {
        return id;
    }

    private void setId(int id) {
        if (id < 0) {
            throw new IllegalArgumentException("No puede ser menor de 0");
        } else {
            this.id = id;
        }
    }

    public int getSalarioBase() {
        return salarioBase;
    }

    private void setSalarioBase(int salarioBase) {
        if (salarioBase < 0) {
            throw new IllegalArgumentException("No puede ser menor de 0");
        } else {
            this.salarioBase = salarioBase;
        }
    }
}
