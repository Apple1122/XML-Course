/*
 * Appointment.java
 */

package ece155b.doctor.data;

import java.util.Date;

public class Appointment {

	private String date;
	private String docName;
	//private String note;
	private String prescription;
	private String med;
	private String presDate;
	private String expirDate;
	
	/** Creates a new instance of Appointment */
	public Appointment() {
	}

	public String toXml() {
		String xml = "";

		xml += "<Appointment>";
		xml += "<Date>" + date + "</Date>";
		xml += "<DoctorName>" + docName + "</DoctorName>";
		xml += "<Notes>";
		xml += "<prescription>" + prescription + "</prescription>";
		xml += "<medicines>" + med + "</medicines>";
		xml += "<prescriptionDate>" + presDate + "</prescriptionDate>";
		xml += "<ExpirationDate>" + expirDate + "</ExpirationDate>";
		xml += "</Notes>";
		xml += "</Appointment>";

		return xml;
	}
}
