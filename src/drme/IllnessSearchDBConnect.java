/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drme;

/**
 *
 * @author Sarp
 */
import java.sql.*;
import java.util.*;

public class IllnessSearchDBConnect implements Searchable{
    
    private Connection con;
    private Statement st;
    private PreparedStatement pst;
    private ResultSet rs, rs2;
    
    String tablename;
    
    public IllnessSearchDBConnect(String t)
    {
        tablename = t;
        
        try{
                
            Class.forName("com.mysql.jdbc.Driver");
            
            con = DriverManager.getConnection("jdbc:mysql://mysql.linux.trdns.com/" + "NDB255653", "NDB255653", "yH171a3S");
            st = con.createStatement();
            pst = con.prepareStatement("insert into " + tablename + " values(?, ?, ?, ?, ?, ?, ?)");
                        
        }
        catch(Exception ex){
            System.out.println("Error: " + ex);
            System.out.println(ex.getCause());
        }
    }
    
    public String[] searchSymptom(String symptom)
    {
        String[] illnesses = new String[0];
        
        try
        {
            
            String query = "select * from " + tablename;
            rs = st.executeQuery(query);
                        
            while(rs.next())
            {
                
                if (rs.getString("symptoms").toLowerCase().contains(symptom.toLowerCase()))
                {
                        
                    String[] temp = new String[illnesses.length + 1];
                    temp[illnesses.length] = rs.getString("illness");
                    for(int i = 0; i < illnesses.length; i++)
                        temp[i] = illnesses[i];
                    illnesses = temp;
                    
                }

            }
                                
        }
        catch(Exception ex)
        {
            System.out.println(ex + "AAAA");
        }
        return illnesses;        
    }
    
    public String[] searchIllness(String illness)
    {
        
        String[] bodyparts = new String[0];
        try
        {
            
            String query = "select * from " + tablename;
            rs = st.executeQuery(query);
            
            while(rs.next())
            {
                if (rs.getString("illness").equalsIgnoreCase(illness))
                {
                        Scanner scan = new Scanner(rs.getString("bodypart"));
                        scan.useDelimiter(",");
                        while(scan.hasNext())
                        {
                            String[] temp = new String[bodyparts.length + 1];
                            temp[bodyparts.length] = scan.next();
                            for(int i = 0; i < bodyparts.length; i++)
                                temp[i] = bodyparts[i];
                            bodyparts = temp;
                        }

                }
                                
            }
            
        }
        catch(Exception ex)
        {
            System.out.println(ex + "AAAA");
        }
        return bodyparts;
    }
    
    public String[] getSymptoms(String bodypart)
    {
        String[] symptoms = new String[0];
        //bodyparts[0] = "all";
 
        try
        {
            //System.out.println("Records from database");
            String query = "select * from " + tablename;
            rs = st.executeQuery(query);
            //System.out.println("Records from database");
            //rs2 = st.executeQuery("INSERT INTO `sarp`.`drme` (`illnesses`, `sympthoms`, `branch`) VALUES ('ill', 'symp', 'doctor')");

            while(rs.next())
            {
                if (rs.getString("bodypart").toLowerCase().contains(bodypart.toLowerCase()))
                {
                    Scanner scan = new Scanner(rs.getString("symptoms"));
                    scan.useDelimiter(",");
                    //i++;

                    while(scan.hasNext())    
                    {
                        String[] temp = new String[symptoms.length + 1];
                        temp[symptoms.length] = scan.next();
                        for(int i = 0; i < symptoms.length; i++)
                            temp[i] = symptoms[i];
                        symptoms = temp;
                    }
                }
                
            }
        }
        catch(Exception ex)
        {
            System.out.println(ex.getCause());
        }
        return symptoms;
    }
    
    public ArrayList<String> getSymptomsIllness(String illness)
    {
        ArrayList<String> symptoms = new ArrayList<String>();
        //String[] symptoms = new String[0];
        //bodyparts[0] = "all";
 
        try
        {
            //System.out.println("Records from database");
            String query = "select * from " + tablename;
            rs = st.executeQuery(query);
            //System.out.println("Records from database");
            //rs2 = st.executeQuery("INSERT INTO `sarp`.`drme` (`illnesses`, `sympthoms`, `branch`) VALUES ('ill', 'symp', 'doctor')");

            while(rs.next())
            {
                if (rs.getString("illness").toLowerCase().contains(illness.toLowerCase()))
                {
                    Scanner scan = new Scanner(rs.getString("symptoms"));
                    scan.useDelimiter(",");
                    //i++;

                    while(scan.hasNext())    
                    {
                       /* String[] temp = new String[symptoms.length + 1];
                        temp[symptoms.length] = scan.next();
                        for(int i = 0; i < symptoms.length; i++)
                            temp[i] = symptoms[i];
                        symptoms = temp;*/
                        symptoms.add(scan.next());
                    }
                }
                
            }
        }
        catch(Exception ex)
        {
            System.out.println(ex.getCause());
        }
        return symptoms;
    }
    
