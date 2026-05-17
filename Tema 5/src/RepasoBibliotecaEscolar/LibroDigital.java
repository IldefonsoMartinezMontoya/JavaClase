package RepasoBibliotecaEscolar;

public class LibroDigital extends Libro{


    public LibroDigital(String titulo, String autor, int anioPublicacion, boolean disponible) {
        super(titulo, autor, anioPublicacion, disponible);
    }

    @Override
    public String mostrarInformacion() {
        return STR."\{super.mostrarInformacion()} Formato: Digital";
    }

    @Override
    public void prestar() {
        if (isDisponible()) {
            System.out.println("Libro digital descargado");
        } else {
            throw new LibroNoDisponibleException("No está disponible");
        }
    }
}
