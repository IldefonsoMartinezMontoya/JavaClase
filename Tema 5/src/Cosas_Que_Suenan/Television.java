package Cosas_Que_Suenan;

public class Television implements EmisorAudio{
    private boolean verdadero = true;
    @Override
    public void encender() {
        if (verdadero) {
            System.out.println("Encendido");
        } else {
            verdadero = true;
            System.out.println("Encendido");
        }
    }

    @Override
    public void apagar() {
        if (!verdadero) {
            System.out.println("Apagado");
        } else {
            verdadero = false;
            System.out.println("Apagado");
        }
    }

    @Override
    public void subirVolumen(int nivelVolumen) {
        if (nivelVolumen < 0) {
            throw new IllegalArgumentException("no puede ser negativo");
        } else {
            System.out.println("Volumen subido a: " + nivelVolumen);
        }
    }

    @Override
    public void bajarVolumen(int nivelVolumen) {
        if (nivelVolumen < 0) {
            throw new IllegalArgumentException("no puede ser negativo");
        } else {
            System.out.println("Volumen bajado a: " + nivelVolumen);
        }
    }
}
