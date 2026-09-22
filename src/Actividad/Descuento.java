// Principio Open Close
// De esta forma no tenemos que modificar DescuentoVIP, DescuentoEmpleado ni la lógica de Factura
public interface Descuento {
    double aplicar(double subtotal);
}

// Como se realizaria sin Open Close, muchos if else, al crear un nuevo tipo de cliente se tendria que modificar esto
/* 
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
*/