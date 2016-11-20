/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drme;
import javax.swing.*;
import java.awt.event.*;
import java.awt.EventQueue;

/**
 *
 * @author Sarp
 */
public class OtherTestsPanel extends JPanel{
    
    public OtherTestsPanel(int age)
    {
            
            if(age > 50)
            {
                JButton eldersonly = new JButton("Elders Only");
                eldersonly.addActionListener(new EldersOnlyListener());
                add(eldersonly);
            }
            
            JButton psytest = new JButton("Psychology Test");
            psytest.addActionListener(new PsyTestListener());
            add(psytest);
    
    }       
    
    private class PsyTestListener implements ActionListener
    {
        
        public void actionPerformed(ActionEvent evt)
        {
            EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new DrMeLinkPsychology().setVisible(true);
            }
            });
        }
    }
    
    private class EldersOnlyListener implements ActionListener
    {
        
        public void actionPerformed(ActionEvent evt)
        {
            
        }
    }
    
}
