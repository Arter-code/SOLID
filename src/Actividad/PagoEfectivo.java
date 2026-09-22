class PagoEfectivo extends MetodoPago {
    @Override
    public boolean puedeCobrar(double monto) {
        return true;
    }

    @Override
    public void cobrar(double monto) {
        System.out.println("Cobrando $" + monto + " en efectivo.");
    }
}