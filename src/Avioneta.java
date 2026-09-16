public class Avioneta implements Terrestre, Aereo {
    @Override
    public void volar() {
        System.out.println("La avioneta está volando.");
    }

    @Override
    public void andarEnTierra() {
        System.out.println("La avioneta rueda por la pista.");
    }
}