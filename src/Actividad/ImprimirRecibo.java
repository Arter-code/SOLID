//Creamos la clase ImprimirRecibo que se encargará de imprimir el recibo del pedido, utilizando la interfaz Impresora para poder imprimir en distintos tipos de impresoras y respetando el principio de inversión de dependencias.
public class ImprimirRecibo {

    //Creamos atributos privados y finales para que no puedan ser modificados desde fuera de la clase
    private final Impresora impresora;
    private final Factura factura = new Factura();
    private final Descuento descuento;
    
    //Constructor que recibe una impresora y un descuento, para poder imprimir el recibo y aplicar el descuento correspondiente
    public ImprimirRecibo(Impresora impresora, Descuento descuento) {
        this.impresora = impresora;
        this.descuento = descuento;
    }
    
    //Metodo que imprime el recibo del pedido asignado, calculando el total con el descuento correspondiente y utilizando la impresora asignada
    public void imprimirRecibo(Pedido p) {

        double total = factura.calcularTotal(p, descuento);

        impresora.imprimir("Recibo de " + p.getCliente() + ": $" + total);
    }
}