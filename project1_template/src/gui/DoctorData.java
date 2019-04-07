package gui;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;

public class DoctorData {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
	}

	/**
	 * Create the application.
	 * @wbp.parser.entryPoint
	 */
	public DoctorData() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1109, 721);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		
		JButton btnBack = new JButton("Back");
		btnBack.setFont(new Font("新細明體", Font.PLAIN, 20));
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				new DoctorList();
			}
		});
		btnBack.setBounds(51, 394, 107, 23);
		frame.getContentPane().add(btnBack);
		
		
		JButton btnEditDoctor = new JButton("Edit");
		btnEditDoctor.setFont(new Font("新細明體", Font.PLAIN, 20));
		btnEditDoctor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				new EditDoctorData();
			}
		});
		btnEditDoctor.setBounds(51, 331, 107, 33);
		frame.getContentPane().add(btnEditDoctor);
		
		JButton btnAddPatient = new JButton("Add");
		btnAddPatient.setFont(new Font("新細明體", Font.PLAIN, 20));
		btnAddPatient.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				new AddPatientData();
			}
		});
		btnAddPatient.setBounds(374, 606, 107, 48);
		frame.getContentPane().add(btnAddPatient);
		
		JLabel lblPatient = new JLabel("Patient");
		lblPatient.setFont(new Font("新細明體", Font.PLAIN, 20));
		lblPatient.setBounds(493, 607, 95, 44);
		frame.getContentPane().add(lblPatient);
		
		JLabel lblDoctorFirstname = new JLabel("Name:");
		lblDoctorFirstname.setFont(new Font("新細明體", Font.PLAIN, 20));
		lblDoctorFirstname.setBounds(258, 111, 95, 21);
		frame.getContentPane().add(lblDoctorFirstname);
		
		
		JLabel lblDoctorLastname = new JLabel("Last Name:");
		lblDoctorLastname.setFont(new Font("新細明體", Font.PLAIN, 20));
		lblDoctorLastname.setBounds(215, 144, 114, 23);
		frame.getContentPane().add(lblDoctorLastname);
		
		JLabel lblSubject = new JLabel("Subject:");
		lblSubject.setFont(new Font("新細明體", Font.PLAIN, 20));
		lblSubject.setBounds(244, 179, 85, 23);
		frame.getContentPane().add(lblSubject);
		
		JLabel lblSex = new JLabel("Sex:");
		lblSex.setFont(new Font("新細明體", Font.PLAIN, 20));
		lblSex.setBounds(287, 214, 42, 23);
		frame.getContentPane().add(lblSex);
		
		JLabel lblDoctorData = new JLabel("Doctor Data");
		lblDoctorData.setFont(new Font("Times New Roman", Font.PLAIN, 40));
		lblDoctorData.setBounds(34, 43, 292, 33);
		frame.getContentPane().add(lblDoctorData);
		
		JLabel lblNewLabel = new JLabel("Johnson");
		lblNewLabel.setFont(new Font("新細明體", Font.PLAIN, 20));
		lblNewLabel.setBounds(390, 111, 170, 21);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("CHEN");
		lblNewLabel_1.setFont(new Font("新細明體", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(390, 145, 95, 21);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("DICK");
		lblNewLabel_2.setFont(new Font("新細明體", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(390, 180, 78, 21);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("M");
		lblNewLabel_3.setFont(new Font("新細明體", Font.PLAIN, 20));
		lblNewLabel_3.setBounds(389, 215, 95, 21);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel label = new JLabel("New label");
		label.setBounds(34, 97, 150, 200);
		frame.getContentPane().add(label);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		btnDelete.setBounds(587, 606, 107, 48);
		btnDelete.setVisible(false);
		frame.getContentPane().add(btnDelete);
		
		
		
		
		DefaultListModel model = new DefaultListModel();
	    JList list = new JList(model);
	    
		String[] items = { "A", "B", "C", "D" };
		for (int i = 0; i < items.length; i++) {
			model.add(i, items[i]);
		}
		
		list.addMouseListener(new MouseAdapter() 
		{
			public void mouseClicked(MouseEvent mouseEvent) 
			{
				if(mouseEvent.getClickCount() == 2) 
				{
					btnDelete.setVisible(true);
				}
			}
		});
		
		list.setBounds(244, 276, 479, 278);
		frame.getContentPane().add(list);
		
		
	}
}
