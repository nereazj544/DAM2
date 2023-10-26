package PROGRAMACION.ejercicospsudocodigo;
/*
 * Pedir números y por cada uno que se introduzca decir si es positivo o negativo y si es
par o impar. Finalizar cuando el número introducido sea cero.
 */

import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        
        do {
            System.out.println("Ingrese un numero (positivo o negativo; para salir 0): ");
            num = sc.nextInt();    
            if(num == 0){
                System.out.println("finaliza");
                System.out.println("tu numero " + num + " es cero");
            }else{
                posneg(num);
            }
        } while (num != 0);
    
    }

    public static void posneg(int num) {
        if (num > 0) {
            System.out.println("tu numero " + num + " es positivo");
        } else if(num < 0){
            System.out.println("tu numero " + num + " es negativo");
        } else{
            return;
        }

        if (num % 2 == 0){
            System.out.println("tu numero " + num + " es par");
        } else{
            System.out.println("tu numero " + num + " es impar");
            
        }
    }
}
