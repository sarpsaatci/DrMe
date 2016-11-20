/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drme;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.ArrayList;
import javax.swing.event.*;

/**
 *
 * @author sarp.saatci
 */
public class IllnessResultsPanel extends JFrame{
    
    JList illnessList;
    String pname;
    JPanel doctorsPanel = new JPanel();
    public IllnessResultsPanel(String[] illnesses, String pname)
    {
        
        this.pname = pname;
        
        illnessList = new JList(illnesses);
        illnessList.addListSelectionListener(new IllnessesListener());
        //illnessList.""
        illnessList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
        

        this.setTitle("Results");
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.getContentPane().add(illnessList);
        this.pack();
        this.getContentPane().add(doctorsPanel);
        this.pack();
        this.setVisible(true);
        
    }
    
    private class IllnessesListener implements ListSelectionListener
    {
        public void valueChanged(ListSelectionEvent e)
        {
            //String i = ((JList) e.getSource()).getToolTipText(e);
            String i =(String) ((JList) e.getSource()).getSelectedValue();
            System.out.println(i);
            IllnessSearchDBConnect db = new IllnessSearchDBConnect("illnesses");
            
            String b = db.searchBranchofIllness(i);
            
            DBConnect doctordb = new DBConnect("doctors");
            
            ArrayList<String> doctors = doctordb.getDoctorsbyBranch(b);
            
            JButton button = null;
            JPanel butPan = new JPanel();
            for(String doctor : doctors)
            {
                button = new JButton(doctor);
                button.addActionListener(new DoctorListener());
                doctorsPanel.add(button);
            }
                //button.addActionListener(new DoctorListener());
            
            System.out.println(doctors);
        }
        
    }
    
    protected class DoctorListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            DBConnect con = new DBConnect("appointments");
            con.makeAppointment(pname, ((JButton)e.getSource()).getText());
        }
    }
    
}
