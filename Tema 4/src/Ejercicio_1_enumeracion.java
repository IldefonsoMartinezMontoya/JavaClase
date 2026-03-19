public class Ejercicio_1_enumeracion {
    private EstadoSemaforo rojo;
    private EstadoSemaforo ambar;
    private EstadoSemaforo verde;
    private boolean averiado;
    private int contador;

    public Ejercicio_1_enumeracion() {
        this.averiado = false;
        this.contador = 0;
    }
    public void darSenyal() {
        if (averiado) {
            return;
        }
        contador++;
        if (contador >= 35) {
            contador = 0;
        }
    }
    public void forzarApertura() {
        if (!averiado) {
            contador = 0;
        }
    }
    public void dibujarSemaforo() {
        System.out.println("+---+");
        System.out.println("| " + simbolo(rojo) + " |");
        System.out.println("| " + simbolo(ambar) + " |");
        System.out.println("| " + simbolo(verde) + " |");
        System.out.println("+---+");
    }
    private void actualizarLuces() {
        rojo = EstadoSemaforo.APAGADO;
        ambar = EstadoSemaforo.APAGADO;
        verde = EstadoSemaforo.APAGADO;

        if (averiado) {
            ambar = EstadoSemaforo.INTERMITENTE;
            return;
        }

        if (contador < 12) {
            verde = EstadoSemaforo.ENCENDIDO;
        } else if (contador == 12) {
            ambar = EstadoSemaforo.ENCENDIDO;
        } else {
            rojo = EstadoSemaforo.ENCENDIDO;
        }
    }
    private char simbolo(EstadoSemaforo estado) {
        switch (estado) {
            case APAGADO:
                return 'O';
            case INTERMITENTE:
                return '*';
            case ENCENDIDO:
                return 'X';
            default:
                return ' ';
        }
    }
}
