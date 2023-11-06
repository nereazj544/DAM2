package adt_ejemplo.XML;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class SinsaberformatoXML {
    public static void main(String[] args) {
        try {
            //se crea un analizador del doc xml
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();

            //analizamos el xml
            Document document = builder.parse("src\\adt_ejemplo\\XML\\empleados.xml");

            //Recorremos el doc y procesamos los nodos
            procesarNode(document.getDocumentElement());
        } catch (Exception e) {
            System.out.println("Error :)");
        }
    }

    public static void procesarNode(Node node){
        //Obteneemos el nombre
        String nombre = node.getNodeName();

        //si es una etiqueta
        if (node.getNodeType() == Node.ELEMENT_NODE) {
            System.out.println("Elemento: " + nombre);

            //si tiene elmentos

            if (node.hasAttributes()) {
                for (int i = 0; i < node.getAttributes().getLength(); i++) {
                    Node atri = node.getAttributes().item(i);
                    System.out.println("Atributo: " + atri.getNodeName() + " = " + atri.getNodeValue());
                }
            }
        } else if (node.getNodeType() == Node.TEXT_NODE) {
            //el nodo es texto
            String cont = node.getTextContent().trim();
            if (!cont.isEmpty()) {
                System.out.println("Contenido: " + cont);
            }
        }else{
            //los hijos
            NodeList hijos = node.getChildNodes();
            for (int i = 0; i < hijos.getLength(); i++) {
                procesarNode(hijos.item(i));
            }

        }

    }
}
