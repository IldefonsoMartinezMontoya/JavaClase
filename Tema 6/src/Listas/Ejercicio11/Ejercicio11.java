package Listas.Ejercicio11;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio11 {
    private String matricula;
    private String nombreTitular;
    protected int numeroDePlaza;

    public Ejercicio11(String matricula, String nombreTitular) {
        setMatricula(matricula);
        setNombreTitular(nombreTitular);
        this.numeroDePlaza = 0;
    }
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        if (matricula.isBlank() || !matricula.matches("\\d{4}\\s[A-Z]{3}")) {
            throw new IllegalArgumentException("No puede estar vacío o no cumple con el formato correcto" +
                    " Ejemplo: 8245 LMN");
        } else {
            this.matricula = matricula;
        }
    }
    public String toString() {
        return String.format(STR."Vehículo: \{nombreTitular} \{matricula}");
    }
    public String getNombreTitular() {
        return nombreTitular;
    }
    public void setNombreTitular(String nombreTitular) {
        if (nombreTitular.isBlank()) {
            throw new IllegalArgumentException("No puede estar vacío");
        } else {
            this.nombreTitular = nombreTitular;
        }
    }
    public int getNumeroDePlaza() {
        return numeroDePlaza;
    }
    public void setNumeroDePlaza(int numeroDePlaza) {
        this.numeroDePlaza = numeroDePlaza;
    }
}
