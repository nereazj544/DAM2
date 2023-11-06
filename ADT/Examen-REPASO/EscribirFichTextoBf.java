package REPASO.ADT.FICHEROSTXT;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class EscribirFichTextoBf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la ruta: ");
        String ruta = sc.nextLine();

        System.out.println("Ruta: " + ruta);

        try {
            File file = new File(ruta);
            BufferedWriter bWriter = new BufferedWriter(new FileWriter(file));
            for (int i = 0; i < 11; i++) {
                bWriter.write("Fila: " + i);
                bWriter.newLine();
            }
            bWriter.append("FIN \n");
            bWriter.close();
            sc.close();

            BufferedReader bReader = new BufferedReader(new FileReader(file));
            String linea;
            System.out.println("Contenido: \n");
            while ((linea = bReader.readLine()) != null) {
                System.out.println(linea);
            }
            bReader.close();

        } catch (FileNotFoundException e) {
        } catch (IOException e) {}
    }
}
