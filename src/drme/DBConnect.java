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

public class DBConnect {
    
    private Connection con;
    private Statement st;
    private PreparedStatement pst;
    private ResultSet rs, rs2;
    
    String tablename;
    
    public DBConnect(String t)
    {
        try{
            
            this.tablename = t;
            
            Class.forName("com.mysql.jdbc.Driver");
            
            con = DriverManager.getConnection("jdbc:mysql://mysql.linux.trdns.com/NDB255653", "NDB255653", "yH171a3S");
            st = con.createStatement();
            pst = con.prepareStatement("insert into " + tablename + " values(?, ?, ?, ?, ?, ?, ?)");
            
        }
        catch(Exception ex){
            System.out.println("Error: " + ex);
            System.out.println(ex.getCause());
        }
    }
    
    public ArrayList<String> getPatientInfo(String name)
    {
        ArrayList<String> info = new ArrayList<String>();
        
        try
        {
            //System.out.println("Records from database");
            String query = "select * from " + tablename;
            rs = st.executeQuery(query);
            //System.out.println("Records from database");
            //rs2 = st.executeQuery("INSERT INTO `sarp`.`drme` (`illnesses`, `sympthoms`, `branch`) VALUES ('ill', 'symp', 'doctor')");
            
            while(rs.next())
            {
                if(name.equalsIgnoreCase(rs.getString("name")))
                {
                    info.add("ID: " + rs.getString("ID"));
                    info.add("Name: " + rs.getString("name"));
                    info.add("Surname: " + rs.getString("surname"));
                    info.add("Age: " + rs.getString("age"));
                    info.add("SSN: " + rs.getString("TC"));
                    info.add("Blood Type: " + rs.getString("blood type"));
                    info.add("Gender: " + rs.getString("gender"));
                    info.add("Chronic Illnesses: " + rs.getString("chronic illnesses"));
                    info.add("Contact Number: " + rs.getString("contact"));
                    info.add("Emergency Contact: " + rs.getString("emergency contact"));
                    info.add("Address: " + rs.getString("address"));
                }
                
               // System.out.println(ID + "\t" + name + "\t" + surname + "\t" + branch + "\t" + hospital + "\t" + certificateno);
            }
        }
        catch(Exception ex)
        {
            System.out.println(ex + "sssss");
        }
        
        return info;
    }
    
    public ArrayList<String> getDoctorInfo(String name)
    {
        ArrayList<String> info = new ArrayList<String>();
        
        try
        {
            //System.out.println("Records from database");
            String query = "select * from " + tablename;
            rs = st.executeQuery(query);
            //System.out.println("Records from database");
            //rs2 = st.executeQuery("INSERT INTO `sarp`.`drme` (`illnesses`, `sympthoms`, `branch`) VALUES ('ill', 'symp', 'doctor')");
            
            while(rs.next())
            {
                if(name.equalsIgnoreCase(rs.getString("name")))
                {
                    info.add("ID: " + rs.getString("ID"));
                    info.add("Name: " + rs.getString("name"));
                    info.add("Surname: " + rs.getString("surname"));
                    info.add("Branch: " + rs.getString("branch"));
                    info.add("Hospital: " + rs.getString("hospital"));
                    info.add("Certificate No: " + rs.getString("certificate no"));
                    info.add("Biography: " + rs.getString("biography"));
                }
                
               // System.out.println(ID + "\t" + name + "\t" + surname + "\t" + branch + "\t" + hospital + "\t" + certificateno);
            }
        }
        catch(Exception ex)
        {
            System.out.println(ex + "sssss");
        }
        
        return info;
    }
    
    public void getPatients()
    {
        try
        {
            //System.out.println("Records from database");
            String query = "select * from " + tablename;
            rs = st.executeQuery(query);
            //System.out.println("Records from database");
            //rs2 = st.executeQuery("INSERT INTO `sarp`.`drme` (`illnesses`, `sympthoms`, `branch`) VALUES ('ill', 'symp', 'doctor')");
            
            while(rs.next())
            {
                String ID = rs.getString("ID");
                String name = rs.getString("name");
                String surname = rs.getString("surname");
                String age = rs.getString("age");
                String TC = rs.getString("TC");
                String bloodType = rs.getString("blood type");
                String chronicIllnesses = rs.getString("chronic illnesses");
                
                //System.out.println(ID + "\t" + name + "\t" + surname + "\t" + age + "\t" + TC + "\t" + bloodType + "\t" + chronicIllnesses);
            }
        }
        catch(Exception ex)
        {
            System.out.println(ex + "sssss");
        }
    }
    
