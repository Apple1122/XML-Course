package gui;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import data.Doctor;
import xml.DoctorXmlRW;
import javax.swing.SwingConstants;

public class EditDoctorData {

	private JFrame frame;
	private JTextField textField_name;
	private JTextField textField_lastName;
	private JTextField textField_gender;
	private JTextField textField_subject;
	
	private DoctorXmlRW doctorXmlRW;
	
	private ArrayList<Doctor> doctors;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					EditDoctorData window = new EditDoctorData();
//					window.frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the application.
	 */
	public EditDoctorData(int index) {
		initialize(index);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(int index) {
		frame = new JFrame();
		frame.setBounds(100, 100, 1109, 721);
		frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		JLabel lblEditDoctorData = new JLabel("Edit Doctor Data");
		lblEditDoctorData.setFont(new Font("Times New Roman", Font.PLAIN, 40));
		lblEditDoctorData.setBounds(34, 43, 292, 33);
		frame.getContentPane().add(lblEditDoctorData);
		
		JLabel lblDoctorFirstname = new JLabel("Doctor name:");
		lblDoctorFirstname.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblDoctorFirstname.setBounds(205, 111, 143, 21);
		frame.getContentPane().add(lblDoctorFirstname);
		
		JLabel lblDoctorLastname = new JLabel("Doctor Lastname:");
		lblDoctorLastname.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblDoctorLastname.setBounds(201, 142, 180, 16);
		frame.getContentPane().add(lblDoctorLastname);
		
		JLabel lblSubject = new JLabel("Subject:");
		lblSubject.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblSubject.setBounds(205, 177, 85, 23);
		frame.getContentPane().add(lblSubject);
		
		JLabel lblSex = new JLabel("Gender:");
		lblSex.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblSex.setBounds(205, 210, 70, 23);
		frame.getContentPane().add(lblSex);
		
		textField_name = new JTextField();
		textField_name.setBounds(351, 114, 150, 21);
		frame.getContentPane().add(textField_name);
		textField_name.setColumns(10);
		
		textField_lastName = new JTextField();
		textField_lastName.setBounds(351, 142, 150, 21);
		frame.getContentPane().add(textField_lastName);
		textField_lastName.setColumns(10);
		
		textField_gender = new JTextField();
		textField_gender.setColumns(10);
		textField_gender.setBounds(351, 214, 150, 21);
		frame.getContentPane().add(textField_gender);
		
		textField_subject = new JTextField();
		textField_subject.setColumns(10);
		textField_subject.setBounds(351, 179, 150, 21);
		frame.getContentPane().add(textField_subject);
		
		doctors = doctorXmlRW.read();
		
		textField_name.setText(doctors.get(index).getName());
		textField_lastName.setText(doctors.get(index).getLastName());
		textField_gender.setText(doctors.get(index).getGender());
		textField_subject.setText(doctors.get(index).getSubject());
		
	
		JButton btnSave = new JButton("Save");
		btnSave.setFont(new Font("Times New Roman", Font.PLAIN, 19));
		btnSave.setVisible(true);
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 
				doctors.get(index).setName(textField_name.getText());
				doctors.get(index).setLastName(textField_lastName.getText());
				doctors.get(index).setGender(textField_gender.getText());
				doctors.get(index).setSubject(textField_subject.getText());
				
				doctorXmlRW.write(doctors);
				
				frame.dispose();
				DoctorList.openVisible();
			}
		});
		btnSave.setBounds(256, 617, 105, 41);
		frame.getContentPane().add(btnSave);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnCancel.setVisible(true);
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				DoctorList.openVisible();
			}
		});
		btnCancel.setBounds(376, 617, 107, 41);
		frame.getContentPane().add(btnCancel);
		
		JLabel label = new JLabel();
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setIcon(new ImageIcon("/Users/kylehuang/CCU/Courses/XML/project/XML-Course/project1_template/img/person.png"));
		label.setBounds(34, 116, 150, 200);
		frame.getContentPane().add(label);
		
		
	}

}
