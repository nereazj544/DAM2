package PROGRAMACION.ejercicospsudocodigo;

import java.util.Random;
import java.util.Scanner;

/*
 * Realizar un juego para adivinar un número. Para ello pedir un número N que será
introducido por un usuario. A continuación se irán pidiendo números que introducirá
otro usuario diferente, indicando “no llegas” o “te pasas” según sean mayores o
menores con respecto a N. El proceso termina cuando el usuario acierta con el
mensaje “has acertado”.
 */
public class ejercico9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numerose = 113;
        int numuser;
        System.out.println("Adivina el numero aleatorio. (Eneter) ");
        String enter = sc.nextLine();

        boolean adivinar = false;

        while (!adivinar){
            System.out.println("Numero: ");
            numuser = sc.nextInt();
            if (numuser == numerose) {
                System.out.println("Acertaste el numero: " + numerose);
                adivinar = true;
            } else if (numerose > numuser) {
                System.out.print("el " + numuser + " estas muy lejos \n");
            } else {
                System.out.print("el " + numuser + " te acercas \n");
                
            }
        }
    }

}
