package Tema1.Clase.Persona;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Tu edad:");
		Persona p = new Persona();
		Scanner sc = new Scanner(System.in);
		int edad = sc.nextInt();
        p.escribeEdad(edad);
	}
}
