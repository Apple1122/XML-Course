package ece155b.data;

import java.util.Vector;

public class Doctor
{
    private String name = "MyName";
    private String lastname = "MyLastName";
    
    private String imageFilePath;
    //add more variables for doctor as you wish
    
    Vector <Patient> patients;
    
    public Doctor()
    {
        patients = new Vector<Patient>();
    }
    
    public void addPatient(Patient patient)
    {
        // Check if patient exists.. Inform otherwise
    }
    
    public String toString()
    {
        return name+" "+lastname+" "+patients.size()+" patients";
    }
    
    public String toXML()
    {
        String xml = "<Doctor>";
        xml += "<DoctorName>"+name+"</DoctorName>";
        xml += "<DoctorLastName>"+lastname+"</DoctorLastName>";
        /* if you have more variables for doctor,
         * you will need to add more tags here...
         */
        xml += "<Patients>";
        for (int i = 0; i < patients.size(); i++)
            xml += patients.elementAt(i).toXML();
        xml += "</Patients>";
        xml += "</Doctor>";
        
        return xml;
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getImageFilePath() {
		return imageFilePath;
	}

	public void setImageFilePath(String imageFilePath) {
		this.imageFilePath = imageFilePath;
	}
    
    
    
}
