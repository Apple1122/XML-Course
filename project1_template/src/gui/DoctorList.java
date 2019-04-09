package gui;


import java.awt.BorderLayout;
import java.awt.*;
import java.awt.event.*;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import data.Doctor;
import xml.CreateXML;

public class DoctorList {
	
	private static JFrame frame;
	private JLabel[] labels;
	private JButton[] buttons;
	
	public static void main(String [] args)
	{
		new DoctorList();
	}
	
	/* constructor */
	public DoctorList()
	{
		initialize();
	}
	
	/**
	 * @wbp.parser.entryPoint
	 */
	private void initialize() 
	{
		
		frame = new JFrame();
		frame.setBounds(100, 100, 1109, 721);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setVisible(true);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		
		JLabel title = new JLabel("Doctor List");
		title.setFont(new Font("Times New Roman", Font.PLAIN, 40));
		title.setBounds(453, 39, 185, 60);
		frame.getContentPane().add(title);
        frame.setVisible(true);
        

        addDoctorLabel();
        addDoctorButton();
        
		JButton btnAddDoctor = new JButton("Add Doctor");
		btnAddDoctor.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnAddDoctor.setBounds(899, 456, 129, 83);
		btnAddDoctor.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent ae)
			{
				new AddNewDoctor();
			}
		});
		frame.getContentPane().add(btnAddDoctor);
		
		JButton btnDeleteDoctor = new JButton("Delete Doctor");
		btnDeleteDoctor.setBounds(899, 581, 117, 29);
		btnDeleteDoctor.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnDeleteDoctor.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent ae)
			{
				new DeleteDoctorPage();
			}
		});
		frame.getContentPane().add(btnDeleteDoctor);
		

	}
	
	/* add doctor label and put on icon individually */
	private void addDoctorLabel()
	{
		labels = new JLabel[9];
		
		JLabel dlabel_1 = new JLabel();
		dlabel_1.setBounds(60, 103, 150, 200);
		labels[0] = dlabel_1;
		frame.getContentPane().add(dlabel_1);
		
		
		JLabel dlabel_2 = new JLabel();
		dlabel_2.setBounds(265, 103, 150, 200);
		labels[1] = dlabel_2;
		frame.getContentPane().add(dlabel_2);
		
		JLabel dlabel_3 = new JLabel();
		dlabel_3.setBounds(470, 109, 150, 200);
		labels[2] = dlabel_3;
		frame.getContentPane().add(dlabel_3);
		
		JLabel dlabel_4 = new JLabel();
		dlabel_4.setBounds(672, 103, 150, 200);
		labels[3] = dlabel_4;
		frame.getContentPane().add(dlabel_4);
		
		JLabel dlabel_5 = new JLabel();
		dlabel_5.setBounds(878, 103, 150, 200);
		labels[4] = dlabel_5;
		frame.getContentPane().add(dlabel_5);
		
		JLabel dlabel_6 = new JLabel();
		dlabel_6.setBounds(60, 385, 150, 200);
		labels[5] = dlabel_6;
		frame.getContentPane().add(dlabel_6);
		
		JLabel dlabel_7 = new JLabel();
		dlabel_7.setBounds(265, 385, 150, 200);
		labels[6] = dlabel_7;
		frame.getContentPane().add(dlabel_7);
		
		JLabel dlabel_8 = new JLabel();
		dlabel_8.setBounds(470, 385, 150, 200);
		labels[7] = dlabel_8;
		frame.getContentPane().add(dlabel_8);
		
		JLabel dlabel_9 = new JLabel();
		dlabel_9.setBounds(672, 385, 150, 200);
		labels[8] = dlabel_9;
		frame.getContentPane().add(dlabel_9);
		
		// for each
//		int index = 0;
//		for(Doctor doctor : CreateXML.doctorList)
//		{
//			labels[index++].setIcon(new ImageIcon(doctor.getPhotoPath()));
//			if(index > CreateXML.doctorList.size())
//				break;
//		}
		
	}
	
	
	/* add doctor button series */
	private void addDoctorButton()
	{
		buttons = new JButton[9];
		
		// Button: doctor1
		JButton btn_doctor1 = new JButton("Doctor1");
		btn_doctor1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btn_doctor1.setBounds(60, 332, 150, 43);
		btn_doctor1.setVisible(true);
		btn_doctor1.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent ae)
			{
				frame.setVisible(false);
				new DoctorData(1);
			}
		});
		buttons[0] = btn_doctor1;
		frame.getContentPane().add(btn_doctor1);
		
		// Button: doctor2
		JButton btn_doctor2 = new JButton("Doctor2");
		btn_doctor2.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btn_doctor2.setBounds(265, 332, 150, 43);
		btn_doctor2.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent ae)
			{
				frame.setVisible(false);
				new DoctorData(2);
			}
		});
		buttons[1] = btn_doctor2;
		frame.getContentPane().add(btn_doctor2);
		
		// Button: doctor3
		JButton btn_doctor3 = new JButton("Doctor3");
		btn_doctor3.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btn_doctor3.setBounds(470, 332, 150, 43);
		btn_doctor3.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent ae)
			{
				frame.setVisible(false);
				new DoctorData(3);
			}
		});
		buttons[2] = btn_doctor3;
		frame.getContentPane().add(btn_doctor3);
		
		// Button: doctor4
		JButton btn_doctor4 = new JButton("Doctor4");
		btn_doctor4.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btn_doctor4.setBounds(672, 332, 150, 43);
		btn_doctor4.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent ae)
			{
				frame.setVisible(false);
				new DoctorData(4);
			}
		});
		buttons[3] = btn_doctor4;
		frame.getContentPane().add(btn_doctor4);
		
		// Button: doctor5
		JButton btn_doctor5 = new JButton("Doctor5");
		btn_doctor5.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btn_doctor5.setBounds(878, 332, 150, 43);
		btn_doctor5.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent ae)
			{
				frame.setVisible(false);
				new DoctorData(5);
			}
		});
		buttons[4] = btn_doctor5;
		frame.getContentPane().add(btn_doctor5);
		
		// Button: doctor6
		JButton btn_doctor6 = new JButton("Doctor6");
		btn_doctor6.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btn_doctor6.setBounds(60, 609, 150, 43);
		btn_doctor6.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent ae)
			{
				frame.setVisible(false);
				new DoctorData(6);
			}
		});
		buttons[5] = btn_doctor6;
		frame.getContentPane().add(btn_doctor6);
		
		// Button: doctor7
		JButton btn_doctor7 = new JButton("Doctor7");
		btn_doctor7.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btn_doctor7.setBounds(265, 609, 150, 43);
		btn_doctor7.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent ae)
			{
				frame.setVisible(false);
				new DoctorData(7);
			}
		});
		buttons[6] = btn_doctor7;
		frame.getContentPane().add(btn_doctor7);
		
		// Button: doctor8
		JButton btn_doctor8 = new JButton("Doctor8");
		btn_doctor8.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btn_doctor8.setBounds(470, 609, 150, 43);
		btn_doctor8.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent ae)
			{
				frame.setVisible(false);
				new DoctorData(8);
			}
		});
		buttons[7] = btn_doctor8;
		frame.getContentPane().add(btn_doctor8);
		
		// Button: doctor9
		JButton btn_doctor9 = new JButton("Doctor9");
		btn_doctor9.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btn_doctor9.setBounds(672, 609, 150, 43);
		btn_doctor9.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent ae)
			{
				frame.setVisible(false);
				new DoctorData(9);
			}
		});
		buttons[8] = btn_doctor9;
		frame.getContentPane().add(btn_doctor9);
		
	}
	
	
	/* set frame visible to true */
	public static void openVisible()
	{
		frame.setVisible(true);
		
		// https://stackoverflow.com/questions/3718435/refresh-jframe-after-adding-new-components
		// http://www.java2s.com/Questions_And_Answers/Swing/JFrame/Refresh.htm
		frame.revalidate();
		frame.repaint();
	}
}







