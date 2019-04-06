package ece155b.data;

import java.util.Vector;

public class Doctor
{
    public String name = "MyName";
    public String lastname = "MyLastName";
    
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
    
}
