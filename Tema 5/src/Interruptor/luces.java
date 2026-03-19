package Interruptor;

public class luces implements Encendible{
    private boolean verdadero = true;
    @Override
    public void encender() {
        if (verdadero) {
            System.out.println("Encendidas");
        } else {
            verdadero = true;
            System.out.println("Encendidas");
        }
    }

    @Override
    public void apagar() {
        if (!verdadero) {
            System.out.println("Apagadas");
        } else {
            verdadero = false;
            System.out.println("Apagadas");
        }
    }
}
