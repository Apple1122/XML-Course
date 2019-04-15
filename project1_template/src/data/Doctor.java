package data;

import java.util.ArrayList;
import java.util.Date;

public class Doctor {

	private String name;
	private String lastName;
	private int id;
	private String subject;
	private String photoPath;
	private String gender;
	private Date lastLoginTime;
	private ArrayList<Patient> patients;
	
	
	
	public Doctor(String name, String lastName, String subject, String gender) {
		this.name = name;
		this.lastName = lastName;
		this.subject = subject;
		this.gender = gender;
		// default photo
		this.photoPath = "/Users/kylehuang/CCU/Courses/XML/project/XML-Course/project1_template/bin/img/person.png";
	}

	public Doctor(String name, String lastName, String subject, String photoPath, String gender) {
		this.name = name;
		this.lastName = lastName;
		this.subject = subject;
		this.photoPath = photoPath;
		this.gender = gender;
	}
	


	public Doctor(String name, String lastName, int id, String subject, String gender, Date lastLoginTime) {
		this.name = name;
		this.lastName = lastName;
		this.id = id;
		this.subject = subject;
		this.gender = gender;
		this.lastLoginTime = lastLoginTime;
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

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getPhotoPath() {
		return photoPath;
	}

	public void setPhotoPath(String photoPath) {
		this.photoPath = photoPath;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getLastLoginTime() {
		return lastLoginTime;
	}

	public void setLastLoginTime(Date lastLoginTime) {
		this.lastLoginTime = lastLoginTime;
	}

	public ArrayList<Patient> getPatients() {
		return patients;
	}

	public void setPatients(ArrayList<Patient> patients) {
		this.patients = patients;
	}
	
	
}
