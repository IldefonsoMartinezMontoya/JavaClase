import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca base y altura");

        int base = sc.nextInt();
        int altura = sc.nextInt();
        int area; area = base * altura;

        System.out.println("El área es"+" "+area);
    }
}
