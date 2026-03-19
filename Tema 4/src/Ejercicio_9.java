public class Ejercicio_9 {
    private int capacidad;
    private int contenido;
    private EstadoDeposito estado;

    public Ejercicio_9(int capacidad, EstadoDeposito estado) {
        this(capacidad);
        if (estado == null) {
            throw new IllegalArgumentException("Da un estado valido");
        }
        this.estado = estado;
    }
    public Ejercicio_9(int capacidad, int contenido) {
        this.estado = EstadoDeposito.MONTADO;
        this.capacidad = capacidad;
        if (capacidad <= 0) {
            throw new IllegalArgumentException("El deposito necesita una capacidad válidad");
        }
        this.contenido = contenido;
    }
    public Ejercicio_9(int capacidad) {
        this(capacidad, 0);
    }
    public boolean estaVacio() {
        return contenido == 0;
    }
    public boolean estaLleno() {
        return contenido == capacidad;
    }
    public String toString() {
        return String.format("%02d/%02d", contenido, capacidad);
    }
    public void repostar(int litros) {
        if (estado == EstadoDeposito.DESMONTADO || estado == EstadoDeposito.SELLADO) {
            throw new IllegalStateException("No se puede repostar porque no esta montado o está sellado");
        }
        if (contenido + litros > capacidad) {
            throw new IllegalArgumentException("Se necesita un repostaje valido");
        } else if (litros < 0) {
            throw new IllegalArgumentException("Se necesita un repostaje valido");
        }
        contenido += litros;
    }
    public void consumir(int litros) {
        if (estado == EstadoDeposito.DESMONTADO) {
            throw new IllegalStateException("No se puede consumir porque no esta montado");
        }
        if (contenido - litros < 0) {
            throw new IllegalArgumentException("Se necesita un consumo válido");
        }
        contenido -= litros;
    }
    public double porcentaje() {
        return (double) contenido / capacidad * 100;
    }

}
