import javax.swing.JOptionPane;

public class holaMundoDesdeTeclado {
    public static void main(String args[]) {
        String mensajeDesdeTeclado = "";

        mensajeDesdeTeclado = JOptionPane.showInputDialog("Introduzca su nombre: ");
        JOptionPane.showMessageDialog(null, "Hola " + mensajeDesdeTeclado + ", Bienvenido!", "Mensaje", JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);
    }
}
