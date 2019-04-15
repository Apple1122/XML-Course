package xml;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import javax.xml.parsers.*;
import javax.xml.stream.*;
import org.xml.sax.*;
import org.xml.sax.helpers.*;

import data.Doctor;
import data.Patient;

/**
 *
 * @author Kyle
 */
public class DoctorXmlRW {

    private SAXParserFactory saxParserFactory;
    private SAXParser saxParser;
    private StringWriter stringWriter;
    private XMLOutputFactory xmlOutputFactory;

    private String str;
    private ArrayList<Doctor> doctors;
    private SimpleDateFormat formatter = new SimpleDateFormat("E, MMM dd yyyy");  

    public DoctorXmlRW() {
        doctors = new ArrayList<>();   
        
    }
    
    public ArrayList<Doctor> read(){
    	
    	String filePath = "Doctors.xml";

    	
    	saxParserFactory = SAXParserFactory.newInstance();
        
        try {
			 saxParser = saxParserFactory.newSAXParser();

			DefaultHandler handler = new DefaultHandler() 
			{
				private String name;
				private String lastName;
				private int id;
				private String subject;
				private String gender;
				private Date lastLoginTime;
				
				
				private boolean nameTime = false;
				private boolean lastNameTime = false;
				private boolean genderTime = false;
				private boolean subjectTime = false;
				private boolean loginTime = false;
				
				public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException 
				{
					
					if(qName.equals("doctor"))
						id = Integer.parseInt(attributes.getValue("id"));
					
					else if(qName.equals("name"))
						nameTime = true;
			
					else if(qName.equals("lastname"))
						lastNameTime = true;
					

					else if(qName.equals("gender"))
						genderTime = true;
					
					else if(qName.equals("subject"))
						subjectTime = true;
					
					else if(qName.equals("lastLoginTime"))
						loginTime = true;

					
				}

				public void characters(char ch[], int start, int length) throws SAXException 
				{			
	
					if(nameTime)
					{
						name = new String(ch, start, length);
						nameTime = false;
					}
					
					else if(lastNameTime)
					{
						lastName = new String(ch, start, length);
						lastNameTime = false;
					}
					
					else if(genderTime)
					{
						gender = new String(ch, start, length);
						genderTime = false;
					}
					
					else if(subjectTime)
					{
						subject = new String(ch, start, length);
						subjectTime = false;
					}
					
					else if(loginTime)
					{
						try {
							lastLoginTime = formatter.parse(new String(ch, start, length));
						} catch (ParseException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						loginTime = false;
					}
				}

				public void endElement(String uri, String localName, String qName) throws SAXException 
				{
					if(qName.equals("doctor"))
						doctors.add(new Doctor(name, lastName, id, subject, gender, lastLoginTime));
				}
			};
			
			saxParser.parse(filePath, handler);
	
			
		} catch (ParserConfigurationException | SAXException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	
    	
        return doctors;
    }
    
    public void write(List<Doctor> list){
        
    	
    	 stringWriter = new StringWriter();
    	 xmlOutputFactory = XMLOutputFactory.newInstance();
		
		try {
			XMLStreamWriter xMLStreamWriter = xmlOutputFactory.createXMLStreamWriter(stringWriter);
			
			xMLStreamWriter.writeStartDocument();
			xMLStreamWriter.writeStartElement("Doctors");
			
			int count = 1;
			for(Doctor d : list)
			{
				xMLStreamWriter.writeStartElement("Doctor");
				
				xMLStreamWriter.writeAttribute("id", "" + count++);
				
				xMLStreamWriter.writeStartElement("name");
				xMLStreamWriter.writeCharacters(d.getName());
				xMLStreamWriter.writeEndElement();
				
				xMLStreamWriter.writeStartElement("lastname");
				xMLStreamWriter.writeCharacters(d.getLastName());
				xMLStreamWriter.writeEndElement();
				
				xMLStreamWriter.writeStartElement("gender");
				xMLStreamWriter.writeCharacters(d.getGender());
				xMLStreamWriter.writeEndElement();
				
				xMLStreamWriter.writeStartElement("subject");
				xMLStreamWriter.writeCharacters(d.getSubject());
				xMLStreamWriter.writeEndElement();
				
				xMLStreamWriter.writeStartElement("lastLoginTime");
				xMLStreamWriter.writeCharacters(formatter.format(d.getLastLoginTime()));
				xMLStreamWriter.writeEndElement();
				
				xMLStreamWriter.writeEndElement();
			}
			
			xMLStreamWriter.writeEndDocument();
			
			xMLStreamWriter.close();
			
			
			String xmlString = stringWriter.getBuffer().toString();
			FileWriter out = new FileWriter("Doctors.xml");
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
