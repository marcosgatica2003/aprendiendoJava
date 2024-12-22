class figuraRectangulo {
    private float altura;
    private float ancho;

    public figuraRectangulo (float _altura, float _ancho) { this.dimensionar(_altura, _ancho); }

    public void dimensionar(float _altura, float _ancho) {
        this.altura = _altura;
        this.ancho = _ancho;
    }

    public void mostrarInformacion() {
        System.out.print("Altura: \t");
        System.out.println(this.altura);
        System.out.print("Ancho: \t");
        System.out.println(this.ancho);

    }

    public float calcularArea () {
       return this.altura * this.ancho;
    }
}

public class rectangulo {
    public static void main(String argv[]) {
        figuraRectangulo rec1 = new figuraRectangulo(0, 0);
        rec1.dimensionar(30,20);
        rec1.mostrarInformacion();
        System.out.println(rec1.calcularArea());
    }
}
