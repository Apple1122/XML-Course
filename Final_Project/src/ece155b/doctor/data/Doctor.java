package ece155b.doctor.data;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Date;
import java.util.Vector;
import javax.swing.JFileChooser;

public class Doctor {
    
    public String name = "MyName";
    public String lastName = "MyLastName";
    private int port;
    private String subject;
    
    public File file;
    Vector <Patient> patients;
    
    public Doctor()
    {
        patients = new Vector<Patient>();
    }
      
    public Doctor(String name, String lastName, int port, String subject) {
		this.name = name;
		this.lastName = lastName;
		this.port = port;
		this.subject = subject;
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastname) {
		this.lastName = lastname;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public File getFile() {
		return file;
	}

	public void setFile(File file) {
		this.file = file;
	}

	public Vector<Patient> getPatients() {
		return patients;
	}

	public void setPatients(Vector<Patient> patients) {
		this.patients = patients;
	}
    
    
}