//Creamos la clase Subtotal que se encargará de calcular el subtotal de un pedido respetando el principio de SRP
public class Subtotal {
    public double calcularSubtotal(Pedido p) {
        double subtotal = 0;
        for (double precio : p.getPrecios()) {
            subtotal += precio;
        }
        return subtotal;
    }

}
