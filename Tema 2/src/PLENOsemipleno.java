import java.util.Scanner;

public class PLENOsemipleno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tirada1 = sc.nextInt();
        int tirada11 = sc.nextInt();
        int tirada2 = sc.nextInt();
        int tirada22 = sc.nextInt();
        int turno1; turno1 = tirada1 + tirada11;
        int turno2; turno2 = tirada2+ tirada22;


        if (tirada1 == 10){
            turno2 = tirada2*2 + tirada22*2;
        } else if (tirada1+tirada11 == 10) {
            turno2 = tirada2*2 + tirada22;
        }
        System.out.println(turno1+turno2);

    }
}
