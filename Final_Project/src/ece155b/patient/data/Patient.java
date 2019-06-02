
package ece155b.patient.data;

import java.util.Vector;

public class Patient {
    public String name;
    public String lastname;
    
    Vector <Appointment> appointments;
    Vector <DoctorContact> doctors;
    
    public Patient() {
        
    }
    
    public String toXML() {
        String xml="<Patient>";
        // other info
        for (int i = 0; i < doctors.size(); i++)
            xml += doctors.elementAt(i).toXML();
        
        for (int i = 0; i < appointments.size(); i++)
            xml += appointments.elementAt(i).toXML();
        
        return xml+"</Patient>";
    }
}
