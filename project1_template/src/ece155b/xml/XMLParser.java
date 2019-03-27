package ece155b.xml;

import ece155b.data.Doctor;
import ece155b.data.Note;
import ece155b.data.Patient;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.*;
import org.xml.sax.helpers.*;

public class XMLParser extends DefaultHandler {
    public Doctor doctor;
    private Patient patient;
    private Note note;
    
    private StringBuffer accumulator = new StringBuffer();
    
    public XMLParser() {
        doctor = new Doctor();
    }
    public void characters(char[] buffer, int start, int length) {
        accumulator.append(buffer, start, length);
    }
    
    // - - - - - - - - - - - - - - - - - - - - -
    //	Each time a new tag is opened,
    //		this method is called
    public void startElement(String uri,String lname, String name, Attributes attributes) {
        if(name.equalsIgnoreCase("Patient"))
        {
            patient = new Patient();
            doctor.addPatient(patient);
        }
        if(name.equalsIgnoreCase("Note"))
        {
            note = new Note();
            patient.addNote(note);
        }
        // - - - - - - - - - - - - - - - - - - - - -
        // Reset accumulator
        accumulator.setLength(0);
    }
    
    public void endElement(String uri,String lname,String name) {
        String value = accumulator.toString();
        // - - - - - - - - - - - - - - - - - - - - -
        
        // TAGS about Doctor
        if(name.equalsIgnoreCase("DoctorName"))
            doctor.name = value;
        else if(name.equalsIgnoreCase("DoctorLastName"))
            doctor.lastname = value;

        //add more if-statements to parse TAGS about Patiens here...

        //add more if-statements to parse TAGS about Notes here...
        
        else
            System.out.println("Tag ignored: "+name);
    }
}