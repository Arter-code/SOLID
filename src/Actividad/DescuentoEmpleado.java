//Creamos la clase DescuentoEmpleado que implementa la interfaz descuento respentando el principio OCP
public class DescuentoEmpleado implements Descuento {

    @Override
    public double aplicar(double subtotal) {
        return subtotal * 0.5;
    }
}