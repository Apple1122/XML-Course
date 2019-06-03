package xml;

import java.io.FileWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamWriter;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import ece155b.patient.data.Patient;

public class PatientXmlRW {
	private SAXParserFactory saxParserFactory;
    private SAXParser saxParser;
    private StringWriter stringWriter;
    private XMLOutputFactory xmlOutputFactory;

    private String str;
    
//    // avoid to scan every element
//    private Map<Integer, ArrayList<Patient>> map;
    private ArrayList<Patient> patients;
    
 

    public PatientXmlRW() {
        patients = new ArrayList<Patient>();   
        
    }
    
//    public Map<Integer, ArrayList<Patient>> read()
    public ArrayList<Patient> read()
    {
    	
    	String filePath = "Patients.xml";

    	
    	saxParserFactory = SAXParserFactory.newInstance();
        
        try {
			 saxParser = saxParserFactory.newSAXParser();

			DefaultHandler handler = new DefaultHandler() 
			{
				
				private String name;
				private String lastName;
				private int id;
				private String sex;
				private String note;
				private boolean nameTime = false;
				private boolean lastNameTime = false;
				private boolean idTime = false;
				private boolean sexTime = false;
				private boolean noteTime = false;
				
				
				
				public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException 
				{
					if(qName.equals("name"))
					{
						id = Integer.parseInt(attributes.getValue("id"));
						nameTime = true;
					}
			
					else if(qName.equals("lastname"))
						lastNameTime = true;
					
					else if(qName.equals("sex"))
						sexTime = true;
					
					else if(qName.equals("note"))
						noteTime = true;
				
					
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
					
					else if(sexTime)
					{
						sex = new String(ch, start, length);
						sexTime = false;
					}
					
					
					
					else if(noteTime)
					{
						note = new String(ch, start, length);
						noteTime = false;
					}
					
				}

				public void endElement(String uri, String localName, String qName) throws SAXException 
				{

					if(qName.equals("patient")) 
					{
						patients.add(new Patient(name, lastName, id, id, sex, note, qName, qName));
						
//						if(map.containsKey(doctorId))
//							map.put(Integer.valueOf(doctorId), new ArrayList<Patient>());
//						map.get(Integer.valueOf(doctorId)).add(new Patient(name, lastName, id, doctorId, gender, disease, medicalRecord, notes));
					}

				}
			};
					
			saxParser.parse(filePath, handler);
	
			
		} catch (ParserConfigurationException | SAXException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	
    	
        return patients;
    }
    
    public void write(List<Patient> list){
        
    	
    	 	stringWriter = new StringWriter();
    	 	xmlOutputFactory = XMLOutputFactory.newInstance();
		
		try {
				XMLStreamWriter xMLStreamWriter = xmlOutputFactory.createXMLStreamWriter(stringWriter);
			
				xMLStreamWriter.writeStartDocument();
			
				xMLStreamWriter.writeStartElement("patients");
				
				int count = 1;
				for(Patient p : list)
				{
					xMLStreamWriter.writeStartElement("patient");
					
					xMLStreamWriter.writeStartElement("name");
					xMLStreamWriter.writeAttribute("id", "" + count++);
					xMLStreamWriter.writeCharacters(p.getName());
					xMLStreamWriter.writeEndElement();
					
					xMLStreamWriter.writeStartElement("lastname");
					xMLStreamWriter.writeCharacters(p.getLastName());
					xMLStreamWriter.writeEndElement();
					
					xMLStreamWriter.writeStartElement("sex");
					xMLStreamWriter.writeCharacters(p.getSex());
					xMLStreamWriter.writeEndElement();
					
					xMLStreamWriter.writeStartElement("note");
					xMLStreamWriter.writeCharacters(p.getNote());
					xMLStreamWriter.writeEndElement();
					
					xMLStreamWriter.writeEndElement();
				}
				
				xMLStreamWriter.writeEndDocument();
				
				xMLStreamWriter.close();
				
				
				String xmlString = stringWriter.getBuffer().toString();
				FileWriter out = new FileWriter("Patients.xml");
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
