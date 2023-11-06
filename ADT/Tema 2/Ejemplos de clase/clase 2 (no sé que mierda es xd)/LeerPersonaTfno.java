package adt_ejemplo.XML.PersonaXML;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;


public class LeerPersonaTfno {
    public static void main(String[] args) throws ParserConfigurationException, SAXException{
        String ruta = "src\\adt_ejemplo\\XML\\arxml\\";

        if (args.length !=1) {
            System.out.println("Debe haber un parrametro (fichero)");
        } else{
            String fichString = ruta + args[0];
            System.out.println("Analizando: "+ fichString + "\n");
            try {
                SAXParserFactory sFactory = SAXParserFactory.newInstance();
                SAXParser parse = sFactory.newSAXParser();

                XMLReader xmlparse = parse.getXMLReader();
                xmlparse.setContentHandler(new PersonaTfnoHandler());   
                xmlparse.parse(new InputSource(fichString));

            } catch (IOException e) {
                System.out.println(e);
            } catch(SAXException e){
                System.out.println(e);
            }
        }
    }
        
}
