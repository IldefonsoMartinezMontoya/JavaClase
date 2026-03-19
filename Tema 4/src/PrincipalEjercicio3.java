public class PrincipalEjercicio3 {
    public static void main(String[] args) {
        Ejercicio_3 c3 = new Ejercicio_3("Manzana", "Rojo", 50);

        c3.setNombre("Kiwi");
        c3.setColor("Marrón");
        c3.setPeso(100);
        System.out.println(c3.getNombre() + " color: " + c3.getColor() + " y pesa: " + c3.getPeso() + " Kg");
    }
}
