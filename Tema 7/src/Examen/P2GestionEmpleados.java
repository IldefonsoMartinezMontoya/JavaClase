package Examen;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.sql.SQLOutput;
import java.util.Scanner;

public class P2GestionEmpleados {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String opcion;
        try (RandomAccessFile raf = new RandomAccessFile("Tema 7/src/Examen/SALIDA.dat", "rw")){
            do {
                System.out.println("Seleccione opción");
                System.out.println("--Añadir empleado");
                System.out.println("--Mostrar Empleados con salario superior a");
                System.out.println("--Mostrar Empleado por posición");
                System.out.println("--Porcentaje de empleados activos");
                System.out.println("--Marcar empleados para borrar");
                System.out.println("--Compactar fichero");
                System.out.println("--FIN");
                opcion = sc.nextLine();
                switch (opcion) {
                    case "Añadir empleado":
                        System.out.print("Inserte dni: ");
                        String dni = sc.next();
                        System.out.print("Inserte nombre: ");
                        String nombre = sc.nextLine();
                        System.out.println("Inserte salario: ");
                        double salario = sc.nextDouble();
                        Empleado e = new Empleado(dni, nombre, salario, true, false);
                        raf.
                        break;
                    case "Mostrar Empleados con salario superior a":
                        System.out.print("Introduce salario a buscar: ");
                        String salarioBuscado = sc.nextLine();
                        String linea;
                        try (RandomAccessFile raf2 = new RandomAccessFile("Tema 7/src/Examen/SALIDA.dat", "r")){
                            while ((linea = raf2.readLine()) != null) {
                                if (linea.contains(salarioBuscado)) {

                                }
                            }
                        }
                }
            } while (!opcion.equals("FIN"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
