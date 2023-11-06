package REPASO.ADT.FICHEROSTXT;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class EscribirFichTexto {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce el nombre de la ruta y el fichero"); 
        //Se pide al user que introduca la ruta y el nombre del fichero

        //Se almacena la ruta y el nombre del fichero
        String ruta = sc.nextLine();
        System.out.println("Se ha creado en: " + ruta);

        File ficher = new File(ruta);
        FileWriter fileWriter = new FileWriter(ficher);
        System.out.println("Escribe el contendio");

        //Se introduce una cadena por teclado y se convierte en una cadena de caracteres
        String cadena = sc.nextLine();
        char cha [] = cadena.toCharArray();

        //Se escribe en el fichero
        for (int i = 0; i < cha.length; i++) {
            fileWriter.write(cha[i]);
        }
        fileWriter.append('*'); //Añade el caracter * al final del la cadena de texto
        fileWriter.write("\n");
        fileWriter.write(cha);
        System.out.println("Escribe una nueva cadena");
        
        String nString = sc.nextLine();
        fileWriter.write(nString);

        //Propuesta Ejercico. Se escriben los caracteres en un array
        fileWriter.write("\n");
        String [] otro = {"Neo", "Akila", "Akira", "Aiden", "Takeshi"};
        fileWriter.write("\n");
        
        for (int i = 0; i < otro.length; i++) {
            fileWriter.write(otro[i]);
            fileWriter.write("\n");
        }

        fileWriter.close();
        sc.close();
        
        //Se mostrara lo que se ha escrito en el archivo anteriro
        try {
            FileReader lector = new FileReader(ficher);
            BufferedReader bReader = new BufferedReader(lector);
            String liena;
            while ((liena = bReader.readLine()) != null) {
                System.out.println(liena);
            }
            bReader.close();
        } catch (Exception e) {}
    }
}
