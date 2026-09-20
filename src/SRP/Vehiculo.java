package SRP;

public class Vehiculo {
    private String marca;
    private int velocidadMax;

    public Vehiculo(String marca, int velocidadMax) {
        this.marca = marca;
        this.velocidadMax = velocidadMax;
    }

    public String getMarca() { return marca; }
    public int getVelocidadMax() { return velocidadMax; }

    public void acelerar() {
        System.out.println(marca + " está acelerando.");
    }
}
