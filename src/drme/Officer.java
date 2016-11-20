
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
public class Officer extends User{
    
    String hospital;
    String ssn;
    public Officer(int ID, String n, String sn, String h, String ssn)
    {
        super(ID, n, sn);
        this.hospital = h;
        this.ssn = ssn;
    }
    
    public int getID()
    {
        return super.getID();
    }
    public String getSSN()
    {
        return this.ssn;
    }
    public String getName()
    {
        return super.getName();
    }
    
    public String getSurName()
    {
        return super.getSurName();
    }
    
    public String getHospital()
    {
        return this.hospital;
    }
    
}
