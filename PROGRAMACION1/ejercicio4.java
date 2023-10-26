package PROGRAMACION.ejercicospsudocodigo;

import java.util.Scanner;

/*
 * Pedir un número N, y mostrar todos los números del 1 al N.
 */

public class ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int N = sc.nextInt();

        if (N <= 0) {
            System.out.println("es cero :P");
        } else{
            System.out.println("Nº del 1 al " + N + ":");
            for (int i = 1; i < N; i++) {
                //Si en el int i = ¿?; se deja a cero empezara por el cero
                System.out.println(i);
            }
        }
    }

}
