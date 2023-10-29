package PROGRAMACION.java.LibroAnaya;

import java.util.Scanner;

/*
 * Anaya - Ejercicio 2.3
 * Calcula el área de un rectangulo: Escribe un programa que calcule el área de un rectángulo e imprima por pantalla el texto: ""El rectángulo de " " por " "tiene un área de: " ". 
 * Recibira el tamaño de los dos lados por teclado.
 */



public class anaya2_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Lado uno: ");
        int lado1 = sc.nextInt();
        System.out.println("Lado dos: ");
        int lado2 = sc.nextInt();
        sc.close();
        int resultado = lado1 * lado2;


        System.out.println("El rectángulo de " + lado1 + " por " + lado2 + " tiene un área de: " + resultado);
    }
}
