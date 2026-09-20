public class Descuento {
    
    public double descuento(Pedido p,double subtotal){

        if (p.getTipoCliente().equals("REGULAR")) {
            return subtotal;
        } else if (p.getTipoCliente().equals("VIP")) {
            return subtotal * 0.9;
        } else if (p.getTipoCliente().equals("EMPLEADO")) {
            return subtotal * 0.5;
        }
        return subtotal;
    }
}
