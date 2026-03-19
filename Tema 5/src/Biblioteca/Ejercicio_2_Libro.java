package Biblioteca;

public abstract class Ejercicio_2_Libro {
    private String titulo;
    private String autor;
    private int anioPublicacion;
    private boolean disponible;
    public Ejercicio_2_Libro(String titulo, String autor, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
        disponible = true;
    }
    public String mostrarInformacion() {
        return String.format(titulo + " " +
                autor + " " + anioPublicacion);
    }
    public abstract String prestar();
    public final void marcarDisponible() {
        if (disponible) {
            throw new IllegalArgumentException("No se puede poner disponible ya que ya lo está");
        } else {
            disponible = true;
        }
    }
    public final void marcarNoDisponible() {
        if (disponible) {
            disponible = false;
        } else {
            throw new IllegalArgumentException("No se puede poner no disponible ya que ya lo está");
        }
    }
}
