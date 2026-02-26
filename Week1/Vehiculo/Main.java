public class Main{

    public static void main(String[] args) {

        Automovil v1 = new Automovil("volvo 550", 120,4,5,4);
        v1.mostrarDatos();
        v1.pruebaDeMotor();
       
        Motocicleta m1 = new Motocicleta("Italika", 12000,2,2);
        m1.mostrarDatos();
        m1.pruebaDelMotor();
     
        Autobus b1 = new Autobus("Mercedez",300000,8,42,2);
        b1.mostrarDatos();
        b1.pruebaDelMotor();

        Autobus b2 = new Autobus("Mercedez smart", 250000,6,25,1);
        b2.mostrarDatos();
        b2.pruebaDelMotor();
    }

}