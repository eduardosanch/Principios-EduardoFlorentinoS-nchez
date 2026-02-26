public class Automovil extends Vehiculo{
    private int numLlantas;
    private int numPuertas;


    public Automovil(String marca, int precio, int numLlantas, int numAsientos, int numPuerta) {
        super(marca, precio, numLlantas);
        this.numPuertas = numPuertas;
    }

    public int getNumLlantas() {
        return numLlantas;
    }

    public int getNumPuertas() {
        return numPuertas;
    }

    public void mostrarDatos() {
        System.out.println("Número de Llantas: " + getNumLlantas());
        System.out.println("Número de Puertas: " + getNumPuertas());
    }

     public void pruebaDeMotor() {
        System.out.println("El motor funciona.");
    }

}