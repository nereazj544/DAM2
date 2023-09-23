package Tema1.Clase.LecturadeFicheros;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Lorem {
    public static void main(String[] args) throws IOException {
        BufferedReader ent = new BufferedReader(new FileReader(
                "C:\\Users\\nzjha\\Desktop\\CLASE23-24\\ASIGNATURAS\\ADT\\eclipse\\ADT\\src\\Tema1\\Clase\\LecturadeFicheros\\lorem.txt"));
        String texto = "";
        String linea = ent.readLine();
        while (linea != null) {
            texto = texto + linea + "\n";
            linea = ent.readLine();
        }
        System.out.println(texto);
        ent.close();
    } // main
} // close
