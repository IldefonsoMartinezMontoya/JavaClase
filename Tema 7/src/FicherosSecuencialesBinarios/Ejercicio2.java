package FicherosSecuencialesBinarios;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Ejercicio2 {
    public static void contarBytes(String fichero) {
        Map<Integer, Integer> lista = new HashMap<>();
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(fichero))){
            int byteActual;
            while ((byteActual = bis.read()) != -1) {
                lista.merge(byteActual, 1, Integer::sum);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Fichero no encontrado");
            } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println(lista);
    }

    static void main() {
        contarBytes("Tema 7/src/FicherosSecuencialesBinarios/prueba.dat");
    }
}
