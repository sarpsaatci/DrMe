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
public class Doctor extends User{
    
    String branch, hospital, bio;
    int certificateNo;
    
    public Doctor(int ID, String n, String sn, String b, String h, int c, String bio)
    {
        super(ID, n, sn);
        this.branch = b;
        this.hospital = h;
        this.certificateNo = c;
        this.bio = bio;
    }
    
    public int getID()
    {
        return super.getID();
    }
    
    public String getName()
    {
        return super.getName();
    }
    public String getBiography()
    {
        return this.bio;
    }
    
    public String getSurName()
    {
        return super.getSurName();
    }
    
    public String getBranch()
    {
        return this.branch;
    }
    
    public String getHospital()
    {
        return this.hospital;
    }
    
    public int getCertificateNo()
    {
        return this.certificateNo;
    }
    
}
