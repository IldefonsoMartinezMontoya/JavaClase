import java.util.Scanner;

public class triangulos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int area;
        int base = sc.nextInt();
        int altura = sc.nextInt();

        area = (base * altura) / 2;

        System.out.println(area);
    }
}
