package OCP;

public class Circulo extends FiguraAbstracta {
    private double radio;

    public Circulo(double radio) { this.radio = radio; }

    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }
}
