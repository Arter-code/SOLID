public class CorreoConfirmacion extends Notificador {

    @Override 
    public void notificar(Pedido p) {
        System.out.println("Enviando correo de confirmación a " + p.getCliente() + "...");
    }

}
