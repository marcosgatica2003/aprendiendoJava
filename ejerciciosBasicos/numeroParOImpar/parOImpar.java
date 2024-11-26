import javax.swing.JOptionPane;

public class parOImpar {
    public static void main(String args[]) {

        while (true) {
            String numero = JOptionPane.showInputDialog("Ingrese un número:");
            Boolean tipo = esPar.verificar(Integer.parseInt(numero));
            JOptionPane.showMessageDialog(null, "Es par?: " + Boolean.toString(tipo), "Ventana", JOptionPane.INFORMATION_MESSAGE);
            int opcion = Integer.parseInt(JOptionPane.showInputDialog("Desea continuar?\n1 - Si\n2 - No"));
            if (opcion == 2) { break; }
        }

        System.exit(0);
    }
}

class esPar {
    public static Boolean verificar(int num) {
        return (num % 2 == 0) ? true : false;
    }
}
