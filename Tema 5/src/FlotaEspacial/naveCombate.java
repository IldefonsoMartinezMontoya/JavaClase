package FlotaEspacial;

public class naveCombate extends naveEspacial {
    private  int potenciaArma;
    public naveCombate(String nombre, int tripulacion, int potenciaArma) {
        super(nombre, tripulacion);
        if (potenciaArma < 0) {
            throw new IllegalArgumentException("no puede no tener potencia");
        } else {
            this.potenciaArma = potenciaArma;
        }
    }
    public void disparar() {
        System.out.println(getNombre() + " dispara con una potencia de " + potenciaArma + "GW");
    }

    @Override
    public void activarSistemaDefensa() {
        System.out.println(getNombre() +": Escudos deflectores activados");
    }
}
