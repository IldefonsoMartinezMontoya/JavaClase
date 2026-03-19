import java.util.Scanner;

public class áreaCirculo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca el radio");

        double radio = sc.nextInt();
        double area; area = Math.PI * Math.pow(radio, 2);

        System.out.println("El área del círculo de radio:"+" "+ radio+","+" "+"es:"+area);





    }
}
