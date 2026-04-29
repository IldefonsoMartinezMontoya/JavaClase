import java.util.Scanner;

public class LeyDeOhm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int V;
        int I = sc.nextInt();
        int R = sc.nextInt();

        V = I * R;

        System.out.println(V);
    }
}
