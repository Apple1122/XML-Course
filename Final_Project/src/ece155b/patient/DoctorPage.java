package ece155b.patient;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JTextField;

public class DoctorPage extends JFrame{
public DoctorPage() {
	setResizable(false);
	setBounds(0, 0, 580, 630);
	getContentPane().setLayout(null);
	getContentPane().setBackground(new Color(240, 240, 240));
	getContentPane().setFont(new Font("新細明體", Font.PLAIN, 18));
	getContentPane().setLayout(null);
	
	JButton btnNewButton = new JButton("New button");
	getContentPane().add(btnNewButton);
	
	JLabel lblDoctor = new JLabel("Doctor ");
	lblDoctor.setFont(new Font("Times New Roman", Font.PLAIN, 20));
	lblDoctor.setBounds(36, 28, 88, 47);
	getContentPane().add(lblDoctor);
	
	JLabel lblFirstName = new JLabel("Name :");
	lblFirstName.setFont(new Font("Times New Roman", Font.BOLD, 16));
	lblFirstName.setBounds(36, 85, 119, 37);
	getContentPane().add(lblFirstName);
	
	JLabel lblLastName = new JLabel("Last Name :");
	lblLastName.setFont(new Font("Times New Roman", Font.BOLD, 16));
	lblLastName.setBounds(36, 121, 119, 37);
	getContentPane().add(lblLastName);
	
	JLabel lblSubject = new JLabel("Subject :");
	lblSubject.setFont(new Font("Times New Roman", Font.BOLD, 16));
	lblSubject.setBounds(36, 158, 119, 37);
	getContentPane().add(lblSubject);
	
	JLabel lblAppointmentList = new JLabel("Appointment List :");
	lblAppointmentList.setFont(new Font("Times New Roman", Font.BOLD, 16));
	lblAppointmentList.setBounds(36, 170, 174, 86);
	getContentPane().add(lblAppointmentList);
	
	JList list_1 = new JList();
	list_1.setBounds(36, 240, 468, 171);
	getContentPane().add(list_1);
	
	JLabel label_name = new JLabel("Kevin");
	label_name.setFont(new Font("Times New Roman", Font.PLAIN, 15));
	label_name.setBounds(150, 98, 61, 16);
	getContentPane().add(label_name);
	
	JLabel label_lastName = new JLabel("Smith");
	label_lastName.setFont(new Font("Times New Roman", Font.PLAIN, 15));
	label_lastName.setBounds(150, 131, 61, 16);
	getContentPane().add(label_lastName);
	
	JLabel label_subject = new JLabel("Lang");
	label_subject.setFont(new Font("Times New Roman", Font.PLAIN, 15));	
	label_subject.setBounds(150, 170, 61, 16);
	getContentPane().add(label_subject);
	
	JButton btnAdd = new JButton("+New Appointment ");
	btnAdd.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
		}
	});
	btnAdd.setFont(new Font("Times New Roman", Font.BOLD, 16));
	btnAdd.setBounds(185, 426, 225, 29);
	getContentPane().add(btnAdd);
	
	JButton btnFinish = new JButton("finish");
	btnFinish.setFont(new Font("Times New Roman", Font.PLAIN, 16));
	btnFinish.setBounds(368, 473, 117, 29);
	getContentPane().add(btnFinish);
}
}