    public void getOfficers()
    {
        try
        {
            //System.out.println("Records from database");
            String query = "select * from " + tablename;
            rs = st.executeQuery(query);
            //System.out.println("Records from database");
            //rs2 = st.executeQuery("INSERT INTO `sarp`.`drme` (`illnesses`, `sympthoms`, `branch`) VALUES ('ill', 'symp', 'doctor')");
            
            while(rs.next())
            {
                String ID = rs.getString("ID");
                String name = rs.getString("name");
                String surname = rs.getString("surname");
                String hospital = rs.getString("age");
                String SSN = rs.getString("SSN");
                
                //System.out.println(ID + "\t" + name + "\t" + surname + "\t" + hospital + "\t" + SSN);
            }
        }
        catch(Exception ex)
        {
            System.out.println(ex + "sssss");
        }
    }
    
    public int[] getIDs()
    {
        int[] IDs = new int[0];
        
        try
        {
            //System.out.println("Records from database");
            String query = "select * from " + tablename;
            rs = st.executeQuery(query);
            //System.out.println("Records from database");
            //rs2 = st.executeQuery("INSERT INTO `sarp`.`drme` (`illnesses`, `sympthoms`, `branch`) VALUES ('ill', 'symp', 'doctor')");
            
            while(rs.next())
            {
                int ID = Integer.parseInt(rs.getString("ID"));
                int[] temp = new int[IDs.length+1];
                for(int i = 0; i < IDs.length; i++)
                    temp[i] = IDs[i];
                temp[IDs.length] = ID;
                IDs = temp;
            }
        }
        catch(Exception ex)
        {
            System.out.println(ex + "sssss");
        }
        return IDs;
    }
    
