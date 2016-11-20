/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drme;
import javax.swing.*;
import java.awt.*;

/**
 *
 * @author Sarp
 */
public class DoctorTabbedPane extends JTabbedPane{
    
    String dname;
    
    public DoctorTabbedPane(int ID, String dname)
    {
            super();
            this.dname = dname;
            this.addTab("See Appointments", new AppointmentsPanel(dname));
            this.addTab("Symptom Check", new SymptomCheckPanel(dname));
            this.addTab("User Info", new DoctorUserInfoPanel(dname));
    }

}