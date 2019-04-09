package gui;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;

import data.Doctor;
import xml.CreateXML;
import javax.swing.JButton;

public class DeleteDoctorPage {

	private JFrame frame;
	
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
		
		JPanel panel = new JPanel();
		panel.setBounds(113, 151, 641, 531);
		panel.setLayout(null);
		frame.getContentPane().add(panel);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.setBounds(777, 595, 174, 29);
		btnDelete.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnDelete.setVisible(false);
		frame.getContentPane().add(btnDelete);
				
		DefaultListModel model = new DefaultListModel();
		JList list = new JList(model);
		int count = 1;
		for(Doctor doctor : CreateXML.doctorList)
		{
			model.add(count++, doctor.getName() + " " + doctor.getLastName());
		}
		list.setBounds(52, 440, 542, -331);
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
							CreateXML.doctorList.remove(index);
							CreateXML.createNewXML();
						}
					});
				}
			}
		});
		panel.add(list);
		
		JButton btnBack = new JButton("Back");
		btnBack.setBounds(6, 88, 117, 29);
		btnBack.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnBack.addActionListener(new ActionListener() 
		{

			@Override
			public void actionPerformed(ActionEvent e) 
			{
				DoctorList.openVisible();
				frame.dispose();
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
