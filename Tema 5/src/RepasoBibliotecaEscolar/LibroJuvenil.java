package RepasoBibliotecaEscolar;

public class LibroJuvenil extends LibroInfantil{
    public LibroJuvenil(String titulo, String autor, int anioPublicacion, boolean disponible, int numPaginas) {
        super(titulo, autor, anioPublicacion, disponible, numPaginas);
    }
    @Override
    public String mostrarInformacion() {
        return STR."\{super.mostrarInformacion()} Recomendado para adolescentes";
    }
}
