package DiseñoDeLayouts.Ejercicio6;

import javax.swing.*;

public class Main {
    static void main() {
       SwingUtilities.invokeLater(new Runnable() {
           @Override
           public void run() {
               HojaCalculoFrame h1 = new HojaCalculoFrame(6, 6, 'C', 3);
               h1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
               h1.Hoja();
               h1.setVisible(true);
           }
       });
    }
}
