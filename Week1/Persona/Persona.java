

/**
 * Class Persona
 */
public class Persona {

  //
  // Fields
  //

  private String nombre;
  private int edad;
  
  //
  // Constructors
  //
  public Persona () { };
  
  //
  // Methods
  //

  public Persona(String nombre, int edad)
  {
    this.nombre = nombre;
    this.edad = edad;
  }
   
  //
  // Accessor methods
  //

  /**
   * Set the value of nombre
   * @param newVar the new value of nombre
   */
  public void setNombre (String nombre) {
    this.nombre = nombre;
  }

  /**
   * Get the value of nombre
   * @return the value of nombre
   */
  public String getNombre () {
    return nombre;
  }

  /**
   * Set the value of edad
   * @param newVar the new value of edad
   */
  public void setEdad (int edad) {
    this.edad = edad;
  }

  /**
   * Get the value of edad
   * @return the value of edad
   */
  public int getEdad () {
    return edad;
  }

  //
  // Other methods
  //

  /**



  /**
   */
  public void saludar()
  {
     System.out.println("HOLA!" + nombre);
  }


}
