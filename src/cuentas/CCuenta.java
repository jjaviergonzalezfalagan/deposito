package cuentas;

/**
 * 
 * La clase CCuenta define las variables, los constructores y 
 * los métodos para los objetos de la clase. Esta clase definirá 
 * objetos de tipo 'CCuenta' que tendrán como atributos los valores 
 * 'nombre', 'cuenta', 'saldo' y 'tipo'.
 * 
 * @author Javier González Falagán - ue47292@edu.xunta.gal
 * @version 1.0.
 */
public class CCuenta {
    
    // Declaración de variables.
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    /**
     * 
     * Devuelve el valor del atributo 'nombre' del objeto 'CCuenta'.
     * 
     * @return Nombre de la cuenta.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * 
     * Asigna un valor al atributo 'nombre' del objeto 'CCuenta'.
     * 
     * @param nombre Nombre de la cuenta.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * 
     * Devuelve el valor del atributo 'cuenta' del objeto 'CCuenta'.
     * 
     * @return Número de cuenta.
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * 
     * Asigna un valor al atributo 'cuenta' del objeto 'CCuenta'.
     * 
     * @param cuenta Número de cuenta.
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * 
     * Devuelve el valor del atributo 'saldo' del objeto 'CCuenta'.
     * 
     * @return Saldo de la cuenta.
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * 
     * Asigna un valor al atributo 'saldo' del objeto 'CCuenta'.
     * 
     * @param saldo Saldo de la cuenta.
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * 
     * Devuelve el valor del atributo 'tipo' del objeto 'CCuenta'.
     * 
     * @return Tipo de interés de la cuenta.
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * 
     * Asigna un valor al atributo 'tipo' del objeto 'CCuenta'.
     * 
     * @param tipoInterés Tipo de interés de la cuenta.
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }    
    
    /**
     * 
     * Definición del constructor por defecto de la clase.
     */
    public CCuenta()
    {
    }
    
    /**
     * 
     * Definición del constructor para el caso de que se asignen los 
     * valores de todos los atributos de la clase: 'nombre', 'cuenta', 
     * 'saldo' y 'tipo'.
     * 
     * @param nom Nombre de la cuenta.
     * @param cue Número de cuenta.
     * @param sal Saldo de la cuenta.
     * @param tipo Tipo de interés de la cuenta.
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }
    
    /**
     * 
     * Devuelve el valor del atributo 'saldo' del objeto 'CCuenta'.
     * 
     * @return Saldo de la cuenta.
     */
    public double estado()
    {
        return getSaldo();
    }
    
    /**
     * 
     * Suma al valor actual del saldo de la cuenta un valor 'cantidad' 
     * pasado como parámetro.
     * 
     * @param cantidad Valor de la cantidad a ingresar.
     * @throws java.lang.Exception Gestiona excepciones para el caso de 
     * que se produzca el ingreso de una cantidad negativa.
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }
    
    /**
     * 
     * Resta al valor actual del saldo de la cuenta un valor 'cantidad' 
     * pasado como parámetro.
     * 
     * @param cantidad Valor de la cantidad a retirar.
     * @throws Exception Gestiona excepciones para el caso de la retirada 
     * de una cantidad negativa y para el caso de que no haya suficiente 
     * saldo en la cuenta.
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }
}
