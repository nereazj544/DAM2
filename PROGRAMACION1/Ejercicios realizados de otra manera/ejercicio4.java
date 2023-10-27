package PROGRAMACION.denuevo;

import java.util.Scanner;

/*
 * Pedir un número N, y mostrar todos los números del 1 al N.
 */

public class ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero (se mostrara del 1 a tu nº): ");
        int N = sc.nextInt();

        if (N <= 0) {
            System.out.println(".");
        } else {

            for (int i = 1; i < N; i++) {
                System.out.println(i);
            }
        }
        sc.close();
    }
}
