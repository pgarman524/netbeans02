/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad_02_ud3_ed;

/**
 * 
 * @author Ana
 */
public class CCuenta {


     
  protected String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

  
    public CCuenta ()
    {
    }
   /**
    * Constructor de la clase CCuenta
    * @param nom Nombre del titular de la cuenta
    * @param cue Nombre de la cuenta
    * @param sal Nombre del salario
    * @param tipo Nombre del tipo de interes
    */
    public CCuenta (String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
        tipoInterés=tipo;
    }
  /**
   * variable que asigna nombre
   * @author yyyyy
   * @version 1.0
   * @param nom Nombre del  propietario de la cuenta
   */
    public void asignarNombre(String nom)
    {
        nombre=nom;
    }
   
   /**
   * Clase en la que se obtiene un nombre
   * @author xxxxx
   * @version 1.2
   * 
   */
    
    public String obtenerNombre()
    {
        return nombre;
    }

   /**
   * Clase en la que se devuelve un saldo
   * @author MMMMMMM
   * @version 1.0
   * @return saldo
   */
    
     public double estado ()
    {
        return saldo;
    }

     
    /**
   * Clase en la que se ingresa dinero
   * @author xxxxx
   * @version 1.2
   *  
   */
     
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0){
            throw new Exception("No se puede ingresar una cantidad negativa");}
        setSaldo(saldo + cantidad);
    }

    
        /**
   * Clase para retirar el dinero
   * @author xxxxx
   * @version 2.1
   * 
   */
    
   
    public void retirar (double cantidad) throws Exception
    {
        if (cantidad < 0){
            throw new Exception ("No se puede retirar una cantidad negativa");}
        if (estado()< cantidad){
            throw new Exception ("No se hay suficiente saldo");}
        setSaldo(saldo - cantidad);
    }
    
    
   /**
   * Clase en la que se obtiene una cuenta
   * @author xxxxx
   * @version 1.2
   * 
   */
    
    
    public String obtenerCuenta ()
    {
        return cuenta;
    }

  
   /**
   * Clase que representa una cuenta
   * @author MMMMMM
   * @version 1.0
   * 
   */
    
    
  public void setCuenta(String cuenta) {
    this.cuenta = cuenta;
  }
  
  
   /**
   * Clase que representa el saldo
   * @author MMMMMM
   * @version 1.0
   * 
   */
  
  
  public void setSaldo(double saldo) {
    this.saldo = saldo;
  }

   /**
   * Clase que representa el tipo de interes
   * @author MMMMMM
   * @version 1.0
   * 
   */
  
  
  public double getTipoInterés() {
    return tipoInterés;
  }
  
   /**
   * Modifica el tipo de interes
   * @author XXXXXX
   * @version 1.9
   * 
   */
  
  public void setTipoInterés(double tipoInterés) {
    this.tipoInterés = tipoInterés;
  }
}
