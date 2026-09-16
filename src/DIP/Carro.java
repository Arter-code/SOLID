package DIP;
public class Carro {
    private Motor motor;

    // El motor se "inyecta" desde afuera, vía constructor
    public Carro(Motor motor) {
        this.motor = motor;
    }

    public void arrancar() {
        motor.encender();
    }
}