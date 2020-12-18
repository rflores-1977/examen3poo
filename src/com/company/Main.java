package com.company;

import javax.swing.JOptionPane;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner rd = new Scanner(System.in);
        int eleccion;

        do {
            eleccion = menu();

            switch (eleccion) {
                case 1:
                    zapatoHombre();
                    break;
                case 2:
                    zapatoMujer();
                    break;
                case 3:
                   zapatoNiño();
                    break;
                default:
                    eleccion = 4;
            }

        }while (eleccion!=4);
    }


    //FUNCIONES

    public static int menu (){
        int eleccion;
        String[] botones = {"Hombre", "Mujer", "Niño","Salir del sistema"};
        eleccion = 1 + JOptionPane.showOptionDialog(null, "Pulse el boton del Tipo de Zapato a Ingresar:", "Ingreso de Zapatos al Inventario", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, botones, botones[0]);

        return eleccion;
    }

    public static void zapatoHombre (){
        zapato h = new hombre();
        h.setTalla(Double.parseDouble(JOptionPane.showInputDialog("Ingrese la Talla")));
        h.setPrecio(Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio")));
        h.setColor(JOptionPane.showInputDialog("Ingrese el Color"));
        h.setTipo(JOptionPane.showInputDialog("Ingrese el Tipo de Zapato"));

        JOptionPane.showMessageDialog(null,h.calzar());
        archivos.writeFileAppend("Zapatos Hombre", h.archivo());
        JOptionPane.showMessageDialog(null, "El arcivo se guardo correctamente");
    }

    public static void zapatoMujer (){
        zapato m = new mujer();
        m.setTalla(Double.parseDouble(JOptionPane.showInputDialog("Ingrese la Talla")));
        m.setPrecio(Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio")));
        m.setColor(JOptionPane.showInputDialog("Ingrese el Color"));
        m.setTipo(JOptionPane.showInputDialog("Ingrese el Tipo de Zapato"));

        JOptionPane.showMessageDialog(null,m.calzar());
        archivos.writeFileAppend("Zapatos Mujer", m.archivo());
        JOptionPane.showMessageDialog(null, "El arcivo se guardo correctamente");
    }

    public static void zapatoNiño (){
        zapato ñ = new niño();
        ñ.setTalla(Double.parseDouble(JOptionPane.showInputDialog("Ingrese la Talla")));
        ñ.setPrecio(Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio")));
        ñ.setColor(JOptionPane.showInputDialog("Ingrese el Color"));
        ñ.setTipo(JOptionPane.showInputDialog("Ingrese el Tipo de Zapato"));

        JOptionPane.showMessageDialog(null,ñ.calzar());
        archivos.writeFileAppend("Zapatos Niño", ñ.archivo());
        JOptionPane.showMessageDialog(null, "El arcivo se guardo correctamente");
    }
}
