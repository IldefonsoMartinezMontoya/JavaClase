import com.sun.source.tree.NewArrayTree;

import java.util.Scanner;
public class P191 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            P191();
        }
    }
    public static void P191() {
        Scanner sc = new Scanner(System.in);

        int numerodeacuarios = sc.nextInt();
        int litros = sc.nextInt();
        int diferencia = sc.nextInt();
        int total = 0;

        for (int i = 0; i <numerodeacuarios; i++) {
            total += litros;
            litros -= diferencia;
        }
        System.out.println(total);




    }
}
