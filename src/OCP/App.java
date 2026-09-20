package OCP;
public class App {
    public static void main(String[] args) {
        CalculadoraDeArea calculadora = new CalculadoraDeArea();

        FiguraAbstracta[] figuras = {
            new Circulo(5),
            new Rectangulo(4, 6),
            new Triangulo(3, 8)   // figura nueva, CalculadoraDeArea no cambió
        };

        for (FiguraAbstracta f : figuras) {
            System.out.println("Área: " + calculadora.calcular(f));
        }
    }
}

