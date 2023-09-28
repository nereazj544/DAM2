package ejercicios;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.ObjectOutputStream;
import java.util.Scanner;

/***
 * @author Nerea Zapatero Jara
 */

public class ejercicio14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe una frase");
        try {
            BufferedWriter escritor = new BufferedWriter(
                    new FileWriter("C:\\Users\\nzjha\\Desktop\\ADT\\Actividades\\src\\txt\\frase.txt", true));

            // Pedirle la frase al usuario, para eso con Scanner, almacenare lo que diga en la siguiente variable
            String frase = sc.nextLine();

            // aqui llamamos al metodo
            EscriF(escritor, frase);
            
            escritor.close();
        } catch (Exception e) {
            System.out.println("Error");
        }

    }

    public static void EscriF (BufferedWriter escritor, String frase){
        try {
            escritor.write(frase);
            escritor.newLine();
            System.out.println(frase);
        } catch (Exception e) {
            System.out.println("Error");
        }
    }
}
