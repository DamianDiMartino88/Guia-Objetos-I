package com.Empleado;

public class Empleado {
    private int Dni;
    private String Nombre;

    public int getDni() {
        return Dni;
    }

    public void setDni(int dni) {
        Dni = dni;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public double getSalario() {
        return  Salario;
    }

    public void setSalario(double salario) {
        Salario = salario;
    }

    private String Apellido;
    private double Salario;

    public Empleado(){
        this.Dni=00000000;
        this.Nombre="Nombre Nuevo Empleado";
        this.Apellido="Apellido Nuevo Empleado";
        this.Salario=00000.00;
    }

    public Empleado(int dni,String nombre, String apellido, double salario){
        this.Dni=dni;
        this.Nombre=nombre;
        this.Apellido=apellido;
        this.Salario=salario;
    }

    public void aumentoSueldo(double porcentaje){
        this.Salario=Salario*(1+(porcentaje/100));
    }

    public double salarioAnual()
    {
        return (this.Salario*12);
    }

    public void datosEmpleado()
    {
        System.out.println("Empleado[ DNI: "+this.Dni+" Nombre: "+this.Nombre+" Apellido: "+this.Apellido+" Salario: $"+this.Salario);
    }
}
