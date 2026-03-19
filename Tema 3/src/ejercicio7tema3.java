import java.util.Scanner;

public class ejercicio7tema3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cadena = sc.nextLine();
        String result = "";
        boolean anteriorletra = false;

        for (int i = 0; i < cadena.length(); i++) {
            char c = cadena.charAt(i);
            if (Character.isLetter(c)){
                result = result + c;
                anteriorletra = true;

            }else {
                if (anteriorletra){
                    result = result + " ";
                    anteriorletra = false;
                }
            }
        }
        System.out.println(result);
    }
}
