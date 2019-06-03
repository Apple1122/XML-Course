package ece155b.patient;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JTextField;

public class AppointmentP extends JFrame{
public AppointmentP() {
getContentPane().setLayout(null);
setResizable(false);
setBounds(0, 0, 580, 630);
	JLabel lblAppointment = new JLabel("Appointment");
	lblAppointment.setFont(new Font("UD Digi Kyokasho NP-B", Font.PLAIN, 19));
	lblAppointment.setBounds(48, 35, 141, 65);
	getContentPane().add(lblAppointment);
	
	JLabel lblDate = new JLabel("Date :");
	lblDate.setFont(new Font("UD Digi Kyokasho NP-R", Font.PLAIN, 16));
	lblDate.setBounds(58, 110, 63, 25);
	getContentPane().add(lblDate);
	
	JLabel lblDoctorName = new JLabel("Doctor Name :");
	lblDoctorName.setFont(new Font("UD Digi Kyokasho NP-R", Font.PLAIN, 16));
	lblDoctorName.setBounds(58, 145, 118, 25);
	getContentPane().add(lblDoctorName);
	
	JTextField textField = new JTextField();
	textField.setBounds(178, 113, 96, 21);
	getContentPane().add(textField);
	textField.setColumns(10);
	
	JLabel lblNote = new JLabel("Note :");
	lblNote.setFont(new Font("UD Digi Kyokasho NP-R", Font.PLAIN, 16));
	lblNote.setBounds(58, 304, 63, 25);
	getContentPane().add(lblNote);
	
	JLabel lblPrescription = new JLabel("Prescription :");
	lblPrescription.setFont(new Font("UD Digi Kyokasho NP-R", Font.PLAIN, 16));
	lblPrescription.setBounds(58, 329, 118, 25);
	getContentPane().add(lblPrescription);
	
	JButton button_2 = new JButton("save");
	button_2.setFont(new Font("UD Digi Kyokasho NK-B", Font.PLAIN, 16));
	button_2.setBounds(411, 112, 119, 23);
	getContentPane().add(button_2);
	
	JButton button_3 = new JButton("cancel");
	button_3.setFont(new Font("UD Digi Kyokasho NK-B", Font.PLAIN, 16));
	button_3.setBounds(411, 147, 119, 23);
	getContentPane().add(button_3);
	
	JLabel lblNewLabel_1 = new JLabel("New label");
	lblNewLabel_1.setBounds(188, 310, 46, 15);
	getContentPane().add(lblNewLabel_1);
	
	JLabel lblNewLabel_2 = new JLabel("New label");
	lblNewLabel_2.setBounds(188, 335, 46, 15);
	getContentPane().add(lblNewLabel_2);
	
	JList list = new JList();
	list.setBounds(178, 151, 191, 130);
	getContentPane().add(list);
	
}

}
