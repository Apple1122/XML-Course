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
		
		JLabel title = new JLabel("Doctor List");
		title.setFont(new Font("Times New Roman", Font.PLAIN, 40));
		title.setBounds(453, 39, 185, 60);
		frame.getContentPane().add(title);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        
        ImageIcon icon = new ImageIcon("/Users/kylehuang/CCU/Courses/XML/project/XML-Course/project1_template/bin/img/person.png");
        
		JLabel dlabel_1 = new JLabel(icon);
		dlabel_1.setBounds(60, 103, 150, 200);
		frame.getContentPane().add(dlabel_1);
		
		JLabel dlabel_2 = new JLabel("New label");
		dlabel_2.setBounds(265, 103, 150, 200);
		frame.getContentPane().add(dlabel_2);
		
		JLabel dlabel_3 = new JLabel("New label");
		dlabel_3.setBounds(470, 109, 150, 200);
		frame.getContentPane().add(dlabel_3);
		
		JLabel dlabel_4 = new JLabel("New label");
		dlabel_4.setBounds(672, 103, 150, 200);
		frame.getContentPane().add(dlabel_4);
		
		JLabel dlabel_5 = new JLabel("New label");
		dlabel_5.setBounds(878, 103, 150, 200);
		frame.getContentPane().add(dlabel_5);
		
		JLabel dlabel_6 = new JLabel("New label");
		dlabel_6.setBounds(60, 385, 150, 200);
		frame.getContentPane().add(dlabel_6);
		
		JLabel dlabel_7 = new JLabel("New label");
		dlabel_7.setBounds(265, 385, 150, 200);
		frame.getContentPane().add(dlabel_7);
		
		JLabel dlabel_8 = new JLabel("New label");
		dlabel_8.setBounds(470, 385, 150, 200);
		frame.getContentPane().add(dlabel_8);
		
		JLabel dlabel_9 = new JLabel("New label");
		dlabel_9.setBounds(672, 385, 150, 200);
		frame.getContentPane().add(dlabel_9);
		

        
        
        
		
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
				new EditDoctorData();
			}
		});
		

		frame.getContentPane().add(btnAddDoctor);
		

	}
}







