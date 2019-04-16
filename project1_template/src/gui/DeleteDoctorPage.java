package gui;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;

import data.Doctor;
import data.Patient;
import xml.DoctorXmlRW;
import xml.PatientXmlRW;

public class DeleteDoctorPage {

	private JFrame frame;
	
	private DoctorXmlRW doctorXmlRW;
	private PatientXmlRW patientXmlRW;
	
	private ArrayList<Doctor> doctors;
	private ArrayList<Patient> patients;
	
	/**
	 * @wbp.parser.entryPoint
	 */
	public DeleteDoctorPage()
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
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		
		
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.setBounds(777, 595, 174, 29);
		btnDelete.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnDelete.setVisible(false);
		frame.getContentPane().add(btnDelete);
				
		doctorXmlRW = new DoctorXmlRW();
		patientXmlRW = new PatientXmlRW();
		
		doctors = doctorXmlRW.read();
		patients = patientXmlRW.read();
		
		DefaultListModel model = new DefaultListModel();
//		JList list = new JList(model);
//		list.setValueIsAdjusting(true);
//		
//		int count = 0;
//		System.out.println(doctors.size());
//		for(Doctor doctor : doctors)
//		{
//			model.add(count++, doctor.getName() + " " + doctor.getLastName());
//		}
//		list.setBounds(52, 440, 542, -331);
////		panel.add(list);
//		list.addMouseListener(new MouseAdapter() 
//		{
//			public void mouseClicked(MouseEvent mouseEvent) 
//			{
//				if(mouseEvent.getClickCount() == 2) 
//				{
//					int index = list.locationToIndex(mouseEvent.getPoint());
//					btnDelete.setVisible(true);
//					btnDelete.setText("Delete " + list.getModel().getElementAt(index));
//					btnDelete.addActionListener(new ActionListener() 
//					{
//						@Override
//						public void actionPerformed(ActionEvent ae)
//						{
//							
//							for(int j = 0; j < patients.size(); ++j)
//							{
//								if(patients.get(j).getDoctorId() == doctors.get(index).getId())
//									patients.remove(j);
//							}
//							patientXmlRW.write(patients);
//							
//							for(int j = 0; j < doctors.size(); ++j)
//							{
//								if(doctors.get(j).getId() == doctors.get(index).getId())
//								{
//									doctors.remove(j);
//									break;
//								}
//							}
//							doctorXmlRW.write(doctors);
//							
//						}
//					});
//				}
//			}
//		});
//		frame.getContentPane().add(list);
		
//		JScrollPane scrollPane = new JScrollPane(list);
//	      frame.getContentPane().add(scrollPane);
//	      scrollPane.setBounds(113, 151, 641, 531);
//	      scrollPane.setLayout(null);
//	      scrollPane.setVisible(true);
		
		
		DefaultListModel model2 = new DefaultListModel();
	    JList list = new JList(model2);
		
	    int count = 0;
		System.out.println(doctors.size());
		for(Doctor doctor : doctors)
		{
			model2.add(count++, doctor.getName() + " " + doctor.getLastName());
		}
		
		
		list.addMouseListener(new MouseAdapter() 
				{
					public void mouseClicked(MouseEvent mouseEvent) 
					{
						if(mouseEvent.getClickCount() == 2) 
						{
							int index = list.locationToIndex(mouseEvent.getPoint());
							btnDelete.setVisible(true);
							btnDelete.setText("Delete " + list.getModel().getElementAt(index));
							btnDelete.addActionListener(new ActionListener() 
							{
								@Override
								public void actionPerformed(ActionEvent ae)
								{
									
									for(int j = 0; j < patients.size(); ++j)
									{
										if(patients.get(j).getDoctorId() == doctors.get(index).getId())
											patients.remove(j);
									}
									patientXmlRW.write(patients);
									
									for(int j = 0; j < doctors.size(); ++j)
									{
										if(doctors.get(j).getId() == doctors.get(index).getId())
										{
											doctors.remove(j);
											break;
										}
									}
									doctorXmlRW.write(doctors);
									
								}
							});
						}
					}
				});
		
//		list.setBounds(52, 440, 542, -331);
		list.setBounds(244, 275, 479, 278);
		frame.getContentPane().add(list);
		
		JButton btnBack = new JButton("Back");
		btnBack.setBounds(6, 88, 117, 29);
		btnBack.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnBack.addActionListener(new ActionListener() 
		{

			@Override
			public void actionPerformed(ActionEvent e) 
			{
				frame.dispose();
				DoctorList.openVisible();
			}
			
		});
		frame.getContentPane().add(btnBack);
		
		JLabel label_title = new JLabel();
		label_title.setBounds(166, 82, 548, 63);
		frame.getContentPane().add(label_title);
		label_title.setText("Please double click on the doctor which you want to delete!");
		label_title.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		
	
		
		
	}
}
