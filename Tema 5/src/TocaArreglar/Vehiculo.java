package TocaArreglar;

public class Vehiculo implements Reparable{
    private String estado;
    public Vehiculo(String estado) {
        this.estado = estado;
    }
    @Override
    public void reparar() {
        System.out.println("Reparado");
    }

    @Override
    public void verificarEstado() {
        if (estado.equalsIgnoreCase("Averiado")) {
            System.out.println("Necesita reparación");
        } else {
            System.out.println("Está en buen estado");
        }
    }

    @Override
    public void metodoReparacionEstandar() {
        verificarEstado();
    }

    @Override
    public void notificarTecnico() {
        System.out.println("Se ha llamado al técnico");
    }
}
