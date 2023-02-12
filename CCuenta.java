package cuentas;

/**
 * Clase que representa una cuenta bancaria.
 * 
 * @author carlo
 * @version 1.0
 */
public class CCuenta {

    /** Nombre del titular de la cuenta */
    private String nombre;
    /** Número de cuenta */
    private String cuenta;
    /** Saldo de la cuenta */
    private double saldo;
    /** Tipo de interés de la cuenta */
    private double tipoInteres;

    /**
     * Constructor CCuenta
     */
    public CCuenta() {
    }

    /**
     * Constructor  CCuenta
     * 
     * @param nom Nombre del titular de la cuenta
     * @param cue Número de cuenta
     * @param sal Saldo de la cuenta
     * @param tipo Tipo de interés de la cuenta
     */
    public CCuenta(String nom, String cue, double sal, double tipo) {
        nombre = nom;
        cuenta = cue;
        saldo = sal;
		tipoInteres = tipo;
    }

    /**
     * Método que devuelve el saldo de la cuenta
     * 
     * @return Saldo de la cuenta
     */
    public double estado() {
        return saldo;
    }

    /**
     * Método que permite ingresar dinero en la cuenta
     * 
     * @param cantidad Cantidad a ingresar en la cuenta
     * @throws Exception si la cantidad a ingresar es negativa
     */
    public void ingresar(double cantidad) throws Exception {
        if (cantidad < 0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }

    /**
     * Método que permite retirar dinero de la cuenta
     * 
     * @param cantidad Cantidad a retirar de la cuenta
     * @throws Exception si la cantidad a retirar es negativa o mayor que el saldo de la cuenta
     */
    public void retirar(double cantidad) throws Exception {
        if (cantidad <= 0)
            throw new Exception("No se puede retirar una cantidad negativa");
        if (estado() < cantidad)
            throw new Exception("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }
}
