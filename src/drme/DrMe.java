/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drme;
import javax.swing.*;
/**
 *
 * @author sarp.saatci
 */
public class DrMe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*
        DBConnect connect = new DBConnect("drme", "patients");
        //User patient = new Patient(1234, "ali", "korkmaz", 50, "10458386548", "A Rh-", "", "a", null, null, null);
        IllnessSearchDBConnect illnessdb = new IllnessSearchDBConnect("drme", "illnesses");
        
        //connect.addPatient((Patient) patient);
        //connect.getPatients();
        
        //connect = new DBConnect("drme", "doctors");
        //User doctor = new Doctor(2586, "ahmet", "yılmaz", "psychiatry", "atatürk", 45687);
        //connect.addDoctor((Doctor)doctor);
        //connect.getDoctors();
        
        String illness = "AIDS";
        
        String[] symptoms = illnessdb.searchIllness(illness);
        
        System.out.println("\nSymptoms of " + illness + "\":");
 
        for(String symptom : symptoms)
            System.out.println(symptom);
        
        String symptom = "fever";
        
        String[] illnesses = illnessdb.searchSymptom(symptom);
        
        System.out.println("\nIllnesses that contains the symptom \"" + symptom + "\":");
        
        for(String ill : illnesses)
            System.out.println(ill);
        
        String bodypart = "head";
        
        illnesses = illnessdb.searchBodyPart(bodypart);
        
        System.out.println("\nIllnesses that has the body part \"" + bodypart + "\":");
        
        for(String ill : illnesses)
            System.out.println(ill);
        
        System.out.println("\nIs breast cancer female specific:");
        System.out.println(illnessdb.isFemaleSpecific("breast cancer"));
        
        System.out.println("\nIs brain tumor emergent:");
        System.out.println(illnessdb.isEmergent("brain tumor"));
        
        String branch = "psychiatry";
        
        illnesses = illnessdb.searchBranch(branch);
        
        System.out.println("\nIllnesses that is the branch \"" + branch + "\":");
        
        for(String ill : illnesses)
            System.out.println(ill);
        
        int[] IDs = connect.getPatientsID();
        for(int ID : IDs)
            System.out.println(ID);
    
        */
                
                
        JFrame frame = new JFrame("Dr.Me");
        frame.getContentPane().add(new MainMenu());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        
    }
    
}
