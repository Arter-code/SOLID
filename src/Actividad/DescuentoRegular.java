//Creamos la clase DescuentoRegular que implementa la interfaz descuento respentando el principio OCP
public class DescuentoRegular implements Descuento {

    @Override
    public double aplicar(double subtotal) {
        return subtotal;
    }
}