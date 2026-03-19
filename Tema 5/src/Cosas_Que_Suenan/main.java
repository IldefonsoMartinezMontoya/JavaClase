package Cosas_Que_Suenan;

public class main {
    public static void main(String[] args) {
        Television t1 = new Television();
        t1.encender();
        t1.apagar();
        t1.subirVolumen(70);
        t1.bajarVolumen(60);
        AltavozBluetooth t2 = new AltavozBluetooth();
        t2.encender();
        t2.apagar();
        t2.subirVolumen(80);
        t2.bajarVolumen(50);
    }
}
