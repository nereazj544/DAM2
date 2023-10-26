package PROGRAMACION.ejercicospsudocodigo;

import java.util.Scanner;
/*
Pedir 10 números y mostrar la media de los números positivos, la media de los
números negativos y la cantidad de ceros.
*/
public class ejercico3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;

        int suman = 0;
        int sumap = 0;
        int ceros = 0;
        int contn =0;
        int contp =0;

        for (int i = 0; i <= 4; i++) {
            System.out.println("ingrsa 5 numeros");
            numero = sc.nextInt();
            if (numero > 0) {
                sumap += numero;
                contp++;
            } else if (numero < 0) {
                suman -= numero;
                contn++;
            } else{
                ceros++;
            }
        }
        if (contp > 0) {
            double mediapos = sumap / contp;
        System.out.println("media positivos: " + mediapos);        
    } 
    if(contn > 0){
        double meidaneg = suman / contn;
        System.out.println("media negativos: " + meidaneg);        
        }
        
        System.out.println("Suma(nº positivos): " + sumap);
        System.out.println("Suma(nº negativos): " + suman);
        System.out.println("cantidad de ceros: " + ceros);
    }
}
