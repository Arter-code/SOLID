public class ImprimirRecibo {
    private final Impresora impresora;
    private final Factura factura = new Factura();

    public ImprimirRecibo(Impresora impresora){
        this.impresora=impresora;
    }

    public void imprimirRecibo(Pedido p) {
        impresora.imprimir("Recibo de " + p.getCliente() + ": $" + factura.calcularTotal(p));
    }

}
