package estructurasderepeticion;

import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int personas;
        int totalpersonas = 0;
        int autobuses; autobuses = (totalpersonas % 55)+1;
        do {
            personas = sc.nextInt();
            if (personas < 0){
                System.out.println("Nose admiten numeros negativos");
            } else if (personas > 0) {
                totalpersonas += personas;
            }
        }while (personas != 0);
        autobuses = (totalpersonas / 55)+1;


        System.out.println("Las personas apuntadas son: " + totalpersonas);
        System.out.println("Los autobuses necesarios son: " + autobuses);
    }
}
