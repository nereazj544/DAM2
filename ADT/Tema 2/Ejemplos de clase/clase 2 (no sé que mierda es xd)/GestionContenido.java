package adt_ejemplo.XML;


import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class GestionContenido extends DefaultHandler {

    public GestionContenido(){
        super();
    }

    public void sartDocument(){
        System.out.println("Documento XML");
    }

    public void startElement(String url, String nombre, String nombreC, Attributes atts){
        System.out.printf("\tFin elemento: %s %n", nombre);
    }

    public void characters(char[] ch, int inicio, int longitud) throws SAXException{
        String car = new String(ch, inicio, longitud);
        car = car.replaceAll("[\t\n]", "");
        System.out.printf("\t Caracteres: %s %n", car);
    }

}
