import java.util.Scanner;
import java.util.spi.AbstractResourceBundleProvider;

public class P156 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        while (P156());
    }

    public static boolean P156() {
        int ultimopiso = sc.nextInt();


        if (ultimopiso < 0){
            return false;
        }
        int viajes = 0;
        while (true){
            int llamada = sc.nextInt();

            if (llamada == -1){
                break;
            }

            viajes = viajes + (llamada - ultimopiso);

            if (llamada > ultimopiso){
                viajes = viajes + (llamada - ultimopiso);
            }else {
                viajes = viajes + (ultimopiso+ llamada);
            }
        } System.out.println(viajes); return true;
    }
}