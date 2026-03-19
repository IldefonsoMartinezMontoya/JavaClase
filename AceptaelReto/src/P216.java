import java.util.Scanner;

public class P216 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            P216();
        }
    }
    public static void P216() {
     int segundos = sc.nextInt();
     int minutos = 0;
     int horas = 0;

     
     if (segundos > 60){
         segundos = segundos % 60;
         minutos= segundos / 60;
     } else if (minutos > 60) {
         minutos = minutos % 60;
         horas = minutos / 60;
     }



    }
}
