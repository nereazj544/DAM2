package adt_ejemplo.XML;

import java.io.FileNotFoundException;
import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.ContentHandler;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;
import org.xml.sax.XMLReader;

public class EjemploSAX {
    public static void main(String[] args) throws FileNotFoundException, IOException, SAXException, ParserConfigurationException{
        String ruta = "src\\adt_ejemplo\\XML\\arxml\\alumnos.xml";
        SAXParserFactory factory = SAXParserFactory.newInstance();
        factory.setNamespaceAware(true);
        SAXParser parser = factory.newSAXParser();
        XMLReader procesXmlReader = parser.getXMLReader();
        GestionContenido gestor = new GestionContenido();
        procesXmlReader.setContentHandler((ContentHandler) gestor);
        InputSource file = new InputSource(ruta + "alumnos.xml");
        procesXmlReader.parse(file);        
    }
}
