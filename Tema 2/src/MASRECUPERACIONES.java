import java.util.Scanner;

public class MASRECUPERACIONES {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("INTRODUZCA LAS NOTAS");
        double nota1 = sc.nextDouble();
        double nota2 = sc.nextDouble();
        double nota3 = sc.nextDouble();
        int recuperaciones = 0;

        if (nota1 < 5.0){
            recuperaciones++;
        }
        if (nota2 < 5.0){
            recuperaciones++;
        }
        if (nota3 < 5.0){
            recuperaciones++;
        }
        if (recuperaciones == 0){
            System.out.println("ENHORABUENA NO TIENES NADA QUE RECUPERAR");
        }else {
            System.out.println("TIENES QUE HACER"+" "+ recuperaciones+" "+"RECUPERACION(ES)");
        }
    }
}
