/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package testing.advancedclasses;

/**
 * White.java - 
 * 
 * @author Ethan Pottinger
 * @since 31-Oct-2018
 */
public class White extends House {

    public White() {
        
    }

    @Override
    public String toString() {
        return "White " + super.toString();
    }
   
    @Override
    public boolean equals(Object object) {
        return super.equals(object);
    }
    
    @Override
    public White clone() {
        return this;
    }

}
