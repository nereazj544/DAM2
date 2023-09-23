package Tema1.Clase.Ejemplos1;

import java.io.*;

public class ejemplo1_1 {
    public static void main(String[] args) {
        String ruta = " "; // C:\\Users\\nzjha\\Desktop\\CLASE23-24\\ASIGNATURAS\\ADT\\Repositorio
        
        // rueta almacenada en los argumentos de eclipse
        if (args.length >= 1)
            ruta = args[0];
        File fichero = new File(ruta);
        if (!fichero.exists()) {
            System.out.println("No existe el fichero o directorio en " + ruta);
        } else {
            System.out.println(ruta + " es un directorio con contenidos: ");
            File[] ficheros = fichero.listFiles();
            for (File f : ficheros) {
                /*
                 * String textoDescr = f.isDirectory() ? "/" : f.isFile() ? "_" : "?";
                 * System.out.println(textoDescr + " " + f.getName());
                 */

                if (f.isFile()) {
                    System.out.println("_ " + f.getName());
                    if (f.getName().toLowerCase().endsWith(".txt")) {
                        System.out.println("Contiene un archivo de texto: " + f.getName());

                    }
                }

            }
        }
    }
}