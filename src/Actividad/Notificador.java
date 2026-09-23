//Creamos la clase abstracta notificador para que el cliente pueda recibir distintos tipos de notificaciones respetando el principio de open/closed.
public abstract class Notificador {
    public abstract void notificar(Pedido p);

}
