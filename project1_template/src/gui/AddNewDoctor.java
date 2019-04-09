package gui;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ButtonGroup;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import data.Doctor;
import xml.CreateXML;

public class AddNewDoctor {

	private JFrame frame;
	private JTextField textField_name;
	private JTextField textField_lastName;
	private JTextField textField_subject;

	// JFileChooser can upload file(photo)
	
	/**
	 * Create the application.
	 */
	public AddNewDoctor(int countDoctor) {
		initialize(countDoctor);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(int countDoctor) 
	{
		
		frame = new JFrame();
		frame.setBounds(100, 100, 1109, 721);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		
		JLabel title = new JLabel("Add Doctor Data");
		title.setFont(new Font("Times New Roman", Font.PLAIN, 40));
		title.setBounds(34, 43, 292, 33);
		frame.getContentPane().add(title);
		
		
		JLabel doctorName = new JLabel("Name:");
		doctorName.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		doctorName.setBounds(258, 111, 95, 21);
		frame.getContentPane().add(doctorName);
		
		
		JLabel doctorLastName = new JLabel("Last Name:");
		doctorLastName.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		doctorLastName.setBounds(215, 144, 114, 23);
		frame.getContentPane().add(doctorLastName);
		
		JLabel doctorSubject = new JLabel("Subject:");
		doctorSubject.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		doctorSubject.setBounds(244, 179, 85, 23);
		frame.getContentPane().add(doctorSubject);
		
		JLabel doctorGender = new JLabel("Gender:");
		doctorGender.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		doctorGender.setBounds(254, 214, 75, 23);
		frame.getContentPane().add(doctorGender);
		
		textField_name = new JTextField();
		textField_name.setBounds(351, 114, 150, 21);
		frame.getContentPane().add(textField_name);
		textField_name.setColumns(10);
		
		textField_lastName = new JTextField();
		textField_lastName.setBounds(351, 142, 150, 21);
		frame.getContentPane().add(textField_lastName);
		textField_lastName.setColumns(10);
		
		textField_subject = new JTextField();
		textField_subject.setColumns(10);
		textField_subject.setBounds(351, 173, 150, 21);
		frame.getContentPane().add(textField_subject);
		
		JRadioButton maleRadioButton = new JRadioButton("Man");
		maleRadioButton.setBounds(349, 214, 58, 23);
		maleRadioButton.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		maleRadioButton.setActionCommand("Male");
		frame.getContentPane().add(maleRadioButton);
		
		JRadioButton femaleRadioButton = new JRadioButton("Female");
		femaleRadioButton.setBounds(419, 214, 76, 23);
		femaleRadioButton.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		femaleRadioButton.setActionCommand("Female");
		frame.getContentPane().add(femaleRadioButton);
		
		ButtonGroup group = new ButtonGroup();
		group.add(maleRadioButton);
		group.add(femaleRadioButton);
		
		
		DefaultListModel model = new DefaultListModel();
	    JList list = new JList(model);		
		
		list.addMouseListener(new MouseAdapter() 
		{
			public void mouseClicked(MouseEvent mouseEvent) 
			{
				
			}
		});
		list.setBounds(244, 276, 479, 278);
		frame.getContentPane().add(list);
		
		// Button: Add Patient
		JButton btnAddPatient = new JButton("Add Patient");
		btnAddPatient.setBounds(730, 407, 114, 55);
		btnAddPatient.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnAddPatient.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e) {
				new AddPatientData(0);
				
			}
		});
		frame.getContentPane().add(btnAddPatient);	
		
		// Button: Save
		JButton btnSave = new JButton("Save");
		btnSave.setBounds(314, 594, 123, 41);
		btnSave.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnSave.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				CreateXML.doctorList.add(new Doctor(textField_name.getText(), 
						textField_lastName.getText(), 
						textField_subject.getText(),
						group.getSelection().getActionCommand()));

				frame.dispose();
				DoctorList.openVisible();
			}
		});
		frame.getContentPane().add(btnSave);
		
		// Button: Cancel
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnCancel.setBounds(562, 594, 107, 41);
		btnCancel.setVisible(true);
		btnCancel.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				frame.dispose();
				DoctorList.openVisible();
			}
		});
		frame.getContentPane().add(btnCancel);
		
		
	}
}
