package data;

public class Doctor {

	private String name;
	private String lastName;
	private String subject;
	private String photoPath;
	private String gender;
	private String lastLoginTime;
	
	
	
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
	
	
	
	
	
}
