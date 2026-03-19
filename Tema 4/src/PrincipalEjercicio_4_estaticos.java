public class PrincipalEjercicio_4_estaticos {
    public static void main(String[] args) {
        Ejercicio_4_estaticos c4 = new Ejercicio_4_estaticos(200);

        c4.activarLimitador();
        c4.setLimitacion(360);
        c4.desactivarLimiador();
        c4.acelerar(300);
        System.out.println(c4);
    }
}
