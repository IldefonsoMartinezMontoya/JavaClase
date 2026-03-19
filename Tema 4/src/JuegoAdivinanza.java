import java.util.Random;

public class JuegoAdivinanza {
    private int numero;
    private int numIntentos;
    private boolean acertado;

    public JuegoAdivinanza() {
        Random r = new Random();
        numIntentos = 0;
        acertado = false;
        numero = r.nextInt(1, 7);
    }

    public int getNumIntentos() {
        return numIntentos;
    }

    public void setNumIntentos(int numIntentos) {
        this.numIntentos = numIntentos;
    }

    public boolean isAcertado() {
        return acertado;
    }

    public void setAcertado(boolean acertado) {
        this.acertado = acertado;
    }
    public boolean intentar(int intento) {
        numIntentos++;
        if (numero == intento) {
            acertado = true;
            return true;
        } else {
            acertado = false;
            return false;
        }
    }
}
