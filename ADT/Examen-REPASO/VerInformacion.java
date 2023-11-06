package REPASO.ADT.FICHEROSTXT;

import java.io.File;
import java.util.Scanner;

public class VerInformacion {
    public static void main(String[] args) {
        System.out.println("Ruta del directorio: ");
        Scanner sc = new Scanner(System.in);
        String ruta =  sc.nextLine();
        sc.close();
        System.out.println("Informacion sobre el fichero (actual): " + ruta);
        // String ruta = "src\\REPASO\\ADT";
        File file = new File(ruta);

        if (file.exists()) {
            System.out.println("Nombre: " + file.getName());
            System.out.println("Ruta: " + file.getPath()); // Ruta relativa
            System.out.println("Ruta: " + file.getAbsolutePath()); // Ruta absoluta
            System.out.println("¿Leer?: " + file.canRead()); // ¿se puede leer?
            System.out.println("¿Escribir?: " + file.canWrite()); // ¿se puede escribir?
            System.out.println("Tamaño: " + file.length()); // Tamaño
            System.out.println("¿Directorio?: " + file.isDirectory()); // ¿Es un directorio?
            System.out.println("¿Fichero?: " + file.isFile()); // ¿Es un fichero?
            System.out.println("Nombre del dri.Padre: " + file.getParent()); //Directorio padre
        }
    }
}
