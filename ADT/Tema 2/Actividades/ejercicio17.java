package ejercicios;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.Scanner;

/**
 * @author Nerea Zapatero Jara
 * 
 * Enunciado del ejercico 17. Escribir una frase y guardarla en un archivo binario y luego recuperarla.
 */

 /** 
  * En este codigo, se utiliza la calse Scanner para almacenar la frase que introduca el user. Se muestra el proceso de escritura y lectura del archivo txt utilizando las clases: FileOutputStream, DataOutputStream y la version "InputStream" de ambas. Se majea las excepciones de tipo "IOException" que pueden ocurrir durante la manipulacion de archivos.
 */

public class ejercicio17 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa una frase: ");
        String fresa = sc.nextLine();
        String Archivo = "C:\\Users\\nzjha\\Desktop\\ADT\\Actividades\\src\\txt\\frase.bin";

        try {

            //Se escribe 
            FileOutputStream File = new FileOutputStream(Archivo);
            DataOutputStream Data = new DataOutputStream(File);

            Data.writeUTF(fresa);
            Data.close();

            FileInputStream file = new FileInputStream(Archivo);
            DataInputStream data = new DataInputStream(file);
            data.close();
            System.out.println("Frase: " + fresa);
        } catch (Exception e) {
            System.out.println("Error");
        }
        sc.close();
    }
    
}
