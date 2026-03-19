import java.util.Scanner;

public class circulos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double area;
        double longitud;
        double r = sc.nextDouble();

        area = (int) Math.PI * Math.pow(r,2);
        longitud = 2 * Math.PI * r;

        System.out.println(area);
        System.out.println(longitud);
    }
}
