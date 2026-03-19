public class Ejercicio_2_enumeracion {
    private String titulo;
    private int longitud;
    private alineacionCartel alineacion;

    public Ejercicio_2_enumeracion(String titulo) {
        this.titulo = titulo;
        alineacion = alineacionCartel.IZQUIERDA;
    }
    public Ejercicio_2_enumeracion(String titulo, int longitud) {
        this.titulo = titulo;
        this.longitud = longitud;
        alineacion = alineacionCartel.CENTRO;
    }
    public Ejercicio_2_enumeracion(String titulo, int longitud, alineacionCartel alineacion) {
        this.titulo = titulo;
        this.longitud = longitud;
        this.alineacion = alineacion;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }
    public void dibujar() {
        for (int i = 0; i < longitud; i++) {
            switch (alineacion) {
                case IZQUIERDA ->
                        System.out.print("+");

            }
        }
    }
}
