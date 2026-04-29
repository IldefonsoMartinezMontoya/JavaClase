import java.util.Scanner;

public class tictoc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int horas = sc.nextInt();
        int minutos = sc.nextInt();
        int faltan = 1440 - (horas * 60 + minutos);

        System.out.println(faltan);
    }
}
