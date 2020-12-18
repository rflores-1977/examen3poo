package com.company;

import java.io.FileWriter;
import java.io.IOException;

public class archivos {

    public static void writeFileAppend(String Nombre, String texto) {
        try {
            FileWriter FW = new FileWriter(Nombre, true);
            FW.append(texto);
            FW.flush();
            FW.close();
        } catch (IOException reporte) {
            reporte.printStackTrace();
        }
    }
}
