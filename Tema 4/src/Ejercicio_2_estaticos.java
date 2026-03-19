import java.text.DecimalFormat;

public class Ejercicio_2_estaticos {
    private double cotizacion = 1.04;

    public void eurosADolares(double euros) {
        double dolares = euros * cotizacion;
        if (dolares < 0 || euros < 0) {
            throw new IllegalArgumentException("La cantidad debe ser posititva");
        }
        DecimalFormat df = new DecimalFormat("#.00");
        System.out.println(euros + " EUR = " + df.format(dolares) + " USD");
    }

    public void dolaresAEuros(double dolares) {
        double euros = dolares / cotizacion;
        if (dolares < 0 || euros < 0) {
            throw new IllegalArgumentException("La cantidad debe ser posititva");
        }
        DecimalFormat df = new DecimalFormat("#.00");
        System.out.println(dolares + " USD = " + df.format(euros) + " EUR");
    }

    public void setCotizacion(double cotizacion) {
        this.cotizacion = cotizacion;
        if (cotizacion < 0) {
            throw new IllegalArgumentException("La cantidad debe ser superior a 0");
        }
    }
}
