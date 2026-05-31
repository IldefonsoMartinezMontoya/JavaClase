package FicherosSecuencialesBinarios;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ejercicio3 {
    public static boolean esPDF(String fichero) {
        int[] cabeceraPdf = {37, 80, 68, 70, 45};
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(fichero))){
            for (int i = 0; i < cabeceraPdf.length; i++) {
                int byteLeido = bis.read();
                if (byteLeido != cabeceraPdf[i]) {
                    return false;
                }
            }
            return true;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    static void main() {
        if (esPDF("C:\\Users\\ildem\\Downloads\\Examen UD3. Modelo C.-DAM.pdf")) {
            System.out.println("¡Confirmado! El archivo tiene cabecera real de PDF.");
        } else {
            System.out.println("El archivo NO existe o NO es un PDF válido.");
        }
    }
}
