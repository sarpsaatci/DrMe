/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drme;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

/**
 *
 * @author sarp.saatci
 */
public class OfficerSignUp extends JFrame{
    
    JButton button;
    OfficerSignUpPanel panel;
    
    public OfficerSignUp()
    {
        button = new JButton("Submit");
        button.addActionListener(new ButtonListener());
        panel = new OfficerSignUpPanel();
        JPanel buttonpanel = new JPanel();
        buttonpanel.add(button);
        
        JPanel main = new JPanel();
        
        main.add(panel);
        main.add(buttonpanel);
        
        main.setLayout(new GridLayout(2, 1));
        
        
        this.setTitle("Officer Sign Up");
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.getContentPane().add(main);
        this.pack();
        //this.getContentPane().add(buttonpanel);
        //this.pack();
        this.setVisible(true);
    }
    
    private class ButtonListener implements ActionListener
    {
        public void actionPerformed(ActionEvent evt)
        {
            dispose();    

            panel.name = panel.NameField.getText();
            panel.surname = panel.SurnameField.getText();
            panel.hospital = (String) panel.WorkingPlaceComboBox.getSelectedItem();
            panel.ssn = panel.SSNField.getText();

            DBConnect connect = new DBConnect("officers");
            int[] ary = connect.getIDs();
            Officer off;
            if(ary.length<1)
            {
                off = new Officer(3000, panel.name, panel.surname, panel.hospital, panel.ssn);
                JOptionPane.showMessageDialog(null,"Your ID  is 3000");
            }
            else
            {
                off = new Officer(ary[ary.length-1]+1, panel.name, panel.surname, panel.hospital, panel.ssn);
                JOptionPane.showMessageDialog(null,"Your ID  is " + (ary[ary.length-1]+1));
            }
            connect.addOfficer(off);
        }
    }
    
}
