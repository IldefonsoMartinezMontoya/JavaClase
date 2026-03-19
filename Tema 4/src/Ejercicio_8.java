public class Ejercicio_8 {
    private String titulo;
    private String director;
    private int anio;
    private int valoracion;

    public Ejercicio_8 (String titulo, String director, int anio, int valoracion) {
        this.titulo = titulo;
        this.director = director;
        this.anio = anio;
        this.valoracion = valoracion;
        if (valoracion < 0) {
            throw new IllegalArgumentException("No puede tener estrellas negativas");
        } else if (valoracion > 5) {
            throw new IllegalArgumentException("No puede tener mas de 5 estrellas");
        }
    }
    public String toString() {
        return String.format("La película se llama: " +
                titulo + ", dirigida por: " +
                director + ", salió en el año: " +
                anio + " y cuenta con una valoración de " +
                valoracion + " Estrellas");
    }
    public void sumarEstrella() {
        if (valoracion >= 0 && valoracion < 5) {
            valoracion++;
        } else {
            throw new IllegalArgumentException("Ya tiene las estrellas válidas");
        }
    }
    public void quitarEstrella() {
        if (valoracion > 0 && valoracion < 5) {
            valoracion--;
        } else {
            throw new IllegalArgumentException("Ya tiene las estrellas válidas");
        }
    }
}
