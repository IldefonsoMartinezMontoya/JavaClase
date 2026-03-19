public class Ejercicio_3 {
    private String nombre;
    private String color;
    private int peso;

    public Ejercicio_3(String nombre, String color, int peso) {
        setNombre(nombre);
        setColor(color);
        setPeso(peso);
    }
    public String toString() {
        return nombre +
                " " + color +
                "/" + peso +
                " Kg";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
}
