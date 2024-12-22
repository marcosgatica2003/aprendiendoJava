class fecha {
    private final int dia;
    private final int mes;
    private final int anio;

    public fecha(int _dia, int _mes, int _anio) {
        this.dia = _dia;
        this.mes = _mes; 
        this.anio = _anio;
    }

    public void mostrar() {
        System.out.println("Día:\t" + this.dia);
        System.out.println("Mes:\t" + this.mes);
        System.out.println("Año:\t" + this.anio);
    }

}

class evento {
    private fecha fechaDeEvento;
    private String nombreEvento;

    public evento(String _nombre, int _dia, int _mes, int _anio) {
        this.fechaDeEvento = new fecha(_dia, _mes, _anio);
        this.nombreEvento = _nombre;
    }

    public void imprimirEvento() {
        System.out.println("Nombre del evento: \t" + this.nombreEvento);
        this.fechaDeEvento.mostrar();
    }

    public void modificarNombre(String _nombre) { this.nombreEvento = _nombre; }
}

public class fechaYEvento{
    public static void main (String argv[]) {
        evento cumpleanios = new evento("Cumpleaños admin", 15, 9, 2003);
        cumpleanios.imprimirEvento();
    }
}
