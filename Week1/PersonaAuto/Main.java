import java.util.Scanner;

public class Main{

  public static void main(String[] args){
	Scanner sc= new Scanner(System.in);

	Auto carro = new Auto("camaro");

	Persona lalo= new Persona ("Lalo", carro);

	lalo.mostrarAuto();

  }



}
