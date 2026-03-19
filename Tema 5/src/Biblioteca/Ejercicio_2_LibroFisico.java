package Biblioteca;

public class Ejercicio_2_LibroFisico extends Ejercicio_2_Libro {
    private String formato = " Formato: Fisico";

    public Ejercicio_2_LibroFisico(String titulo, String autor, int anioPublicacion) {
        super(titulo, autor, anioPublicacion);
    }
    @Override
    public String mostrarInformacion() {
        return super.mostrarInformacion() + formato;
    }
    @Override
    public String prestar() {
        return "Libro físico prestado";
    }
}