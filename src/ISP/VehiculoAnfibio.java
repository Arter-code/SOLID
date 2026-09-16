package ISP;
public class VehiculoAnfibio implements Terrestre, Acuatico {
    @Override
    public void andarEnTierra() {
        System.out.println("El anfibio anda en tierra.");
    }

    @Override
    public void navegar() {
        System.out.println("El anfibio navega en el agua.");
    }
}