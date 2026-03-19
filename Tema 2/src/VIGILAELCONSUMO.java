import java.util.Scanner;

public class VIGILAELCONSUMO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("INTRODUZCA LA POTENCIA MEDIA EN W:");

        int consumo = sc.nextInt();
        int total; total = consumo * 24;
        int dia; dia = total / 1000;

        if (dia > 72){
            total = consumo * 24;
            dia = total / 1000;
            System.out.println("EL CONSUMO DE ENERGÍA TOTAL ES DE"+" "+ dia+ " "+ "kWh");
            System.out.println("CUIDADO! DETECTANDO UN CONSUMO ELEVADO");
        }else {
            System.out.println("EL CONSUMO DE ENERGÍA TOTAL ES DE"+" "+ dia+ " "+ "kWh");
        }
    }
}
