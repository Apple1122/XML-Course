package hw3;

import java.io.FileWriter;
import java.io.IOException;
import java.io.StringWriter;

import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamWriter;

public class Write {

	public static void main(String[] args)
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
}