import java.util.Scanner;

public class P355GregorioXIII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i <n; i++) {
            int anio = sc.nextInt();
            if (anio % 400 == 0 || anio % 4 == 0 && anio % 100 != 0){
                System.out.println("29");
            }else {
                System.out.println("28");
            }
        }







}
}