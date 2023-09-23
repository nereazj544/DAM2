package Tema1.Clase.Persona;


public class Persona {

		private int edad;
		public void escribeEdad(int edadnueva) throws Exception {
			if (edadnueva < 0 || edadnueva > 100) {
				throw new ExcepcionEdad("error");
			}
			edad = edadnueva;
		}
		public class ExcepcionEdad extends Exception {
			public ExcepcionEdad(String mensaje) {
				super(mensaje);
			}
		}
}
