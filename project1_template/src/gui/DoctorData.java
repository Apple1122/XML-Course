package gui;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import data.Doctor;
import data.Patient;
import xml.DoctorXmlRW;
import xml.PatientXmlRW;

public class DoctorData {

	private static JFrame frame;
	private JLabel label_name;
	private JLabel label_lastname;
	private JLabel label_subject;
	private JLabel label_gender;
	private JLabel label_photo;
	
	private Doctor doctor;
	private ArrayList<Patient> patients;
	private ArrayList<Patient> patientsForDoctor;
	private DoctorXmlRW doctorXmlRW;
	private PatientXmlRW patientXmlRW;
	private SimpleDateFormat formatter = new SimpleDateFormat("E, MMM dd yyyy");
	
	public DoctorData(int doctorId) {
		setDoctorAndPatients(doctorId);
		initialize(doctorId);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(int doctorId) {
		
		// get doctor data from doctorList in CreateXML class
//		Doctor doctor = CreateXML.doctorList.get(doctorId);
		
		frame = new JFrame();
		frame.setBounds(100, 100, 1109, 721);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		
		/* Button: back to DoctorList Page */
		JButton btnBack = new JButton("Back");
		btnBack.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnBack.setBounds(51, 394, 107, 23);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				frame.dispose();
				DoctorList.openVisible();
			}
		});
		frame.getContentPane().add(btnBack);
		
		
		/* Button: edit doctor */
		JButton btnEditDoctor = new JButton("Edit");
		btnEditDoctor.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnEditDoctor.setBounds(51, 331, 107, 33);
		btnEditDoctor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				frame.dispose();
				new EditDoctorData(doctorId);
			}
		});
		frame.getContentPane().add(btnEditDoctor);
		
		/* Button: add patient */
		
		
		JLabel doctorName = new JLabel("Name:");
		doctorName.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		doctorName.setBounds(244, 111, 95, 21);
		frame.getContentPane().add(doctorName);
		
		
		JLabel doctorLastName = new JLabel("Last Name:");
		doctorLastName.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		doctorLastName.setBounds(244, 142, 114, 23);
		frame.getContentPane().add(doctorLastName);
		
		JLabel doctorSubject = new JLabel("Subject:");
		doctorSubject.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		doctorSubject.setBounds(244, 175, 85, 23);
		frame.getContentPane().add(doctorSubject);
		
		JLabel doctorGender = new JLabel("Gender:");
		doctorGender.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		doctorGender.setBounds(244, 208, 71, 23);
		frame.getContentPane().add(doctorGender);
		
		JLabel lblLastLoginTime = new JLabel("Last Login Time:");
		lblLastLoginTime.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblLastLoginTime.setBounds(244, 246, 158, 19);
		frame.getContentPane().add(lblLastLoginTime);
		
		JLabel lblDoctorData = new JLabel("Doctor Data");
		lblDoctorData.setFont(new Font("Times New Roman", Font.PLAIN, 40));
		lblDoctorData.setBounds(34, 43, 292, 33);
		frame.getContentPane().add(lblDoctorData);
		
		
		
		JLabel label_name = new JLabel();
		label_name.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		label_name.setBounds(390, 111, 170, 21);
		frame.getContentPane().add(label_name);
		
		JLabel label_lastname = new JLabel();
		label_lastname.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		label_lastname.setBounds(390, 145, 95, 21);
		frame.getContentPane().add(label_lastname);
		
		JLabel label_subject = new JLabel();
		label_subject.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		label_subject.setBounds(390, 180, 95, 21);
		frame.getContentPane().add(label_subject);
		
		JLabel label_gender = new JLabel();
		label_gender.setHorizontalAlignment(SwingConstants.LEADING);
		label_gender.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		label_gender.setBounds(390, 209, 95, 21);
		frame.getContentPane().add(label_gender);
		
		JLabel label_photo = new JLabel();
		label_photo.setHorizontalAlignment(SwingConstants.CENTER);
		label_photo.setBounds(44, 96, 150, 200);
		frame.getContentPane().add(label_photo);
		
		JLabel label_loginTime = new JLabel();
		label_loginTime.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		label_loginTime.setBounds(400, 242, 170, 21);
		frame.getContentPane().add(label_loginTime);
		
		/* hard code start:*/
