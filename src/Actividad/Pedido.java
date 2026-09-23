import java.util.List;
import java.util.ArrayList;


//Eliminamos las responsabilidades innecesarias de la clase Pedido y creamos nuevas clases para cada responsabilidad

public class Pedido {

    private String cliente;
    private String tipoCliente; // "REGULAR", "VIP", "EMPLEADO"
    private List<String> platos = new ArrayList<>();
    private List<Double> precios = new ArrayList<>();

    public void agregarPlato(String nombre, double precio) {
        platos.add(nombre);
        precios.add(precio);
    }
//Incluimos getters y setters para los atributos cliente y tipoCliente, y un getter para la lista de precios, para que otras clases puedan acceder a ellos sin violar el principio de responsabilidad única.
    public void setCliente(String cliente) { this.cliente = cliente; }
    public void setTipoCliente(String tipoCliente) { this.tipoCliente = tipoCliente; }
    public List<Double> getPrecios() { return precios; }
    public String getTipoCliente() { return tipoCliente; }
    public String getCliente(){return cliente;}
}
/*public class Pedido {

    private String cliente;
    private String tipoCliente; // "REGULAR", "VIP", "EMPLEADO"
    private List<String> platos = new ArrayList<>();
    private List<Double> precios = new ArrayList<>();

    public void agregarPlato(String nombre, double precio) {
        platos.add(nombre);
        precios.add(precio);
    }

    // REVISAR (1): calcula el total Y decide el descuento con un if/else
    // que crece cada vez que el restaurante inventa un tipo de cliente nuevo.
    public double calcularTotal() {
        double subtotal = 0;
        for (double precio : precios) {
            subtotal += precio;
        }

        if (tipoCliente.equals("REGULAR")) {
            return subtotal;
        } else if (tipoCliente.equals("VIP")) {
            return subtotal * 0.9;
        } else if (tipoCliente.equals("EMPLEADO")) {
            return subtotal * 0.5;
        }
        return subtotal;
    }

    // REVISAR (2): Pedido también sabe persistir datos...
    public void guardarEnBaseDeDatos() {
        System.out.println("Conectando a la BD...");
        System.out.println("INSERT INTO pedidos VALUES (...)");
    }

    // REVISAR (2): ...y también sabe imprimir recibos...
    public void imprimirRecibo() {
        ImpresoraTermica impresora = new ImpresoraTermica();
        impresora.imprimir("Recibo de " + cliente + ": $" + calcularTotal());
    }

    // REVISAR (2): ...y también sabe enviar correos. Una sola clase, cuatro trabajos.
    public void enviarCorreoConfirmacion() {
        System.out.println("Enviando correo de confirmación a " + cliente + "...");
    }

    public void setCliente(String cliente) { this.cliente = cliente; }
    public void setTipoCliente(String tipoCliente) { this.tipoCliente = tipoCliente; }
}*/