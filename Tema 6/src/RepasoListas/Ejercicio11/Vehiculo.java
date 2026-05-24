package RepasoListas.Ejercicio11;

import java.util.*;

public class Vehiculo {
    private String matricula;
    private String nombreTitular;
    private int numeroPlaza;
    private static List<Vehiculo> parking = new ArrayList<>();
    public Vehiculo(String matricula, String nombreTitular) {
        setMatricula(matricula);
        setNombreTitular(nombreTitular);
        setNumeroPlaza(0);
    }
    public static void darDeAlta(Vehiculo v) {
        for (Vehiculo vehiculoActual : parking) {
            if (vehiculoActual.getMatricula().equalsIgnoreCase(v.getMatricula())) {
                System.out.println(STR."Error: Ya existe un vehículo con la matrícula \{v.getMatricula()}");
                return;
            }
        }
        parking.add(v);
    }
    public static boolean darDeBaja(String matricula) {
        for (Vehiculo v : parking) {
            if (v.getMatricula().equalsIgnoreCase(matricula)) {
                parking.remove(v);
                return true;
            }
        }
        return false;
    }
    public static void aparcar(String matricula, int numeroPlaza) {
        Vehiculo vehiculoEncontrado = null;
        for (Vehiculo v : parking) {
            if (v.getMatricula().equalsIgnoreCase(matricula)) {
                vehiculoEncontrado = v;
                break;
            }
        }
        if (vehiculoEncontrado == null) {
            System.out.println(STR."Error: El vehículo con matrícula \{matricula} no está dado de alta.");
        }
        try {
            vehiculoEncontrado.setNumeroPlaza(numeroPlaza);
            System.out.println(STR."Vehículo \{matricula} aparcado con éxito en la plaza \{numeroPlaza}.");
        } catch (IllegalArgumentException e) {
           System.out.println(STR."Error al asignar plaza: \{e.getMessage()}");
        }
    }
    public static void desAparcar(String matricula) {
        Vehiculo vehiculoEncontrado = null;
        for (Vehiculo v : parking) {
            if (v.getMatricula().equalsIgnoreCase(matricula)) {
                vehiculoEncontrado = v;
                break;
            }
        }
        if (vehiculoEncontrado == null) {
            System.out.println(STR."Error: El vehículo con matrícula \{matricula} no está dado de alta.");
        }
        try {
            System.out.println(STR."Vehículo \{matricula} desaparcado con éxito en la plaza \{vehiculoEncontrado.getNumeroPlaza()}.");
            vehiculoEncontrado.setNumeroPlaza(0);
        } catch (IllegalArgumentException e) {
            System.out.println(STR."Error al asignar plaza: \{e.getMessage()}");
        }
    }
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Seleccione una opción");
        String opcion;
        do {
            System.out.println("-Dar de Alta");
            System.out.println("-Dar de Baja");
            System.out.println("-Listar Todos");
            System.out.println("-Listar Aparcados");
            System.out.println("-Listar no Aparcados");
            System.out.println("-Aparcar");
            System.out.println("-Desaparcar");
            opcion = sc.nextLine();
            switch (opcion) {
                case "Dar de Alta":
                    System.out.println("Introduce la matrícula del vehículo:");
                    String matricula = sc.nextLine();
                    System.out.println("Introduce el nombre del titular:");
                    String titular = sc.nextLine();
                    Vehiculo nuevoVehiculo = new Vehiculo(matricula, titular);
                    darDeAlta(nuevoVehiculo);
                    System.out.println("Vehículo dado de alta correctamente.");
                    break;
                case "Dar de Baja":
                    System.out.println("Introduce la matrícula");
                    String matriculaBja = sc.nextLine();
                    if (darDeBaja(matriculaBja)) {
                        System.out.println("Dado de baja");
                    } else {
                        System.out.println(STR."Error: No se encontró ningún vehículo con la matrícula \{matriculaBja}.");
                    }
                    break;
                case "Listar todos":
                    for (Vehiculo v : parking) {
                        System.out.println(STR."Matricula: \{v.getMatricula()} Titular: \{v.getNombreTitular()}");
                    }
                    break;
                case "Aparcar":
                    System.out.println("Introduce la matricula");
                    String mat = sc.nextLine();
                    System.out.println("Introduce el número de plaza");
                    int numPlaz = sc.nextInt();
                    aparcar(mat, numPlaz);
                    break;
                case "Desaparcar":
                    System.out.println("Introduce la matricula");
                    String matri = sc.nextLine();
                    desAparcar(matri);
                    break;
                case "Listar Aparcados":
                    for (Vehiculo v : parking) {
                        if (v.getNumeroPlaza() > 0) {
                            System.out.println(STR."Matricula: \{v.getMatricula()} Titular: \{v.getNombreTitular()} Número de Plaza: \{v.getNumeroPlaza()}");
                        }
                    }
                    break;
                case "Listar no Aparcados":
                    for (Vehiculo v : parking) {
                        if (v.getNumeroPlaza() == 0) {
                            System.out.println(STR."Matricula: \{v.getMatricula()} Titular: \{v.getNombreTitular()}");
                        }
                    }
                    break;
                default:

            }
        } while (!opcion.equalsIgnoreCase("Salir"));
    }


    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        if (matricula.isBlank()) {
            throw new IllegalArgumentException("No puede estar en blanco");
        } else {
            this.matricula = matricula;
        }
    }

    public String getNombreTitular() {
        return nombreTitular;
    }

    public void setNombreTitular(String nombreTitular) {
        if (nombreTitular.isBlank()) {
            throw new IllegalArgumentException("No puede estar en blanco");
        } else {
            this.nombreTitular = nombreTitular;
        }
    }

    public int getNumeroPlaza() {
        return numeroPlaza;
    }

    public void setNumeroPlaza(int numeroPlaza) {
        if (numeroPlaza < 0) {
            throw new IllegalArgumentException("No puede ser negativo");
        } else {
            this.numeroPlaza = numeroPlaza;
        }
    }
}
