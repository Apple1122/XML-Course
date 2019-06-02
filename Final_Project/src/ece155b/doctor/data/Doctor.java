package ece155b.doctor.data;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Date;
import java.util.Vector;
import javax.swing.JFileChooser;

public class Doctor {
    
    public String name = "MyName";
    public String lastname = "MyLastName";
    
    public File file;
    Vector <Patient> patients;
    
    public Doctor()
    {
        patients = new Vector<Patient>();
    }
    
    public void addPatient(Patient patient)
    {
        
    }
    
    public void save()
    {
        
    }
    
    public String toXML()
    {
        String xml = "<Doctor>";
        
	xml += "</Doctor>";
        
        return xml;
    }
    
        
    public boolean loginCheck(String ssn)
    {
        // Check if patient exists
        return true;
    }
    
    public String requestTimeOnDate(Date d)
    {
        return null;
    }
    
    public void requestAppointment(Date datetime)
    {
        
    }
}