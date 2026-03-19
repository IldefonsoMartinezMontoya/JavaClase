public class Ejercicio_6 {
    private int horas;
    private int minutos;
    private int segundos;

    public Ejercicio_6(int horas, int minutos, int segundos) {
        setSegundos(segundos);
        if (segundos < 0 || segundos > 60) {
            throw new IllegalArgumentException("Segundos no validos");
        } else if (segundos == 60) {
            minutos++;
        }
        setMinutos(minutos);
        if (minutos < 0 || minutos > 60) {
            throw new IllegalArgumentException("Minutos no validos");
        } else if (minutos == 60) {
            horas++;
        }
        setHoras(horas);
        if (horas < 0 || horas > 24) {
            throw new IllegalArgumentException("Hora no valida");
        } else if (horas == 24){
            horas = 0;
        }
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", horas, minutos, segundos);

    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        if (segundos < 0 || segundos > 60) {
            throw new IllegalArgumentException("Segundos no validos");
        } else if (segundos == 60) {
            minutos++;
            segundos = 0;
        }
        this.segundos = segundos;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        if (minutos < 0 || minutos > 60) {
            throw new IllegalArgumentException("Minutos no validos");
        } else if (minutos == 60) {
            horas++;
            minutos = 0;
        }
        this.minutos = minutos;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        if (horas < 0 || horas > 24) {
            throw new IllegalArgumentException("Hora no valida");
        } else if (horas == 24){
            horas = 0;
        }
        this.horas = horas;
    }
}
