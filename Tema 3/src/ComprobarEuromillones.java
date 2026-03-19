import java.util.Scanner;

public class ComprobarEuromillones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numerosPremiados = new int[5];
        int[] estrellasPremiadas = new int[2];

        for (int i = 0; i < 5; i++) {
            numerosPremiados[i] = sc.nextInt();
        }
        for (int i = 0; i < 2; i++) {
            estrellasPremiadas[i] = sc.nextInt();
        }

        boolean salir;
        do {
            salir = false;
            int aciertosNumeros = 0;
            int aciertosEstrellas = 0;
            for (int i = 0; i < 5; i++) {
                int num = sc.nextInt();
                if (num == 0) {
                    salir = true;
                } else {
                    for (int j = 0; j < 5; j++) {
                        if (num == numerosPremiados[j]) {
                            aciertosNumeros++;
                        }
                    }
                }
            }
            for (int i = 0; i < 2; i++) {
                int num = sc.nextInt();
                if (num == 0) {
                    salir = true;
                } else {
                    for (int j = 0; j < 2; j++) {
                        if (num == estrellasPremiadas[j]) {
                            aciertosEstrellas++;
                        }
                    }
                }
            }
            if (!salir) {
                System.out.println(aciertosNumeros + " " + aciertosEstrellas);
            }
        } while (!salir);
    }
}