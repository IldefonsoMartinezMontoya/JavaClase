package RepasoBibliotecaEscolar;

public final class Revista extends Libro {


    public Revista(String titulo, String autor, int anioPublicacion, boolean disponible) {
        super(titulo, autor, anioPublicacion, disponible);
    }

    @Override
    public void prestar() {
        if (isDisponible()) {
            System.out.println("Revista prestada");
        } else {
            throw new LibroNoDisponibleException("No está disponible");
        }
    }

    @Override
    public String mostrarInformacion() {
        return STR."Tipo: Revista \{super.mostrarInformacion()}";
    }
}
