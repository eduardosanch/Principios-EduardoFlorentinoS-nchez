public class Main {

    public static void main(String[] args) {

        Perro perro = new Perro("Firulais");
        Gato gato = new Gato("Michi");

        perro.mover();
        perro.hacerSonido();

        gato.mover();
        gato.hacerSonido();
    }
}
