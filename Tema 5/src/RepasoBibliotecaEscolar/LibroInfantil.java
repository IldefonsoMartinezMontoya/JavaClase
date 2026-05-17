package RepasoBibliotecaEscolar;

public class LibroInfantil extends LibroFisico {
    public LibroInfantil(String titulo, String autor, int anioPublicacion, boolean disponible, int numPaginas) {
        super(titulo, autor, anioPublicacion, disponible, numPaginas);
    }

    @Override
    public String mostrarInformacion() {
        return STR."\{super.mostrarInformacion()} Recomendado para niños";
    }

}
