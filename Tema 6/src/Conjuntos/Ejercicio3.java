package Conjuntos;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Ejercicio3 {
    static void main(String[] args)
    {
        Set<Integer> lista = new HashSet<>();
        while (numerosUnicos(lista));
    }
    static boolean numerosUnicos(Set<Integer> lista) {
        Scanner sc = new Scanner(System.in);
        int numeric = sc.nextInt();
        if (numeric == 0) {
            System.out.println(lista);
            return false;
        } else {
            lista.add(numeric);
        }
        return true;
    }
}
