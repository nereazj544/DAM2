package PROGRAMACION.denuevo;

import java.util.Scanner;

/*
 * Pedir números y por cada uno que se introduzca decir si es positivo o negativo y si es
par o impar. Finalizar cuando el número introducido sea cero.
 */

public class ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        
        do {
            System.out.println("Introducce un numero: (para salir 0)");
            number = sc.nextInt();
            sc.close();
            if (number == 0) {
                System.out.println("Tu numero es: " + number + " por lo que ha finalizado");
            } else{
                if (number > 0) {
                    System.out.println("Tu numero es: " + number + " es postivo");
                    
                }else if (number < 0) {
                    System.out.println("Tu numero es: " + number + " es negativo");
                }
                if (number % 2 == 0) {
                    System.out.println("Tu numero es: " + number + " es par");
                }else {
                    System.out.println("Tu numero es: " + number + " es impar");
                }
            }
        } while (number != 0);
    }

    
}
