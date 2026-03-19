public class Ejercicio_12 {
    private int numero1;
    private int numero2;

    public Ejercicio_12(int numero1, int numero2){
        if (numero1 < 0 || numero1 > 6 || numero2 < 0 || numero2 > 6) {
            throw new IllegalArgumentException("Número no válido");
        }
        this.numero1 = numero1;
        this.numero2 = numero2;
    }
    public int getPuntos() {
        return numero1 + numero2;
    }
    public void esDoble() {
        boolean verdadero = false;
        if (numero1 == numero2) {
            verdadero = true;
            System.out.println(verdadero);
        } else {
            System.out.println(verdadero);
        }
    }
    public void conectaCon(int numero1, int numero2) {
        boolean verdadero = false;
        if (this.numero1 == numero1 || this.numero2 == numero2) {
            verdadero = true;
            System.out.println(verdadero);
        } else {
            System.out.println(verdadero);
        }
    }
    public void dibujar() {
        if (numero1 == 0 && numero2 == 0) {
            System.out.println("+-------+-------+");
            System.out.println("|       |       |");
            System.out.println("|       |       |");
            System.out.println("|       |       |");
            System.out.println("+-------+-------+");
        } else if (numero1 == 0 && numero2 == 1) {
            System.out.println("+-------+-------+");
            System.out.println("|       |       |");
            System.out.println("|       |   *   |");
            System.out.println("|       |       |");
            System.out.println("+-------+-------+");
        } else if (numero1 == 0 && numero2 == 2) {
            System.out.println("+-------+-------+");
            System.out.println("|       |   *   |");
            System.out.println("|       |       |");
            System.out.println("|       |   *   |");
            System.out.println("+-------+-------+");
        } else if (numero1 == 0 && numero2 == 3) {
            System.out.println("+-------+-------+");
            System.out.println("|       |   *   |");
            System.out.println("|       |   *   |");
            System.out.println("|       |   *   |");
            System.out.println("+-------+-------+");
        } else if (numero1 == 0 && numero2 == 4) {
            System.out.println("+-------+-------+");
            System.out.println("|       | *   * |");
            System.out.println("|       |       |");
            System.out.println("|       | *   * |");
            System.out.println("+-------+-------+");
        } else if (numero1 == 0 && numero2 == 5) {
            System.out.println("+-------+-------+");
            System.out.println("|       | *   * |");
            System.out.println("|       |   *   |");
            System.out.println("|       | *   * |");
            System.out.println("+-------+-------+");
        } else if (numero1 == 0 && numero2 == 6) {
            System.out.println("+-------+-------+");
            System.out.println("|       | *   * |");
            System.out.println("|       | *   * |");
            System.out.println("|       | *   * |");
            System.out.println("+-------+-------+");
        } else if (numero1 == 1 && numero2 == 0) {
            System.out.println("+-------+-------+");
            System.out.println("|       |       |");
            System.out.println("|   *   |       |");
            System.out.println("|       |       |");
            System.out.println("+-------+-------+");
        } else if (numero1 == 1 && numero2 == 1) {
            System.out.println("+-------+-------+");
            System.out.println("|       |       |");
            System.out.println("|   *   |   *   |");
            System.out.println("|       |       |");
            System.out.println("+-------+-------+");
        } else if (numero1 == 1 && numero2 == 2) {
            System.out.println("+-------+-------+");
            System.out.println("|       |   *   |");
            System.out.println("|   *   |       |");
            System.out.println("|       |   *   |");
            System.out.println("+-------+-------+");
        }  else if (numero1 == 1 && numero2 == 3) {
            System.out.println("+-------+-------+");
            System.out.println("|       |   *   |");
            System.out.println("|   *   |   *   |");
            System.out.println("|       |   *   |");
            System.out.println("+-------+-------+");
        } else if (numero1 == 1 && numero2 == 4) {
            System.out.println("+-------+-------+");
            System.out.println("|       | *   * |");
            System.out.println("|   *   |       |");
            System.out.println("|       | *   * |");
            System.out.println("+-------+-------+");
        }  else if (numero1 == 1 && numero2 == 5) {
            System.out.println("+-------+-------+");
            System.out.println("|       | *   * |");
            System.out.println("|   *   |   *   |");
            System.out.println("|       | *   * |");
            System.out.println("+-------+-------+");
        } else if (numero1 == 1 && numero2 == 6) {
            System.out.println("+-------+-------+");
            System.out.println("|       | *   * |");
            System.out.println("|   *   | *   * |");
            System.out.println("|       | *   * |");
            System.out.println("+-------+-------+");
        }  else if (numero1 == 2 && numero2 == 0) {
            System.out.println("+-------+-------+");
            System.out.println("|   *   |       |");
            System.out.println("|       |       |");
            System.out.println("|   *   |       |");
            System.out.println("+-------+-------+");
        }   else if (numero1 == 2 && numero2 == 1) {
            System.out.println("+-------+-------+");
            System.out.println("|   *   |       |");
            System.out.println("|       |   *   |");
            System.out.println("|   *   |       |");
            System.out.println("+-------+-------+");
        }   else if (numero1 == 2 && numero2 == 2) {
            System.out.println("+-------+-------+");
            System.out.println("|   *   |   *   |");
            System.out.println("|       |       |");
            System.out.println("|   *   |   *   |");
            System.out.println("+-------+-------+");
        }  else if (numero1 == 2 && numero2 == 3) {
            System.out.println("+-------+-------+");
            System.out.println("|   *   |   *   |");
            System.out.println("|       |   *   |");
            System.out.println("|   *   |   *   |");
            System.out.println("+-------+-------+");
        }  else if (numero1 == 2 && numero2 == 4) {
            System.out.println("+-------+-------+");
            System.out.println("|   *   | *   * |");
            System.out.println("|       |       |");
            System.out.println("|   *   | *   * |");
            System.out.println("+-------+-------+");
        }  else if (numero1 == 2 && numero2 == 5) {
            System.out.println("+-------+-------+");
            System.out.println("|   *   | *   * |");
            System.out.println("|       |   *   |");
            System.out.println("|   *   | *   * |");
            System.out.println("+-------+-------+");
        }  else if (numero1 == 2 && numero2 == 6) {
            System.out.println("+-------+-------+");
            System.out.println("|   *   | *   * |");
            System.out.println("|       | *   * |");
            System.out.println("|   *   | *   * |");
            System.out.println("+-------+-------+");
        }   else if (numero1 == 3 && numero2 == 0) {
            System.out.println("+-------+-------+");
            System.out.println("|   *   |       |");
            System.out.println("|   *   |       |");
            System.out.println("|   *   |       |");
            System.out.println("+-------+-------+");
        }   else if (numero1 == 3 && numero2 == 1) {
            System.out.println("+-------+-------+");
            System.out.println("|   *   |       |");
            System.out.println("|   *   |   *   |");
            System.out.println("|   *   |       |");
            System.out.println("+-------+-------+");
        }   else if (numero1 == 3 && numero2 == 2) {
            System.out.println("+-------+-------+");
            System.out.println("|   *   |   *   |");
            System.out.println("|   *   |       |");
            System.out.println("|   *   |   *   |");
            System.out.println("+-------+-------+");
        }   else if (numero1 == 3 && numero2 == 3) {
            System.out.println("+-------+-------+");
            System.out.println("|   *   |   *   |");
            System.out.println("|   *   |   *   |");
            System.out.println("|   *   |   *   |");
            System.out.println("+-------+-------+");
        }   else if (numero1 == 3 && numero2 == 4) {
            System.out.println("+-------+-------+");
            System.out.println("|   *   | *   * |");
            System.out.println("|   *   |       |");
            System.out.println("|   *   | *   * |");
            System.out.println("+-------+-------+");
        }   else if (numero1 == 3 && numero2 == 5) {
            System.out.println("+-------+-------+");
            System.out.println("|   *   | *   * |");
            System.out.println("|   *   |   *   |");
            System.out.println("|   *   | *   * |");
            System.out.println("+-------+-------+");
        }   else if (numero1 == 3 && numero2 == 6) {
            System.out.println("+-------+-------+");
            System.out.println("|   *   | *   * |");
            System.out.println("|   *   | *   * |");
            System.out.println("|   *   | *   * |");
            System.out.println("+-------+-------+");
        }   else if (numero1 == 4 && numero2 == 0) {
            System.out.println("+-------+-------+");
            System.out.println("| *   * |       |");
            System.out.println("|       |       |");
            System.out.println("| *   * |       |");
            System.out.println("+-------+-------+");
        }   else if (numero1 == 4 && numero2 == 1) {
            System.out.println("+-------+-------+");
            System.out.println("| *   * |       |");
            System.out.println("|       |   *   |");
            System.out.println("| *   * |       |");
            System.out.println("+-------+-------+");
        }   else if (numero1 == 4 && numero2 == 2) {
            System.out.println("+-------+-------+");
            System.out.println("| *   * |   *   |");
            System.out.println("|       |       |");
            System.out.println("| *   * |   *   |");
            System.out.println("+-------+-------+");
        }   else if (numero1 == 4 && numero2 == 3) {
            System.out.println("+-------+-------+");
            System.out.println("| *   * |   *   |");
            System.out.println("|       |   *   |");
            System.out.println("| *   * |   *   |");
            System.out.println("+-------+-------+");
        }   else if (numero1 == 4 && numero2 == 4) {
            System.out.println("+-------+-------+");
            System.out.println("| *   * | *   * |");
            System.out.println("|       |       |");
            System.out.println("| *   * | *   * |");
            System.out.println("+-------+-------+");
        }   else if (numero1 == 4 && numero2 == 5) {
            System.out.println("+-------+-------+");
            System.out.println("| *   * | *   * |");
            System.out.println("|       |   *   |");
            System.out.println("| *   * | *   * |");
            System.out.println("+-------+-------+");
        }   else if (numero1 == 4 && numero2 == 6) {
            System.out.println("+-------+-------+");
            System.out.println("| *   * | *    * |");
            System.out.println("|       | *    * |");
            System.out.println("| *   * | *    * |");
            System.out.println("+-------+-------+");
        }    else if (numero1 == 5 && numero2 == 0) {
            System.out.println("+-------+-------+");
            System.out.println("| *   * |       |");
            System.out.println("|   *   |       |");
            System.out.println("| *   * |       |");
            System.out.println("+-------+-------+");
        }    else if (numero1 == 5 && numero2 == 1) {
            System.out.println("+-------+-------+");
            System.out.println("| *   * |       |");
            System.out.println("|   *   |   *   |");
            System.out.println("| *   * |       |");
            System.out.println("+-------+-------+");
        }    else if (numero1 == 5 && numero2 == 2) {
            System.out.println("+-------+-------+");
            System.out.println("| *   * |   *   |");
            System.out.println("|   *   |       |");
            System.out.println("| *   * |   *   |");
            System.out.println("+-------+-------+");
        }    else if (numero1 == 5 && numero2 == 3) {
            System.out.println("+-------+-------+");
            System.out.println("| *   * |   *   |");
            System.out.println("|   *   |   *   |");
            System.out.println("| *   * |   *   |");
            System.out.println("+-------+-------+");
        }    else if (numero1 == 5 && numero2 == 4) {
            System.out.println("+-------+-------+");
            System.out.println("| *   * | *   * |");
            System.out.println("|   *   |       |");
            System.out.println("| *   * | *   * |");
            System.out.println("+-------+-------+");
        }    else if (numero1 == 5 && numero2 == 5) {
            System.out.println("+-------+-------+");
            System.out.println("| *   * | *   * |");
            System.out.println("|   *   |   *   |");
            System.out.println("| *   * | *   * |");
            System.out.println("+-------+-------+");
        }    else if (numero1 == 5 && numero2 == 6) {
            System.out.println("+-------+-------+");
            System.out.println("| *   * | *   * |");
            System.out.println("|   *   | *   * |");
            System.out.println("| *   * | *   * |");
            System.out.println("+-------+-------+");
        }    else if (numero1 == 6 && numero2 == 0) {
            System.out.println("+-------+-------+");
            System.out.println("| *   * |       |");
            System.out.println("| *   * |       |");
            System.out.println("| *   * |       |");
            System.out.println("+-------+-------+");
        }    else if (numero1 == 6 && numero2 == 1) {
            System.out.println("+-------+-------+");
            System.out.println("| *   * |       |");
            System.out.println("| *   * |   *   |");
            System.out.println("| *   * |       |");
            System.out.println("+-------+-------+");
        }    else if (numero1 == 6 && numero2 == 2) {
            System.out.println("+-------+-------+");
            System.out.println("| *   * |   *   |");
            System.out.println("| *   * |       |");
            System.out.println("| *   * |   *   |");
            System.out.println("+-------+-------+");
        }    else if (numero1 == 6 && numero2 == 3) {
            System.out.println("+-------+-------+");
            System.out.println("| *   * |   *   |");
            System.out.println("| *   * |   *   |");
            System.out.println("| *   * |   *   |");
            System.out.println("+-------+-------+");
        }    else if (numero1 == 6 && numero2 == 4) {
            System.out.println("+-------+-------+");
            System.out.println("| *   * | *   * |");
            System.out.println("| *   * |       |");
            System.out.println("| *   * | *   * |");
            System.out.println("+-------+-------+");
        }    else if (numero1 == 6 && numero2 == 5) {
            System.out.println("+-------+-------+");
            System.out.println("| *   * | *   * |");
            System.out.println("| *   * |   *   |");
            System.out.println("| *   * | *   * |");
            System.out.println("+-------+-------+");
        }    else if (numero1 == 6 && numero2 == 6) {
            System.out.println("+-------+-------+");
            System.out.println("| *   * | *   * |");
            System.out.println("| *   * | *   * |");
            System.out.println("| *   * | *   * |");
            System.out.println("+-------+-------+");
        }
    }
}
