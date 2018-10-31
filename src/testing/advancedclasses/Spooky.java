/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package testing.advancedclasses;

/**
 * Spooky.java - 
 * 
 * @author Ethan Pottinger
 * @since 31-Oct-2018
 */
public class Spooky extends Person {

    public Spooky(int age, String name, boolean isMale) {
        super(age, name, isMale);
    }

    @Override
    public String toString() {
        return "Spooky " + super.toString();
    }
   
    @Override
    public boolean equals(Object object) {
        return super.equals(object);
    }
    
    @Override
    public Spooky clone() {
        return this;
    }

}
