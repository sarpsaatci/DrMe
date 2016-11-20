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
public interface Searchable {
    
    String[] searchSymptom(String symptom);
    String[] searchIllness(String illness);
    
}
