package gui;

import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

public class EditDoctorData {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

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
		
		JLabel lblDoctorFirstname = new JLabel("Doctor Firstname:");
		lblDoctorFirstname.setFont(new Font("新細明體", Font.PLAIN, 20));
		lblDoctorFirstname.setBounds(205, 111, 143, 21);
		frame.getContentPane().add(lblDoctorFirstname);
		
		JLabel lblDoctorLastname = new JLabel("Doctor Lastname:");
		lblDoctorLastname.setFont(new Font("新細明體", Font.PLAIN, 20));
		lblDoctorLastname.setBounds(205, 142, 143, 16);
		frame.getContentPane().add(lblDoctorLastname);
		
		JLabel lblSubject = new JLabel("Subject:");
		lblSubject.setFont(new Font("新細明體", Font.PLAIN, 20));
		lblSubject.setBounds(234, 175, 85, 23);
		frame.getContentPane().add(lblSubject);
		
		JLabel lblSex = new JLabel("Sex:");
		lblSex.setFont(new Font("新細明體", Font.PLAIN, 20));
		lblSex.setBounds(244, 210, 42, 23);
		frame.getContentPane().add(lblSex);
		
		textField = new JTextField();
		textField.setBounds(351, 114, 150, 21);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(351, 142, 150, 21);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(351, 199, 150, 21);
		frame.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(351, 173, 150, 21);
		frame.getContentPane().add(textField_3);
		
		JButton btnSave = new JButton("Save");
		btnSave.setFont(new Font("新細明體", Font.PLAIN, 19));
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				DoctorList.openVisible();
			}
		});
		btnSave.setBounds(256, 617, 105, 41);
		frame.getContentPane().add(btnSave);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setFont(new Font("新細明體", Font.PLAIN, 20));
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				DoctorList.openVisible();
			}
		});
		btnCancel.setBounds(376, 617, 107, 41);
		frame.getContentPane().add(btnCancel);
		
		JLabel label = new JLabel("New label");
		label.setBounds(34, 116, 150, 200);
		frame.getContentPane().add(label);
		
		
	}

}
