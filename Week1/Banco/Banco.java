public class Banco{
	
	private double saldo;

	Banco(double saldo){
	  this.saldo = saldo;
	}

	public void deposito(double monto){
	  this.saldo = saldo + monto;
	
	}
	
	public double getSaldo(){
	  return saldo;
	}

	public void retirar(double monto){
	  if(monto>= saldo){
	     System.out.println("El monto es mayor al saldo actual. Saldo actual: "+saldo);		
     	 }
	  else{
	     saldo= saldo-monto;
	     System.out.println("Retiro realizado con exito, Tu saldo actual es de: "+saldo);

         }
	}
	
}

