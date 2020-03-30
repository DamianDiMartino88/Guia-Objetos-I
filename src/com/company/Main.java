package com.company;

import com.CuentaBancaria.CuentaBancaria;
import com.Hora.Hora;
import com.Empleado.Empleado;
import com.ItemVenta.ItemVenta;
import com.Rectangulo.Rectangulo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Ejercicio 1
        Rectangulo primerRectangulo = new Rectangulo();

        System.out.println("Alto Rectangulo: "+primerRectangulo.getAlto());
        System.out.println("Ancho Rectangulo: "+primerRectangulo.getAncho());

        System.out.println("Area Rectangulo: "+primerRectangulo.areaRectangulo());
        System.out.println("Perimetro Rectangulo: "+primerRectangulo.perimetroRectangulo());
        Scanner scan = new Scanner(System.in);
        double alto = scan.nextDouble();
        double ancho = scan.nextDouble();
        primerRectangulo.setAlto(5.3);
        primerRectangulo.setAncho(ancho);

        System.out.println("Area Rectangulo: "+primerRectangulo.areaRectangulo());
        System.out.println("Perimetro Rectangulo: "+primerRectangulo.perimetroRectangulo());

        //Ejercicio 2
        Empleado empleado1 = new Empleado(23456345,"Carlos","Gutierrez",25000);
        Empleado empleado2 = new Empleado(34234123,"Ana","Sanchez",27500);

        empleado1.datosEmpleado();
        empleado2.datosEmpleado();

        empleado1.aumentoSueldo(15);

        System.out.println("El Salario Anual de: "+empleado1.getNombre()+" "+empleado1.getApellido()+" Es: $"+empleado1.salarioAnual()+"]");

        //Ejercicio 3

        ItemVenta venta1 = new ItemVenta("Perchero",3,15.50);
        ItemVenta venta2 = new ItemVenta("Estante",4,23.50);

        System.out.println("ItemVenta[ ID: "+venta1.getId()+" Descripcion: "+venta1.getDescripcion()+" Cantidad: "+venta1.getCantidad()+" Precio: $"+venta1.getPrecio()+" Total Venta: $"+venta1.precioVenta()+" ]");
        System.out.println("ItemVenta[ ID: "+venta2.getId()+" Descripcion: "+venta2.getDescripcion()+" Cantidad: "+venta2.getCantidad()+" Precio: $"+venta2.getPrecio()+" Total Venta: $"+venta2.precioVenta()+" ]");

        //Ejercicio 4

        CuentaBancaria cuenta1 = new CuentaBancaria("La Cuenta de Tito",15000);
        cuenta1.credito(2500);
        cuenta1.debito(1500);
        cuenta1.debito(30000);
        cuenta1.datosCuenta();


        //Ejercicio 5
        Hora horaActual =new Hora(25,60,61);
        horaActual.verHora();
        horaActual.sumaSegundos();
        horaActual.restaSegundos();
    }
}
