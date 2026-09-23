
//Creamos la clase impresora termica que implementa la interfaz impresora para realizar una inversion de dependencias
class ImpresoraTermica implements Impresora{
@Override 
    public void imprimir(String texto) {
        System.out.println("[Impresora térmica] " + texto);
    }
}