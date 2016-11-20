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
public abstract class User {
    
    int ID;
    String name, surname;
    
    public User(int ID, String n, String sn)
    {
        this.ID = ID;
        this.name = n;
        this.surname = sn;
    }
    
    public int getID()
    {
        return this.ID;
    }
    
    public String getName()
    {
        return this.name;
    }
    
    public String getSurName()
    {
        return this.surname;
    }
   
}
