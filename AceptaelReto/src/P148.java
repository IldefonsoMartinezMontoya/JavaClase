import java.util.Scanner;

public class P148 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        while (casoDePrueba());
    }

    public static boolean casoDePrueba() {
        String cadena = sc.nextLine();

        if (!cadena.equals("00:00")) {
            int horas = Integer.parseInt(cadena.substring(0, 2));
            int minutos = Integer.parseInt(cadena.substring(3, 5));
            int total;
            int resto = horas * 60 + minutos;
            total = 1440 - resto;
            System.out.println(total);
            return true;
        }
        return false;
    }
}
