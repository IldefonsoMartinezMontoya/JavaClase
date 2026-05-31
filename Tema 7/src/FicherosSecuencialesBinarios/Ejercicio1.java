package FicherosSecuencialesBinarios;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ejercicio1 {
    public static int contarBytes(String fichero, int byteContado) {
            int contador = 0;
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(fichero))){
            if (byteContado < 0 || byteContado > 255) {
                return -1;
            }
            int byteActual;
            while ((byteActual = bis.read()) != -1) {
                if (byteActual == byteContado) {
                    contador++;
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Fichero no encontrado");
            return -1;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return contador;
    }

    static void main() {
        int resultado = contarBytes("Tema 7/src/FicherosSecuencialesBinarios/prueba.dat", 20);
        System.out.println(resultado);
    }
}
