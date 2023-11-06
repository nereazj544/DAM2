package adt_ejemplo;

import org.w3c.dom.*;
import javax.xml.parsers.*;
import javax.xml.transform.*;
import javax.xml.transform.dom.*;
import javax.xml.transform.stream.*;
import java.io.*;

public class xml {
	public static void main(String[] args) throws IOException {
		File fichero = new File("src\\adt_ejemplo\\file.dat");
		RandomAccessFile file = new RandomAccessFile(fichero, "r");

		int id, dep, posicion = 0;
		Double salario;
		char[] apellido = new char[10];
		char aux;

		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		{
			// Creamos una instancia de DocumentBuilderFactory para crear el parser. Entre

			try {
				DocumentBuilder builder = factory.newDocumentBuilder();
				DOMImplementation implementation = builder.getDOMImplementation();
				Document document = implementation.createDocument(null, "Empleados", null);
				document.setXmlVersion("1.0");

				while (true) {
					file.seek(posicion);
					id = file.readInt();
					for (int i = 0; i < apellido.length; i++) {
						aux = file.readChar();
						apellido[i] = aux;
					}
					String apellidos = new String(apellido);
					dep = file.readInt();
					salario = file.readDouble();

					if (id > 0) {
						Element raiz = document.createElement("empleado");
						document.getDocumentElement().appendChild(raiz);
						CrearElemento("id", Integer.toString(id), raiz, document); // añadir ID
						CrearElemento("apellido", apellidos.trim(), raiz, document); // añadir APELLIDO
						CrearElemento("dep", Integer.toString(dep), raiz, document);// añadir DEP
						CrearElemento("salario", Double.toString(salario), raiz, document); // añadir SALARIO
					}
					posicion = posicion + 36;
					if (file.getFilePointer() == file.length())
						break;

				}
				// Crear la fuente XML a partir del documento
				Source source = new DOMSource(document);
				// Crear el resultado en e fichero Empleados.xml
				Result result = new StreamResult(new java.io.File("Empleados.xml"));
				// Se obtiene un TransformerFactory
				Transformer transformer = TransformerFactory.newInstance().newTransformer();
				// Se realiza la transformacion del documento al fichero
				transformer.transform(source, result);

			} catch (Exception e) {
				System.err.println("Eroro" + e);
			}
			file.close();
		}
	}

	static void CrearElemento(String datoEmple, String valor, Element raiz, Document document) {
		Element elem = document.createElement(datoEmple);
		Text text = document.createTextNode(valor);
		raiz.appendChild(elem);
		elem.appendChild(text);

	}

}