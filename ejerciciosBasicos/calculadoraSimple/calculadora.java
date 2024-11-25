import javax.swing.JOptionPane;

public class calculadora {
    public static void main(String args[]) {
        while(true) {
            String opcion = JOptionPane.showInputDialog("Ingrese una opción:\n1 - Sumar\n2 - Restar\n3 - Multiplicar\n4 - Dividir");

            float resultado = 0;

            switch (Integer.parseInt(opcion)) {
                case 1:
                    resultado = suma.operar();
                    break;

                case 2:
                    resultado = resta.operar();
                    break;

                case 3:
                    resultado = multiplicar.operar();
                    break;

                case 4:
                    resultado = dividir.operar();
                    break;
            }

            JOptionPane.showMessageDialog(null, "El resultado es: " + resultado, "Resultado", JOptionPane.PLAIN_MESSAGE);
            opcion = JOptionPane.showInputDialog("Desea continuar?\n1 - Si\n2 - No");
            if (Integer.parseInt(opcion) == 2) { break; }
        }

        System.exit(0);
    }
}

class suma {
    public static float operar() {
        String numeroUno = JOptionPane.showInputDialog("Ingrese el número 1:");
        String numeroDos = JOptionPane.showInputDialog("Ingrese el número 2:");
        return  Float.valueOf(numeroUno) + Float.valueOf(numeroDos);
    }
}

class resta {
    public static float operar() {
        String numeroUno = JOptionPane.showInputDialog("Ingrese el número 1:");
        String numeroDos = JOptionPane.showInputDialog("Ingrese el número 2:");
        return  Float.valueOf(numeroUno) - Float.valueOf(numeroDos);
    }
}

class multiplicar {
    public static float operar() {
        String numeroUno = JOptionPane.showInputDialog("Ingrese el número 1:");
        String numeroDos = JOptionPane.showInputDialog("Ingrese el número 2:");
        return  Float.valueOf(numeroUno) * Float.valueOf(numeroDos);
    }
}

class dividir {
    public static float operar() {
        String numeroDividendo = JOptionPane.showInputDialog("Ingrese el dividendo 1:");
        String numeroDivisor = JOptionPane.showInputDialog("Ingrese el divisor 2:");
        if (comprobar(Float.valueOf(numeroDivisor))) {
            JOptionPane.showMessageDialog(null, "Divisor es 0!", "Error", JOptionPane.WARNING_MESSAGE);
            System.exit(0);
            return 0;
        } 

        return Float.valueOf(numeroDividendo) / Float.valueOf(numeroDivisor);
    }

    public static Boolean comprobar(float divisor) {
        if (divisor == 0) {
            return true;
        } else {
            return false;
        }
    }
}
