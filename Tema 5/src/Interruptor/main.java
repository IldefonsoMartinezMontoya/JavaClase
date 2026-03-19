package Interruptor;

public class main {
    public static void main(String[] args) {
        lampara l1 = new lampara();
        l1.encender();
        l1.apagar();
        luces l2 = new luces();
        l2.encender();
        l2.apagar();
        focos l3 = new focos();
        l3.encender();
        l3.apagar();
    }
}
