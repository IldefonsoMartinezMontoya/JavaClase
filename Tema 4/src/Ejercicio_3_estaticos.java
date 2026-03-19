import java.util.Random;

public class Ejercicio_3_estaticos {
    private double[] numeros = new double[100];
    private Random r = new Random();


    public void agregarNumero() {
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = r.nextInt(1, 101);
        }
    }
    public void calcularMedia() {
        double suma = 0;
        int total = numeros.length;
        for (double numero : numeros) {
            suma += numero;
        }
        double media = suma / total;
        System.out.println(media);
    }
    public void getMinimo() {
        double minimo = numeros[0];
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] < minimo) {
                minimo = numeros[i];
            }
        }
        System.out.println(minimo);
    }
    public void getMaximo() {
        double maximo = numeros[0];
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > maximo) {
                maximo = numeros[i];
            }
        }
        System.out.println(maximo);
    }
}
