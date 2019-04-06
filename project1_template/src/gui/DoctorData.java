package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Panel;
import java.awt.Button;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import java.awt.Font;
import javax.swing.JTextArea;

public class DoctorData {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
	}

	/**
	 * Create the application.
	 * @wbp.parser.entryPoint
	 */
	public DoctorData() {
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
		
		JButton btnBack = new JButton("Back");
		btnBack.setFont(new Font("新細明體", Font.PLAIN, 20));
		btnBack.setBounds(51, 394, 107, 23);
		frame.getContentPane().add(btnBack);
		
		
		JButton btnEditDoctor = new JButton("Edit");
		btnEditDoctor.setFont(new Font("新細明體", Font.PLAIN, 20));
		btnEditDoctor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnEditDoctor.setBounds(51, 331, 107, 33);
		frame.getContentPane().add(btnEditDoctor);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(214, 264, 567, 304);
		frame.getContentPane().add(comboBox);
		
		JButton btnAddPatient = new JButton("Add");
		btnAddPatient.setFont(new Font("新細明體", Font.PLAIN, 20));
		btnAddPatient.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnAddPatient.setBounds(377, 612, 107, 48);
		frame.getContentPane().add(btnAddPatient);
		
		JLabel lblPatient = new JLabel("Patient");
		lblPatient.setFont(new Font("新細明體", Font.PLAIN, 20));
		lblPatient.setBounds(494, 614, 95, 44);
		frame.getContentPane().add(lblPatient);
		
		JLabel lblDoctorFirstname = new JLabel("Doctor Firstname:");
		lblDoctorFirstname.setFont(new Font("新細明體", Font.PLAIN, 20));
		lblDoctorFirstname.setBounds(205, 111, 143, 21);
		frame.getContentPane().add(lblDoctorFirstname);
		
		
		JLabel lblDoctorLastname = new JLabel("Doctor Lastname:");
		lblDoctorLastname.setFont(new Font("新細明體", Font.PLAIN, 20));
		lblDoctorLastname.setBounds(205, 142, 142, 23);
		frame.getContentPane().add(lblDoctorLastname);
		
		Panel panel = new Panel();
		panel.setBounds(34, 122, 150, 187);
		frame.getContentPane().add(panel);
		
		JLabel lblSubject = new JLabel("Subject:");
		lblSubject.setFont(new Font("新細明體", Font.PLAIN, 20));
		lblSubject.setBounds(234, 175, 85, 23);
		frame.getContentPane().add(lblSubject);
		
		JLabel lblSex = new JLabel("Sex:");
		lblSex.setFont(new Font("新細明體", Font.PLAIN, 20));
		lblSex.setBounds(244, 210, 42, 23);
		frame.getContentPane().add(lblSex);
		
		JLabel lblDoctorData = new JLabel("Doctor Data");
		lblDoctorData.setFont(new Font("Times New Roman", Font.PLAIN, 40));
		lblDoctorData.setBounds(34, 43, 292, 33);
		frame.getContentPane().add(lblDoctorData);
		
		JLabel lblNewLabel = new JLabel("CHEN");
		lblNewLabel.setFont(new Font("新細明體", Font.PLAIN, 20));
		lblNewLabel.setBounds(345, 111, 170, 21);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("JOHNSON");
		lblNewLabel_1.setFont(new Font("新細明體", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(345, 142, 95, 21);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("DICK");
		lblNewLabel_2.setFont(new Font("新細明體", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(345, 175, 78, 21);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("M");
		lblNewLabel_3.setFont(new Font("新細明體", Font.PLAIN, 20));
		lblNewLabel_3.setBounds(345, 210, 95, 21);
		frame.getContentPane().add(lblNewLabel_3);
	}
}
