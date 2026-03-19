import java.util.Scanner;

public class SiguienteSegundo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hora = sc.nextInt();
        int minutos = sc.nextInt();
        int segundos = sc.nextInt();

        if (hora >= 0 && hora <= 23 && minutos >= 0 && minutos <= 59 && segundos <= 59 && segundos >= 0){
            segundos ++;

            if (segundos == 60){
                segundos = 0;
                minutos ++;
            }
            if ( minutos == 60){
                minutos = 0;
                hora ++;
            }
            if (hora == 24){
                hora = 0;
            }
            System.out.format("%02d:%02d:%02d", hora, minutos, segundos);
        }else {
            System.out.println("La hora no es correcta");
        }


    }
}