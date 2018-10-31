/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package testing.advancedclasses;

/**
 * HighSchoolStudent.java - 
 * 
 * @author Ethan Pottinger
 * @since 31-Oct-2018
 */
public class HighSchoolStudent extends Student {

    public HighSchoolStudent(int age, String name, boolean isMale, int StudentNumber) {
        super(age, name, isMale, StudentNumber);
    }

    @Override
    public String toString() {
        return "HighSchoolStudent " + super.toString();
    }
   
    @Override
    public boolean equals(Object object) {
        return super.equals(object);
    }
    
    @Override
    public HighSchoolStudent clone() {
        return this;
    }

}
