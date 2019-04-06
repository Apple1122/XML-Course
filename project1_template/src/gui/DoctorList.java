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

import ece155b.data.Doctor;

public class DoctorList extends JFrame{

	private Vector<Doctor> doctors;
	private JPanel doctorList;
	private JFrame jFrame;
	
	public static void main(String [] args)
	{
		new DoctorList();
	}
	
	public DoctorList()
	{
		jFrame = new JFrame("Doctor List");
		jFrame.setTitle("Doctor List");
		setSize(600,600);
		
		doctorList = new JPanel();
		doctorList.setBackground(Color.YELLOW);
		doctorList.setLayout(new GridLayout(0, 3));
		// add each doctor into doctorList
		addDoctor();
		
		
		
		
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setVisible(true);
		
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







