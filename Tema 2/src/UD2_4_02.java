import java.util.Scanner;

public class UD2_4_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean valido = false;
        int entero;
        do {
            try {
                String linea = sc.nextLine();
            entero = Integer.parseInt(linea);
            valido=true;
            System.out.println("El entero es"+" "+ entero);
           }catch (NumberFormatException e){
            System.err.println("No has introducido entero");
           }
        }while (!valido);
    }
}
