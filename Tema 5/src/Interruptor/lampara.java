package Interruptor;

public class lampara implements Encendible{
    private boolean verdadero = true;
    @Override
    public void encender() {
        if (verdadero) {
            System.out.println("Encendida");
        } else {
            verdadero = true;
            System.out.println("Encendida");
        }
    }

    @Override
    public void apagar() {
        if (!verdadero) {
            System.out.println("Apagada");
        } else {
            verdadero = false;
            System.out.println("Apagada");
        }
    }
}
