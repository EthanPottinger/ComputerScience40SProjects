/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package testing.advancedclasses;

/**
 * Poltergeist.java - 
 * 
 * @author Ethan Pottinger
 * @since 31-Oct-2018
 */
public class Poltergeist extends Ghost {

    public Poltergeist(int age, String name, boolean isMale) {
        super(age, name, isMale);
    }
    
    @Override
    public String toString() {
        return "Poltergeist " + super.toString();
    }
   
    @Override
    public boolean equals(Object object) {
        return super.equals(object);
    }
    
    @Override
    public Poltergeist clone() {
        return this;
    }

}
