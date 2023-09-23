package Tema1.Actividades.T2.ejercicio12;

import java.io.IOException;
import java.util.Scanner;

public class AgendaA {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        Agenda agenda = new Agenda();
        agenda.CargarCont();


        while (true) {
            System.out.println("Agenda: ");
            System.out.println("1. Añadir");
            System.out.println("2. Buscar");
            System.out.println("3. Mostar (todos)");
            System.out.println("4. salir y guaradr");
            System.out.println("Seleccionar opcion: ");
        
            int opcion = sc.nextInt();
            sc.nextLine();
        
            switch (opcion) {

                //Agregar 
                case 1:
                    System.out.println("Agregar contacto, nombre: ");
                    String nombre = sc.nextLine();
                    System.out.println("DNI: ");
                    String dni = sc.nextLine();
                    System.out.println("Telefono: ");
                    String telefono = sc.nextLine();
                    agenda.agregarCon(nombre, dni, telefono);                    
                    break;
                
                case 2:
                    System.out.println("Buscar nombre");
                    String buscar = sc.nextLine();
                    agenda.Lupa(buscar);                
                    break;          
                
                case 3:
                    agenda.mostrarCont();
                break;

                case 4:
                    agenda.guardar();
                    System.exit(0);
                break;



                default:
                    System.out.println("Error");
            }    
        }
    }
}
