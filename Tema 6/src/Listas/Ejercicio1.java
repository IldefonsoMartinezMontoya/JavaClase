package Listas;

import javax.management.MBeanAttributeInfo;
import java.util.ArrayList;

public class Ejercicio1 {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<Integer>();
        for (int i = 0; i < 110; i+= 10) {
            lista.add(i);
        }
        System.out.println(lista);
        for (int numero : lista) {
            System.out.print(numero + " ");
        }
        System.out.println();
        for (int numero : lista.reversed()) {
            System.out.print(numero + " ");
        }
    }
}
