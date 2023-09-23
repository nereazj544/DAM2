package Tema1.Clase.Ejemplos1;
import java.io.File;

public class ej3 {

	public static void main(String[] args) {
		File fichero = new File(".\\prueba\\datos.txt");
		if (fichero.delete()) {
			System.out.println("Fichero eliminado");
		} else {
			System.out.print("Fichero no eliminado. ");
			if (!fichero.exists())
				System.out.println("Razón : fichero no existe.");
			else
				System.out.println("Razón desconocida. ");
		}
		File directorio = new File(".\\maniobra");
		if (directorio.delete()) {
			System.out.println("Directorio eliminado");
		} else {
			System.out.print("Directorio no eliminado. ");
			if (!directorio.exists())
				System.out.println("Razon: dir no existe");
			else
				System.out.println("Razón desconocida. ");
		}
	}
}