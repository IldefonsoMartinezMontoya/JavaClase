import java.util.Scanner;

public class OrdenN1N2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduzca tres número");

                int n1 = entrada.nextInt();
                int n2 = entrada.nextInt();
                int n3 = entrada.nextInt();

         if (n1>=n2 && n1>=n3){
             if (n2>=n3)
                 System.out.println(n1+" "+n2+" "+n3);
             else
                 System.out.println(n1+" "+n3+" "+n2);
         } else if (n2>=n1 && n2>=n3) {
             if (n1>=n3)
                 System.out.println(n2+" "+n1+" "+n3);
             else
                 System.out.println(n2+" "+n3+" "+n1);
         } else  {
             if (n1>=n2)
                 System.out.println(n3+" "+n1+" "+n2);
             else
                 System.out.println(n3+" "+n2+" "+n1);
         }
    }
}

