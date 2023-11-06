package REPASO.ADT.FICHEROSTXT;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class LeerFichTextoBuf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce el nombre de la ruta y el fichero"); 
        //Se pide al user que introduca la ruta y el nombre del fichero

        //Se almacena la ruta y el nombre del fichero
        String ruta = sc.nextLine();
        System.out.println("Se ha selecionado: " + ruta);
        sc.close();
        
        try {
            File file = new File(ruta);
            BufferedReader bReader = new BufferedReader(new FileReader(file));

            String linea;
            System.out.println("Contenido: \n");
            while ((linea = bReader.readLine()) != null) {
                System.out.println(linea);
            }
            bReader.close();
        
        } catch (FileNotFoundException n) {
        } catch (IOException e) {
            // TODO: handle exception
        }
    }
}
