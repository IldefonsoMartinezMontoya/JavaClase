public class Ejercicio_4_enumeracion {
    private boolean rojo;
    private boolean negro;
    private PALOINGLES palo;

    public Ejercicio_4_enumeracion() {

    }
    public void esRojo() {
        rojo = true;
    }
    public void esNegro() {
        negro = true;
    }
    public void getSimbol() {
        if (rojo) {
            System.out.println(PALOINGLES.CORAZONES + "♥" + PALOINGLES.DIAMANTES + "♦");
        } else if (negro) {
            System.out.println(PALOINGLES.PICAS + "♠" + PALOINGLES.TREBOLES + "♣");
        } else if (rojo && negro) {
            System.out.println(PALOINGLES.CORAZONES + "♥" + PALOINGLES.DIAMANTES + "♦");
            System.out.println(PALOINGLES.PICAS + "♠" + PALOINGLES.TREBOLES + "♣");
        }
    }
}
