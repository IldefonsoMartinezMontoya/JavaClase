package Biblioteca;

public class Ejercicio_2_LibroDigital extends Ejercicio_2_Libro {
    private String formato = " Formato: Digital";
    public Ejercicio_2_LibroDigital(String titulo, String autor, int anioPublicacion) {
        super(titulo, autor, anioPublicacion);
    }
    @Override
    public String mostrarInformacion() {
        return super.mostrarInformacion() + formato;
    }
    @Override
    public String prestar() {
        return "Libro digital descargado";
    }
}
