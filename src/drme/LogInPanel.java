/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drme;

import java.util.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

/**
 *
 * @author sarp.saatci
 */
public class LogInPanel extends JFrame{
    
    int ID;
    JTextField IDField;
    
    public LogInPanel()
    {
        JPanel panel = new JPanel();
        JPanel buttons = new JPanel();
        
        IDField = new JTextField("Enter your ID");
        IDField.addMouseListener(new IDListener());
        //IDField.setMinimumSize(new Dimension(125));
        panel.add(IDField);

        JButton loginbutton = new JButton("Log In");
        loginbutton.addActionListener(new LogInButtonListener());
        JButton cancelbutton = new JButton("Cancel");
        cancelbutton.addActionListener(new CancelListener());
        
        
        buttons.add(loginbutton);
        buttons.add(cancelbutton);
        
        buttons.setLayout(new GridLayout(1, 2));
        
        panel.add(buttons);
        
        //panel.setPreferredSize(new Dimension(300, 150));
        panel.setLayout(new GridLayout(2, 1))
                ;
        
        
        this.setTitle("Log In");
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setMinimumSize(new Dimension(300, 150));
        this.getContentPane().add(panel);
        this.setVisible(true);
        
    }
    
    private class LogInButtonListener implements ActionListener
    {
        public void actionPerformed(ActionEvent evt)
        {
            // TODO add your handling code here:
            ID = Integer.parseInt(IDField.getText());

            boolean idNumPatient = false;
            boolean idNumDoctor = false;
            boolean idNumOfficer = false;

            DBConnect dbDoctors = new DBConnect("doctors");
            DBConnect dbOfficers = new DBConnect("officers");
            DBConnect dbPatients = new DBConnect("patients");

            ArrayList<Integer> allIDs = new ArrayList<Integer>();

            for(int id : dbDoctors.getIDs())
                allIDs.add(id);

            for(int id : dbOfficers.getIDs())
                allIDs.add(id);

            for(int id : dbPatients.getIDs())
                allIDs.add(id);

            // dbDoctors.getIDs() + dbOfficers.getIDs();

            if(IDField.getText().substring(0, 1).equals("1"))
            {
                int[] aPat = dbPatients.getIDs();


                for(int id : allIDs)
                    if(ID== id)
                        idNumPatient = true;
                if(idNumPatient)
                {
                    JFrame frm = new JFrame("Hello " + dbPatients.getName(ID));
                    frm.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                    frm.getContentPane().add(new PatientTabbedPane(dbPatients.getAge(ID), dbPatients.getName(ID)));
                    frm.pack();
                    frm.setVisible(idNumPatient);
                }
                else
                    JOptionPane.showMessageDialog(null,"ID not Found");
            }

            if(IDField.getText().substring(0, 1).equals("2"))
            {
                int[] aDoc = dbDoctors.getIDs();

                for(int id : allIDs)
                    if(ID== id)
                        idNumDoctor = true;

                if(idNumDoctor)
                {
                    JFrame frm = new JFrame("Hello Dr. " + dbDoctors.getName(ID));
                    frm.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                    frm.getContentPane().add(new DoctorTabbedPane(ID, dbDoctors.getName(ID)));
                    frm.pack();
                    frm.setVisible(idNumDoctor);
                }
                else
                    JOptionPane.showMessageDialog(null,"ID not Found");
            }

            if(IDField.getText().substring(0, 1).equals("3"))
            {
                int[] aOff = dbOfficers.getIDs();

                for(int id  : allIDs)
                    if(ID== id)
                        idNumOfficer = true;
                if(idNumOfficer)
                {
                    JFrame frm = new JFrame("Hello Officer " + dbOfficers.getName(ID));
                    frm.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                    frm.getContentPane().add(new OfficerPanel());
                    frm.pack();
                    frm.setVisible(idNumOfficer);
                }
                else
                    JOptionPane.showMessageDialog(null,"ID not Found");
            }
            
            if(idNumDoctor || idNumOfficer || idNumPatient)
                dispose();
                
        }
   
    }
    
    private class CancelListener implements ActionListener
    {
        public void actionPerformed(ActionEvent evt) {dispose();}
    }
    
    private class IDListener implements MouseListener
    {
        public void mouseClicked(MouseEvent evt) {((JTextField) evt.getSource()).setText("");}
        public void mouseExited(MouseEvent evt) {}
        public void mouseEntered(MouseEvent evt) {}
        public void mousePressed(MouseEvent evt) {}
        public void mouseReleased(MouseEvent evt) {}
    }
    
}
