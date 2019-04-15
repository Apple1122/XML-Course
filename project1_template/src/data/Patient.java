package data;

import java.util.ArrayList;

public class Patient {

	private String name;
	private String lastName;
	private int id;
	private int doctorId;
	private String gender;
	private String disease;
	private ArrayList<String> medicalRecord;
	private String note;
	
	
	
	public Patient(String name, String lastName, int id, int doctorId, String gender, String disease,
			ArrayList<String> medicalRecord, String note) {
		this.name = name;
		this.lastName = lastName;
		this.id = id;
		this.doctorId = doctorId;
		this.gender = gender;
		this.disease = disease;
		this.medicalRecord = medicalRecord;
		this.note = note;
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
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getDoctorId() {
		return doctorId;
	}
	public void setDoctorId(int doctorId) {
		this.doctorId = doctorId;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDisease() {
		return disease;
	}
	public void setDisease(String disease) {
		this.disease = disease;
	}
	public ArrayList<String> getMedicalRecord() {
		return medicalRecord;
	}
	public void setMedicalRecord(ArrayList<String> medicalRecord) {
		this.medicalRecord = medicalRecord;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	
	
	
}
