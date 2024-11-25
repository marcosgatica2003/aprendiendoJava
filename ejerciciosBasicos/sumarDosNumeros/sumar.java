import javax.swing.JOptionPane;

public class sumar {
    public static void main(String args[]) {
        String primerNumero = "";
        String segundoNumero = "";

        int numero1 = 0, numero2 = 0, suma = 0;

        primerNumero = JOptionPane.showInputDialog("Mete el primer número:\t");
        segundoNumero = JOptionPane.showInputDialog("Mete el segundo número:\t");
        
        numero1 = Integer.parseInt(primerNumero);
        numero2 = Integer.parseInt(segundoNumero);

        suma = numero1 + numero2;

        JOptionPane.showMessageDialog(null, "Suma:\t" + suma, "Resultado", JOptionPane.PLAIN_MESSAGE);
        
        System.exit(0);
    }
}
