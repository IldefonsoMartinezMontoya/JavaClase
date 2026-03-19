public class PrincipalEjercicio1 {
    public static void main(String[] args) {
        Ejercicio_1 c1 = new Ejercicio_1("Chuck Norris", 31, 8, 1950);

        c1.setNombre("Mortadelo");
        c1.setMesnacimiento(12);
        c1.setDianacimiento(31);
        c1.setAnionacimiento(1443);
        System.out.println(c1.getNombre() + " " + c1.getDianacimiento() + "/" + c1.getMesnacimiento() +
                "/" + c1.getAnionacimiento());

    }
}
