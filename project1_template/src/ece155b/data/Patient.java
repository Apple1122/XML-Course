package ece155b.data;

import java.util.Vector;

public class Patient
{
    public String ssn;
    public String name;
    public String surname;
    public String birthdate;
    public String address;
    public String phone;
    public String sex;
    
    public Vector <Note> notes;
    
    public void addNote(Note note)
    {
     //check if there is any note here, if so add into the notes array
    }

    /*
     * You need to add more methods like the ones in Doctor.java...
     */

    public String toXML()
    {
        //construct toXML similar as doctor.toXML() method
        return "XML String";
    }
}