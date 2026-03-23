package Conjuntos.Vehiculo;

public class Vehiculo {
    protected String matricula;
    protected String nombre;
    protected int numeroPlaza;

    public Vehiculo(String matricula, String nombre) {
        setMatricula(matricula);
        setNombre(nombre);
        numeroPlaza = 0;
    }

    private String getMatricula() {
        return matricula;
    }

    private void setMatricula(String matricula) {
        if (matricula.isEmpty()) {
            throw new IllegalArgumentException("No puede estar vacío");
        } else {
            this.matricula = matricula;
        }
    }

    private String getNombre() {
        return nombre;
    }

    private void setNombre(String nombre) {
        if (nombre.isEmpty()) {
            throw new IllegalArgumentException("No puede estar vacío");
        } else {
            this.nombre = nombre;
        }
    }

    protected int getNumeroPlaza() {
        return numeroPlaza;
    }

    protected void setNumeroPlaza(int numeroPlaza) {
        if (numeroPlaza < 0) {
            throw new IllegalArgumentException("No puede ser menor de 0");
        } else {
            this.numeroPlaza = numeroPlaza;
        }
    }
}
