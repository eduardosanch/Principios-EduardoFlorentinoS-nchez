public class Motocicleta extends Vehiculo{
    private int numAsientos; 

    public Motocicleta(String marca, int precio, int numLlantas, int numAsientos) {
        super(marca, precio, numLlantas);
        this.numAsientos = numAsientos;
    }

    public void mostrarDatos() {
        System.out.println("Número de Asientos: " + numAsientos);
    }

     public void pruebaDelMotor() {
        System.out.println("El motor de la motocicleta funciona.");
    }   
}