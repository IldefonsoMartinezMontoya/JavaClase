import java.util.Scanner;

public class P677 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            P677();
        }
    }

    public static void P677() {
        long multiplodecinco = sc.nextLong();

        multiplodecinco = multiplodecinco / 10;
        if (multiplodecinco != 0){
            System.out.print(multiplodecinco * (multiplodecinco + 1));
        }
        System.out.println("25");


    }
}
