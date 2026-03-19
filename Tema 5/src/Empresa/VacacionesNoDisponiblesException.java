package Empresa;

public class VacacionesNoDisponiblesException extends IllegalArgumentException {
    public VacacionesNoDisponiblesException(String mensaje) {
        super(mensaje);
    }
}
