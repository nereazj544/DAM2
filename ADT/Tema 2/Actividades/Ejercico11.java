package Tema1.Actividades.T2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/* 
    * 11. Escribe y ejecuta un programa que lea un fichero de texto 
    * y añada una línea al final del mismo.
*/

public class Ejercico11 {
    public static void main(String[] args) throws IOException {
        
        /* 
        * ----------------------------------------------------------------
        * INSTRUCCIONES PARA QUE FUNCIONE EL CODIGO DEL EJERCICIO 11:
        * ----------------------------------------------------------------
        * En ambos Buffered se debe de modificar la ruta del archivo.
        * BufferedWriter escribir = new BufferedWriter(new FileWriter("[ESTA RUTA ES LA QUE AHI QUE MODIFICAR]",true));
        * 
        * BufferedReader ent = new BufferedReader(new FileReader("[ESTA RUTA ES LA QUE AHI QUE MODIFICAR]"));
        * 
        */
        
        // ------ CODIGO -----

        Scanner sc = new Scanner(System.in);
        
        BufferedWriter escribir = new BufferedWriter(new FileWriter("C:\\Users\\nzjha\\Desktop\\CLASE23-24\\ASIGNATURAS\\ADT\\eclipse\\ADT\\src\\Tema1\\Actividades\\T2\\txt\\añadir.txt", true));

        System.out.println("Escribe tu texto (Este nuevo contenido aparecera al final del archivo de texto):");
        String linea = sc.nextLine();
        escribir.write(linea);
        escribir.newLine();
        escribir.close();

        BufferedReader ent = new BufferedReader(new FileReader(
                "C:\\Users\\nzjha\\Desktop\\CLASE23-24\\ASIGNATURAS\\ADT\\eclipse\\ADT\\src\\Tema1\\Actividades\\T2\\txt\\añadir.txt"));
        String texto = "";
        linea = ent.readLine();
        while (linea != null) {
            texto = texto + linea + "\n";
            linea = ent.readLine();
        }
        System.out.println(texto);
        ent.close();
    }
}
