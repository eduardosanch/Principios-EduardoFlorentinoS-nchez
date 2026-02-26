public class Autobus extends Vehiculo{
    private int numAsientos;
    private int numLlantas;

    public Autobus(String marca, int precio, int numLlantas, int numPuerta, int numAsientos) {
        super(marca, precio, numLlantas);
        this.numAsientos = numAsientos;
        this.numLlantas= numLlantas;
    }

    public void mostrarDatos() {
        System.out.println("Número de Asientos: " + numAsientos);
        System.out.println("Número de Llantas: " + getNumLlantas());
    }

     public void pruebaDelMotor() {
        System.out.println("El motor del autobús funciona.");
    }

}