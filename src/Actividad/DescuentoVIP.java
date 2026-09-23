
//Creamos la clase DescuentoVIP que implementa la interfaz descuento respentando el principio OCP
public class DescuentoVIP implements Descuento {

    @Override
    public double aplicar(double subtotal) {
        return subtotal * 0.9;
    }
}