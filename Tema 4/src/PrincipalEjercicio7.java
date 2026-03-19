public class PrincipalEjercicio7 {
    public static void main(String[] args) {
        Ejercicio_7 c7 = new Ejercicio_7(10, 5);

        c7.setOperando1(-7);
        c7.setOperando2(-5);
        System.out.println(c7.suma());
        System.out.println(c7.resta());
        System.out.println(c7.producto());
        System.out.println(c7.cocienteDivision());
        System.out.println(c7.restoDivision());
    }
}
