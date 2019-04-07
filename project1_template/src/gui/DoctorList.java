package gui;


import java.awt.BorderLayout;
import java.awt.*;
import java.awt.event.*;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class DoctorList {

	
	private JFrame frame;
	
	public static void main(String [] args)
	{
		new DoctorList();
	}
	
	public DoctorList()
	{
		initialize();
	}
	
	/**
	 * @wbp.parser.entryPoint
	 */
	private void initialize() {
		// TODO Auto-generated method stub
		frame = new JFrame();
		frame.setBounds(100, 100, 1109, 721);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		
		JLabel lblDoctorList = new JLabel("Doctor List");
		lblDoctorList.setFont(new Font("Times New Roman", Font.PLAIN, 40));
		lblDoctorList.setBounds(453, 39, 185, 60);
		frame.getContentPane().add(lblDoctorList);
	
		
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        frame.setVisible(true);
		
		JButton btn_doctor1 = new JButton("Doctor1");
		btn_doctor1.setFont(new Font("新細明體", Font.PLAIN, 20));
		btn_doctor1.setBounds(60, 332, 150, 43);
		btn_doctor1.setActionCommand("d1");
		
		btn_doctor1.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent ae)
			{
				frame.setVisible(false);
				new DoctorData();
			}
		});
		
		frame.getContentPane().add(btn_doctor1);
		
		JButton btn_doctor2 = new JButton("Doctor2");
		btn_doctor2.setFont(new Font("新細明體", Font.PLAIN, 20));
		btn_doctor2.setBounds(265, 332, 150, 43);
		frame.getContentPane().add(btn_doctor2);
		
		JButton btn_doctor3 = new JButton("Doctor3");
		btn_doctor3.setFont(new Font("新細明體", Font.PLAIN, 20));
		btn_doctor3.setBounds(470, 332, 150, 43);
		frame.getContentPane().add(btn_doctor3);
		
		JButton btn_doctor4 = new JButton("Doctor4");
		btn_doctor4.setFont(new Font("新細明體", Font.PLAIN, 20));
		btn_doctor4.setBounds(672, 332, 150, 43);
		frame.getContentPane().add(btn_doctor4);
		
		JButton btn_doctor5 = new JButton("Doctor5");
		btn_doctor5.setFont(new Font("新細明體", Font.PLAIN, 20));
		btn_doctor5.setBounds(878, 332, 150, 43);
		frame.getContentPane().add(btn_doctor5);
		
		JButton btn_doctor6 = new JButton("Doctor6");
		btn_doctor6.setFont(new Font("新細明體", Font.PLAIN, 20));
		btn_doctor6.setBounds(60, 609, 150, 43);
		frame.getContentPane().add(btn_doctor6);
		
		JButton btn_doctor7 = new JButton("Doctor7");
		btn_doctor7.setFont(new Font("新細明體", Font.PLAIN, 20));
		btn_doctor7.setBounds(265, 609, 150, 43);
		frame.getContentPane().add(btn_doctor7);
		
		JButton btn_doctor8 = new JButton("Doctor8");
		btn_doctor8.setFont(new Font("新細明體", Font.PLAIN, 20));
		btn_doctor8.setBounds(470, 609, 150, 43);
		frame.getContentPane().add(btn_doctor8);
		
		JButton btn_doctor9 = new JButton("Doctor9");
		btn_doctor9.setFont(new Font("新細明體", Font.PLAIN, 20));
		btn_doctor9.setBounds(672, 609, 150, 43);
		frame.getContentPane().add(btn_doctor9);
		
		JButton btnAddDoctor = new JButton("Add Doctor");
		btnAddDoctor.setFont(new Font("Times New Roman", Font.PLAIN, 20));

		btnAddDoctor.setBounds(878, 439, 179, 107);

		btnAddDoctor.setBounds(899, 456, 129, 83);
		btnAddDoctor.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent ae)
			{
				frame.setVisible(false);
				new EditDoctorData();
			}
		});
		

		frame.getContentPane().add(btnAddDoctor);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(60, 103, 150, 200);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel label = new JLabel("New label");
		label.setBounds(265, 103, 150, 200);
		frame.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("New label");
		label_1.setBounds(470, 109, 150, 200);
		frame.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("New label");
		label_2.setBounds(672, 103, 150, 200);
		frame.getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("New label");
		label_3.setBounds(878, 103, 150, 200);
		frame.getContentPane().add(label_3);
		
		JLabel label_4 = new JLabel("New label");
		label_4.setBounds(60, 385, 150, 200);
		frame.getContentPane().add(label_4);
		
		JLabel label_5 = new JLabel("New label");
		label_5.setBounds(265, 385, 150, 200);
		frame.getContentPane().add(label_5);
		
		JLabel label_6 = new JLabel("New label");
		label_6.setBounds(470, 385, 150, 200);
		frame.getContentPane().add(label_6);
		
		JLabel label_7 = new JLabel("New label");
		label_7.setBounds(672, 385, 150, 200);
		frame.getContentPane().add(label_7);
		

	}
}







