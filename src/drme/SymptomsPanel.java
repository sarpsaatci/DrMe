/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drme;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
/**
 *
 * @author Sarp
 */
public class SymptomsPanel extends JFrame
{
    
    IllnessSearchDBConnect con,illsearch;
    JList list;
    JCheckBox[] cb;
    JButton search;
    ArrayList<String> symptoms = new ArrayList<String>();
    String bp;
    String ill;
    String pname;
    public SymptomsPanel(String bodypart, String pname)
    {
        
        this.pname = pname; 
        

        JPanel panel = new JPanel();
        
        this.bp = bodypart;
        this.con = new IllnessSearchDBConnect("illnesses");
        String[] arr = con.getSymptoms(bodypart);
        cb = new JCheckBox[arr.length];
        for(int i = 0; i < cb.length; i++)
        {
            cb[i] = new JCheckBox(arr[i]);
            cb[i].addActionListener(new CheckBoxListener());
            panel.add(cb[i]);
        }
        
        //list = new JList(cb);
        //add(list);
        this.search = new JButton("Search");
        
        search.addActionListener(new SearchButtonListener());
        panel.add(search);
        
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.getContentPane().add(panel);
        this.pack();
        this.setVisible(true);
        
        
    }
    
    private class CheckBoxListener implements ActionListener
    {
        public void actionPerformed(ActionEvent evt)
        {
            String str = ((JCheckBox) evt.getSource()).getText();
            symptoms.add(str);
            
        }
    }
    private class SearchButtonListener implements ActionListener
    {
        public void actionPerformed(ActionEvent evt) 
        {
            String[][] results = new String[symptoms.size()][];
            String s="";
            ArrayList<String> fin = new ArrayList<String>();
            ArrayList<String> as = new ArrayList<String>();
            ArrayList<String> last = new ArrayList<String>();
            IllnessSearchDBConnect db = new IllnessSearchDBConnect("illnesses");
            //for (String str : symptoms)
            //    results.add(db.searchSymptom(str));
            
            for(int a = 0; a<results.length;a++)
               results[a] = db.searchSymptom(symptoms.get(a));
            for(int i = 0; i<results.length;i++)
            {   
                for(int j = 0; j<results[i].length; j++)
                {
                    s = results[i][j];
                       fin.add(s);
                }
            }
            //ArrayList<String> asd = fin;
            for(int i = 0; i < fin.size(); i++)
            {   
                if(!as.contains(fin.get(i)))
                {
                    as.add((String) fin.get(i));
                }  
            }
            String[] mosts = db.searchBodyPart(bp);
            
            for(String str : mosts)
                if(as.contains(str))
                    last.add(0, str);
            
            for(String str : as)
                if(!last.contains(str))
                    last.add(last.size(), str);

            ArrayList<String> ff = new ArrayList<String>();
            for(String illness : last)
                if(db.getSymptomsIllness(illness).containsAll(symptoms))
                    ff.add(illness);
            
            String[] pass = new String[0];
            
            for(String str : ff)
            {
                String[] temp = new String[pass.length+1];
                for(int i = 0; i < pass.length; i++)
                    temp[i] = pass[i];
                temp[pass.length] = str;
                pass = temp;
            }
                    
            //JPanel panel = new JPanel();
            //panel.add(new JList(ff.toArray()));
            new IllnessResultsPanel(pass, pname);
            
            dispose();
            
            //new IllnessResultsPanel(pname);
            

            //JFrame frm = new JFrame("Illnesses");
            //frm.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            //frm.getContentPane().add(panel);
            //frm.pack();
            //frm.setVisible(true);
        }                      
    
    
    }
    
}
