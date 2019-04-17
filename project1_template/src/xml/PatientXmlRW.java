package xml;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamWriter;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import data.Patient;


/**
 *
 * @author Kyle
 */
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
				private String gender;
				private String disease;
				private int doctorId;
				private String medicalRecord;
				private String note;
				
				private boolean nameTime = false;
				private boolean lastNameTime = false;
				private boolean idTime = false;
				private boolean genderTime = false;
				private boolean diseaseTime = false;
				private boolean doctorIdTime = false;
				private boolean medicalRecordTime = false;
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
					
					else if(qName.equals("disease"))
						diseaseTime = true;
					
					else if(qName.equals("doctorId"))
						doctorIdTime = true;
					
					else if(qName.equals("gender"))
						genderTime = true;
					
					else if(qName.equals("medicalrecords"))
						medicalRecordTime = true;
					
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
					
					else if(genderTime)
					{
						gender = new String(ch, start, length);
						genderTime = false;
					}
					
					else if(diseaseTime)
					{
						disease = new String(ch, start, length);
						diseaseTime = false;
					}
					
					else if(doctorIdTime)
					{
						doctorId = Integer.parseInt(new String(ch, start, length));
						doctorIdTime = false;
					}
					else if(medicalRecordTime)
					{
						medicalRecord = new String(ch, start, length);
						medicalRecordTime = false;
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
						patients.add(new Patient(name, lastName, id, doctorId, gender, disease, medicalRecord, note));
						
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
					
					xMLStreamWriter.writeStartElement("gender");
					xMLStreamWriter.writeCharacters(p.getGender());
					xMLStreamWriter.writeEndElement();
					
					xMLStreamWriter.writeStartElement("disease");
					xMLStreamWriter.writeCharacters(p.getDisease());
					xMLStreamWriter.writeEndElement();
					
					xMLStreamWriter.writeStartElement("doctorId");
					xMLStreamWriter.writeCharacters("" + p.getDoctorId());
					xMLStreamWriter.writeEndElement();
					
					
					xMLStreamWriter.writeStartElement("medicalrecords");
					xMLStreamWriter.writeCharacters(p.getMedicalRecord());
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
    
    /*
     * https://www.mkyong.com/java/how-to-modify-xml-file-in-java-dom-parser/
     * modifyXMLFile
     */
//    public void modifyXMLFile(List<Patient> patients, int doctorId)
//    {
//    	try {
//    		String filePath = "Patients.xml";
//    		DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
//    		DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
//    		Document doc = docBuilder.parse(filePath);
//
//    		// Get the root element
//    		Node Patients = doc.getFirstChild();
//
//    		// Get the staff element , it may not working if tag has spaces, or
//    		// whatever weird characters in front...it's better to use
//    		// getElementsByTagName() to get it directly.
//    		// Node staff = company.getFirstChild();
//
//    		// Get the staff element by tag name directly
//   
//
//    		// update staff attribute
//    		NamedNodeMap attr = staff.getAttributes();
//    		Node nodeAttr = attr.getNamedItem("id");
//    		nodeAttr.setTextContent("2");
//
//    		// append a new node to staff
//    		Element age = doc.createElement("age");
//    		age.appendChild(doc.createTextNode("28"));
//    		staff.appendChild(age);
//
//    		// loop the staff child node
//    		NodeList list = staff.getChildNodes();
//
//    		for (int i = 0; i < list.getLength(); i++) {
//    			
//                       Node node = list.item(i);
//
//    		   // get the salary element, and update the value
//    		   if ("salary".equals(node.getNodeName())) {
//    			node.setTextContent("2000000");
//    		   }
//
//                       //remove firstname
//    		   if ("firstname".equals(node.getNodeName())) {
//    			staff.removeChild(node);
//    		   }
//
//    		}
//
//    		// write the content into xml file
//    		TransformerFactory transformerFactory = TransformerFactory.newInstance();
//    		Transformer transformer = transformerFactory.newTransformer();
//    		DOMSource source = new DOMSource(doc);
//    		
//    		transformer.transform(source, result);
//
//    		System.out.println("Done");
//
//    	   } catch (ParserConfigurationException pce) {
//    		pce.printStackTrace();
//    	   } catch (TransformerException tfe) {
//    		tfe.printStackTrace();
//    	   } catch (IOException ioe) {
//    		ioe.printStackTrace();
//    	   } catch (SAXException sae) {
//    		sae.printStackTrace();
//    	   }
//    	
//    }


}
