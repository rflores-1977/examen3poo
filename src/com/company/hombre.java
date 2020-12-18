package com.company;

public class hombre extends zapato{


    public hombre() { }


    @Override
    public String calzar() {
        return "Que bien me quedan estos: "+getTipo()+"\nque son talla: "+getTalla();
    }

    @Override
    public String archivo() {
        return "Tipo: "+getTipo()+" ,Color: "+getColor()+" ,Talla: "+getTalla()+" ,Precio: "+getPrecio()+"\n";
    }
}
