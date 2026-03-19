import java.util.Scanner;

public class deposito {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int capacidad = sc.nextInt();
        int consumo = sc.nextInt();
        int viaje;
        viaje = capacidad / (consumo * 2);

        System.out.println(viaje);
    }
}
