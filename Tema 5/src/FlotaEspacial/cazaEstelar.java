package FlotaEspacial;

public class cazaEstelar extends naveCombate {
    private double velocidadMaxima;
    public cazaEstelar(String nombre, int tripulacion, int potenciaArma, double velocidadMaxima) {
        super(nombre, tripulacion, potenciaArma);
        if (velocidadMaxima < 0) {
            throw new IllegalArgumentException("No puede ir hacia atras");
        } else {
            this.velocidadMaxima = velocidadMaxima;
        }
    }
    public void activarHiperimpulso() {
        System.out.println(getNombre() + " activa el hiperimpulso a " + velocidadMaxima + "Km/s");
    }
}
