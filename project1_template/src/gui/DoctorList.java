package gui;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;

import ece155b.data.Doctor;

public class DoctorList extends JFrame{


	private Vector<Doctor> doctors;
	private JPanel doctorList;
	private JFrame jFrame;
	
	private JFrame frame;
	public static void main(String [] args)
	{
		
	}
	
	public DoctorList()
	{
		jFrame = new JFrame("Doctor List");
		
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
		frame.getContentPane().setLayout(null);
		
		JLabel lblDoctorList = new JLabel("Doctor List");
		lblDoctorList.setFont(new Font("Times New Roman", Font.PLAIN, 40));
		lblDoctorList.setBounds(453, 39, 185, 60);
		frame.getContentPane().add(lblDoctorList);
		
		JPanel panel = new JPanel();
		panel.setBounds(60, 122, 150, 187);
		frame.getContentPane().add(panel);
		
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
	
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setVisible(true);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBounds(672, 398, 150, 187);
		frame.getContentPane().add(panel_8);
		
		JButton btnDoctor = new JButton("Doctor1");
		btnDoctor.setFont(new Font("新細明體", Font.PLAIN, 20));
		btnDoctor.setBounds(60, 332, 150, 43);
		frame.getContentPane().add(btnDoctor);
		
		JButton button = new JButton("Doctor2");
		button.setFont(new Font("新細明體", Font.PLAIN, 20));
		button.setBounds(265, 332, 150, 43);
		frame.getContentPane().add(button);
		
		JButton button_1 = new JButton("Doctor3");
		button_1.setFont(new Font("新細明體", Font.PLAIN, 20));
		button_1.setBounds(470, 332, 150, 43);
		frame.getContentPane().add(button_1);
		
		JButton button_2 = new JButton("Doctor4");
		button_2.setFont(new Font("新細明體", Font.PLAIN, 20));
		button_2.setBounds(672, 332, 150, 43);
		frame.getContentPane().add(button_2);
		
		JButton button_3 = new JButton("Doctor5");
		button_3.setFont(new Font("新細明體", Font.PLAIN, 20));
		button_3.setBounds(878, 332, 150, 43);
		frame.getContentPane().add(button_3);
		
		JButton button_4 = new JButton("Doctor6");
		button_4.setFont(new Font("新細明體", Font.PLAIN, 20));
		button_4.setBounds(60, 609, 150, 43);
		frame.getContentPane().add(button_4);
		
		JButton button_5 = new JButton("Doctor7");
		button_5.setFont(new Font("新細明體", Font.PLAIN, 20));
		button_5.setBounds(265, 609, 150, 43);
		frame.getContentPane().add(button_5);
		
		JButton button_6 = new JButton("Doctor8");
		button_6.setFont(new Font("新細明體", Font.PLAIN, 20));
		button_6.setBounds(470, 609, 150, 43);
		frame.getContentPane().add(button_6);
		
		JButton button_7 = new JButton("Doctor9");
		button_7.setFont(new Font("新細明體", Font.PLAIN, 20));
		button_7.setBounds(672, 609, 150, 43);
		frame.getContentPane().add(button_7);
		
		JButton btnAddDoctor = new JButton("Add Doctor");
		btnAddDoctor.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnAddDoctor.setBounds(899, 456, 129, 83);
		frame.getContentPane().add(btnAddDoctor);

	}

	/* add doctors from xml */
	private void setUpDoctors()
	{
		
	}
	
	/* add each doctor into panel with doctor vector*/
	private void addDoctor()
	{
		JPanel doctorPanel = new JPanel();
		doctorPanel.setLayout(new BorderLayout());
		
		ImageIcon icon = new ImageIcon("/Users/kylehuang/CCU/Courses/XML/project/Projects/project1_template/img/doctors/dr1.jpeg");
    	
    	JLabel doctorImage = new JLabel(icon);
		doctorPanel.add(
				doctorImage
				, BorderLayout.NORTH);
		
		JButton enterProfile = new JButton("Apple jj");
		
		doctorPanel.add(enterProfile, BorderLayout.CENTER);
		
		doctorList.add(doctorPanel);
		
		
		
		
		
		
		JPanel doctorPanel1 = new JPanel();
		doctorPanel1.setLayout(new BorderLayout());
		
	
    	JLabel doctorImage1 = new JLabel(icon);
		doctorPanel1.add(
				doctorImage1
				, BorderLayout.NORTH);
		JButton enterProfile1 = new JButton("Apple jj");
		
		doctorPanel1.add(enterProfile1, BorderLayout.SOUTH);
		
		doctorList.add(doctorPanel1);
//		for(Doctor d : doctors)
//		{
//			JPanel doctorPanel = new JPanel();
//			
//			doctorPanel.add(new DoctorListImagePanel(d.getImageFilePath()));
//			
//			JButton enterProfile = new JButton(d.getName() +" " + d.getLastname());
//			
//			enterProfile.addActionListener( new ActionListener()
//			{
//				@Override
//				public void actionPerformed(ActionEvent e) {
//					// enter DoctorData Page
//					
//				}
//			});
//			doctorPanel.add(enterProfile);
//		}
		
	}
	
}







