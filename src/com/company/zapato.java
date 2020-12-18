package com.company;

public abstract class zapato {

    private double talla;
    private double precio;
    private String color;
    private String tipo;

    public double getTalla() {
        return talla;
    }

    public void setTalla(double talla) {
        this.talla = talla;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTipo() { return tipo; }

    public void setTipo(String tipo) { this.tipo = tipo; }

   public String calzar (){ return "Que bien me quedan estos: "+getTipo()+"\nque son talla: "+getTalla(); }

   public abstract String archivo ();
}
