package PROGRAMACION.ejercicospsudocodigo;

import java.util.Scanner;

/**
 * ejercico2
 * Pedir números hasta que se teclee un 0, mostrar la suma, el producto y la media de
todos los números introducidos.
 */
public class ejercico2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;

        int suma = 0;
        int producto = 1;
        int cantidad = 0;

        do {
            System.out.println("Ingrese un numero (0 para calcular): ");
            numero=sc.nextInt();

            if(numero != 0){
                suma += numero;
                producto *= numero;
                cantidad++;
            }

        } while (numero != 0);
        if (cantidad == 0) {
            System.out.println(".");
        } else {
            double media = suma / cantidad;
            System.out.println("suma: " + suma);
            System.out.println("producto: " + producto);
            System.out.println("media: " + media);
        }
    }
    
}