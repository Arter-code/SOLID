package SRP;

public class App {
    public static void main(String[] args) {
        Vehiculo carro = new Vehiculo("Renault", 180);

        VehiculoRepositorio repo = new VehiculoRepositorio();
        repo.guardar(carro);

        VehiculoReporteGenerador reporte = new VehiculoReporteGenerador();
        reporte.generarPDF(carro);
    }
}

