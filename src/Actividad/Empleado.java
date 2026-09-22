// Con una sola interfaz, contaminando a los metodos que no usan todos los metodos aqui dispuestos
/* 
interface Empleado {
    void atenderMesa();
    void cocinar();
    void repartirPedido();
    void cobrarEnCaja();
}
*/


interface AtiendeMesas {
    void atenderMesa();
}

interface Cocina {
    void cocinar();
}

// Estos dos metodos no se usan aun
interface Reparte {
    void repartirPedido();
}

interface CobraEnCaja {
    void cobrarEnCaja();
}