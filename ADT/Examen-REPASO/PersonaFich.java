package REPASO.ADT.FICHEROSBINARIOS.PERSONA;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class PersonaFich {

    public static void main(String[] args) throws IOException{
        Persona persona;

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce ruta: ");
        String ruta = sc.nextLine();
        System.out.println("Ruta: " + ruta);

        File file = new File(ruta);
        FileOutputStream fileou = new FileOutputStream(file, true);

        ObjectOutputStream obj = new ObjectOutputStream(fileou);

        String nombre [] = {"Neo", "Kia", "Takeshi"};
        int [] edad = {19, 3, 40};

        System.out.println("ok");

        for (int i = 0; i < edad.length; i++) {
            persona = new Persona(nombre[i], edad[i]);
            obj.writeObject(persona);
        }
        System.out.println("todo ok");
    
    
    
    
    }
}
