import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Ejercicio_3_enumeracion {
    private int numero;
    private PALO palo;

    public Ejercicio_3_enumeracion(int numero, PALO palo) {
        if (numero < 1 || numero > 12) {
            throw new IllegalArgumentException("El numero tiene que estar entre 1 y 12");
        }
        this. numero = numero;
        this.palo = palo;
    }
    public void escribir() {
        switch (numero) {
            case 1:
                System.out.println("AS de " + palo);
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                System.out.println(numero + " de " + palo);
                break;
            case 10:
                System.out.println("SOTA de " + palo);
                break;
            case 11:
                System.out.println("CABALLO de " + palo);
                break;
            case 12:
                System.out.println("REY de " + palo);
                break;
            default:
                System.out.println("Carta no válida");
        }
    }
    public void dibujarCarta() {
        System.out.print("+");
        for (int i = 0; i < 9; i++) {
            System.out.print("-");
        }
        System.out.println("+");
        System.out.println("| " + numero + "      |");
        for (int i = 0; i < 3; i++) {
            System.out.println("|         |");
        }
        switch (palo) {
            case BASTOS:
                System.out.println("|" + "  BASTOS |");
                break;
            case OROS:
                System.out.println("|" + "    OROS |");
                break;
            case REY:
                System.out.println("|" + "     REY |");
                break;
            case COPAS:
                System.out.println("|" + "   COPAS |");
            default:
        }
        System.out.print("+");
        for (int i = 0; i < 9; i++) {
            System.out.print("-");
        }
        System.out.println("+");
    }
}
