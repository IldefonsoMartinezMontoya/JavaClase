import javax.swing.*;

public class PruebaUIForm extends JFrame {
    public PruebaUIForm() {
        setTitle("Prueba UI Form");
        setSize(640, 480);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    static void main() {
        SwingUtilities.invokeLater(() -> {
            PruebaUIForm ventana = new PruebaUIForm();
            ventana.setVisible(true);
        });
    }
}
