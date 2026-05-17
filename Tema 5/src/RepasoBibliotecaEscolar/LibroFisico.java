package RepasoBibliotecaEscolar;

public class LibroFisico extends Libro{
    private int numPaginas;
    public LibroFisico(String titulo, String autor, int anioPublicacion, boolean disponible, int numPaginas) {
        super(titulo, autor, anioPublicacion, disponible);
        setNumPaginas(numPaginas);
    }

    @Override
    public String mostrarInformacion() {
        return STR."\{super.mostrarInformacion()}Formato: Físico";
    }

    @Override
    public void prestar() {
        if (isDisponible()) {
            System.out.println("Libro físico prestado");
        } else {
            throw new LibroNoDisponibleException("No está disponible");
        }
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        if (numPaginas < 0) {
            throw new IllegalArgumentException("No puede tener páginas negativas");
        } else {
            this.numPaginas = numPaginas;
        }
    }
}
