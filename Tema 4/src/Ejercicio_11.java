public class Ejercicio_11 {
    private String titulo;
    private String artista;
    private int duracion;
    private boolean reproduciendo;
    private int posicion;

    public Ejercicio_11(String titulo, String artista) {
        this.titulo = titulo;
        this.artista = artista;
        this.reproduciendo = false;
        this.posicion = 0;
    }
    public void reproducir() {
        reproduciendo = true;
    }
    public void pausar() {
        reproduciendo = false;
    }
    public void estado() {
        if (reproduciendo) {
            System.out.println("En marcha");
        } else {
            System.out.println("No en marcha");
        }
    }
    public void duracionTotal() {
        int minutos = duracion / 60;
        int segundos= duracion % 60;
        System.out.printf("%02d:%02d", minutos, segundos);
    }
    public String formatoTiempo(int segundosTotales) {
        int minutos = segundosTotales / 60;
        int segundos= segundosTotales % 60;
        return String.format("%02d:%02d", minutos, segundos);
    }
    public void tic() {
        posicion++;
    }
    public void rebobinar() {
        posicion = 0;
    }
    public String toString() {
        String estado = reproduciendo ? "Reproduciendo" : "En pausa";
        return estado + " - " + formatoTiempo(posicion) + "/" + formatoTiempo(duracion);
    }
}
