package adt_ejemplo;


import java.io.File;

import org.w3c.dom.*;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

public class leerAtributoXML {
    public static void main(String[] args) {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        try {
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.parse(new File("src\\adt_ejemplo\\empleados.xml"));
            document.getDocumentElement().normalize();

            NodeList empleados = document.getElementsByTagName("empleado");
            System.out.printf("Elemento raíz: %s %n", empleados.getLength());

            for (int i = 0; i < empleados.getLength(); i++) {
                Node empleado = empleados.item(i);
                if (empleado.getNodeType() == Node.ELEMENT_NODE) {
                    Element element = (Element) empleado;
                    System.out.printf("ID = %s %n", element.getAttribute("id"));
                    //arriba chuta la victoria es tuyo INAZUMA CAMPEÓN
                    System.out.printf("* Apellido = %s %n", element.getElementsByTagName("apellido").item(0).getTextContent());
                    System.out.printf("* dep = %s %n", element.getElementsByTagName("dep").item(0).getTextContent());
                    System.out.printf("* salario = %s %n", element.getElementsByTagName("salario").item(0).getTextContent());
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
