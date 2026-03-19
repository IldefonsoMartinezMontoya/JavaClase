package FlotaEspacial;

public class Ejercicio_3_main {
    public static void main(String[] args) {
        naveCarga n1 = new naveCarga("nave1", 45, 1000);
        naveCombate n2 = new naveCombate("nave2", 45, 7000);
        naveExploracion n3 = new naveExploracion("nave3", 45, 90);
        cazaEstelar n4 = new cazaEstelar("nave4", 45, 7000, 2000);
        naveEspacial[] naves = {n1, n2, n3, n4};
        for (naveEspacial n : naves) {
            n.activarSistemaDefensa();
            if (n instanceof naveCarga) {
                ((naveCarga) n).cargar(800);
            } else if (n instanceof  naveCombate) {
                ((naveCombate) n).disparar();
            } else if (n instanceof naveExploracion) {
                ((naveExploracion) n).explorar();
            }
        }
    }
}
