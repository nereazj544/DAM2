package Tema1.Clase.LecturadeFicheros;

import java.io.IOException;
import java.io.BufferedReader;
// import java.io.File;
import java.io.FileReader;

public class LeeStringsds {

    public static void main(String[] args) throws IOException {
        String str = " ", num;
        double x = 0;
        BufferedReader ent = null;
        try {
            ent = new BufferedReader(
                    new FileReader("C:\\Users\\nzjha\\Desktop\\CLASE23-24\\ASIGNATURAS\\ADT\\eclipse\\ADT\\src\\Tema1\\LecturadeFicheros\\d2.txt"));
            do {
                str = ent.readLine(); // lee una línea
                if (str != null) {
                    num = ent.readLine();
                    try {
                        x = Double.parseDouble(num);
                    } catch (NumberFormatException e) {
                        System.out.println("Error al leer el numero " + num);
                    } // try
                } // if
            } while (ent != null);
        } finally {
            if (ent != null) {
                System.out.println(str + "" + x);
                ent.close();
            }
        } // try
    } // main

}
