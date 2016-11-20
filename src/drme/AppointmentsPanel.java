/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drme;

import java.util.ArrayList;
import javax.swing.*;

/**
 *
 * @author Sarp
 */
public class AppointmentsPanel extends JPanel{
    
    ArrayList<String> patients;
    JLabel label;
    public AppointmentsPanel(String dname)
    {
        DBConnect con = new DBConnect("appointments");
        patients = con.seeAppointments(dname);
        System.out.println(patients);
        for(String x : patients)
        {
            label = new JLabel(x);
            this.add(label);
            System.out.println("ğlö" + x);
        }
          
    }
    
}
