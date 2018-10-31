/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package testing.advancedclasses;

/**
 * Skeleton.java - 
 * 
 * @author Ethan Pottinger
 * @since 31-Oct-2018
 */
public class Skeleton extends Spooky {

    public Skeleton(int age, String name, boolean isMale) {
        super(age, name, isMale);
    }
    
    @Override
    public String toString() {
        return "Skeleton " + super.toString();
    }
   
    @Override
    public boolean equals(Object object) {
        return super.equals(object);
    }
    
    @Override
    public Skeleton clone() {
        return this;
    }

}
