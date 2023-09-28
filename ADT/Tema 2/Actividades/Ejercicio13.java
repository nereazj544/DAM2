package ejercicios;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

/**
 * @author Nerea Zapatero Jara
 * 
 * 
 * este programa utiliza DataOutputStream para escribir un número decimal proporcionado por el usuario en un archivo binario llamado "binario.txt". Si ocurre algún error durante el proceso, muestra un mensaje de error. Si todo sale bien, muestra un mensaje de éxito.

Asegúrate de que la ruta del archivo de salida sea válida en tu sistema y que el programa tenga permisos para escribir en esa ubicación.
 * 
 */

/* 
 * 13. Pedir un double por teclado y guardarlo en un  
 *  fichero binario
*/


public class Ejercicio13 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        
        try {
            System.out.print("Numero decimal");
            double number = sc.nextDouble();
            DataOutputStream archivo = new DataOutputStream(new FileOutputStream("C:\\Users\\nzjha\\Desktop\\ADT\\Actividades\\src\\txt\\binario.txt"));
            archivo.writeDouble(number);
            archivo.close();
            System.out.println("Se ha guardado");

        } catch (Exception e) {
            System.out.println("Error");
        }
    }
}
