package ece155b;

import ece155b.data.Doctor;
import ece155b.xml.XMLParser;
import java.awt.*;
import javax.swing.*;
import javax.xml.parsers.*;
import java.io.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class DoctorApp extends JFrame {
    
    public Doctor doctor;
    final String fileurl = System.getProperty("user.dir") + File.separator + "test.xml";  //XML file to read/write to    
    private int PortNo;
    
    
    public static void main(String [] args) {
        new DoctorApp();
    }
    
    public DoctorApp() {
        try {
        doctor = readXmlFile(fileurl);        
        } catch (Exception ex){
            System.out.println("Error!");
        }
        GUI();        
    }
    
    JTextArea texta;
    
    public void GUI() {
        //first read XML file
        
        setLayout(new BorderLayout());
        
        texta = new JTextArea();
        JScrollPane scroll = new JScrollPane(texta);
        texta.setLineWrap(true);
        texta.setWrapStyleWord(true);
        
        JButton testme = new JButton("ChangeName");
        testme.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {                                          
                texta.append("Hello Dr. " + doctor.name + " " + doctor.lastname + " you pressed changed name!\n");                
                doctor.name        = "XML";
                doctor.lastname    = " Network and Services";
                try{
                    toXmlFile(doctor, fileurl);
                    System.out.println("After: " + readXmlFile(fileurl));                
                } catch(Exception ex){}
            }
        });
        
        getContentPane().add(scroll, BorderLayout.CENTER);
        getContentPane().add(testme, BorderLayout.SOUTH);
        
        setTitle("Doctor Application");
        setSize(600,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setVisible(true);
    }
    
    public void append(String str) {
        texta.append("\n"+str);
    }
    
    public Doctor readXmlFile(String url) throws Exception { 
    //read from XML file
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
    
    public void toXmlFile(Doctor doc, String url) throws Exception {
    //write to XML file
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
}