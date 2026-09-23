//Creamos la clase CorreoConfirmacion que extiende de Notificador para poder enviar correos de confirmación respetando el principio de OCP
public class CorreoConfirmacion extends Notificador {

    @Override 
    public void notificar(Pedido p) {
        System.out.println("Enviando correo de confirmación a " + p.getCliente() + "...");
    }

}
