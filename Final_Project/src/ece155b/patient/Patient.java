package ece155b.patient;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Patient extends JFrame{
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
public Patient() {
	getContentPane().setLayout(null);
	
	JLabel lblPatient = new JLabel("Patient");
	lblPatient.setFont(new Font("UD Digi Kyokasho NK-B", Font.PLAIN, 20));
	lblPatient.setBounds(29, 25, 88, 47);
	getContentPane().add(lblPatient);
	
	JLabel label = new JLabel("First Name :");
	label.setFont(new Font("UD Digi Kyokasho NK-B", Font.PLAIN, 16));
	label.setBounds(39, 76, 119, 37);
	getContentPane().add(label);
	
	JLabel label_1 = new JLabel("Last Name :");
	label_1.setFont(new Font("UD Digi Kyokasho NK-B", Font.PLAIN, 16));
	label_1.setBounds(39, 107, 119, 37);
	getContentPane().add(label_1);
	
	textField = new JTextField();
	textField.setBounds(152, 85, 96, 21);
	getContentPane().add(textField);
	textField.setColumns(10);
	
	textField_1 = new JTextField();
	textField_1.setBounds(152, 116, 96, 21);
	getContentPane().add(textField_1);
	textField_1.setColumns(10);
	
	JList list = new JList();
	list.setBounds(104, 265, 359, 117);
	getContentPane().add(list);
	
	JList list_1 = new JList();
	list_1.setBounds(104, 448, 359, 117);
	getContentPane().add(list_1);
	
	JLabel lblList = new JLabel(" Doctor List :");
	lblList.setFont(new Font("UD Digi Kyokasho NK-B", Font.PLAIN, 16));
	lblList.setBounds(39, 232, 119, 37);
	getContentPane().add(lblList);
	
	JLabel lblSex = new JLabel("Address :");
	lblSex.setFont(new Font("UD Digi Kyokasho NK-B", Font.PLAIN, 16));
	lblSex.setBounds(39, 138, 119, 37);
	getContentPane().add(lblSex);
	
	textField_2 = new JTextField();
	textField_2.setColumns(10);
	textField_2.setBounds(152, 147, 96, 21);
	getContentPane().add(textField_2);
	
	JLabel label_2 = new JLabel("Appointment List :");
	label_2.setFont(new Font("UD Digi Kyokasho NK-B", Font.PLAIN, 16));
	label_2.setBounds(29, 392, 174, 86);
	getContentPane().add(label_2);
	
	JButton button = new JButton("enter");
	button.setFont(new Font("UD Digi Kyokasho NK-B", Font.PLAIN, 16));
	button.setBounds(473, 265, 107, 23);
	getContentPane().add(button);
	
	JButton button_1 = new JButton("enter");
	button_1.setFont(new Font("UD Digi Kyokasho NK-B", Font.PLAIN, 16));
	button_1.setBounds(104, 575, 107, 23);
	getContentPane().add(button_1);
	
	JButton button_3 = new JButton("delete");
	button_3.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
		}
	});
	button_3.setFont(new Font("UD Digi Kyokasho NK-B", Font.PLAIN, 16));
	button_3.setBounds(221, 575, 107, 23);
	getContentPane().add(button_3);
	
	JButton button_4 = new JButton("save");
	button_4.setFont(new Font("UD Digi Kyokasho NK-B", Font.PLAIN, 16));
	button_4.setBounds(320, 84, 119, 23);
	getContentPane().add(button_4);
	
	JButton button_5 = new JButton("cancel");
	button_5.setFont(new Font("UD Digi Kyokasho NK-B", Font.PLAIN, 16));
	button_5.setBounds(320, 124, 119, 23);
	getContentPane().add(button_5);
	
	textField_3 = new JTextField();
	textField_3.setColumns(10);
	textField_3.setBounds(152, 178, 96, 21);
	getContentPane().add(textField_3);
	
	textField_4 = new JTextField();
	textField_4.setColumns(10);
	textField_4.setBounds(152, 209, 96, 21);
	getContentPane().add(textField_4);
	
	JLabel lblBirthDate = new JLabel("Birth Date :");
	lblBirthDate.setFont(new Font("UD Digi Kyokasho NK-B", Font.PLAIN, 16));
	lblBirthDate.setBounds(39, 166, 119, 37);
	getContentPane().add(lblBirthDate);
	
	JLabel lblPhone = new JLabel("Phone :");
	lblPhone.setFont(new Font("UD Digi Kyokasho NK-B", Font.PLAIN, 16));
	lblPhone.setBounds(39, 198, 119, 37);
	getContentPane().add(lblPhone);
	
}
}
