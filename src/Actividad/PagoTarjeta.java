
//Creamos la clase pago tarjeta con un contrato con la clase metodo de pago, para que pueda ser utilizada por la clase Pedido sin violar el principio de responsabilidad única.
class PagoTarjeta extends MetodoPago {
    @Override
    public boolean puedeCobrar(double monto) {
        return true; 
    }

    @Override
    public void cobrar(double monto) {
        System.out.println("Cobrando $" + monto + " con tarjeta.");
    }
}