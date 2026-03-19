public class PrincipalEjercicio9 {
    public static void main(String[] args) {
        Ejercicio_9 c9 = new Ejercicio_9(50, 30);
        System.out.println(c9);
        c9.repostar(20);
        System.out.println(c9);
        c9.consumir(7);
        System.out.print(c9 + " ");
        System.out.println(c9.porcentaje() + "%");
    }
}
