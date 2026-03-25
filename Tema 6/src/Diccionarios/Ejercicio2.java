package Diccionarios;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio2 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        String palabreja = sc.nextLine();
        palabreja = palabreja.toUpperCase();
        Map<Character, String> morse = new LinkedHashMap<>();
        morse.put('A', ".-");
        morse.put('B', "-...");
        morse.put('C', "-.-.");
        morse.put('D', "-..");
        morse.put('E', ".");
        morse.put('F', "-...");
        morse.put('G', "--.");
        morse.put('H', "....");
        morse.put('I', "..");
        morse.put('J', "-.--");
        morse.put('K', "-.-");
        morse.put('L', ".-..");
        morse.put('M', "--");
        morse.put('N', "-.");
        morse.put('Ñ', "--.--");
        morse.put('O', "---");
        morse.put('P', ".--.");
        morse.put('Q', "--.-");
        morse.put('R', ".-.");
        morse.put('S', "...");
        morse.put('T', "-");
        morse.put('U', "..-");
        morse.put('V', "...-");
        morse.put('W', "-.--");
        morse.put('X', "-..-");
        morse.put('Y', "--.-");
        morse.put('Z', "--..");
        morse.put('0', "----");
        morse.put('1', ".----");
        morse.put('2', "..---");
        morse.put('3', "...--");
        morse.put('4', "....-");
        morse.put('5', ".....");
        morse.put('6', "-....");
        morse.put('7', "--...");
        morse.put('8', "---..");
        morse.put('9', "----.");
        for (int i = 0; i < palabreja.length(); i++) {
            char a = palabreja.charAt(i);
            if (a == ' ') {
                System.out.print("  ");
            } else if (morse.containsKey(a)) {
                System.out.print(STR."\{morse.get(a)} ");
            }
        }
    }
}

