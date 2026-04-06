package Diccionarios;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio4 {
    static Map<String, Integer> terminados0 = new LinkedHashMap<>();
    static Map<String, Integer> terminados4 = new LinkedHashMap<>();
    static Map<String, Integer> terminados3 = new LinkedHashMap<>();
    static Map<String, Integer> terminados2 = new LinkedHashMap<>();
    static Map<String, Integer> terminados1 = new LinkedHashMap<>();
    static Map<String, Integer> terminados5 = new LinkedHashMap<>();
    static Map<String, Integer> terminados6 = new LinkedHashMap<>();
    static Map<String, Integer> terminados7 = new LinkedHashMap<>();
    static Map<String, Integer> terminados8 = new LinkedHashMap<>();
    static Map<String, Integer> terminados9 = new LinkedHashMap<>();

    static void main() {
        while (true) {
            Scanner sc = new Scanner(System.in);
            String palabreja = sc.next();
            if (palabreja.matches("-\\d+")) {
                System.out.println(STR."Terminados en 0: \{terminados0}");
                System.out.println(STR."Terminados en 1: \{terminados1}");
                System.out.println(STR."Terminados en 2: \{terminados2}");
                System.out.println(STR."Terminados en 3: \{terminados3}");
                System.out.println(STR."Terminados en 4: \{terminados4}");
                System.out.println(STR."Terminados en 5: \{terminados5}");
                System.out.println(STR."Terminados en 6: \{terminados6}");
                System.out.println(STR."Terminados en 7: \{terminados7}");
                System.out.println(STR."Terminados en 8: \{terminados8}");
                System.out.println(STR."Terminados en 9: \{terminados9}");
                break;
            } else {
                if (palabreja.matches("^(\\d+0|0)$")) {
                    if (terminados0.containsKey(palabreja)) {
                        terminados0.put(palabreja, terminados0.get(palabreja) + 1);
                    } else {
                        terminados0.put(palabreja, 1);
                    }
                } else if (palabreja.matches("^(\\d+1|1)$")) {
                    if (terminados1.containsKey(palabreja)) {
                        terminados1.put(palabreja, terminados1.get(palabreja) + 1);
                    } else {
                        terminados1.put(palabreja, 1);
                    }
                } else if (palabreja.matches("^(\\d+2|2)$")) {
                    if (terminados2.containsKey(palabreja)) {
                        terminados2.put(palabreja, terminados2.get(palabreja) + 1);
                    } else {
                        terminados2.put(palabreja, 1);
                    }
                } else if (palabreja.matches("^(\\d+3|3)$")) {
                    if (terminados3.containsKey(palabreja)) {
                        terminados3.put(palabreja, terminados3.get(palabreja) + 1);
                    } else {
                        terminados3.put(palabreja, 1);
                    }
                } else if (palabreja.matches("^(\\d+4|4)$")) {
                    if (terminados4.containsKey(palabreja)) {
                        terminados4.put(palabreja, terminados4.get(palabreja) + 1);
                    } else {
                        terminados4.put(palabreja, 1);
                    }
                } else if (palabreja.matches("^(\\d+5|5)$")) {
                    if (terminados5.containsKey(palabreja)) {
                        terminados5.put(palabreja, terminados5.get(palabreja) + 1);
                    } else {
                        terminados5.put(palabreja, 1);
                    }
                } else if (palabreja.matches("^(\\d+6|6)$")) {
                    if (terminados6.containsKey(palabreja)) {
                        terminados6.put(palabreja, terminados6.get(palabreja) + 1);
                    } else {
                        terminados6.put(palabreja, 1);
                    }
                } else if (palabreja.matches("^(\\d+7|7)$")) {
                    if (terminados7.containsKey(palabreja)) {
                        terminados7.put(palabreja, terminados7.get(palabreja) + 1);
                    } else {
                        terminados7.put(palabreja, 1);
                    }
                } else if (palabreja.matches("^(\\d+8|8)$")) {
                    if (terminados8.containsKey(palabreja)) {
                        terminados8.put(palabreja, terminados8.get(palabreja) + 1);
                    } else {
                        terminados8.put(palabreja, 1);
                    }
                } else if (palabreja.matches("^(\\d+9|9)$")) {
                    if (terminados9.containsKey(palabreja)) {
                        terminados9.put(palabreja, terminados9.get(palabreja) + 1);
                    } else {
                        terminados9.put(palabreja, 1);
                    }
                }
            }
        }
    }
}
