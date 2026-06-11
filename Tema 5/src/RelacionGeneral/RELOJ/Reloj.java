package RelacionGeneral.RELOJ;

import org.w3c.dom.html.HTMLObjectElement;

public class Reloj {
    private int hora;
    private int minutos;
    private int segundos;

    public Reloj() {
        setSegundos(0);
        setHora(0);
        setMinutos(0);
    }
    public Reloj(int hora) {
        setHora(hora);
        setMinutos(0);
        setSegundos(0);
    }
    public Reloj(int hora, int minutos) {
        setHora(hora);
        setMinutos(minutos);
        setSegundos(0);
    }
    public Reloj(int hora, int minutos, int segundos) {
        setHora(hora);
        setMinutos(minutos);
        setSegundos(segundos);
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", hora, minutos, segundos);
    }

    public void incrementaSegundos() {
        incrementaSegundos(1);
    }
    public void incrementaSegundos(int segundosAsumar) {
        if (segundosAsumar < 0) {
            throw new IllegalArgumentException("No se pueden acumular segundos negativos.");
        }
        int totalSegundos = this.segundos + segundosAsumar;
        this.segundos = totalSegundos % 60;
        int totalMinutos = this.minutos + (totalSegundos / 60);
        this.minutos = totalMinutos % 60;
        int totalHoras = this.hora + (totalMinutos / 60);
        this.hora = totalHoras % 24;
    }
    public int getHora() {
        return hora;
    }

    private void setHora(int hora) {
        if (hora < 0 || hora > 23) {
            throw new IllegalArgumentException("La hora debe estar entre 0 y 23");
        }
        this.hora = hora;
    }

    public int getMinutos() {
        return minutos;
    }

    private void setMinutos(int minutos) {
        if (minutos < 0 || minutos > 59) {
            throw new IllegalArgumentException("Los minutos deben estar entre 0 y 59");
        }
        this.minutos = minutos;
    }

    public int getSegundos() {
        return segundos;
    }

    private void setSegundos(int segundos) {
        if (segundos < 0 || segundos > 59) {
            throw new IllegalArgumentException("Los segundos deben estar entre 0 y 59");
        }
        this.segundos = segundos; // ¡Arreglado! Ahora sí guarda el valor
    }
}
