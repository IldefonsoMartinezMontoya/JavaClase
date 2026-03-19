package Interruptor;

public class focos implements Encendible{
    private boolean verdadero = true;
    @Override
    public void encender() {
        if (verdadero) {
            System.out.println("Encendidos");
        } else {
            verdadero = true;
            System.out.println("Encendidos");
        }
    }

    @Override
    public void apagar() {
        if (!verdadero) {
            System.out.println("Apagados");
        } else {
            verdadero = false;
            System.out.println("Apagados");
        }
    }
}
