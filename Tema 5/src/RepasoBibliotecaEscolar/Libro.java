package RepasoBibliotecaEscolar;

public abstract class Libro {
    private String titulo;
    private String autor;
    private int anioPublicacion;
    private boolean disponible;

    public Libro(String titulo, String autor, int anioPublicacion, boolean disponible) {
        setTitulo(titulo);
        setAutor(autor);
        setAnioPublicacion(anioPublicacion);
        setDisponible(disponible);
    }

    public String mostrarInformacion() {
        return STR."Libro{titulo='\{titulo}', autor='\{autor}', anioPublicacion=\{anioPublicacion}}";
    }

    public abstract void prestar();

    public final void marcarDisponible() {
        setDisponible(true);
    }

    public final void marcarNoDisponible() {
        setDisponible(false);
    }

    public String getTitulo() {
        return titulo;
    }

    private void setTitulo(String titulo) {
        if (titulo.isBlank()) {
            throw new IllegalArgumentException("No puede estar vacío");
        } else {
            this.titulo = titulo;
        }
    }

    public String getAutor() {
        return autor;
    }

    private void setAutor(String autor) {
        if (autor.isBlank()) {
            throw new IllegalArgumentException("No puede estar vacío");
        } else {
            this.autor = autor;
        }
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    private void setAnioPublicacion(int anioPublicacion) {
        if (anioPublicacion < 0) {
            throw new IllegalArgumentException("No puede ser antes de cristo");
        } else {
            this.anioPublicacion = anioPublicacion;
        }
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        if (this.disponible && disponible) {
            throw new IllegalArgumentException("Ya está disponible");
        } else if (!this.disponible && !disponible) {
            throw new IllegalArgumentException("Ya está en no disponeble");
        } else {
            this.disponible = disponible;
        }
    }
}
