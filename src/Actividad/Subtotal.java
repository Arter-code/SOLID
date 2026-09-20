public class Subtotal {
    public double calcularSubtotal(Pedido p) {
        double subtotal = 0;
        for (double precio : p.getPrecios()) {
            subtotal += precio;
        }
        return subtotal;
    }

}
