
//Creamos la clase PagoEfectivo que extiende de MetodoPago para poder cobrar en efectivo respetando el principio de OCP
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