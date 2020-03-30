package com.Rectangulo;

public class Rectangulo {
    private double Alto;
    private double Ancho;

    public Rectangulo(){
        this.Alto=1;
        this.Ancho=1;
    }

    public double getAlto() {
        return Alto;
    }

    public void setAlto(double alto) {
        Alto = alto;
    }

    public double getAncho() {
        return Ancho;
    }

    public void setAncho(double ancho) {
        Ancho = ancho;
    }

    public double areaRectangulo(){
        return (this.getAncho()*this.getAncho());
    }

    public double perimetroRectangulo(){
        return ((this.getAncho()+this.getAncho())*2);
    }


}
