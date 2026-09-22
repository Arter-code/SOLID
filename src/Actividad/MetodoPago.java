// Sin interface segregation este metodo incumple Liskov, ya que en un caso no cumple lo mismo que el padre

/* 
abstract class MetodoPago {
    public abstract void cobrar(double monto);
}
*/

abstract class MetodoPago {
    public abstract boolean puedeCobrar(double monto);
    public abstract void cobrar(double monto);
}