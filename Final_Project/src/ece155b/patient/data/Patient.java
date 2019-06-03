
package ece155b.patient.data;

import java.util.Vector;

public class Patient {
    public String name;
    public String lastname;
    
    Vector <Appointment> appointments;
    Vector <DoctorContact> doctors;
    
    public Patient() {
        
    }
    
    public Patient(String name2, String lastName2, int id, int doctorId, String gender, String disease,
			String medicalRecord, String note) {
		// TODO Auto-generated constructor stub
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

	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getLastName() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getSex() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getNote() {
		// TODO Auto-generated method stub
		return null;
	}
}
