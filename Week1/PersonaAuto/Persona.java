public class Persona{

	String nombre;
	Auto auto;

	public Persona(String nombre, Auto auto){
		
		this.nombre=nombre;
		this.auto=auto;
	}
	
	public void mostrarAuto(){
	System.out.println(nombre + "Tiene un " + auto.getMarca());
	}

	


}
