import java.util.Scanner;

class calculoArea {

    public calculoArea() {

    }


    public int mostrarMenu() {
        System.out.println("-----------------------------");
        System.out.println("--> Seleccione una figura <--");
        System.out.println("-----------------------------");
        System.out.println("\t1 - Circulo");
        System.out.println("\t2 - Rectángulo");
        System.out.println("\t3 - Triángulo");
        System.out.println("-----------------------------");

    }


}

public class sobrecargaDeMetodos {
    public static void main (String argv[]) {
        calculoArea figura1 = new calculoArea();
    }
}
