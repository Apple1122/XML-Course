package ece155b.test;


import ece155b.data.Doctor;
import ece155b.xml.XMLParser;
import java.io.*;
import javax.xml.parsers.*;

public class DemoXML {
    
    public static void main(String [] args) {
        new DemoXML(args);
    }
    
    public DemoXML(String [] args) {
        String fileurl = args[0];
        Doctor doc = new Doctor();
        doc.name        = "NameofDoc";
        doc.lastname    = "LastNameOfDoc";
        System.out.println(doc);
        doc.name        = "NameChanged";
        System.out.println("Before: " + readXmlFile(fileurl));
        toXmlFile(doc, fileurl);
        System.out.println("After: " + readXmlFile(fileurl));
        
        /**
         * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
         * Add patients with notes and see if you can write and 
         * read in XML format.. Having passed this part, try to read/write
         * patient information.
         * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
         
         Patient patient = new Patient();
         patient.name = "pName";
         // etc.
         Note note = new Note();
         note.date = "Jan 10, 2006";
         // etc..
         patient.addNote(note);
         
         doc.addPatient(patient);
         
         System.out.println(doc);
         toXmlFile(doc, fileurl);
         // First write to xml file, and see if you are done.
         // If you see patient information in xml file, try to read it
         // System.out.println(readXmlFile(fileurl));
         
         // Now you can continue with GUI
         **/
    }
    
    public void toXmlFile(Doctor doc, String url) {
        try {
            File xmlfile = new File(url);
            BufferedWriter br = new BufferedWriter(new FileWriter(xmlfile));
            br.write("<?xml version='1.0' ?>");
            br.write(doc.toXML());
            br.close();
            
            System.out.println("File written "+xmlfile.getAbsolutePath());
        } catch (Exception ex) {
            System.out.println("Exception:"+ex);
        }
    }
    
    public Doctor readXmlFile(String url) {
        XMLParser myparser = new XMLParser();
        try {
            SAXParserFactory factory = SAXParserFactory.newInstance(  );
            SAXParser parser = factory.newSAXParser();
            parser.parse(url, myparser);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return myparser.doctor;
    }
    /**/
}