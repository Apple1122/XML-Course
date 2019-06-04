package ece155b.doctor;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JList;
import java.awt.Color;

public class DoctorApp extends JFrame {
	private JTextField textField_name;
	private JTextField textField_lastName;
	private JTextField textField_subject;

	public DoctorApp() {
		setFont(null);
		setResizable(false);
		setBounds(0, 0, 580, 630);

		getContentPane().setBackground(new Color(240, 240, 240));
		getContentPane().setFont(new Font("新細明體", Font.PLAIN, 18));
		getContentPane().setLayout(null);

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

		textField_name = new JTextField();
		textField_name.setBounds(151, 94, 186, 21);
		getContentPane().add(textField_name);
		textField_name.setColumns(10);

		textField_lastName = new JTextField();
		textField_lastName.setBounds(151, 130, 186, 21);
		getContentPane().add(textField_lastName);
		textField_lastName.setColumns(10);

		textField_subject = new JTextField();
		textField_subject.setBounds(151, 168, 186, 21);
		getContentPane().add(textField_subject);
		textField_subject.setColumns(10);

		JList list_patient = new JList();
		list_patient.setBounds(150, 218, 359, 117);
		getContentPane().add(list_patient);

		JLabel lblPatientList = new JLabel("Patient List :");
		lblPatientList.setFont(new Font("UD Digi Kyokasho NK-B", Font.PLAIN, 16));
		lblPatientList.setBounds(36, 205, 119, 37);
		getContentPane().add(lblPatientList);

		JLabel lblAppointmentList = new JLabel("Appointment List :");
		lblAppointmentList.setFont(new Font("UD Digi Kyokasho NK-B", Font.PLAIN, 16));
		lblAppointmentList.setBounds(37, 345, 174, 86);
		getContentPane().add(lblAppointmentList);

		JButton btnEnter = new JButton("enter");
		btnEnter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnEnter.setFont(new Font("UD Digi Kyokasho NK-B", Font.PLAIN, 16));
		btnEnter.setBounds(151, 345, 107, 23);
		getContentPane().add(btnEnter);

		JButton btnDelete = new JButton("delete");
		btnDelete.setFont(new Font("UD Digi Kyokasho NK-B", Font.PLAIN, 16));
		btnDelete.setBounds(268, 345, 107, 23);
		getContentPane().add(btnDelete);

		JList list_appointment = new JList();
		list_appointment.setBounds(151, 404, 359, 117);
		getContentPane().add(list_appointment);

		JButton btnAppointmentEnter = new JButton("enter");
		btnAppointmentEnter.setFont(new Font("UD Digi Kyokasho NK-B", Font.PLAIN, 16));
		btnAppointmentEnter.setBounds(151, 531, 107, 23);
		getContentPane().add(btnAppointmentEnter);

		JButton btnAppointmentDelete = new JButton("delete");
		btnAppointmentDelete.setFont(new Font("UD Digi Kyokasho NK-B", Font.PLAIN, 16));
		btnAppointmentDelete.setBounds(268, 531, 107, 23);
		getContentPane().add(btnAppointmentDelete);
	}
}