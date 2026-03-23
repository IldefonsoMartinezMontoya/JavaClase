package Conjuntos;

public class Vehiculo {
    private String matricula;
    private String nombre;
    private int numeroPlaza;

    public Vehiculo(String matricula, String nombre) {
        setMatricula(matricula);
        setNombre(nombre);
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

    private int getNumeroPlaza() {
        return numeroPlaza;
    }

    private void setNumeroPlaza(int numeroPlaza) {
        if (numeroPlaza < 0) {
            throw new IllegalArgumentException("No puede ser menor de 0");
        } else {
            this.numeroPlaza = numeroPlaza;
        }
    }
}
