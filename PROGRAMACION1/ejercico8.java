package PROGRAMACION.ejercicospsudocodigo;

import java.util.Scanner;

/*
 * 8. Pedir un número entero, calcular el número de dígitos que tiene y visualizarlo.
 */


public class ejercico8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int cont = 1;
        while (num > 0) {
            num = num / 100;
            cont++;
        }
        System.out.println("digitos del numero: " + cont);

    }
}
