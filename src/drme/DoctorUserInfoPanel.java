/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drme;

import javax.swing.*;
import java.awt.*;
import java.util.*;

/**
 *
 * @author sarp.saatci
 */
public class DoctorUserInfoPanel extends JPanel{
    
    DBConnect con;
    
    public DoctorUserInfoPanel(String name)
    {
        con = new DBConnect("doctors");
        JLabel label;
        ArrayList<String> info = con.getDoctorInfo(name);
                
        for(String x : info)
        {
            label = new JLabel(x);
            add(label);
        }
        this.setLayout(new GridLayout(7, 1));
        
    }
    
}
