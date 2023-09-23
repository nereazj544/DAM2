package Tema1.Clase.LecturadeFicheros;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;

public class LeeStrings {

    public static void main(String[] args) throws IOException {
        String str, num;
        double x;

        BufferedReader ent = null;
        try {
            ent = new BufferedReader(new FileReader("C:\\Users\\nzjha\\Desktop\\CLASE23-24\\ASIGNATURAS\\ADT\\eclipse\\ADT\\src\\Tema1\\Clase\\LecturadeFicheros\\d2.txt"));
            while ((str = ent.readLine()) != null) {
                System.out.println("Text: " + str);
                num = ent.readLine();
                try {
                    x = Double.parseDouble(num);
                    System.out.println("Num: " + x);
                } catch (NumberFormatException e) {
                    System.out.println("Error al leer el nº: " + num);
                }
            }
        } catch (IOException e) {
            System.out.println("Error al abrir el archivo: " + e.getMessage());
        } finally {
            if (ent != null) {
                ent.close();
            }
        }
    }
}