    public String[] getBodyParts()
    {
        int i= 0;
        String[] bodyparts = new String[5];
        //bodyparts[0] = "all";
 
        try
        {
            //System.out.println("Records from database");
            String query = "select * from " + tablename;
            rs = st.executeQuery(query);
            //System.out.println("Records from database");
            //rs2 = st.executeQuery("INSERT INTO `sarp`.`drme` (`illnesses`, `sympthoms`, `branch`) VALUES ('ill', 'symp', 'doctor')");

            while(rs.next())
            {
               // bodyparts = new String[5];
                //boolean flag = false;
                Scanner scan = new Scanner(rs.getString("bodypart"));
              //  for(int a = 0; a<bodyparts.length; a++)
                //    if(bodyparts[i] != bodyparts[a])
                        bodyparts[i] = scan.next();
                //scan.useDelimiter(",");
                i++;
                
                /*while(scan.hasNext())
                {
                    if(bodyparts.length != 0)
                    for(String str : bodyparts)
                        if(str.equalsIgnoreCase(rs.getString("bodypart")))
                            flag = true;
                         
                    if(!flag)
                    {
                        String[] temp = new String[bodyparts.length + 1];
                        temp[bodyparts.length] = scan.next();
                        for(int i = 0; i < bodyparts.length; i++)
                            temp[i] = bodyparts[i];
                        bodyparts = temp;
                    }
                    
                }*/
                
                //String ID = rs.getString("bodypart");
                
                //System.out.println(ID + "\t" + name + "\t" + surname + "\t" + branch + "\t" + hospital + "\t" + certificateno);
            }
        }
        catch(Exception ex)
        {
            System.out.println(ex.getCause());
        }
        return bodyparts;
    }

    public String[] searchBodyPart(String bodypart)
    {
        String[] illnesses = new String[0];
        
        try
        {
            
            String query = "select * from " + tablename;
            rs = st.executeQuery(query);
                     
            while(rs.next())
            {
                
                if (rs.getString("bodypart").equalsIgnoreCase(bodypart))
                {
                        
                    String[] temp = new String[illnesses.length + 1];
                    temp[illnesses.length] = rs.getString("illness");
                    for(int i = 0; i < illnesses.length; i++)
                        temp[i] = illnesses[i];
                    illnesses = temp;
                    
                }

            }                
                
        }
        catch(Exception ex)
        {
            System.out.println(ex + "AAAA");
        }
        return illnesses;
    }
    
    public String searchBranchofIllness(String illness)
    {
        String branch = "immunology";
        
        try
        {
            //System.out.println("Records from database");
            String query = "select * from " + tablename;
            rs = st.executeQuery(query);
            //System.out.println("Records from database");
            //rs2 = st.executeQuery("INSERT INTO `sarp`.`drme` (`illnesses`, `sympthoms`, `branch`) VALUES ('ill', 'symp', 'doctor')");
            while(rs.next())
            {
                if(illness.equalsIgnoreCase(rs.getString("illness")))
                    branch = rs.getString("branch");
            }      
            
        }
        catch(Exception ex)
        {
            System.out.println(ex + "bbbbbb");
            System.out.println(ex.getCause());
            System.out.println(ex.getMessage());
        }
        
        return branch;
    }
    
    public String[] searchBranch(String branch)
    {
        String[] illnesses = new String[0];
        
        try
        {
            
            String query = "select * from " + tablename;
            rs = st.executeQuery(query);
            
            while(rs.next())
            {
                
                if (rs.getString("branch").toLowerCase().contains(branch.toLowerCase()))
                {
                        
                    String[] temp = new String[illnesses.length + 1];
                    temp[illnesses.length] = rs.getString("illness");
                    for(int i = 0; i < illnesses.length; i++)
                        temp[i] = illnesses[i];
                    illnesses = temp;
                    
                }
            
            }
                                
        }
        catch(Exception ex)
        {
            System.out.println(ex + "AAAA");
        }
        return illnesses;
    }
    
    public boolean isFemaleSpecific(String illness)
    {
        boolean result = false;
        
        try
        {
            
            String query = "select * from " + tablename;
            rs = st.executeQuery(query);
            
            while(rs.next())    
                if (rs.getString("illness").equalsIgnoreCase(illness))
                    result = rs.getString("femalespecific").equalsIgnoreCase("yes");
                
        }
        catch(Exception ex)
        {
            System.out.println(ex + "AAAA");
        }
        return result;
        
    }
    
    public boolean isEmergent(String illness)
        {
            boolean result = false;
        
        try
        {
            
            String query = "select * from " + tablename;
            rs = st.executeQuery(query);
            
            while(rs.next())    
                if (rs.getString("illness").equalsIgnoreCase(illness))
                    result = rs.getString("emergent").equalsIgnoreCase("yes");
                
        }
        catch(Exception ex)
        {
            System.out.println(ex + "AAAA");
        }
        return result;
        
        }
    
}
