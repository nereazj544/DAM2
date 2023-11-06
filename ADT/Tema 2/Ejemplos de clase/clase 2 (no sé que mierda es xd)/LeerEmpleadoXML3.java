package adt_ejemplo.XML;

import java.io.File;

import javax.swing.text.html.parser.Element;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class LeerEmpleadoXML3 {
    public static void main(String[] args) {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

        try {
            //Leer el fichero           
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.parse("src\\adt_ejemplo\\XML\\empleados.xml");
            
            // Elima nodos vacios y combina adyacentes en caso de que los hubiera
            document.getDocumentElement().normalize();


            System.out.printf("Elemento raiz %s %n", document.getDocumentElement().getNodeName());
            
            NodeList empleados = document.getElementsByTagName("empleado");
            System.out.printf("Nodos empleado a recorrer: %d %n", empleados.getLength());

            //se recorre la lista

            for (int i = 0; i < empleados.getLength(); i++) {
                Node emple = empleados.item(i);
                if (emple.getNodeType() == Node.ELEMENT_NODE) {
                    Element elemento = (Element) emple;

                    //hijos
                    if (elemento.hasChildNodes()) {
                        NodeList nl = emple.getChildNodes();

                        for (int j = 0; j < nl.getLength(); j++) {
                            Node nd = nl.item(j);
                            System.out.println(nd.getTextContent());
                        }
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Error");
        }

    }
}
