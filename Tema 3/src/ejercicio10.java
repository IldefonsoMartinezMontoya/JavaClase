import java.util.Scanner;

public class ejercicio10 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String opcion;
        while (true){
            System.out.println("¿Deseas introducir otra cadena?");
            opcion = sc.nextLine();
            if (opcion.equalsIgnoreCase("s")){
                break;
            } else if (opcion.equalsIgnoreCase("n")) {
                System.out.println("Programa finalizado");
                return;
            }else {
                System.out.println("Opcion incorrecta");
            }
        }
        String cadena = sc.nextLine();
        eliminarvocales(cadena);

    }

    private static String eliminarvocales(String cadena) {
        for (int i = 0; i < cadena.length(); i++) {
            char c = cadena.charAt(i);

            if (c == 'A' || c == 'a' || c == 'E' || c == 'e' ||c == 'I' || c == 'i'|| c == 'O' || c == 'o' ||c == 'U' || c == 'u'){
                System.out.print(cadena.replace(c,' '));
            }
        }
        return cadena;
    }

}
