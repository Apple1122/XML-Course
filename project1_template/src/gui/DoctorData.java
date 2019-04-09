package gui;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

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
import xml.CreateXML;

public class DoctorData {

	private JFrame frame;

	
	public DoctorData(int index) {
		initialize(index);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(int index) {
		
		// get doctor data from doctorList in CreateXML class
//		Doctor doctor = CreateXML.doctorList.get(index);
		
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
				new EditDoctorData(index);
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
		label_subject.setBounds(390, 180, 78, 21);
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
		
		/* hard code start:*/
		label_name.setText("Johnson");
		label_lastname.setText("CHEN");
		label_subject.setText("Dick");
		label_gender.setText("Male");
		label_photo.setIcon(new ImageIcon("/Users/kylehuang/CCU/Courses/XML/project/XML-Course/project1_template/bin/img/person.png"));
		/* hard code end */
		
//		/* set label text and photo start */
//		label_name.setText(doctor.getName());
//		label_lastname.setText(doctor.getLastName());
//		label_subject.setText(doctor.getSubject());
//		label_gender.setText(doctor.getGender());
//		label_photo.setIcon(new ImageIcon(doctor.getPhotoPath()));
//		/* set label text and photo end*/
		
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
		
		int i = 1;
		for(Patient patient : CreateXML.doctorList.get(index).getPatients())
		{
			model.add(i++, patient.getName() + " " + patient.getLastName());
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
							frame.dispose();
							new PatientData(id);
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
				frame.dispose();
				new AddPatientData(index);
			}
		});
		frame.getContentPane().add(btnAddPatient);
		
		JLabel lblLastLoginTime = new JLabel("Last Login Time:");
		lblLastLoginTime.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblLastLoginTime.setBounds(244, 246, 158, 19);
		frame.getContentPane().add(lblLastLoginTime);
		
		

	}
	
	/*
	 * add new doctor into doctorList in CreateXML class 
	 */
	private void addNewDoctor(String name, String lastName, String subject, String gender, String photoPath)
	{
		CreateXML.doctorList.add(new Doctor(name, lastName, subject, photoPath, gender));
	}
}
