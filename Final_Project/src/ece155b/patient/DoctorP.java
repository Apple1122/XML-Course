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

public class DoctorP extends JFrame{
public DoctorP() {
	setResizable(false);
	setBounds(0, 0, 580, 630);
	getContentPane().setLayout(null);
	getContentPane().setBackground(new Color(240, 240, 240));
	getContentPane().setFont(new Font("新細明體", Font.PLAIN, 18));
	getContentPane().setLayout(null);
	
	JButton btnNewButton = new JButton("New button");
	getContentPane().add(btnNewButton);
	
	JButton btnSave = new JButton("save");
	btnSave.setFont(new Font("UD Digi Kyokasho NK-B", Font.PLAIN, 16));
	btnSave.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
		}
	});
	btnSave.setBounds(369, 95, 119, 23);
	getContentPane().add(btnSave);
	
	JButton btnCancel = new JButton("cancel");
	btnCancel.setFont(new Font("UD Digi Kyokasho NK-B", Font.PLAIN, 16));
	btnCancel.setBounds(369, 128, 119, 23);
	getContentPane().add(btnCancel);
	
	JLabel lblDoctor = new JLabel("Doctor ");
	lblDoctor.setFont(new Font("UD Digi Kyokasho NK-B", Font.PLAIN, 20));
	lblDoctor.setBounds(36, 28, 88, 47);
	getContentPane().add(lblDoctor);
	
	JLabel lblFirstName = new JLabel("First Name :");
	lblFirstName.setFont(new Font("UD Digi Kyokasho NK-B", Font.PLAIN, 16));
	lblFirstName.setBounds(36, 85, 119, 37);
	getContentPane().add(lblFirstName);
	
	JLabel lblLastName = new JLabel("Last Name :");
	lblLastName.setFont(new Font("UD Digi Kyokasho NK-B", Font.PLAIN, 16));
	lblLastName.setBounds(36, 121, 119, 37);
	getContentPane().add(lblLastName);
	
	JLabel lblSubject = new JLabel("Subject :");
	lblSubject.setFont(new Font("UD Digi Kyokasho NK-B", Font.PLAIN, 16));
	lblSubject.setBounds(36, 158, 119, 37);
	getContentPane().add(lblSubject);
	
	JLabel lblAppointmentList = new JLabel("Appointment List :");
	lblAppointmentList.setFont(new Font("UD Digi Kyokasho NK-B", Font.PLAIN, 16));
	lblAppointmentList.setBounds(36, 170, 174, 86);
	getContentPane().add(lblAppointmentList);
	
	JList list_1 = new JList();
	list_1.setBounds(145, 240, 359, 117);
	getContentPane().add(list_1);
	
	JButton button = new JButton("enter");
	button.setFont(new Font("UD Digi Kyokasho NK-B", Font.PLAIN, 16));
	button.setBounds(145, 369, 107, 23);
	getContentPane().add(button);
	
	JButton button_1 = new JButton("delete");
	button_1.setFont(new Font("UD Digi Kyokasho NK-B", Font.PLAIN, 16));
	button_1.setBounds(264, 369, 107, 23);
	getContentPane().add(button_1);
	
	JLabel lblNewLabel = new JLabel("New label");
	lblNewLabel.setBounds(150, 98, 61, 16);
	getContentPane().add(lblNewLabel);
	
	JLabel label = new JLabel("New label");
	label.setBounds(150, 131, 61, 16);
	getContentPane().add(label);
	
	JLabel label_1 = new JLabel("New label");
	label_1.setBounds(150, 170, 61, 16);
	getContentPane().add(label_1);
	
	JButton btnAdd = new JButton("add");
	btnAdd.setFont(new Font("Dialog", Font.PLAIN, 16));
	btnAdd.setBounds(381, 367, 107, 23);
	getContentPane().add(btnAdd);
}
}

