package ece155b.doctor;

import ece155b.common.Common;
import ece155b.common.Message;
import ece155b.doctor.comm.ConnHandler;
import ece155b.doctor.data.Doctor;
import ece155b.doctor.xml.DocParser;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import javax.swing.*;

public class DoctorApp extends JFrame {
    
    public Doctor doctor;
    private int PortNo;
    
    private ConnHandler connh;
    
    public static void main(String [] args) {
        new DoctorApp();
    }
    
    public DoctorApp() {
        try {
            doctor = new DocParser(new File("patients.xml")).doctor;
        } catch (Exception ex){
            System.out.println("Error reading file");
        }
        
        int PortNo  = 1111;
        connh 	= new ConnHandler(this, PortNo);
        GUI();
    }
    
    JTextArea texta;
    
    public void GUI() {
        setLayout(new BorderLayout());
        
        texta = new JTextArea();
        JScrollPane scroll = new JScrollPane(texta);
        texta.setLineWrap(true);
        texta.setWrapStyleWord(true);
        
        JButton testme = new JButton("Broadcast message");
        testme.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                
                Message msg = new Message();
                msg.type = Common.BROADCAST;
                msg.from = "The doctor";
                
                msg.content = "Test broadcast from doctor";
                
                connh.broadcast(msg);
            }
        });
        
        getContentPane().add(scroll, BorderLayout.CENTER);
        getContentPane().add(testme, BorderLayout.SOUTH);
        
        setTitle("Doctor Application");
        setSize(600,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setVisible(true);
    }
    
    public void append(String str) {
        texta.append("\n"+str);
    }
}