    public void addPatient(Patient p)
    {
        
        try{
            
            pst = con.prepareStatement("insert into " + tablename + " values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
            //pst.executeUpdate();
            pst.setString(1, "" + p.getID());
            pst.setString(2, "" + p.getName());
            pst.setString(3, "" + p.getSurName());
            pst.setString(4, "" + p.getAge());
            pst.setString(5, "" + p.getTC());
            pst.setString(6, "" + p.getBloodType());
            pst.setString(7, "" + p.getGender());
            pst.setString(8, "" + p.getChronicIllnesses());
            pst.setString(9, "" + p.getContact());
            pst.setString(10, "" + p.getEContact());
            pst.setString(11, p.getAdress());
            pst.executeUpdate();
        }
        catch(Exception ex){
            System.out.println("Error: " + ex);
        }
        
    }
    
    public void getDoctors()
    {
        try
        {
            //System.out.println("Records from database");
            String query = "select * from " + tablename;
            rs = st.executeQuery(query);
            //System.out.println("Records from database");
            //rs2 = st.executeQuery("INSERT INTO `sarp`.`drme` (`illnesses`, `sympthoms`, `branch`) VALUES ('ill', 'symp', 'doctor')");
            
            while(rs.next())
            {
                String ID = rs.getString("ID");
                String name = rs.getString("name");
                String surname = rs.getString("surname");
                String branch = rs.getString("branch");
                String hospital = rs.getString("hospital");
                String certificateno = rs.getString("certificate no");
                
                //System.out.println(ID + "\t" + name + "\t" + surname + "\t" + branch + "\t" + hospital + "\t" + certificateno);
            }
        }
        catch(Exception ex)
        {
            System.out.println(ex + "sssss");
        }
    }
    
    public void addOfficer(Officer o)
    {
        
        try{
            
            pst = con.prepareStatement("insert into " + tablename + " values(?, ?, ?, ?, ?)");
            //pst.executeUpdate();
            pst.setString(1, "" + o.getID());
            pst.setString(2, "" + o.getName());
            pst.setString(3, "" + o.getSurName());
            pst.setString(4, "" + o.getHospital());
            pst.setString(5, "" + o.getSSN());
            pst.executeUpdate();
        }
        catch(Exception ex){
            System.out.println("Error: " + ex);
        }
        
    }
    
    public int getAge(int ID)
    {
        int age = 0;
        
        try
        {
            //System.out.println("Records from database");
            String query = "select * from " + tablename;
            rs = st.executeQuery(query);
            //System.out.println("Records from database");
            //rs2 = st.executeQuery("INSERT INTO `sarp`.`drme` (`illnesses`, `sympthoms`, `branch`) VALUES ('ill', 'symp', 'doctor')");
            
            while(rs.next())
            {
                if(ID ==Integer.parseInt(rs.getString("ID")))
                    age = Integer.parseInt(rs.getString("age"));
                
                
               // System.out.println(ID + "\t" + name + "\t" + surname + "\t" + branch + "\t" + hospital + "\t" + certificateno);
            }
        }
        catch(Exception ex)
        {
            System.out.println(ex + "sssss");
        }
        
        return age;
    }
    
    public String getName(int ID)
    {
        String name = "";
        
        try
        {
            //System.out.println("Records from database");
            String query = "select * from " + tablename;
            rs = st.executeQuery(query);
            //System.out.println("Records from database");
            //rs2 = st.executeQuery("INSERT INTO `sarp`.`drme` (`illnesses`, `sympthoms`, `branch`) VALUES ('ill', 'symp', 'doctor')");
            
            while(rs.next())
            {
                if(ID ==Integer.parseInt(rs.getString("ID")))
                    name = rs.getString("name");
                
                
               // System.out.println(ID + "\t" + name + "\t" + surname + "\t" + branch + "\t" + hospital + "\t" + certificateno);
            }
        }
        catch(Exception ex)
        {
            System.out.println(ex + "sssss");
        }
        
        return name;
    }
    
    public void addDoctor(Doctor d)
    {
        
        try{
            
            pst = con.prepareStatement("insert into " + tablename + " values(?, ?, ?, ?, ?, ?,?)");
            //pst.executeUpdate();
            pst.setString(1, "" + d.getID());
            pst.setString(2, "" + d.getName());
            pst.setString(3, "" + d.getSurName());
            pst.setString(4, "" + d.getBranch());
            pst.setString(5, "" + d.getHospital());
            pst.setString(6, "" + d.getCertificateNo());
            pst.setString(7, "" + d.getBiography());
            pst.executeUpdate();
        }
        catch(Exception ex){
            System.out.println("Error: " + ex);
        }
        
    }
    
    public int getID(String name)
    {
        int ID = 0;
        
        try
        {
            //System.out.println("Records from database");
            String query = "select * from " + tablename;
            rs = st.executeQuery(query);
            //System.out.println("Records from database");
            //rs2 = st.executeQuery("INSERT INTO `sarp`.`drme` (`illnesses`, `sympthoms`, `branch`) VALUES ('ill', 'symp', 'doctor')");
            
            while(rs.next())
            {
                if(name ==rs.getString("name"))
                    ID = Integer.parseInt(rs.getString("ID"));
                
                
               // System.out.println(ID + "\t" + name + "\t" + surname + "\t" + branch + "\t" + hospital + "\t" + certificateno);
            }
        }
        catch(Exception ex)
        {
            System.out.println(ex + "sssss");
        }
        
        return ID;
    }
    
    public ArrayList<String> seeAppointments(String name)
    {
        ArrayList<String> appointments = new ArrayList<String>();
        try
        {
            //System.out.println("Records from database");
            String query = "select * from " + tablename;
            rs = st.executeQuery(query);
            //System.out.println("Records from database");
            //rs2 = st.executeQuery("INSERT INTO `sarp`.`drme` (`illnesses`, `sympthoms`, `branch`) VALUES ('ill', 'symp', 'doctor')");
            
            while(rs.next())
            {
                
                if(name.equalsIgnoreCase(rs.getString("doctor name")))
                {    
                    appointments.add(rs.getString("patient name"));                    
                }
                
               // System.out.println(ID + "\t" + name + "\t" + surname + "\t" + branch + "\t" + hospital + "\t" + certificateno);
            }
        }
        catch(Exception ex)
        {
            System.out.println(ex + "sssss");
        }
        
        return appointments;

    }
    
    public void makeAppointment(String pname, String dname)
    {
        
        try{
            
            pst = con.prepareStatement("insert into " + tablename + " values(?, ?)");
            pst.setString(1, "" + dname);
            pst.setString(2, "" + pname);
            pst.executeUpdate();
            con.close();
           
        }
        catch(Exception ex){
            System.out.println("Error: " + ex);
        }
        finally {
            
        }
        
                
    }
    
    public ArrayList<String> getDoctorsbyBranch(String branch)
    {
        ArrayList<String>doctors = new ArrayList<String>();
        
        try
        {
            //System.out.println("Records from database");
            String query = "select * from " + tablename;
            rs = st.executeQuery(query);
            //System.out.println("Records from database");
            //rs2 = st.executeQuery("INSERT INTO `sarp`.`drme` (`illnesses`, `sympthoms`, `branch`) VALUES ('ill', 'symp', 'doctor')");
            
            //String[] temp = new String[0];
            
            while(rs.next())
            { String str;
                if(rs.getString("branch").toLowerCase().contains(branch.toLowerCase()))
                {//temp = new String[doctors.length+1];
                    //for(int i = 0; i < doctors.length; i++)
                     //   temp[i] = doctors[i];
                    //temp[doctors.length] = rs.getString("name");
                   // doctors = temp;
                    str= rs.getString("name");
                    //doctors.add(rs.getString("branch"));
                    
                     doctors.add(str);}
               // System.out.println(ID + "\t" + name + "\t" + surname + "\t" + branch + "\t" + hospital + "\t" + certificateno);
            }
        }
        catch(Exception ex)
        {
            System.out.println(ex + "ddd");
            System.out.println(ex.getCause());
        }
        
        return doctors;
         
    }
            
}
