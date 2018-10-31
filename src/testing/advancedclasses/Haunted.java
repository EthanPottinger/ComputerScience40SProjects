/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package testing.advancedclasses;

/**
 * Haunted.java - 
 * 
 * @author Ethan Pottinger
 * @since 31-Oct-2018
 */
public class Haunted extends House {

    public Haunted() {
        
    }

    @Override
    public String toString() {
        return "Haunted " + super.toString();
    }
   
    @Override
    public boolean equals(Object object) {
        return super.equals(object);
    }
    
    @Override
    public Haunted clone() {
        return this;
    }

}
