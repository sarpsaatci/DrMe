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
 * @author Sarp
 */
public class SymptomCheckPanel extends JPanel{
    
    IllnessSearchDBConnect con;
    JLabel label;
    JButton NextButton;
    String bp = "";
    String pname;
    JCheckBox selected;
    
    
    public SymptomCheckPanel(String pname)
    {
        super();
        this.con = new IllnessSearchDBConnect("illnesses");
        
        this.pname = pname;
        
        String[] bodyparts = {"General-Skin", "General", "Head", "Legs", "Arms", "Upper Body", "Lower Body", "Genitals", "Stomach"};
        
        for(String str : bodyparts)
        {
            JCheckBox cb = new JCheckBox(str);
            add(cb);
            cb.addActionListener(new CheckBoxListener());
            
        }   
        
        this.NextButton = new JButton("Next");
        add(NextButton);
        NextButton.addActionListener(new NextButtonListener());
    }
    
    private class CheckBoxListener implements ActionListener
    {
        public void actionPerformed(ActionEvent evt)
        {
            bp = ((JCheckBox)evt.getSource()).getText();
           selected = (JCheckBox)evt.getSource();
        }
    }
    
    private class NextButtonListener implements ActionListener
    {
        public void actionPerformed(ActionEvent evt) 
        {
            //JFrame frm = new JFrame("Symptoms");
            //frm.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            //frm.getContentPane().add(new SymptomsPanel(bp));
            //frm.pack();
            //frm.setVisible(true);
            new SymptomsPanel(bp, pname);
            selected.setSelected(false);
        }                      
    }
                      

}
