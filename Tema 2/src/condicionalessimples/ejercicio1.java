package condicionalessimples;

import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("INTRODUZCA EL PRECIO Y LAS UNIDADES");

        double precio = sc.nextDouble();
        double numerodeproductos = sc.nextDouble();
        double total; total = precio*numerodeproductos;
        double recibo;
        if (total > 100.0){
            recibo = total - (total*10.0)/100.0;
            System.out.println(recibo);
        }else {
            System.out.println(total);
        }

    }
}
