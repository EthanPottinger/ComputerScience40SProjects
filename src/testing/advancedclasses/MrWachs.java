/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package testing.advancedclasses;

/**
 * MrWachs.java - 
 * 
 * @author Ethan Pottinger
 * @since 31-Oct-2018
 */
public class MrWachs extends ComputerScienceTeacher {

    public MrWachs(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "MrWachs " + super.toString();
    }
   
    @Override
    public boolean equals(Object object) {
        return super.equals(object);
    }
    
    @Override
    public MrWachs clone() {
        return this;
    }

}
