package FicherosSecuencialesBinarios;

import java.io.FileOutputStream;
import java.io.IOException;

public class GeneradorPrueba {
    public static void main(String[] args) {
        try (FileOutputStream fos = new FileOutputStream("Tema 7/src/FicherosSecuencialesBinarios/prueba.dat")) {
            fos.write(new byte[]{10, 20, 50, 20, 100, 20, 50});
            System.out.println("Archivo 'prueba.dat' creado.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}