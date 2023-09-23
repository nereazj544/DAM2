package Tema1.Actividades.T2.ejercicio12;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/*
 * 12. Diseñar un programa que cree una agenda que se escriba como un fichero de texto, 
 * y que contenga contactos con nombre, DNI y teléfono. La agenda podrá añadir un nuevo contacto
 * comprobando que no está ya en la agenda y que no esté llena-, buscar por nombre – 
 * o por cadena de texto introducida por teclado - , mostrar todos y salir guardando los datos en un archivo de texto. 
 * La agenda al iniciarse leerá el fichero de texto para comprobar si hay contactosy los cargará.
 */

public class Agenda {

    private List<Contacto> contactos = new ArrayList<>();

    // CARGAR EL CONTACTO
    public void CargarCont() throws IOException {
        try (BufferedReader leer = new BufferedReader(new FileReader(
                "C:\\Users\\nzjha\\Desktop\\CLASE23-24\\ASIGNATURAS\\ADT\\eclipse\\ADT\\src\\Tema1\\Actividades\\T2\\ejercicio12\\agenda.txt"))) {
            String Linea;
            while ((Linea = leer.readLine()) != null) {
                String[] parte = Linea.split(",");
                if (parte.length == 3) {
                    contactos.add(new Contacto(parte[0].trim(), parte[1].trim(), parte[2].trim()));
                }
            }
        }

    }

    // AGREGAR EL CONTACTO
    public void agregarCon(String nombre, String DNI, String Tfno) {
        Contacto nuContacto = new Contacto(nombre, DNI, Tfno);
        // VERFICACION DE LA EXISTENCIA DEL CONTACTO
        if (!contactos.contains(nuContacto)) {
            contactos.add(nuContacto);
            System.out.println("Se agrego");
        } else {
            System.out.println("Ya existe");
        }

    }

    // BUSCAR EL CONTACTO
    public void Lupa(String buscar) {
        for (Contacto contacto : contactos) {
            if (contacto.getNombre().toLowerCase().contains(buscar.toLowerCase())) {
                System.out.println("Nombre: " + contacto.getNombre());
                System.out.println("DNI: " + contacto.getDNI());
                System.out.println("Teléfono: " + contacto.getTelfno());
                System.out.println();
            }
        }
    }

    // MOSTRAR EL CONTACTO
    public void mostrarCont() {
        for (Contacto contacto : contactos) {
            System.out.println("Nombre: " + contacto.getNombre());
            System.out.println("DNI: " + contacto.getDNI());
            System.out.println("Teléfono: " + contacto.getTelfno());
            System.out.println();
        }
    }

    // GUARDAR EL CONTACTO
    public void guardar() {
        try (BufferedWriter escribir = new BufferedWriter(new FileWriter(
                "C:\\Users\\nzjha\\Desktop\\CLASE23-24\\ASIGNATURAS\\ADT\\eclipse\\ADT\\src\\Tema1\\Actividades\\T2\\ejercicio12\\agenda.txt"))) {
            for (Contacto contacto : contactos) {
                escribir.write(contacto.getNombre() + ", " + contacto.getDNI() + ", " + contacto.getTelfno());
                escribir.newLine();
                // escribir.close();
            }
            System.out.println("Se ha guarado");
        } catch (Exception e) {
            System.out.println("Error");
        }
    }

}
