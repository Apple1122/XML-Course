package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.Font;
import javax.swing.JTextField;

public class EditDoctordata {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EditDoctordata window = new EditDoctordata();
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
	public EditDoctordata() {
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
		
		JLabel lblEditDoctorData = new JLabel("Edit Doctor Data");
		lblEditDoctorData.setFont(new Font("Times New Roman", Font.PLAIN, 40));
		lblEditDoctorData.setBounds(34, 43, 292, 33);
		frame.getContentPane().add(lblEditDoctorData);
		
		JPanel panel = new JPanel();
		panel.setBounds(34, 122, 150, 187);
		frame.getContentPane().add(panel);
		
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
		
		
	}

}
