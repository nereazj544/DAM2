package Tema1.Actividades.T2.ejercicio12;

/*
 * 12. Diseñar un programa que cree una agenda que se escriba como un fichero de texto, 
 * y que contenga contactos con nombre, DNI y teléfono. La agenda podrá añadir un nuevo contacto
 * comprobando que no está ya en la agenda y que no esté llena-, buscar por nombre – 
 * o por cadena de texto introducida por teclado - , mostrar todos y salir guardando los datos en un archivo de texto. 
 * La agenda al iniciarse leerá el fichero de texto para comprobar si hay contactosy los cargará.
 */

class Contacto {
    private String nombre;
    private String DNI;
    private String Tfno;

    public Contacto(String nombre, String DNI, String Tfno){
        this.nombre = nombre; 
        this.DNI = DNI; 
        this.Tfno = Tfno;
    }
    
    public String getNombre(){
        return nombre;
    }
    public String getDNI(){
        return DNI;
    }
    public String getTelfno(){
        return Tfno;
    }

    @Override
    public String toString(){
        return "Nombre" + nombre + "DNI" +  DNI + "Telfno" + Tfno;
    }

}
