package Tema1.Clase.Ejemplos1;

import java.util.Scanner;

public class exceptiones1 {
    public static void main(String[] args) throws Exception {
        int a; int b; int res;

        Scanner sc = new Scanner(System.in);
        System.out.println("Valos de 'A':");
        a = sc.nextInt();

        if (a==13) try {
            throw new Exception("Nº 13 prohibido");
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
            return;
        }
        System.out.println("Valor B: ");
        b = sc.nextInt();
        if (b == 13) {
            throw new Exception("nº 13 no");
        }
        res = a*b;
        System.out.println(res);
    }
    

}
