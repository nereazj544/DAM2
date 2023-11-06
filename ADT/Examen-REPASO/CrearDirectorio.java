package REPASO.ADT.FICHEROSTXT;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class CrearDirectorio {

    public static void main(String[] args) {
        // String ruta = "src\\REPASO\\ADT\\Directorio";
        // File ruta = new File("src\\REPASO\\ADT\\Directorio\\");
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Ruta donde se creara el directorio (ejemplo: ejemplo1\\nombrearchivo)"); 
        String ru = sc.nextLine();
        File ruta = new File(ru);
        sc.close();

        File file = new File(ruta, "FICHERO.TXT");
        File file2 = new File(ruta, "FICHERO2.TXT");
        ruta.mkdir();

        try {
            if (file.createNewFile()) {
                System.out.println("Se ha creado " + ruta);
            } else {
                System.out.println("no se creo");
            }
            if (file2.createNewFile()) {
                System.out.println("Se ha creado " + ruta);
            } else {
                System.out.println("no se creo");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        file.renameTo(new File(ruta, "FICHEROR.dat"));
        try {
            File file3 = new File(ruta, "FICHERO3.TXT");
            file3.createNewFile();
        } catch (Exception e) {
            // TODO: handle exception
        }

    }

    // renombra el archi

}
