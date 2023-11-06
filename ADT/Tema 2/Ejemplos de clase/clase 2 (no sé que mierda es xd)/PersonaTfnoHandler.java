package adt_ejemplo.XML.PersonaXML;


import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

// import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.Locator;
// import org.xml.sax.SAXException;

public class PersonaTfnoHandler extends DefaultHandler{
    private StringBuilder value;
    public PersonaTfnoHandler(){
        this.value= new StringBuilder();
    }
    @Override
    public void startDocument(){
        System.out.println("Comienzo del XML");
    }

    @Override
    public void endDocument(){
        System.out.println("final del XML");
    }

    @Override
    public void startElement(String uri, String LocalName, String qName, Attributes attributes) throws SAXException{
        this.value.setLength(0);
        if(qName.equals("persona")){
            String tfno = attributes.getValue("telefono");
            System.out.println("Atributo telefono" + tfno);
        }
        }
    }


    @Override
    public void characters(char [] cr, int start, int length) throws SAXException{
        this.value.append(cr, start, length);
        
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException{
    switch (qName) {
        case "persona":
            System.out.println("");
            break;
        case "nombre":
        System.out.println("Nombre: " + this.value.toString());
        case "edad":
        System.out.println("edad: " + this.value.toString());
            break;
    }
    }
}
