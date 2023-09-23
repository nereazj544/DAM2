package Tema1.Clase.Ejemplos1;
import java.io.File;

public class Ejemplo1 {
    public static void main(String[] args) {
        String ruta = " "; // rueta almacenada en los argumentos de eclipse porque en visual no se como se
                           // hace
        if (args.length >= 1)
            ruta = args[0];
        File fichero = new File(ruta);
        if (!fichero.exists()) {
            System.out.println("No existe el fichero o directorio en " + ruta);
        } else {
            System.out.println(ruta + " es un directorio con contenidos: ");
            File[] ficheros = fichero.listFiles();
            for (File f : ficheros) {
                String textoDescr = f.isDirectory() ? "/" : f.isFile() ? "_" : "?";
                System.out.println(textoDescr + " " + f.getName());
            }
        }
    }
}
