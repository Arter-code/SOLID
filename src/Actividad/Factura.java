public class Factura {
    private final Subtotal subtotal = new Subtotal();
    private final Descuento descuento = new Descuento();
    public double calcularTotal(Pedido p){


        return descuento.descuento(p,subtotal.calcularSubtotal(p));

    }

}
