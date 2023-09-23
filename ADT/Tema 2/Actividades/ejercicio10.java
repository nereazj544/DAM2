package Tema1.Actividades.T2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.Buffer;
import java.util.Scanner;

/* 
 * 10. Escribe y ejecuta un programa que lea el archivo creado en el ejercicio anterior y muestre su contenido por pantalla, siguiendo el modelo del comando more de Linux, pero con 20 líneas de cada vez, indicando el número de caracteres, de líneas y de palabras -se considera que están separadas por un único espacio en blanco-.
*/


public class ejercicio10 {
    public static void main(String[] args) throws Exception{

        Scanner sc = new Scanner(System.in);
        String liena, enter; 
        int Total = 1000; 
        //Total solo represneta un numero hipotetico del total de lineas que puede haber en el archivo

        try (BufferedReader leer = new BufferedReader(new FileReader("C:\\Users\\nzjha\\Desktop\\CLASE23-24\\ASIGNATURAS\\ADT\\eclipse\\ADT\\src\\Tema1\\Actividades\\T2\\txt\\ListaAlumno.txt"))){
            for(int Actual = 1; Actual <= Total; Actual++){
                liena = leer.readLine();
                if(liena == null){
                    break; //Esto hara que salga del bucle cuando acabe
                }

                System.out.println(liena);
                
                if(Actual % 20 == 0){
                    System.out.println("Enter");
                    enter = sc.nextLine();
                }
            }
        } catch (Exception e) {
            System.out.println("Error");
        }
    }
}
