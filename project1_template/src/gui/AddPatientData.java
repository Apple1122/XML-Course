package gui;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import data.Patient;
import xml.PatientXmlRW;

public class AddPatientData {

	private JFrame frame;
	private JTextField text_name;
	private JTextField text_lastName;
	private JTextField text_disease;
	private JTextField text_record1;
	private JTextField text_record3;
	private JTextField text_record2;
	private JTextField text_record4;
	private JTextField text_note;

	private PatientXmlRW patientXmlRW;
	private ArrayList<Patient> patients;
	
	
	/* for AddNewDoctor.class */
	public AddPatientData()
	{
//		initialize();
	}
	
	/**
	 * @wbp.parser.constructor
	 */
	public AddPatientData(int doctorId) 
	{
		initialize(doctorId);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(int doctorId) {
		frame = new JFrame();
		frame.setBounds(100, 100, 1109, 721);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		
		
		
		JLabel lblAddPatientData = new JLabel("Add Patient Data");
		lblAddPatientData.setFont(new Font("Times New Roman", Font.PLAIN, 40));
		lblAddPatientData.setBounds(34, 43, 292, 33);
		frame.getContentPane().add(lblAddPatientData);
		
		JLabel lblName = new JLabel("Name:");
		lblName.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblName.setBounds(205, 111, 143, 21);
		frame.getContentPane().add(lblName);
		
		JLabel lblLastname = new JLabel("Lastname:");
		lblLastname.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblLastname.setBounds(205, 142, 143, 16);
		frame.getContentPane().add(lblLastname);
		
		JLabel lblDisease = new JLabel("Disease:");
		lblDisease.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblDisease.setBounds(205, 168, 85, 15);
		frame.getContentPane().add(lblDisease);
		
		JLabel lblMedicalRecord = new JLabel("Medical Record:");
		lblMedicalRecord.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblMedicalRecord.setBounds(205, 193, 136, 15);
		frame.getContentPane().add(lblMedicalRecord);
		
		text_name = new JTextField();
		text_name.setBounds(351, 114, 150, 21);
		frame.getContentPane().add(text_name);
		text_name.setColumns(10);
		
		text_lastName = new JTextField();
		text_lastName.setBounds(351, 139, 150, 21);
		frame.getContentPane().add(text_lastName);
		text_lastName.setColumns(10);
		
		text_disease = new JTextField();
		text_disease.setBounds(351, 165, 150, 21);
		frame.getContentPane().add(text_disease);
		text_disease.setColumns(10);
		
		text_record1 = new JTextField();
		text_record1.setBounds(351, 192, 150, 21);
		frame.getContentPane().add(text_record1);
		text_record1.setColumns(10);
		
		JLabel lblNote = new JLabel("Note");
		lblNote.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNote.setBounds(256, 280, 70, 28);
		frame.getContentPane().add(lblNote);
		
		text_record3 = new JTextField();
		text_record3.setBounds(351, 221, 150, 21);
		frame.getContentPane().add(text_record3);
		text_record3.setColumns(10);
		
		text_record2 = new JTextField();
		text_record2.setBounds(543, 192, 150, 21);
		frame.getContentPane().add(text_record2);
		text_record2.setColumns(10);
		
		text_record4 = new JTextField();
		text_record4.setBounds(543, 221, 150, 21);
		frame.getContentPane().add(text_record4);
		text_record4.setColumns(10);
		
		JLabel label = new JLabel("3.");
		label.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		label.setBounds(340, 218, 22, 21);
		frame.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("1.");
		label_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		label_1.setBounds(340, 195, 46, 15);
		frame.getContentPane().add(label_1);
		
		JLabel label_3 = new JLabel("2.");
		label_3.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		label_3.setBounds(523, 192, 46, 16);
		frame.getContentPane().add(label_3);
		
		JLabel label_4 = new JLabel("4.");
		label_4.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		label_4.setBounds(523, 222, 46, 15);
		frame.getContentPane().add(label_4);
		
		text_note = new JTextField();
		text_note.setBounds(256, 312, 488, 283);
		frame.getContentPane().add(text_note);
		text_note.setColumns(10);
		
		JLabel label_6 = new JLabel("New label");
		label_6.setBounds(34, 116, 150, 200);
		frame.getContentPane().add(label_6);
		
		JLabel label_2 = new JLabel("Gender:");
		label_2.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		label_2.setBounds(205, 256, 95, 15);
		frame.getContentPane().add(label_2);
		
		JRadioButton maleRadioButton = new JRadioButton("Man");
		maleRadioButton.setBounds(322, 254, 58, 23);
		maleRadioButton.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		maleRadioButton.setActionCommand("Male");
		frame.getContentPane().add(maleRadioButton);
		
		JRadioButton femaleRadioButton = new JRadioButton("Female");
		femaleRadioButton.setBounds(395, 253, 76, 23);
		femaleRadioButton.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		femaleRadioButton.setActionCommand("Female");
		frame.getContentPane().add(femaleRadioButton);
		
		ButtonGroup group = new ButtonGroup();
		group.add(maleRadioButton);
		group.add(femaleRadioButton);
		
		
		JButton btnSave = new JButton("Save");
		btnSave.setFont(new Font("Times New Roman", Font.PLAIN, 19));
		
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				ArrayList<String> records = new ArrayList<String>();
				records.add(text_record1.getText());
				records.add(text_record2.getText());
				records.add(text_record3.getText());
				records.add(text_record4.getText());

				patients.add(
						new Patient(text_name.getText(), 
								text_lastName.getText(), 
								patients.get(patients.size() - 1).getId(),
								doctorId,
								group.getSelection().getActionCommand(),
								text_disease.getText(),
								records,
								text_note.getText()
								));
				
				patientXmlRW.write(patients);
				frame.dispose();
				DoctorList.openVisible();
			}
		});
		
		btnSave.setBounds(256, 617, 105, 41);
		frame.getContentPane().add(btnSave);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				frame.dispose();
				DoctorList.openVisible();
			}
		});
		btnCancel.setBounds(376, 617, 107, 41);
		frame.getContentPane().add(btnCancel);
	}
	
	private void setPatient()
	{
		patients = patientXmlRW.read();
		
	}
	
	
	
}
