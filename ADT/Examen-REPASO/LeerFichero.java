package REPASO.ADT.FICHEROSTXT;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class LeerFichero {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        System.out.println("Ruta del txt para leer: ");
        String ru = sc.nextLine();
        File ruta = new File(ru);
        sc.close();

        FileReader fileReader = new FileReader(ruta);
        int i;
        char car []= new char[10]; //despues de poner esto, se ordena no aparece uno debajo del otro
        while((i = fileReader.read(car)) != -1)
        System.out.println(car);
        fileReader.close();
    }
}
