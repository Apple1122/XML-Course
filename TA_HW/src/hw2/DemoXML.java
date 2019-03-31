package hw2;

import java.io.FileWriter;
import java.io.IOException;
import java.io.StringWriter;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamWriter;

import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;
import org.xml.sax.Attributes;

public class DemoXML {

	public static void main(String[] args) {
		createXML();
		readXMLFile("student.xml");
		
	}
	
	public static void createXML()
	{
		StringWriter stringWriter = new StringWriter();
		XMLOutputFactory xMLOutputFactory = XMLOutputFactory.newInstance();
		try {
			XMLStreamWriter xMLStreamWriter = xMLOutputFactory.createXMLStreamWriter(stringWriter);
			
			xMLStreamWriter.writeStartDocument();
			xMLStreamWriter.writeStartElement("people");
			
			xMLStreamWriter.writeStartElement("student");
			xMLStreamWriter.writeAttribute("id", "1");
			xMLStreamWriter.writeCharacters("peter");
			xMLStreamWriter.writeEndElement();
			
			xMLStreamWriter.writeStartElement("student");
			xMLStreamWriter.writeAttribute("id", "2");
			xMLStreamWriter.writeCharacters("john");
			xMLStreamWriter.writeEndElement();
			
			xMLStreamWriter.writeEndDocument();
			
			xMLStreamWriter.close();
			
			String xmlString = stringWriter.getBuffer().toString();
			FileWriter out = new FileWriter("student.xml");
			out.write(xmlString);
			out.close();
			
			stringWriter.close();
			
			
		} catch (XMLStreamException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	public static void readXMLFile(String filePath)
	{
		SAXParserFactory factory = SAXParserFactory.newInstance();
		
		try {
			SAXParser saxParser = factory.newSAXParser();
			
			DefaultHandler handler = new DefaultHandler() 
			{
				public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException 
				{
					String id = attributes.getValue("id");

					System.out.println("Start Element: " + qName);

					if (id != null)
						System.out.println("ID: " + id);
				}

				public void characters(char ch[], int start, int length) throws SAXException 
				{
					System.out.println("Name: " + new String(ch, start, length));
				}

				public void endElement(String uri, String localName, String qName) throws SAXException 
				{

					System.out.println("End Element :" + qName);

				}
			};
					
			saxParser.parse(filePath, handler);
			
			
			
		} catch (ParserConfigurationException | SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
