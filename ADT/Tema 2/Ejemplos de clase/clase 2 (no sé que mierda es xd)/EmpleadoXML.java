package adt_ejemplo.XML.empleado;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.ContentHandler;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;
import org.xml.sax.XMLReader;


public class EmpleadoXML {
    public static void main(String[] args) throws IOException, SAXException, ParserConfigurationException {
        String ruta = "src\\adt_ejemplo\\XML\\empleado\\Empleado.xml";
        SAXParserFactory factory = SAXParserFactory.newInstance();
        factory.setNamespaceAware(true);
        SAXParser parser = factory.newSAXParser();
        XMLReader reader = parser.getXMLReader();
        GestionContenidoEmpleado gestor = new GestionContenidoEmpleado();
        reader.setContentHandler((ContentHandler) gestor);
        InputSource file = new InputSource(ruta);
        reader.parse(file);
    }
}
