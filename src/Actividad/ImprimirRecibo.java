public class ImprimirRecibo {

    private final Impresora impresora;
    private final Factura factura = new Factura();
    private final Descuento descuento;

    public ImprimirRecibo(Impresora impresora, Descuento descuento) {
        this.impresora = impresora;
        this.descuento = descuento;
    }

    public void imprimirRecibo(Pedido p) {

        double total = factura.calcularTotal(p, descuento);

        impresora.imprimir("Recibo de " + p.getCliente() + ": $" + total);
    }
}