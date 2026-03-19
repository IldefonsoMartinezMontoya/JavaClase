import java.util.Scanner;

public class AreayLongitud {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca radio");

        double radio = sc.nextDouble();
        double longitud; longitud = 2.0 * Math.PI * radio;
        double area; area = Math.PI * Math.pow(radio, 2);

        System.out.println("El área y longitud de la circunferencia son:"+
                " "+ area +" "+"y"+" "+ longitud);
    }
}