//		label_name.setText("Johnson");
//		label_lastname.setText("CHEN");
//		label_subject.setText("Dick");
//		label_gender.setText("Male");
		label_photo.setIcon(new ImageIcon("/Users/kylehuang/CCU/Courses/XML/project/XML-Course/project1_template/bin/img/person.png"));
		/* hard code end */
		
		/* set label text and photo start */
		label_name.setText(doctor.getName());
		label_lastname.setText(doctor.getLastName());
		label_subject.setText(doctor.getSubject());
		label_gender.setText(doctor.getGender());
		if(doctor.getLastLoginTime() != null)
			label_loginTime.setText(doctor.getLastLoginTime());
//		label_photo.setIcon(new ImageIcon(doctor.getPhotoPath()));
		/* set label text and photo end*/
		
		JLabel label_title = new JLabel("Please double click on the patient which you want");
		label_title.setBounds(287, 555, 436, 16);
		frame.getContentPane().add(label_title);

		
		JPanel function_panel = new JPanel();
		function_panel.setBounds(777, 336, 107, 166);
		frame.getContentPane().add(function_panel);
		
		JButton btnEnter = new JButton("Enter");
		btnEnter.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnEnter.setVisible(false);
		function_panel.add(btnEnter);
		

		
		JButton btnDelete = new JButton("Delete");
		btnDelete.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnDelete.setVisible(false);
		function_panel.add(btnDelete);

		
		DefaultListModel model = new DefaultListModel();
	    JList list = new JList(model);
		
	    int count = 0;
		for(Patient patient : patients)
		{
			if(patient.getDoctorId() == doctorId)
			{
				model.add(count++, patient.getName() + " " + patient.getLastName());
				patientsForDoctor.add(patient);
			}
		}
		
		
		list.addMouseListener(new MouseAdapter() 
		{
			public void mouseClicked(MouseEvent mouseEvent) 
			{
				if(mouseEvent.getClickCount() == 1)
				{
					int id = list.locationToIndex(mouseEvent.getPoint());
					btnEnter.setVisible(true);
					btnEnter.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							frame.setVisible(false);
							
//							Patient p = (Patient)list.getModel().getElementAt(id);
//							System.out.println(patientsForDoctor.size());
							new PatientData(patientsForDoctor.get(id));
						}
					});
					
				}
				
				if(mouseEvent.getClickCount() == 2) 
				{
					int id = list.locationToIndex(mouseEvent.getPoint());
					btnDelete.setVisible(true);
					btnDelete.setText("Delete " + list.getModel().getElementAt(id));
					btnDelete.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							
							// delete xml 
							int i = 0;
							for(Patient patient : patients) {
								if(patient.getId() == patientsForDoctor.get(id).getId())
								{
									patients.remove(i);
									patientsForDoctor.remove(id);
									break;
								}
								i++;
							}
							
							patientXmlRW.write(patients);
						}
					});
					
				}
			}
		});
		
		list.setBounds(244, 275, 479, 278);
		frame.getContentPane().add(list);
		
		JButton btnAddPatient = new JButton("Add Patient");
		btnAddPatient.setBounds(377, 600, 140, 32);
		btnAddPatient.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnAddPatient.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new AddPatientData(doctorId);
				
			}
		});
		frame.getContentPane().add(btnAddPatient);
		
		
		
		

	}
	
	private void setDoctorAndPatients(int doctorId)
	{
		doctorXmlRW = new DoctorXmlRW();
		patientXmlRW = new PatientXmlRW();
		
		for(Doctor d : doctorXmlRW.read())
		{
			if(d.getId() == doctorId && d != null)
				doctor = d;
		}
		
		patients = patientXmlRW.read();
		patientsForDoctor = new ArrayList<Patient>();
//		for(Patient patient : patientXmlRW.read())
//		{
//			if(patient.getDoctorId() == doctorId && patient != null)
//				patients.add(patient);
//		}
		
	}
	public static void openVisible()
	{
		frame.setVisible(true);
	}
	
	/*
	 * add new doctor into doctorList in CreateXML class 
	 */
//	private void addNewDoctor(String name, String lastName, String subject, String gender, String photoPath)
//	{
//		add(new Doctor(name, lastName, subject, photoPath, gender));
//	}
}
