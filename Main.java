package cuentas;

/**
 * Clase que representa calse principal.
 * 
 * @author carlo
 * @version 1.0
 */
 
public class Main {
    public static void main(String[] args) {
		/** Agrega un elemento al constructor CCuenta*/
        CCuenta cuenta1;
        double saldoActual;

        cuenta1 = new CCuenta("Antonio López", "1000-2365-85-1230456789", 2500, 0);
		/** Se opera con la cuenta1*/
        operativa_cuenta(cuenta1, 0);
    }

    /**
     * Realiza operaciones con una cuenta
     * @param cuenta objeto de la clase CCuenta
     * @param cantidad a ingresar o retirar
     */
	 
    public static void operativa_cuenta(CCuenta cuenta, float cantidad) {
        double saldoActual = cuenta.estado();
        System.out.println("El saldo actual es " + saldoActual);

        try {
            System.out.println("Intentando retirar " + cantidad + "...");
            cuenta.retirar(cantidad);
            System.out.println("Retiro realizado con éxito");
        } catch (Exception e) {
            System.out.println("Fallo al retirar");
        }

        try {
            System.out.println("Intentando ingresar " + cantidad + "...");
            cuenta.ingresar(cantidad);
            System.out.println("Ingreso realizado con éxito");
        } catch (Exception e) {
            System.out.println("Fallo al ingresar");
        }
    }
}
