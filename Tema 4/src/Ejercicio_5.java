public class Ejercicio_5 {
    private double radio;

    public Ejercicio_5(double radio) {
        setRadio(radio);
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        if (radio <= 0) {
            throw new IllegalArgumentException("El radio tiene que ser mayor que 0");
        }
        this.radio = radio;
    }

    public double calcularArea() {
        return Math.PI * radio * radio;
    }

    public double calcularLongitud() {
        return 2 * Math.PI * radio;
    }

}