/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package testing.advancedclasses;

/**
 * House.java - 
 * 
 * @author Ethan Pottinger
 * @since 31-Oct-2018
 */
public class House {

    public House() {
        
    }

    @Override
    public String toString() {
        return "House " + super.toString();
    }
   
    @Override
    public boolean equals(Object object) {
        return super.equals(object);
    }
    
    @Override
    public House clone() {
        return this;
    }

}
