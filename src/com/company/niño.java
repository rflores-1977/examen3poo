package com.company;

public class niño extends zapato{


    public niño() {
    }

    @Override
    public String calzar() {
        return "Que bien me quedan estos: "+getTipo()+"\nque son talla: "+getTalla();
    }

    @Override
    public String archivo() {
        return "Tipo: "+getTipo()+" ,Color: "+getColor()+" ,Talla: "+getTalla()+" ,Precio: "+getPrecio()+"\n";
    }
}
