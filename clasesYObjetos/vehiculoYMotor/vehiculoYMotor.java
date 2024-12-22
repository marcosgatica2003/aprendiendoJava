class motor {

    private final float cilindrada;
    private final float caballosFuerza;

    public motor(float _cilindrada, float _caballosFuerza) {
        this.cilindrada = _cilindrada;
        this.caballosFuerza = _caballosFuerza;
    }

    public void mostrarDatosMotor() {
        System.out.println("Cilindrada:\t" + cilindrada);
        System.out.println("Caballos fuerza:\t" + caballosFuerza);
    }
}

class vehiculo {
    private final motor motor1;
    private final String marca;
    private final String modelo;

    public vehiculo(float _cilindrada, float _caballosFuerza, String _modelo, String _marca) {
        this.marca = _marca;
        this.modelo = _modelo;
        this.motor1 = new motor(_cilindrada, _caballosFuerza);
    }

    public void mostrarDatosVehiculo() {
        this.motor1.mostrarDatosMotor();
        System.out.println("Marca:\t" + marca);
        System.out.println("Modelo:\t" + modelo);
    }
}

public class vehiculoYMotor {
    public static void main(String argv[]) {
        vehiculo vehiculo1 = new vehiculo(23, 200, "Fíat", "Uno");
        vehiculo1.mostrarDatosVehiculo();
    }
}
