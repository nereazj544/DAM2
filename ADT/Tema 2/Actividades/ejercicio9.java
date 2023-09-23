package Tema1.Actividades.T2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/* 
 * Escribe y ejecuta un programa que cree un archivo de texto para escritura. 
 * En ese archivo se debe escribir el nombre y apellidos de cada alumno de la clase.
 */

public class ejercicio9 {
    public static void main(String[] args) throws Exception {

        
        //--- RUTA DONDE SE CREARA EL ARCHIVO TXT
        String ArchivoTXT = "C:\\Users\\nzjha\\Desktop\\CLASE23-24\\ASIGNATURAS\\ADT\\eclipse\\ADT\\src\\Tema1\\Actividades\\T2\\txt\\ListaAlumno.txt";
        
        Scanner sc = new Scanner(System.in);
        try (BufferedWriter escritor = new BufferedWriter(new FileWriter(ArchivoTXT))) {
            while (true) {
                System.out.println("Nombre y apellido de los alumnos(' FIN '): ");
                String nomAp = sc.nextLine();
                // Para poder escribir los nombres (+ apellidos) en el archivo.
                escritor.write(nomAp);
                escritor.newLine();
                if (nomAp.equalsIgnoreCase("FIN")) {
                    break;
                }

            }
            System.out.println("Se ha creado: " + ArchivoTXT);
        } catch (IOException e) {
            System.out.println("Error");
        }

    }
}
