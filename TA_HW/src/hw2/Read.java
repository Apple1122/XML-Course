package hw2;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class Read {

	public static void main(String[] args)
	{
		String filePath = "student.xml";
		
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
