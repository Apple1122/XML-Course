package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.JButton;

public class AddNewDoctor {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_3;

	// JFileChooser can upload file(photo)
	
	/**
	 * Create the application.
	 */
	public AddNewDoctor() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1109, 721);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel title = new JLabel("Add Doctor Data");
		title.setFont(new Font("Times New Roman", Font.PLAIN, 40));
		title.setBounds(34, 43, 292, 33);
		frame.getContentPane().add(title);
		
		JPanel panel = new JPanel();
		panel.setBounds(34, 122, 150, 187);
		frame.getContentPane().add(panel);
		
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
		
		textField = new JTextField();
		textField.setBounds(351, 114, 150, 21);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(351, 142, 150, 21);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(351, 173, 150, 21);
		frame.getContentPane().add(textField_3);
		
		JRadioButton maleRadioButton = new JRadioButton("Man");
		maleRadioButton.setBounds(349, 214, 58, 23);
		maleRadioButton.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		frame.getContentPane().add(maleRadioButton);
		
		JRadioButton femaleRadioButton = new JRadioButton("Female");
		femaleRadioButton.setBounds(419, 214, 76, 23);
		femaleRadioButton.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		frame.getContentPane().add(femaleRadioButton);
		
		JButton btnSave = new JButton("Save");
		btnSave.setBounds(258, 497, 123, 41);
		btnSave.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DoctorList.openVisible();
				frame.dispose();
			}
		});
		frame.getContentPane().add(btnSave);
		
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnCancel.setBounds(419, 497, 107, 41);
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DoctorList.openVisible();
				frame.dispose();
			}
		});
		frame.getContentPane().add(btnCancel);
		
		
	}
}
