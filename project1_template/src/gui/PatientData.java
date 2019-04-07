package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.JTextField;

public class PatientData {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PatientData window = new PatientData();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public PatientData() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Times New Roman", Font.PLAIN, 40));
		frame.setBounds(100, 100, 1109, 721);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnBack = new JButton("Back");
		btnBack.setBounds(428, 636, 85, 23);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				new DoctorData();
			}
		});
		frame.getContentPane().add(btnBack);
		
		JLabel lblPatientData = new JLabel("Patient Data");
		lblPatientData.setFont(new Font("Times New Roman", Font.PLAIN, 40));
		lblPatientData.setBounds(34, 43, 292, 33);
		frame.getContentPane().add(lblPatientData);
		 
		JLabel lblPatientFirstname = new JLabel("Patient Firstname:");
		lblPatientFirstname.setFont(new Font("新細明體", Font.PLAIN, 20));
		lblPatientFirstname.setBounds(205, 111, 143, 21);
		frame.getContentPane().add(lblPatientFirstname);
		
		JLabel lblPatientLastname = new JLabel("Patient Lastname:");
		lblPatientLastname.setFont(new Font("新細明體", Font.PLAIN, 20));
		lblPatientLastname.setBounds(205, 142, 143, 16);
		frame.getContentPane().add(lblPatientLastname);
		
		JLabel lblDisease = new JLabel("Disease:");
		lblDisease.setFont(new Font("新細明體", Font.PLAIN, 20));
		lblDisease.setBounds(226, 168, 85, 15);
		frame.getContentPane().add(lblDisease);
		
		JLabel lblMedicalRecord = new JLabel("Medical Record:");
		lblMedicalRecord.setFont(new Font("新細明體", Font.PLAIN, 20));
		lblMedicalRecord.setBounds(205, 193, 136, 15);
		frame.getContentPane().add(lblMedicalRecord);
		
		JLabel lblNote = new JLabel("Note");
		lblNote.setFont(new Font("新細明體", Font.PLAIN, 20));
		lblNote.setBounds(256, 280, 70, 28);
		frame.getContentPane().add(lblNote);
		
		textField = new JTextField();
		textField.setBounds(256, 312, 488, 283);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel label = new JLabel("New label");
		label.setBounds(33, 116, 150, 200);
		frame.getContentPane().add(label);
	}

}
