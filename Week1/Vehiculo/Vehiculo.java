public class Vehiculo{
    
    protected String marca;
    protected int precio;
    protected int numLlantas;

    public Vehiculo(String marca, int precio, int numLlantas) {
        this.marca = marca;
        this.precio = precio;
        this.numLlantas = numLlantas;
    }

    public void mostrarCaracteristicas(){
        System.out.println("Marca: " + marca);
        System.out.println("Precio: " + precio);
        System.out.println("Número de Llantas: " + numLlantas);
    }

    public void encender(){
        System.out.println("El vehículo está encendido.");
    }

    public void apagar(){
        System.out.println("El vehículo está apagado.");
    }

    public void funciona(){
        System.out.println("El vehículo está funcionando.");
    }

    public String getMarca(){
        return marca;
    }

    public int getPrecio(){
        return precio;
    }

    public int getNumLlantas(){
        return numLlantas;
    }
    
}