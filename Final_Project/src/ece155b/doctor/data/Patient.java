
package ece155b.doctor.data;

import java.util.Vector;

public class Patient {
    public String ssn;
    public String name;
    public String surname;
    public String birthdate;
    public String address;
    public String phone;
    public String sex;
    
    public Vector <Note> notes;
    
    public Patient()
    {
        notes = new Vector <Note> ();
    }
    
    public void addNote(Note note)
    {
        notes.addElement(note);
    }
    
    public String toXML() {
        String xml;
        xml ="<Patient>";
        
        return xml+"</Patient>";
    }
    
}
