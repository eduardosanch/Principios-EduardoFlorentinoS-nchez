public class Avion {


  public String aerolinea;
  public String capacidad;
  protected String velocidad;
  private String cantidad_de_motores;
  private String modelo;
  
  public void setAerolinea (String newVar) {
    aerolinea = newVar;
  }

  public String getAerolinea () {
    return aerolinea;
  }

  public void setCapacidad (String newVar) {
    capacidad = newVar;
  }

  public String getCapacidad () {
    return capacidad;
  }

  public void setVelocidad (String newVar) {
    velocidad = newVar;
  }

  public String getVelocidad () {
    return velocidad;
  }

  public void setCantidad_de_motores (String newVar) {
    cantidad_de_motores = newVar;
  }

  public String getCantidad_de_motores () {
    return cantidad_de_motores;
  }

  public Avion(String aerolinea, String cantidadDeMotores, String velocidad, String modelo)
  {
	  this.aerolinea = aerolinea;
	  this.cantidad_de_motores= cantidadDeMotores;
	  this.velocidad = velocidad;
	  this.modelo = modelo;

	  System.out.println("Se creo un nuevo avion");
  }


  public void acelerar()
  {
    System.out.println("el avion acelero");
  }

  public void elevarse()
  {
    System.out.println("El avion se elevo");
  }

  public void aterrizar()
  {
    System.out.println("el avion aterrizo");
  }

  public void setModelo(String modelo)
  {
	  this.modelo= modelo;
  }

  public String getModelo()
  {
    return modelo;
  }


}
