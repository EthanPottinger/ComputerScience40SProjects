/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package testing.advancedclasses;

/**
 * Ghost.java - 
 * 
 * @author Ethan Pottinger
 * @since 31-Oct-2018
 */
public class Ghost extends Spooky {

    public Ghost(int age, String name, boolean isMale) {
        super(age, name, isMale);
    }

    @Override
    public String toString() {
        return "Ghost " + super.toString();
    }
   
    @Override
    public boolean equals(Object object) {
        return super.equals(object);
    }
    
    @Override
    public Ghost clone() {
        return this;
    }

}
