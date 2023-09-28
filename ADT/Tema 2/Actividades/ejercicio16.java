package ejercicios;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
/** 
 * @author Nerea Zapatero Jara
 * Se abre el archivo que se encuentra en el BufferedReader, en este archivo a de conter numeros para que pueda leerlo.
*/

public class ejercicio16 {
    public static void main(String[] args) {
        try (BufferedReader lector = new BufferedReader(new FileReader("C:\\Users\\nzjha\\Desktop\\ADT\\Actividades\\src\\txt\\numbers.txt"))){
            
            ArrayList<Double> numsList = new ArrayList<>();
            String Linea;

            while ((Linea = lector.readLine()) != null) {
                try {
                    Double num = Double.parseDouble(Linea);
                    numsList.add(num);
                } catch (NumberFormatException e) {
                    System.out.println("Error");
                }
            }
            System.out.println("Nº leidos: ");
            for (Double num : numsList) {
                System.out.println(num);
            }
        } catch (Exception e) {
            System.out.println("Error");
        }
    }
}

