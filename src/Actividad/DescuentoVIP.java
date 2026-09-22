public class DescuentoVIP implements Descuento {

    @Override
    public double aplicar(double subtotal) {
        return subtotal * 0.9;
    }
}