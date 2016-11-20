/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drme;

import java.awt.*;
import java.awt.Desktop;
import java.awt.EventQueue;
import java.awt.event.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import javax.swing.*;

public class DrMeLinkPsychology extends JFrame {
	
	// data members specified
	private JPanel panel;
    private JLabel linktoWebPage;
    
   
    //constructor
    public DrMeLinkPsychology() 
    {
    	
    	this.setTitle("	Dr.Me Psychology Test");
        this.setSize(400,100);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);

        panel = new JPanel();
        linktoWebPage = new JLabel();

        linktoWebPage.setText("<html> click the link : <a href=\"\">http://www.outofservice.com/bigfive/</a></html>");
        linktoWebPage.setCursor(new Cursor(Cursor.HAND_CURSOR));

    	panel.add(linktoWebPage);
        this.setContentPane(panel);
        this.setVisible(true);
   
        goWebsite(linktoWebPage);
    }
    
    private void goWebsite(JLabel website) 
    {
        website.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                try {
                    Desktop.getDesktop().browse(new URI("http://www.outofservice.com/bigfive/"));
                    dispose();
                } catch (Exception ex) {
                   System.out.println(ex);
                }
            }
        });
        
    }
    
}
