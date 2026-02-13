
public class Main {

  public static void main(String[] args)
  {

	  Tv nuevaTv = new Tv("Plana","19''","FHD 4K","Sony");
		
	  nuevaTv.prendida();
          nuevaTv.apagada();

	  Avion nuevoAvion = new Avion("aeromexico","8", "280 km/h","voing de guayaba");

	  nuevoAvion.acelerar();
          nuevoAvion.elevarse();
          nuevoAvion.aterrizar();


	  Pelota nuevaPelota =new Pelota("Redonda", "caucho","verde" ,"tenis");

	  nuevaPelota.botar();
	  nuevaPelota.desinflar();


  }


}
