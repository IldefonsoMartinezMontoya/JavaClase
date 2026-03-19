public class Ejercicio_4_estaticos {
    private boolean limitador;
    private int limitacion = 120;
    private int velocidad;

    public String toString() {
        return String.format("El vehículo va a una velocidad de " + velocidad + " Km/h");
    }
    public Ejercicio_4_estaticos(int velocidad) {
        this.velocidad = velocidad;
    }

    public void activarLimitador() {
        limitador = true;
        if (velocidad > limitacion) {
            velocidad = limitacion;
        }
    }
    public void desactivarLimiador() {
        limitador = false;
    }
    public void acelerar(int incremento) {
        velocidad = velocidad + incremento;
        if (limitador && velocidad > limitacion) {
            throw new IllegalArgumentException("El limitador está encendido");
        }
        if (incremento < 0) {
            throw new IllegalArgumentException("La aceleración debe ser positiva");
        }
    }
    public void frenar(int decremento) {
        velocidad = velocidad - decremento;
        if (velocidad < 0) {
            throw new IllegalArgumentException("Ya está parado");
        }
    }

    public void setLimitacion(int limitacion) {
        if (limitacion < 0) {
            throw new IllegalArgumentException("No puede ser negativa");
        }
        this.limitacion = limitacion;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        if (velocidad < 0) {
            throw new IllegalArgumentException("No puede ser una velocidad negativa");
        }
        this.velocidad = velocidad;
    }
}
