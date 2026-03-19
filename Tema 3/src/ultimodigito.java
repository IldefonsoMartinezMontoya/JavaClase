import java.util.Scanner;

public class ultimodigito {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[10];
        int contador = 0;
        while (true){
            int n = sc.nextInt();
            if (n < 0){
                break;
            }
            num [n % 10]++;
            contador++;
        }
        System.out.println("Hay " + contador + " números");
        for (int i = 0; i < 10; i++) {
            if (num[i] != 0){
                System.out.println(num[i] + "acaban en " + i);
            }
        }
    }
}
