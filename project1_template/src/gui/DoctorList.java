package gui;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;

public class DoctorList {

	
	public static void main(String [] args)
	{
		new DoctorList();
	}
	
	public DoctorList()
	{
		JFrame jFrame = new JFrame("Doctor List");
		
		JPanel panel = new JPanel();
		jFrame.getContentPane().add(panel, BorderLayout.NORTH);
		
		JLabel lblDoctorList = new JLabel("Doctor List");
		panel.add(lblDoctorList);
		
		JPanel doctors = new JPanel();
		jFrame.getContentPane().add(doctors, BorderLayout.CENTER);
		
		JLabel lblNewLabel = new JLabel("New label");
		doctors.add(lblNewLabel);
		
		
	}
	
	/* add doctors from xml */
	private void setUpDoctors()
	{
		
	}
	
}
