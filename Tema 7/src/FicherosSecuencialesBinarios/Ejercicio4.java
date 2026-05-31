package FicherosSecuencialesBinarios;

import java.io.*;

public class Ejercicio4 {
    public static void intercambiador(String entrada, String salida, int buscar, int reemplazar) {
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(entrada));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(salida))) {
            int byteActual;
            while ((byteActual = bis.read()) != -1) {
                if (byteActual == buscar) {
                    byteActual = reemplazar;
                }
                bos.write(byteActual);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    static void main() {
        intercambiador("Tema 7/src/FicherosSecuencialesBinarios/prueba.dat", "Tema 7/src/FicherosSecuencialesBinarios/prueba2.dat", 10, 20);
    }
}
