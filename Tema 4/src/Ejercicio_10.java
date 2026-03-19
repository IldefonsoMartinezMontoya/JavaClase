public class Ejercicio_10 {
    private String nombre;
    private String puesto;
    private double salario;

    public Ejercicio_10 (String nombre, String puesto, int salario) {
        if (nombre.isBlank() || puesto.isBlank() || salario < 0) {
            throw new IllegalArgumentException("Tienen que ser valores válidos");
        } else {
            setNombre(nombre);
            setSalario(salario);
            setPuesto(puesto);
        }
    }
    public String toString() {
        return String.format("El nombre es: " + nombre + " y ocupa el puesto de: " + puesto + " con un salario de: " + salario + "€");
    }
    public void darAumento(double porcentaje) {
        if (porcentaje < 0) {
            throw new IllegalArgumentException("Tiene que ser un valor válido");
        } else {
            salario = salario + (salario * porcentaje / 100);
        }
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre.isEmpty()) {
            throw new IllegalArgumentException("Tiene que ser un valor válido");
        }
        this.nombre = nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        if (puesto.isEmpty()) {
            throw new IllegalArgumentException("Tiene que ser un valor válido");
        }
        this.puesto = puesto;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        if (salario < 0) {
            throw new IllegalArgumentException("Tiene que ser un valor válido");
        }
        this.salario = salario;
    }
}
