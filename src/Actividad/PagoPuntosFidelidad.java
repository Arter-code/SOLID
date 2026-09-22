// Sin interface segregation este metodo incumple Liskov, ya que en un caso no cumple lo mismo que el padre

/* 
class PagoPuntosFidelidad extends MetodoPago {
    private double puntosDisponibles = 20.0;

    @Override
    public void cobrar(double monto) {
        if (monto > puntosDisponibles) {
            throw new IllegalStateException("No hay suficientes puntos para cobrar este monto.");
        }
        System.out.println("Cobrando $" + monto + " con puntos de fidelidad.");
    }
}
*/

// Corregido
class PagoPuntosFidelidad extends MetodoPago {
    private double puntosDisponibles = 20.0;

    @Override
    public boolean puedeCobrar(double monto) {
    if (monto <= puntosDisponibles) {
        return true;
    } else {
        return false;
    }
}

    @Override
    public void cobrar(double monto) {
        puntosDisponibles -= monto;
        System.out.println("Cobrando $" + monto + " con puntos de fidelidad.");
    }
}