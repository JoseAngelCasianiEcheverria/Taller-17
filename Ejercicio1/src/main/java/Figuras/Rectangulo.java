package Figuras;

public class Rectangulo extends Figuras {

    private double ancho;
    private double alto;

    public Rectangulo(double ancho, double alto) {
        this.ancho = ancho;
        this.alto = alto;
    }

    @Override
    public double CalculaArea() {
        return ancho * alto;
    }
}
