import java.util.List;
import java.util.ArrayList;
public class Pedido {

    private String cliente;
    private String tipoCliente; // "REGULAR", "VIP", "EMPLEADO"
    private List<String> platos = new ArrayList<>();
    private List<Double> precios = new ArrayList<>();

    public void agregarPlato(String nombre, double precio) {
        platos.add(nombre);
        precios.add(precio);
    }

    public void setCliente(String cliente) { this.cliente = cliente; }
    public void setTipoCliente(String tipoCliente) { this.tipoCliente = tipoCliente; }
    public List<Double> getPrecios() { return precios; }
    public String getTipoCliente() { return tipoCliente; }
    public String getCliente(){return cliente;}
}
