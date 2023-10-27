package PROGRAMACION.denuevo;

import java.util.Scanner;

/**
 * ejercico2
 * Pedir números hasta que se teclee un 0, mostrar la suma, el producto y la media de
todos los números introducidos.
 */

public class ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        
        int suma = 0;
        int multiplicacion = 1;
        int cantidadnum = 0;
        do {
            System.out.println("Introducce nº, para cacular introducce cero");
            numero = sc.nextInt();
            sc.close();

            if (numero != 0) {
                suma += numero;
                multiplicacion *= numero;
                cantidadnum++;

            }
        } while (numero != 0);

        System.out.println("Suma: " + suma);
        System.out.println("Multiplicación: " + multiplicacion);

        if (cantidadnum == 0) {
            System.out.println(".");
        } else {
            double media = suma / cantidadnum;
            System.out.println("Media de los numeros: " + media);
        }
        
    }
}
