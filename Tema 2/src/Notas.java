import java.util.EventListener;
import java.util.Scanner;

public class Notas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("INTRODUZCA LAS NOTAS");


        double nota1 = sc.nextDouble();
        double nota2 = sc.nextDouble();
        double nota3 = sc.nextDouble();




            if (nota1 < 5.0 ){
                System.out.println("RECUPERAR");
            }else {
                System.out.println("APROBADO");
            }
           if (nota2 < 5.0 ){
            System.out.println("RECUPERAR");
           }else {
               System.out.println("APROBADO");
           }
            if (nota3 < 5.0 ) {
                System.out.println("RECUPERAR");
            }else {
                System.out.println("APROBADO");
            }
            if (nota1 >= 5.0 && nota2 >= 5.0 && nota3 >= 5.0){
                System.out.println("NO TIENE QUE RECUPERAR NADA");
            } else if (nota1 < 5.0 && nota2 < 5.0 && nota3 < 5.0) {

                System.out.println("TIENE QUE RECUPERAR TODO");
            }
    }
}

