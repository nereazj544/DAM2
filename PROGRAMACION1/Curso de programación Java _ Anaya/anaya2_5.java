package PROGRAMACION.java.LibroAnaya;

import java.util.Scanner;

/*
 * Anaya - Ejercicio 2.5
 * Calcula el área de un rectangulo con un metodo: Escribe un programa que calcule el área de un rectángulo e imprima por pantalla el texto: ""El rectángulo de " " por " "tiene un área de: " ". 
 * Recibira el tamaño de los dos lados por teclado.
 */

public class anaya2_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Lado uno: ");
        int lado1 = sc.nextInt();
        System.out.println("Lado dos: ");
        int lado2 = sc.nextInt();
        int areaRec = resultado(lado1, lado2);
        sc.close();

        System.out.println("El rectángulo de " + lado1 + " por " + lado2 + " tiene un área de: " + areaRec);
    }

    public static int resultado(int area, int base) {
        return area * base;
    }
}
