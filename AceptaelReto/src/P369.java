import java.util.Scanner;

public class P369 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        while (casoDePrueba());
    }

    public static boolean casoDePrueba() {

        int n = sc.nextInt();
        if (n == 0){
            return false;
        }
        for (int i = 0; i <n; i++) {
            System.out.print("1");
        }
        System.out.println();
        return true;
    }
}
