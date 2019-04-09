package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddPatientData {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;

	/* for AddNewDoctor.class */
	public AddPatientData()
	{
//		initialize();
	}
	
	public AddPatientData(int index) 
	{
		initialize(index);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(int index) {
		frame = new JFrame();
		frame.setBounds(100, 100, 1109, 721);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		
		JButton btnSave = new JButton("Save");
		btnSave.setFont(new Font("Times New Roman", Font.PLAIN, 19));
		
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
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
		
		JLabel lblAddPatientData = new JLabel("Add patient Data");
		lblAddPatientData.setFont(new Font("Times New Roman", Font.PLAIN, 40));
		lblAddPatientData.setBounds(34, 43, 292, 33);
		frame.getContentPane().add(lblAddPatientData);
		
		JLabel lblPatientFirstname = new JLabel("Patient Firstname:");
		lblPatientFirstname.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblPatientFirstname.setBounds(205, 111, 143, 21);
		frame.getContentPane().add(lblPatientFirstname);
		
		JLabel lblPatientLastname = new JLabel("Patient Lastname:");
		lblPatientLastname.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblPatientLastname.setBounds(205, 142, 143, 16);
		frame.getContentPane().add(lblPatientLastname);
		
		JLabel lblDisease = new JLabel("Disease:");
		lblDisease.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblDisease.setBounds(226, 168, 85, 15);
		frame.getContentPane().add(lblDisease);
		
		JLabel lblMedicalRecord = new JLabel("Medical Record:");
		lblMedicalRecord.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblMedicalRecord.setBounds(205, 193, 136, 15);
		frame.getContentPane().add(lblMedicalRecord);
		
		textField = new JTextField();
		textField.setBounds(351, 114, 150, 21);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(351, 139, 150, 21);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(351, 165, 150, 21);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(351, 192, 150, 21);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNote = new JLabel("Note");
		lblNote.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNote.setBounds(256, 280, 70, 28);
		frame.getContentPane().add(lblNote);
		
		textField_4 = new JTextField();
		textField_4.setBounds(351, 221, 150, 21);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(351, 252, 150, 21);
		frame.getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(543, 192, 150, 21);
		frame.getContentPane().add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setBounds(543, 221, 150, 21);
		frame.getContentPane().add(textField_7);
		textField_7.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.setBounds(543, 252, 150, 21);
		frame.getContentPane().add(textField_8);
		textField_8.setColumns(10);
		
		JLabel label = new JLabel("3.");
		label.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		label.setBounds(340, 218, 22, 21);
		frame.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("1.");
		label_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		label_1.setBounds(340, 195, 46, 15);
		frame.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("5.");
		label_2.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		label_2.setBounds(340, 249, 46, 21);
		frame.getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("2.");
		label_3.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		label_3.setBounds(523, 192, 46, 16);
		frame.getContentPane().add(label_3);
		
		JLabel label_4 = new JLabel("4.");
		label_4.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		label_4.setBounds(523, 222, 46, 15);
		frame.getContentPane().add(label_4);
		
		JLabel label_5 = new JLabel("6.");
		label_5.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		label_5.setBounds(523, 247, 46, 21);
		frame.getContentPane().add(label_5);
		
		textField_9 = new JTextField();
		textField_9.setBounds(256, 312, 488, 283);
		frame.getContentPane().add(textField_9);
		textField_9.setColumns(10);
		
		JLabel label_6 = new JLabel("New label");
		label_6.setBounds(34, 116, 150, 200);
		frame.getContentPane().add(label_6);
	}
}
