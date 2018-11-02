package testing.advancedclasses;

/**
 * Husky.java - 
 * 
 * @author Ethan Pottinger
 * @since 31-Oct-2018
 */
public class Husky extends ComputerScienceStudent {

    public Husky(int age, String name, boolean isMale, int StudentNumber) {
        super(age, name, isMale, StudentNumber);
    }

    @Override
    public String toString() {
        return "Husky " + super.toString();
    }
   
    @Override
    public boolean equals(Object object) {
        return super.equals(object);
    }
    
    @Override
    public Husky clone() {
        return this;
    }

}
