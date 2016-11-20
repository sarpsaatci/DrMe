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
public class PatientTabbedPane extends JTabbedPane{
    
    String pname;
    
    public PatientTabbedPane(int age, String pname)
    {
            super();
            this.pname = pname;
            this.addTab("Symptom Check", new SymptomCheckPanel(pname));
            this.addTab("Other Tests", new OtherTestsPanel(age));
            this.addTab("User Info", new PatientUserInfoPanel(pname));
    }

}