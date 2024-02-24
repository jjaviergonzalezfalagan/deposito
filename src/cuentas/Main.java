package cuentas;

/**
 * 
 * Clase principal (por defecto).
 * 
 * @author Javier González Falagán - ue47292@edu.xunta.gal
 * @version 1.0.
 */
public class Main {
    
    /**
     *
     * Método por defecto.
     * 
     * @param args Argumentos pasados como parámetro que va a 
     * manejar el método 'main'.
     * @param cantidad Valor de la cantidad que va a manejar el 
     * método 'main'.
     */
    public static void main(String[] args, float cantidad) {
        operativa_cuenta(cantidad);
    }
    
    /**
     * 
     * Realiza diversas acciones sobre una cuenta a partir de una cantidad
     * que se le pasa como parámetro.
     * 
     * @param cantidad Valor de la cantidad que va a manejar el método 
     * 'operativa_cuenta'.
     */
    private static void operativa_cuenta(float cantidad) {
        CCuenta cuenta1;
        double saldoActual;
        cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es"+ saldoActual );
        try {
            cuenta1.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }
}
