import java.util.Scanner;

public class p170 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        while (casoDePrueba());
    }

    public static boolean casoDePrueba() {

        int numerodepiedras = sc.nextInt();

        if (numerodepiedras == 0) {
            return false;
        }
        int lado = 1;
        int piedras_triangulo = 0;
        while (piedras_triangulo < numerodepiedras){
            piedras_triangulo += lado;
            lado++;
        }
        lado--;

        if (piedras_triangulo > numerodepiedras){
            piedras_triangulo -= lado;
            lado--;
        }
        int sobran = numerodepiedras - piedras_triangulo;
        System.out.println(lado + " " + sobran);
        return true;

    }
}
