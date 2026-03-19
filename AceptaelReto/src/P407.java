import java.util.Scanner;

public class P407 {
    public static void main(String[] args) {

        while (P407()) ;
    }

    public static boolean P407() {
        Scanner sc = new Scanner(System.in);

        int c = sc.nextInt();
        int p = sc.nextInt();
        int t = sc.nextInt();
        if (c == 0 && p == 0 && t == 0) {
            return false;
        }
        int fin;
        if (p + t > c) {
            fin = c - (p + t - c);
        } else {
            fin = p + t;
        }
        System.out.println(fin);
        return true;
    }
}
