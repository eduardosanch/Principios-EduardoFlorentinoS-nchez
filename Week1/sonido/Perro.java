public class Perro extends Animal implements Sonido {

    public Perro(String nombre) {
        super(nombre);
    }

    @Override
    public void mover() {
        System.out.println("El perro corre.");
    }

    @Override
    public void hacerSonido() {
        System.out.println("Guau Guau");
    }
}
