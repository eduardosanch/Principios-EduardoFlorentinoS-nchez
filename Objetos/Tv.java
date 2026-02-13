

/**
 * Class Tv
 */
public class Tv {

  //
  // Fields
  //

  public String forma;
  public String calidad_de_video;
  protected String marca;
  private String tama_o;

  public String getCalidad_de_video () {
    return calidad_de_video;
  }

  /**
   * Set the value of marca
   * @param newVar the new value of marca
   */
  public void setMarca (String newVar) {
    marca = newVar;
  }

  /**
   * Get the value of marca
   * @return the value of marca
   */
  public String getMarca () {
    return marca;
  }

  /**
   * Set the value of tama_o
   * @param newVar the new value of tama_o
   */
  public void setTama_o (String newVar) {
    tama_o = newVar;
  }

  /**
   * Get the value of tama_o
   * @return the value of tama_o
   */
  public String getTama_o () {
    return tama_o;
  }

  //
  // Other methods
  //

  /**
   * @param        forma
   * @param        tama_o
   * @param        calidadDeVideo
   * @param        marca
   */
  public Tv(String forma, String tama_o, String calidadDeVideo, String marca)
  {
	  this.forma= forma;
	  this.tama_o = tama_o;
	  this.calidad_de_video = calidadDeVideo;
	  this.marca = marca;

	  System.out.println("Se creo una nueva Tv, tamaño: "+tama_o +" y de marca: "+ marca);
  }


  /**
   */
  public void apagada()
  {
    System.out.println("Tv apagada");
  }


  /**
   */
  public void prendida()
  {
    System.out.println("Tv prendida");
  }


  /**
   * @param        forma
   */
  public void setForma(String forma)
  {
    this.forma = forma;
  }


  /**
   * @return       String
   */
  public String getForma()
  {
    return forma;
  }


}
