package SRP;

public class VehiculoRepositorio {
    public void guardar(Vehiculo v) {
        System.out.println("Conectando a la BD...");
        System.out.println("INSERT INTO vehiculos VALUES ('" + v.getMarca() + "', " + v.getVelocidadMax() + ")");
    }
}
