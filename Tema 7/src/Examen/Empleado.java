package Examen;

import java.util.Scanner;

public class Empleado {
    private String dni;
    private String nombre;
    private double salario;
    private boolean activo;
    private boolean borrado;

    public Empleado(String dni, String nombre, double salario, boolean activo, boolean borrado) {
        setDni(dni);
        setNombre(nombre);
        setSalario(salario);
        this.activo = activo;
        this.borrado = borrado;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        if (dni.isEmpty()) {
            throw new IllegalArgumentException("No puede estar vacío");
        } else if (dni.length() > 9) {
            throw new IllegalArgumentException("Demasiado largo, 9 caracteres máximo");
        } else {
            this.dni = dni;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre.isEmpty()) {
            throw new IllegalArgumentException("No puede estar vacío");
        } else if (nombre.length() > 30) {
            throw new IllegalArgumentException("Demasiado largo, 9 caracteres máximo");
        } else {
            this.nombre = nombre;
        }
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if (salario < 0) {
            throw new IllegalArgumentException("No puede ser negativo");
        } else {
            this.salario = salario;
        }
    }
}
