// Aqui se utiliza el principio Open / Close, ya que no estamos usando descuento directamente, si no la interfaz
public class Factura {
    private final Subtotal subtotal = new Subtotal();

    public double calcularTotal(Pedido p, Descuento descuento) {
        double valorSubtotal = subtotal.calcularSubtotal(p);
        return descuento.aplicar(valorSubtotal);
    }
}