package com.CuentaBancaria;

public class CuentaBancaria {
    private static int totalCuentas=0;
    private int Id;
    private String Nombre;

    public int getId() {
        return Id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public double getBalance() {
        return Balance;
    }

    public void setBalance(double balance) {
        Balance = balance;
    }

    private double Balance;

    public CuentaBancaria()
    {
        totalCuentas++;
        this.Id=totalCuentas;
        this.Nombre="";
        this.Balance=0;
    }

    public CuentaBancaria(String nombre, double balance)
    {
        totalCuentas++;
        this.Id=totalCuentas;
        this.Nombre=nombre;
        this.Balance=balance;
    }

    public void credito(double ingreso)
    {
        this.Balance=Balance+ingreso;
        System.out.println("La Operacion se Realizo con Exito Balance: $"+ this.Balance);
    }

    public void debito(double egreso)
    {
        if((Balance-egreso)<0)
        {
            System.out.println("La Operacion no Puede Realizarce Balance Actual: $"+this.Balance);
        }else {
            this.Balance = Balance - egreso;
            System.out.println("La Operacion se Realizo con Exito Balance: $" + this.Balance);
        }
    }

    public void datosCuenta()
    {
        System.out.println("Numero de Cuenta: "+this.Id);
        System.out.println("Nombre          : "+this.Nombre);
        System.out.println("Balance         : $"+this.Balance);
    }
}
