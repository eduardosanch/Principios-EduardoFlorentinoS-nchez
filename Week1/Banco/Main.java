import java.util.Scanner;

public class Main{

   public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		Banco cuenta = new Banco(100000.00);
		
		System.out.println("Su saldo actual es de: "+ cuenta.getSaldo());

		System.out.println("Ingrese una cantidad a retirar");
		double retiro;

		retiro=sc.nextDouble();
		
		cuenta.retirar(retiro);

		
		
	}

}
