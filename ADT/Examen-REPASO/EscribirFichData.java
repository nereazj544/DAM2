package REPASO.ADT.FICHEROSBINARIOS;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class EscribirFichData {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String ruta = sc.nextLine();
        File file = new File(ruta);
        
        DataOutputStream dataO = new DataOutputStream(new FileOutputStream(file));

        String nombre [] = {"Neo", "Kia", "Takeshi"};

        int [] edad = {19, 3, 40};

        for (int i = 0; i < edad.length; i++) {
            dataO.writeUTF(nombre[i]);
            dataO.writeInt(edad[i]);

        }
        dataO.close();

    }
}
