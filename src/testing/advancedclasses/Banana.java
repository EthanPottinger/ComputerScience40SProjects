package testing.advancedclasses;

/**
 * Banana.java - 
 * 
 * @author Ethan Pottinger
 * @since 2-Nov-2018
 */
public class Banana extends Food {
    
    public Banana() {
        super("Fruit");
    }

    @Override
    public void eat() {
        System.out.println("Like a monkey");
    }

    @Override
    public boolean shouldCook() {
        return true;
    }

    

}
