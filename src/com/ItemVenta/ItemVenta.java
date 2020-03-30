package com.ItemVenta;

public class ItemVenta {
    private static int totalItems=0;
    private int Id;
    private String Descripcion;
    private int Cantidad;
    private double Precio;

    public int getId() {
        return Id;
    }


    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int cantidad) {
        Cantidad = cantidad;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double precio) {
        Precio = precio;
    }

    public ItemVenta()
    {
        this.totalItems++;
        this.Id=totalItems;
        this.Descripcion=" ";
        this.Cantidad=0;
        this.Precio=0;
    }

    public ItemVenta(String descripcion, int cantidad, double precio)
    {
        this.totalItems++;
        this.Id=totalItems;
        this.Descripcion=descripcion;
        this.Cantidad=cantidad;
        this.Precio=precio;
    }

    public double precioVenta()
    {
        return (this.Precio*this.Cantidad);
    }

}
