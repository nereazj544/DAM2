package adt_ejemplo.XML.empleado;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;


public class GestionContenidoEmpleado extends DefaultHandler {

    public GestionContenidoEmpleado() {
		super();
	}
	
	public void startDocument() {
		System.out.println("Cominezo del documento xml");
	}
	public void endDocument() {
		System.out.println("fianl xml");
	}
	public void startElement(String uri,String nombre,String nombreC,Attributes atts) {
		System.out.printf("\t Principio elemento: %s %n",nombre);
	}
	public void endElement(String uri,String nombre,String nombreC) {
		System.out.printf("Fin elemento: %s %n", nombre);
	}
	public void characters(char[] ch,int inicio, int longitud) throws SAXException{
		String car = new String(ch, inicio, longitud);
		car = car.replaceAll("[\t\n]", "");
	}

}
