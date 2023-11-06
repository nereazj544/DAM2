package REPASO.ADT.FICHEROSBINARIOS;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/**
 * EscribirFichBytes
 */
public class EscribirFichBytes {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introducce la ruta: ");
        String ruta = sc.nextLine();

        File file = new File(ruta);

        FileOutputStream fileOut = new FileOutputStream(file, true);
        
        FileInputStream fileInput = new FileInputStream(file);

        int i;

        for (i = 0; i < 100; i++) {
            fileOut.write(i);
        }

        while ((i = fileInput.read()) != -1) {
            System.out.println(i);
        }

    }
}