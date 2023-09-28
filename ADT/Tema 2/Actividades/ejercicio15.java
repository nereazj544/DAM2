package ejercicios;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

/**
 * @author Nerea Zapatero Jara
 * Enunciado del ejercicio: Pedir números positivos por teclado y guardarlos en un fichero binario hasta que introduzcamos un -1
 * ------------------------------------------------------------------------------------------------------------------------------ 
 * Este metodo permite al usuario ingresar nº positivos y guardarlos en un archivo txt, 
 * en este caso en 'numeros.txt', el programa se ejecutara 
 * hasta que se finalace ingresando -1.
*/
public class ejercicio15 {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num; //Variable para almacenar el nº que ingrese el usuario
    try {
        FileWriter escritor = new FileWriter("C:\\Users\\nzjha\\Desktop\\ADT\\Actividades\\src\\txt\\numeros.txt");
        BufferedWriter escritorBuff = new BufferedWriter(escritor);
        do {
            System.out.println("Numero (salir '-1')): ");
            num = sc.nextInt();
            if (num != -1) {
                if (num >= 0) {
                    escritorBuff.write(Integer.toString(num));
                    escritorBuff.newLine();
                } else {
                    System.out.println("No valido.");
                }
            }
        } while (num != -1);
        escritorBuff.close();
        escritor.close();
    } catch (Exception e) {
System.out.println("Error");
    }
    }
}
