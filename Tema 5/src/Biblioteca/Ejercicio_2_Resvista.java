package Biblioteca;

public final class Ejercicio_2_Resvista extends Ejercicio_2_Libro{
    private String tipo = " Tipo: Revista";
    public Ejercicio_2_Resvista(String titulo, String autor, int anioPublicacion) {
        super(titulo, autor, anioPublicacion);
    }
    @Override
    public String mostrarInformacion() {
        return super.mostrarInformacion() + tipo;
    }
    @Override
    public String prestar() {
        return "";
    }
}
