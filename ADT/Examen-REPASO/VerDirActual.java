package REPASO.ADT;

import java.io.File;

/**
 * VerDirActual
 */
public class VerDirActual {

    public static void main(String[] args) {
        String ruta = ".";
        File file = new File(ruta);
        String archivos [] = file.list();
        System.out.printf("Ficheros del directorio actual: %d %n", archivos.length);
        for (int i = 0; i < archivos.length; i++) {
            File file2 = new File(file, archivos[i]);
            System.out.printf("Nombre: %s, es fichero?: %b, es directorio?: %b %n", archivos[i], file2.isFile(), file2.isDirectory());
        }
    }
    
}