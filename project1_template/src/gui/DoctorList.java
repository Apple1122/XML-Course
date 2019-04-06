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
		
		JPanel panel_0 = new JPanel();
		panel_0.setBounds(60, 122, 150, 187);
		frame.getContentPane().add(panel_0);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(265, 123, 150, 187);
		frame.getContentPane().add(panel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(470, 122, 150, 187);
		frame.getContentPane().add(panel_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(672, 122, 150, 187);
		frame.getContentPane().add(panel_3);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(878, 122, 150, 187);
		frame.getContentPane().add(panel_4);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBounds(60, 398, 150, 187);
		frame.getContentPane().add(panel_5);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBounds(265, 398, 150, 187);
		frame.getContentPane().add(panel_6);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBounds(470, 398, 150, 187);
		frame.getContentPane().add(panel_7);
	
		
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        frame.setVisible(true);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBounds(672, 398, 150, 187);
		frame.getContentPane().add(panel_8);
		
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
		

	}
	
	/* add doctors from xml */
//	private void setUpDoctors()
//	{
//		
//	}
//	
//	/* add each doctor into panel with doctor vector*/
//	private void addDoctor()
//	{
//		JPanel doctorPanel = new JPanel();
//		doctorPanel.setLayout(new BorderLayout());
//		
//		ImageIcon icon = new ImageIcon("/Users/kylehuang/CCU/Courses/XML/project/Projects/project1_template/img/doctors/dr1.jpeg");
//    	
//    	JLabel doctorImage = new JLabel(icon);
//		doctorPanel.add(
//				doctorImage
//				, BorderLayout.NORTH);
//		
//		JButton enterProfile = new JButton("Apple jj");
//		
//		doctorPanel.add(enterProfile, BorderLayout.CENTER);
//		
////		doctorList.add(doctorPanel);
//		
//		
//		
//		
//		
//		
//		JPanel doctorPanel1 = new JPanel();
//		doctorPanel1.setLayout(new BorderLayout());
//		
//	
//    	JLabel doctorImage1 = new JLabel(icon);
//		doctorPanel1.add(
//				doctorImage1
//				, BorderLayout.NORTH);
//		JButton enterProfile1 = new JButton("Apple jj");
//		
//		doctorPanel1.add(enterProfile1, BorderLayout.SOUTH);
//		
////		doctorList.add(doctorPanel1);
////		for(Doctor d : doctors)
////		{
////			JPanel doctorPanel = new JPanel();
////			
////			doctorPanel.add(new DoctorListImagePanel(d.getImageFilePath()));
////			
////			JButton enterProfile = new JButton(d.getName() +" " + d.getLastname());
////			
////			enterProfile.addActionListener( new ActionListener()
////			{
////				@Override
////				public void actionPerformed(ActionEvent e) {
////					// enter DoctorData Page
////					
////				}
////			});
////			doctorPanel.add(enterProfile);
////		}
//		
//	}
//	
}







