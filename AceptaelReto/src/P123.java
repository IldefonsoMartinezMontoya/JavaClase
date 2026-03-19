import java.util.Scanner;

public class P123 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        while (casoDePrueba());
    }

    public static boolean casoDePrueba() {
        String cadena = sc.nextLine();
        char a = sc.next().charAt(0);
        String cad;
        if (cadena.equalsIgnoreCase("Saltar")) {
            cad = cadena.substring(0, 4);
            switch (a) {
                case 'A':
                    System.out.println("Yo " + cad + "o");
                    System.out.println("Tu " + cad + "as");
                    System.out.println("El/Ella " + cad + "a");
                    System.out.println("Nosotros " + cad + "amos");
                    System.out.println("Vosotros " + cad + "ais");
                    System.out.println("Ellos/Ellas " + cad + "an");
                    break;
                case 'P':
                    System.out.println("Yo " + cad + "e");
                    System.out.println("Tu " + cad + "aste");
                    System.out.println("El/Ella " + cad + "o");
                    System.out.println("Nosotros " + cad + "amos");
                    System.out.println("Vosotros " + cad + "asteis");
                    System.out.println("Ellos/Ellas " + cad + "aron");
                    break;
                case 'F':
                    System.out.println("Yo " + cad + "are");
                    System.out.println("Tu " + cad + "aras");
                    System.out.println("El/Ella " + cad + "ara");
                    System.out.println("Nosotros " + cad + "aremos");
                    System.out.println("Vosotros " + cad + "areis");
                    System.out.println("Ellos/Ellas " + cad + "aran");
                    break;
            }

        } else if (cadena.equalsIgnoreCase("Comer")) {
            cad = cadena.substring(0, 3);
            switch (a) {
                case 'A':
                    System.out.println("Yo " + cad + "o");
                    System.out.println("Tu " + cad + "es");
                    System.out.println("El/Ella " + cad + "e");
                    System.out.println("Nosotros " + cad + "emos");
                    System.out.println("Vosotros " + cad + "eis");
                    System.out.println("Ellos/Ellas " + cad + "en");
                    break;
                case 'P':
                    System.out.println("Yo " + cad + "i");
                    System.out.println("Tu " + cad + "iste");
                    System.out.println("El/Ella " + cad + "io");
                    System.out.println("Nosotros " + cad + "imos");
                    System.out.println("Vosotros " + cad + "isteis");
                    System.out.println("Ellos/Ellas " + cad + "ieron");
                    break;
                case 'F':
                    cad = cadena.substring(0, 3);
                    System.out.println("Yo " + cad + "ere");
                    System.out.println("Tu " + cad + "eras");
                    System.out.println("El/Ella " + cad + "era");
                    System.out.println("Nosotros " + cad + "eremos");
                    System.out.println("Vosotros " + cad + "ereis");
                    System.out.println("Ellos/Ellas " + cad + "eran");
                    break;
            }

        } else if (cadena.equalsIgnoreCase("Vivir")) {
            cad = cadena.substring(0, 3);
            switch (a) {
                case 'A':
                    System.out.println("Yo " + cad + "o");
                    System.out.println("Tu " + cad + "is");
                    System.out.println("El/Ella " + cad + "e");
                    System.out.println("Nosotros " + cad + "imos");
                    System.out.println("Vosotros " + cad + "is");
                    System.out.println("Ellos/Ellas " + cad + "en");
                    break;
                case 'P':
                    System.out.println("Yo " + cad + "i");
                    System.out.println("Tu " + cad + "iste");
                    System.out.println("El/Ella " + cad + "o");
                    System.out.println("Nosotros " + cad + "imos");
                    System.out.println("Vosotros " + cad + "isteis");
                    System.out.println("Ellos/Ellas " + cad + "ieron");
                    break;
                case 'F':
                    System.out.println("Yo " + cad + "ire");
                    System.out.println("Tu " + cad + "iras");
                    System.out.println("El/Ella " + cad + "ira");
                    System.out.println("Nosotros " + cad + "iremos");
                    System.out.println("Vosotros " + cad + "ireis");
                    System.out.println("Ellos/Ellas " + cad + "iran");
                    break;

            }
        } else if (a == 'T') {
            return false;
        }
        return true;
    }
}
