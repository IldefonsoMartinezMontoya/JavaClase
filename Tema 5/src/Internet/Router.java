package Internet;

public class Router implements Conectable, Actualizable{
    @Override
    public void buscarActualizacion() {
        System.out.println("Buscando");
    }

    @Override
    public void conectarWifi() {
        System.out.println("Conectado");
    }

    @Override
    public void desconectarWifi() {
        System.out.println("Desconectado");
    }
    public void configurarPorDefecto() {
        System.out.println("Configuración estandar WiFi aplicada");
    }
}
