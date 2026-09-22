import java.util.List;

public class App {
    public static void main(String[] args) {

        // Crear pedido
        Pedido pedido = new Pedido();

        pedido.setCliente("Ana");
        pedido.setTipoCliente("VIP");

        pedido.agregarPlato("Bandeja paisa", 28000);
        pedido.agregarPlato("Limonada", 6000);


        // Crear descuento
        Descuento descuento = new DescuentoVIP();

        // Calcular total
        Factura factura = new Factura();
        System.out.println("Total: " + factura.calcularTotal(pedido, descuento));


        // Guardar en base de datos
        BaseDeDatos baseDeDatos = new BaseDeDatos();
        baseDeDatos.guardarEnBaseDeDatos(pedido);


        // Imprimir recibo
        Impresora impresora = new ImpresoraTermica();
        ImprimirRecibo recibo = new ImprimirRecibo(
            impresora,
            descuento
        );

        recibo.imprimirRecibo(pedido);


        // Enviar correo
        CorreoConfirmacion correo = new CorreoConfirmacion();
        correo.notificar(pedido);


        // Metodos de pago
        List<MetodoPago> pagosDelDia = List.of(
            new PagoTarjeta(),
            new PagoEfectivo(),
            new PagoPuntosFidelidad()
        );

        // De esta forma rompemos el principio Liskov
        /* 
        for (MetodoPago pago : pagosDelDia) {
            pago.cobrar(15000);
        }
        */
        // Mesero
        /* 
        Empleado mesero = new Mesero();
        mesero.atenderMesa();
        */

        // De esta forma no rompemos el principio Liskov
        for (MetodoPago pago : pagosDelDia) {
            if (pago.puedeCobrar(15000)) {
                pago.cobrar(15000);
            } else {
                System.out.println("Este método de pago no puede cubrir el monto, se omite.");
            }
        }
        
        // De esta forma usando el interface segregation
        AtiendeMesas mesero = new Mesero();
        mesero.atenderMesa();
    }
}