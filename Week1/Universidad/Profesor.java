
import java.util.*;


/**
 * Class Profesor
 */
public class Profesor {

  //
  // Fields
  //

  private String nombre;
  private String especialidad;
  
  //
  // Constructors
  //
  public Profesor (String nombre, String especialidad) {
      this.nombre = nombre;
      this.especialidad = especialidad;
 }
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of nombre
   * @param newVar the new value of nombre
   */

  /**
   * Get the value of nombre
   * @return the value of nombre
   */
  public String getNombre () {
    return nombre;
  }

  /**
   * Set the value of especialidad
   * @param newVar the new value of especialidad
   */

  /**
   * Get the value of especialidad
   * @return the value of especialidad
   */
  public String getEspecialidad () {
    return especialidad;
  }

  //
  // Other methods
  //
  @Override
  public String toString(){
     return nombre + "(" + especialidad + ")";
  }
  /**
   * @param        nombre
   * @param        especialidad
   */


  /**
   * @return       String
   */


  /**
   * @return       String
   */


}
