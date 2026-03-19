public class Ejercicio_4 {
    private String nombre;
    private int diametro;
    private long distanciaSol;

    public Ejercicio_4(String nombre, int diametro, long distanciaSol) {
        setNombre(nombre);
        setDiametro(diametro);
        setDistanciaSol(distanciaSol);
    }
    public String toString() {
        return nombre + " diametro: " + diametro + " distacia al sol: " + distanciaSol;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        switch (nombre) {
            case "Mercurio":
            case "Venus":
            case "Tierra":
            case "Marte":
            case "Júpiter":
            case "Saturno":
            case "Urano":
            case "Neptuno":
                this.nombre = nombre;
        }
    }

    public int getDiametro() {
        return diametro;
    }

    public void setDiametro(int diametro) {
        this.diametro = diametro;
    }

    public long getDistanciaSol() {
        return distanciaSol;
    }

    public void setDistanciaSol(long distanciaSol) {
        this.distanciaSol = distanciaSol;
    }
}
