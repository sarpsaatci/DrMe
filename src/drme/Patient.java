/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drme;

/**
 *
 * @author sarp.saatci
 */
public class Patient extends User{

    String name, surname, chronicIllnesses, TC, contact, adress, eContact, bloodType, gender;
    int age;
    public Patient(int ID, String n, String sn, int age, String TC, String bt, String gender, String ch, String contact, String eContact, String adress)
    {
        super(ID, n, sn);
        
        this.age = age;
        this.TC = TC;
        this.bloodType = bt;
        this.chronicIllnesses = ch;
        this.gender= gender;
        this.contact= contact;
        this.eContact = eContact;
        this.adress = adress;
    }
    
    public int getID()
    {
        return super.getID();
    }
    
    public String getName()
    {
        return super.getName();
    }
    
    public String getSurName()
    {
        return super.getSurName();
    }
    
    public int getAge()
    {
        return this.age;
    }
    
    public String getTC()
    {
        return this.TC;
    }
    
    public String getBloodType()
    {
        return this.bloodType;
    }
    
    public String getChronicIllnesses()
    {
        return this.chronicIllnesses;
    }
    public String getGender()
    {
        return this.gender;
    }
    public String getContact()
    {
        return this.contact;
    }
    public String getEContact()
    {
        return this.eContact;
    }
    public String getAdress()
    {
        return this.adress;
    }
    public String[] searchIllness(String illness)
    {
        IllnessSearchDBConnect searchdb = new IllnessSearchDBConnect("illnesses");
        return searchdb.searchIllness(illness);
    }
    
    public String[] searchSymptom(String symptom)
    {
        IllnessSearchDBConnect searchdb = new IllnessSearchDBConnect("illnesses");
        return searchdb.searchSymptom(symptom);
    }
    
}
