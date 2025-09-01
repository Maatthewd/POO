package Herencia;

public abstract class Cuenta {

    private double saldo;
    private int numCuenta;

    public Cuenta(){

    }

    public abstract void retirar(double cantidad);

    public abstract void depositar(double cantidad);

    public abstract void verSaldo();


}
