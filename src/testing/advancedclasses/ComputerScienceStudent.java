/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package testing.advancedclasses;

/**
 * ComputerScienceStudent.java - 
 * 
 * @author Ethan Pottinger
 * @since 31-Oct-2018
 */
public class ComputerScienceStudent extends HighSchoolStudent {

    public ComputerScienceStudent(int age, String name, boolean isMale, int StudentNumber) {
        super(age, name, isMale, StudentNumber);
    }
    
    @Override
    public String toString() {
        return "ComputerScienceStudent " + super.toString();
    }
   
    @Override
    public boolean equals(Object object) {
        return super.equals(object);
    }
    
    @Override
    public ComputerScienceStudent clone() {
        return this;
    }

}
