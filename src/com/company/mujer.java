package com.company;

public class mujer extends zapato{


    public mujer() { }

    @Override
    public String calzar() {
        return "Que bien me quedan estas: "+getTipo()+"\nque son talla: "+getTalla();
    }

    @Override
    public String archivo() {
        return "Tipo: "+getTipo()+" ,Color: "+getColor()+" ,Talla: "+getTalla()+" ,Precio: "+getPrecio()+"\n";
    }
}
